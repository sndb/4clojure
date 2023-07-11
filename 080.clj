;; Problem 80, Perfect Numbers
(fn [n] (= n (apply + (filter #(zero? (rem n %)) (range 1 n)))))
