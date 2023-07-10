;; Problem 66, Greatest Common Divisor
(fn gcd [n m]
  (let [r (rem n m)]
    (if (zero? r)
      m
      (gcd m r))))
