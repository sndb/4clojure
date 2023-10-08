;; Problem 122, Read a binary number
(fn [s]
  (apply + (map (fn [c e]
                  (if (= \1 c) e 0))
                (reverse s)
                (iterate #(* 2 %) 1))))
