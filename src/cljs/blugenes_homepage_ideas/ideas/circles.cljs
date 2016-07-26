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

(defn search []
  [:form.search
   [:div.input
    [:label [:h2 "Search"]
    [:input {:type "text"}]]]
   [:div.info
    [:svg.icon.icon-info [:use {:xlinkHref "#icon-info"}]]
    " Search for genes, proteins, pathways, ontology terms, authors, etc."]])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [:active-panel])]
    (fn []
      [:main
       [search]
       [:div.features
        [lists]
        [templates]
        [help]
        ]

       ])))
