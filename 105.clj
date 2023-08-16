;; Problem 105, Identify keys and values
(fn [s]
  (loop [result {}
         [k & numbers] s]
    (if k
      (let [[v remaining] (split-with number? numbers)]
        (recur (assoc result k v) remaining))
      result)))
