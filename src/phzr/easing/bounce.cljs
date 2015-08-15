(ns phzr.easing.bounce
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Bounce ease-in.

  Parameters:
    * bounce (Phaser.Easing.Bounce) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([bounce k]
   (phaser->clj
    (.In bounce
         (clj->phaser k)))))

(defn in-out
  "Bounce ease-in/out.

  Parameters:
    * bounce (Phaser.Easing.Bounce) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([bounce k]
   (phaser->clj
    (.InOut bounce
            (clj->phaser k)))))

(defn out
  "Bounce ease-out.

  Parameters:
    * bounce (Phaser.Easing.Bounce) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([bounce k]
   (phaser->clj
    (.Out bounce
          (clj->phaser k)))))