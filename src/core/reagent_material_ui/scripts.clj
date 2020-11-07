(ns reagent-material-ui.scripts
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.pprint :refer [pprint]]
            [camel-snake-kebab.core :as csk]
            [clojure.java.io :as io]
            [instaparse.core :as insta])
  (:import (java.io File)))

;; (write-icons "/Users/arttuka/workspace/arttuka/material-ui/packages/material-ui-icons/src")

(def exclude-clj #{"comment" "compare" "filter" "list" "loop" "map" "print" "remove" "repeat" "shuffle" "sort" "update"})
(def exclude-core #{"TextField" "TextareaAutosize" "createFilterOptions"})
(def js-keyword-icons #{"class" "delete" "public"})
(def js-keyword-components #{"switch"})

(defn component-ns-name [js-ns js-name]
  (let [clj-name (csk/->kebab-case (or js-name js-ns))]
    (if (contains? js-keyword-components clj-name)
      (str clj-name "-component")
      clj-name)))

(defn icon-ns-name [js-name]
  (let [clj-name (csk/->kebab-case js-name)]
    (if (contains? js-keyword-icons clj-name)
      (str clj-name "-icon")
      clj-name)))

(defn mui-name [js-ns js-name]
  (if js-name
    (str "(.-" js-name " Mui" js-ns ")")
    (str "(or (.-default Mui" js-ns ") (.-" js-ns " Mui" js-ns "))")))

(defn generate-picker-ns-content [js-name]
  (let [clj-name (csk/->kebab-case js-name)]
    (str "(ns reagent-material-ui.pickers." (component-ns-name js-name nil) \newline
         "  \"Imports @material-ui/pickers/" js-name " as a Reagent component." \newline
         "   Original documentation is at https://material-ui-pickers.dev/api/" js-name "/ .\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require [reagent-material-ui.util :refer [adapt-react-class]]" \newline
         "            [\"@material-ui/pickers\" :as pickers]))" \newline \newline
         "(def " clj-name " (adapt-react-class (.-" js-name " pickers) \"mui-" clj-name "\"))" \newline)))

(defn write-picker-ns [js-name]
  (let [content (generate-picker-ns-content js-name)
        path (str "./src/core/reagent_material_ui/pickers/" (csk/->snake_case (component-ns-name js-name nil)) ".cljs")]
    (spit path content)))

(defn generate-component-ns-content [mui-ns js-ns js-name]
  (let [clj-name (csk/->kebab-case (or js-name js-ns))]
    (str "(ns reagent-material-ui." mui-ns "." (component-ns-name js-ns js-name) \newline
         "  \"Imports @material-ui/" mui-ns "/" js-ns (when js-name (str "/" js-name)) " as a Reagent component." \newline
         "   Original documentation is at https://material-ui.com/api/" clj-name "/ .\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require [reagent-material-ui.util :refer [adapt-react-class]]" \newline
         "            [\"@material-ui/" mui-ns "/" js-ns "\" :as Mui" js-ns "]))" \newline \newline
         "(def " clj-name " (adapt-react-class " (mui-name js-ns js-name) " \"mui-" clj-name "\"))" \newline)))

(defn generate-hook-ns-content [mui-ns js-ns js-name]
  (let [clj-name (csk/->kebab-case (or js-name js-ns))]
    (str "(ns reagent-material-ui." mui-ns "." (component-ns-name js-ns js-name) \newline
         "  \"Imports @material-ui/" mui-ns "/" js-ns (when js-name (str "/" js-name)) " as a React hook." \newline
         "   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks" \newline
         "   Original documentation is at https://material-ui.com/api/" clj-name "/ .\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require [reagent-material-ui.util :refer [wrap-js-function]]" \newline
         "            [\"@material-ui/" mui-ns "/" js-ns "\" :as Mui" js-ns "]))" \newline \newline
         "(def " clj-name " (wrap-js-function " (mui-name js-ns js-name) "))" \newline)))

(defn write-component-ns [mui-ns js-ns js-name]
  (let [hook? (str/starts-with? (or js-name js-ns) "use")
        content ((if hook? generate-hook-ns-content generate-component-ns-content)
                 mui-ns js-ns js-name)
        path (str "./src/core/reagent_material_ui/" mui-ns "/" (csk/->snake_case (component-ns-name js-ns js-name)) ".cljs")]
    (spit path content)))

(defn generate-common-core-ns-content [js-names]
  (let [clj-names (for [[js-ns js-name] js-names]
                    (csk/->kebab-case (or js-name js-ns)))]
    (str "(ns reagent-material-ui.components" \newline
         "  \"Imports all components from @material-ui/core as Reagent components." \newline
         "   Original documentation is at https://material-ui.com/api/ .\"" \newline
         "  (:refer-clojure :exclude [" (str/join " " (keep exclude-clj clj-names)) "])" \newline
         "  (:require "
         (str/join "\n            " (for [clj-name clj-names]
                                      (str "reagent-material-ui.core." (component-ns-name clj-name nil))))
         "))" \newline \newline
         (str/join \newline (for [clj-name clj-names]
                              (str "(def " clj-name " reagent-material-ui.core." (component-ns-name clj-name nil) "/" clj-name ")")))
         \newline)))

(defn get-component-names
  ([]
   (get-component-names "components.edn"))
  ([file]
   (for [elem (edn/read-string (slurp (io/resource file)))]
     (if (vector? elem) elem [elem nil]))))

(defn get-picker-names []
  (edn/read-string (slurp (io/resource "pickers.edn"))))

(defn write-deps-file []
  (let [core-names (distinct (map first (get-component-names)))
        lab-names (distinct (map first (get-component-names "lab.edn")))
        deps {:npm-deps     {"@material-ui/core"    "5.0.0-alpha.15"
                             "@material-ui/pickers" "4.0.0-alpha.12"
                             "@material-ui/lab"     "5.0.0-alpha.15"
                             "@emotion/core"        "^10.1.1"
                             "@emotion/styled"      "^10.0.27"}
              :foreign-libs [{:file           "material-ui/material-ui.inc.js"
                              :file-min       "material-ui/material-ui.min.inc.js"
                              :provides       (into ["@material-ui/core"
                                                     "@material-ui/core/styles"
                                                     "@material-ui/core/utils"]
                                                    (for [js-name core-names]
                                                      (str "@material-ui/core/" js-name)))
                              :global-exports (into (sorted-map "@material-ui/core" 'MaterialUI
                                                                "@material-ui/core/styles" 'MaterialUI
                                                                "@material-ui/core/utils" 'MaterialUI)
                                                    (for [js-name core-names]
                                                      [(str "@material-ui/core/" js-name) 'MaterialUI]))
                              :requires       ["react" "react-dom" "@material-ui/styles" "@material-ui/utils"]}
                             {:file           "material-ui/material-ui-lab.inc.js"
                              :file-min       "material-ui/material-ui-lab.min.inc.js"
                              :provides       (into ["@material-ui/lab"]
                                                    (for [js-name lab-names]
                                                      (str "@material-ui/lab/" js-name)))
                              :global-exports (into (sorted-map "@material-ui/lab" 'MaterialUILab)
                                                    (for [js-name lab-names]
                                                      [(str "@material-ui/lab/" js-name) 'MaterialUILab]))
                              :requires       ["react" "react-dom" "@material-ui/core" "@material-ui/utils"]}
                             {:file           "material-ui/material-ui-pickers.inc.js"
                              :file-min       "material-ui/material-ui-pickers.min.inc.js"
                              :provides       ["@material-ui/pickers"]
                              :global-exports {"@material-ui/pickers" 'MaterialUIPickers}
                              :requires       ["react" "react-dom" "@material-ui/core" "@material-ui/styles"]}
                             {:file           "material-ui/material-ui-styles.inc.js"
                              :file-min       "material-ui/material-ui-styles.min.inc.js"
                              :provides       ["@material-ui/styles"]
                              :global-exports {"@material-ui/styles" 'MaterialUIStyles}
                              :requires       ["react" "react-dom" "@material-ui/utils"]}
                             {:file           "material-ui/material-ui-utils.inc.js"
                              :file-min       "material-ui/material-ui-utils.min.inc.js"
                              :provides       ["@material-ui/utils"]
                              :global-exports {"@material-ui/utils" 'MaterialUIUtils}
                              :requires       ["react" "react-dom"]}]
              :externs      ["material-ui/material-ui.ext.js"]}]
    (spit "./deps.cljs" (with-out-str (pprint deps)))))

(defn write-core []
  (let [js-names (get-component-names)]
    (doseq [[js-ns js-name] js-names
            :when (not (contains? exclude-core (or js-name js-ns)))]
      (write-component-ns "core" js-ns js-name))
    (doseq [[js-ns js-name] (get-component-names "lab.edn")
            :when (not (contains? exclude-core (or js-name js-ns)))]
      (write-component-ns "lab" js-ns js-name))
    (doseq [js-name (get-picker-names)
            :when (not (contains? exclude-core js-name))]
      (write-picker-ns js-name))
    (spit "./src/core/reagent_material_ui/components.cljs" (generate-common-core-ns-content js-names))))

(def ebnf "
S = element <','>?
<element> = empty-element | nonempty-element
nonempty-element = <'<'> tag proplist <'>'> element* <'</'> <tag> <'>'>
empty-element = <'<'> tag proplist <'/>'>
proplist = propvalue*
<propvalue> = prop <'=\"'> value <'\"'>
<value> = #'[^\"]*'
<prop> = 'clipRule'|'cx'|'cy'|'d'|'fill'|'fillOpacity'|'fillRule'|'id'|'opacity'|'r'|'transform'
<tag> = 'React.Fragment'|'circle'|'defs'|'g'|'path'
")

(def parser (insta/parser ebnf :auto-whitespace (insta/parser "whitespace = #'\\s+'")))

(defn element->react [element]
  (let [[type tag proplist & children] element
        react-tag (if (= "React.Fragment" tag)
                    'react/Fragment
                    tag)
        props (some->> (next proplist)
                       (apply hash-map))
        parsed-children (for [child children]
                          (if (vector? child)
                            (element->react child)
                            (throw (ex-info "Illegal child" {:element element
                                                             :child   child}))))]
    `(~'e ~react-tag ~@(when props [(symbol "#js")]) ~props ~@parsed-children)))

(defn read-icon [path]
  (with-open [rdr (io/reader path)]
    (let [jsx (nth (line-seq rdr) 4)
          parsed (parser jsx)]
      (if (insta/failure? parsed)
        (throw (ex-info "Failed to parse" {:path   path
                                           :jsx    jsx
                                           :result parsed}))
        (element->react (second parsed))))))

(defn generate-icon-ns-content [js-name content]
  (let [clj-name (csk/->kebab-case js-name)]
    (str "(ns reagent-material-ui.icons." (icon-ns-name js-name) \newline
         "  \"Imports @material-ui/icons/" js-name " as a Reagent component.\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require-macros [reagent-material-ui.util :refer [e]])" \newline
         "  (:require [react :as react]" \newline
         "            [reagent-material-ui.util :refer [create-svg-icon]]))" \newline \newline
         "(def " clj-name " (create-svg-icon " (pr-str content) \newline
         (str/join (repeat (+ 23 (count clj-name)) \space))
         \" js-name "\"))" \newline)))

(defn write-icon-ns [js-name icon-path]
  (let [icon-content (read-icon icon-path)
        clj-path (str "./src/icons/reagent_material_ui/icons/" (csk/->snake_case (icon-ns-name js-name)) ".cljs")
        ns-content (generate-icon-ns-content js-name icon-content)]
    (spit clj-path ns-content)))

(defn write-icons [^String mui-path]
  (let [f (File. mui-path)
        filenames (seq (.list f))
        js-names (sort (for [filename filenames
                             :let [[_ js-name :as matches?] (re-matches #"([A-Z].*)\.js" filename)]
                             :when matches?]
                         js-name))]
    (doseq [js-name js-names]
      (write-icon-ns js-name (str mui-path "/" js-name ".js")))))

(defn color->string [[js-name values]]
  (let [clj-name (csk/->kebab-case js-name)
        indent (str/join (repeat (+ 7 (count clj-name)) \space))]
    (str "(def " clj-name " {"
         (str/join (str \newline indent)
                   (for [[key value] values
                         :let [num-key? (contains? #{\0 \1 \2 \3 \4 \5 \6 \7 \8 \9} (first key))]]
                     (str (when-not num-key?
                            \:)
                          key
                          (when num-key? (str/join (repeat (- 5 (count key)) \space)))
                          \space \" value \")))
         "})" \newline)))

(defn generate-color-ns-content [colors]
  (str "(ns reagent-material-ui.colors" \newline
       "  \"Imports all colors from @material-ui/core/colors." \newline
       "   Original documentation is at https://material-ui.com/customization/color/ .\")" \newline \newline
       (str/join \newline (map color->string colors))))

(defn read-color-js-file [^File f]
  (with-open [rdr (io/reader f)]
    (doall
      (for [line (line-seq rdr)
            :let [[_ key color :as matches?] (re-matches #" *([0-9A]*|black|white): '([#0-9a-f]*)'," line)]
            :when matches?]
        [key color]))))

(defn write-colors [^String mui-path]
  (let [index (File. mui-path "index.js")
        js-names (with-open [rdr (io/reader index)]
                   (doall
                     (for [line (line-seq rdr)]
                       (let [[_ color] (re-matches #".*\{ default as (.*) \}.*" line)]
                         color))))
        colors (for [js-name js-names]
                 [js-name (read-color-js-file (File. mui-path (str js-name ".js")))])]
    (spit "./src/core/reagent_material_ui/colors.cljs" (generate-color-ns-content colors))))

(defn generate-ext-rows [names spaces]
  (str/join ",\n" (for [name names
                        :let [name (if (vector? name)
                                     (or (second name) (first name))
                                     name)]]
                    (str (apply str (repeat spaces " ")) name ": function () {}"))))

(defn generate-ext-file-content []
  (let [core-names (get-component-names)
        lab-names (get-component-names "lab.edn")
        picker-names (get-picker-names)
        externs (edn/read-string (slurp (io/resource "externs.edn")))]
    (str "var MaterialUI = {\n"
         (generate-ext-rows core-names 2)
         ",\n  styles: {\n"
         (generate-ext-rows (get-in externs ["MaterialUI" "styles"]) 4)
         "\n  },\n  utils: {\n"
         (generate-ext-rows (get-in externs ["MaterialUI" "utils"]) 4)
         "\n  }\n};\n\n"
         "var MaterialUILab = {\n"
         (generate-ext-rows lab-names 2)
         "\n};\n\n"
         "var MaterialUIPickers = {\n"
         (generate-ext-rows picker-names 2)
         "\n};\n\n"
         "var MaterialUIStyles = {\n"
         (generate-ext-rows (get externs "MaterialUIStyles") 2)
         "\n};\n\n"
         "var MaterialUIUtils = {\n"
         (generate-ext-rows (get externs "MaterialUIUtils") 2)
         "\n};\n")))

(defn write-ext-file []
  (spit "./src/core/material-ui/material-ui.ext.js" (generate-ext-file-content)))
