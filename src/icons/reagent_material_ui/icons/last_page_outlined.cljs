(ns reagent-material-ui.icons.last-page-outlined
  "Imports @material-ui/icons/LastPageOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def last-page-outlined (create-svg-icon (e "path" #js {"d" "M5.59 7.41L10.18 12l-4.59 4.59L7 18l6-6-6-6-1.41 1.41zM16 6h2v12h-2V6z"})
                                         "LastPageOutlined"))
