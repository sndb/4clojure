;; Problem 96, Beauty is Symmetry
(fn [[root left right]]
  (letfn [(rev [[root left right :as tree]]
            (when (seq tree)
              (list root (rev right) (rev left))))]
    (= left (rev right))))
