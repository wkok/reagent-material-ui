(ns reagent-material-ui.icons.arrow-drop-up-rounded
  "Imports @material-ui/icons/ArrowDropUpRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-drop-up-rounded (create-svg-icon (e "path" #js {"d" "M8.71 12.29L11.3 9.7c.39-.39 1.02-.39 1.41 0l2.59 2.59c.63.63.18 1.71-.71 1.71H9.41c-.89 0-1.33-1.08-.7-1.71z"})
                                            "ArrowDropUpRounded"))
