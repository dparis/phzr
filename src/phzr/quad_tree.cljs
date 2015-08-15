(ns phzr.quad-tree
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->QuadTree
  "A QuadTree implementation. The original code was a conversion of the Java code posted to GameDevTuts.
  However I've tweaked it massively to add node indexing, removed lots of temp. var creation and significantly increased performance as a result.
  Original version at https://github.com/timohausmann/quadtree-js/

  Parameters:
    * x (number) - The top left coordinate of the quadtree.
    * y (number) - The top left coordinate of the quadtree.
    * width (number) - The width of the quadtree in pixels.
    * height (number) - The height of the quadtree in pixels.
    * max-objects (number) {optional} - The maximum number of objects per node.
    * max-levels (number) {optional} - The maximum number of levels to iterate to.
    * level (number) {optional} - Which level is this?"
  ([x y width height]
   (js/Phaser.QuadTree. (clj->phaser x)
                        (clj->phaser y)
                        (clj->phaser width)
                        (clj->phaser height)))
  ([x y width height max-objects]
   (js/Phaser.QuadTree. (clj->phaser x)
                        (clj->phaser y)
                        (clj->phaser width)
                        (clj->phaser height)
                        (clj->phaser max-objects)))
  ([x y width height max-objects max-levels]
   (js/Phaser.QuadTree. (clj->phaser x)
                        (clj->phaser y)
                        (clj->phaser width)
                        (clj->phaser height)
                        (clj->phaser max-objects)
                        (clj->phaser max-levels)))
  ([x y width height max-objects max-levels level]
   (js/Phaser.QuadTree. (clj->phaser x)
                        (clj->phaser y)
                        (clj->phaser width)
                        (clj->phaser height)
                        (clj->phaser max-objects)
                        (clj->phaser max-levels)
                        (clj->phaser level))))

(defn clear
  "Clear the quadtree."
  ([quad-tree]
   (phaser->clj
    (.clear quad-tree))))

(defn get-index
  "Determine which node the object belongs to.

  Parameters:
    * quad-tree (Phaser.QuadTree) - Targeted instance for method
    * rect (Phaser.Rectangle | object) - The bounds in which to check.

  Returns:  number - index - Index of the subnode (0-3), or -1 if rect cannot completely fit within a subnode and is part of the parent node."
  ([quad-tree rect]
   (phaser->clj
    (.getIndex quad-tree
               (clj->phaser rect)))))

(defn insert
  "Insert the object into the node. If the node exceeds the capacity, it will split and add all objects to their corresponding subnodes.

  Parameters:
    * quad-tree (Phaser.QuadTree) - Targeted instance for method
    * body (Phaser.Physics.Arcade.Body | object) - The Body object to insert into the quadtree. Can be any object so long as it exposes x, y, right and bottom properties."
  ([quad-tree body]
   (phaser->clj
    (.insert quad-tree
             (clj->phaser body)))))

(defn populate
  "Populates this quadtree with the children of the given Group. In order to be added the child must exist and have a body property.

  Parameters:
    * quad-tree (Phaser.QuadTree) - Targeted instance for method
    * group (Phaser.Group) - The Group to add to the quadtree."
  ([quad-tree group]
   (phaser->clj
    (.populate quad-tree
               (clj->phaser group)))))

(defn populate-handler
  "Handler for the populate method.

  Parameters:
    * quad-tree (Phaser.QuadTree) - Targeted instance for method
    * sprite (Phaser.Sprite | object) - The Sprite to check."
  ([quad-tree sprite]
   (phaser->clj
    (.populateHandler quad-tree
                      (clj->phaser sprite)))))

(defn reset
  "Resets the QuadTree.

  Parameters:
    * quad-tree (Phaser.QuadTree) - Targeted instance for method
    * x (number) - The top left coordinate of the quadtree.
    * y (number) - The top left coordinate of the quadtree.
    * width (number) - The width of the quadtree in pixels.
    * height (number) - The height of the quadtree in pixels.
    * max-objects (number) {optional} - The maximum number of objects per node.
    * max-levels (number) {optional} - The maximum number of levels to iterate to.
    * level (number) {optional} - Which level is this?"
  ([quad-tree x y width height]
   (phaser->clj
    (.reset quad-tree
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser width)
            (clj->phaser height))))
  ([quad-tree x y width height max-objects]
   (phaser->clj
    (.reset quad-tree
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser width)
            (clj->phaser height)
            (clj->phaser max-objects))))
  ([quad-tree x y width height max-objects max-levels]
   (phaser->clj
    (.reset quad-tree
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser width)
            (clj->phaser height)
            (clj->phaser max-objects)
            (clj->phaser max-levels))))
  ([quad-tree x y width height max-objects max-levels level]
   (phaser->clj
    (.reset quad-tree
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser width)
            (clj->phaser height)
            (clj->phaser max-objects)
            (clj->phaser max-levels)
            (clj->phaser level)))))

(defn retrieve
  "Return all objects that could collide with the given Sprite or Rectangle.

  Parameters:
    * quad-tree (Phaser.QuadTree) - Targeted instance for method
    * source (Phaser.Sprite | Phaser.Rectangle) - The source object to check the QuadTree against. Either a Sprite or Rectangle.

  Returns:  array - - Array with all detected objects."
  ([quad-tree source]
   (phaser->clj
    (.retrieve quad-tree
               (clj->phaser source)))))

(defn split
  "Split the node into 4 subnodes"
  ([quad-tree]
   (phaser->clj
    (.split quad-tree))))