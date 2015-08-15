(ns phzr.impl.utils.core)

(defn clj->phaser
  [x]
  (clj->js x))

(defn phaser->clj
  [x]
  (js->clj x))
