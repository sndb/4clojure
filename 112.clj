;; Problem 112, Sequs Horribilis
(fn seqhor [n [a & b]]
  (cond
    (coll? a)
    (if-let [s (seq (seqhor n a))]
      (let [t (- n (apply + (flatten s)))]
        (cons s (seqhor t b))))
    (and (number? a) (<= a n))
    (cons a (seqhor (- n a) b))
    :else ()))
