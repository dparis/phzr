(ns phzr.easing.circular
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Circular ease-in.

  Parameters:
    * circular (Phaser.Easing.Circular) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([circular k]
   (phaser->clj
    (.In circular
         (clj->phaser k)))))

(defn in-out
  "Circular ease-in/out.

  Parameters:
    * circular (Phaser.Easing.Circular) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([circular k]
   (phaser->clj
    (.InOut circular
            (clj->phaser k)))))

(defn out
  "Circular ease-out.

  Parameters:
    * circular (Phaser.Easing.Circular) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([circular k]
   (phaser->clj
    (.Out circular
          (clj->phaser k)))))