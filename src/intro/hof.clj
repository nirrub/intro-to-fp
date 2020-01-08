(ns intro.hof)

(defn add [a b]
  (+ a b))

(defn work-on-pairs [f a b]
  (f a b))

(work-on-pairs add 1 2)
