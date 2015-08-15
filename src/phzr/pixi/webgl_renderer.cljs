(ns phzr.pixi.webgl-renderer
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->WebGLRenderer
  "The WebGLRenderer draws the stage and all its content onto a webGL enabled canvas. This renderer
  should be used for browsers that support webGL. This Render works by automatically managing webGLBatchs.
  So no need for Sprite Batches or Sprite Clouds.
  Don't forget to add the view to your DOM or you will not see anything :)

  Parameters:
    * width (Number) {optional} - the width of the canvas view
    * height (Number) {optional} - the height of the canvas view
    * options (Object) {optional} - The optional renderer parameters"
  ([]
   (js/PIXI.WebGLRenderer.))
  ([width]
   (js/PIXI.WebGLRenderer. (clj->phaser width)))
  ([width height]
   (js/PIXI.WebGLRenderer. (clj->phaser width)
                           (clj->phaser height)))
  ([width height options]
   (js/PIXI.WebGLRenderer. (clj->phaser width)
                           (clj->phaser height)
                           (clj->phaser options))))

(defn destroy
  "Removes everything from the renderer (event listeners, spritebatch, etc...)"
  ([webgl-renderer]
   (phaser->clj
    (.destroy webgl-renderer))))

(defn init-context
  ""
  ([webgl-renderer]
   (phaser->clj
    (.initContext webgl-renderer))))

(defn map-blend-modes
  "Maps Pixi blend modes to WebGL blend modes."
  ([webgl-renderer]
   (phaser->clj
    (.mapBlendModes webgl-renderer))))

(defn render
  "Renders the stage to its webGL view

  Parameters:
    * webgl-renderer (PIXI.WebGLRenderer) - Targeted instance for method
    * stage (PIXI.Stage) - the Stage element to be rendered"
  ([webgl-renderer stage]
   (phaser->clj
    (.render webgl-renderer
             (clj->phaser stage)))))

(defn render-display-object
  "Renders a Display Object.

  Parameters:
    * webgl-renderer (PIXI.WebGLRenderer) - Targeted instance for method
    * display-object (PIXI.DisplayObject) - The DisplayObject to render
    * projection (Point) - The projection
    * buffer (Array) - a standard WebGL buffer"
  ([webgl-renderer display-object projection buffer]
   (phaser->clj
    (.renderDisplayObject webgl-renderer
                          (clj->phaser display-object)
                          (clj->phaser projection)
                          (clj->phaser buffer)))))

(defn resize
  "Resizes the webGL view to the specified width and height.

  Parameters:
    * webgl-renderer (PIXI.WebGLRenderer) - Targeted instance for method
    * width (Number) - the new width of the webGL view
    * height (Number) - the new height of the webGL view"
  ([webgl-renderer width height]
   (phaser->clj
    (.resize webgl-renderer
             (clj->phaser width)
             (clj->phaser height)))))

(defn update-texture
  "Updates and Creates a WebGL texture for the renderers context.

  Parameters:
    * webgl-renderer (PIXI.WebGLRenderer) - Targeted instance for method
    * texture (PIXI.Texture) - the texture to update"
  ([webgl-renderer texture]
   (phaser->clj
    (.updateTexture webgl-renderer
                    (clj->phaser texture)))))