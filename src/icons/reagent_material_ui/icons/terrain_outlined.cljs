(ns reagent-material-ui.icons.terrain-outlined
  "Imports @material-ui/icons/TerrainOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def terrain-outlined (create-svg-icon (e "path" #js {"d" "M14 6l-4.22 5.63 1.25 1.67L14 9.33 19 16h-8.46l-4.01-5.37L1 18h22L14 6zM5 16l1.52-2.03L8.04 16H5z"})
                                       "TerrainOutlined"))
