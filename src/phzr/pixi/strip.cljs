(ns phzr.pixi.strip
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Strip
  "

  Parameters:
    * texture (PIXI.Texture) - The texture to use
    * width (Number) - the width
    * height (Number) - the height"
  ([texture width height]
   (js/PIXI.Strip. (clj->phaser texture)
                   (clj->phaser width)
                   (clj->phaser height))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([strip child]
   (phaser->clj
    (.addChild strip
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([strip child index]
   (phaser->clj
    (.addChildAt strip
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([strip]
   (phaser->clj
    (.destroy strip))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([strip resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture strip
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Returns the bounds of the mesh as a rectangle. The bounds calculation takes the worldTransform into account.

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * matrix (Matrix) - the transformation matrix of the sprite

  Returns:  Rectangle - the framing rectangle"
  ([strip matrix]
   (phaser->clj
    (.getBounds strip
                (clj->phaser matrix)))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([strip index]
   (phaser->clj
    (.getChildAt strip
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([strip child]
   (phaser->clj
    (.getChildIndex strip
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([strip]
   (phaser->clj
    (.getLocalBounds strip))))

(defn pre-update
  "Empty, to be overridden by classes that require it."
  ([strip]
   (phaser->clj
    (.preUpdate strip))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([strip child]
   (phaser->clj
    (.removeChild strip
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([strip index]
   (phaser->clj
    (.removeChildAt strip
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([strip begin-index end-index]
   (phaser->clj
    (.removeChildren strip
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([strip]
   (phaser->clj
    (.removeStageReference strip))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([strip child index]
   (phaser->clj
    (.setChildIndex strip
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([strip stage]
   (phaser->clj
    (.setStageReference strip
                        (clj->phaser stage)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([strip child child-2]
   (phaser->clj
    (.swapChildren strip
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([strip position]
   (phaser->clj
    (.toGlobal strip
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * strip (PIXI.Strip) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([strip position]
   (phaser->clj
    (.toLocal strip
              (clj->phaser position))))
  ([strip position from]
   (phaser->clj
    (.toLocal strip
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([strip]
   (phaser->clj
    (.updateCache strip))))