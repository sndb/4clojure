;; Problem 86, Happy numbers
(fn [n]
  (letfn [(digits
            ([n] (digits n []))
            ([n d] (if (zero? n)
                     d
                     (recur (quot n 10) (conj d (rem n 10))))))]
    (loop [n n
           seen #{}]
      (cond
        (= n 1) true
        (seen n) false
        :else (recur (apply + (map #(* % %) (digits n))) (conj seen n))))))
