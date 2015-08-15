(ns phzr.pixi.tiling-sprite
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->TilingSprite
  "A tiling sprite is a fast way of rendering a tiling image

  Parameters:
    * texture (PIXI.Texture) - the texture of the tiling sprite
    * width (Number) - the width of the tiling sprite
    * height (Number) - the height of the tiling sprite"
  ([texture width height]
   (js/PIXI.TilingSprite. (clj->phaser texture)
                          (clj->phaser width)
                          (clj->phaser height))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([tiling-sprite child]
   (phaser->clj
    (.addChild tiling-sprite
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([tiling-sprite child index]
   (phaser->clj
    (.addChildAt tiling-sprite
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([tiling-sprite]
   (phaser->clj
    (.destroy tiling-sprite))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([tiling-sprite resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture tiling-sprite
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn generate-tiling-texture
  "

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * force-power-of-two (Boolean) - Whether we want to force the texture to be a power of two"
  ([tiling-sprite force-power-of-two]
   (phaser->clj
    (.generateTilingTexture tiling-sprite
                            (clj->phaser force-power-of-two)))))

(defn get-bounds
  "Returns the framing rectangle of the sprite as a PIXI.Rectangle object

  Returns:  Rectangle - the framing rectangle"
  ([tiling-sprite]
   (phaser->clj
    (.getBounds tiling-sprite))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([tiling-sprite index]
   (phaser->clj
    (.getChildAt tiling-sprite
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([tiling-sprite child]
   (phaser->clj
    (.getChildIndex tiling-sprite
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([tiling-sprite]
   (phaser->clj
    (.getLocalBounds tiling-sprite))))

(defn pre-update
  "Empty, to be overridden by classes that require it."
  ([tiling-sprite]
   (phaser->clj
    (.preUpdate tiling-sprite))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([tiling-sprite child]
   (phaser->clj
    (.removeChild tiling-sprite
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([tiling-sprite index]
   (phaser->clj
    (.removeChildAt tiling-sprite
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([tiling-sprite begin-index end-index]
   (phaser->clj
    (.removeChildren tiling-sprite
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([tiling-sprite]
   (phaser->clj
    (.removeStageReference tiling-sprite))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([tiling-sprite child index]
   (phaser->clj
    (.setChildIndex tiling-sprite
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([tiling-sprite stage]
   (phaser->clj
    (.setStageReference tiling-sprite
                        (clj->phaser stage)))))

(defn set-texture
  "Sets the texture of the sprite

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * texture (PIXI.Texture) - The PIXI texture that is displayed by the sprite"
  ([tiling-sprite texture]
   (phaser->clj
    (.setTexture tiling-sprite
                 (clj->phaser texture)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([tiling-sprite child child-2]
   (phaser->clj
    (.swapChildren tiling-sprite
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([tiling-sprite position]
   (phaser->clj
    (.toGlobal tiling-sprite
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * tiling-sprite (PIXI.TilingSprite) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([tiling-sprite position]
   (phaser->clj
    (.toLocal tiling-sprite
              (clj->phaser position))))
  ([tiling-sprite position from]
   (phaser->clj
    (.toLocal tiling-sprite
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([tiling-sprite]
   (phaser->clj
    (.updateCache tiling-sprite))))