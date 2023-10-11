;; Problem 156, Map Defaults
(fn [v ks]
  (reduce (fn [m k] (assoc m k v)) {} ks))
