(ns phzr.easing.exponential
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Exponential ease-in.

  Parameters:
    * exponential (Phaser.Easing.Exponential) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([exponential k]
   (phaser->clj
    (.In exponential
         (clj->phaser k)))))

(defn in-out
  "Exponential ease-in/out.

  Parameters:
    * exponential (Phaser.Easing.Exponential) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([exponential k]
   (phaser->clj
    (.InOut exponential
            (clj->phaser k)))))

(defn out
  "Exponential ease-out.

  Parameters:
    * exponential (Phaser.Easing.Exponential) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([exponential k]
   (phaser->clj
    (.Out exponential
          (clj->phaser k)))))