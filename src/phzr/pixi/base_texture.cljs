(ns phzr.pixi.base-texture
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->BaseTexture
  "A texture stores the information that represents an image. All textures have a base texture.

  Parameters:
    * source (String) - the source object (image or canvas)
    * scale-mode (Number) - See PIXI.scaleModes for possible values"
  ([source scale-mode]
   (js/PIXI.BaseTexture. (clj->phaser source)
                         (clj->phaser scale-mode))))

(defn destroy
  "Destroys this base texture"
  ([base-texture]
   (phaser->clj
    (.destroy base-texture))))

(defn dirty
  "Sets all glTextures to be dirty."
  ([base-texture]
   (phaser->clj
    (.dirty base-texture))))

(defn force-loaded
  "Forces this BaseTexture to be set as loaded, with the given width and height.
  Then calls BaseTexture.dirty.
  Important for when you don't want to modify the source object by forcing in `complete` or dimension properties it may not have.

  Parameters:
    * base-texture (PIXI.BaseTexture) - Targeted instance for method
    * width (Number) - - The new width to force the BaseTexture to be.
    * height (Number) - - The new height to force the BaseTexture to be."
  ([base-texture width height]
   (phaser->clj
    (.forceLoaded base-texture
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn from-canvas-
  "Helper function that creates a base texture from the given canvas element.

  Parameters:
    * canvas (Canvas) - The canvas element source of the texture
    * scale-mode (Number) - See PIXI.scaleModes for possible values

  Returns:   - BaseTexture"
  ([canvas scale-mode]
   (phaser->clj
    (.fromCanvas js/PIXI.BaseTexture
                 (clj->phaser canvas)
                 (clj->phaser scale-mode)))))

(defn from-image-
  "Helper function that creates a base texture from the given image url.
  If the image is not in the base texture cache it will be created and loaded.

  Parameters:
    * image-url (String) - The image url of the texture
    * crossorigin (Boolean) - -
    * scale-mode (Number) - See PIXI.scaleModes for possible values

  Returns:   - BaseTexture"
  ([image-url crossorigin scale-mode]
   (phaser->clj
    (.fromImage js/PIXI.BaseTexture
                (clj->phaser image-url)
                (clj->phaser crossorigin)
                (clj->phaser scale-mode)))))

(defn unload-from-gpu
  "Removes the base texture from the GPU, useful for managing resources on the GPU.
  Atexture is still 100% usable and will simply be reuploaded if there is a sprite on screen that is using it."
  ([base-texture]
   (phaser->clj
    (.unloadFromGPU base-texture))))

(defn update-source-image
  "Changes the source image of the texture

  Parameters:
    * base-texture (PIXI.BaseTexture) - Targeted instance for method
    * new-src (String) - the path of the image"
  ([base-texture new-src]
   (phaser->clj
    (.updateSourceImage base-texture
                        (clj->phaser new-src)))))