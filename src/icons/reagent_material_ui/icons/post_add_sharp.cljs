(ns reagent-material-ui.icons.post-add-sharp
  "Imports @material-ui/icons/PostAddSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def post-add-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 19.22H5V7h7V5H3v16h16v-9h-2z"}) (e "path" #js {"d" "M19 2h-2v3h-3c.01.01 0 2 0 2h3v2.99c.01.01 2 0 2 0V7h3V5h-3V2zM7 9h8v2H7zM7 12v2h8v-2h-3zM7 15h8v2H7z"}))
                                     "PostAddSharp"))
