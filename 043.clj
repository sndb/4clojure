;; Problem 43, Reverse Interleave
(fn [coll n] (apply map vector (partition n coll)))
