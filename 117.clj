;; Problem 117, For Science!
(fn [maze]
  (let [mouse (some (fn [[i line]]
                      (when-let [j (clojure.string/index-of line \M)]
                        [i j]))
                    (map-indexed vector maze))
        moves (fn [[x y]]
                [[(inc x) y]
                 [(dec x) y]
                 [x (inc y)]
                 [x (dec y)]])]
    (loop [seen #{}
           [p & d] (moves mouse)]
      (cond
        (not p) false
        (seen p) (recur seen d)
        :else (case (get-in maze p)
                \C true
                \space (recur (conj seen p) (concat d (moves p)))
                (recur (conj seen p) d))))))
