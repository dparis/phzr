(ns phzr.rounded-rectangle
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [clone]))

(defn ->RoundedRectangle
  "The Rounded Rectangle object is an area defined by its position and has nice rounded corners, 
  as indicated by its top-left corner point (x, y) and by its width and its height.

  Parameters:
    * x (number) {optional} - The x coordinate of the top-left corner of the Rectangle.
    * y (number) {optional} - The y coordinate of the top-left corner of the Rectangle.
    * width (number) {optional} - The width of the Rectangle. Should always be either zero or a positive value.
    * height (number) {optional} - The height of the Rectangle. Should always be either zero or a positive value.
    * radius (number) {optional} - Controls the radius of the rounded corners."
  ([]
   (js/Phaser.RoundedRectangle.))
  ([x]
   (js/Phaser.RoundedRectangle. (clj->phaser x)))
  ([x y]
   (js/Phaser.RoundedRectangle. (clj->phaser x)
                                (clj->phaser y)))
  ([x y width]
   (js/Phaser.RoundedRectangle. (clj->phaser x)
                                (clj->phaser y)
                                (clj->phaser width)))
  ([x y width height]
   (js/Phaser.RoundedRectangle. (clj->phaser x)
                                (clj->phaser y)
                                (clj->phaser width)
                                (clj->phaser height)))
  ([x y width height radius]
   (js/Phaser.RoundedRectangle. (clj->phaser x)
                                (clj->phaser y)
                                (clj->phaser width)
                                (clj->phaser height)
                                (clj->phaser radius))))

(defn clone
  "Returns a new RoundedRectangle object with the same values for the x, y, width, height and
  radius properties as this RoundedRectangle object.

  Returns:  Phaser.RoundedRectangle - "
  ([rounded-rectangle]
   (phaser->clj
    (.clone rounded-rectangle))))

(defn contains
  "Determines whether the specified coordinates are contained within the region defined by this Rounded Rectangle object.

  Parameters:
    * rounded-rectangle (Phaser.RoundedRectangle) - Targeted instance for method
    * x (number) - The x coordinate of the point to test.
    * y (number) - The y coordinate of the point to test.

  Returns:  boolean - A value of true if the RoundedRectangle Rectangle object contains the specified point; otherwise false."
  ([rounded-rectangle x y]
   (phaser->clj
    (.contains rounded-rectangle
               (clj->phaser x)
               (clj->phaser y)))))