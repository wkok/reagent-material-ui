(ns reagent-material-ui.icons.crop-54
  "Imports @material-ui/icons/Crop54 as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-54 (create-svg-icon (e "path" #js {"d" "M19 5H5c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm0 12H5V7h14v10z"})
                              "Crop54"))
