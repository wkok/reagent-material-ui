(ns reagent-material-ui.icons.format-quote-two-tone
  "Imports @material-ui/icons/FormatQuoteTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-quote-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16.62 16h.76L19 12.76V8h-4v4h3.62zm-10 0h.76L9 12.76V8H5v4h3.62z", "opacity" ".3"}) (e "path" #js {"d" "M18.62 18L21 13.24V6h-8v8h2.38l-2 4h5.24zM15 12V8h4v4.76L17.38 16h-.76l2-4H15zM3.38 18h5.24L11 13.24V6H3v8h2.38l-2 4zM5 12V8h4v4.76L7.38 16h-.76l2-4H5z"}))
                                            "FormatQuoteTwoTone"))
