(ns reagent-material-ui.icons.signal-cellular-2-bar-outlined
  "Imports @material-ui/icons/SignalCellular2BarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-2-bar-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M2 22h20V2L2 22z", "fillOpacity" ".3"}) (e "path" #js {"d" "M14 10L2 22h12V10z"}))
                                                     "SignalCellular2BarOutlined"))
