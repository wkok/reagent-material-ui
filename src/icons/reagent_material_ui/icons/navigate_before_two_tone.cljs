(ns reagent-material-ui.icons.navigate-before-two-tone
  "Imports @material-ui/icons/NavigateBeforeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def navigate-before-two-tone (create-svg-icon (e "path" #js {"d" "M14.2 6l-6 6 6 6 1.41-1.41L11.03 12l4.58-4.59z"})
                                               "NavigateBeforeTwoTone"))
