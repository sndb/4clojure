;; Problem 94, Game of Life
(fn [board]
  (letfn [(alive? [cell] (= \# cell))
          (neighbors [board r c]
            (count
             (filter alive?
                     (for [dr (range -1 2)
                           dc (range -1 2)]
                       (when (not= dr dc 0)
                         (get-in board [(+ r dr) (+ c dc)]))))))
          (next-state [board r c]
            (if (alive? (get-in board [r c]))
              (#{2 3} (neighbors board r c))
              (= 3 (neighbors board r c))))]
    (let [rows (count board)
          cols (count (first board))]
      (map #(apply str %)
           (for [r (range rows)]
             (for [c (range cols)]
               (if (next-state board r c) \# \space)))))))
