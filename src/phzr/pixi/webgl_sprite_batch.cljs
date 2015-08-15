(ns phzr.pixi.webgl-sprite-batch
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [flush]))

(defn ->WebGLSpriteBatch
  ""
  ([]
   (js/PIXI.WebGLSpriteBatch.)))

(defn begin
  "

  Parameters:
    * webgl-sprite-batch (PIXI.WebGLSpriteBatch) - Targeted instance for method
    * render-session (Object) - The RenderSession object"
  ([webgl-sprite-batch render-session]
   (phaser->clj
    (.begin webgl-sprite-batch
            (clj->phaser render-session)))))

(defn compile-fragment-shader-
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context
    * shader-src (Array) - -

  Returns:   - "
  ([gl shader-src]
   (phaser->clj
    (.CompileFragmentShader js/PIXI.WebGLSpriteBatch
                            (clj->phaser gl)
                            (clj->phaser shader-src)))))

(defn compile-program-
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context
    * vertex-src (Array) - -
    * fragment-src (Array) - -

  Returns:   - "
  ([gl vertex-src fragment-src]
   (phaser->clj
    (.compileProgram js/PIXI.WebGLSpriteBatch
                     (clj->phaser gl)
                     (clj->phaser vertex-src)
                     (clj->phaser fragment-src)))))

(defn compile-vertex-shader-
  "

  Parameters:
    * gl (WebGLContext) - the current WebGL drawing context
    * shader-src (Array) - -

  Returns:   - "
  ([gl shader-src]
   (phaser->clj
    (.CompileVertexShader js/PIXI.WebGLSpriteBatch
                          (clj->phaser gl)
                          (clj->phaser shader-src)))))

(defn destroy
  "Destroys the SpriteBatch."
  ([webgl-sprite-batch]
   (phaser->clj
    (.destroy webgl-sprite-batch))))

(defn end
  ""
  ([webgl-sprite-batch]
   (phaser->clj
    (.end webgl-sprite-batch))))

(defn flush
  "Renders the content and empties the current batch."
  ([webgl-sprite-batch]
   (phaser->clj
    (.flush webgl-sprite-batch))))

(defn render
  "

  Parameters:
    * webgl-sprite-batch (PIXI.WebGLSpriteBatch) - Targeted instance for method
    * sprite (PIXI.Sprite) - the sprite to render when using this spritebatch
    * matrix (Matrix) {optional} - - Optional matrix. If provided the Display Object will be rendered using this matrix, otherwise it will use its worldTransform."
  ([webgl-sprite-batch sprite]
   (phaser->clj
    (.render webgl-sprite-batch
             (clj->phaser sprite))))
  ([webgl-sprite-batch sprite matrix]
   (phaser->clj
    (.render webgl-sprite-batch
             (clj->phaser sprite)
             (clj->phaser matrix)))))

(defn render-batch
  "

  Parameters:
    * webgl-sprite-batch (PIXI.WebGLSpriteBatch) - Targeted instance for method
    * texture (PIXI.Texture) - -
    * size (Number) - -
    * start-index (Number) - -"
  ([webgl-sprite-batch texture size start-index]
   (phaser->clj
    (.renderBatch webgl-sprite-batch
                  (clj->phaser texture)
                  (clj->phaser size)
                  (clj->phaser start-index)))))

(defn render-tiling-sprite
  "Renders a TilingSprite using the spriteBatch.

  Parameters:
    * webgl-sprite-batch (PIXI.WebGLSpriteBatch) - Targeted instance for method
    * sprite (PIXI.TilingSprite) - the sprite to render"
  ([webgl-sprite-batch sprite]
   (phaser->clj
    (.renderTilingSprite webgl-sprite-batch
                         (clj->phaser sprite)))))

(defn set-context
  "

  Parameters:
    * webgl-sprite-batch (PIXI.WebGLSpriteBatch) - Targeted instance for method
    * gl (WebGLContext) - the current WebGL drawing context"
  ([webgl-sprite-batch gl]
   (phaser->clj
    (.setContext webgl-sprite-batch
                 (clj->phaser gl)))))

(defn start
  ""
  ([webgl-sprite-batch]
   (phaser->clj
    (.start webgl-sprite-batch))))

(defn stop
  ""
  ([webgl-sprite-batch]
   (phaser->clj
    (.stop webgl-sprite-batch))))