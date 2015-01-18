(ns euler5)

(defn partial-mod
  [n]
  (partial (zero? (mod n))))

(filter (comp #(map partial-mod
                   (range 1 21)
                   )) (iterate inc 2520) )
