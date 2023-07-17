;; Problem 85, Power Set
(fn [coll]
  (reduce (fn [a x]
            (clojure.set/union a (map #(conj % x) a)))
          #{#{}}
          coll))
