;; Problem 114, Global take-while
(fn f [n p s]
  (when-let [[a & d] (seq s)]
    (if (p a)
      (when (> n 1)
        (cons a (lazy-seq (f (dec n) p d))))
      (cons a (lazy-seq (f n p d))))))
