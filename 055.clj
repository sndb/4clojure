;; Problem 55, Count Occurences
#(reduce (fn [a x] (update a x (fn [n] (if n (inc n) 1)))) {} %)
