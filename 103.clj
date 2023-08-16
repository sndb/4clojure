;; Problem 103, Generating k-combinations
(fn k-combinations
  [n coll]
  (cond
    (zero? n) #{#{}}
    (empty? coll) #{}
    :else (set
           (concat
            (map #(conj % (first coll))
                 (k-combinations (dec n) (rest coll)))
            (k-combinations n (rest coll))))))
