(ns reagent-material-ui.icons.battery-charging-30-outlined
  "Imports @material-ui/icons/BatteryCharging30Outlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-charging-30-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.67 4H14V2h-4v2H8.33C7.6 4 7 4.6 7 5.33v9.17h2L13 7v5.5h2l-1.07 2H17V5.33C17 4.6 16.4 4 15.67 4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M11 20v-5.5H7v6.17C7 21.4 7.6 22 8.33 22h7.33c.74 0 1.34-.6 1.34-1.33V14.5h-3.07L11 20z"}))
                                                   "BatteryCharging30Outlined"))
