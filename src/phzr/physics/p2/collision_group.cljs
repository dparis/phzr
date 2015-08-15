(ns phzr.physics.p2.collision-group
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->CollisionGroup
  "Collision Group

  Parameters:
    * bitmask (number) - The CollisionGroup bitmask."
  ([bitmask]
   (js/Phaser.Physics.P2.CollisionGroup. (clj->phaser bitmask))))

