(ns phzr.pixi.webgl-mask-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->WebGLMaskManager
  ""
  ([]
   (js/PIXI.WebGLMaskManager.)))

(defn destroy
  "Destroys the mask stack."
  ([webgl-mask-manager]
   (phaser->clj
    (.destroy webgl-mask-manager))))

(defn pop-mask
  "Removes the last filter from the filter stack and doesn't return it.

  Parameters:
    * webgl-mask-manager (PIXI.WebGLMaskManager) - Targeted instance for method
    * mask-data (Array) - -
    * render-session (Object) - an object containing all the useful parameters"
  ([webgl-mask-manager mask-data render-session]
   (phaser->clj
    (.popMask webgl-mask-manager
              (clj->phaser mask-data)
              (clj->phaser render-session)))))

(defn push-mask
  "Applies the Mask and adds it to the current filter stack.

  Parameters:
    * webgl-mask-manager (PIXI.WebGLMaskManager) - Targeted instance for method
    * mask-data (Array) - -
    * render-session (Object) - -"
  ([webgl-mask-manager mask-data render-session]
   (phaser->clj
    (.pushMask webgl-mask-manager
               (clj->phaser mask-data)
               (clj->phaser render-session)))))

(defn set-context
  "Sets the drawing context to the one given in parameter.

  Parameters:
    * webgl-mask-manager (PIXI.WebGLMaskManager) - Targeted instance for method
    * gl (WebGLContext) - the current WebGL drawing context"
  ([webgl-mask-manager gl]
   (phaser->clj
    (.setContext webgl-mask-manager
                 (clj->phaser gl)))))