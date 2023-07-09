;; Problem 53, Longest Increasing Sub-Seq
(fn [coll]
  (second
   (reduce (fn [[current longest] n]
             (let [l (last current)]
               (if (and l (< l n))
                 (let [new (conj current n)]
                   [new (max-key count new longest)])
                 [[n] longest])))
           [[] []] coll)))
