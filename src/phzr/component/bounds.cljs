(ns phzr.component.bounds
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Bounds
  "The Bounds component contains properties related to the bounds of the Game Object."
  ([]
   (js/Phaser.Component.Bounds.)))

