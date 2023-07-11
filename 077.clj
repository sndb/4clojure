;; Problem 77, Anagram Finder
(fn [words]
  (->> words
       (group-by sort)
       (vals)
       (filter #(> (count %) 1))
       (map set)
       (set)))
