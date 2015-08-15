(ns phzr.pixi.complex-primitive-shader
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->ComplexPrimitiveShader
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context"
  ([gl]
   (js/PIXI.ComplexPrimitiveShader. (clj->phaser gl))))

(defn destroy
  "Destroys the shader."
  ([complex-primitive-shader]
   (phaser->clj
    (.destroy complex-primitive-shader))))

(defn init
  "Initialises the shader."
  ([complex-primitive-shader]
   (phaser->clj
    (.init complex-primitive-shader))))