;; Problem 97, Pascal's Triangle
(fn pascal [n]
  (if (= 1 n)
    [1]
    (concat [1]
            (map (partial apply +)
                 (partition 2 1 (pascal (dec n))))
            [1])))
