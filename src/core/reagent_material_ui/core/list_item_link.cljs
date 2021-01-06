(ns reagent-material-ui.core.list-item-link
  "Imports @material-ui/core/ListItemLink as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-item-link/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ListItemLink" :as MuiListItemLink]))

(def list-item-link (adapt-react-class (or (.-default MuiListItemLink) (.-ListItemLink MuiListItemLink)) "mui-list-item-link"))
