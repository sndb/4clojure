;; Problem 98, Equivalence Classes
(fn [f domain]
  (set (map set (vals (group-by f domain)))))
