(ns reagent-material-ui.icons.design-services-rounded
  "Imports @material-ui/icons/DesignServicesRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def design-services-rounded (create-svg-icon (e "path" #js {"d" "M16.24 11.51l1.57-1.57-3.75-3.75-1.57 1.57-4.14-4.13c-.78-.78-2.05-.78-2.83 0l-1.9 1.9c-.78.78-.78 2.05 0 2.83l4.13 4.13-4.6 4.61c-.1.1-.15.22-.15.36v3.04c0 .28.22.5.5.5h3.04c.13 0 .26-.05.35-.15l4.62-4.62 4.13 4.13c1.32 1.32 2.76.07 2.83 0l1.9-1.9c.78-.78.78-2.05 0-2.83l-4.13-4.12zm-7.06-.44L5.04 6.94l1.89-1.9L8.2 6.31l-.47.49c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l.48-.48 1.45 1.45-1.89 1.89zm7.88 7.89l-4.13-4.13 1.9-1.9 1.45 1.45-.48.48c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l.48-.48 1.27 1.27-1.9 1.9zM20.71 7.04c.39-.39.39-1.02 0-1.41l-2.34-2.34c-.47-.47-1.12-.29-1.41 0l-1.83 1.83 3.75 3.75 1.83-1.83z"})
                                              "DesignServicesRounded"))
