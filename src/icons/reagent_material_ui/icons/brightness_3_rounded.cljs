(ns reagent-material-ui.icons.brightness-3-rounded
  "Imports @material-ui/icons/Brightness3Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def brightness-3-rounded (create-svg-icon (e "path" #js {"d" "M18.87 10.37c-.75-4.76-5-8.35-9.82-8.37-.49 0-.97.03-1.44.1-.5.07-.6.73-.14.96C10.75 4.69 13 8.08 13 12s-2.25 7.31-5.53 8.95c-.45.23-.36.89.14.96.47.06.95.09 1.44.09 4.82-.02 9.07-3.61 9.82-8.37.09-.55.11-1.09.11-1.63 0-.54-.02-1.08-.11-1.63z"})
                                           "Brightness3Rounded"))
