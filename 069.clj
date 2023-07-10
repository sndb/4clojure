;; Problem 69, Merge with a Function
(fn [f & maps]
  (reduce (fn [a b]
            (reduce (fn [a [k v]]
                      (if (contains? a k)
                        (update a k f v)
                        (assoc a k v)))
                    a b))
          maps))
