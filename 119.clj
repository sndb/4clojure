;; Problem 119, Win at Tic-Tac-Toe
(fn [piece board]
  (let [transpose    (partial apply map vector)
        horizontals  identity
        verticals    transpose
        diagonals    (fn [board]
                       (transpose
                        (map (fn [i]
                               [(get-in board [i i])
                                (get-in board [i (- 2 i)])])
                             (range 3))))
        winner-row   (fn [row]
                       (first (#{#{:x} #{:o}} (set row))))
        winner-board (fn [board]
                       (some winner-row
                             (mapcat #(% board)
                                     [horizontals
                                      verticals
                                      diagonals])))]
    (set
     (for [i (range 3)
           j (range 3)
           :when (and (= :e (get-in board [i j]))
                      (winner-board (assoc-in board [i j] piece)))]
       [i j]))))
