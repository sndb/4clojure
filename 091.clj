;; Problem 91, Graph Connectivity
(fn [graph]
  (loop [vertices (set (first graph))
         edges graph]
    (if-let [edge (some (fn [edge]
                          (and (or (vertices (first edge))
                                   (vertices (second edge)))
                               edge))
                        edges)]
      (recur (apply conj vertices edge) (disj edges edge))
      (empty? edges))))
