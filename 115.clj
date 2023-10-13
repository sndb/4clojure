;; Problem 115, The Balance of N
(fn [n]
  (loop [n n
         a []]
    (if (zero? n)
      (let [h (quot (count a) 2)]
        (= (apply + (take h a))
           (apply + (take h (reverse a)))))
      (recur (quot n 10)
             (conj a (rem n 10))))))
