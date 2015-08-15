(ns phzr.physics.p2.prismatic-constraint
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->PrismaticConstraint
  "Connects two bodies at given offset points, letting them rotate relative to each other around this point.

  Parameters:
    * world (Phaser.Physics.P2) - A reference to the P2 World.
    * body-a (p2.Body) - First connected body.
    * body-b (p2.Body) - Second connected body.
    * lock-rotation (boolean) {optional} - If set to false, bodyB will be free to rotate around its anchor point.
    * anchor-a (Array) {optional} - Body A's anchor point, defined in its own local frame. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * anchor-b (Array) {optional} - Body A's anchor point, defined in its own local frame. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * axis (Array) {optional} - An axis, defined in body A frame, that body B's anchor point may slide along. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * max-force (number) {optional} - The maximum force that should be applied to constrain the bodies."
  ([world body-a body-b]
   (js/Phaser.Physics.P2.PrismaticConstraint. (clj->phaser world)
                                              (clj->phaser body-a)
                                              (clj->phaser body-b)))
  ([world body-a body-b lock-rotation]
   (js/Phaser.Physics.P2.PrismaticConstraint. (clj->phaser world)
                                              (clj->phaser body-a)
                                              (clj->phaser body-b)
                                              (clj->phaser lock-rotation)))
  ([world body-a body-b lock-rotation anchor-a]
   (js/Phaser.Physics.P2.PrismaticConstraint. (clj->phaser world)
                                              (clj->phaser body-a)
                                              (clj->phaser body-b)
                                              (clj->phaser lock-rotation)
                                              (clj->phaser anchor-a)))
  ([world body-a body-b lock-rotation anchor-a anchor-b]
   (js/Phaser.Physics.P2.PrismaticConstraint. (clj->phaser world)
                                              (clj->phaser body-a)
                                              (clj->phaser body-b)
                                              (clj->phaser lock-rotation)
                                              (clj->phaser anchor-a)
                                              (clj->phaser anchor-b)))
  ([world body-a body-b lock-rotation anchor-a anchor-b axis]
   (js/Phaser.Physics.P2.PrismaticConstraint. (clj->phaser world)
                                              (clj->phaser body-a)
                                              (clj->phaser body-b)
                                              (clj->phaser lock-rotation)
                                              (clj->phaser anchor-a)
                                              (clj->phaser anchor-b)
                                              (clj->phaser axis)))
  ([world body-a body-b lock-rotation anchor-a anchor-b axis max-force]
   (js/Phaser.Physics.P2.PrismaticConstraint. (clj->phaser world)
                                              (clj->phaser body-a)
                                              (clj->phaser body-b)
                                              (clj->phaser lock-rotation)
                                              (clj->phaser anchor-a)
                                              (clj->phaser anchor-b)
                                              (clj->phaser axis)
                                              (clj->phaser max-force))))

