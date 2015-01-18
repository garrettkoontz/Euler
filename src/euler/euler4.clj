(ns euler4)

(defn palindrom?
  [a]
  (let [b (str a)]
    (= b (clojure.string/reverse b))))

(def palindromes (lazy-seq (filter palindrom? (iterate inc 1))))

(defn palindromes-less-than
  [n]
  (into [] (take-while #(> n %) palindromes)))

(def three-digit-multiples
  (let [three-digits-list (range 100 1000)]
    (into #{} (for [x1 three-digits-list
                    x2 three-digits-list]
                (* x1 x2)))))

(def three-multiples-palindrom
  (into #{} (filter palindrom? three-digit-multiples)))

(def max-palindrom-multiple
  (apply max three-multiples-palindrome))

(def max-palindromes-three-digit-multiples
  (apply max (into three-digit-multiples (palindromes-less-than (* 999 999)))))
