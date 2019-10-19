(ns reagent-material-ui.icons.chrome-reader-mode
  "Imports @material-ui/icons/ChromeReaderMode as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def chrome-reader-mode (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M-74 29h48v48h-48V29zM0 0h24v24H0V0zm0 0h24v24H0V0z", "fill" "none"}) (e "path" #js {"d" "M13 12h7v1.5h-7zm0-2.5h7V11h-7zm0 5h7V16h-7zM21 4H3c-1.1 0-2 .9-2 2v13c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 15h-9V6h9v13z"}))
                                         "ChromeReaderMode"))