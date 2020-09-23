(ns reagent-material-ui.icons.comment-bank-sharp
  "Imports @material-ui/icons/CommentBankSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def comment-bank-sharp (create-svg-icon (e "path" #js {"d" "M2 2v20l4-4h16V2H2zm17 11l-2.5-1.5L14 13V5h5v8z"})
                                         "CommentBankSharp"))
