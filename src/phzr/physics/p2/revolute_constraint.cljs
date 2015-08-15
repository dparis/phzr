(ns phzr.physics.p2.revolute-constraint
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->RevoluteConstraint
  "Connects two bodies at given offset points, letting them rotate relative to each other around this point.
  The pivot points are given in world (pixel) coordinates.

  Parameters:
    * world (Phaser.Physics.P2) - A reference to the P2 World.
    * body-a (p2.Body) - First connected body.
    * pivot-a (Float32Array) - The point relative to the center of mass of bodyA which bodyA is constrained to. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * body-b (p2.Body) - Second connected body.
    * pivot-b (Float32Array) - The point relative to the center of mass of bodyB which bodyB is constrained to. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * max-force (number) {optional} - The maximum force that should be applied to constrain the bodies.
    * world-pivot (Float32Array) {optional} - A pivot point given in world coordinates. If specified, localPivotA and localPivotB are automatically computed from this value."
  ([world body-a pivot-a body-b pivot-b]
   (js/Phaser.Physics.P2.RevoluteConstraint. (clj->phaser world)
                                             (clj->phaser body-a)
                                             (clj->phaser pivot-a)
                                             (clj->phaser body-b)
                                             (clj->phaser pivot-b)))
  ([world body-a pivot-a body-b pivot-b max-force]
   (js/Phaser.Physics.P2.RevoluteConstraint. (clj->phaser world)
                                             (clj->phaser body-a)
                                             (clj->phaser pivot-a)
                                             (clj->phaser body-b)
                                             (clj->phaser pivot-b)
                                             (clj->phaser max-force)))
  ([world body-a pivot-a body-b pivot-b max-force world-pivot]
   (js/Phaser.Physics.P2.RevoluteConstraint. (clj->phaser world)
                                             (clj->phaser body-a)
                                             (clj->phaser pivot-a)
                                             (clj->phaser body-b)
                                             (clj->phaser pivot-b)
                                             (clj->phaser max-force)
                                             (clj->phaser world-pivot))))

