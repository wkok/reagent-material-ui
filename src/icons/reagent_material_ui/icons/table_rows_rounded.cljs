(ns reagent-material-ui.icons.table-rows-rounded
  "Imports @material-ui/icons/TableRowsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def table-rows-rounded (create-svg-icon (e "path" #js {"d" "M20 7H4c-1.1 0-2-.9-2-2V4c0-1.1.9-2 2-2h16c1.1 0 2 .9 2 2v1c0 1.1-.9 2-2 2zm0 2.5H4c-1.1 0-2 .9-2 2v1c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2v-1c0-1.1-.9-2-2-2zm0 7.5H4c-1.1 0-2 .9-2 2v1c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2v-1c0-1.1-.9-2-2-2z"})
                                         "TableRowsRounded"))
