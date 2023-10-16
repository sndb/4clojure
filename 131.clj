;; Problem 131, Sum Some Set Subsets
(fn [& args]
  (letfn [(subsets [s]
            (when-let [[a & d] (seq s)]
              (let [ss (subsets d)]
                (cons #{a} (concat ss (map #(conj % a) ss))))))
          (summations [s]
            (set (map (partial apply +) (subsets s))))]
    (boolean (seq (apply clojure.set/intersection (map summations args))))))
