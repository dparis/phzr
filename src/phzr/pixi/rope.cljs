(ns phzr.pixi.rope
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Rope
  "

  Parameters:
    * texture (PIXI.Texture) - - The texture to use on the rope.
    * points (Array) - - An array of {PIXI.Point}."
  ([texture points]
   (js/PIXI.Rope. (clj->phaser texture)
                  (clj->phaser points))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([rope child]
   (phaser->clj
    (.addChild rope
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([rope child index]
   (phaser->clj
    (.addChildAt rope
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([rope]
   (phaser->clj
    (.destroy rope))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([rope resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture rope
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Returns the bounds of the mesh as a rectangle. The bounds calculation takes the worldTransform into account.

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * matrix (Matrix) - the transformation matrix of the sprite

  Returns:  Rectangle - the framing rectangle"
  ([rope matrix]
   (phaser->clj
    (.getBounds rope
                (clj->phaser matrix)))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([rope index]
   (phaser->clj
    (.getChildAt rope
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([rope child]
   (phaser->clj
    (.getChildIndex rope
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([rope]
   (phaser->clj
    (.getLocalBounds rope))))

(defn pre-update
  "Empty, to be overridden by classes that require it."
  ([rope]
   (phaser->clj
    (.preUpdate rope))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([rope child]
   (phaser->clj
    (.removeChild rope
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([rope index]
   (phaser->clj
    (.removeChildAt rope
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([rope begin-index end-index]
   (phaser->clj
    (.removeChildren rope
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([rope]
   (phaser->clj
    (.removeStageReference rope))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([rope child index]
   (phaser->clj
    (.setChildIndex rope
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([rope stage]
   (phaser->clj
    (.setStageReference rope
                        (clj->phaser stage)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([rope child child-2]
   (phaser->clj
    (.swapChildren rope
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([rope position]
   (phaser->clj
    (.toGlobal rope
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * rope (PIXI.Rope) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([rope position]
   (phaser->clj
    (.toLocal rope
              (clj->phaser position))))
  ([rope position from]
   (phaser->clj
    (.toLocal rope
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([rope]
   (phaser->clj
    (.updateCache rope))))