;; Problem 100, Least Common Multiple
(fn [& ns]
  (letfn [(gcd [n m] (if (zero? m) n (recur m (rem n m))))
          (lcm [n m] (/ (* n m) (gcd n m)))]
    (reduce lcm ns)))
