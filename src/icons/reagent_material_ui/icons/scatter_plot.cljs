(ns reagent-material-ui.icons.scatter-plot
  "Imports @material-ui/icons/ScatterPlot as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def scatter-plot (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "14", "r" "3", "cx" "7"}) (e "circle" #js {"cy" "6", "r" "3", "cx" "11"}) (e "circle" #js {"cy" "17.6", "r" "3", "cx" "16.6"}))
                                   "ScatterPlot"))
