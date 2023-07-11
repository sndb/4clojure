;; Problem 79, Triangle Minimal Path
(fn min-path
  [triangle]
  (if (zero? (count triangle))
    0
    (let [left  (map butlast (rest triangle))
          right (map rest (rest triangle))]
      (+ (min (min-path left) (min-path right))
         (first (first triangle))))))
