(ns reagent-material-ui.icons.rule-folder-rounded
  "Imports @material-ui/icons/RuleFolderRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def rule-folder-rounded (create-svg-icon (e "path" #js {"d" "M20 6h-8l-1.41-1.41C10.21 4.21 9.7 4 9.17 4H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zM7.12 15.29l-1.41-1.41a.9959.9959 0 010-1.41c.39-.39 1.02-.39 1.41 0l.71.71 2.83-2.83c.39-.39 1.02-.39 1.41 0 .39.39.39 1.02 0 1.41L8.53 15.3c-.39.38-1.02.38-1.41-.01zM17.41 13l.88.88c.39.39.39 1.02 0 1.41-.39.39-1.02.39-1.41 0l-.88-.88-.88.88c-.39.39-1.02.39-1.41 0a.9959.9959 0 010-1.41l.88-.88-.88-.88a.9959.9959 0 010-1.41c.39-.39 1.02-.39 1.41 0l.88.88.88-.88c.39-.39 1.02-.39 1.41 0 .39.39.39 1.02 0 1.41l-.88.88z"})
                                          "RuleFolderRounded"))
