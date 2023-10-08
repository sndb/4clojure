;; Problem 120, Sum of square of digits
(fn [s]
  (letfn [(digits [n]
            (when (pos? n)
              (cons (rem n 10)
                    (digits (quot n 10)))))
          (sum-squared [n]
            (apply + (map #(* % %) (digits n))))]
    (count (filter #(< % (sum-squared %)) s))))
