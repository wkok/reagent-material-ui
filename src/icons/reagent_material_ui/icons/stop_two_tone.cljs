(ns reagent-material-ui.icons.stop-two-tone
  "Imports @material-ui/icons/StopTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stop-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 8h8v8H8z", "opacity" ".3"}) (e "path" #js {"d" "M6 18h12V6H6v12zM8 8h8v8H8V8z"}))
                                    "StopTwoTone"))
