;; Problem 26, Fibonacci Sequence
#(take % ((fn fib [n m] (cons n (lazy-seq (fib m (+ n m))))) 1 1))
