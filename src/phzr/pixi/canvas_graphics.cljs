(ns phzr.pixi.canvas-graphics
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->CanvasGraphics
  "A set of functions used by the canvas renderer to draw the primitive graphics data."
  ([]
   (js/PIXI.CanvasGraphics.)))

