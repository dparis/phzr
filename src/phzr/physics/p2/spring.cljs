(ns phzr.physics.p2.spring
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Spring
  "Creates a linear spring, connecting two bodies. A spring can have a resting length, a stiffness and damping.

  Parameters:
    * world (Phaser.Physics.P2) - A reference to the P2 World.
    * body-a (p2.Body) - First connected body.
    * body-b (p2.Body) - Second connected body.
    * rest-length (number) {optional} - Rest length of the spring. A number > 0.
    * stiffness (number) {optional} - Stiffness of the spring. A number >= 0.
    * damping (number) {optional} - Damping of the spring. A number >= 0.
    * world-a (Array) {optional} - Where to hook the spring to body A in world coordinates. This value is an array with 2 elements matching x and y, i.e: [32, 32].
    * world-b (Array) {optional} - Where to hook the spring to body B in world coordinates. This value is an array with 2 elements matching x and y, i.e: [32, 32].
    * local-a (Array) {optional} - Where to hook the spring to body A in local body coordinates. This value is an array with 2 elements matching x and y, i.e: [32, 32].
    * local-b (Array) {optional} - Where to hook the spring to body B in local body coordinates. This value is an array with 2 elements matching x and y, i.e: [32, 32]."
  ([world body-a body-b]
   (js/Phaser.Physics.P2.Spring. (clj->phaser world)
                                 (clj->phaser body-a)
                                 (clj->phaser body-b)))
  ([world body-a body-b rest-length]
   (js/Phaser.Physics.P2.Spring. (clj->phaser world)
                                 (clj->phaser body-a)
                                 (clj->phaser body-b)
                                 (clj->phaser rest-length)))
  ([world body-a body-b rest-length stiffness]
   (js/Phaser.Physics.P2.Spring. (clj->phaser world)
                                 (clj->phaser body-a)
                                 (clj->phaser body-b)
                                 (clj->phaser rest-length)
                                 (clj->phaser stiffness)))
  ([world body-a body-b rest-length stiffness damping]
   (js/Phaser.Physics.P2.Spring. (clj->phaser world)
                                 (clj->phaser body-a)
                                 (clj->phaser body-b)
                                 (clj->phaser rest-length)
                                 (clj->phaser stiffness)
                                 (clj->phaser damping)))
  ([world body-a body-b rest-length stiffness damping world-a]
   (js/Phaser.Physics.P2.Spring. (clj->phaser world)
                                 (clj->phaser body-a)
                                 (clj->phaser body-b)
                                 (clj->phaser rest-length)
                                 (clj->phaser stiffness)
                                 (clj->phaser damping)
                                 (clj->phaser world-a)))
  ([world body-a body-b rest-length stiffness damping world-a world-b]
   (js/Phaser.Physics.P2.Spring. (clj->phaser world)
                                 (clj->phaser body-a)
                                 (clj->phaser body-b)
                                 (clj->phaser rest-length)
                                 (clj->phaser stiffness)
                                 (clj->phaser damping)
                                 (clj->phaser world-a)
                                 (clj->phaser world-b)))
  ([world body-a body-b rest-length stiffness damping world-a world-b local-a]
   (js/Phaser.Physics.P2.Spring. (clj->phaser world)
                                 (clj->phaser body-a)
                                 (clj->phaser body-b)
                                 (clj->phaser rest-length)
                                 (clj->phaser stiffness)
                                 (clj->phaser damping)
                                 (clj->phaser world-a)
                                 (clj->phaser world-b)
                                 (clj->phaser local-a)))
  ([world body-a body-b rest-length stiffness damping world-a world-b local-a local-b]
   (js/Phaser.Physics.P2.Spring. (clj->phaser world)
                                 (clj->phaser body-a)
                                 (clj->phaser body-b)
                                 (clj->phaser rest-length)
                                 (clj->phaser stiffness)
                                 (clj->phaser damping)
                                 (clj->phaser world-a)
                                 (clj->phaser world-b)
                                 (clj->phaser local-a)
                                 (clj->phaser local-b))))

