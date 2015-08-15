(ns phzr.pixi.webgl-stencil-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->WebGLStencilManager
  ""
  ([]
   (js/PIXI.WebGLStencilManager.)))

(defn bind-graphics
  "TODO this does not belong here!

  Parameters:
    * webgl-stencil-manager (PIXI.WebGLStencilManager) - Targeted instance for method
    * graphics (PIXI.Graphics) - -
    * webgl-data (Array) - -
    * render-session (Object) - -"
  ([webgl-stencil-manager graphics webgl-data render-session]
   (phaser->clj
    (.bindGraphics webgl-stencil-manager
                   (clj->phaser graphics)
                   (clj->phaser webgl-data)
                   (clj->phaser render-session)))))

(defn destroy
  "Destroys the mask stack."
  ([webgl-stencil-manager]
   (phaser->clj
    (.destroy webgl-stencil-manager))))

(defn pop-stencil
  "

  Parameters:
    * webgl-stencil-manager (PIXI.WebGLStencilManager) - Targeted instance for method
    * graphics (PIXI.Graphics) - -
    * webgl-data (Array) - -
    * render-session (Object) - -"
  ([webgl-stencil-manager graphics webgl-data render-session]
   (phaser->clj
    (.popStencil webgl-stencil-manager
                 (clj->phaser graphics)
                 (clj->phaser webgl-data)
                 (clj->phaser render-session)))))

(defn push-mask
  "Applies the Mask and adds it to the current filter stack.

  Parameters:
    * webgl-stencil-manager (PIXI.WebGLStencilManager) - Targeted instance for method
    * graphics (PIXI.Graphics) - -
    * webgl-data (Array) - -
    * render-session (Object) - -"
  ([webgl-stencil-manager graphics webgl-data render-session]
   (phaser->clj
    (.pushMask webgl-stencil-manager
               (clj->phaser graphics)
               (clj->phaser webgl-data)
               (clj->phaser render-session)))))

(defn set-context
  "Sets the drawing context to the one given in parameter.

  Parameters:
    * webgl-stencil-manager (PIXI.WebGLStencilManager) - Targeted instance for method
    * gl (WebGLContext) - the current WebGL drawing context"
  ([webgl-stencil-manager gl]
   (phaser->clj
    (.setContext webgl-stencil-manager
                 (clj->phaser gl)))))