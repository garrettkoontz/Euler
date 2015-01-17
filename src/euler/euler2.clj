(ns euler2)

(defn fibseq
  [a b]
  (cons a (lazy-seq (fibseq b (+ b a)))))


(defn euler2
  [a]
  (reduce + (filter even? (take-while (partial > a) (fibseq 0 1)))))
