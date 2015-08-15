(ns phzr.polygon
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [flatten clone]))

(defn ->Polygon
  "Creates a new Polygon.

  The points can be set from a variety of formats:

  - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
  - An array of objects with public x/y properties: `[obj1, obj2, ...]`
  - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
  - As separate Point arguments: `setTo(new Phaser.Point(x1, y1), ...)`
  - As separate objects with public x/y properties arguments: `setTo(obj1, obj2, ...)`
  - As separate arguments representing point coordinates: `setTo(x1,y1, x2,y2, ...)`

  Parameters:
    * points (Array.<Phaser.Point> | Array.<number> | Phaser.Point | number) - The points to set."
  ([points]
   (js/Phaser.Polygon. (clj->phaser points))))

(defn clone
  "Creates a copy of the given Polygon.
  This is a deep clone, the resulting copy contains new Phaser.Point objects

  Parameters:
    * polygon (Phaser.Polygon) - Targeted instance for method
    * output (Phaser.Polygon) {optional} - The polygon to update. If not specified a new polygon will be created.

  Returns:  Phaser.Polygon - The cloned (`output`) polygon object."
  ([polygon]
   (phaser->clj
    (.clone polygon)))
  ([polygon output]
   (phaser->clj
    (.clone polygon
            (clj->phaser output)))))

(defn contains
  "Checks whether the x and y coordinates are contained within this polygon.

  Parameters:
    * polygon (Phaser.Polygon) - Targeted instance for method
    * x (number) - The X value of the coordinate to test.
    * y (number) - The Y value of the coordinate to test.

  Returns:  boolean - True if the coordinates are within this polygon, otherwise false."
  ([polygon x y]
   (phaser->clj
    (.contains polygon
               (clj->phaser x)
               (clj->phaser y)))))

(defn flatten
  "Flattens this Polygon so the points are a sequence of numbers. Any Point objects found are removed and replaced with two numbers.

  Returns:  Phaser.Polygon - This Polygon object"
  ([polygon]
   (phaser->clj
    (.flatten polygon))))

(defn set-to
  "Sets this Polygon to the given points.

  The points can be set from a variety of formats:

  - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
  - An array of objects with public x/y properties: `[obj1, obj2, ...]`
  - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
  - As separate Point arguments: `setTo(new Phaser.Point(x1, y1), ...)`
  - As separate objects with public x/y properties arguments: `setTo(obj1, obj2, ...)`
  - As separate arguments representing point coordinates: `setTo(x1,y1, x2,y2, ...)`

  `setTo` may also be called without any arguments to remove all points.

  Parameters:
    * polygon (Phaser.Polygon) - Targeted instance for method
    * points (Array.<Phaser.Point> | Array.<number> | Phaser.Point | number) - The points to set.

  Returns:  Phaser.Polygon - This Polygon object"
  ([polygon points]
   (phaser->clj
    (.setTo polygon
            (clj->phaser points)))))

(defn to-number-array
  "Export the points as an array of flat numbers, following the sequence [ x,y, x,y, x,y ]

  Parameters:
    * polygon (Phaser.Polygon) - Targeted instance for method
    * output (array) {optional} - The array to append the points to. If not specified a new array will be created.

  Returns:  array - The flattened array."
  ([polygon]
   (phaser->clj
    (.toNumberArray polygon)))
  ([polygon output]
   (phaser->clj
    (.toNumberArray polygon
                    (clj->phaser output)))))