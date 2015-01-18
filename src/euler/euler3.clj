(ns euler3
  (:require (clojure.math [numeric-tower :as math])))

(defn prime?
  [a]
  (empty? (filter #(zero? (mod a %)) (range 2 (math/sqrt (+ 1 a))))))

(def primes (cons 2 (lazy-seq (filter prime? (iterate (partial + 2) 3)))))

(defn primefactors
  [a]
  (filter #(zero? (mod a %)) (take-while #(>= (math/sqrt a) %) primes)))

(defn max-prime-factor
  [n]
  (apply max (primefactors n)))
