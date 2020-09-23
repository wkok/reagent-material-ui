(ns reagent-material-ui.icons.electric-car-two-tone
  "Imports @material-ui/icons/ElectricCarTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def electric-car-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 13h14V8H5v5zm11.5-4c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zm-9 0c.83 0 1.5.67 1.5 1.5S8.33 12 7.5 12 6 11.33 6 10.5 6.67 9 7.5 9z", "opacity" ".3"}) (e "path" #js {"d" "M18.92 2.01C18.72 1.42 18.16 1 17.5 1h-11c-.66 0-1.21.42-1.42 1.01L3 8v8c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h12v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1V8l-2.08-5.99zM6.85 3h10.29l1.08 3.11H5.77L6.85 3zM19 13H5V8h14v5z"}) (e "circle" #js {"cy" "10.5", "r" "1.5", "cx" "7.5"}) (e "circle" #js {"cy" "10.5", "r" "1.5", "cx" "16.5"}) (e "path" #js {"d" "M7 20h4v-2l6 3h-4v2z"}))
                                            "ElectricCarTwoTone"))
