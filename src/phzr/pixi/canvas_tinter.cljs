(ns phzr.pixi.canvas-tinter
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->CanvasTinter
  "Utility methods for Sprite/Texture tinting."
  ([]
   (js/PIXI.CanvasTinter.)))

(defn check-inverse-alpha-
  "Checks if the browser correctly supports putImageData alpha channels."
  ([]
   (phaser->clj
    (.checkInverseAlpha js/PIXI.CanvasTinter))))

(defn get-tinted-texture-
  "Basically this method just needs a sprite and a color and tints the sprite with the given color.

  Parameters:
    * sprite (PIXI.Sprite) - the sprite to tint
    * color (Number) - the color to use to tint the sprite with

  Returns:  HTMLCanvasElement - The tinted canvas"
  ([sprite color]
   (phaser->clj
    (.getTintedTexture js/PIXI.CanvasTinter
                       (clj->phaser sprite)
                       (clj->phaser color)))))

(defn tint-method-
  "The tinting method that will be used."
  ([]
   (phaser->clj
    (.tintMethod js/PIXI.CanvasTinter))))

(defn tint-per-pixel-
  "Tint a texture pixel per pixel.

  Parameters:
    * texture (PIXI.Texture) - the texture to tint
    * color (Number) - the color to use to tint the sprite with
    * canvas (HTMLCanvasElement) - the current canvas"
  ([texture color canvas]
   (phaser->clj
    (.tintPerPixel js/PIXI.CanvasTinter
                   (clj->phaser texture)
                   (clj->phaser color)
                   (clj->phaser canvas)))))

(defn tint-with-multiply-
  "Tint a texture using the 'multiply' operation.

  Parameters:
    * texture (PIXI.Texture) - the texture to tint
    * color (Number) - the color to use to tint the sprite with
    * canvas (HTMLCanvasElement) - the current canvas"
  ([texture color canvas]
   (phaser->clj
    (.tintWithMultiply js/PIXI.CanvasTinter
                       (clj->phaser texture)
                       (clj->phaser color)
                       (clj->phaser canvas)))))