(ns phzr.frame
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [clone]))

(defn ->Frame
  "A Frame is a single frame of an animation and is part of a FrameData collection.

  Parameters:
    * index (number) - The index of this Frame within the FrameData set it is being added to.
    * x (number) - X position of the frame within the texture image.
    * y (number) - Y position of the frame within the texture image.
    * width (number) - Width of the frame within the texture image.
    * height (number) - Height of the frame within the texture image.
    * name (string) - The name of the frame. In Texture Atlas data this is usually set to the filename."
  ([index x y width height name]
   (js/Phaser.Frame. (clj->phaser index)
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser width)
                     (clj->phaser height)
                     (clj->phaser name))))

(defn clone
  "Clones this Frame into a new Phaser.Frame object and returns it.
  Note that all properties are cloned, including the name, index and UUID.

  Returns:  Phaser.Frame - An exact copy of this Frame object."
  ([frame]
   (phaser->clj
    (.clone frame))))

(defn get-rect
  "Returns a Rectangle set to the dimensions of this Frame.

  Parameters:
    * frame (Phaser.Frame) - Targeted instance for method
    * out (Phaser.Rectangle) {optional} - A rectangle to copy the frame dimensions to.

  Returns:  Phaser.Rectangle - A rectangle."
  ([frame]
   (phaser->clj
    (.getRect frame)))
  ([frame out]
   (phaser->clj
    (.getRect frame
              (clj->phaser out)))))

(defn resize
  "Adjusts of all the Frame properties based on the given width and height values.

  Parameters:
    * frame (Phaser.Frame) - Targeted instance for method
    * width (integer) - The new width of the Frame.
    * height (integer) - The new height of the Frame."
  ([frame width height]
   (phaser->clj
    (.resize frame
             (clj->phaser width)
             (clj->phaser height)))))

(defn set-trim
  "If the frame was trimmed when added to the Texture Atlas this records the trim and source data.

  Parameters:
    * frame (Phaser.Frame) - Targeted instance for method
    * trimmed (boolean) - If this frame was trimmed or not.
    * actual-width (number) - The width of the frame before being trimmed.
    * actual-height (number) - The height of the frame before being trimmed.
    * dest-x (number) - The destination X position of the trimmed frame for display.
    * dest-y (number) - The destination Y position of the trimmed frame for display.
    * dest-width (number) - The destination width of the trimmed frame for display.
    * dest-height (number) - The destination height of the trimmed frame for display."
  ([frame trimmed actual-width actual-height dest-x dest-y dest-width dest-height]
   (phaser->clj
    (.setTrim frame
              (clj->phaser trimmed)
              (clj->phaser actual-width)
              (clj->phaser actual-height)
              (clj->phaser dest-x)
              (clj->phaser dest-y)
              (clj->phaser dest-width)
              (clj->phaser dest-height)))))