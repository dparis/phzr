(ns phzr.graphics
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Graphics
  "Creates a new `Graphics` object.

  Parameters:
    * game (Phaser.Game) - Current game instance.
    * x (number) {optional} - X position of the new graphics object.
    * y (number) {optional} - Y position of the new graphics object."
  ([game]
   (js/Phaser.Graphics. (clj->phaser game)))
  ([game x]
   (js/Phaser.Graphics. (clj->phaser game)
                        (clj->phaser x)))
  ([game x y]
   (js/Phaser.Graphics. (clj->phaser game)
                        (clj->phaser x)
                        (clj->phaser y))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([graphics child]
   (phaser->clj
    (.addChild graphics
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([graphics child index]
   (phaser->clj
    (.addChildAt graphics
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn arc
  "The arc method creates an arc/curve (used to create circles, or parts of circles).

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * cx (Number) - The x-coordinate of the center of the circle
    * cy (Number) - The y-coordinate of the center of the circle
    * radius (Number) - The radius of the circle
    * start-angle (Number) - The starting angle, in radians (0 is at the 3 o'clock position of the arc's circle)
    * end-angle (Number) - The ending angle, in radians
    * anticlockwise (Boolean) - Optional. Specifies whether the drawing should be counterclockwise or clockwise. False is default, and indicates clockwise, while true indicates counter-clockwise.

  Returns:  PIXI.Graphics - "
  ([graphics cx cy radius start-angle end-angle anticlockwise]
   (phaser->clj
    (.arc graphics
          (clj->phaser cx)
          (clj->phaser cy)
          (clj->phaser radius)
          (clj->phaser start-angle)
          (clj->phaser end-angle)
          (clj->phaser anticlockwise)))))

(defn begin-fill
  "Specifies a simple one-color fill that subsequent calls to other Graphics methods
  (such as lineTo() or drawCircle()) use when drawing.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * color (Number) - the color of the fill
    * alpha (Number) - the alpha of the fill

  Returns:  PIXI.Graphics - "
  ([graphics color alpha]
   (phaser->clj
    (.beginFill graphics
                (clj->phaser color)
                (clj->phaser alpha)))))

(defn bezier-curve-to
  "Calculate the points for a bezier curve and then draws it.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * cp-x (Number) - Control point x
    * cp-y (Number) - Control point y
    * cp-x-2 (Number) - Second Control point x
    * cp-y-2 (Number) - Second Control point y
    * to-x (Number) - Destination point x
    * to-y (Number) - Destination point y

  Returns:  PIXI.Graphics - "
  ([graphics cp-x cp-y cp-x-2 cp-y-2 to-x to-y]
   (phaser->clj
    (.bezierCurveTo graphics
                    (clj->phaser cp-x)
                    (clj->phaser cp-y)
                    (clj->phaser cp-x-2)
                    (clj->phaser cp-y-2)
                    (clj->phaser to-x)
                    (clj->phaser to-y)))))

(defn clear
  "Clears the graphics that were drawn to this Graphics object, and resets fill and line style settings.

  Returns:  PIXI.Graphics - "
  ([graphics]
   (phaser->clj
    (.clear graphics))))

(defn destroy
  "Destroy this Graphics instance.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * destroy-children (boolean) {optional} - Should every child of this object have its destroy method called?"
  ([graphics]
   (phaser->clj
    (.destroy graphics)))
  ([graphics destroy-children]
   (phaser->clj
    (.destroy graphics
              (clj->phaser destroy-children)))))

(defn destroy-cached-sprite
  "Destroys a previous cached sprite."
  ([graphics]
   (phaser->clj
    (.destroyCachedSprite graphics))))

(defn draw-circle
  "Draws a circle.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * x (Number) - The X coordinate of the center of the circle
    * y (Number) - The Y coordinate of the center of the circle
    * diameter (Number) - The diameter of the circle

  Returns:  PIXI.Graphics - "
  ([graphics x y diameter]
   (phaser->clj
    (.drawCircle graphics
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser diameter)))))

(defn draw-ellipse
  "Draws an ellipse.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * x (Number) - The X coordinate of the center of the ellipse
    * y (Number) - The Y coordinate of the center of the ellipse
    * width (Number) - The half width of the ellipse
    * height (Number) - The half height of the ellipse

  Returns:  PIXI.Graphics - "
  ([graphics x y width height]
   (phaser->clj
    (.drawEllipse graphics
                  (clj->phaser x)
                  (clj->phaser y)
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn draw-polygon
  "Draws a polygon using the given path.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * path (Array | PhaserPolygon) - The path data used to construct the polygon. Can either be an array of points or a Phaser.Polygon object.

  Returns:  PIXI.Graphics - "
  ([graphics path]
   (phaser->clj
    (.drawPolygon graphics
                  (clj->phaser path)))))

(defn draw-rect
  "

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * x (Number) - The X coord of the top-left of the rectangle
    * y (Number) - The Y coord of the top-left of the rectangle
    * width (Number) - The width of the rectangle
    * height (Number) - The height of the rectangle

  Returns:  PIXI.Graphics - "
  ([graphics x y width height]
   (phaser->clj
    (.drawRect graphics
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser width)
               (clj->phaser height)))))

(defn draw-rounded-rect
  "

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * x (Number) - The X coord of the top-left of the rectangle
    * y (Number) - The Y coord of the top-left of the rectangle
    * width (Number) - The width of the rectangle
    * height (Number) - The height of the rectangle
    * radius (Number) - Radius of the rectangle corners. In WebGL this must be a value between 0 and 9."
  ([graphics x y width height radius]
   (phaser->clj
    (.drawRoundedRect graphics
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser width)
                      (clj->phaser height)
                      (clj->phaser radius)))))

(defn draw-shape
  "Draws the given shape to this Graphics object. Can be any of Circle, Rectangle, Ellipse, Line or Polygon.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * shape (Circle | Rectangle | Ellipse | Line | Polygon) - The Shape object to draw.

  Returns:  PIXI.GraphicsData - The generated GraphicsData object."
  ([graphics shape]
   (phaser->clj
    (.drawShape graphics
                (clj->phaser shape)))))

(defn end-fill
  "Applies a fill to the lines and shapes that were added since the last call to the beginFill() method.

  Returns:  PIXI.Graphics - "
  ([graphics]
   (phaser->clj
    (.endFill graphics))))

(defn generate-texture
  "Useful function that returns a texture of the graphics object that can then be used to create sprites
  This can be quite useful if your geometry is complicated and needs to be reused multiple times.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - Should be one of the PIXI.scaleMode consts

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([graphics resolution scale-mode]
   (phaser->clj
    (.generateTexture graphics
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)))))

(defn get-bounds
  "Retrieves the bounds of the graphic shape as a rectangle object

  Returns:  Rectangle - the rectangular bounding area"
  ([graphics]
   (phaser->clj
    (.getBounds graphics))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([graphics index]
   (phaser->clj
    (.getChildAt graphics
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([graphics child]
   (phaser->clj
    (.getChildIndex graphics
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([graphics]
   (phaser->clj
    (.getLocalBounds graphics))))

(defn kill
  "Kills a Game Object. A killed Game Object has its `alive`, `exists` and `visible` properties all set to false.

  It will dispatch the `onKilled` event. You can listen to `events.onKilled` for the signal.

  Note that killing a Game Object is a way for you to quickly recycle it in an object pool, 
  it doesn't destroy the object or free it up from memory.

  If you don't need this Game Object any more you should call `destroy` instead.

  Returns:  PIXI.DisplayObject - This instance."
  ([graphics]
   (phaser->clj
    (.kill graphics))))

(defn line-style
  "Specifies the line style used for subsequent calls to Graphics methods such as the lineTo() method or the drawCircle() method.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * line-width (Number) - width of the line to draw, will update the objects stored style
    * color (Number) - color of the line to draw, will update the objects stored style
    * alpha (Number) - alpha of the line to draw, will update the objects stored style

  Returns:  PIXI.Graphics - "
  ([graphics line-width color alpha]
   (phaser->clj
    (.lineStyle graphics
                (clj->phaser line-width)
                (clj->phaser color)
                (clj->phaser alpha)))))

(defn line-to
  "Draws a line using the current line style from the current drawing position to (x, y);
  The current drawing position is then set to (x, y).

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * x (Number) - the X coordinate to draw to
    * y (Number) - the Y coordinate to draw to

  Returns:  PIXI.Graphics - "
  ([graphics x y]
   (phaser->clj
    (.lineTo graphics
             (clj->phaser x)
             (clj->phaser y)))))

(defn move-to
  "Moves the current drawing position to x, y.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * x (Number) - the X coordinate to move to
    * y (Number) - the Y coordinate to move to

  Returns:  PIXI.Graphics - "
  ([graphics x y]
   (phaser->clj
    (.moveTo graphics
             (clj->phaser x)
             (clj->phaser y)))))

(defn pre-update
  "Automatically called by World.preUpdate."
  ([graphics]
   (phaser->clj
    (.preUpdate graphics))))

(defn quadratic-curve-to
  "Calculate the points for a quadratic bezier curve and then draws it.
  Based on: https://stackoverflow.com/questions/785097/how-do-i-implement-a-bezier-curve-in-c

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * cp-x (Number) - Control point x
    * cp-y (Number) - Control point y
    * to-x (Number) - Destination point x
    * to-y (Number) - Destination point y

  Returns:  PIXI.Graphics - "
  ([graphics cp-x cp-y to-x to-y]
   (phaser->clj
    (.quadraticCurveTo graphics
                       (clj->phaser cp-x)
                       (clj->phaser cp-y)
                       (clj->phaser to-x)
                       (clj->phaser to-y)))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([graphics child]
   (phaser->clj
    (.removeChild graphics
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([graphics index]
   (phaser->clj
    (.removeChildAt graphics
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([graphics begin-index end-index]
   (phaser->clj
    (.removeChildren graphics
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([graphics]
   (phaser->clj
    (.removeStageReference graphics))))

(defn reset
  "Resets the Game Object.

  This moves the Game Object to the given x/y world coordinates and sets `fresh`, `exists`, 
  `visible` and `renderable` to true.

  If this Game Object has the LifeSpan component it will also set `alive` to true and `health` to the given value.

  If this Game Object has a Physics Body it will reset the Body.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Game Object at.
    * y (number) - The y coordinate (in world space) to position the Game Object at.
    * health (number) {optional} - The health to give the Game Object if it has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([graphics x y]
   (phaser->clj
    (.reset graphics
            (clj->phaser x)
            (clj->phaser y))))
  ([graphics x y health]
   (phaser->clj
    (.reset graphics
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser health)))))

(defn revive
  "Brings a 'dead' Game Object back to life, optionally resetting its health value in the process.

  A resurrected Game Object has its `alive`, `exists` and `visible` properties all set to true.

  It will dispatch the `onRevived` event. Listen to `events.onRevived` for the signal.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * health (number) {optional} - The health to give the Game Object. Only set if the GameObject has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([graphics]
   (phaser->clj
    (.revive graphics)))
  ([graphics health]
   (phaser->clj
    (.revive graphics
             (clj->phaser health)))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([graphics child index]
   (phaser->clj
    (.setChildIndex graphics
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([graphics stage]
   (phaser->clj
    (.setStageReference graphics
                        (clj->phaser stage)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([graphics child child-2]
   (phaser->clj
    (.swapChildren graphics
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([graphics position]
   (phaser->clj
    (.toGlobal graphics
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * graphics (Phaser.Graphics) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([graphics position]
   (phaser->clj
    (.toLocal graphics
              (clj->phaser position))))
  ([graphics position from]
   (phaser->clj
    (.toLocal graphics
              (clj->phaser position)
              (clj->phaser from)))))

(defn update
  "Override this method in your own custom objects to handle any update requirements.
  It is called immediately after `preUpdate` and before `postUpdate`.
  Remember if this Game Object has any children you should call update on those too."
  ([graphics]
   (phaser->clj
    (.update graphics))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([graphics]
   (phaser->clj
    (.updateCache graphics))))

(defn update-local-bounds
  "Update the bounds of the object"
  ([graphics]
   (phaser->clj
    (.updateLocalBounds graphics))))