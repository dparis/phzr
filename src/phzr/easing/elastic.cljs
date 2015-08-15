(ns phzr.easing.elastic
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Elastic ease-in.

  Parameters:
    * elastic (Phaser.Easing.Elastic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([elastic k]
   (phaser->clj
    (.In elastic
         (clj->phaser k)))))

(defn in-out
  "Elastic ease-in/out.

  Parameters:
    * elastic (Phaser.Easing.Elastic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([elastic k]
   (phaser->clj
    (.InOut elastic
            (clj->phaser k)))))

(defn out
  "Elastic ease-out.

  Parameters:
    * elastic (Phaser.Easing.Elastic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([elastic k]
   (phaser->clj
    (.Out elastic
          (clj->phaser k)))))