(ns phzr.component.angle
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Angle
  "The Angle Component provides access to an `angle` property; the rotation of a Game Object in degrees."
  ([]
   (js/Phaser.Component.Angle.)))

