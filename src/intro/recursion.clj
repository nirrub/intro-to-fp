(ns intro.recursion)


(def my-list (range 10))


(defn sum-square-vals-with-state []
  (let [state (atom 0)]
    (doseq [item my-list]
           (let [square-val (* item item)]
             (swap! state (fn [x] (+ x square-val)))))
    (deref state)))

(defn create-hash-map-with-state []
  (let [state (atom {})]
    (doseq [item my-list]
           (let [str-item (str item)]
             (swap! state (fn [x] (assoc x str-item item)))))
    (deref state)))

(defn sum-square-vals-with-fns []
  (let [squares-of-list (map (fn [x] (* x x)) my-list)
        sum-of-all (reduce + squares-of-list)]
    sum-of-all))

(defn create-hash-map-with-fns []
  (let [str-list (map str my-list)
        intermediate (interleave str-list my-list)
        result (apply hash-map intermediate)]
    (zipmap str-list my-list)))

(defn sum-square-vals-with-recursion []
  (loop [items my-list
         result 0]
        (if-not (seq items)
                result
                (let [first-val (first items)
                      square-val (* first-val first-val)]
                  (recur (rest items) (+ result square-val))))))


(defn create-hash-map-with-recursion []
  (loop [items my-list
         result {}]
        (if-not (seq items)
                result
                (let [first-val (first items)
                      str-val (str first-val)]
                  (recur (rest items) (assoc result str-val first-val))))))





