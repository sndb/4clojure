;; Problem 137, Digits and bases
(fn [n b]
  (loop [n n
         a []]
    (let [q (quot n b)
          r (rem n b)]
      (if (pos? n)
        (recur q (conj a r))
        (or (seq (reverse a)) (list 0))))))
