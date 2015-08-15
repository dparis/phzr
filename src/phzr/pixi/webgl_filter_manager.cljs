(ns phzr.pixi.webgl-filter-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->WebGLFilterManager
  ""
  ([]
   (js/PIXI.WebGLFilterManager.)))

(defn apply-filter-pass
  "Applies the filter to the specified area.

  Parameters:
    * webgl-filter-manager (PIXI.WebGLFilterManager) - Targeted instance for method
    * filter (PIXI.AbstractFilter) - the filter that needs to be applied
    * filter-area (PIXI.Texture) - TODO - might need an update
    * width (Number) - the horizontal range of the filter
    * height (Number) - the vertical range of the filter"
  ([webgl-filter-manager filter filter-area width height]
   (phaser->clj
    (.applyFilterPass webgl-filter-manager
                      (clj->phaser filter)
                      (clj->phaser filter-area)
                      (clj->phaser width)
                      (clj->phaser height)))))

(defn begin
  "

  Parameters:
    * webgl-filter-manager (PIXI.WebGLFilterManager) - Targeted instance for method
    * render-session (RenderSession) - -
    * buffer (ArrayBuffer) - -"
  ([webgl-filter-manager render-session buffer]
   (phaser->clj
    (.begin webgl-filter-manager
            (clj->phaser render-session)
            (clj->phaser buffer)))))

(defn destroy
  "Destroys the filter and removes it from the filter stack."
  ([webgl-filter-manager]
   (phaser->clj
    (.destroy webgl-filter-manager))))

(defn init-shader-buffers
  "Initialises the shader buffers."
  ([webgl-filter-manager]
   (phaser->clj
    (.initShaderBuffers webgl-filter-manager))))

(defn pop-filter
  "Removes the last filter from the filter stack and doesn't return it."
  ([webgl-filter-manager]
   (phaser->clj
    (.popFilter webgl-filter-manager))))

(defn push-filter
  "Applies the filter and adds it to the current filter stack.

  Parameters:
    * webgl-filter-manager (PIXI.WebGLFilterManager) - Targeted instance for method
    * filter-block (Object) - the filter that will be pushed to the current filter stack"
  ([webgl-filter-manager filter-block]
   (phaser->clj
    (.pushFilter webgl-filter-manager
                 (clj->phaser filter-block)))))

(defn set-context
  "Initialises the context and the properties.

  Parameters:
    * webgl-filter-manager (PIXI.WebGLFilterManager) - Targeted instance for method
    * gl (WebGLContext) - the current WebGL drawing context"
  ([webgl-filter-manager gl]
   (phaser->clj
    (.setContext webgl-filter-manager
                 (clj->phaser gl)))))