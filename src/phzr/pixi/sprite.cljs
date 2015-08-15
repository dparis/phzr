(ns phzr.pixi.sprite
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Sprite
  "The Sprite object is the base for all textured objects that are rendered to the screen

  Parameters:
    * texture (PIXI.Texture) - The texture for this sprite

A sprite can be created directly from an image like this :
var sprite = new PIXI.Sprite.fromImage('assets/image.png');
yourStage.addChild(sprite);
then obviously don't forget to add it to the stage you have already created"
  ([texture]
   (js/PIXI.Sprite. (clj->phaser texture))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([sprite child]
   (phaser->clj
    (.addChild sprite
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([sprite child index]
   (phaser->clj
    (.addChildAt sprite
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([sprite]
   (phaser->clj
    (.destroy sprite))))

(defn from-frame-
  "Helper function that creates a sprite that will contain a texture from the TextureCache based on the frameId
   The frame ids are created when a Texture packer file has been loaded

  Parameters:
    * frame-id (String) - The frame Id of the texture in the cache

  Returns:  PIXI.Sprite - A new Sprite using a texture from the texture cache matching the frameId"
  ([frame-id]
   (phaser->clj
    (.fromFrame js/PIXI.Sprite
                (clj->phaser frame-id)))))

(defn from-image-
  "Helper function that creates a sprite that will contain a texture based on an image url
   If the image is not in the texture cache it will be loaded

  Parameters:
    * image-id (String) - The image url of the texture

  Returns:  PIXI.Sprite - A new Sprite using a texture from the texture cache matching the image id"
  ([image-id]
   (phaser->clj
    (.fromImage js/PIXI.Sprite
                (clj->phaser image-id)))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([sprite resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture sprite
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Returns the bounds of the Sprite as a rectangle. The bounds calculation takes the worldTransform into account.

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * matrix (Matrix) - the transformation matrix of the sprite

  Returns:  Rectangle - the framing rectangle"
  ([sprite matrix]
   (phaser->clj
    (.getBounds sprite
                (clj->phaser matrix)))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([sprite index]
   (phaser->clj
    (.getChildAt sprite
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([sprite child]
   (phaser->clj
    (.getChildIndex sprite
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([sprite]
   (phaser->clj
    (.getLocalBounds sprite))))

(defn pre-update
  "Empty, to be overridden by classes that require it."
  ([sprite]
   (phaser->clj
    (.preUpdate sprite))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([sprite child]
   (phaser->clj
    (.removeChild sprite
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([sprite index]
   (phaser->clj
    (.removeChildAt sprite
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([sprite begin-index end-index]
   (phaser->clj
    (.removeChildren sprite
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([sprite]
   (phaser->clj
    (.removeStageReference sprite))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([sprite child index]
   (phaser->clj
    (.setChildIndex sprite
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([sprite stage]
   (phaser->clj
    (.setStageReference sprite
                        (clj->phaser stage)))))

(defn set-texture
  "Sets the texture of the sprite

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * texture (PIXI.Texture) - The PIXI texture that is displayed by the sprite"
  ([sprite texture]
   (phaser->clj
    (.setTexture sprite
                 (clj->phaser texture)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([sprite child child-2]
   (phaser->clj
    (.swapChildren sprite
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([sprite position]
   (phaser->clj
    (.toGlobal sprite
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * sprite (PIXI.Sprite) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([sprite position]
   (phaser->clj
    (.toLocal sprite
              (clj->phaser position))))
  ([sprite position from]
   (phaser->clj
    (.toLocal sprite
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([sprite]
   (phaser->clj
    (.updateCache sprite))))