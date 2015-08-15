(ns phzr.component.in-camera
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->InCamera
  "The InCamera component checks if the Game Object intersects with the Game Camera."
  ([]
   (js/Phaser.Component.InCamera.)))

