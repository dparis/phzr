(ns phzr.easing.sinusoidal
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Sinusoidal ease-in.

  Parameters:
    * sinusoidal (Phaser.Easing.Sinusoidal) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([sinusoidal k]
   (phaser->clj
    (.In sinusoidal
         (clj->phaser k)))))

(defn in-out
  "Sinusoidal ease-in/out.

  Parameters:
    * sinusoidal (Phaser.Easing.Sinusoidal) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([sinusoidal k]
   (phaser->clj
    (.InOut sinusoidal
            (clj->phaser k)))))

(defn out
  "Sinusoidal ease-out.

  Parameters:
    * sinusoidal (Phaser.Easing.Sinusoidal) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([sinusoidal k]
   (phaser->clj
    (.Out sinusoidal
          (clj->phaser k)))))