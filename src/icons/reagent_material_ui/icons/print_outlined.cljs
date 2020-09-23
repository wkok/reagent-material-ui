(ns reagent-material-ui.icons.print-outlined
  "Imports @material-ui/icons/PrintOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def print-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 8h-1V3H6v5H5c-1.66 0-3 1.34-3 3v6h4v4h12v-4h4v-6c0-1.66-1.34-3-3-3zM8 5h8v3H8V5zm8 12v2H8v-4h8v2zm2-2v-2H6v2H4v-4c0-.55.45-1 1-1h14c.55 0 1 .45 1 1v4h-2z"}) (e "circle" #js {"cy" "11.5", "r" "1", "cx" "18"}))
                                     "PrintOutlined"))
