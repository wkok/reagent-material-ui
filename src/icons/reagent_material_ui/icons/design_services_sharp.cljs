(ns reagent-material-ui.icons.design-services-sharp
  "Imports @material-ui/icons/DesignServicesSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def design-services-sharp (create-svg-icon (e "path" #js {"d" "M21.79 17.06l-5.55-5.55 1.57-1.57-3.75-3.75-1.57 1.57-5.55-5.55-4.73 4.73 5.55 5.55L3 17.25V21h3.75l4.76-4.76 5.55 5.55 4.73-4.73zM9.18 11.07L5.04 6.94l1.9-1.9 1.27 1.27L7.02 7.5l1.41 1.41 1.19-1.19 1.45 1.45-1.89 1.9zm3.75 3.75l1.9-1.9 1.45 1.45-1.19 1.19 1.41 1.41 1.19-1.19 1.27 1.27-1.9 1.9-4.13-4.13zM15.1329 5.123l2.5385-2.5385L21.419 6.332l-2.5385 2.5385z"})
                                            "DesignServicesSharp"))
