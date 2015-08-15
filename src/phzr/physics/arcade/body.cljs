(ns phzr.physics.arcade.body
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Body
  "The Physics Body is linked to a single Sprite. All physics operations should be performed against the body rather than
  the Sprite itself. For example you can set the velocity, acceleration, bounce values etc all on the Body.

  Parameters:
    * sprite (Phaser.Sprite) - The Sprite object this physics body belongs to."
  ([sprite]
   (js/Phaser.Physics.Arcade.Body. (clj->phaser sprite))))

(defn delta-abs-x
  "Returns the absolute delta x value.

  Returns:  number - The absolute delta value."
  ([body]
   (phaser->clj
    (.deltaAbsX body))))

(defn delta-abs-y
  "Returns the absolute delta y value.

  Returns:  number - The absolute delta value."
  ([body]
   (phaser->clj
    (.deltaAbsY body))))

(defn delta-x
  "Returns the delta x value. The difference between Body.x now and in the previous step.

  Returns:  number - The delta value. Positive if the motion was to the right, negative if to the left."
  ([body]
   (phaser->clj
    (.deltaX body))))

(defn delta-y
  "Returns the delta y value. The difference between Body.y now and in the previous step.

  Returns:  number - The delta value. Positive if the motion was downwards, negative if upwards."
  ([body]
   (phaser->clj
    (.deltaY body))))

(defn delta-z
  "Returns the delta z value. The difference between Body.rotation now and in the previous step.

  Returns:  number - The delta value. Positive if the motion was clockwise, negative if anti-clockwise."
  ([body]
   (phaser->clj
    (.deltaZ body))))

(defn destroy
  "Removes this bodys reference to its parent sprite, freeing it up for gc."
  ([body]
   (phaser->clj
    (.destroy body))))

(defn hit-test
  "Tests if a world point lies within this Body.

  Parameters:
    * body (Phaser.Physics.Arcade.Body) - Targeted instance for method
    * x (number) - The world x coordinate to test.
    * y (number) - The world y coordinate to test.

  Returns:  boolean - True if the given coordinates are inside this Body, otherwise false."
  ([body x y]
   (phaser->clj
    (.hitTest body
              (clj->phaser x)
              (clj->phaser y)))))

(defn on-floor
  "Returns true if the bottom of this Body is in contact with either the world bounds or a tile.

  Returns:  boolean - True if in contact with either the world bounds or a tile."
  ([body]
   (phaser->clj
    (.onFloor body))))

(defn on-wall
  "Returns true if either side of this Body is in contact with either the world bounds or a tile.

  Returns:  boolean - True if in contact with either the world bounds or a tile."
  ([body]
   (phaser->clj
    (.onWall body))))

(defn render
  "Render Sprite Body.

  Parameters:
    * body (Phaser.Physics.Arcade.Body) - Targeted instance for method
    * context (object) - The context to render to.
    * body (Phaser.Physics.Arcade.Body) - The Body to render the info of.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string).
    * filled (boolean) {optional} - Render the objected as a filled (default, true) or a stroked (false)"
  ([body context body]
   (phaser->clj
    (.render body
             (clj->phaser context)
             (clj->phaser body))))
  ([body context body color]
   (phaser->clj
    (.render body
             (clj->phaser context)
             (clj->phaser body)
             (clj->phaser color))))
  ([body context body color filled]
   (phaser->clj
    (.render body
             (clj->phaser context)
             (clj->phaser body)
             (clj->phaser color)
             (clj->phaser filled)))))

(defn render-body-info
  "Render Sprite Body Physics Data as text.

  Parameters:
    * body (Phaser.Physics.Arcade.Body) - Targeted instance for method
    * body (Phaser.Physics.Arcade.Body) - The Body to render the info of.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([body body x y]
   (phaser->clj
    (.renderBodyInfo body
                     (clj->phaser body)
                     (clj->phaser x)
                     (clj->phaser y))))
  ([body body x y color]
   (phaser->clj
    (.renderBodyInfo body
                     (clj->phaser body)
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser color)))))

(defn reset
  "Resets all Body values (velocity, acceleration, rotation, etc)

  Parameters:
    * body (Phaser.Physics.Arcade.Body) - Targeted instance for method
    * x (number) - The new x position of the Body.
    * y (number) - The new y position of the Body."
  ([body x y]
   (phaser->clj
    (.reset body
            (clj->phaser x)
            (clj->phaser y)))))

(defn set-size
  "You can modify the size of the physics Body to be any dimension you need.
  So it could be smaller or larger than the parent Sprite. You can also control the x and y offset, which
  is the position of the Body relative to the top-left of the Sprite.

  Parameters:
    * body (Phaser.Physics.Arcade.Body) - Targeted instance for method
    * width (number) - The width of the Body.
    * height (number) - The height of the Body.
    * offset-x (number) {optional} - The X offset of the Body from the Sprite position.
    * offset-y (number) {optional} - The Y offset of the Body from the Sprite position."
  ([body width height]
   (phaser->clj
    (.setSize body
              (clj->phaser width)
              (clj->phaser height))))
  ([body width height offset-x]
   (phaser->clj
    (.setSize body
              (clj->phaser width)
              (clj->phaser height)
              (clj->phaser offset-x))))
  ([body width height offset-x offset-y]
   (phaser->clj
    (.setSize body
              (clj->phaser width)
              (clj->phaser height)
              (clj->phaser offset-x)
              (clj->phaser offset-y)))))