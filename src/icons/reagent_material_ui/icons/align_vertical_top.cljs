(ns reagent-material-ui.icons.align-vertical-top
  "Imports @material-ui/icons/AlignVerticalTop as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def align-vertical-top (create-svg-icon (e "path" #js {"d" "M22 2v2H2V2h20zM7 22h3V6H7v16zm7-6h3V6h-3v10z"})
                                         "AlignVerticalTop"))