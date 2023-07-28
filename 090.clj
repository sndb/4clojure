;; Problem 90, Cartesian Product
#(set (mapcat (fn [x] (map (fn [y] [x y]) %2)) %1))
