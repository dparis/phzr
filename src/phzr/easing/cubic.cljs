(ns phzr.easing.cubic
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Cubic ease-in.

  Parameters:
    * cubic (Phaser.Easing.Cubic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([cubic k]
   (phaser->clj
    (.In cubic
         (clj->phaser k)))))

(defn in-out
  "Cubic ease-in/out.

  Parameters:
    * cubic (Phaser.Easing.Cubic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([cubic k]
   (phaser->clj
    (.InOut cubic
            (clj->phaser k)))))

(defn out
  "Cubic ease-out.

  Parameters:
    * cubic (Phaser.Easing.Cubic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([cubic k]
   (phaser->clj
    (.Out cubic
          (clj->phaser k)))))