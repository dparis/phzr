(ns phzr.easing.quartic
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Quartic ease-in.

  Parameters:
    * quartic (Phaser.Easing.Quartic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([quartic k]
   (phaser->clj
    (.In quartic
         (clj->phaser k)))))

(defn in-out
  "Quartic ease-in/out.

  Parameters:
    * quartic (Phaser.Easing.Quartic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([quartic k]
   (phaser->clj
    (.InOut quartic
            (clj->phaser k)))))

(defn out
  "Quartic ease-out.

  Parameters:
    * quartic (Phaser.Easing.Quartic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([quartic k]
   (phaser->clj
    (.Out quartic
          (clj->phaser k)))))