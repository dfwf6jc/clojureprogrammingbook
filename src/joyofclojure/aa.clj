(ns joyofclojure.aa)

; Scalar type "Rationals"
; to store rational numbers
22/7

;; Symbols in clojure are objects in their own right

(def vijay "rocks")

(def meaning_of_life 23)

; Keywords are similar to symbols except that they evaluate to themselves

; Clojure characters are written with a literal syntax prefixed by a backslash

(def first_letter_in_english_language \a)

; anonymous functions

(fn [x y]
  (println "Making a set")
  #{x y})

((fn [x y]
   (println "Making a set")
   #{x y}) 1 2)


; named functions

(def make-set
  (fn [x y]
    (println "Making a set")
    #{x y}))

; functions using the defn macro

(defn make-set2
  [x y]
  (println "Making a set")
  #{x y})