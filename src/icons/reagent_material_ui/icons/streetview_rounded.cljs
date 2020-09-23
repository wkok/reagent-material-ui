(ns reagent-material-ui.icons.streetview-rounded
  "Imports @material-ui/icons/StreetviewRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def streetview-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12.56 14.33c-.34.27-.56.7-.56 1.17V21h7c1.1 0 2-.9 2-2v-5.98c-.94-.33-1.95-.52-3-.52-2.03 0-3.93.7-5.44 1.83z"}) (e "circle" #js {"cy" "6", "r" "5", "cx" "18"}) (e "path" #js {"d" "M11.5 6c0-1.08.27-2.1.74-3H5c-1.1 0-2 .9-2 2v14c0 .55.23 1.05.59 1.41l9.82-9.82C12.23 9.42 11.5 7.8 11.5 6z"}))
                                         "StreetviewRounded"))
