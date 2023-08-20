;; Problem 108, Lazy Searching
(fn [& seqs]
  (loop [s seqs]
    (let [firsts (map first s)
          largest (apply max firsts)]
      (if (apply = firsts)
        (first firsts)
        (recur (map #(drop-while (partial > largest) %) s))))))
