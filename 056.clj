;; Problem 56, Find Distinct Items
(fn [coll]
  (loop [[head & tail :as coll] coll
         seen #{}
         result []]
    (if (seq coll)
      (if (seen head)
        (recur tail seen result)
        (recur tail (conj seen head) (conj result head)))
      result)))
