(ns phzr.physics.p2.point-proxy
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->PointProxy
  "A PointProxy is an internal class that allows for direct getter/setter style property access to Arrays and TypedArrays.

  Parameters:
    * world (Phaser.Physics.P2) - A reference to the P2 World.
    * destination (any) - The object to bind to."
  ([world destination]
   (js/Phaser.Physics.P2.PointProxy. (clj->phaser world)
                                     (clj->phaser destination))))

