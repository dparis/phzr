(ns phzr.pixi.webgl-blend-mode-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->WebGLBlendModeManager
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context"
  ([gl]
   (js/PIXI.WebGLBlendModeManager. (clj->phaser gl))))

(defn destroy
  "Destroys this object."
  ([webgl-blend-mode-manager]
   (phaser->clj
    (.destroy webgl-blend-mode-manager))))

(defn set-blend-mode
  "Sets-up the given blendMode from WebGL's point of view.

  Parameters:
    * webgl-blend-mode-manager (PIXI.WebGLBlendModeManager) - Targeted instance for method
    * blend-mode (Number) - the blendMode, should be a Pixi const, such as PIXI.BlendModes.ADD"
  ([webgl-blend-mode-manager blend-mode]
   (phaser->clj
    (.setBlendMode webgl-blend-mode-manager
                   (clj->phaser blend-mode)))))

(defn set-context
  "Sets the WebGL Context.

  Parameters:
    * webgl-blend-mode-manager (PIXI.WebGLBlendModeManager) - Targeted instance for method
    * gl (WebGLContext) - the current WebGL drawing context"
  ([webgl-blend-mode-manager gl]
   (phaser->clj
    (.setContext webgl-blend-mode-manager
                 (clj->phaser gl)))))