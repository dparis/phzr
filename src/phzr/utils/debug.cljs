(ns phzr.utils.debug
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [key]))

(defn ->Debug
  "A collection of methods for displaying debug information about game objects.
  If your game is running in WebGL then Debug will create a Sprite that is placed at the top of the Stage display list and bind a canvas texture
  to it, which must be uploaded every frame. Be advised: this is very expensive, especially in browsers like Firefox. So please only enable Debug
  in WebGL mode if you really need it (or your desktop can cope with it well) and disable it for production!
  If your game is using a Canvas renderer then the debug information is literally drawn on the top of the active game canvas and no Sprite is used.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Utils.Debug. (clj->phaser game))))

(defn a-star-
  "Debug method to draw the last calculated path by AStar

  Parameters:
    * astar (Phaser.Plugin.AStar) - The AStar plugin that you want to debug.
    * x (number) - X position on camera for debug display.
    * y (number) - Y position on camera for debug display.
    * color (string) - Color to stroke the path line.

  Returns:  void - "
  ([astar x y color]
   (phaser->clj
    (.AStar js/Phaser.Utils.Debug
            (clj->phaser astar)
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser color)))))

(defn body
  "Render a Sprites Physics body if it has one set. The body is rendered as a filled or stroked rectangle.
  This only works for Arcade Physics, Ninja Physics (AABB and Circle only) and Box2D Physics bodies.
  To display a P2 Physics body you should enable debug mode on the body when creating it.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * sprite (Phaser.Sprite) - The Sprite who's body will be rendered.
    * color (string) {optional} - Color of the debug rectangle to be rendered. The format is a CSS color string such as '#ff0000' or 'rgba(255,0,0,0.5)'.
    * filled (boolean) {optional} - Render the body as a filled rectangle (true) or a stroked rectangle (false)"
  ([debug sprite]
   (phaser->clj
    (.body debug
           (clj->phaser sprite))))
  ([debug sprite color]
   (phaser->clj
    (.body debug
           (clj->phaser sprite)
           (clj->phaser color))))
  ([debug sprite color filled]
   (phaser->clj
    (.body debug
           (clj->phaser sprite)
           (clj->phaser color)
           (clj->phaser filled)))))

(defn body-info
  "Render a Sprites Physic Body information.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * sprite (Phaser.Sprite) - The sprite to be rendered.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug sprite x y]
   (phaser->clj
    (.bodyInfo debug
               (clj->phaser sprite)
               (clj->phaser x)
               (clj->phaser y))))
  ([debug sprite x y color]
   (phaser->clj
    (.bodyInfo debug
               (clj->phaser sprite)
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser color)))))

(defn box-2d-body
  "Renders 'debug draw' data for the given Box2D body.
  This uses the standard debug drawing feature of Box2D, so colors will be decided by the Box2D engine.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * sprite (Phaser.Sprite) - The sprite whos body will be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug sprite]
   (phaser->clj
    (.box2dBody debug
                (clj->phaser sprite))))
  ([debug sprite color]
   (phaser->clj
    (.box2dBody debug
                (clj->phaser sprite)
                (clj->phaser color)))))

(defn box-2d-world
  "Renders 'debug draw' data for the Box2D world if it exists.
  This uses the standard debug drawing feature of Box2D, so colors will be decided by
  the Box2D engine."
  ([debug]
   (phaser->clj
    (.box2dWorld debug))))

(defn camera-info
  "Render camera information including dimensions and location.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * camera (Phaser.Camera) - The Phaser.Camera to show the debug information for.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug camera x y]
   (phaser->clj
    (.cameraInfo debug
                 (clj->phaser camera)
                 (clj->phaser x)
                 (clj->phaser y))))
  ([debug camera x y color]
   (phaser->clj
    (.cameraInfo debug
                 (clj->phaser camera)
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser color)))))

(defn geom
  "Renders a Phaser geometry object including Rectangle, Circle, Point or Line.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * object (Phaser.Rectangle | Phaser.Circle | Phaser.Point | Phaser.Line) - The geometry object to render.
    * color (string) {optional} - Color of the debug info to be rendered (format is css color string).
    * filled (boolean) {optional} - Render the objected as a filled (default, true) or a stroked (false)
    * force-type (number) {optional} - Force rendering of a specific type. If 0 no type will be forced, otherwise 1 = Rectangle, 2 = Circle, 3 = Point and 4 = Line."
  ([debug object]
   (phaser->clj
    (.geom debug
           (clj->phaser object))))
  ([debug object color]
   (phaser->clj
    (.geom debug
           (clj->phaser object)
           (clj->phaser color))))
  ([debug object color filled]
   (phaser->clj
    (.geom debug
           (clj->phaser object)
           (clj->phaser color)
           (clj->phaser filled))))
  ([debug object color filled force-type]
   (phaser->clj
    (.geom debug
           (clj->phaser object)
           (clj->phaser color)
           (clj->phaser filled)
           (clj->phaser force-type)))))

(defn input-info
  "Render debug information about the Input object.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug x y]
   (phaser->clj
    (.inputInfo debug
                (clj->phaser x)
                (clj->phaser y))))
  ([debug x y color]
   (phaser->clj
    (.inputInfo debug
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser color)))))

(defn key
  "Renders Phaser.Key object information.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * key (Phaser.Key) - The Key to render the information for.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug key x y]
   (phaser->clj
    (.key debug
          (clj->phaser key)
          (clj->phaser x)
          (clj->phaser y))))
  ([debug key x y color]
   (phaser->clj
    (.key debug
          (clj->phaser key)
          (clj->phaser x)
          (clj->phaser y)
          (clj->phaser color)))))

(defn line-info
  "Renders Line information in the given color.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * line (Phaser.Line) - The Line to display the data for.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug line x y]
   (phaser->clj
    (.lineInfo debug
               (clj->phaser line)
               (clj->phaser x)
               (clj->phaser y))))
  ([debug line x y color]
   (phaser->clj
    (.lineInfo debug
               (clj->phaser line)
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser color)))))

(defn pixel
  "Renders a single pixel at the given size.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * x (number) - X position of the pixel to be rendered.
    * y (number) - Y position of the pixel to be rendered.
    * color (string) {optional} - Color of the pixel (format is css color string).
    * size (number) {optional} - The 'size' to render the pixel at."
  ([debug x y]
   (phaser->clj
    (.pixel debug
            (clj->phaser x)
            (clj->phaser y))))
  ([debug x y color]
   (phaser->clj
    (.pixel debug
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser color))))
  ([debug x y color size]
   (phaser->clj
    (.pixel debug
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser color)
            (clj->phaser size)))))

(defn pointer
  "Renders the Pointer.circle object onto the stage in green if down or red if up along with debug text.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * pointer (Phaser.Pointer) - The Pointer you wish to display.
    * hide-if-up (boolean) {optional} - Doesn't render the circle if the pointer is up.
    * down-color (string) {optional} - The color the circle is rendered in if down.
    * up-color (string) {optional} - The color the circle is rendered in if up (and hideIfUp is false).
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug pointer]
   (phaser->clj
    (.pointer debug
              (clj->phaser pointer))))
  ([debug pointer hide-if-up]
   (phaser->clj
    (.pointer debug
              (clj->phaser pointer)
              (clj->phaser hide-if-up))))
  ([debug pointer hide-if-up down-color]
   (phaser->clj
    (.pointer debug
              (clj->phaser pointer)
              (clj->phaser hide-if-up)
              (clj->phaser down-color))))
  ([debug pointer hide-if-up down-color up-color]
   (phaser->clj
    (.pointer debug
              (clj->phaser pointer)
              (clj->phaser hide-if-up)
              (clj->phaser down-color)
              (clj->phaser up-color))))
  ([debug pointer hide-if-up down-color up-color color]
   (phaser->clj
    (.pointer debug
              (clj->phaser pointer)
              (clj->phaser hide-if-up)
              (clj->phaser down-color)
              (clj->phaser up-color)
              (clj->phaser color)))))

(defn pre-update
  "Internal method that clears the canvas (if a Sprite) ready for a new debug session."
  ([debug]
   (phaser->clj
    (.preUpdate debug))))

(defn quad-tree
  "Visually renders a QuadTree to the display.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * quadtree (Phaser.QuadTree) - The quadtree to render.
    * color (string) - The color of the lines in the quadtree."
  ([debug quadtree color]
   (phaser->clj
    (.quadTree debug
               (clj->phaser quadtree)
               (clj->phaser color)))))

(defn rectangle
  "Renders a Rectangle.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * object (Phaser.Rectangle | object) - The geometry object to render.
    * color (string) {optional} - Color of the debug info to be rendered (format is css color string).
    * filled (boolean) {optional} - Render the objected as a filled (default, true) or a stroked (false)"
  ([debug object]
   (phaser->clj
    (.rectangle debug
                (clj->phaser object))))
  ([debug object color]
   (phaser->clj
    (.rectangle debug
                (clj->phaser object)
                (clj->phaser color))))
  ([debug object color filled]
   (phaser->clj
    (.rectangle debug
                (clj->phaser object)
                (clj->phaser color)
                (clj->phaser filled)))))

(defn reset
  "Clears the Debug canvas."
  ([debug]
   (phaser->clj
    (.reset debug))))

(defn rope-segments
  "Renders the Rope's segments. Note: This is really expensive as it has to calculate new segments every time you call it

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * rope (Phaser.Rope) - The rope to display the segments of.
    * color (string) {optional} - Color of the debug info to be rendered (format is css color string).
    * filled (boolean) {optional} - Render the rectangle as a fillRect (default, true) or a strokeRect (false)"
  ([debug rope]
   (phaser->clj
    (.ropeSegments debug
                   (clj->phaser rope))))
  ([debug rope color]
   (phaser->clj
    (.ropeSegments debug
                   (clj->phaser rope)
                   (clj->phaser color))))
  ([debug rope color filled]
   (phaser->clj
    (.ropeSegments debug
                   (clj->phaser rope)
                   (clj->phaser color)
                   (clj->phaser filled)))))

(defn sound-info
  "Render Sound information, including decoded state, duration, volume and more.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * sound (Phaser.Sound) - The sound object to debug.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug sound x y]
   (phaser->clj
    (.soundInfo debug
                (clj->phaser sound)
                (clj->phaser x)
                (clj->phaser y))))
  ([debug sound x y color]
   (phaser->clj
    (.soundInfo debug
                (clj->phaser sound)
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser color)))))

(defn sprite-bounds
  "Renders the Sprites bounds. Note: This is really expensive as it has to calculate the bounds every time you call it!

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * sprite (Phaser.Sprite | Phaser.Image) - The sprite to display the bounds of.
    * color (string) {optional} - Color of the debug info to be rendered (format is css color string).
    * filled (boolean) {optional} - Render the rectangle as a fillRect (default, true) or a strokeRect (false)"
  ([debug sprite]
   (phaser->clj
    (.spriteBounds debug
                   (clj->phaser sprite))))
  ([debug sprite color]
   (phaser->clj
    (.spriteBounds debug
                   (clj->phaser sprite)
                   (clj->phaser color))))
  ([debug sprite color filled]
   (phaser->clj
    (.spriteBounds debug
                   (clj->phaser sprite)
                   (clj->phaser color)
                   (clj->phaser filled)))))

(defn sprite-coords
  "Renders the sprite coordinates in local, positional and world space.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * sprite (Phaser.Sprite | Phaser.Image) - The sprite to display the coordinates for.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug sprite x y]
   (phaser->clj
    (.spriteCoords debug
                   (clj->phaser sprite)
                   (clj->phaser x)
                   (clj->phaser y))))
  ([debug sprite x y color]
   (phaser->clj
    (.spriteCoords debug
                   (clj->phaser sprite)
                   (clj->phaser x)
                   (clj->phaser y)
                   (clj->phaser color)))))

(defn sprite-info
  "Render debug infos (including name, bounds info, position and some other properties) about the Sprite.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * sprite (Phaser.Sprite) - The Sprite to display the information of.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug sprite x y]
   (phaser->clj
    (.spriteInfo debug
                 (clj->phaser sprite)
                 (clj->phaser x)
                 (clj->phaser y))))
  ([debug sprite x y color]
   (phaser->clj
    (.spriteInfo debug
                 (clj->phaser sprite)
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser color)))))

(defn sprite-input-info
  "Render Sprite Input Debug information.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * sprite (Phaser.Sprite | Phaser.Image) - The sprite to display the input data for.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug sprite x y]
   (phaser->clj
    (.spriteInputInfo debug
                      (clj->phaser sprite)
                      (clj->phaser x)
                      (clj->phaser y))))
  ([debug sprite x y color]
   (phaser->clj
    (.spriteInputInfo debug
                      (clj->phaser sprite)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser color)))))

(defn text
  "Render a string of text.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * text (string) - The line of text to draw.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - Color of the debug info to be rendered (format is css color string).
    * font (string) {optional} - The font of text to draw."
  ([debug text x y]
   (phaser->clj
    (.text debug
           (clj->phaser text)
           (clj->phaser x)
           (clj->phaser y))))
  ([debug text x y color]
   (phaser->clj
    (.text debug
           (clj->phaser text)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser color))))
  ([debug text x y color font]
   (phaser->clj
    (.text debug
           (clj->phaser text)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser color)
           (clj->phaser font)))))

(defn timer
  "Render Timer information.

  Parameters:
    * debug (Phaser.Utils.Debug) - Targeted instance for method
    * timer (Phaser.Timer) - The Phaser.Timer to show the debug information for.
    * x (number) - X position of the debug info to be rendered.
    * y (number) - Y position of the debug info to be rendered.
    * color (string) {optional} - color of the debug info to be rendered. (format is css color string)."
  ([debug timer x y]
   (phaser->clj
    (.timer debug
            (clj->phaser timer)
            (clj->phaser x)
            (clj->phaser y))))
  ([debug timer x y color]
   (phaser->clj
    (.timer debug
            (clj->phaser timer)
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser color)))))