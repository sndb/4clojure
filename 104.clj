;; Problem 104, Write Roman Numerals
(fn roman [n]
  (let [values [[1000 "M"] [900 "CM"]
                [500 "D"] [400 "CD"]
                [100 "C"] [90 "XC"]
                [50 "L"] [40 "XL"]
                [10 "X"] [9 "IX"]
                [5 "V"] [4 "IV"]
                [1 "I"]]]
    (if-let [[m v] (some (fn [[x :as p]] (and (>= n x) p)) values)]
      (str v (roman (- n m)))
      "")))
