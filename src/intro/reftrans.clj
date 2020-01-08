(ns intro.reftrans)


(defn return-based-on-param [p]
  (> p 10))


(def mut-state (atom 0))

(defn return-based-on-state []
  (return-based-on-param (deref mut-state)))
