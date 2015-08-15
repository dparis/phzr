(ns phzr.tilemap-parser
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn get-empty-data-
  "Returns an empty map data object.

  Returns:  object - Generated map data."
  ([]
   (phaser->clj
    (.getEmptyData js/Phaser.TilemapParser))))

(defn parse-
  "Parse tilemap data from the cache and creates a Tilemap object.

  Parameters:
    * game (Phaser.Game) - Game reference to the currently running game.
    * key (string) - The key of the tilemap in the Cache.
    * tile-width (number) {optional} - The pixel width of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.
    * tile-height (number) {optional} - The pixel height of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.
    * width (number) {optional} - The width of the map in tiles. If this map is created from Tiled or CSV data you don't need to specify this.
    * height (number) {optional} - The height of the map in tiles. If this map is created from Tiled or CSV data you don't need to specify this.

  Returns:  object - The parsed map object."
  ([game key]
   (phaser->clj
    (.parse js/Phaser.TilemapParser
            (clj->phaser game)
            (clj->phaser key))))
  ([game key tile-width]
   (phaser->clj
    (.parse js/Phaser.TilemapParser
            (clj->phaser game)
            (clj->phaser key)
            (clj->phaser tile-width))))
  ([game key tile-width tile-height]
   (phaser->clj
    (.parse js/Phaser.TilemapParser
            (clj->phaser game)
            (clj->phaser key)
            (clj->phaser tile-width)
            (clj->phaser tile-height))))
  ([game key tile-width tile-height width]
   (phaser->clj
    (.parse js/Phaser.TilemapParser
            (clj->phaser game)
            (clj->phaser key)
            (clj->phaser tile-width)
            (clj->phaser tile-height)
            (clj->phaser width))))
  ([game key tile-width tile-height width height]
   (phaser->clj
    (.parse js/Phaser.TilemapParser
            (clj->phaser game)
            (clj->phaser key)
            (clj->phaser tile-width)
            (clj->phaser tile-height)
            (clj->phaser width)
            (clj->phaser height)))))

(defn parse-csv-
  "Parses a CSV file into valid map data.

  Parameters:
    * data (string) - The CSV file data.
    * tile-width (number) {optional} - The pixel width of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.
    * tile-height (number) {optional} - The pixel height of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.

  Returns:  object - Generated map data."
  ([data]
   (phaser->clj
    (.parseCSV js/Phaser.TilemapParser
               (clj->phaser data))))
  ([data tile-width]
   (phaser->clj
    (.parseCSV js/Phaser.TilemapParser
               (clj->phaser data)
               (clj->phaser tile-width))))
  ([data tile-width tile-height]
   (phaser->clj
    (.parseCSV js/Phaser.TilemapParser
               (clj->phaser data)
               (clj->phaser tile-width)
               (clj->phaser tile-height)))))

(defn parse-json-
  "Parses a Tiled JSON file into valid map data.

  Parameters:
    * json (object) - The JSON map data.

  Returns:  object - Generated and parsed map data."
  ([json]
   (phaser->clj
    (.parseJSON js/Phaser.TilemapParser
                (clj->phaser json)))))