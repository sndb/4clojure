;; Problem 177, Balancing Brackets
(fn [s]
  (let [pair {\( \), \[ \], \{ \}}
        open (set (keys pair))
        close (set (vals pair))]
    (loop [[c & d] s
           b (list)]
      (cond
        (not c) (empty? b)
        (open c) (recur d (cons (pair c) b))
        (close c) (and (= c (first b)) (recur d (rest b)))
        :else (recur d b)))))
