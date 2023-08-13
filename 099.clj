;; Problem 99, Product Digits
(fn [a b]
  (letfn [(digits [n result]
            (if (zero? n)
              (reverse result)
              (recur (quot n 10)
                     (conj result (rem n 10)))))]
    (digits (* a b) [])))
