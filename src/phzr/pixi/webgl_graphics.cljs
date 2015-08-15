(ns phzr.pixi.webgl-graphics
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->WebGLGraphics
  "A set of functions used by the webGL renderer to draw the primitive graphics data"
  ([]
   (js/PIXI.WebGLGraphics.)))

