(ns reagent-material-ui.icons.call-missed-outgoing-two-tone
  "Imports @material-ui/icons/CallMissedOutgoingTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-missed-outgoing-two-tone (create-svg-icon (e "path" #js {"d" "M19 10.41V15h2V7h-8v2h4.59L12 14.59 4.41 7 3 8.41l9 9z"})
                                                    "CallMissedOutgoingTwoTone"))
