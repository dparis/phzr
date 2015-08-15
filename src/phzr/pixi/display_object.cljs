(ns phzr.pixi.display-object
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->DisplayObject
  "The base class for all objects that are rendered on the screen.
  This is an abstract class and should not be used on its own rather it should be extended."
  ([]
   (js/PIXI.DisplayObject.)))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([display-object]
   (phaser->clj
    (.destroy display-object))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * display-object (PIXI.DisplayObject) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([display-object resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture display-object
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Retrieves the bounds of the displayObject as a rectangle object

  Parameters:
    * display-object (PIXI.DisplayObject) - Targeted instance for method
    * matrix (Matrix) - -

  Returns:  Rectangle - the rectangular bounding area"
  ([display-object matrix]
   (phaser->clj
    (.getBounds display-object
                (clj->phaser matrix)))))

(defn get-local-bounds
  "Retrieves the local bounds of the displayObject as a rectangle object

  Returns:  Rectangle - the rectangular bounding area"
  ([display-object]
   (phaser->clj
    (.getLocalBounds display-object))))

(defn pre-update
  "Empty, to be overridden by classes that require it."
  ([display-object]
   (phaser->clj
    (.preUpdate display-object))))

(defn set-stage-reference
  "Sets the object's stage reference, the stage this object is connected to

  Parameters:
    * display-object (PIXI.DisplayObject) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the object will have as its current stage reference"
  ([display-object stage]
   (phaser->clj
    (.setStageReference display-object
                        (clj->phaser stage)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * display-object (PIXI.DisplayObject) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([display-object position]
   (phaser->clj
    (.toGlobal display-object
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * display-object (PIXI.DisplayObject) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([display-object position]
   (phaser->clj
    (.toLocal display-object
              (clj->phaser position))))
  ([display-object position from]
   (phaser->clj
    (.toLocal display-object
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([display-object]
   (phaser->clj
    (.updateCache display-object))))