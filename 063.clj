;; Problem 63, Group a Sequence
(fn [f coll]
  (reduce (fn [a x] (update a (f x) #(conj (vec %) x))) {} coll))
