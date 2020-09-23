(ns reagent-material-ui.icons.upgrade-outlined
  "Imports @material-ui/icons/UpgradeOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def upgrade-outlined (create-svg-icon (e "path" #js {"d" "M16 18v2H8v-2h8zM11 7.99V16h2V7.99h3L12 4 8 7.99h3z"})
                                       "UpgradeOutlined"))
