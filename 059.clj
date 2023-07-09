;; Problem 59, Juxtaposition
(fn [& fs]
  (fn [& args]
    (map (fn [f] (apply f args)) fs)))
