;; Problem 65, Black Box Testing
(fn [coll]
  (let [e (empty coll)]
    (cond
      (empty? (conj e nil)) :map
      (= 1 (count (conj e 1 1))) :set
      (= 1 (first (conj e 1 2))) :vector
      :else :list)))
