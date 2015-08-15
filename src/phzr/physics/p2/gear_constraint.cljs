(ns phzr.physics.p2.gear-constraint
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->GearConstraint
  "Connects two bodies at given offset points, letting them rotate relative to each other around this point.

  Parameters:
    * world (Phaser.Physics.P2) - A reference to the P2 World.
    * body-a (p2.Body) - First connected body.
    * body-b (p2.Body) - Second connected body.
    * angle (number) {optional} - The relative angle
    * ratio (number) {optional} - The gear ratio."
  ([world body-a body-b]
   (js/Phaser.Physics.P2.GearConstraint. (clj->phaser world)
                                         (clj->phaser body-a)
                                         (clj->phaser body-b)))
  ([world body-a body-b angle]
   (js/Phaser.Physics.P2.GearConstraint. (clj->phaser world)
                                         (clj->phaser body-a)
                                         (clj->phaser body-b)
                                         (clj->phaser angle)))
  ([world body-a body-b angle ratio]
   (js/Phaser.Physics.P2.GearConstraint. (clj->phaser world)
                                         (clj->phaser body-a)
                                         (clj->phaser body-b)
                                         (clj->phaser angle)
                                         (clj->phaser ratio))))

