(ns phzr.pixi.stage
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Stage
  "A Stage represents the root of the display tree. Everything connected to the stage is rendered

  Parameters:
    * background-color (Number) - the background color of the stage, you have to pass this in is in hex format
     like: 0xFFFFFF for white

Creating a stage is a mandatory process when you use Pixi, which is as simple as this : 
var stage = new PIXI.Stage(0xFFFFFF);
where the parameter given is the background colour of the stage, in hex
you will use this stage instance to add your sprites to it and therefore to the renderer
Here is how to add a sprite to the stage : 
stage.addChild(sprite);"
  ([background-color]
   (js/PIXI.Stage. (clj->phaser background-color))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([stage child]
   (phaser->clj
    (.addChild stage
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([stage child index]
   (phaser->clj
    (.addChildAt stage
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([stage]
   (phaser->clj
    (.destroy stage))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([stage resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture stage
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Retrieves the bounds of the displayObjectContainer as a rectangle. The bounds calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([stage]
   (phaser->clj
    (.getBounds stage))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([stage index]
   (phaser->clj
    (.getChildAt stage
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([stage child]
   (phaser->clj
    (.getChildIndex stage
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([stage]
   (phaser->clj
    (.getLocalBounds stage))))

(defn pre-update
  "Empty, to be overridden by classes that require it."
  ([stage]
   (phaser->clj
    (.preUpdate stage))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([stage child]
   (phaser->clj
    (.removeChild stage
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([stage index]
   (phaser->clj
    (.removeChildAt stage
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([stage begin-index end-index]
   (phaser->clj
    (.removeChildren stage
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([stage]
   (phaser->clj
    (.removeStageReference stage))))

(defn set-background-color
  "Sets the background color for the stage

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * background-color (Number) - the color of the background, easiest way to pass this in is in hex format
     like: 0xFFFFFF for white"
  ([stage background-color]
   (phaser->clj
    (.setBackgroundColor stage
                         (clj->phaser background-color)))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([stage child index]
   (phaser->clj
    (.setChildIndex stage
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([stage stage]
   (phaser->clj
    (.setStageReference stage
                        (clj->phaser stage)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([stage child child-2]
   (phaser->clj
    (.swapChildren stage
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([stage position]
   (phaser->clj
    (.toGlobal stage
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * stage (PIXI.Stage) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([stage position]
   (phaser->clj
    (.toLocal stage
              (clj->phaser position))))
  ([stage position from]
   (phaser->clj
    (.toLocal stage
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([stage]
   (phaser->clj
    (.updateCache stage))))