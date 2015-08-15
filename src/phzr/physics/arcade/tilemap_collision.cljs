(ns phzr.physics.arcade.tilemap-collision
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->TilemapCollision
  "The Arcade Physics tilemap collision methods.

  Parameters:
    * game (Phaser.Game) - reference to the current game instance."
  ([game]
   (js/Phaser.Physics.Arcade.TilemapCollision. (clj->phaser game))))

