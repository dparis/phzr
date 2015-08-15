(ns phzr.easing.back
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Back ease-in.

  Parameters:
    * back (Phaser.Easing.Back) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([back k]
   (phaser->clj
    (.In back
         (clj->phaser k)))))

(defn in-out
  "Back ease-in/out.

  Parameters:
    * back (Phaser.Easing.Back) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([back k]
   (phaser->clj
    (.InOut back
            (clj->phaser k)))))

(defn out
  "Back ease-out.

  Parameters:
    * back (Phaser.Easing.Back) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([back k]
   (phaser->clj
    (.Out back
          (clj->phaser k)))))