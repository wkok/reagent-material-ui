(ns reagent-material-ui.icons.star-rate-two-tone
  "Imports @material-ui/icons/StarRateTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def star-rate-two-tone (create-svg-icon (e "path" #js {"d" "M9 11.3l3.71 2.7-1.42-4.36L15 7h-4.55L9 2.5 7.55 7H3l3.71 2.64L5.29 14 9 11.3z", "transform" "scale(1.33, 1.33)"})
                                         "StarRateTwoTone"))
