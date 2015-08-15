(ns phzr.pixi.canvas-renderer
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->CanvasRenderer
  "The CanvasRenderer draws the Stage and all its content onto a 2d canvas. This renderer should be used for browsers that do not support webGL.
  Don't forget to add the CanvasRenderer.view to your DOM or you will not see anything :)

  Parameters:
    * width (Number) {optional} - the width of the canvas view
    * height (Number) {optional} - the height of the canvas view
    * options (Object) {optional} - The optional renderer parameters"
  ([]
   (js/PIXI.CanvasRenderer.))
  ([width]
   (js/PIXI.CanvasRenderer. (clj->phaser width)))
  ([width height]
   (js/PIXI.CanvasRenderer. (clj->phaser width)
                            (clj->phaser height)))
  ([width height options]
   (js/PIXI.CanvasRenderer. (clj->phaser width)
                            (clj->phaser height)
                            (clj->phaser options))))

(defn destroy
  "Removes everything from the renderer and optionally removes the Canvas DOM element.

  Parameters:
    * canvas-renderer (PIXI.CanvasRenderer) - Targeted instance for method
    * remove-view (Boolean) {optional} - Removes the Canvas element from the DOM."
  ([canvas-renderer]
   (phaser->clj
    (.destroy canvas-renderer)))
  ([canvas-renderer remove-view]
   (phaser->clj
    (.destroy canvas-renderer
              (clj->phaser remove-view)))))

(defn render
  "Renders the Stage to this canvas view

  Parameters:
    * canvas-renderer (PIXI.CanvasRenderer) - Targeted instance for method
    * stage (PIXI.Stage) - the Stage element to be rendered"
  ([canvas-renderer stage]
   (phaser->clj
    (.render canvas-renderer
             (clj->phaser stage)))))

(defn resize
  "Resizes the canvas view to the specified width and height

  Parameters:
    * canvas-renderer (PIXI.CanvasRenderer) - Targeted instance for method
    * width (Number) - the new width of the canvas view
    * height (Number) - the new height of the canvas view"
  ([canvas-renderer width height]
   (phaser->clj
    (.resize canvas-renderer
             (clj->phaser width)
             (clj->phaser height)))))