;; Problem 93, Partially Flatten a Sequence
(fn part-flatten
  [coll]
  (letfn [(lowest? [s] (or (not (coll? s)) (not-any? coll? s)))]
    (mapcat #(if (lowest? %) [%] (part-flatten %)) coll)))
