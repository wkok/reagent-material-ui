(ns reagent-material-ui.icons.set-meal-outlined
  "Imports @material-ui/icons/SetMealOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def set-meal-outlined (create-svg-icon (e "path" #js {"d" "M21.05 17.56l-17.97.94L3 17l17.98-.94.07 1.5zM21 19.48H3v1.5h18v-1.5zM23 13V4c0-1.1-.9-2-2-2H3c-1.1 0-2 .9-2 2v9c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2zm-2 0H3V4h18v9zm-1-7c-1.68 0-3.04.98-3.21 2.23-.64-.73-2.73-2.73-6.54-2.73-4.67 0-6.75 3-6.75 3s2.08 3 6.75 3c3.81 0 5.9-2 6.54-2.73C16.96 10.02 18.32 11 20 11V6z"})
                                        "SetMealOutlined"))
