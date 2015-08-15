(ns phzr.easing.linear
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn none
  "Linear Easing (no variation).

  Parameters:
    * linear (Phaser.Easing.Linear) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - k."
  ([linear k]
   (phaser->clj
    (.None linear
           (clj->phaser k)))))