(ns phzr.physics.p2.lock-constraint
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->LockConstraint
  "Locks the relative position between two bodies.

  Parameters:
    * world (Phaser.Physics.P2) - A reference to the P2 World.
    * body-a (p2.Body) - First connected body.
    * body-b (p2.Body) - Second connected body.
    * offset (Array) {optional} - The offset of bodyB in bodyA's frame. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * angle (number) {optional} - The angle of bodyB in bodyA's frame.
    * max-force (number) {optional} - The maximum force that should be applied to constrain the bodies."
  ([world body-a body-b]
   (js/Phaser.Physics.P2.LockConstraint. (clj->phaser world)
                                         (clj->phaser body-a)
                                         (clj->phaser body-b)))
  ([world body-a body-b offset]
   (js/Phaser.Physics.P2.LockConstraint. (clj->phaser world)
                                         (clj->phaser body-a)
                                         (clj->phaser body-b)
                                         (clj->phaser offset)))
  ([world body-a body-b offset angle]
   (js/Phaser.Physics.P2.LockConstraint. (clj->phaser world)
                                         (clj->phaser body-a)
                                         (clj->phaser body-b)
                                         (clj->phaser offset)
                                         (clj->phaser angle)))
  ([world body-a body-b offset angle max-force]
   (js/Phaser.Physics.P2.LockConstraint. (clj->phaser world)
                                         (clj->phaser body-a)
                                         (clj->phaser body-b)
                                         (clj->phaser offset)
                                         (clj->phaser angle)
                                         (clj->phaser max-force))))

