(ns phzr.point
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [set divide clone]))

(defn ->Point
  "A Point object represents a location in a two-dimensional coordinate system, where x represents the horizontal axis and y represents the vertical axis.
  The following code creates a point at (0,0):
  `var myPoint = new Phaser.Point();`
  You can also use them as 2D Vectors and you'll find different vector related methods in this class.

  Parameters:
    * x (number) {optional} - The horizontal position of this Point.
    * y (number) {optional} - The vertical position of this Point."
  ([]
   (js/Phaser.Point.))
  ([x]
   (js/Phaser.Point. (clj->phaser x)))
  ([x y]
   (js/Phaser.Point. (clj->phaser x)
                     (clj->phaser y))))

(defn add
  "Adds the given x and y values to this Point.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * x (number) - The value to add to Point.x.
    * y (number) - The value to add to Point.y.

  Returns:  Phaser.Point - This Point object. Useful for chaining method calls."
  ([point x y]
   (phaser->clj
    (.add point
          (clj->phaser x)
          (clj->phaser y)))))

(defn add-
  "Adds the coordinates of two points together to create a new point.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a b]
   (phaser->clj
    (.add js/Phaser.Point
          (clj->phaser a)
          (clj->phaser b))))
  ([a b out]
   (phaser->clj
    (.add js/Phaser.Point
          (clj->phaser a)
          (clj->phaser b)
          (clj->phaser out)))))

(defn angle
  "Returns the angle between this Point object and another object with public x and y properties.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * a (Phaser.Point | any) - The object to get the angle from this Point to.
    * as-degrees (boolean) {optional} - Is the given angle in radians (false) or degrees (true)?

  Returns:  number - The angle between the two objects."
  ([point a]
   (phaser->clj
    (.angle point
            (clj->phaser a))))
  ([point a as-degrees]
   (phaser->clj
    (.angle point
            (clj->phaser a)
            (clj->phaser as-degrees)))))

(defn angle-
  "Returns the angle between two Point objects.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.

  Returns:  number - The angle between the two Points."
  ([a b]
   (phaser->clj
    (.angle js/Phaser.Point
            (clj->phaser a)
            (clj->phaser b)))))

(defn ceil
  "Math.ceil() both the x and y properties of this Point.

  Returns:  Phaser.Point - This Point object."
  ([point]
   (phaser->clj
    (.ceil point))))

(defn centroid-
  "Calculates centroid (or midpoint) from an array of points. If only one point is provided, that point is returned.

  Parameters:
    * points (Array.<Phaser.Point>) - The array of one or more points.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([points]
   (phaser->clj
    (.centroid js/Phaser.Point
               (clj->phaser points))))
  ([points out]
   (phaser->clj
    (.centroid js/Phaser.Point
               (clj->phaser points)
               (clj->phaser out)))))

(defn clamp
  "Clamps this Point object values to be between the given min and max.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * min (number) - The minimum value to clamp this Point to.
    * max (number) - The maximum value to clamp this Point to.

  Returns:  Phaser.Point - This Point object."
  ([point min max]
   (phaser->clj
    (.clamp point
            (clj->phaser min)
            (clj->phaser max)))))

(defn clamp-x
  "Clamps the x value of this Point to be between the given min and max.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * min (number) - The minimum value to clamp this Point to.
    * max (number) - The maximum value to clamp this Point to.

  Returns:  Phaser.Point - This Point object."
  ([point min max]
   (phaser->clj
    (.clampX point
             (clj->phaser min)
             (clj->phaser max)))))

(defn clamp-y
  "Clamps the y value of this Point to be between the given min and max

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * min (number) - The minimum value to clamp this Point to.
    * max (number) - The maximum value to clamp this Point to.

  Returns:  Phaser.Point - This Point object."
  ([point min max]
   (phaser->clj
    (.clampY point
             (clj->phaser min)
             (clj->phaser max)))))

(defn clone
  "Creates a copy of the given Point.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * output (Phaser.Point) {optional} - Optional Point object. If given the values will be set into this object, otherwise a brand new Point object will be created and returned.

  Returns:  Phaser.Point - The new Point object."
  ([point]
   (phaser->clj
    (.clone point)))
  ([point output]
   (phaser->clj
    (.clone point
            (clj->phaser output)))))

(defn copy-from
  "Copies the x and y properties from any given object to this Point.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * source (any) - The object to copy from.

  Returns:  Phaser.Point - This Point object."
  ([point source]
   (phaser->clj
    (.copyFrom point
               (clj->phaser source)))))

(defn copy-to
  "Copies the x and y properties from this Point to any given object.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * dest (any) - The object to copy to.

  Returns:  object - The dest object."
  ([point dest]
   (phaser->clj
    (.copyTo point
             (clj->phaser dest)))))

(defn cross
  "The cross product of this and another Point object.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * a (Phaser.Point) - The Point object to get the cross product combined with this Point.

  Returns:  number - The result."
  ([point a]
   (phaser->clj
    (.cross point
            (clj->phaser a)))))

(defn distance
  "Returns the distance of this Point object to the given object (can be a Circle, Point or anything with x/y properties)

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * dest (object) - The target object. Must have visible x and y properties that represent the center of the object.
    * round (boolean) {optional} - Round the distance to the nearest integer (default false).

  Returns:  number - The distance between this Point object and the destination Point object."
  ([point dest]
   (phaser->clj
    (.distance point
               (clj->phaser dest))))
  ([point dest round]
   (phaser->clj
    (.distance point
               (clj->phaser dest)
               (clj->phaser round)))))

(defn distance-
  "Returns the euclidian distance of this Point object to the given object (can be a Circle, Point or anything with x/y properties).

  Parameters:
    * a (object) - The target object. Must have visible x and y properties that represent the center of the object.
    * b (object) - The target object. Must have visible x and y properties that represent the center of the object.
    * round (boolean) {optional} - Round the distance to the nearest integer.

  Returns:  number - The distance between this Point object and the destination Point object."
  ([a b]
   (phaser->clj
    (.distance js/Phaser.Point
               (clj->phaser a)
               (clj->phaser b))))
  ([a b round]
   (phaser->clj
    (.distance js/Phaser.Point
               (clj->phaser a)
               (clj->phaser b)
               (clj->phaser round)))))

(defn divide
  "Divides Point.x and Point.y by the given x and y values.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * x (number) - The value to divide Point.x by.
    * y (number) - The value to divide Point.x by.

  Returns:  Phaser.Point - This Point object. Useful for chaining method calls."
  ([point x y]
   (phaser->clj
    (.divide point
             (clj->phaser x)
             (clj->phaser y)))))

(defn divide-
  "Divides the coordinates of two points to create a new point.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a b]
   (phaser->clj
    (.divide js/Phaser.Point
             (clj->phaser a)
             (clj->phaser b))))
  ([a b out]
   (phaser->clj
    (.divide js/Phaser.Point
             (clj->phaser a)
             (clj->phaser b)
             (clj->phaser out)))))

(defn dot
  "The dot product of this and another Point object.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * a (Phaser.Point) - The Point object to get the dot product combined with this Point.

  Returns:  number - The result."
  ([point a]
   (phaser->clj
    (.dot point
          (clj->phaser a)))))

(defn equals
  "Determines whether the given objects x/y values are equal to this Point object.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * a (Phaser.Point | any) - The object to compare with this Point.

  Returns:  boolean - A value of true if the x and y points are equal, otherwise false."
  ([point a]
   (phaser->clj
    (.equals point
             (clj->phaser a)))))

(defn equals-
  "Determines whether the two given Point objects are equal. They are considered equal if they have the same x and y values.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.

  Returns:  boolean - A value of true if the Points are equal, otherwise false."
  ([a b]
   (phaser->clj
    (.equals js/Phaser.Point
             (clj->phaser a)
             (clj->phaser b)))))

(defn floor
  "Math.floor() both the x and y properties of this Point.

  Returns:  Phaser.Point - This Point object."
  ([point]
   (phaser->clj
    (.floor point))))

(defn get-magnitude
  "Calculates the length of the Point object.

  Returns:  number - The length of the Point."
  ([point]
   (phaser->clj
    (.getMagnitude point))))

(defn get-magnitude-sq
  "Calculates the length squared of the Point object.

  Returns:  number - The length ^ 2 of the Point."
  ([point]
   (phaser->clj
    (.getMagnitudeSq point))))

(defn interpolate-
  "Interpolates the two given Points, based on the `f` value (between 0 and 1) and returns a new Point.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.
    * f (number) - The level of interpolation between the two points. Indicates where the new point will be, along the line between pt1 and pt2. If f=1, pt1 is returned; if f=0, pt2 is returned.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a b f]
   (phaser->clj
    (.interpolate js/Phaser.Point
                  (clj->phaser a)
                  (clj->phaser b)
                  (clj->phaser f))))
  ([a b f out]
   (phaser->clj
    (.interpolate js/Phaser.Point
                  (clj->phaser a)
                  (clj->phaser b)
                  (clj->phaser f)
                  (clj->phaser out)))))

(defn invert
  "Inverts the x and y values of this Point

  Returns:  Phaser.Point - This Point object."
  ([point]
   (phaser->clj
    (.invert point))))

(defn is-zero
  "Determine if this point is at 0,0.

  Returns:  boolean - True if this Point is 0,0, otherwise false."
  ([point]
   (phaser->clj
    (.isZero point))))

(defn multiply
  "Multiplies Point.x and Point.y by the given x and y values. Sometimes known as `Scale`.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * x (number) - The value to multiply Point.x by.
    * y (number) - The value to multiply Point.x by.

  Returns:  Phaser.Point - This Point object. Useful for chaining method calls."
  ([point x y]
   (phaser->clj
    (.multiply point
               (clj->phaser x)
               (clj->phaser y)))))

(defn multiply-
  "Multiplies the coordinates of two points to create a new point.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a b]
   (phaser->clj
    (.multiply js/Phaser.Point
               (clj->phaser a)
               (clj->phaser b))))
  ([a b out]
   (phaser->clj
    (.multiply js/Phaser.Point
               (clj->phaser a)
               (clj->phaser b)
               (clj->phaser out)))))

(defn multiply-add-
  "Adds two 2D Points together and multiplies the result by the given scalar.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.
    * s (number) - The scaling value.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a b s]
   (phaser->clj
    (.multiplyAdd js/Phaser.Point
                  (clj->phaser a)
                  (clj->phaser b)
                  (clj->phaser s))))
  ([a b s out]
   (phaser->clj
    (.multiplyAdd js/Phaser.Point
                  (clj->phaser a)
                  (clj->phaser b)
                  (clj->phaser s)
                  (clj->phaser out)))))

(defn negative-
  "Creates a negative Point.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a]
   (phaser->clj
    (.negative js/Phaser.Point
               (clj->phaser a))))
  ([a out]
   (phaser->clj
    (.negative js/Phaser.Point
               (clj->phaser a)
               (clj->phaser out)))))

(defn normal-right-hand
  "Right-hand normalize (make unit length) this Point.

  Returns:  Phaser.Point - This Point object."
  ([point]
   (phaser->clj
    (.normalRightHand point))))

(defn normal-right-hand-
  "Right-hand normalize (make unit length) a Point.

  Parameters:
    * a (Phaser.Point) - The Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a]
   (phaser->clj
    (.normalRightHand js/Phaser.Point
                      (clj->phaser a))))
  ([a out]
   (phaser->clj
    (.normalRightHand js/Phaser.Point
                      (clj->phaser a)
                      (clj->phaser out)))))

(defn normalize
  "Alters the Point object so that its length is 1, but it retains the same direction.

  Returns:  Phaser.Point - This Point object."
  ([point]
   (phaser->clj
    (.normalize point))))

(defn normalize-
  "Normalize (make unit length) a Point.

  Parameters:
    * a (Phaser.Point) - The Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a]
   (phaser->clj
    (.normalize js/Phaser.Point
                (clj->phaser a))))
  ([a out]
   (phaser->clj
    (.normalize js/Phaser.Point
                (clj->phaser a)
                (clj->phaser out)))))

(defn parse-
  "Parses an object for x and/or y properties and returns a new Phaser.Point with matching values.
  If the object doesn't contain those properties a Point with x/y of zero will be returned.

  Parameters:
    * obj (object) - The object to parse.
    * x-prop (string) {optional} - The property used to set the Point.x value.
    * y-prop (string) {optional} - The property used to set the Point.y value.

  Returns:  Phaser.Point - The new Point object."
  ([obj]
   (phaser->clj
    (.parse js/Phaser.Point
            (clj->phaser obj))))
  ([obj x-prop]
   (phaser->clj
    (.parse js/Phaser.Point
            (clj->phaser obj)
            (clj->phaser x-prop))))
  ([obj x-prop y-prop]
   (phaser->clj
    (.parse js/Phaser.Point
            (clj->phaser obj)
            (clj->phaser x-prop)
            (clj->phaser y-prop)))))

(defn perp
  "Make this Point perpendicular (90 degrees rotation)

  Returns:  Phaser.Point - This Point object."
  ([point]
   (phaser->clj
    (.perp point))))

(defn perp-
  "Return a perpendicular vector (90 degrees rotation)

  Parameters:
    * a (Phaser.Point) - The Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a]
   (phaser->clj
    (.perp js/Phaser.Point
           (clj->phaser a))))
  ([a out]
   (phaser->clj
    (.perp js/Phaser.Point
           (clj->phaser a)
           (clj->phaser out)))))

(defn project-
  "Project two Points onto another Point.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a b]
   (phaser->clj
    (.project js/Phaser.Point
              (clj->phaser a)
              (clj->phaser b))))
  ([a b out]
   (phaser->clj
    (.project js/Phaser.Point
              (clj->phaser a)
              (clj->phaser b)
              (clj->phaser out)))))

(defn project-unit-
  "Project two Points onto a Point of unit length.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a b]
   (phaser->clj
    (.projectUnit js/Phaser.Point
                  (clj->phaser a)
                  (clj->phaser b))))
  ([a b out]
   (phaser->clj
    (.projectUnit js/Phaser.Point
                  (clj->phaser a)
                  (clj->phaser b)
                  (clj->phaser out)))))

(defn rotate
  "Rotates this Point around the x/y coordinates given to the desired angle.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * x (number) - The x coordinate of the anchor point.
    * y (number) - The y coordinate of the anchor point.
    * angle (number) - The angle in radians (unless asDegrees is true) to rotate the Point to.
    * as-degrees (boolean) {optional} - Is the given angle in radians (false) or degrees (true)?
    * distance (number) {optional} - An optional distance constraint between the Point and the anchor.

  Returns:  Phaser.Point - The modified point object."
  ([point x y angle]
   (phaser->clj
    (.rotate point
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser angle))))
  ([point x y angle as-degrees]
   (phaser->clj
    (.rotate point
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser angle)
             (clj->phaser as-degrees))))
  ([point x y angle as-degrees distance]
   (phaser->clj
    (.rotate point
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser angle)
             (clj->phaser as-degrees)
             (clj->phaser distance)))))

(defn rotate-
  "Rotates a Point object, or any object with exposed x/y properties, around the given coordinates by
  the angle specified. If the angle between the point and coordinates was 45 deg and the angle argument
  is 45 deg then the resulting angle will be 90 deg, as the angle argument is added to the current angle.

  The distance allows you to specify a distance constraint for the rotation between the point and the 
  coordinates. If none is given the distance between the two is calculated and used.

  Parameters:
    * a (Phaser.Point) - The Point object to rotate.
    * x (number) - The x coordinate of the anchor point
    * y (number) - The y coordinate of the anchor point
    * angle (number) - The angle in radians (unless asDegrees is true) to rotate the Point by.
    * as-degrees (boolean) {optional} - Is the given angle in radians (false) or degrees (true)?
    * distance (number) {optional} - An optional distance constraint between the Point and the anchor.

  Returns:  Phaser.Point - The modified point object."
  ([a x y angle]
   (phaser->clj
    (.rotate js/Phaser.Point
             (clj->phaser a)
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser angle))))
  ([a x y angle as-degrees]
   (phaser->clj
    (.rotate js/Phaser.Point
             (clj->phaser a)
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser angle)
             (clj->phaser as-degrees))))
  ([a x y angle as-degrees distance]
   (phaser->clj
    (.rotate js/Phaser.Point
             (clj->phaser a)
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser angle)
             (clj->phaser as-degrees)
             (clj->phaser distance)))))

(defn rperp
  "Make this Point perpendicular (-90 degrees rotation)

  Returns:  Phaser.Point - This Point object."
  ([point]
   (phaser->clj
    (.rperp point))))

(defn rperp-
  "Return a perpendicular vector (-90 degrees rotation)

  Parameters:
    * a (Phaser.Point) - The Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a]
   (phaser->clj
    (.rperp js/Phaser.Point
            (clj->phaser a))))
  ([a out]
   (phaser->clj
    (.rperp js/Phaser.Point
            (clj->phaser a)
            (clj->phaser out)))))

(defn set
  "Sets the `x` and `y` values of this Point object to the given values.
  If you omit the `y` value then the `x` value will be applied to both, for example:
  `Point.set(2)` is the same as `Point.set(2, 2)`

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * x (number) - The horizontal value of this point.
    * y (number) {optional} - The vertical value of this point. If not given the x value will be used in its place.

  Returns:  Phaser.Point - This Point object. Useful for chaining method calls."
  ([point x]
   (phaser->clj
    (.set point
          (clj->phaser x))))
  ([point x y]
   (phaser->clj
    (.set point
          (clj->phaser x)
          (clj->phaser y)))))

(defn set-magnitude
  "Alters the length of the Point without changing the direction.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * magnitude (number) - The desired magnitude of the resulting Point.

  Returns:  Phaser.Point - This Point object."
  ([point magnitude]
   (phaser->clj
    (.setMagnitude point
                   (clj->phaser magnitude)))))

(defn set-to
  "Sets the `x` and `y` values of this Point object to the given values.
  If you omit the `y` value then the `x` value will be applied to both, for example:
  `Point.setTo(2)` is the same as `Point.setTo(2, 2)`

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * x (number) - The horizontal value of this point.
    * y (number) {optional} - The vertical value of this point. If not given the x value will be used in its place.

  Returns:  Phaser.Point - This Point object. Useful for chaining method calls."
  ([point x]
   (phaser->clj
    (.setTo point
            (clj->phaser x))))
  ([point x y]
   (phaser->clj
    (.setTo point
            (clj->phaser x)
            (clj->phaser y)))))

(defn subtract
  "Subtracts the given x and y values from this Point.

  Parameters:
    * point (Phaser.Point) - Targeted instance for method
    * x (number) - The value to subtract from Point.x.
    * y (number) - The value to subtract from Point.y.

  Returns:  Phaser.Point - This Point object. Useful for chaining method calls."
  ([point x y]
   (phaser->clj
    (.subtract point
               (clj->phaser x)
               (clj->phaser y)))))

(defn subtract-
  "Subtracts the coordinates of two points to create a new point.

  Parameters:
    * a (Phaser.Point) - The first Point object.
    * b (Phaser.Point) - The second Point object.
    * out (Phaser.Point) {optional} - Optional Point to store the value in, if not supplied a new Point object will be created.

  Returns:  Phaser.Point - The new Point object."
  ([a b]
   (phaser->clj
    (.subtract js/Phaser.Point
               (clj->phaser a)
               (clj->phaser b))))
  ([a b out]
   (phaser->clj
    (.subtract js/Phaser.Point
               (clj->phaser a)
               (clj->phaser b)
               (clj->phaser out)))))

(defn to-string
  "Returns a string representation of this object.

  Returns:  string - A string representation of the instance."
  ([point]
   (phaser->clj
    (.toString point))))