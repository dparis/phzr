(ns phzr.pixi.texture
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Texture
  "A texture stores the information that represents an image or part of an image. It cannot be added
  to the display list directly. Instead use it as the texture for a PIXI.Sprite. If no frame is provided then the whole image is used.

  Parameters:
    * base-texture (PIXI.BaseTexture) - The base texture source to create the texture from
    * frame (Rectangle) - The rectangle frame of the texture to show
    * crop (Rectangle) {optional} - The area of original texture
    * trim (Rectangle) {optional} - Trimmed texture rectangle"
  ([base-texture frame]
   (js/PIXI.Texture. (clj->phaser base-texture)
                     (clj->phaser frame)))
  ([base-texture frame crop]
   (js/PIXI.Texture. (clj->phaser base-texture)
                     (clj->phaser frame)
                     (clj->phaser crop)))
  ([base-texture frame crop trim]
   (js/PIXI.Texture. (clj->phaser base-texture)
                     (clj->phaser frame)
                     (clj->phaser crop)
                     (clj->phaser trim))))

(defn add-texture-to-cache-
  "Adds a texture to the global PIXI.TextureCache. This cache is shared across the whole PIXI object.

  Parameters:
    * texture (PIXI.Texture) - The Texture to add to the cache.
    * id (String) - The id that the texture will be stored against."
  ([texture id]
   (phaser->clj
    (.addTextureToCache js/PIXI.Texture
                        (clj->phaser texture)
                        (clj->phaser id)))))

(defn destroy
  "Destroys this texture

  Parameters:
    * texture (PIXI.Texture) - Targeted instance for method
    * destroy-base (Boolean) - Whether to destroy the base texture as well"
  ([texture destroy-base]
   (phaser->clj
    (.destroy texture
              (clj->phaser destroy-base)))))

(defn from-canvas-
  "Helper function that creates a new a Texture based on the given canvas element.

  Parameters:
    * canvas (Canvas) - The canvas element source of the texture
    * scale-mode (Number) - See PIXI.scaleModes for possible values

  Returns:   - Texture"
  ([canvas scale-mode]
   (phaser->clj
    (.fromCanvas js/PIXI.Texture
                 (clj->phaser canvas)
                 (clj->phaser scale-mode)))))

(defn from-frame-
  "Helper function that returns a Texture objected based on the given frame id.
  If the frame id is not in the texture cache an error will be thrown.

  Parameters:
    * frame-id (String) - The frame id of the texture

  Returns:   - Texture"
  ([frame-id]
   (phaser->clj
    (.fromFrame js/PIXI.Texture
                (clj->phaser frame-id)))))

(defn from-image-
  "Helper function that creates a Texture object from the given image url.
  If the image is not in the texture cache it will be  created and loaded.

  Parameters:
    * image-url (String) - The image url of the texture
    * crossorigin (Boolean) - Whether requests should be treated as crossorigin
    * scale-mode (Number) - See PIXI.scaleModes for possible values

  Returns:   - Texture"
  ([image-url crossorigin scale-mode]
   (phaser->clj
    (.fromImage js/PIXI.Texture
                (clj->phaser image-url)
                (clj->phaser crossorigin)
                (clj->phaser scale-mode)))))

(defn remove-texture-from-cache-
  "Remove a texture from the global PIXI.TextureCache.

  Parameters:
    * id (String) - The id of the texture to be removed

  Returns:  PIXI.Texture - The texture that was removed"
  ([id]
   (phaser->clj
    (.removeTextureFromCache js/PIXI.Texture
                             (clj->phaser id)))))

(defn set-frame
  "Specifies the region of the baseTexture that this texture will use.

  Parameters:
    * texture (PIXI.Texture) - Targeted instance for method
    * frame (Rectangle) - The frame of the texture to set it to"
  ([texture frame]
   (phaser->clj
    (.setFrame texture
               (clj->phaser frame)))))