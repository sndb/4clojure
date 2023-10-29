;; Problem 132, Intervals
(fn f [p v [a & b :as s]]
  (when (seq s)
    (if (and (seq b) (p a (first b)))
      (cons a (cons v (lazy-seq (f p v b))))
      (cons a (lazy-seq (f p v b))))))
