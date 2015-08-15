(ns phzr.ellipse
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [clone]))

(defn ->Ellipse
  "Creates a Ellipse object. A curve on a plane surrounding two focal points.

  Parameters:
    * x (number) {optional} - The X coordinate of the upper-left corner of the framing rectangle of this ellipse.
    * y (number) {optional} - The Y coordinate of the upper-left corner of the framing rectangle of this ellipse.
    * width (number) {optional} - The overall width of this ellipse.
    * height (number) {optional} - The overall height of this ellipse."
  ([]
   (js/Phaser.Ellipse.))
  ([x]
   (js/Phaser.Ellipse. (clj->phaser x)))
  ([x y]
   (js/Phaser.Ellipse. (clj->phaser x)
                       (clj->phaser y)))
  ([x y width]
   (js/Phaser.Ellipse. (clj->phaser x)
                       (clj->phaser y)
                       (clj->phaser width)))
  ([x y width height]
   (js/Phaser.Ellipse. (clj->phaser x)
                       (clj->phaser y)
                       (clj->phaser width)
                       (clj->phaser height))))

(defn clone
  "Returns a new Ellipse object with the same values for the x, y, width, and height properties as this Ellipse object.

  Parameters:
    * ellipse (Phaser.Ellipse) - Targeted instance for method
    * output (Phaser.Ellipse) - Optional Ellipse object. If given the values will be set into the object, otherwise a brand new Ellipse object will be created and returned.

  Returns:  Phaser.Ellipse - The cloned Ellipse object."
  ([ellipse output]
   (phaser->clj
    (.clone ellipse
            (clj->phaser output)))))

(defn contains
  "Return true if the given x/y coordinates are within this Ellipse object.

  Parameters:
    * ellipse (Phaser.Ellipse) - Targeted instance for method
    * x (number) - The X value of the coordinate to test.
    * y (number) - The Y value of the coordinate to test.

  Returns:  boolean - True if the coordinates are within this ellipse, otherwise false."
  ([ellipse x y]
   (phaser->clj
    (.contains ellipse
               (clj->phaser x)
               (clj->phaser y)))))

(defn contains-
  "Return true if the given x/y coordinates are within the Ellipse object.

  Parameters:
    * a (Phaser.Ellipse) - The Ellipse to be checked.
    * x (number) - The X value of the coordinate to test.
    * y (number) - The Y value of the coordinate to test.

  Returns:  boolean - True if the coordinates are within this ellipse, otherwise false."
  ([a x y]
   (phaser->clj
    (.contains js/Phaser.Ellipse
               (clj->phaser a)
               (clj->phaser x)
               (clj->phaser y)))))

(defn copy-from
  "Copies the x, y, width and height properties from any given object to this Ellipse.

  Parameters:
    * ellipse (Phaser.Ellipse) - Targeted instance for method
    * source (any) - The object to copy from.

  Returns:  Phaser.Ellipse - This Ellipse object."
  ([ellipse source]
   (phaser->clj
    (.copyFrom ellipse
               (clj->phaser source)))))

(defn copy-to
  "Copies the x, y, width and height properties from this Ellipse to any given object.

  Parameters:
    * ellipse (Phaser.Ellipse) - Targeted instance for method
    * dest (any) - The object to copy to.

  Returns:  object - This dest object."
  ([ellipse dest]
   (phaser->clj
    (.copyTo ellipse
             (clj->phaser dest)))))

(defn get-bounds
  "Returns the framing rectangle of the ellipse as a Phaser.Rectangle object.

  Returns:  Phaser.Rectangle - The bounds of the Ellipse."
  ([ellipse]
   (phaser->clj
    (.getBounds ellipse))))

(defn random
  "Returns a uniformly distributed random point from anywhere within this Ellipse.

  Parameters:
    * ellipse (Phaser.Ellipse) - Targeted instance for method
    * out (Phaser.Point | object) {optional} - A Phaser.Point, or any object with public x/y properties, that the values will be set in.
    If no object is provided a new Phaser.Point object will be created. In high performance areas avoid this by re-using an existing object.

  Returns:  Phaser.Point - An object containing the random point in its `x` and `y` properties."
  ([ellipse]
   (phaser->clj
    (.random ellipse)))
  ([ellipse out]
   (phaser->clj
    (.random ellipse
             (clj->phaser out)))))

(defn set-to
  "Sets the members of the Ellipse to the specified values.

  Parameters:
    * ellipse (Phaser.Ellipse) - Targeted instance for method
    * x (number) - The X coordinate of the upper-left corner of the framing rectangle of this ellipse.
    * y (number) - The Y coordinate of the upper-left corner of the framing rectangle of this ellipse.
    * width (number) - The overall width of this ellipse.
    * height (number) - The overall height of this ellipse.

  Returns:  Phaser.Ellipse - This Ellipse object."
  ([ellipse x y width height]
   (phaser->clj
    (.setTo ellipse
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser width)
            (clj->phaser height)))))

(defn to-string
  "Returns a string representation of this object.

  Returns:  string - A string representation of the instance."
  ([ellipse]
   (phaser->clj
    (.toString ellipse))))