(ns reagent-material-ui.icons.domain-verification-rounded
  "Imports @material-ui/icons/DomainVerificationRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def domain-verification-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10.23 15.83c.39.39 1.02.39 1.41 0l4.24-4.24c.39-.39.39-1.02 0-1.42a.9959.9959 0 00-1.41 0l-3.54 3.53-1.41-1.41c-.39-.39-1.02-.39-1.42 0s-.39 1.02 0 1.41l2.13 2.13z"}) (e "path" #js {"d" "M19 4H5c-1.11 0-2 .9-2 2v12c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.89-2-2-2zm0 13c0 .55-.45 1-1 1H6c-.55 0-1-.45-1-1V8h14v9z"}))
                                                  "DomainVerificationRounded"))
