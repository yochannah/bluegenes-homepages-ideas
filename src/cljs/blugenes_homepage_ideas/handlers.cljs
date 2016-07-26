(ns blugenes-homepage-ideas.handlers
    (:require [re-frame.core :as re-frame]
              [blugenes-homepage-ideas.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/register-handler
 :set-active-panel
 (fn [db [_ active-panel]]
   (assoc db :active-panel active-panel)))
