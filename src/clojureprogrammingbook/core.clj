(ns clojureprogrammingbook.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


; def to define a variable.
(def x 1)


; #_() to write form-level comments
(+ 1 3 4 #_(* 2 3) 5)

; this command prints the namespace
*ns*

; to change the namespace to abc
(ns abc)

; homoiconicity means to represent code as data

(type 1)
(type 1.1)
(type "vijay")
(type true)

(type :a)
(type 'a)

(type (list 1 2 3))
(type '(1 2 3))
(= (list 1 2 3) '(1 2 3))
(type (vector 1 2 3))
(type [1 2 3])
(type (hash-map :a 1 :b 2 :c 3))
(type #{1 2 3})

; apply seems to be a function which takes 2 argument -
; a function and a vector. it applies the function to the vectors
(apply / [1 2 3])



(defn avg [numbers]
  (/ (apply + numbers) (count numbers)))

; quote supresses evaluation
(quote (+ 1 3))

(type (quote (+ 1 2 3)))
(type (+ 1 2 3))
