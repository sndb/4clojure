;; Problem 60, Sequence Reductions
(fn my-reductions
  ([f coll]
   (my-reductions f (first coll) (rest coll)))
  ([f init coll]
   (if (seq coll)
     (cons init (lazy-seq (my-reductions f (f init (first coll)) (rest coll))))
     (list init))))
