(ns reagent-material-ui.icons.leaderboard-rounded
  "Imports @material-ui/icons/LeaderboardRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def leaderboard-rounded (create-svg-icon (e "path" #js {"d" "M6.5 21H3c-.55 0-1-.45-1-1V10c0-.55.45-1 1-1h3.5c.55 0 1 .45 1 1v10c0 .55-.45 1-1 1zm7.25-18h-3.5c-.55 0-1 .45-1 1v16c0 .55.45 1 1 1h3.5c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1zM21 11h-3.5c-.55 0-1 .45-1 1v8c0 .55.45 1 1 1H21c.55 0 1-.45 1-1v-8c0-.55-.45-1-1-1z"})
                                          "LeaderboardRounded"))
