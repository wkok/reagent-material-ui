(ns reagent-material-ui.icons.delete-outline-two-tone
  "Imports @material-ui/icons/DeleteOutlineTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def delete-outline-two-tone (create-svg-icon (e "path" #js {"d" "M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM8 9h8v10H8V9zm7.5-5l-1-1h-5l-1 1H5v2h14V4h-3.5z"})
                                              "DeleteOutlineTwoTone"))
