;; Problem 74, Filter Perfect Squares
(fn [s]
  (letfn [(perfect? [x]
            (= x (last (take-while #(<= % x) (map #(* % %) (range))))))]
    (->> (clojure.string/split s #",")
         (map js/parseInt)
         (filter perfect?)
         (interpose ",")
         (apply str))))
