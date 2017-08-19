(ns exercise3)

(defn fibonacci
  "Get the number at the position x of the Fibonacci sequence"
  [x]
  (if (zero? x) 0 (if (= x 1) 1 (+ (fibonacci (dec x)) (fibonacci (- x 2)))))
  )