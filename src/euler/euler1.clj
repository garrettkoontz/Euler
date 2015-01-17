(ns euler1)

(defn euler1
  [a]
  (reduce + (into #{} (flatten
                       (conj (filter #(= 0 (mod % 3)) (range a))
                             (filter #(= 0 (mod % 5)) (range a)))))))
