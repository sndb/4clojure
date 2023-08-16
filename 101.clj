;; Problem 101, Levenshtein Distance
(fn levenshtein
  [a b]
  (cond
    (zero? (count a)) (count b)
    (zero? (count b)) (count a)
    (= (first a) (first b)) (levenshtein (rest a) (rest b))
    :else (inc (min (levenshtein a (rest b))
                    (levenshtein (rest a) b)
                    (levenshtein (rest a) (rest b))))))
