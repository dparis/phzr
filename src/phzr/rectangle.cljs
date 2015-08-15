(ns phzr.rectangle
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [clone]))

(defn ->Rectangle
  "Creates a new Rectangle object with the top-left corner specified by the x and y parameters and with the specified width and height parameters.
  If you call this function without parameters, a Rectangle with x, y, width, and height properties set to 0 is created.

  Parameters:
    * x (number) - The x coordinate of the top-left corner of the Rectangle.
    * y (number) - The y coordinate of the top-left corner of the Rectangle.
    * width (number) - The width of the Rectangle. Should always be either zero or a positive value.
    * height (number) - The height of the Rectangle. Should always be either zero or a positive value."
  ([x y width height]
   (js/Phaser.Rectangle. (clj->phaser x)
                         (clj->phaser y)
                         (clj->phaser width)
                         (clj->phaser height))))

(defn aabb
  "Calculates the Axis Aligned Bounding Box (or aabb) from an array of points.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * points (Array.<Phaser.Point>) - The array of one or more points.
    * out (Phaser.Rectangle) {optional} - Optional Rectangle to store the value in, if not supplied a new Rectangle object will be created.

  Returns:  Phaser.Rectangle - The new Rectangle object."
  ([rectangle points]
   (phaser->clj
    (.aabb rectangle
           (clj->phaser points))))
  ([rectangle points out]
   (phaser->clj
    (.aabb rectangle
           (clj->phaser points)
           (clj->phaser out)))))

(defn ceil
  "Runs Math.ceil() on both the x and y values of this Rectangle."
  ([rectangle]
   (phaser->clj
    (.ceil rectangle))))

(defn ceil-all
  "Runs Math.ceil() on the x, y, width and height values of this Rectangle."
  ([rectangle]
   (phaser->clj
    (.ceilAll rectangle))))

(defn center-on
  "Centers this Rectangle so that the center coordinates match the given x and y values.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * x (number) - The x coordinate to place the center of the Rectangle at.
    * y (number) - The y coordinate to place the center of the Rectangle at.

  Returns:  Phaser.Rectangle - This Rectangle object"
  ([rectangle x y]
   (phaser->clj
    (.centerOn rectangle
               (clj->phaser x)
               (clj->phaser y)))))

(defn clone
  "Returns a new Rectangle object with the same values for the x, y, width, and height properties as the original Rectangle object.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * output (Phaser.Rectangle) {optional} - Optional Rectangle object. If given the values will be set into the object, otherwise a brand new Rectangle object will be created and returned.

  Returns:  Phaser.Rectangle - "
  ([rectangle]
   (phaser->clj
    (.clone rectangle)))
  ([rectangle output]
   (phaser->clj
    (.clone rectangle
            (clj->phaser output)))))

(defn clone-
  "Returns a new Rectangle object with the same values for the x, y, width, and height properties as the original Rectangle object.

  Parameters:
    * a (Phaser.Rectangle) - The Rectangle object.
    * output (Phaser.Rectangle) {optional} - Optional Rectangle object. If given the values will be set into the object, otherwise a brand new Rectangle object will be created and returned.

  Returns:  Phaser.Rectangle - "
  ([a]
   (phaser->clj
    (.clone js/Phaser.Rectangle
            (clj->phaser a))))
  ([a output]
   (phaser->clj
    (.clone js/Phaser.Rectangle
            (clj->phaser a)
            (clj->phaser output)))))

(defn contains
  "Determines whether the specified coordinates are contained within the region defined by this Rectangle object.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * x (number) - The x coordinate of the point to test.
    * y (number) - The y coordinate of the point to test.

  Returns:  boolean - A value of true if the Rectangle object contains the specified point; otherwise false."
  ([rectangle x y]
   (phaser->clj
    (.contains rectangle
               (clj->phaser x)
               (clj->phaser y)))))

(defn contains-
  "Determines whether the specified coordinates are contained within the region defined by this Rectangle object.

  Parameters:
    * a (Phaser.Rectangle) - The Rectangle object.
    * x (number) - The x coordinate of the point to test.
    * y (number) - The y coordinate of the point to test.

  Returns:  boolean - A value of true if the Rectangle object contains the specified point; otherwise false."
  ([a x y]
   (phaser->clj
    (.contains js/Phaser.Rectangle
               (clj->phaser a)
               (clj->phaser x)
               (clj->phaser y)))))

(defn contains-point-
  "Determines whether the specified point is contained within the rectangular region defined by this Rectangle object. This method is similar to the Rectangle.contains() method, except that it takes a Point object as a parameter.

  Parameters:
    * a (Phaser.Rectangle) - The Rectangle object.
    * point (Phaser.Point) - The point object being checked. Can be Point or any object with .x and .y values.

  Returns:  boolean - A value of true if the Rectangle object contains the specified point; otherwise false."
  ([a point]
   (phaser->clj
    (.containsPoint js/Phaser.Rectangle
                    (clj->phaser a)
                    (clj->phaser point)))))

(defn contains-raw-
  "Determines whether the specified coordinates are contained within the region defined by the given raw values.

  Parameters:
    * rx (number) - The x coordinate of the top left of the area.
    * ry (number) - The y coordinate of the top left of the area.
    * rw (number) - The width of the area.
    * rh (number) - The height of the area.
    * x (number) - The x coordinate of the point to test.
    * y (number) - The y coordinate of the point to test.

  Returns:  boolean - A value of true if the Rectangle object contains the specified point; otherwise false."
  ([rx ry rw rh x y]
   (phaser->clj
    (.containsRaw js/Phaser.Rectangle
                  (clj->phaser rx)
                  (clj->phaser ry)
                  (clj->phaser rw)
                  (clj->phaser rh)
                  (clj->phaser x)
                  (clj->phaser y)))))

(defn contains-rect
  "Determines whether the first Rectangle object is fully contained within the second Rectangle object.
  A Rectangle object is said to contain another if the second Rectangle object falls entirely within the boundaries of the first.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * b (Phaser.Rectangle) - The second Rectangle object.

  Returns:  boolean - A value of true if the Rectangle object contains the specified point; otherwise false."
  ([rectangle b]
   (phaser->clj
    (.containsRect rectangle
                   (clj->phaser b)))))

(defn contains-rect-
  "Determines whether the first Rectangle object is fully contained within the second Rectangle object.
  A Rectangle object is said to contain another if the second Rectangle object falls entirely within the boundaries of the first.

  Parameters:
    * a (Phaser.Rectangle) - The first Rectangle object.
    * b (Phaser.Rectangle) - The second Rectangle object.

  Returns:  boolean - A value of true if the Rectangle object contains the specified point; otherwise false."
  ([a b]
   (phaser->clj
    (.containsRect js/Phaser.Rectangle
                   (clj->phaser a)
                   (clj->phaser b)))))

(defn copy-from
  "Copies the x, y, width and height properties from any given object to this Rectangle.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * source (any) - The object to copy from.

  Returns:  Phaser.Rectangle - This Rectangle object."
  ([rectangle source]
   (phaser->clj
    (.copyFrom rectangle
               (clj->phaser source)))))

(defn copy-to
  "Copies the x, y, width and height properties from this Rectangle to any given object.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * source (any) - The object to copy to.

  Returns:  object - This object."
  ([rectangle source]
   (phaser->clj
    (.copyTo rectangle
             (clj->phaser source)))))

(defn equals
  "Determines whether the two Rectangles are equal.
  This method compares the x, y, width and height properties of each Rectangle.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * b (Phaser.Rectangle) - The second Rectangle object.

  Returns:  boolean - A value of true if the two Rectangles have exactly the same values for the x, y, width and height properties; otherwise false."
  ([rectangle b]
   (phaser->clj
    (.equals rectangle
             (clj->phaser b)))))

(defn equals-
  "Determines whether the two Rectangles are equal.
  This method compares the x, y, width and height properties of each Rectangle.

  Parameters:
    * a (Phaser.Rectangle) - The first Rectangle object.
    * b (Phaser.Rectangle) - The second Rectangle object.

  Returns:  boolean - A value of true if the two Rectangles have exactly the same values for the x, y, width and height properties; otherwise false."
  ([a b]
   (phaser->clj
    (.equals js/Phaser.Rectangle
             (clj->phaser a)
             (clj->phaser b)))))

(defn floor
  "Runs Math.floor() on both the x and y values of this Rectangle."
  ([rectangle]
   (phaser->clj
    (.floor rectangle))))

(defn floor-all
  "Runs Math.floor() on the x, y, width and height values of this Rectangle."
  ([rectangle]
   (phaser->clj
    (.floorAll rectangle))))

(defn inflate
  "Increases the size of the Rectangle object by the specified amounts. The center point of the Rectangle object stays the same, and its size increases to the left and right by the dx value, and to the top and the bottom by the dy value.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * dx (number) - The amount to be added to the left side of the Rectangle.
    * dy (number) - The amount to be added to the bottom side of the Rectangle.

  Returns:  Phaser.Rectangle - This Rectangle object."
  ([rectangle dx dy]
   (phaser->clj
    (.inflate rectangle
              (clj->phaser dx)
              (clj->phaser dy)))))

(defn inflate-
  "Increases the size of the Rectangle object by the specified amounts. The center point of the Rectangle object stays the same, and its size increases to the left and right by the dx value, and to the top and the bottom by the dy value.

  Parameters:
    * a (Phaser.Rectangle) - The Rectangle object.
    * dx (number) - The amount to be added to the left side of the Rectangle.
    * dy (number) - The amount to be added to the bottom side of the Rectangle.

  Returns:  Phaser.Rectangle - This Rectangle object."
  ([a dx dy]
   (phaser->clj
    (.inflate js/Phaser.Rectangle
              (clj->phaser a)
              (clj->phaser dx)
              (clj->phaser dy)))))

(defn inflate-point-
  "Increases the size of the Rectangle object. This method is similar to the Rectangle.inflate() method except it takes a Point object as a parameter.

  Parameters:
    * a (Phaser.Rectangle) - The Rectangle object.
    * point (Phaser.Point) - The x property of this Point object is used to increase the horizontal dimension of the Rectangle object. The y property is used to increase the vertical dimension of the Rectangle object.

  Returns:  Phaser.Rectangle - The Rectangle object."
  ([a point]
   (phaser->clj
    (.inflatePoint js/Phaser.Rectangle
                   (clj->phaser a)
                   (clj->phaser point)))))

(defn intersection
  "If the Rectangle object specified in the toIntersect parameter intersects with this Rectangle object, returns the area of intersection as a Rectangle object. If the Rectangles do not intersect, this method returns an empty Rectangle object with its properties set to 0.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * b (Phaser.Rectangle) - The second Rectangle object.
    * out (Phaser.Rectangle) - Optional Rectangle object. If given the intersection values will be set into this object, otherwise a brand new Rectangle object will be created and returned.

  Returns:  Phaser.Rectangle - A Rectangle object that equals the area of intersection. If the Rectangles do not intersect, this method returns an empty Rectangle object; that is, a Rectangle with its x, y, width, and height properties set to 0."
  ([rectangle b out]
   (phaser->clj
    (.intersection rectangle
                   (clj->phaser b)
                   (clj->phaser out)))))

(defn intersection-
  "If the Rectangle object specified in the toIntersect parameter intersects with this Rectangle object, returns the area of intersection as a Rectangle object. If the Rectangles do not intersect, this method returns an empty Rectangle object with its properties set to 0.

  Parameters:
    * a (Phaser.Rectangle) - The first Rectangle object.
    * b (Phaser.Rectangle) - The second Rectangle object.
    * output (Phaser.Rectangle) {optional} - Optional Rectangle object. If given the intersection values will be set into this object, otherwise a brand new Rectangle object will be created and returned.

  Returns:  Phaser.Rectangle - A Rectangle object that equals the area of intersection. If the Rectangles do not intersect, this method returns an empty Rectangle object; that is, a Rectangle with its x, y, width, and height properties set to 0."
  ([a b]
   (phaser->clj
    (.intersection js/Phaser.Rectangle
                   (clj->phaser a)
                   (clj->phaser b))))
  ([a b output]
   (phaser->clj
    (.intersection js/Phaser.Rectangle
                   (clj->phaser a)
                   (clj->phaser b)
                   (clj->phaser output)))))

(defn intersects
  "Determines whether this Rectangle and another given Rectangle intersect with each other.
  This method checks the x, y, width, and height properties of the two Rectangles.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * b (Phaser.Rectangle) - The second Rectangle object.

  Returns:  boolean - A value of true if the specified object intersects with this Rectangle object; otherwise false."
  ([rectangle b]
   (phaser->clj
    (.intersects rectangle
                 (clj->phaser b)))))

(defn intersects-
  "Determines whether the two Rectangles intersect with each other.
  This method checks the x, y, width, and height properties of the Rectangles.

  Parameters:
    * a (Phaser.Rectangle) - The first Rectangle object.
    * b (Phaser.Rectangle) - The second Rectangle object.

  Returns:  boolean - A value of true if the specified object intersects with this Rectangle object; otherwise false."
  ([a b]
   (phaser->clj
    (.intersects js/Phaser.Rectangle
                 (clj->phaser a)
                 (clj->phaser b)))))

(defn intersects-raw
  "Determines whether the coordinates given intersects (overlaps) with this Rectangle.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * left (number) - The x coordinate of the left of the area.
    * right (number) - The right coordinate of the area.
    * top (number) - The y coordinate of the area.
    * bottom (number) - The bottom coordinate of the area.
    * tolerance (number) - A tolerance value to allow for an intersection test with padding, default to 0

  Returns:  boolean - A value of true if the specified object intersects with the Rectangle; otherwise false."
  ([rectangle left right top bottom tolerance]
   (phaser->clj
    (.intersectsRaw rectangle
                    (clj->phaser left)
                    (clj->phaser right)
                    (clj->phaser top)
                    (clj->phaser bottom)
                    (clj->phaser tolerance)))))

(defn intersects-raw-
  "Determines whether the object specified intersects (overlaps) with the given values.

  Parameters:
    * left (number) - The x coordinate of the left of the area.
    * right (number) - The right coordinate of the area.
    * top (number) - The y coordinate of the area.
    * bottom (number) - The bottom coordinate of the area.
    * tolerance (number) - A tolerance value to allow for an intersection test with padding, default to 0

  Returns:  boolean - A value of true if the specified object intersects with the Rectangle; otherwise false."
  ([left right top bottom tolerance]
   (phaser->clj
    (.intersectsRaw js/Phaser.Rectangle
                    (clj->phaser left)
                    (clj->phaser right)
                    (clj->phaser top)
                    (clj->phaser bottom)
                    (clj->phaser tolerance)))))

(defn offset
  "Adjusts the location of the Rectangle object, as determined by its top-left corner, by the specified amounts.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * dx (number) - Moves the x value of the Rectangle object by this amount.
    * dy (number) - Moves the y value of the Rectangle object by this amount.

  Returns:  Phaser.Rectangle - This Rectangle object."
  ([rectangle dx dy]
   (phaser->clj
    (.offset rectangle
             (clj->phaser dx)
             (clj->phaser dy)))))

(defn offset-point
  "Adjusts the location of the Rectangle object using a Point object as a parameter. This method is similar to the Rectangle.offset() method, except that it takes a Point object as a parameter.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * point (Phaser.Point) - A Point object to use to offset this Rectangle object.

  Returns:  Phaser.Rectangle - This Rectangle object."
  ([rectangle point]
   (phaser->clj
    (.offsetPoint rectangle
                  (clj->phaser point)))))

(defn random
  "Returns a uniformly distributed random point from anywhere within this Rectangle.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * out (Phaser.Point | object) {optional} - A Phaser.Point, or any object with public x/y properties, that the values will be set in.
    If no object is provided a new Phaser.Point object will be created. In high performance areas avoid this by re-using an existing object.

  Returns:  Phaser.Point - An object containing the random point in its `x` and `y` properties."
  ([rectangle]
   (phaser->clj
    (.random rectangle)))
  ([rectangle out]
   (phaser->clj
    (.random rectangle
             (clj->phaser out)))))

(defn resize
  "Resize the Rectangle by providing a new width and height.
  The x and y positions remain unchanged.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * width (number) - The width of the Rectangle. Should always be either zero or a positive value.
    * height (number) - The height of the Rectangle. Should always be either zero or a positive value.

  Returns:  Phaser.Rectangle - This Rectangle object"
  ([rectangle width height]
   (phaser->clj
    (.resize rectangle
             (clj->phaser width)
             (clj->phaser height)))))

(defn same-dimensions-
  "Determines if the two objects (either Rectangles or Rectangle-like) have the same width and height values under strict equality.

  Parameters:
    * a (Rectangle-like) - The first Rectangle object.
    * b (Rectangle-like) - The second Rectangle object.

  Returns:  boolean - True if the object have equivalent values for the width and height properties."
  ([a b]
   (phaser->clj
    (.sameDimensions js/Phaser.Rectangle
                     (clj->phaser a)
                     (clj->phaser b)))))

(defn scale
  "Scales the width and height of this Rectangle by the given amounts.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * x (number) - The amount to scale the width of the Rectangle by. A value of 0.5 would reduce by half, a value of 2 would double the width, etc.
    * y (number) {optional} - The amount to scale the height of the Rectangle by. A value of 0.5 would reduce by half, a value of 2 would double the height, etc.

  Returns:  Phaser.Rectangle - This Rectangle object"
  ([rectangle x]
   (phaser->clj
    (.scale rectangle
            (clj->phaser x))))
  ([rectangle x y]
   (phaser->clj
    (.scale rectangle
            (clj->phaser x)
            (clj->phaser y)))))

(defn set-to
  "Sets the members of Rectangle to the specified values.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * x (number) - The x coordinate of the top-left corner of the Rectangle.
    * y (number) - The y coordinate of the top-left corner of the Rectangle.
    * width (number) - The width of the Rectangle. Should always be either zero or a positive value.
    * height (number) - The height of the Rectangle. Should always be either zero or a positive value.

  Returns:  Phaser.Rectangle - This Rectangle object"
  ([rectangle x y width height]
   (phaser->clj
    (.setTo rectangle
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser width)
            (clj->phaser height)))))

(defn size
  "The size of the Rectangle object, expressed as a Point object with the values of the width and height properties.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * output (Phaser.Point) {optional} - Optional Point object. If given the values will be set into the object, otherwise a brand new Point object will be created and returned.

  Returns:  Phaser.Point - The size of the Rectangle object."
  ([rectangle]
   (phaser->clj
    (.size rectangle)))
  ([rectangle output]
   (phaser->clj
    (.size rectangle
           (clj->phaser output)))))

(defn size-
  "The size of the Rectangle object, expressed as a Point object with the values of the width and height properties.

  Parameters:
    * a (Phaser.Rectangle) - The Rectangle object.
    * output (Phaser.Point) {optional} - Optional Point object. If given the values will be set into the object, otherwise a brand new Point object will be created and returned.

  Returns:  Phaser.Point - The size of the Rectangle object"
  ([a]
   (phaser->clj
    (.size js/Phaser.Rectangle
           (clj->phaser a))))
  ([a output]
   (phaser->clj
    (.size js/Phaser.Rectangle
           (clj->phaser a)
           (clj->phaser output)))))

(defn to-string
  "Returns a string representation of this object.

  Returns:  string - A string representation of the instance."
  ([rectangle]
   (phaser->clj
    (.toString rectangle))))

(defn union
  "Adds two Rectangles together to create a new Rectangle object, by filling in the horizontal and vertical space between the two Rectangles.

  Parameters:
    * rectangle (Phaser.Rectangle) - Targeted instance for method
    * b (Phaser.Rectangle) - The second Rectangle object.
    * out (Phaser.Rectangle) {optional} - Optional Rectangle object. If given the new values will be set into this object, otherwise a brand new Rectangle object will be created and returned.

  Returns:  Phaser.Rectangle - A Rectangle object that is the union of the two Rectangles."
  ([rectangle b]
   (phaser->clj
    (.union rectangle
            (clj->phaser b))))
  ([rectangle b out]
   (phaser->clj
    (.union rectangle
            (clj->phaser b)
            (clj->phaser out)))))

(defn union-
  "Adds two Rectangles together to create a new Rectangle object, by filling in the horizontal and vertical space between the two Rectangles.

  Parameters:
    * a (Phaser.Rectangle) - The first Rectangle object.
    * b (Phaser.Rectangle) - The second Rectangle object.
    * output (Phaser.Rectangle) {optional} - Optional Rectangle object. If given the new values will be set into this object, otherwise a brand new Rectangle object will be created and returned.

  Returns:  Phaser.Rectangle - A Rectangle object that is the union of the two Rectangles."
  ([a b]
   (phaser->clj
    (.union js/Phaser.Rectangle
            (clj->phaser a)
            (clj->phaser b))))
  ([a b output]
   (phaser->clj
    (.union js/Phaser.Rectangle
            (clj->phaser a)
            (clj->phaser b)
            (clj->phaser output)))))