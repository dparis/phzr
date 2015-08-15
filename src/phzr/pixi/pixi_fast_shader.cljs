(ns phzr.pixi.pixi-fast-shader
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->PixiFastShader
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context"
  ([gl]
   (js/PIXI.PixiFastShader. (clj->phaser gl))))

(defn destroy
  "Destroys the shader."
  ([pixi-fast-shader]
   (phaser->clj
    (.destroy pixi-fast-shader))))

(defn init
  "Initialises the shader."
  ([pixi-fast-shader]
   (phaser->clj
    (.init pixi-fast-shader))))