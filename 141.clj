;; Problem 141, Tricky card games
(fn [trump]
  (fn [cards]
    (let [trump? #(= (:suit %) (or trump (:suit (first cards))))]
      (apply max-key :rank (filter trump? cards)))))
