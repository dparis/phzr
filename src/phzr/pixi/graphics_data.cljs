(ns phzr.pixi.graphics-data
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->GraphicsData
  "A GraphicsData object."
  ([]
   (js/PIXI.GraphicsData.)))

