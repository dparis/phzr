(ns phzr.impl.utils.core
  (:require [camel-snake-kebab.core :as csk]))


(def name->kebab-keyword
  (memoize
   (fn [s]
     (csk/->kebab-case-keyword s))))

(defn ^:private js->clj*
  [x]
  (let [keyfn name->kebab-keyword
        f     (fn thisfn [x]
                (cond
                  (satisfies? IEncodeClojure x)
                  (-js->clj x nil)

                  (seq? x)
                  (doall (map thisfn x))

                  (coll? x)
                  (into (empty x) (map thisfn) x)

                  (array? x)
                  (persistent!
                   (reduce #(conj! %1 (thisfn %2))
                           (transient []) x))

                  (identical? (type x) js/Object)
                  (persistent!
                   (reduce (fn [r k] (assoc! r (keyfn k) (thisfn (aget x k))))
                           (transient {}) (js-keys x)))

                  :else x))]
    (f x)))

(defn clj->phaser
  [x]
  (clj->js x))

(defn phaser->clj
  [x]
  (js->clj* x))
