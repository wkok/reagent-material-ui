(ns reagent-material-ui.icons.pin-drop-sharp
  "Imports @material-ui/icons/PinDropSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def pin-drop-sharp (create-svg-icon (e "path" #js {"d" "M5 20h14v2H5v-2zm7-13c-1.1 0-2 .9-2 2s.9 2 2 2a2 2 0 100-4zm0-5c3.27 0 7 2.46 7 7.15 0 3.12-2.33 6.41-7 9.85-4.67-3.44-7-6.73-7-9.85C5 4.46 8.73 2 12 2z", "fillRule" "evenodd"})
                                     "PinDropSharp"))
