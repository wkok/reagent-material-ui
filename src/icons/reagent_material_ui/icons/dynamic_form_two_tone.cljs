(ns reagent-material-ui.icons.dynamic-form-two-tone
  "Imports @material-ui/icons/DynamicFormTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def dynamic-form-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 9h7V6H4v3zm0 9h9v-3H4v3z", "opacity" ".3"}) (e "path" #js {"d" "M13 11H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2h9v7zM4 9h7V6H4v3zm11 11H4c-1.1 0-2-.9-2-2v-3c0-1.1.9-2 2-2h11v7zM4 18h9v-3H4v3zm18-9h-2l2-5h-7v7h2v9l5-11zM4.75 17.25h1.5v-1.5h-1.5v1.5zm0-9h1.5v-1.5h-1.5v1.5z"}))
                                            "DynamicFormTwoTone"))
