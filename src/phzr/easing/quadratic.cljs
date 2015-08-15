(ns phzr.easing.quadratic
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Ease-in.

  Parameters:
    * quadratic (Phaser.Easing.Quadratic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - k^2."
  ([quadratic k]
   (phaser->clj
    (.In quadratic
         (clj->phaser k)))))

(defn in-out
  "Ease-in/out.

  Parameters:
    * quadratic (Phaser.Easing.Quadratic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([quadratic k]
   (phaser->clj
    (.InOut quadratic
            (clj->phaser k)))))

(defn out
  "Ease-out.

  Parameters:
    * quadratic (Phaser.Easing.Quadratic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - k* (2-k)."
  ([quadratic k]
   (phaser->clj
    (.Out quadratic
          (clj->phaser k)))))