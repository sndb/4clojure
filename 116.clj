;; Problem 116, Prime Sandwich
(fn [n]
  (letfn [(primes
            ([] (primes 2 #{}))
            ([n p]
             (if (some #(zero? (rem n %)) p)
               (primes (inc n) p)
               (cons n (lazy-seq (primes (inc n) (conj p n)))))))]
    (let [[p0 p1 p2] (some #(and (<= n (second %)) %)
                           (partition 3 1 (primes)))]
      (and (= p1 n)
           (= p1 (/ (+ p0 p2) 2))))))
