(ns phzr.pixi.webgl-shader-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->WebGLShaderManager
  ""
  ([]
   (js/PIXI.WebGLShaderManager.)))

(defn destroy
  "Destroys this object."
  ([webgl-shader-manager]
   (phaser->clj
    (.destroy webgl-shader-manager))))

(defn set-attribs
  "Takes the attributes given in parameters.

  Parameters:
    * webgl-shader-manager (PIXI.WebGLShaderManager) - Targeted instance for method
    * attribs (Array) - attribs"
  ([webgl-shader-manager attribs]
   (phaser->clj
    (.setAttribs webgl-shader-manager
                 (clj->phaser attribs)))))

(defn set-context
  "Initialises the context and the properties.

  Parameters:
    * webgl-shader-manager (PIXI.WebGLShaderManager) - Targeted instance for method
    * gl (WebGLContext) - the current WebGL drawing context"
  ([webgl-shader-manager gl]
   (phaser->clj
    (.setContext webgl-shader-manager
                 (clj->phaser gl)))))

(defn set-shader
  "Sets the current shader.

  Parameters:
    * webgl-shader-manager (PIXI.WebGLShaderManager) - Targeted instance for method
    * shader () - -"
  ([webgl-shader-manager shader]
   (phaser->clj
    (.setShader webgl-shader-manager
                (clj->phaser shader)))))