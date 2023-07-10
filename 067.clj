;; Problem 67, Prime Numbers
(fn primes
  ([n] (take n (primes 2 #{})))
  ([x prev]
   (if (some #(zero? (rem x %)) prev)
     (lazy-seq (primes (inc x) prev))
     (lazy-seq (cons x (primes (inc x) (conj prev x)))))))
