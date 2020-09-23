(ns reagent-material-ui.icons.subject-outlined
  "Imports @material-ui/icons/SubjectOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def subject-outlined (create-svg-icon (e "path" #js {"d" "M14 17H4v2h10v-2zm6-8H4v2h16V9zM4 15h16v-2H4v2zM4 5v2h16V5H4z"})
                                       "SubjectOutlined"))
