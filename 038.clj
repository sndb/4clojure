;; Problem 38, Maximum value
(fn [& args] (reduce (fn [a x] (if (> a x) a x)) args))
