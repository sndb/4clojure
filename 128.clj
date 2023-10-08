;; Problem 128, Recognize Playing Cards
(fn [[suit rank]]
  (let [ranks (zipmap [\2 \3 \4 \5 \6 \7 \8 \9 \T \J \Q \K \A] (range))
        suits {\S :spade \H :heart \D :diamond \C :club}]
    {:rank (ranks rank)
     :suit (suits suit)}))
