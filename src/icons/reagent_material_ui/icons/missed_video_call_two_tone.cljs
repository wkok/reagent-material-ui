(ns reagent-material-ui.icons.missed-video-call-two-tone
  "Imports @material-ui/icons/MissedVideoCallTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def missed-video-call-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 13.5V8H5v8h10v-2.5zM11 15l-3.89-3.89v2.55H6V9.22h4.44v1.11H7.89l3.11 3.1 2.99-3.01.78.79L11 15z", "opacity" ".3"}) (e "path" #js {"d" "M3 17c0 .55.45 1 1 1h12c.55 0 1-.45 1-1v-3.5l4 4v-11l-4 4V7c0-.55-.45-1-1-1H4c-.55 0-1 .45-1 1v10zm2-9h10v8H5V8zm6 5.43l-3.11-3.1h2.55V9.22H6v4.44h1.11v-2.55L11 15l3.77-3.79-.78-.79z"}))
                                                 "MissedVideoCallTwoTone"))
