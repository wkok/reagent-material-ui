(ns reagent-material-ui.icons.art-track-sharp
  "Imports @material-ui/icons/ArtTrackSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def art-track-sharp (create-svg-icon (e "path" #js {"d" "M22 13h-8v-2h8v2zm0-6h-8v2h8V7zm-8 10h8v-2h-8v2zM12 7v10H2V7h10zm-1.5 8l-2.25-3-1.75 2.26-1.25-1.51L3.5 15h7z"})
                                      "ArtTrackSharp"))
