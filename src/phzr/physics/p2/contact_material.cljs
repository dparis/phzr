(ns phzr.physics.p2.contact-material
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->ContactMaterial
  "Defines a physics material

  Parameters:
    * material-a (Phaser.Physics.P2.Material) - First material participating in the contact material.
    * material-b (Phaser.Physics.P2.Material) - Second material participating in the contact material.
    * options (object) {optional} - Additional configuration options."
  ([material-a material-b]
   (js/Phaser.Physics.P2.ContactMaterial. (clj->phaser material-a)
                                          (clj->phaser material-b)))
  ([material-a material-b options]
   (js/Phaser.Physics.P2.ContactMaterial. (clj->phaser material-a)
                                          (clj->phaser material-b)
                                          (clj->phaser options))))

