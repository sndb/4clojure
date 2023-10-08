;; Problem 118, Re-implement Map
(fn my-map [f s]
  (when (seq s)
    (cons (f (first s)) (lazy-seq (my-map f (rest s))))))
