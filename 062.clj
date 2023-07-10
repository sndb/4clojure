;; Problem 62, Re-implement Iteration
(fn my-iterate [f x]
  (cons x (lazy-seq (my-iterate f (f x)))))
