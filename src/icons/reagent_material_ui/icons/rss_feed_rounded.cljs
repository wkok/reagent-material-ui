(ns reagent-material-ui.icons.rss-feed-rounded
  "Imports @material-ui/icons/RssFeedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def rss-feed-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "17.82", "r" "2.18", "cx" "6.18"}) (e "path" #js {"d" "M5.59 10.23c-.84-.14-1.59.55-1.59 1.4 0 .71.53 1.28 1.23 1.4 2.92.51 5.22 2.82 5.74 5.74.12.7.69 1.23 1.4 1.23.85 0 1.54-.75 1.41-1.59-.68-4.2-3.99-7.51-8.19-8.18zm-.03-5.71C4.73 4.43 4 5.1 4 5.93c0 .73.55 1.33 1.27 1.4 6.01.6 10.79 5.38 11.39 11.39.07.73.67 1.28 1.4 1.28.84 0 1.5-.73 1.42-1.56-.73-7.34-6.57-13.19-13.92-13.92z"}))
                                       "RssFeedRounded"))
