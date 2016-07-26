(ns blugenes-homepage-ideas.ideas.circles
  (:require [re-frame.core :as re-frame]))

(defn lists []
  [:div.feature.lists
   [:div.piccie [:svg.icon.icon-summary [:use {:xlinkHref "#icon-summary"}]] ]
    [:div [:a {:href "nope"} "View"]
    [:a {:href "nope"} "Upload"]]
   ])


 (defn templates []
   [:div.feature.templates
    [:div.piccie [:svg.icon.icon-summary [:use {:xlinkHref "#icon-summary"}]] ]
     [:div [:a {:href "nope"} "Browse"]]
    ])

(defn help []
  [:div.feature.help
   [:div.piccie [:svg.icon.icon-summary [:use {:xlinkHref "#icon-summary"}]] ]
    [:div [:a {:href "nope"} "Tour"]
    [:a {:href "nope"} "Docs/Help"]]
   ])



(defn main-panel []
  (let [active-panel (re-frame/subscribe [:active-panel])]
    (fn []
      [:main
       [:form
        [:label [:h2 "Search"]
        [:input {:type "text"}]]
        [:div
         [:svg.icon.icon-info [:use {:xlinkHref "#icon-info"}]]
         "Search for genes, proteins, pathways, ontology terms, authors, etc."]]
       [:div.features
        [lists]
        [templates]
        [help]
        ]

       ])))
