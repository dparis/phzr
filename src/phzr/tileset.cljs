(ns phzr.tileset
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Tileset
  "A Tile set is a combination of an image containing the tiles and collision data per tile.

  Tilesets are normally created automatically when Tiled data is loaded.

  Parameters:
    * name (string) - The name of the tileset in the map data.
    * firstgid (integer) - The first tile index this tileset contains.
    * width (integer) {optional} - Width of each tile (in pixels).
    * height (integer) {optional} - Height of each tile (in pixels).
    * margin (integer) {optional} - The margin around all tiles in the sheet (in pixels).
    * spacing (integer) {optional} - The spacing between each tile in the sheet (in pixels).
    * properties (object) {optional} - Custom Tileset properties."
  ([name firstgid]
   (js/Phaser.Tileset. (clj->phaser name)
                       (clj->phaser firstgid)))
  ([name firstgid width]
   (js/Phaser.Tileset. (clj->phaser name)
                       (clj->phaser firstgid)
                       (clj->phaser width)))
  ([name firstgid width height]
   (js/Phaser.Tileset. (clj->phaser name)
                       (clj->phaser firstgid)
                       (clj->phaser width)
                       (clj->phaser height)))
  ([name firstgid width height margin]
   (js/Phaser.Tileset. (clj->phaser name)
                       (clj->phaser firstgid)
                       (clj->phaser width)
                       (clj->phaser height)
                       (clj->phaser margin)))
  ([name firstgid width height margin spacing]
   (js/Phaser.Tileset. (clj->phaser name)
                       (clj->phaser firstgid)
                       (clj->phaser width)
                       (clj->phaser height)
                       (clj->phaser margin)
                       (clj->phaser spacing)))
  ([name firstgid width height margin spacing properties]
   (js/Phaser.Tileset. (clj->phaser name)
                       (clj->phaser firstgid)
                       (clj->phaser width)
                       (clj->phaser height)
                       (clj->phaser margin)
                       (clj->phaser spacing)
                       (clj->phaser properties))))

(defn contains-tile-index
  "Returns true if and only if this tileset contains the given tile index.

  Returns:  boolean - True if this tileset contains the given index."
  ([tileset]
   (phaser->clj
    (.containsTileIndex tileset))))

(defn draw
  "Draws a tile from this Tileset at the given coordinates on the context.

  Parameters:
    * tileset (Phaser.Tileset) - Targeted instance for method
    * context (CanvasRenderingContext2D) - The context to draw the tile onto.
    * x (number) - The x coordinate to draw to.
    * y (number) - The y coordinate to draw to.
    * index (integer) - The index of the tile within the set to draw."
  ([tileset context x y index]
   (phaser->clj
    (.draw tileset
           (clj->phaser context)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser index)))))

(defn set-image
  "Set the image associated with this Tileset and update the tile data.

  Parameters:
    * tileset (Phaser.Tileset) - Targeted instance for method
    * image (Image) - The image that contains the tiles."
  ([tileset image]
   (phaser->clj
    (.setImage tileset
               (clj->phaser image)))))

(defn set-spacing
  "Sets tile spacing and margins.

  Parameters:
    * tileset (Phaser.Tileset) - Targeted instance for method
    * margin (integer) {optional} - The margin around the tiles in the sheet (in pixels).
    * spacing (integer) {optional} - The spacing between the tiles in the sheet (in pixels)."
  ([tileset]
   (phaser->clj
    (.setSpacing tileset)))
  ([tileset margin]
   (phaser->clj
    (.setSpacing tileset
                 (clj->phaser margin))))
  ([tileset margin spacing]
   (phaser->clj
    (.setSpacing tileset
                 (clj->phaser margin)
                 (clj->phaser spacing)))))