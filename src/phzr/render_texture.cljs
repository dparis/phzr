(ns phzr.render-texture
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->RenderTexture
  "A RenderTexture is a special texture that allows any displayObject to be rendered to it. It allows you to take many complex objects and
  render them down into a single quad (on WebGL) which can then be used to texture other display objects with. A way of generating textures at run-time.

  Parameters:
    * game (Phaser.Game) - Current game instance.
    * key (string) - Internal Phaser reference key for the render texture.
    * width (number) {optional} - The width of the render texture.
    * height (number) {optional} - The height of the render texture.
    * key (string) {optional} - The key of the RenderTexture in the Cache, if stored there.
    * scale-mode (number) {optional} - One of the Phaser.scaleModes consts.
    * resolution (number) {optional} - The resolution of the texture being generated."
  ([game key]
   (js/Phaser.RenderTexture. (clj->phaser game)
                             (clj->phaser key)))
  ([game key width]
   (js/Phaser.RenderTexture. (clj->phaser game)
                             (clj->phaser key)
                             (clj->phaser width)))
  ([game key width height]
   (js/Phaser.RenderTexture. (clj->phaser game)
                             (clj->phaser key)
                             (clj->phaser width)
                             (clj->phaser height)))
  ([game key width height key]
   (js/Phaser.RenderTexture. (clj->phaser game)
                             (clj->phaser key)
                             (clj->phaser width)
                             (clj->phaser height)
                             (clj->phaser key)))
  ([game key width height key scale-mode]
   (js/Phaser.RenderTexture. (clj->phaser game)
                             (clj->phaser key)
                             (clj->phaser width)
                             (clj->phaser height)
                             (clj->phaser key)
                             (clj->phaser scale-mode)))
  ([game key width height key scale-mode resolution]
   (js/Phaser.RenderTexture. (clj->phaser game)
                             (clj->phaser key)
                             (clj->phaser width)
                             (clj->phaser height)
                             (clj->phaser key)
                             (clj->phaser scale-mode)
                             (clj->phaser resolution))))

(defn clear
  "Clears the RenderTexture."
  ([render-texture]
   (phaser->clj
    (.clear render-texture))))

(defn destroy
  "Destroys this texture

  Parameters:
    * render-texture (Phaser.RenderTexture) - Targeted instance for method
    * destroy-base (Boolean) - Whether to destroy the base texture as well"
  ([render-texture destroy-base]
   (phaser->clj
    (.destroy render-texture
              (clj->phaser destroy-base)))))

(defn get-base-64
  "Will return a base64 encoded string of this texture. It works by calling RenderTexture.getCanvas and then running toDataURL on that.

  Returns:  String - A base64 encoded string of the texture."
  ([render-texture]
   (phaser->clj
    (.getBase64 render-texture))))

(defn get-canvas
  "Creates a Canvas element, renders this RenderTexture to it and then returns it.

  Returns:  HTMLCanvasElement - A Canvas element with the texture rendered on."
  ([render-texture]
   (phaser->clj
    (.getCanvas render-texture))))

(defn get-image
  "Will return a HTML Image of the texture

  Returns:  Image - "
  ([render-texture]
   (phaser->clj
    (.getImage render-texture))))

(defn render
  "This function will draw the display object to the RenderTexture.

  In versions of Phaser prior to 2.4.0 the second parameter was a Phaser.Point object. 
  This is now a Matrix allowing you much more control over how the Display Object is rendered.
  If you need to replicate the earlier behavior please use Phaser.RenderTexture.renderXY instead.

  If you wish for the displayObject to be rendered taking its current scale, rotation and translation into account then either
  pass `null`, leave it undefined or pass `displayObject.worldTransform` as the matrix value.

  Parameters:
    * render-texture (Phaser.RenderTexture) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapText | Phaser.Group) - The display object to render to this texture.
    * matrix (Phaser.Matrix) {optional} - Optional matrix to apply to the display object before rendering. If null or undefined it will use the worldTransform matrix of the given display object.
    * clear (boolean) {optional} - If true the texture will be cleared before the display object is drawn."
  ([render-texture display-object]
   (phaser->clj
    (.render render-texture
             (clj->phaser display-object))))
  ([render-texture display-object matrix]
   (phaser->clj
    (.render render-texture
             (clj->phaser display-object)
             (clj->phaser matrix))))
  ([render-texture display-object matrix clear]
   (phaser->clj
    (.render render-texture
             (clj->phaser display-object)
             (clj->phaser matrix)
             (clj->phaser clear)))))

(defn render-raw-xy
  "This function will draw the display object to the RenderTexture at the given coordinates.

  When the display object is drawn it doesn't take into account scale, rotation or translation.

  If you need those then use RenderTexture.renderXY instead.

  Parameters:
    * render-texture (Phaser.RenderTexture) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapText | Phaser.Group) - The display object to render to this texture.
    * x (number) - The x position to render the object at.
    * y (number) - The y position to render the object at.
    * clear (boolean) {optional} - If true the texture will be cleared before the display object is drawn."
  ([render-texture display-object x y]
   (phaser->clj
    (.renderRawXY render-texture
                  (clj->phaser display-object)
                  (clj->phaser x)
                  (clj->phaser y))))
  ([render-texture display-object x y clear]
   (phaser->clj
    (.renderRawXY render-texture
                  (clj->phaser display-object)
                  (clj->phaser x)
                  (clj->phaser y)
                  (clj->phaser clear)))))

(defn render-xy
  "This function will draw the display object to the RenderTexture at the given coordinates.

  When the display object is drawn it takes into account scale and rotation.

  If you don't want those then use RenderTexture.renderRawXY instead.

  Parameters:
    * render-texture (Phaser.RenderTexture) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapText | Phaser.Group) - The display object to render to this texture.
    * x (number) - The x position to render the object at.
    * y (number) - The y position to render the object at.
    * clear (boolean) {optional} - If true the texture will be cleared before the display object is drawn."
  ([render-texture display-object x y]
   (phaser->clj
    (.renderXY render-texture
               (clj->phaser display-object)
               (clj->phaser x)
               (clj->phaser y))))
  ([render-texture display-object x y clear]
   (phaser->clj
    (.renderXY render-texture
               (clj->phaser display-object)
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser clear)))))

(defn resize
  "Resizes the RenderTexture.

  Parameters:
    * render-texture (Phaser.RenderTexture) - Targeted instance for method
    * width (Number) - The width to resize to.
    * height (Number) - The height to resize to.
    * update-base (Boolean) - Should the baseTexture.width and height values be resized as well?"
  ([render-texture width height update-base]
   (phaser->clj
    (.resize render-texture
             (clj->phaser width)
             (clj->phaser height)
             (clj->phaser update-base)))))

(defn set-frame
  "Specifies the region of the baseTexture that this texture will use.

  Parameters:
    * render-texture (Phaser.RenderTexture) - Targeted instance for method
    * frame (Rectangle) - The frame of the texture to set it to"
  ([render-texture frame]
   (phaser->clj
    (.setFrame render-texture
               (clj->phaser frame)))))