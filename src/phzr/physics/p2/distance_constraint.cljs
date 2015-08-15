(ns phzr.physics.p2.distance-constraint
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->DistanceConstraint
  "A constraint that tries to keep the distance between two bodies constant.

  Parameters:
    * world (Phaser.Physics.P2) - A reference to the P2 World.
    * body-a (p2.Body) - First connected body.
    * body-b (p2.Body) - Second connected body.
    * distance (number) - The distance to keep between the bodies.
    * local-anchor-a (Array) {optional} - The anchor point for bodyA, defined locally in bodyA frame. Defaults to [0,0].
    * local-anchor-b (Array) {optional} - The anchor point for bodyB, defined locally in bodyB frame. Defaults to [0,0].
    * max-force (object) {optional} - Maximum force to apply."
  ([world body-a body-b distance]
   (js/Phaser.Physics.P2.DistanceConstraint. (clj->phaser world)
                                             (clj->phaser body-a)
                                             (clj->phaser body-b)
                                             (clj->phaser distance)))
  ([world body-a body-b distance local-anchor-a]
   (js/Phaser.Physics.P2.DistanceConstraint. (clj->phaser world)
                                             (clj->phaser body-a)
                                             (clj->phaser body-b)
                                             (clj->phaser distance)
                                             (clj->phaser local-anchor-a)))
  ([world body-a body-b distance local-anchor-a local-anchor-b]
   (js/Phaser.Physics.P2.DistanceConstraint. (clj->phaser world)
                                             (clj->phaser body-a)
                                             (clj->phaser body-b)
                                             (clj->phaser distance)
                                             (clj->phaser local-anchor-a)
                                             (clj->phaser local-anchor-b)))
  ([world body-a body-b distance local-anchor-a local-anchor-b max-force]
   (js/Phaser.Physics.P2.DistanceConstraint. (clj->phaser world)
                                             (clj->phaser body-a)
                                             (clj->phaser body-b)
                                             (clj->phaser distance)
                                             (clj->phaser local-anchor-a)
                                             (clj->phaser local-anchor-b)
                                             (clj->phaser max-force))))

