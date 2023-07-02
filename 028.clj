;; Problem 28, Flatten a Sequence
(fn flat [s]
  (if (sequential? s)
    (mapcat flat s)
    (list s)))
