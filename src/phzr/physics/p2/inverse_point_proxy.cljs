(ns phzr.physics.p2.inverse-point-proxy
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->InversePointProxy
  "A InversePointProxy is an internal class that allows for direct getter/setter style property access to Arrays and TypedArrays but inverses the values on set.

  Parameters:
    * world (Phaser.Physics.P2) - A reference to the P2 World.
    * destination (any) - The object to bind to."
  ([world destination]
   (js/Phaser.Physics.P2.InversePointProxy. (clj->phaser world)
                                            (clj->phaser destination))))

