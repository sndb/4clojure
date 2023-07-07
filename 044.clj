;; Problem 44, Rotate Sequence
(fn [n coll]
  (let [m (mod n (count coll))]
    (concat (drop m coll) (take m coll))))
