;; Problem 144, Oscilrate
(fn [x & fs]
  (reductions (fn [a f] (f a)) x (cycle fs)))
