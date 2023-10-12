;; Problem 153, Pairwise Disjoint Sets
(fn [s]
  (boolean
   (reduce (fn [u t]
             (if (seq (clojure.set/intersection u t))
               (reduced false)
               (clojure.set/union u t)))
           #{}
           s)))
