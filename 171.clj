;; Problem 171, Intervals
(fn [nums]
  (reverse
   (reduce (fn [[[a b] & r :as l] x]
             (if (= b (dec x))
               (conj r [a x])
               (conj l [x x])))
           (list)
           (dedupe (sort nums)))))
