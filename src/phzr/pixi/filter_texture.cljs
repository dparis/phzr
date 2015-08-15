(ns phzr.pixi.filter-texture
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->FilterTexture
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context
    * width (Number) - the horizontal range of the filter
    * height (Number) - the vertical range of the filter
    * scale-mode (Number) - See PIXI.scaleModes for possible values"
  ([gl width height scale-mode]
   (js/PIXI.FilterTexture. (clj->phaser gl)
                           (clj->phaser width)
                           (clj->phaser height)
                           (clj->phaser scale-mode))))

(defn clear
  "Clears the filter texture."
  ([filter-texture]
   (phaser->clj
    (.clear filter-texture))))

(defn destroy
  "Destroys the filter texture."
  ([filter-texture]
   (phaser->clj
    (.destroy filter-texture))))

(defn resize
  "Resizes the texture to the specified width and height

  Parameters:
    * filter-texture (PIXI.FilterTexture) - Targeted instance for method
    * width (Number) - the new width of the texture
    * height (Number) - the new height of the texture"
  ([filter-texture width height]
   (phaser->clj
    (.resize filter-texture
             (clj->phaser width)
             (clj->phaser height)))))