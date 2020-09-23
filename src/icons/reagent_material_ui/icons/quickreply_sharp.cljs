(ns reagent-material-ui.icons.quickreply-sharp
  "Imports @material-ui/icons/QuickreplySharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def quickreply-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M22 2H2v20l4-4h9v-8h7z"}) (e "path" #js {"d" "M22.5 16h-2.2l1.7-4h-5v6h2v5z"}))
                                       "QuickreplySharp"))
