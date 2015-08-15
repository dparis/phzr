(ns phzr.circle
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [clone]))

(defn ->Circle
  "Creates a new Circle object with the center coordinate specified by the x and y parameters and the diameter specified by the diameter parameter.
  If you call this function without parameters, a circle with x, y, diameter and radius properties set to 0 is created.

  Parameters:
    * x (number) {optional} - The x coordinate of the center of the circle.
    * y (number) {optional} - The y coordinate of the center of the circle.
    * diameter (number) {optional} - The diameter of the circle."
  ([]
   (js/Phaser.Circle.))
  ([x]
   (js/Phaser.Circle. (clj->phaser x)))
  ([x y]
   (js/Phaser.Circle. (clj->phaser x)
                      (clj->phaser y)))
  ([x y diameter]
   (js/Phaser.Circle. (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser diameter))))

(defn circumference
  "The circumference of the circle.

  Returns:  number - The circumference of the circle."
  ([circle]
   (phaser->clj
    (.circumference circle))))

(defn circumference-point
  "Returns a Point object containing the coordinates of a point on the circumference of the Circle based on the given angle.

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * angle (number) - The angle in radians (unless asDegrees is true) to return the point from.
    * as-degrees (boolean) {optional} - Is the given angle in radians (false) or degrees (true)?
    * out (Phaser.Point) {optional} - An optional Point object to put the result in to. If none specified a new Point object will be created.

  Returns:  Phaser.Point - The Point object holding the result."
  ([circle angle]
   (phaser->clj
    (.circumferencePoint circle
                         (clj->phaser angle))))
  ([circle angle as-degrees]
   (phaser->clj
    (.circumferencePoint circle
                         (clj->phaser angle)
                         (clj->phaser as-degrees))))
  ([circle angle as-degrees out]
   (phaser->clj
    (.circumferencePoint circle
                         (clj->phaser angle)
                         (clj->phaser as-degrees)
                         (clj->phaser out)))))

(defn circumference-point-
  "Returns a Point object containing the coordinates of a point on the circumference of the Circle based on the given angle.

  Parameters:
    * a (Phaser.Circle) - The first Circle object.
    * angle (number) - The angle in radians (unless asDegrees is true) to return the point from.
    * as-degrees (boolean) {optional} - Is the given angle in radians (false) or degrees (true)?
    * out (Phaser.Point) {optional} - An optional Point object to put the result in to. If none specified a new Point object will be created.

  Returns:  Phaser.Point - The Point object holding the result."
  ([a angle]
   (phaser->clj
    (.circumferencePoint js/Phaser.Circle
                         (clj->phaser a)
                         (clj->phaser angle))))
  ([a angle as-degrees]
   (phaser->clj
    (.circumferencePoint js/Phaser.Circle
                         (clj->phaser a)
                         (clj->phaser angle)
                         (clj->phaser as-degrees))))
  ([a angle as-degrees out]
   (phaser->clj
    (.circumferencePoint js/Phaser.Circle
                         (clj->phaser a)
                         (clj->phaser angle)
                         (clj->phaser as-degrees)
                         (clj->phaser out)))))

(defn clone
  "Returns a new Circle object with the same values for the x, y, width, and height properties as this Circle object.

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * output (Phaser.Circle) - Optional Circle object. If given the values will be set into the object, otherwise a brand new Circle object will be created and returned.

  Returns:  Phaser.Circle - The cloned Circle object."
  ([circle output]
   (phaser->clj
    (.clone circle
            (clj->phaser output)))))

(defn contains
  "Return true if the given x/y coordinates are within this Circle object.

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * x (number) - The X value of the coordinate to test.
    * y (number) - The Y value of the coordinate to test.

  Returns:  boolean - True if the coordinates are within this circle, otherwise false."
  ([circle x y]
   (phaser->clj
    (.contains circle
               (clj->phaser x)
               (clj->phaser y)))))

(defn contains-
  "Return true if the given x/y coordinates are within the Circle object.

  Parameters:
    * a (Phaser.Circle) - The Circle to be checked.
    * x (number) - The X value of the coordinate to test.
    * y (number) - The Y value of the coordinate to test.

  Returns:  boolean - True if the coordinates are within this circle, otherwise false."
  ([a x y]
   (phaser->clj
    (.contains js/Phaser.Circle
               (clj->phaser a)
               (clj->phaser x)
               (clj->phaser y)))))

(defn copy-from
  "Copies the x, y and diameter properties from any given object to this Circle.

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * source (any) - The object to copy from.

  Returns:  Circle - This Circle object."
  ([circle source]
   (phaser->clj
    (.copyFrom circle
               (clj->phaser source)))))

(defn copy-to
  "Copies the x, y and diameter properties from this Circle to any given object.

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * dest (any) - The object to copy to.

  Returns:  object - This dest object."
  ([circle dest]
   (phaser->clj
    (.copyTo circle
             (clj->phaser dest)))))

(defn distance
  "Returns the distance from the center of the Circle object to the given object
  (can be Circle, Point or anything with x/y properties)

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * dest (object) - The target object. Must have visible x and y properties that represent the center of the object.
    * round (boolean) {optional} - Round the distance to the nearest integer.

  Returns:  number - The distance between this Point object and the destination Point object."
  ([circle dest]
   (phaser->clj
    (.distance circle
               (clj->phaser dest))))
  ([circle dest round]
   (phaser->clj
    (.distance circle
               (clj->phaser dest)
               (clj->phaser round)))))

(defn equals-
  "Determines whether the two Circle objects match. This method compares the x, y and diameter properties.

  Parameters:
    * a (Phaser.Circle) - The first Circle object.
    * b (Phaser.Circle) - The second Circle object.

  Returns:  boolean - A value of true if the object has exactly the same values for the x, y and diameter properties as this Circle object; otherwise false."
  ([a b]
   (phaser->clj
    (.equals js/Phaser.Circle
             (clj->phaser a)
             (clj->phaser b)))))

(defn get-bounds
  "Returns the framing rectangle of the circle as a Phaser.Rectangle object.

  Returns:  Phaser.Rectangle - The bounds of the Circle."
  ([circle]
   (phaser->clj
    (.getBounds circle))))

(defn intersects-
  "Determines whether the two Circle objects intersect.
  This method checks the radius distances between the two Circle objects to see if they intersect.

  Parameters:
    * a (Phaser.Circle) - The first Circle object.
    * b (Phaser.Circle) - The second Circle object.

  Returns:  boolean - A value of true if the specified object intersects with this Circle object; otherwise false."
  ([a b]
   (phaser->clj
    (.intersects js/Phaser.Circle
                 (clj->phaser a)
                 (clj->phaser b)))))

(defn intersects-rectangle-
  "Checks if the given Circle and Rectangle objects intersect.

  Parameters:
    * c (Phaser.Circle) - The Circle object to test.
    * r (Phaser.Rectangle) - The Rectangle object to test.

  Returns:  boolean - True if the two objects intersect, otherwise false."
  ([c r]
   (phaser->clj
    (.intersectsRectangle js/Phaser.Circle
                          (clj->phaser c)
                          (clj->phaser r)))))

(defn offset
  "Adjusts the location of the Circle object, as determined by its center coordinate, by the specified amounts.

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * dx (number) - Moves the x value of the Circle object by this amount.
    * dy (number) - Moves the y value of the Circle object by this amount.

  Returns:  Circle - This Circle object."
  ([circle dx dy]
   (phaser->clj
    (.offset circle
             (clj->phaser dx)
             (clj->phaser dy)))))

(defn offset-point
  "Adjusts the location of the Circle object using a Point object as a parameter. This method is similar to the Circle.offset() method, except that it takes a Point object as a parameter.

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * point (Point) - A Point object to use to offset this Circle object (or any valid object with exposed x and y properties).

  Returns:  Circle - This Circle object."
  ([circle point]
   (phaser->clj
    (.offsetPoint circle
                  (clj->phaser point)))))

(defn random
  "Returns a uniformly distributed random point from anywhere within this Circle.

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * out (Phaser.Point | object) {optional} - A Phaser.Point, or any object with public x/y properties, that the values will be set in.
    If no object is provided a new Phaser.Point object will be created. In high performance areas avoid this by re-using an existing object.

  Returns:  Phaser.Point - An object containing the random point in its `x` and `y` properties."
  ([circle]
   (phaser->clj
    (.random circle)))
  ([circle out]
   (phaser->clj
    (.random circle
             (clj->phaser out)))))

(defn set-to
  "Sets the members of Circle to the specified values.

  Parameters:
    * circle (Phaser.Circle) - Targeted instance for method
    * x (number) - The x coordinate of the center of the circle.
    * y (number) - The y coordinate of the center of the circle.
    * diameter (number) - The diameter of the circle.

  Returns:  Circle - This circle object."
  ([circle x y diameter]
   (phaser->clj
    (.setTo circle
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser diameter)))))

(defn to-string
  "Returns a string representation of this object.

  Returns:  string - a string representation of the instance."
  ([circle]
   (phaser->clj
    (.toString circle))))