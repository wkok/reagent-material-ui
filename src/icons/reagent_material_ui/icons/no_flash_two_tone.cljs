(ns reagent-material-ui.icons.no-flash-two-tone
  "Imports @material-ui/icons/NoFlashTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def no-flash-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13.42 16.24l2.55 2.55-.01 1.21H4v-8.6h3.02l.59-.65.15-.16 1.5 1.5c-1.58.34-2.76 1.73-2.76 3.41 0 1.93 1.57 3.5 3.5 3.5 1.68 0 3.07-1.18 3.42-2.76zM16 13.17V11.4h-1.77L16 13.17z", "opacity" ".3"}) (e "path" #js {"d" "M20.4 5.6H22L19 11V7h-1V2h4l-1.6 3.6zM16 11.4v1.77l2 2V11c0-.88-.72-1.6-1.6-1.6h-2.54L12.58 8h-1.75l3.4 3.4H16zm1.97 6.57L2.1 2.1.69 3.51l5.66 5.66-.21.23H3.6c-.88 0-1.6.72-1.6 1.6v9.4c0 .88.72 1.6 1.6 1.6h12.8c.75 0 1.38-.52 1.55-1.22l2.54 2.54 1.41-1.41-3.93-3.94zM11.5 15.5c0 .83-.67 1.5-1.5 1.5s-1.5-.67-1.5-1.5S9.17 14 10 14s1.5.67 1.5 1.5zm4.46 4.5H4v-8.6h3.02l.59-.65.15-.16 1.5 1.5c-1.58.34-2.76 1.73-2.76 3.41 0 1.93 1.57 3.5 3.5 3.5 1.68 0 3.07-1.18 3.42-2.76l2.55 2.55-.01 1.21z"}))
                                        "NoFlashTwoTone"))
