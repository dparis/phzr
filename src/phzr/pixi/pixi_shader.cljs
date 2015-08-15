(ns phzr.pixi.pixi-shader
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->PixiShader
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context"
  ([gl]
   (js/PIXI.PixiShader. (clj->phaser gl))))

(defn destroy
  "Destroys the shader."
  ([pixi-shader]
   (phaser->clj
    (.destroy pixi-shader))))

(defn init
  "Initialises the shader."
  ([pixi-shader]
   (phaser->clj
    (.init pixi-shader))))

(defn init-sampler-2-d
  "Initialises a Sampler2D uniform (which may only be available later on after initUniforms once the texture has loaded)"
  ([pixi-shader]
   (phaser->clj
    (.initSampler2D pixi-shader))))

(defn init-uniforms
  "Initialises the shader uniform values.

  Uniforms are specified in the GLSL_ES Specification: http://www.khronos.org/registry/webgl/specs/latest/1.0/
  http://www.khronos.org/registry/gles/specs/2.0/GLSL_ES_Specification_1.0.17.pdf"
  ([pixi-shader]
   (phaser->clj
    (.initUniforms pixi-shader))))

(defn sync-uniforms
  "Updates the shader uniform values."
  ([pixi-shader]
   (phaser->clj
    (.syncUniforms pixi-shader))))