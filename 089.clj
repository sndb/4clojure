;; Problem 89, Graph Tour
(fn graph-tour
  ([g]
   (let [all-vs (set (apply concat g))
         norm-g (frequencies (map sort g))]
     (true? (some (partial graph-tour norm-g) all-vs))))
  ([g curr-v]
   (letfn [(remove-edge [e]
             (if (= 1 (g e))
               (dissoc g e)
               (update g e dec)))
           (visit [v]
             (graph-tour (remove-edge (sort [curr-v v])) v))]
     (if-let [next-vs (seq
                       (filter
                        some?
                        (map #(condp = curr-v
                                (first %) (second %)
                                (second %) (first %)
                                nil)
                             (keys g))))]
       (some visit next-vs)
       (empty? g)))))
