(ns reagent-material-ui.icons.arrow-forward-sharp
  "Imports @material-ui/icons/ArrowForwardSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-forward-sharp (create-svg-icon (e "path" #js {"d" "M12 4l-1.41 1.41L16.17 11H4v2h12.17l-5.58 5.59L12 20l8-8-8-8z"})
                                          "ArrowForwardSharp"))
