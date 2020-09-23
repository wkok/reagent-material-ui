(ns reagent-material-ui.icons.directions-transit-outlined
  "Imports @material-ui/icons/DirectionsTransitOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def directions-transit-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 2c-4 0-8 .5-8 4v9.5C4 17.43 5.57 19 7.5 19L6 20.5v.5h12v-.5L16.5 19c1.93 0 3.5-1.57 3.5-3.5V6c0-3.5-3.58-4-8-4zm5.66 3H6.43c.61-.52 2.06-1 5.57-1 3.71 0 5.12.46 5.66 1zM11 7v3H6V7h5zm2 0h5v3h-5V7zm3.5 10h-9c-.83 0-1.5-.67-1.5-1.5V12h12v3.5c0 .83-.67 1.5-1.5 1.5z"}) (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "8.5"}) (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "15.5"}))
                                                  "DirectionsTransitOutlined"))
