;; Problem 33, Replicate a Sequence
(fn [coll n] (mapcat #(repeat n %) coll))
