(ns reagent-material-ui.icons.reply
  "Imports @material-ui/icons/Reply as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def reply (create-svg-icon (e "path" #js {"d" "M10 9V5l-7 7 7 7v-4.1c5 0 8.5 1.6 11 5.1-1-5-4-10-11-11z"})
                            "Reply"))
