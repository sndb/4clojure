;; Problem 78, Reimplement Trampoline
(fn my-trampoline
  ([f] (if (fn? f) (recur (f)) f))
  ([f & args] (my-trampoline (apply f args))))
