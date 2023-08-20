;; Problem 106, Number Maze
(fn [n m]
  (loop [nums [n]
         steps 1]
    (if (some #{m} nums)
      steps
      (recur (distinct
              (mapcat #(cond-> [(* % 2) (+ % 2)]
                         (even? %) (conj (/ % 2)))
                      nums))
             (inc steps)))))
