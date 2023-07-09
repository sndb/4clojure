;; Problem 54, Partition a Sequence
(fn [n coll]
  (loop [coll coll
         result []]
    (let [part (take n coll)]
      (if (= n (count part))
        (recur (drop n coll) (conj result part))
        result))))
