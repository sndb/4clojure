;; Problem 84, Transitive Closure
(fn [relation]
  (letfn [(try-pair [x [y & r] g]
            (when y
              (let [p (cond (= (second x) (first y))
                            [(first x) (second y)]
                            (= (second y) (first x))
                            [(first y) (second x)])]
                (if (or (not p) (g p)) (recur x r g) p))))
          (find-pair [relation]
            (loop [g relation]
              (when (seq g)
                (if-let [x (try-pair (first g) relation relation)]
                  x
                  (recur (rest g))))))]
    (loop [g relation]
      (if-let [p (find-pair g)] (recur (conj g p)) g))))
