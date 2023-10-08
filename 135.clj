;; Problem 135, Infix Calculator
(fn calc [x f y & args]
  (let [r (f x y)]
    (if (seq args)
      (apply calc r args)
      r)))
