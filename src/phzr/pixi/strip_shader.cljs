(ns phzr.pixi.strip-shader
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->StripShader
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context"
  ([gl]
   (js/PIXI.StripShader. (clj->phaser gl))))

(defn destroy
  "Destroys the shader."
  ([strip-shader]
   (phaser->clj
    (.destroy strip-shader))))

(defn init
  "Initialises the shader."
  ([strip-shader]
   (phaser->clj
    (.init strip-shader))))