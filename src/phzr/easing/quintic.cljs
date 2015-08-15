(ns phzr.easing.quintic
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn in
  "Quintic ease-in.

  Parameters:
    * quintic (Phaser.Easing.Quintic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([quintic k]
   (phaser->clj
    (.In quintic
         (clj->phaser k)))))

(defn in-out
  "Quintic ease-in/out.

  Parameters:
    * quintic (Phaser.Easing.Quintic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([quintic k]
   (phaser->clj
    (.InOut quintic
            (clj->phaser k)))))

(defn out
  "Quintic ease-out.

  Parameters:
    * quintic (Phaser.Easing.Quintic) - Targeted instance for method
    * k (number) - The value to be tweened.

  Returns:  number - The tweened value."
  ([quintic k]
   (phaser->clj
    (.Out quintic
          (clj->phaser k)))))