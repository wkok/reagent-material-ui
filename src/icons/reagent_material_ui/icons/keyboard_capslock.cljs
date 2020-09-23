(ns reagent-material-ui.icons.keyboard-capslock
  "Imports @material-ui/icons/KeyboardCapslock as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-capslock (create-svg-icon (e "path" #js {"d" "M12 8.41L16.59 13 18 11.59l-6-6-6 6L7.41 13 12 8.41zM6 18h12v-2H6v2z"})
                                        "KeyboardCapslock"))
