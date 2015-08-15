(ns phzr.component.in-world
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->InWorld
  "The InWorld component checks if a Game Object is within the Game World Bounds.
  An object is considered as being 'in bounds' so long as its own bounds intersects at any point with the World bounds.
  If the AutoCull component is enabled on the Game Object then it will check the Game Object against the Camera bounds as well."
  ([]
   (js/Phaser.Component.InWorld.)))

(defn pre-update-
  "The InWorld component preUpdate handler.
  Called automatically by the Game Object."
  ([]
   (phaser->clj
    (.preUpdate js/Phaser.Component.InWorld))))