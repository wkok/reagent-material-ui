(ns reagent-material-ui.icons.event-busy-rounded
  "Imports @material-ui/icons/EventBusyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def event-busy-rounded (create-svg-icon (e "path" #js {"d" "M9.84 16.47l1.91-1.91 1.91 1.91c.29.29.77.29 1.06 0 .29-.29.29-.77 0-1.06l-1.91-1.91 1.91-1.91c.29-.29.29-.77 0-1.06-.29-.29-.77-.29-1.06 0l-1.91 1.91-1.91-1.91c-.29-.29-.77-.29-1.06 0-.29.29-.29.77 0 1.06l1.91 1.91-1.91 1.91c-.29.29-.29.77 0 1.06.29.29.77.29 1.06 0zM19 3h-1V2c0-.55-.45-1-1-1s-1 .45-1 1v1H8V2c0-.55-.45-1-1-1s-1 .45-1 1v1H5c-1.11 0-1.99.9-1.99 2L3 19c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-1 16H6c-.55 0-1-.45-1-1V8h14v10c0 .55-.45 1-1 1z"})
                                         "EventBusyRounded"))
