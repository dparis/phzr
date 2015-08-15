(ns phzr.pixi.webgl-fast-sprite-batch
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [flush]))

(defn ->WebGLFastSpriteBatch
  ""
  ([]
   (js/PIXI.WebGLFastSpriteBatch.)))

(defn begin
  "

  Parameters:
    * webgl-fast-sprite-batch (PIXI.WebGLFastSpriteBatch) - Targeted instance for method
    * sprite-batch (PIXI.WebGLSpriteBatch) - -
    * render-session (Object) - -"
  ([webgl-fast-sprite-batch sprite-batch render-session]
   (phaser->clj
    (.begin webgl-fast-sprite-batch
            (clj->phaser sprite-batch)
            (clj->phaser render-session)))))

(defn end
  ""
  ([webgl-fast-sprite-batch]
   (phaser->clj
    (.end webgl-fast-sprite-batch))))

(defn flush
  ""
  ([webgl-fast-sprite-batch]
   (phaser->clj
    (.flush webgl-fast-sprite-batch))))

(defn render
  "

  Parameters:
    * webgl-fast-sprite-batch (PIXI.WebGLFastSpriteBatch) - Targeted instance for method
    * sprite-batch (PIXI.WebGLSpriteBatch) - -"
  ([webgl-fast-sprite-batch sprite-batch]
   (phaser->clj
    (.render webgl-fast-sprite-batch
             (clj->phaser sprite-batch)))))

(defn render-sprite
  "

  Parameters:
    * webgl-fast-sprite-batch (PIXI.WebGLFastSpriteBatch) - Targeted instance for method
    * sprite (PIXI.Sprite) - -"
  ([webgl-fast-sprite-batch sprite]
   (phaser->clj
    (.renderSprite webgl-fast-sprite-batch
                   (clj->phaser sprite)))))

(defn set-context
  "Sets the WebGL Context.

  Parameters:
    * webgl-fast-sprite-batch (PIXI.WebGLFastSpriteBatch) - Targeted instance for method
    * gl (WebGLContext) - the current WebGL drawing context"
  ([webgl-fast-sprite-batch gl]
   (phaser->clj
    (.setContext webgl-fast-sprite-batch
                 (clj->phaser gl)))))

(defn start
  ""
  ([webgl-fast-sprite-batch]
   (phaser->clj
    (.start webgl-fast-sprite-batch))))

(defn stop
  ""
  ([webgl-fast-sprite-batch]
   (phaser->clj
    (.stop webgl-fast-sprite-batch))))