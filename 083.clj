;; Problem 83, A Half-Truth
(fn [& args]
  (boolean
   (and (some true? args)
        (some false? args))))
