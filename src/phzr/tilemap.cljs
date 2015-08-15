(ns phzr.tilemap
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [replace shuffle]))

(defn ->Tilemap
  "Creates a new Phaser.Tilemap object. The map can either be populated with data from a Tiled JSON file or from a CSV file.
  To do this pass the Cache key as the first parameter. When using Tiled data you need only provide the key.
  When using CSV data you must provide the key and the tileWidth and tileHeight parameters.
  If creating a blank tilemap to be populated later, you can either specify no parameters at all and then use `Tilemap.create` or pass the map and tile dimensions here.
  Note that all Tilemaps use a base tile size to calculate dimensions from, but that a TilemapLayer may have its own unique tile size that overrides it.
  A Tile map is rendered to the display using a TilemapLayer. It is not added to the display list directly itself.
  A map may have multiple layers. You can perform operations on the map data such as copying, pasting, filling and shuffling the tiles around.

  Parameters:
    * game (Phaser.Game) - Game reference to the currently running game.
    * key (string) {optional} - The key of the tilemap data as stored in the Cache. If you're creating a blank map either leave this parameter out or pass `null`.
    * tile-width (number) {optional} - The pixel width of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.
    * tile-height (number) {optional} - The pixel height of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.
    * width (number) {optional} - The width of the map in tiles. If this map is created from Tiled or CSV data you don't need to specify this.
    * height (number) {optional} - The height of the map in tiles. If this map is created from Tiled or CSV data you don't need to specify this."
  ([game]
   (js/Phaser.Tilemap. (clj->phaser game)))
  ([game key]
   (js/Phaser.Tilemap. (clj->phaser game)
                       (clj->phaser key)))
  ([game key tile-width]
   (js/Phaser.Tilemap. (clj->phaser game)
                       (clj->phaser key)
                       (clj->phaser tile-width)))
  ([game key tile-width tile-height]
   (js/Phaser.Tilemap. (clj->phaser game)
                       (clj->phaser key)
                       (clj->phaser tile-width)
                       (clj->phaser tile-height)))
  ([game key tile-width tile-height width]
   (js/Phaser.Tilemap. (clj->phaser game)
                       (clj->phaser key)
                       (clj->phaser tile-width)
                       (clj->phaser tile-height)
                       (clj->phaser width)))
  ([game key tile-width tile-height width height]
   (js/Phaser.Tilemap. (clj->phaser game)
                       (clj->phaser key)
                       (clj->phaser tile-width)
                       (clj->phaser tile-height)
                       (clj->phaser width)
                       (clj->phaser height))))

(defn add-tileset-image
  "Adds an image to the map to be used as a tileset. A single map may use multiple tilesets.
  Note that the tileset name can be found in the JSON file exported from Tiled, or in the Tiled editor.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * tileset (string) - The name of the tileset as specified in the map data.
    * key (string | Phaser.BitmapData) {optional} - The key of the Phaser.Cache image used for this tileset.
    If `undefined` or `null` it will look for an image with a key matching the tileset parameter.
    You can also pass in a BitmapData which can be used instead of an Image.
    * tile-width (number) {optional} - The width of the tiles in the Tileset Image. If not given it will default to the map.tileWidth value, if that isn't set then 32.
    * tile-height (number) {optional} - The height of the tiles in the Tileset Image. If not given it will default to the map.tileHeight value, if that isn't set then 32.
    * tile-margin (number) {optional} - The width of the tiles in the Tileset Image. If not given it will default to the map.tileWidth value.
    * tile-spacing (number) {optional} - The height of the tiles in the Tileset Image. If not given it will default to the map.tileHeight value.
    * gid (number) {optional} - If adding multiple tilesets to a blank/dynamic map, specify the starting GID the set will use here.

  Returns:  Phaser.Tileset - Returns the Tileset object that was created or updated, or null if it failed."
  ([tilemap tileset]
   (phaser->clj
    (.addTilesetImage tilemap
                      (clj->phaser tileset))))
  ([tilemap tileset key]
   (phaser->clj
    (.addTilesetImage tilemap
                      (clj->phaser tileset)
                      (clj->phaser key))))
  ([tilemap tileset key tile-width]
   (phaser->clj
    (.addTilesetImage tilemap
                      (clj->phaser tileset)
                      (clj->phaser key)
                      (clj->phaser tile-width))))
  ([tilemap tileset key tile-width tile-height]
   (phaser->clj
    (.addTilesetImage tilemap
                      (clj->phaser tileset)
                      (clj->phaser key)
                      (clj->phaser tile-width)
                      (clj->phaser tile-height))))
  ([tilemap tileset key tile-width tile-height tile-margin]
   (phaser->clj
    (.addTilesetImage tilemap
                      (clj->phaser tileset)
                      (clj->phaser key)
                      (clj->phaser tile-width)
                      (clj->phaser tile-height)
                      (clj->phaser tile-margin))))
  ([tilemap tileset key tile-width tile-height tile-margin tile-spacing]
   (phaser->clj
    (.addTilesetImage tilemap
                      (clj->phaser tileset)
                      (clj->phaser key)
                      (clj->phaser tile-width)
                      (clj->phaser tile-height)
                      (clj->phaser tile-margin)
                      (clj->phaser tile-spacing))))
  ([tilemap tileset key tile-width tile-height tile-margin tile-spacing gid]
   (phaser->clj
    (.addTilesetImage tilemap
                      (clj->phaser tileset)
                      (clj->phaser key)
                      (clj->phaser tile-width)
                      (clj->phaser tile-height)
                      (clj->phaser tile-margin)
                      (clj->phaser tile-spacing)
                      (clj->phaser gid)))))

(defn check-tile
  "Checks if the given x/y coordinate has a tile into which we can move.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position of the top left of the area to copy (given in tiles, not pixels)
    * y (number) - Y position of the top left of the area to copy (given in tiles, not pixels)

  Returns:  boolean - True if the location can be moved into, false if not."
  ([tilemap x y]
   (phaser->clj
    (.checkTile tilemap
                (clj->phaser x)
                (clj->phaser y)))))

(defn copy
  "Copies all of the tiles in the given rectangular block into the tilemap data buffer.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (integer) - X position of the top left of the area to copy (given in tiles, not pixels)
    * y (integer) - Y position of the top left of the area to copy (given in tiles, not pixels)
    * width (integer) - The width of the area to copy (given in tiles, not pixels)
    * height (integer) - The height of the area to copy (given in tiles, not pixels)
    * layer (integer | string | Phaser.TilemapLayer) {optional} - The layer to copy the tiles from.

  Returns:  array - An array of the tiles that were copied."
  ([tilemap x y width height]
   (phaser->clj
    (.copy tilemap
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height))))
  ([tilemap x y width height layer]
   (phaser->clj
    (.copy tilemap
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser layer)))))

(defn create
  "Creates an empty map of the given dimensions and one blank layer. If layers already exist they are erased.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * name (string) - The name of the default layer of the map.
    * width (number) - The width of the map in tiles.
    * height (number) - The height of the map in tiles.
    * tile-width (number) - The width of the tiles the map uses for calculations.
    * tile-height (number) - The height of the tiles the map uses for calculations.
    * group (Phaser.Group) {optional} - Optional Group to add the layer to. If not specified it will be added to the World group.

  Returns:  Phaser.TilemapLayer - The TilemapLayer object. This is an extension of Phaser.Image and can be moved around the display list accordingly."
  ([tilemap name width height tile-width tile-height]
   (phaser->clj
    (.create tilemap
             (clj->phaser name)
             (clj->phaser width)
             (clj->phaser height)
             (clj->phaser tile-width)
             (clj->phaser tile-height))))
  ([tilemap name width height tile-width tile-height group]
   (phaser->clj
    (.create tilemap
             (clj->phaser name)
             (clj->phaser width)
             (clj->phaser height)
             (clj->phaser tile-width)
             (clj->phaser tile-height)
             (clj->phaser group)))))

(defn create-blank-layer
  "Creates a new and empty layer on this Tilemap. By default TilemapLayers are fixed to the camera.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * name (string) - The name of this layer. Must be unique within the map.
    * width (number) - The width of the layer in tiles.
    * height (number) - The height of the layer in tiles.
    * tile-width (number) - The width of the tiles the layer uses for calculations.
    * tile-height (number) - The height of the tiles the layer uses for calculations.
    * group (Phaser.Group) {optional} - Optional Group to add the layer to. If not specified it will be added to the World group.

  Returns:  Phaser.TilemapLayer - The TilemapLayer object. This is an extension of Phaser.Image and can be moved around the display list accordingly."
  ([tilemap name width height tile-width tile-height]
   (phaser->clj
    (.createBlankLayer tilemap
                       (clj->phaser name)
                       (clj->phaser width)
                       (clj->phaser height)
                       (clj->phaser tile-width)
                       (clj->phaser tile-height))))
  ([tilemap name width height tile-width tile-height group]
   (phaser->clj
    (.createBlankLayer tilemap
                       (clj->phaser name)
                       (clj->phaser width)
                       (clj->phaser height)
                       (clj->phaser tile-width)
                       (clj->phaser tile-height)
                       (clj->phaser group)))))

(defn create-from-objects
  "Creates a Sprite for every object matching the given gid in the map data. You can optionally specify the group that the Sprite will be created in. If none is
  given it will be created in the World. All properties from the map data objectgroup are copied across to the Sprite, so you can use this as an easy way to
  configure Sprite properties from within the map editor. For example giving an object a property of alpha: 0.5 in the map editor will duplicate that when the
  Sprite is created. You could also give it a value like: body.velocity.x: 100 to set it moving automatically.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * name (string) - The name of the Object Group to create Sprites from.
    * gid (number) - The layer array index value, or if a string is given the layer name within the map data.
    * key (string) - The Game.cache key of the image that this Sprite will use.
    * frame (number | string) {optional} - If the Sprite image contains multiple frames you can specify which one to use here.
    * exists (boolean) {optional} - The default exists state of the Sprite.
    * auto-cull (boolean) {optional} - The default autoCull state of the Sprite. Sprites that are autoCulled are culled from the camera if out of its range.
    * group (Phaser.Group) {optional} - Group to add the Sprite to. If not specified it will be added to the World group.
    * custom-class (object) {optional} - If you wish to create your own class, rather than Phaser.Sprite, pass the class here. Your class must extend Phaser.Sprite and have the same constructor parameters.
    * adjust-y (boolean) {optional} - By default the Tiled map editor uses a bottom-left coordinate system. Phaser uses top-left. So most objects will appear too low down. This parameter moves them up by their height."
  ([tilemap name gid key]
   (phaser->clj
    (.createFromObjects tilemap
                        (clj->phaser name)
                        (clj->phaser gid)
                        (clj->phaser key))))
  ([tilemap name gid key frame]
   (phaser->clj
    (.createFromObjects tilemap
                        (clj->phaser name)
                        (clj->phaser gid)
                        (clj->phaser key)
                        (clj->phaser frame))))
  ([tilemap name gid key frame exists]
   (phaser->clj
    (.createFromObjects tilemap
                        (clj->phaser name)
                        (clj->phaser gid)
                        (clj->phaser key)
                        (clj->phaser frame)
                        (clj->phaser exists))))
  ([tilemap name gid key frame exists auto-cull]
   (phaser->clj
    (.createFromObjects tilemap
                        (clj->phaser name)
                        (clj->phaser gid)
                        (clj->phaser key)
                        (clj->phaser frame)
                        (clj->phaser exists)
                        (clj->phaser auto-cull))))
  ([tilemap name gid key frame exists auto-cull group]
   (phaser->clj
    (.createFromObjects tilemap
                        (clj->phaser name)
                        (clj->phaser gid)
                        (clj->phaser key)
                        (clj->phaser frame)
                        (clj->phaser exists)
                        (clj->phaser auto-cull)
                        (clj->phaser group))))
  ([tilemap name gid key frame exists auto-cull group custom-class]
   (phaser->clj
    (.createFromObjects tilemap
                        (clj->phaser name)
                        (clj->phaser gid)
                        (clj->phaser key)
                        (clj->phaser frame)
                        (clj->phaser exists)
                        (clj->phaser auto-cull)
                        (clj->phaser group)
                        (clj->phaser custom-class))))
  ([tilemap name gid key frame exists auto-cull group custom-class adjust-y]
   (phaser->clj
    (.createFromObjects tilemap
                        (clj->phaser name)
                        (clj->phaser gid)
                        (clj->phaser key)
                        (clj->phaser frame)
                        (clj->phaser exists)
                        (clj->phaser auto-cull)
                        (clj->phaser group)
                        (clj->phaser custom-class)
                        (clj->phaser adjust-y)))))

(defn create-from-tiles
  "Creates a Sprite for every object matching the given tile indexes in the map data.
  You can specify the group that the Sprite will be created in. If none is given it will be created in the World.
  You can optional specify if the tile will be replaced with another after the Sprite is created. This is useful if you want to lay down special 
  tiles in a level that are converted to Sprites, but want to replace the tile itself with a floor tile or similar once converted.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * tiles (integer | Array) - The tile index, or array of indexes, to create Sprites from.
    * replacements (integer | Array) - The tile index, or array of indexes, to change a converted tile to. Set to `null` to not change.
    * key (string) - The Game.cache key of the image that this Sprite will use.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on.
    * group (Phaser.Group) {optional} - Group to add the Sprite to. If not specified it will be added to the World group.
    * properties (object) {optional} - An object that contains the default properties for your newly created Sprite. This object will be iterated and any matching Sprite property will be set.

  Returns:  integer - The number of Sprites that were created."
  ([tilemap tiles replacements key]
   (phaser->clj
    (.createFromTiles tilemap
                      (clj->phaser tiles)
                      (clj->phaser replacements)
                      (clj->phaser key))))
  ([tilemap tiles replacements key layer]
   (phaser->clj
    (.createFromTiles tilemap
                      (clj->phaser tiles)
                      (clj->phaser replacements)
                      (clj->phaser key)
                      (clj->phaser layer))))
  ([tilemap tiles replacements key layer group]
   (phaser->clj
    (.createFromTiles tilemap
                      (clj->phaser tiles)
                      (clj->phaser replacements)
                      (clj->phaser key)
                      (clj->phaser layer)
                      (clj->phaser group))))
  ([tilemap tiles replacements key layer group properties]
   (phaser->clj
    (.createFromTiles tilemap
                      (clj->phaser tiles)
                      (clj->phaser replacements)
                      (clj->phaser key)
                      (clj->phaser layer)
                      (clj->phaser group)
                      (clj->phaser properties)))))

(defn create-layer
  "Creates a new TilemapLayer object. By default TilemapLayers are fixed to the camera.
  The `layer` parameter is important. If you've created your map in Tiled then you can get this by looking in Tiled and looking at the Layer name.
  Or you can open the JSON file it exports and look at the layers[].name value. Either way it must match.
  If you wish to create a blank layer to put your own tiles on then see Tilemap.createBlankLayer.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * layer (number | string) - The layer array index value, or if a string is given the layer name, within the map data that this TilemapLayer represents.
    * width (number) {optional} - The rendered width of the layer, should never be wider than Game.width. If not given it will be set to Game.width.
    * height (number) {optional} - The rendered height of the layer, should never be wider than Game.height. If not given it will be set to Game.height.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.TilemapLayer - The TilemapLayer object. This is an extension of Phaser.Sprite and can be moved around the display list accordingly."
  ([tilemap layer]
   (phaser->clj
    (.createLayer tilemap
                  (clj->phaser layer))))
  ([tilemap layer width]
   (phaser->clj
    (.createLayer tilemap
                  (clj->phaser layer)
                  (clj->phaser width))))
  ([tilemap layer width height]
   (phaser->clj
    (.createLayer tilemap
                  (clj->phaser layer)
                  (clj->phaser width)
                  (clj->phaser height))))
  ([tilemap layer width height group]
   (phaser->clj
    (.createLayer tilemap
                  (clj->phaser layer)
                  (clj->phaser width)
                  (clj->phaser height)
                  (clj->phaser group)))))

(defn destroy
  "Removes all layer data from this tile map and nulls the game reference.
  Note: You are responsible for destroying any TilemapLayer objects you generated yourself, as Tilemap doesn't keep a reference to them."
  ([tilemap]
   (phaser->clj
    (.destroy tilemap))))

(defn dump
  "Dumps the tilemap data out to the console."
  ([tilemap]
   (phaser->clj
    (.dump tilemap))))

(defn fill
  "Fills the given area with the specified tile.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * index (number) - The index of the tile that the area will be filled with.
    * x (number) - X position of the top left of the area to operate one, given in tiles, not pixels.
    * y (number) - Y position of the top left of the area to operate one, given in tiles, not pixels.
    * width (number) - The width in tiles of the area to operate on.
    * height (number) - The height in tiles of the area to operate on.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on."
  ([tilemap index x y width height]
   (phaser->clj
    (.fill tilemap
           (clj->phaser index)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height))))
  ([tilemap index x y width height layer]
   (phaser->clj
    (.fill tilemap
           (clj->phaser index)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser layer)))))

(defn for-each
  "For each tile in the given area defined by x/y and width/height run the given callback.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * callback (number) - The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
    * context (number) - The context under which the callback should be run.
    * x (number) - X position of the top left of the area to operate one, given in tiles, not pixels.
    * y (number) - Y position of the top left of the area to operate one, given in tiles, not pixels.
    * width (number) - The width in tiles of the area to operate on.
    * height (number) - The height in tiles of the area to operate on.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on."
  ([tilemap callback context x y width height]
   (phaser->clj
    (.forEach tilemap
              (clj->phaser callback)
              (clj->phaser context)
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser width)
              (clj->phaser height))))
  ([tilemap callback context x y width height layer]
   (phaser->clj
    (.forEach tilemap
              (clj->phaser callback)
              (clj->phaser context)
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser width)
              (clj->phaser height)
              (clj->phaser layer)))))

(defn get-image-index
  "Gets the image index based on its name.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * name (string) - The name of the image to get.

  Returns:  number - The index of the image in this tilemap, or null if not found."
  ([tilemap name]
   (phaser->clj
    (.getImageIndex tilemap
                    (clj->phaser name)))))

(defn get-layer-index
  "Gets the layer index based on its name.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * name (string) - The name of the layer to get.

  Returns:  number - The index of the layer in this tilemap, or null if not found."
  ([tilemap name]
   (phaser->clj
    (.getLayerIndex tilemap
                    (clj->phaser name)))))

(defn get-object-index
  "Gets the object index based on its name.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * name (string) - The name of the object to get.

  Returns:  number - The index of the object in this tilemap, or null if not found."
  ([tilemap name]
   (phaser->clj
    (.getObjectIndex tilemap
                     (clj->phaser name)))))

(defn get-tile
  "Gets a tile from the Tilemap Layer. The coordinates are given in tile values.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position to get the tile from (given in tile units, not pixels)
    * y (number) - Y position to get the tile from (given in tile units, not pixels)
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to get the tile from.
    * non-null (boolean) {optional} - If true getTile won't return null for empty tiles, but a Tile object with an index of -1.

  Returns:  Phaser.Tile - The tile at the given coordinates or null if no tile was found or the coordinates were invalid."
  ([tilemap x y]
   (phaser->clj
    (.getTile tilemap
              (clj->phaser x)
              (clj->phaser y))))
  ([tilemap x y layer]
   (phaser->clj
    (.getTile tilemap
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser layer))))
  ([tilemap x y layer non-null]
   (phaser->clj
    (.getTile tilemap
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser layer)
              (clj->phaser non-null)))))

(defn get-tile-above
  "Gets the tile above the tile coordinates given.
  Mostly used as an internal function by calculateFaces.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * layer (number) - The local layer index to get the tile from. Can be determined by Tilemap.getLayer().
    * x (number) - The x coordinate to get the tile from. In tiles, not pixels.
    * y (number) - The y coordinate to get the tile from. In tiles, not pixels."
  ([tilemap layer x y]
   (phaser->clj
    (.getTileAbove tilemap
                   (clj->phaser layer)
                   (clj->phaser x)
                   (clj->phaser y)))))

(defn get-tile-below
  "Gets the tile below the tile coordinates given.
  Mostly used as an internal function by calculateFaces.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * layer (number) - The local layer index to get the tile from. Can be determined by Tilemap.getLayer().
    * x (number) - The x coordinate to get the tile from. In tiles, not pixels.
    * y (number) - The y coordinate to get the tile from. In tiles, not pixels."
  ([tilemap layer x y]
   (phaser->clj
    (.getTileBelow tilemap
                   (clj->phaser layer)
                   (clj->phaser x)
                   (clj->phaser y)))))

(defn get-tile-left
  "Gets the tile to the left of the tile coordinates given.
  Mostly used as an internal function by calculateFaces.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * layer (number) - The local layer index to get the tile from. Can be determined by Tilemap.getLayer().
    * x (number) - The x coordinate to get the tile from. In tiles, not pixels.
    * y (number) - The y coordinate to get the tile from. In tiles, not pixels."
  ([tilemap layer x y]
   (phaser->clj
    (.getTileLeft tilemap
                  (clj->phaser layer)
                  (clj->phaser x)
                  (clj->phaser y)))))

(defn get-tile-right
  "Gets the tile to the right of the tile coordinates given.
  Mostly used as an internal function by calculateFaces.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * layer (number) - The local layer index to get the tile from. Can be determined by Tilemap.getLayer().
    * x (number) - The x coordinate to get the tile from. In tiles, not pixels.
    * y (number) - The y coordinate to get the tile from. In tiles, not pixels."
  ([tilemap layer x y]
   (phaser->clj
    (.getTileRight tilemap
                   (clj->phaser layer)
                   (clj->phaser x)
                   (clj->phaser y)))))

(defn get-tile-world-xy
  "Gets a tile from the Tilemap layer. The coordinates are given in pixel values.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position to get the tile from (given in pixels)
    * y (number) - Y position to get the tile from (given in pixels)
    * tile-width (number) {optional} - The width of the tiles. If not given the map default is used.
    * tile-height (number) {optional} - The height of the tiles. If not given the map default is used.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to get the tile from.
    * non-null (boolean) {optional} - If true getTile won't return null for empty tiles, but a Tile object with an index of -1.

  Returns:  Phaser.Tile - The tile at the given coordinates."
  ([tilemap x y]
   (phaser->clj
    (.getTileWorldXY tilemap
                     (clj->phaser x)
                     (clj->phaser y))))
  ([tilemap x y tile-width]
   (phaser->clj
    (.getTileWorldXY tilemap
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser tile-width))))
  ([tilemap x y tile-width tile-height]
   (phaser->clj
    (.getTileWorldXY tilemap
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser tile-width)
                     (clj->phaser tile-height))))
  ([tilemap x y tile-width tile-height layer]
   (phaser->clj
    (.getTileWorldXY tilemap
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser tile-width)
                     (clj->phaser tile-height)
                     (clj->phaser layer))))
  ([tilemap x y tile-width tile-height layer non-null]
   (phaser->clj
    (.getTileWorldXY tilemap
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser tile-width)
                     (clj->phaser tile-height)
                     (clj->phaser layer)
                     (clj->phaser non-null)))))

(defn get-tileset-index
  "Gets the tileset index based on its name.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * name (string) - The name of the tileset to get.

  Returns:  number - The index of the tileset in this tilemap, or null if not found."
  ([tilemap name]
   (phaser->clj
    (.getTilesetIndex tilemap
                      (clj->phaser name)))))

(defn has-tile
  "Checks if there is a tile at the given location.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position to check if a tile exists at (given in tile units, not pixels)
    * y (number) - Y position to check if a tile exists at (given in tile units, not pixels)
    * layer (number | string | Phaser.TilemapLayer) - The layer to set as current.

  Returns:  boolean - True if there is a tile at the given location, otherwise false."
  ([tilemap x y layer]
   (phaser->clj
    (.hasTile tilemap
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser layer)))))

(defn paste
  "Pastes a previously copied block of tile data into the given x/y coordinates. Data should have been prepared with Tilemap.copy.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position of the top left of the area to paste to (given in tiles, not pixels)
    * y (number) - Y position of the top left of the area to paste to (given in tiles, not pixels)
    * tileblock (array) - The block of tiles to paste.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to paste the tiles into."
  ([tilemap x y tileblock]
   (phaser->clj
    (.paste tilemap
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser tileblock))))
  ([tilemap x y tileblock layer]
   (phaser->clj
    (.paste tilemap
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser tileblock)
            (clj->phaser layer)))))

(defn put-tile
  "Puts a tile of the given index value at the coordinate specified.
  If you pass `null` as the tile it will pass your call over to Tilemap.removeTile instead.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * tile (Phaser.Tile | number | null) - The index of this tile to set or a Phaser.Tile object. If null the tile is removed from the map.
    * x (number) - X position to place the tile (given in tile units, not pixels)
    * y (number) - Y position to place the tile (given in tile units, not pixels)
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to modify.

  Returns:  Phaser.Tile - The Tile object that was created or added to this map."
  ([tilemap tile x y]
   (phaser->clj
    (.putTile tilemap
              (clj->phaser tile)
              (clj->phaser x)
              (clj->phaser y))))
  ([tilemap tile x y layer]
   (phaser->clj
    (.putTile tilemap
              (clj->phaser tile)
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser layer)))))

(defn put-tile-world-xy
  "Puts a tile into the Tilemap layer. The coordinates are given in pixel values.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * tile (Phaser.Tile | number) - The index of this tile to set or a Phaser.Tile object.
    * x (number) - X position to insert the tile (given in pixels)
    * y (number) - Y position to insert the tile (given in pixels)
    * tile-width (number) - The width of the tile in pixels.
    * tile-height (number) - The height of the tile in pixels.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to modify.

  Returns:  Phaser.Tile - The Tile object that was created or added to this map."
  ([tilemap tile x y tile-width tile-height]
   (phaser->clj
    (.putTileWorldXY tilemap
                     (clj->phaser tile)
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser tile-width)
                     (clj->phaser tile-height))))
  ([tilemap tile x y tile-width tile-height layer]
   (phaser->clj
    (.putTileWorldXY tilemap
                     (clj->phaser tile)
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser tile-width)
                     (clj->phaser tile-height)
                     (clj->phaser layer)))))

(defn random
  "Randomises a set of tiles in a given area.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position of the top left of the area to operate one, given in tiles, not pixels.
    * y (number) - Y position of the top left of the area to operate one, given in tiles, not pixels.
    * width (number) - The width in tiles of the area to operate on.
    * height (number) - The height in tiles of the area to operate on.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on."
  ([tilemap x y width height]
   (phaser->clj
    (.random tilemap
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser width)
             (clj->phaser height))))
  ([tilemap x y width height layer]
   (phaser->clj
    (.random tilemap
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser width)
             (clj->phaser height)
             (clj->phaser layer)))))

(defn remove-all-layers
  "Removes all layers from this tile map."
  ([tilemap]
   (phaser->clj
    (.removeAllLayers tilemap))))

(defn remove-tile
  "Removes the tile located at the given coordinates and updates the collision data.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position to place the tile (given in tile units, not pixels)
    * y (number) - Y position to place the tile (given in tile units, not pixels)
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to modify.

  Returns:  Phaser.Tile - The Tile object that was removed from this map."
  ([tilemap x y]
   (phaser->clj
    (.removeTile tilemap
                 (clj->phaser x)
                 (clj->phaser y))))
  ([tilemap x y layer]
   (phaser->clj
    (.removeTile tilemap
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser layer)))))

(defn remove-tile-world-xy
  "Removes the tile located at the given coordinates and updates the collision data. The coordinates are given in pixel values.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position to insert the tile (given in pixels)
    * y (number) - Y position to insert the tile (given in pixels)
    * tile-width (number) - The width of the tile in pixels.
    * tile-height (number) - The height of the tile in pixels.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to modify.

  Returns:  Phaser.Tile - The Tile object that was removed from this map."
  ([tilemap x y tile-width tile-height]
   (phaser->clj
    (.removeTileWorldXY tilemap
                        (clj->phaser x)
                        (clj->phaser y)
                        (clj->phaser tile-width)
                        (clj->phaser tile-height))))
  ([tilemap x y tile-width tile-height layer]
   (phaser->clj
    (.removeTileWorldXY tilemap
                        (clj->phaser x)
                        (clj->phaser y)
                        (clj->phaser tile-width)
                        (clj->phaser tile-height)
                        (clj->phaser layer)))))

(defn replace
  "Scans the given area for tiles with an index matching `source` and updates their index to match `dest`.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * source (number) - The tile index value to scan for.
    * dest (number) - The tile index value to replace found tiles with.
    * x (number) - X position of the top left of the area to operate one, given in tiles, not pixels.
    * y (number) - Y position of the top left of the area to operate one, given in tiles, not pixels.
    * width (number) - The width in tiles of the area to operate on.
    * height (number) - The height in tiles of the area to operate on.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on."
  ([tilemap source dest x y width height]
   (phaser->clj
    (.replace tilemap
              (clj->phaser source)
              (clj->phaser dest)
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser width)
              (clj->phaser height))))
  ([tilemap source dest x y width height layer]
   (phaser->clj
    (.replace tilemap
              (clj->phaser source)
              (clj->phaser dest)
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser width)
              (clj->phaser height)
              (clj->phaser layer)))))

(defn search-tile-index
  "Searches the entire map layer for the first tile matching the given index, then returns that Phaser.Tile object.
  If no match is found it returns null.
  The search starts from the top-left tile and continues horizontally until it hits the end of the row, then it drops down to the next column.
  If the reverse boolean is true, it scans starting from the bottom-right corner traveling up to the top-left.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * index (number) - The tile index value to search for.
    * skip (number) {optional} - The number of times to skip a matching tile before returning.
    * reverse (number) {optional} - If true it will scan the layer in reverse, starting at the bottom-right. Otherwise it scans from the top-left.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to get the tile from.

  Returns:  Phaser.Tile - The first (or n skipped) tile with the matching index."
  ([tilemap index]
   (phaser->clj
    (.searchTileIndex tilemap
                      (clj->phaser index))))
  ([tilemap index skip]
   (phaser->clj
    (.searchTileIndex tilemap
                      (clj->phaser index)
                      (clj->phaser skip))))
  ([tilemap index skip reverse]
   (phaser->clj
    (.searchTileIndex tilemap
                      (clj->phaser index)
                      (clj->phaser skip)
                      (clj->phaser reverse))))
  ([tilemap index skip reverse layer]
   (phaser->clj
    (.searchTileIndex tilemap
                      (clj->phaser index)
                      (clj->phaser skip)
                      (clj->phaser reverse)
                      (clj->phaser layer)))))

(defn set-collision
  "Sets collision the given tile or tiles. You can pass in either a single numeric index or an array of indexes: [ 2, 3, 15, 20].
  The `collides` parameter controls if collision will be enabled (true) or disabled (false).

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * indexes (number | array) - Either a single tile index, or an array of tile IDs to be checked for collision.
    * collides (boolean) {optional} - If true it will enable collision. If false it will clear collision.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on. If not given will default to this.currentLayer.
    * recalculate (boolean) {optional} - Recalculates the tile faces after the update."
  ([tilemap indexes]
   (phaser->clj
    (.setCollision tilemap
                   (clj->phaser indexes))))
  ([tilemap indexes collides]
   (phaser->clj
    (.setCollision tilemap
                   (clj->phaser indexes)
                   (clj->phaser collides))))
  ([tilemap indexes collides layer]
   (phaser->clj
    (.setCollision tilemap
                   (clj->phaser indexes)
                   (clj->phaser collides)
                   (clj->phaser layer))))
  ([tilemap indexes collides layer recalculate]
   (phaser->clj
    (.setCollision tilemap
                   (clj->phaser indexes)
                   (clj->phaser collides)
                   (clj->phaser layer)
                   (clj->phaser recalculate)))))

(defn set-collision-between
  "Sets collision on a range of tiles where the tile IDs increment sequentially.
  Calling this with a start value of 10 and a stop value of 14 would set collision for tiles 10, 11, 12, 13 and 14.
  The `collides` parameter controls if collision will be enabled (true) or disabled (false).

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * start (number) - The first index of the tile to be set for collision.
    * stop (number) - The last index of the tile to be set for collision.
    * collides (boolean) {optional} - If true it will enable collision. If false it will clear collision.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on. If not given will default to this.currentLayer.
    * recalculate (boolean) {optional} - Recalculates the tile faces after the update."
  ([tilemap start stop]
   (phaser->clj
    (.setCollisionBetween tilemap
                          (clj->phaser start)
                          (clj->phaser stop))))
  ([tilemap start stop collides]
   (phaser->clj
    (.setCollisionBetween tilemap
                          (clj->phaser start)
                          (clj->phaser stop)
                          (clj->phaser collides))))
  ([tilemap start stop collides layer]
   (phaser->clj
    (.setCollisionBetween tilemap
                          (clj->phaser start)
                          (clj->phaser stop)
                          (clj->phaser collides)
                          (clj->phaser layer))))
  ([tilemap start stop collides layer recalculate]
   (phaser->clj
    (.setCollisionBetween tilemap
                          (clj->phaser start)
                          (clj->phaser stop)
                          (clj->phaser collides)
                          (clj->phaser layer)
                          (clj->phaser recalculate)))))

(defn set-collision-by-exclusion
  "Sets collision on all tiles in the given layer, except for the IDs of those in the given array.
  The `collides` parameter controls if collision will be enabled (true) or disabled (false).

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * indexes (array) - An array of the tile IDs to not be counted for collision.
    * collides (boolean) {optional} - If true it will enable collision. If false it will clear collision.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on. If not given will default to this.currentLayer.
    * recalculate (boolean) {optional} - Recalculates the tile faces after the update."
  ([tilemap indexes]
   (phaser->clj
    (.setCollisionByExclusion tilemap
                              (clj->phaser indexes))))
  ([tilemap indexes collides]
   (phaser->clj
    (.setCollisionByExclusion tilemap
                              (clj->phaser indexes)
                              (clj->phaser collides))))
  ([tilemap indexes collides layer]
   (phaser->clj
    (.setCollisionByExclusion tilemap
                              (clj->phaser indexes)
                              (clj->phaser collides)
                              (clj->phaser layer))))
  ([tilemap indexes collides layer recalculate]
   (phaser->clj
    (.setCollisionByExclusion tilemap
                              (clj->phaser indexes)
                              (clj->phaser collides)
                              (clj->phaser layer)
                              (clj->phaser recalculate)))))

(defn set-layer
  "Sets the current layer to the given index.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * layer (number | string | Phaser.TilemapLayer) - The layer to set as current."
  ([tilemap layer]
   (phaser->clj
    (.setLayer tilemap
               (clj->phaser layer)))))

(defn set-location
  "Sets the location marker to the given x/y coordinates within the map.
  Once set you can move the marker around via the movement and turn methods.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position of the top left of the area to copy (given in tiles, not pixels)
    * y (number) - Y position of the top left of the area to copy (given in tiles, not pixels)
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on. If not given will default to this.currentLayer.

  Returns:  boolean - True if the location could be set, otherwise false."
  ([tilemap x y]
   (phaser->clj
    (.setLocation tilemap
                  (clj->phaser x)
                  (clj->phaser y))))
  ([tilemap x y layer]
   (phaser->clj
    (.setLocation tilemap
                  (clj->phaser x)
                  (clj->phaser y)
                  (clj->phaser layer)))))

(defn set-prevent-recalculate
  "Turn off/on the recalculation of faces for tile or collision updates. 
  `setPreventRecalculate(true)` puts recalculation on hold while `setPreventRecalculate(false)` recalculates all the changed layers.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * value (boolean) - If true it will put the recalculation on hold."
  ([tilemap value]
   (phaser->clj
    (.setPreventRecalculate tilemap
                            (clj->phaser value)))))

(defn set-tile-index-callback
  "Sets a global collision callback for the given tile index within the layer. This will affect all tiles on this layer that have the same index.
  If a callback is already set for the tile index it will be replaced. Set the callback to null to remove it.
  If you want to set a callback for a tile at a specific location on the map then see setTileLocationCallback.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * indexes (number | array) - Either a single tile index, or an array of tile indexes to have a collision callback set for.
    * callback (function) - The callback that will be invoked when the tile is collided with.
    * callback-context (object) - The context under which the callback is called.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on. If not given will default to this.currentLayer."
  ([tilemap indexes callback callback-context]
   (phaser->clj
    (.setTileIndexCallback tilemap
                           (clj->phaser indexes)
                           (clj->phaser callback)
                           (clj->phaser callback-context))))
  ([tilemap indexes callback callback-context layer]
   (phaser->clj
    (.setTileIndexCallback tilemap
                           (clj->phaser indexes)
                           (clj->phaser callback)
                           (clj->phaser callback-context)
                           (clj->phaser layer)))))

(defn set-tile-location-callback
  "Sets a global collision callback for the given map location within the layer. This will affect all tiles on this layer found in the given area.
  If a callback is already set for the tile index it will be replaced. Set the callback to null to remove it.
  If you want to set a callback for a tile at a specific location on the map then see setTileLocationCallback.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position of the top left of the area to copy (given in tiles, not pixels)
    * y (number) - Y position of the top left of the area to copy (given in tiles, not pixels)
    * width (number) - The width of the area to copy (given in tiles, not pixels)
    * height (number) - The height of the area to copy (given in tiles, not pixels)
    * callback (function) - The callback that will be invoked when the tile is collided with.
    * callback-context (object) - The context under which the callback is called.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on. If not given will default to this.currentLayer."
  ([tilemap x y width height callback callback-context]
   (phaser->clj
    (.setTileLocationCallback tilemap
                              (clj->phaser x)
                              (clj->phaser y)
                              (clj->phaser width)
                              (clj->phaser height)
                              (clj->phaser callback)
                              (clj->phaser callback-context))))
  ([tilemap x y width height callback callback-context layer]
   (phaser->clj
    (.setTileLocationCallback tilemap
                              (clj->phaser x)
                              (clj->phaser y)
                              (clj->phaser width)
                              (clj->phaser height)
                              (clj->phaser callback)
                              (clj->phaser callback-context)
                              (clj->phaser layer)))))

(defn set-tile-size
  "Sets the base tile size for the map.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * tile-width (number) - The width of the tiles the map uses for calculations.
    * tile-height (number) - The height of the tiles the map uses for calculations."
  ([tilemap tile-width tile-height]
   (phaser->clj
    (.setTileSize tilemap
                  (clj->phaser tile-width)
                  (clj->phaser tile-height)))))

(defn shuffle
  "Shuffles a set of tiles in a given area. It will only randomise the tiles in that area, so if they're all the same nothing will appear to have changed!

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * x (number) - X position of the top left of the area to operate one, given in tiles, not pixels.
    * y (number) - Y position of the top left of the area to operate one, given in tiles, not pixels.
    * width (number) - The width in tiles of the area to operate on.
    * height (number) - The height in tiles of the area to operate on.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on."
  ([tilemap x y width height]
   (phaser->clj
    (.shuffle tilemap
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser width)
              (clj->phaser height))))
  ([tilemap x y width height layer]
   (phaser->clj
    (.shuffle tilemap
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser width)
              (clj->phaser height)
              (clj->phaser layer)))))

(defn swap
  "Scans the given area for tiles with an index matching tileA and swaps them with tileB.

  Parameters:
    * tilemap (Phaser.Tilemap) - Targeted instance for method
    * tile-a (number) - First tile index.
    * tile-b (number) - Second tile index.
    * x (number) - X position of the top left of the area to operate one, given in tiles, not pixels.
    * y (number) - Y position of the top left of the area to operate one, given in tiles, not pixels.
    * width (number) - The width in tiles of the area to operate on.
    * height (number) - The height in tiles of the area to operate on.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on."
  ([tilemap tile-a tile-b x y width height]
   (phaser->clj
    (.swap tilemap
           (clj->phaser tile-a)
           (clj->phaser tile-b)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height))))
  ([tilemap tile-a tile-b x y width height layer]
   (phaser->clj
    (.swap tilemap
           (clj->phaser tile-a)
           (clj->phaser tile-b)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser layer)))))