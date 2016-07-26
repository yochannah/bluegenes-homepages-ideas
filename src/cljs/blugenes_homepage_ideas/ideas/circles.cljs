(ns blugenes-homepage-ideas.ideas.circles    (:require [re-frame.core :as re-frame]))


(defn main-panel []
  (let [active-panel (re-frame/subscribe [:active-panel])]
    (fn []
      [:div "search"])))
