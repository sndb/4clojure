;; Problem 110, Sequence of pronunciations
(fn pronunciations
  [coll]
  (let [p (mapcat #(vector (count %) (first %))
                  (partition-by identity coll))]
    (cons p (lazy-seq (pronunciations p)))))
