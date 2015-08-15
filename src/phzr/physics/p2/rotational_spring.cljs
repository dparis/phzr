(ns phzr.physics.p2.rotational-spring
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->RotationalSpring
  "Creates a rotational spring, connecting two bodies. A spring can have a resting length, a stiffness and damping.

  Parameters:
    * world (Phaser.Physics.P2) - A reference to the P2 World.
    * body-a (p2.Body) - First connected body.
    * body-b (p2.Body) - Second connected body.
    * rest-angle (number) {optional} - The relative angle of bodies at which the spring is at rest. If not given, it's set to the current relative angle between the bodies.
    * stiffness (number) {optional} - Stiffness of the spring. A number >= 0.
    * damping (number) {optional} - Damping of the spring. A number >= 0."
  ([world body-a body-b]
   (js/Phaser.Physics.P2.RotationalSpring. (clj->phaser world)
                                           (clj->phaser body-a)
                                           (clj->phaser body-b)))
  ([world body-a body-b rest-angle]
   (js/Phaser.Physics.P2.RotationalSpring. (clj->phaser world)
                                           (clj->phaser body-a)
                                           (clj->phaser body-b)
                                           (clj->phaser rest-angle)))
  ([world body-a body-b rest-angle stiffness]
   (js/Phaser.Physics.P2.RotationalSpring. (clj->phaser world)
                                           (clj->phaser body-a)
                                           (clj->phaser body-b)
                                           (clj->phaser rest-angle)
                                           (clj->phaser stiffness)))
  ([world body-a body-b rest-angle stiffness damping]
   (js/Phaser.Physics.P2.RotationalSpring. (clj->phaser world)
                                           (clj->phaser body-a)
                                           (clj->phaser body-b)
                                           (clj->phaser rest-angle)
                                           (clj->phaser stiffness)
                                           (clj->phaser damping))))

