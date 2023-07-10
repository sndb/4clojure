;; Problem 70, Word Sorting
#(sort-by clojure.string/lower-case
          (map (fn [word] (apply str (re-seq #"\w" word)))
               (clojure.string/split % #"\s")))
