(ns testmap-reduce.test)

(defn square [n]
  (* n n))
  
(def n 500000)
  
;(square n)

(defn square-paralel [n]
  (map square (range 1 n)))

(defn sum-paralel [n]
  (reduce + (range 1 n)))



;(print(square-paralel n))
;(print(sq-iterative n))
