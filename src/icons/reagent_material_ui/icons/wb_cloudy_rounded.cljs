(ns reagent-material-ui.icons.wb-cloudy-rounded
  "Imports @material-ui/icons/WbCloudyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def wb-cloudy-rounded (create-svg-icon (e "path" #js {"d" "M19.37 10.04C18.68 6.59 15.65 4 12.01 4c-2.89 0-5.4 1.64-6.65 4.04C2.35 8.36.01 10.91.01 14c0 3.31 2.69 6 6 6h13c2.76 0 5-2.24 5-5 0-2.64-2.05-4.78-4.64-4.96z"})
                                        "WbCloudyRounded"))
