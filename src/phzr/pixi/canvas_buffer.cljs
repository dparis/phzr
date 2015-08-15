(ns phzr.pixi.canvas-buffer
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->CanvasBuffer
  "Creates a Canvas element of the given size.

  Parameters:
    * width (Number) - the width for the newly created canvas
    * height (Number) - the height for the newly created canvas"
  ([width height]
   (js/PIXI.CanvasBuffer. (clj->phaser width)
                          (clj->phaser height))))

(defn resize
  "Resizes the canvas to the specified width and height.

  Parameters:
    * canvas-buffer (PIXI.CanvasBuffer) - Targeted instance for method
    * width (Number) - the new width of the canvas
    * height (Number) - the new height of the canvas"
  ([canvas-buffer width height]
   (phaser->clj
    (.resize canvas-buffer
             (clj->phaser width)
             (clj->phaser height)))))