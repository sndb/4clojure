;; Problem 58, Function Composition
(fn [& fs]
  (reduce (fn [f g] (fn [& args] (f (apply g args)))) fs))
