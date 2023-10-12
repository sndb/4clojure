;; Problem 147, Pascal's Trapezoid
(fn pascal [ns]
  (let [ms (concat [(first ns)]
                   (map + ns (rest ns))
                   [(last ns)])]
    (cons ns (lazy-seq (pascal ms)))))
