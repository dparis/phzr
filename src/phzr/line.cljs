(ns phzr.line
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [clone]))

(defn ->Line
  "Creates a new Line object with a start and an end point.

  Parameters:
    * x-1 (number) {optional} - The x coordinate of the start of the line.
    * y-1 (number) {optional} - The y coordinate of the start of the line.
    * x-2 (number) {optional} - The x coordinate of the end of the line.
    * y-2 (number) {optional} - The y coordinate of the end of the line."
  ([]
   (js/Phaser.Line.))
  ([x-1]
   (js/Phaser.Line. (clj->phaser x-1)))
  ([x-1 y-1]
   (js/Phaser.Line. (clj->phaser x-1)
                    (clj->phaser y-1)))
  ([x-1 y-1 x-2]
   (js/Phaser.Line. (clj->phaser x-1)
                    (clj->phaser y-1)
                    (clj->phaser x-2)))
  ([x-1 y-1 x-2 y-2]
   (js/Phaser.Line. (clj->phaser x-1)
                    (clj->phaser y-1)
                    (clj->phaser x-2)
                    (clj->phaser y-2))))

(defn clone
  "Returns a new Line object with the same values for the start and end properties as this Line object.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * output (Phaser.Line) - Optional Line object. If given the values will be set into the object, otherwise a brand new Line object will be created and returned.

  Returns:  Phaser.Line - The cloned Line object."
  ([line output]
   (phaser->clj
    (.clone line
            (clj->phaser output)))))

(defn coordinates-on-line
  "Using Bresenham's line algorithm this will return an array of all coordinates on this line.
  The start and end points are rounded before this runs as the algorithm works on integers.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * step-rate (number) {optional} - How many steps will we return? 1 = every coordinate on the line, 2 = every other coordinate, etc.
    * results (array) {optional} - The array to store the results in. If not provided a new one will be generated.

  Returns:  array - An array of coordinates."
  ([line]
   (phaser->clj
    (.coordinatesOnLine line)))
  ([line step-rate]
   (phaser->clj
    (.coordinatesOnLine line
                        (clj->phaser step-rate))))
  ([line step-rate results]
   (phaser->clj
    (.coordinatesOnLine line
                        (clj->phaser step-rate)
                        (clj->phaser results)))))

(defn from-angle
  "Sets this line to start at the given `x` and `y` coordinates and for the segment to extend at `angle` for the given `length`.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * x (number) - The x coordinate of the start of the line.
    * y (number) - The y coordinate of the start of the line.
    * angle (number) - The angle of the line in radians.
    * length (number) - The length of the line in pixels.

  Returns:  Phaser.Line - This line object"
  ([line x y angle length]
   (phaser->clj
    (.fromAngle line
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser angle)
                (clj->phaser length)))))

(defn from-sprite
  "Sets the line to match the x/y coordinates of the two given sprites.
  Can optionally be calculated from their center coordinates.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * start-sprite (Phaser.Sprite) - The coordinates of this Sprite will be set to the Line.start point.
    * end-sprite (Phaser.Sprite) - The coordinates of this Sprite will be set to the Line.start point.
    * use-center (boolean) {optional} - If true it will use startSprite.center.x, if false startSprite.x. Note that Sprites don't have a center property by default, so only enable if you've over-ridden your Sprite with a custom class.

  Returns:  Phaser.Line - This line object"
  ([line start-sprite end-sprite]
   (phaser->clj
    (.fromSprite line
                 (clj->phaser start-sprite)
                 (clj->phaser end-sprite))))
  ([line start-sprite end-sprite use-center]
   (phaser->clj
    (.fromSprite line
                 (clj->phaser start-sprite)
                 (clj->phaser end-sprite)
                 (clj->phaser use-center)))))

(defn intersects
  "Checks for intersection between this line and another Line.
  If asSegment is true it will check for segment intersection. If asSegment is false it will check for line intersection.
  Returns the intersection segment of AB and EF as a Point, or null if there is no intersection.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * line (Phaser.Line) - The line to check against this one.
    * as-segment (boolean) {optional} - If true it will check for segment intersection, otherwise full line intersection.
    * result (Phaser.Point) {optional} - A Point object to store the result in, if not given a new one will be created.

  Returns:  Phaser.Point - The intersection segment of the two lines as a Point, or null if there is no intersection."
  ([line line]
   (phaser->clj
    (.intersects line
                 (clj->phaser line))))
  ([line line as-segment]
   (phaser->clj
    (.intersects line
                 (clj->phaser line)
                 (clj->phaser as-segment))))
  ([line line as-segment result]
   (phaser->clj
    (.intersects line
                 (clj->phaser line)
                 (clj->phaser as-segment)
                 (clj->phaser result)))))

(defn intersects-
  "Checks for intersection between two lines.
  If asSegment is true it will check for segment intersection.
  If asSegment is false it will check for line intersection.
  Returns the intersection segment of AB and EF as a Point, or null if there is no intersection.
  Adapted from code by Keith Hair

  Parameters:
    * a (Phaser.Line) - The first Line to be checked.
    * b (Phaser.Line) - The second Line to be checked.
    * as-segment (boolean) {optional} - If true it will check for segment intersection, otherwise full line intersection.
    * result (Phaser.Point) {optional} - A Point object to store the result in, if not given a new one will be created.

  Returns:  Phaser.Point - The intersection segment of the two lines as a Point, or null if there is no intersection."
  ([a b]
   (phaser->clj
    (.intersects js/Phaser.Line
                 (clj->phaser a)
                 (clj->phaser b))))
  ([a b as-segment]
   (phaser->clj
    (.intersects js/Phaser.Line
                 (clj->phaser a)
                 (clj->phaser b)
                 (clj->phaser as-segment))))
  ([a b as-segment result]
   (phaser->clj
    (.intersects js/Phaser.Line
                 (clj->phaser a)
                 (clj->phaser b)
                 (clj->phaser as-segment)
                 (clj->phaser result)))))

(defn intersects-points-
  "Checks for intersection between two lines as defined by the given start and end points.
  If asSegment is true it will check for line segment intersection. If asSegment is false it will check for line intersection.
  Returns the intersection segment of AB and EF as a Point, or null if there is no intersection.
  Adapted from code by Keith Hair

  Parameters:
    * a (Phaser.Point) - The start of the first Line to be checked.
    * b (Phaser.Point) - The end of the first line to be checked.
    * e (Phaser.Point) - The start of the second Line to be checked.
    * f (Phaser.Point) - The end of the second line to be checked.
    * as-segment (boolean) {optional} - If true it will check for segment intersection, otherwise full line intersection.
    * result (Phaser.Point | object) {optional} - A Point object to store the result in, if not given a new one will be created.

  Returns:  Phaser.Point - The intersection segment of the two lines as a Point, or null if there is no intersection."
  ([a b e f]
   (phaser->clj
    (.intersectsPoints js/Phaser.Line
                       (clj->phaser a)
                       (clj->phaser b)
                       (clj->phaser e)
                       (clj->phaser f))))
  ([a b e f as-segment]
   (phaser->clj
    (.intersectsPoints js/Phaser.Line
                       (clj->phaser a)
                       (clj->phaser b)
                       (clj->phaser e)
                       (clj->phaser f)
                       (clj->phaser as-segment))))
  ([a b e f as-segment result]
   (phaser->clj
    (.intersectsPoints js/Phaser.Line
                       (clj->phaser a)
                       (clj->phaser b)
                       (clj->phaser e)
                       (clj->phaser f)
                       (clj->phaser as-segment)
                       (clj->phaser result)))))

(defn point-on-line
  "Tests if the given coordinates fall on this line. See pointOnSegment to test against just the line segment.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * x (number) - The line to check against this one.
    * y (number) - The line to check against this one.

  Returns:  boolean - True if the point is on the line, false if not."
  ([line x y]
   (phaser->clj
    (.pointOnLine line
                  (clj->phaser x)
                  (clj->phaser y)))))

(defn point-on-segment
  "Tests if the given coordinates fall on this line and within the segment. See pointOnLine to test against just the line.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * x (number) - The line to check against this one.
    * y (number) - The line to check against this one.

  Returns:  boolean - True if the point is on the line and segment, false if not."
  ([line x y]
   (phaser->clj
    (.pointOnSegment line
                     (clj->phaser x)
                     (clj->phaser y)))))

(defn random
  "Picks a random point from anywhere on the Line segment and returns it.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * out (Phaser.Point | object) {optional} - A Phaser.Point, or any object with public x/y properties, that the values will be set in.
    If no object is provided a new Phaser.Point object will be created. In high performance areas avoid this by re-using an object.

  Returns:  Phaser.Point - An object containing the random point in its `x` and `y` properties."
  ([line]
   (phaser->clj
    (.random line)))
  ([line out]
   (phaser->clj
    (.random line
             (clj->phaser out)))))

(defn reflect
  "Returns the reflected angle between two lines.
  This is the outgoing angle based on the angle of this line and the normalAngle of the given line.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * line (Phaser.Line) - The line to reflect off this line.

  Returns:  number - The reflected angle in radians."
  ([line line]
   (phaser->clj
    (.reflect line
              (clj->phaser line)))))

(defn reflect-
  "Returns the reflected angle between two lines.
  This is the outgoing angle based on the angle of Line 1 and the normalAngle of Line 2.

  Parameters:
    * a (Phaser.Line) - The base line.
    * b (Phaser.Line) - The line to be reflected from the base line.

  Returns:  number - The reflected angle in radians."
  ([a b]
   (phaser->clj
    (.reflect js/Phaser.Line
              (clj->phaser a)
              (clj->phaser b)))))

(defn rotate
  "Rotates the line by the amount specified in `angle`.

  Rotation takes place from the center of the line.

  If you wish to rotate from either end see Line.start.rotate or Line.end.rotate.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * angle (number) - The angle in radians (unless asDegrees is true) to rotate the line by.
    * as-degrees (boolean) {optional} - Is the given angle in radians (false) or degrees (true)?

  Returns:  Phaser.Line - This line object"
  ([line angle]
   (phaser->clj
    (.rotate line
             (clj->phaser angle))))
  ([line angle as-degrees]
   (phaser->clj
    (.rotate line
             (clj->phaser angle)
             (clj->phaser as-degrees)))))

(defn set-to
  "Sets the components of the Line to the specified values.

  Parameters:
    * line (Phaser.Line) - Targeted instance for method
    * x-1 (number) {optional} - The x coordinate of the start of the line.
    * y-1 (number) {optional} - The y coordinate of the start of the line.
    * x-2 (number) {optional} - The x coordinate of the end of the line.
    * y-2 (number) {optional} - The y coordinate of the end of the line.

  Returns:  Phaser.Line - This line object"
  ([line]
   (phaser->clj
    (.setTo line)))
  ([line x-1]
   (phaser->clj
    (.setTo line
            (clj->phaser x-1))))
  ([line x-1 y-1]
   (phaser->clj
    (.setTo line
            (clj->phaser x-1)
            (clj->phaser y-1))))
  ([line x-1 y-1 x-2]
   (phaser->clj
    (.setTo line
            (clj->phaser x-1)
            (clj->phaser y-1)
            (clj->phaser x-2))))
  ([line x-1 y-1 x-2 y-2]
   (phaser->clj
    (.setTo line
            (clj->phaser x-1)
            (clj->phaser y-1)
            (clj->phaser x-2)
            (clj->phaser y-2)))))