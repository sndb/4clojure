;; Problem 73, Analyze a Tic-Tac-Toe Board
(fn [board]
  (let [winning-row     (fn [row] (first (#{#{:x} #{:o}} (set row))))
        transpose-board (partial apply map vector)
        horizontal-rows board
        vertical-rows   (transpose-board board)
        size            (count board)
        diagonal-rows   (transpose-board
                         (map (fn [x] [(get-in board [x x])
                                       (get-in board [x (- size 1 x)])])
                              (range size)))]
    (some winning-row
          (concat vertical-rows
                  horizontal-rows
                  diagonal-rows))))
