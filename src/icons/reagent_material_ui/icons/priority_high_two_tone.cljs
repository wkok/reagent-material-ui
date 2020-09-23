(ns reagent-material-ui.icons.priority-high-two-tone
  "Imports @material-ui/icons/PriorityHighTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def priority-high-two-tone (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "19", "r" "2", "cx" "12"}) (e "path" #js {"d" "M10 3h4v12h-4z"}))
                                             "PriorityHighTwoTone"))
