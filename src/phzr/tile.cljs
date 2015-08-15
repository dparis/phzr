(ns phzr.tile
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Tile
  "A Tile is a representation of a single tile within the Tilemap.

  Parameters:
    * layer (object) - The layer in the Tilemap data that this tile belongs to.
    * index (number) - The index of this tile type in the core map data.
    * x (number) - The x coordinate of this tile.
    * y (number) - The y coordinate of this tile.
    * width (number) - Width of the tile.
    * height (number) - Height of the tile."
  ([layer index x y width height]
   (js/Phaser.Tile. (clj->phaser layer)
                    (clj->phaser index)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser width)
                    (clj->phaser height))))

(defn contains-point
  "Check if the given x and y world coordinates are within this Tile.

  Parameters:
    * tile (Phaser.Tile) - Targeted instance for method
    * x (number) - The x coordinate to test.
    * y (number) - The y coordinate to test.

  Returns:  boolean - True if the coordinates are within this Tile, otherwise false."
  ([tile x y]
   (phaser->clj
    (.containsPoint tile
                    (clj->phaser x)
                    (clj->phaser y)))))

(defn copy
  "Copies the tile data and properties from the given tile to this tile.

  Parameters:
    * tile (Phaser.Tile) - Targeted instance for method
    * tile (Phaser.Tile) - The tile to copy from."
  ([tile tile]
   (phaser->clj
    (.copy tile
           (clj->phaser tile)))))

(defn destroy
  "Clean up memory."
  ([tile]
   (phaser->clj
    (.destroy tile))))

(defn intersects
  "Check for intersection with this tile.

  Parameters:
    * tile (Phaser.Tile) - Targeted instance for method
    * x (number) - The x axis in pixels.
    * y (number) - The y axis in pixels.
    * right (number) - The right point.
    * bottom (number) - The bottom point."
  ([tile x y right bottom]
   (phaser->clj
    (.intersects tile
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser right)
                 (clj->phaser bottom)))))

(defn is-interesting
  "Is this tile interesting?

  Parameters:
    * tile (Phaser.Tile) - Targeted instance for method
    * collides (boolean) - If true will check any collides value.
    * faces (boolean) - If true will check any face value.

  Returns:  boolean - True if the Tile is interesting, otherwise false."
  ([tile collides faces]
   (phaser->clj
    (.isInteresting tile
                    (clj->phaser collides)
                    (clj->phaser faces)))))

(defn reset-collision
  "Reset collision status flags."
  ([tile]
   (phaser->clj
    (.resetCollision tile))))

(defn set-collision
  "Sets the collision flags for each side of this tile and updates the interesting faces list.

  Parameters:
    * tile (Phaser.Tile) - Targeted instance for method
    * left (boolean) - Indicating collide with any object on the left.
    * right (boolean) - Indicating collide with any object on the right.
    * up (boolean) - Indicating collide with any object on the top.
    * down (boolean) - Indicating collide with any object on the bottom."
  ([tile left right up down]
   (phaser->clj
    (.setCollision tile
                   (clj->phaser left)
                   (clj->phaser right)
                   (clj->phaser up)
                   (clj->phaser down)))))

(defn set-collision-callback
  "Set a callback to be called when this tile is hit by an object.
  The callback must true true for collision processing to take place.

  Parameters:
    * tile (Phaser.Tile) - Targeted instance for method
    * callback (function) - Callback function.
    * context (object) - Callback will be called within this context."
  ([tile callback context]
   (phaser->clj
    (.setCollisionCallback tile
                           (clj->phaser callback)
                           (clj->phaser context)))))