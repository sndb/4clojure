;; Problem 195, Parentheses... Again
(fn parens
  ([n] (parens n 0))
  ([open close]
   (if (zero? open)
     #{(apply str (repeat close ")"))}
     (clojure.set/union
      (set (map #(str "(" %) (parens (dec open) (inc close))))
      (when (pos? close)
        (set (map #(str ")" %) (parens open (dec close)))))))))
