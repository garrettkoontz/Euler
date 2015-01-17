(ns euler3
  (:require [clojure.math.numeric-tower :refer [sqrt] :as math] :reload))

(defn primefactors
  [a]
  (primefactors a 2)
  [a n]
  (if (< n 2) (primefactors a)
      (take 1 (filter #(= 0 (mod a %)) (range ()))))
  )

(defn prime?
  [a]
  (empty? (filter #(mod a %) (range (math/sqrt a)))))
