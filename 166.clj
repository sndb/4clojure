;; Problem 166, Comparisons
(fn [< a b]
  (cond
    (< a b) :lt
    (< b a) :gt
    :else :eq))
