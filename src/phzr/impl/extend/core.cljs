(ns phzr.impl.extend.core
  (:require [phzr.core :refer [IPhaserObj]]
            [phzr.impl.utils.js :as uj]))


(enable-console-print!)

(defn ^:private phaser-set!
  [o k set-properties v]
  (if-let [kstr (get set-properties k)]
    (aset o kstr v)
    (js/console.log
     (str "Attempted to set read-only property "
          (name k)
          " for Phaser object."))))

(defn ^:private phaser-get
  [o k get-properties not-found]
  (if-let [kstr (get get-properties k)]
    (if-let [v (aget o kstr)]
      v
      not-found)
    not-found))

(defn extend-phaser-class
  [phaser-class get-properties set-properties constants]
  (let [get-keys     (set (keys get-properties))
        set-keys     (set (keys set-properties))
        get-set-keys (set (concat get-keys set-keys))]
    (if-not (aget phaser-class "prototype")
      (println "WARNING: ATTEMPTING TO EXTEND NATIVE JS OBJECT" phaser-class)
      (extend-type phaser-class
        IPhaserObj
        (pset! [o k v]
          (phaser-set! o k set-properties v))

        ISeqable
        (-seq [o]
          (map (fn [k] [k (get o k)]) get-set-keys))

        ILookup
        (-lookup
          ([o k] (-lookup o k nil))
          ([o k nf] (phaser-get o k get-properties nf)))))))
