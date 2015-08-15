(ns phzr.pixi.display-object-container
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->DisplayObjectContainer
  "A DisplayObjectContainer represents a collection of display objects.
  It is the base class of all display objects that act as a container for other objects."
  ([]
   (js/PIXI.DisplayObjectContainer.)))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([display-object-container child]
   (phaser->clj
    (.addChild display-object-container
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([display-object-container child index]
   (phaser->clj
    (.addChildAt display-object-container
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([display-object-container]
   (phaser->clj
    (.destroy display-object-container))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([display-object-container resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture display-object-container
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Retrieves the bounds of the displayObjectContainer as a rectangle. The bounds calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([display-object-container]
   (phaser->clj
    (.getBounds display-object-container))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([display-object-container index]
   (phaser->clj
    (.getChildAt display-object-container
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([display-object-container child]
   (phaser->clj
    (.getChildIndex display-object-container
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([display-object-container]
   (phaser->clj
    (.getLocalBounds display-object-container))))

(defn pre-update
  "Empty, to be overridden by classes that require it."
  ([display-object-container]
   (phaser->clj
    (.preUpdate display-object-container))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([display-object-container child]
   (phaser->clj
    (.removeChild display-object-container
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([display-object-container index]
   (phaser->clj
    (.removeChildAt display-object-container
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([display-object-container begin-index end-index]
   (phaser->clj
    (.removeChildren display-object-container
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([display-object-container]
   (phaser->clj
    (.removeStageReference display-object-container))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([display-object-container child index]
   (phaser->clj
    (.setChildIndex display-object-container
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([display-object-container stage]
   (phaser->clj
    (.setStageReference display-object-container
                        (clj->phaser stage)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([display-object-container child child-2]
   (phaser->clj
    (.swapChildren display-object-container
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([display-object-container position]
   (phaser->clj
    (.toGlobal display-object-container
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * display-object-container (PIXI.DisplayObjectContainer) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([display-object-container position]
   (phaser->clj
    (.toLocal display-object-container
              (clj->phaser position))))
  ([display-object-container position from]
   (phaser->clj
    (.toLocal display-object-container
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([display-object-container]
   (phaser->clj
    (.updateCache display-object-container))))