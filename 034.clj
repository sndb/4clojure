;; Problem 34, Implement range
(fn my-range [start end]
  (when (< start end)
    (lazy-seq (cons start (my-range (inc start) end)))))
