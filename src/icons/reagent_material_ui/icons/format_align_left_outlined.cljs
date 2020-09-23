(ns reagent-material-ui.icons.format-align-left-outlined
  "Imports @material-ui/icons/FormatAlignLeftOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-align-left-outlined (create-svg-icon (e "path" #js {"d" "M15 15H3v2h12v-2zm0-8H3v2h12V7zM3 13h18v-2H3v2zm0 8h18v-2H3v2zM3 3v2h18V3H3z"})
                                                 "FormatAlignLeftOutlined"))
