(ns reagent-material-ui.icons.assignment-return-two-tone
  "Imports @material-ui/icons/AssignmentReturnTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def assignment-return-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 5v14h14V5H5zm11 9h-4v3l-5-5 5-5v3h4v4z", "opacity" ".3"}) (e "path" #js {"d" "M12 7l-5 5 5 5v-3h4v-4h-4zm7-4h-4.18C14.4 1.84 13.3 1 12 1c-1.3 0-2.4.84-2.82 2H5c-.14 0-.27.01-.4.04-.39.08-.74.28-1.01.55-.18.18-.33.4-.43.64S3 4.72 3 5v14c0 .27.06.54.16.78s.25.45.43.64c.27.27.62.47 1.01.55.13.02.26.03.4.03h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7-.25c.41 0 .75.34.75.75s-.34.75-.75.75-.75-.34-.75-.75.34-.75.75-.75zM19 19H5V5h14v14z"}))
                                                 "AssignmentReturnTwoTone"))
