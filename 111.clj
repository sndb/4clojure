(fn [word crossword]
  (let [rows (map #(remove #{\space} %) crossword)
        cols (apply map list rows)
        places (mapcat (fn [row]
                         (remove (comp #{\#} first)
                                 (partition-by #{\#} row)))
                       (concat rows cols))
        good? (fn [place]
                (and (= (count word) (count place))
                     (every? (fn [[w p]] (#{w \_} p))
                             (map vector word place))))]
    (boolean (some good? places))))
