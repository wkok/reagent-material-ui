(ns reagent-material-ui.icons.keyboard-return-two-tone
  "Imports @material-ui/icons/KeyboardReturnTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-return-two-tone (create-svg-icon (e "path" #js {"d" "M19 7v4H5.83l3.58-3.59L8 6l-6 6 6 6 1.41-1.41L5.83 13H21V7h-2z"})
                                               "KeyboardReturnTwoTone"))
