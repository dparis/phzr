(ns phzr.pixi.primitive-shader
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->PrimitiveShader
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context"
  ([gl]
   (js/PIXI.PrimitiveShader. (clj->phaser gl))))

(defn destroy
  "Destroys the shader."
  ([primitive-shader]
   (phaser->clj
    (.destroy primitive-shader))))

(defn init
  "Initialises the shader."
  ([primitive-shader]
   (phaser->clj
    (.init primitive-shader))))