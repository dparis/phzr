(ns phzr.component.load-texture
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->LoadTexture
  "The LoadTexture component manages the loading of a texture into the Game Object and the changing of frames."
  ([]
   (js/Phaser.Component.LoadTexture.)))

(defn load-texture
  "Changes the base texture the Game Object is using. The old texture is removed and the new one is referenced or fetched from the Cache.

  If your Game Object is using a frame from a texture atlas and you just wish to change to another frame, then see the `frame` or `frameName` properties instead.

  You should only use `loadTexture` if you want to replace the base texture entirely.

  Calling this method causes a WebGL texture update, so use sparingly or in low-intensity portions of your game, or if you know the new texture is already on the GPU.

  Parameters:
    * load-texture (Phaser.Component.LoadTexture) - Targeted instance for method
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) - This is the image or texture used by the Sprite during rendering. It can be a string which is a reference to the Cache Image entry, or an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If this Sprite is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.
    * stop-animation (boolean) {optional} - If an animation is already playing on this Sprite you can choose to stop it or let it carry on playing."
  ([load-texture key]
   (phaser->clj
    (.loadTexture load-texture
                  (clj->phaser key))))
  ([load-texture key frame]
   (phaser->clj
    (.loadTexture load-texture
                  (clj->phaser key)
                  (clj->phaser frame))))
  ([load-texture key frame stop-animation]
   (phaser->clj
    (.loadTexture load-texture
                  (clj->phaser key)
                  (clj->phaser frame)
                  (clj->phaser stop-animation)))))

(defn reset-frame
  "Resets the texture frame dimensions that the Game Object uses for rendering."
  ([load-texture]
   (phaser->clj
    (.resetFrame load-texture))))

(defn resize-frame
  "Resizes the Frame dimensions that the Game Object uses for rendering.

  You shouldn't normally need to ever call this, but in the case of special texture types such as Video or BitmapData
  it can be useful to adjust the dimensions directly in this way.

  Parameters:
    * load-texture (Phaser.Component.LoadTexture) - Targeted instance for method
    * parent (object) - The parent texture object that caused the resize, i.e. a Phaser.Video object.
    * width (integer) - The new width of the texture.
    * height (integer) - The new height of the texture."
  ([load-texture parent width height]
   (phaser->clj
    (.resizeFrame load-texture
                  (clj->phaser parent)
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn set-frame
  "Sets the texture frame the Game Object uses for rendering.

  This is primarily an internal method used by `loadTexture`, but is exposed for the use of plugins and custom classes.

  Parameters:
    * load-texture (Phaser.Component.LoadTexture) - Targeted instance for method
    * frame (Phaser.Frame) - The Frame to be used by the texture."
  ([load-texture frame]
   (phaser->clj
    (.setFrame load-texture
               (clj->phaser frame)))))