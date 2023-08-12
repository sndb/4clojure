;; Problem 92, Read Roman numerals
(fn [n]
  (let [v {\I 1 \V 5 \X 10 \L 50 \C 100 \D 500 \M 1000}]
    (loop [[n1 n2 & ns] n
           result 0]
      (if n1
        (if (and n2 (< (v n1) (v n2)))
          (recur ns (+ result (- (v n2) (v n1))))
          (recur (cons n2 ns) (+ result (v n1))))
        result))))
