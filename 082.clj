;; Problem 82, Word Chains
(fn [coll]
  (letfn [(insert-everywhere [x coll]
            (if (seq coll)
              (conj (map #(cons (first coll) %) (insert-everywhere x (rest coll)))
                    (cons x coll))
              [[x]]))
          (permutations [coll]
            (if (seq (rest coll))
              (mapcat (fn [p] (insert-everywhere (first coll) p)) (permutations (rest coll)))
              [coll]))
          (substitution? [s1 s2]
            (= 1 (count (filter false? (map = s1 s2)))))
          (insertion? [s1 s2]
            (if (= (first s1) (first s2))
              (recur (rest s1) (rest s2))
              (= (rest (max-key count s1 s2))
                 (min-key count s1 s2))))
          (similar? [s1 s2]
            (cond
              (#{1 -1} (- (count s1) (count s2))) (insertion? s1 s2)
              (= (count s1) (count s2)) (substitution? s1 s2)))
          (valid-chain? [[a & chain]]
            (if (seq chain)
              (and (similar? (seq a) (seq (first chain)))
                   (recur chain))
              true))]
    (true? (some valid-chain? (permutations coll)))))
