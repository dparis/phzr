(ns phzr.component.physics-body
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->PhysicsBody
  "The PhysicsBody component manages the Game Objects physics body and physics enabling.
  It also overrides the x and y properties, ensuring that any manual adjustment of them is reflected in the physics body itself."
  ([]
   (js/Phaser.Component.PhysicsBody.)))

(defn post-update-
  "The PhysicsBody component postUpdate handler.
  Called automatically by the Game Object."
  ([]
   (phaser->clj
    (.postUpdate js/Phaser.Component.PhysicsBody))))

(defn pre-update-
  "The PhysicsBody component preUpdate handler.
  Called automatically by the Game Object."
  ([]
   (phaser->clj
    (.preUpdate js/Phaser.Component.PhysicsBody))))