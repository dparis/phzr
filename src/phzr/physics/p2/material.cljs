(ns phzr.physics.p2.material
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Material
  "A P2 Material.

  \\o/ ~ 'Because I'm a Material girl'

  Parameters:
    * name (string) - The user defined name given to this Material."
  ([name]
   (js/Phaser.Physics.P2.Material. (clj->phaser name))))

