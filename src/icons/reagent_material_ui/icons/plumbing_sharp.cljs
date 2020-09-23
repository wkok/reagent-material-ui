(ns reagent-material-ui.icons.plumbing-sharp
  "Imports @material-ui/icons/PlumbingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def plumbing-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16.16 5.64l3.54 3.54c1.17-1.17 1.17-3.07 0-4.24L16.16 1.4l-4.24 4.24 2.12 2.12 2.12-2.12zM4.842 12.7081l3.5355-3.5355 2.1213 2.1213-3.5355 3.5355z"}) (e "path" #js {"d" "M15.45 7.76l-1.41 1.41-4.25-4.24-2.12 2.12 4.24 4.24-8.49 8.49 2.83 2.83L16.86 12l.71.71 1.41-1.41-3.53-3.54z"}))
                                     "PlumbingSharp"))
