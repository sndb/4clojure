;; Problem 41, Drop Every Nth Item
(fn [coll n] (keep-indexed (fn [i v] (if-not (= (dec n) (rem i n)) v)) coll))
