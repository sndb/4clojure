;; Problem 121, Universal Computation Engine
(fn [f]
  (fn [m]
    (letfn [(rsub [coll m]
              (map (fn [x]
                     (if (coll? x)
                       (rsub x m)
                       (or (m x) x)))
                   coll))]
      (eval (rsub f m)))))
