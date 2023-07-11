;; Problem 75, Euler's Totient Function
(fn [x]
  (letfn [(gcd [n m]
            (let [r (rem n m)]
              (if (zero? r)
                m
                (recur m r))))
          (coprime? [n m]
            (= 1 (gcd n m)))]
    (if (= 1 x)
      1
      (count (filter (partial coprime? x) (range 1 x))))))
