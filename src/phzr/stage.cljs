(ns phzr.stage
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Stage
  "The Stage controls root level display objects upon which everything is displayed.
  It also handles browser visibility handling and the pausing due to loss of focus.

  Parameters:
    * game (Phaser.Game) - Game reference to the currently running game."
  ([game]
   (js/Phaser.Stage. (clj->phaser game))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([stage child]
   (phaser->clj
    (.addChild stage
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([stage child index]
   (phaser->clj
    (.addChildAt stage
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn check-visibility
  "Starts a page visibility event listener running, or window.onpagehide/onpageshow if not supported by the browser.
  Also listens for window.onblur and window.onfocus."
  ([stage]
   (phaser->clj
    (.checkVisibility stage))))

(defn destroy
  "Destroys the Stage and removes event listeners."
  ([stage]
   (phaser->clj
    (.destroy stage))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
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
    * stage (Phaser.Stage) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([stage index]
   (phaser->clj
    (.getChildAt stage
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
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

(defn post-update
  "This is called automatically before the renderer runs and after the plugins have updated.
  In postUpdate this is where all the final physics calculatations and object positioning happens.
  The objects are processed in the order of the display list.
  The only exception to this is if the camera is following an object, in which case that is updated first."
  ([stage]
   (phaser->clj
    (.postUpdate stage))))

(defn pre-update
  "This is called automatically after the plugins preUpdate and before the State.update.
  Most objects have preUpdate methods and it's where initial movement and positioning is done."
  ([stage]
   (phaser->clj
    (.preUpdate stage))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([stage child]
   (phaser->clj
    (.removeChild stage
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([stage index]
   (phaser->clj
    (.removeChildAt stage
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
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
  "Sets the background color for the Stage.

  The color can be given as a hex string (`'#RRGGBB'`), a CSS color string (`'rgb(r,g,b)'`), or a numeric value (`0xRRGGBB`).

  An alpha channel is _not_ supported and will be ignored.

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
    * background-color (number | string) - The color of the background."
  ([stage background-color]
   (phaser->clj
    (.setBackgroundColor stage
                         (clj->phaser background-color)))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
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
    * stage (Phaser.Stage) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([stage stage]
   (phaser->clj
    (.setStageReference stage
                        (clj->phaser stage)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
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
    * stage (Phaser.Stage) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([stage position]
   (phaser->clj
    (.toGlobal stage
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
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

(defn update
  "This is called automatically after the State.update, but before particles or plugins update."
  ([stage]
   (phaser->clj
    (.update stage))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([stage]
   (phaser->clj
    (.updateCache stage))))

(defn update-transform
  "Updates the transforms for all objects on the display list.
  This overrides the Pixi default as we don't need the interactionManager, but do need the game property check."
  ([stage]
   (phaser->clj
    (.updateTransform stage))))

(defn visibility-change
  "This method is called when the document visibility is changed.

  Parameters:
    * stage (Phaser.Stage) - Targeted instance for method
    * event (Event) - Its type will be used to decide whether the game should be paused or not."
  ([stage event]
   (phaser->clj
    (.visibilityChange stage
                       (clj->phaser event)))))