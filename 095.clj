;; Problem 95, To Tree, or not to Tree
(fn tree?
  [x]
  (or (nil? x)
      (and (coll? x)
           (= 3 (count x))
           (tree? (nth x 1))
           (tree? (nth x 2)))))
