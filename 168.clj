;; Problem 168, Infinite Matrix
(fn matrix
  ([f]
   (matrix f 0 0))
  ([f i j]
   (letfn [(row [f i j]
             (cons (f i j) (lazy-seq (row f i (inc j)))))]
     (cons (row f i j) (lazy-seq (matrix f (inc i) j)))))
  ([f i j m n]
   (take m (map #(take n %) (matrix f i j)))))
