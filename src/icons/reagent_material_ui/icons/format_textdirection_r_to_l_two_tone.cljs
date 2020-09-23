(ns reagent-material-ui.icons.format-textdirection-r-to-l-two-tone
  "Imports @material-ui/icons/FormatTextdirectionRToLTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-textdirection-r-to-l-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 6c0 1.1.9 2 2 2V4c-1.1 0-2 .9-2 2z", "opacity" ".3"}) (e "path" #js {"d" "M6 6c0 2.21 1.79 4 4 4v5h2V4h2v11h2V4h2V2h-8C7.79 2 6 3.79 6 6zm4 2c-1.1 0-2-.9-2-2s.9-2 2-2v4zM4 18l4 4v-3h12v-2H8v-3z"}))
                                                           "FormatTextdirectionRToLTwoTone"))
