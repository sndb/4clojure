;; Problem 146, Trees into tables
#(into {} (for [[k v] %
                [l w] v]
            [[k l] w]))
