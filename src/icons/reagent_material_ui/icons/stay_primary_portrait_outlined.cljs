(ns reagent-material-ui.icons.stay-primary-portrait-outlined
  "Imports @material-ui/icons/StayPrimaryPortraitOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stay-primary-portrait-outlined (create-svg-icon (e "path" #js {"d" "M17 1.01L7 1c-1.1 0-1.99.9-1.99 2v18c0 1.1.89 2 1.99 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 19H7V5h10v14z"})
                                                     "StayPrimaryPortraitOutlined"))
