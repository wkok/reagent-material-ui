(ns reagent-material-ui.icons.crop-32-outlined
  "Imports @material-ui/icons/Crop32Outlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-32-outlined (create-svg-icon (e "path" #js {"d" "M19 4H5c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H5V6h14v12z"})
                                       "Crop32Outlined"))
