(ns blugenes-homepage-ideas.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [devtools.core :as devtools]
              [blugenes-homepage-ideas.handlers]
              [blugenes-homepage-ideas.subs]
              [blugenes-homepage-ideas.routes :as routes]
              [blugenes-homepage-ideas.views :as views]
              [blugenes-homepage-ideas.config :as config]))


(defn dev-setup []
  (when config/debug?
    (println "dev mode")
    (devtools/install!)))

(defn mount-root []
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (routes/app-routes)
  (re-frame/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
