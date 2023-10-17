;; Problem 148, The Big Divide
(fn [n a b]
  (let [m (dec n)
        s (fn [x]
            (let [q (quot m x)]
              (*' x (/ (*' q (inc q)) 2))))]
    (- (+ (s a) (s b)) (s (* a b)))))
