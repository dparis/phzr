(ns phzr.tilemap-layer
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->TilemapLayer
  "A TilemapLayer is a Phaser.Image/Sprite that renders a specific TileLayer of a Tilemap.

  Since a TilemapLayer is a Sprite it can be moved around the display, added to other groups or display objects, etc.

  By default TilemapLayers have fixedToCamera set to `true`. Changing this will break Camera follow and scrolling behavior.

  Parameters:
    * game (Phaser.Game) - Game reference to the currently running game.
    * tilemap (Phaser.Tilemap) - The tilemap to which this layer belongs.
    * index (integer) - The index of the TileLayer to render within the Tilemap.
    * width (integer) - Width of the renderable area of the layer (in pixels).
    * height (integer) - Height of the renderable area of the layer (in pixels)."
  ([game tilemap index width height]
   (js/Phaser.TilemapLayer. (clj->phaser game)
                            (clj->phaser tilemap)
                            (clj->phaser index)
                            (clj->phaser width)
                            (clj->phaser height))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([tilemap-layer child]
   (phaser->clj
    (.addChild tilemap-layer
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([tilemap-layer child index]
   (phaser->clj
    (.addChildAt tilemap-layer
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn bring-to-top
  "Brings this Game Object to the top of its parents display list.
  Visually this means it will render over the top of any old child in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will bring it to the top of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([tilemap-layer]
   (phaser->clj
    (.bringToTop tilemap-layer))))

(defn crop
  "Crop allows you to crop the texture being used to display this Game Object.
  Setting a crop rectangle modifies the core texture frame. The Game Object width and height properties will be adjusted accordingly.

  Cropping takes place from the top-left and can be modified in real-time either by providing an updated rectangle object to this method,
  or by modifying `cropRect` property directly and then calling `updateCrop`.

  The rectangle object given to this method can be either a `Phaser.Rectangle` or any other object 
  so long as it has public `x`, `y`, `width`, `height`, `right` and `bottom` properties.

  A reference to the rectangle is stored in `cropRect` unless the `copy` parameter is `true`, 
  in which case the values are duplicated to a local object.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * rect (Phaser.Rectangle) - The Rectangle used during cropping. Pass null or no parameters to clear a previously set crop rectangle.
    * copy (boolean) {optional} - If false `cropRect` will be stored as a reference to the given rect. If true it will copy the rect values into a local Phaser Rectangle object stored in cropRect."
  ([tilemap-layer rect]
   (phaser->clj
    (.crop tilemap-layer
           (clj->phaser rect))))
  ([tilemap-layer rect copy]
   (phaser->clj
    (.crop tilemap-layer
           (clj->phaser rect)
           (clj->phaser copy)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([tilemap-layer]
   (phaser->clj
    (.destroy tilemap-layer))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([tilemap-layer resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture tilemap-layer
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Returns the bounds of the Sprite as a rectangle. The bounds calculation takes the worldTransform into account.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * matrix (Matrix) - the transformation matrix of the sprite

  Returns:  Rectangle - the framing rectangle"
  ([tilemap-layer matrix]
   (phaser->clj
    (.getBounds tilemap-layer
                (clj->phaser matrix)))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([tilemap-layer index]
   (phaser->clj
    (.getChildAt tilemap-layer
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([tilemap-layer child]
   (phaser->clj
    (.getChildIndex tilemap-layer
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([tilemap-layer]
   (phaser->clj
    (.getLocalBounds tilemap-layer))))

(defn get-ray-cast-tiles
  "Gets all tiles that intersect with the given line.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * line (Phaser.Line) - The line used to determine which tiles to return.
    * step-rate (integer) {optional} - How many steps through the ray will we check? Defaults to `rayStepRate`.
    * collides (boolean) {optional} - If true, _only_ return tiles that collide on one or more faces.
    * interesting-face (boolean) {optional} - If true, _only_ return tiles that have interesting faces.

  Returns:  Array.<Phaser.Tile> - An array of Phaser.Tiles."
  ([tilemap-layer line]
   (phaser->clj
    (.getRayCastTiles tilemap-layer
                      (clj->phaser line))))
  ([tilemap-layer line step-rate]
   (phaser->clj
    (.getRayCastTiles tilemap-layer
                      (clj->phaser line)
                      (clj->phaser step-rate))))
  ([tilemap-layer line step-rate collides]
   (phaser->clj
    (.getRayCastTiles tilemap-layer
                      (clj->phaser line)
                      (clj->phaser step-rate)
                      (clj->phaser collides))))
  ([tilemap-layer line step-rate collides interesting-face]
   (phaser->clj
    (.getRayCastTiles tilemap-layer
                      (clj->phaser line)
                      (clj->phaser step-rate)
                      (clj->phaser collides)
                      (clj->phaser interesting-face)))))

(defn get-tile-x
  "Convert a pixel value to a tile coordinate.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * x (number) - X position of the point in target tile (in pixels).

  Returns:  integer - The X map location of the tile."
  ([tilemap-layer x]
   (phaser->clj
    (.getTileX tilemap-layer
               (clj->phaser x)))))

(defn get-tile-xy
  "Convert a pixel coordinate to a tile coordinate.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * x (number) - X position of the point in target tile (in pixels).
    * y (number) - Y position of the point in target tile (in pixels).
    * point (Phaser.Point | object) - The Point/object to update.

  Returns:  [Phaser.Point | object] - A Point/object with its `x` and `y` properties set."
  ([tilemap-layer x y point]
   (phaser->clj
    (.getTileXY tilemap-layer
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser point)))))

(defn get-tile-y
  "Convert a pixel value to a tile coordinate.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * y (number) - Y position of the point in target tile (in pixels).

  Returns:  integer - The Y map location of the tile."
  ([tilemap-layer y]
   (phaser->clj
    (.getTileY tilemap-layer
               (clj->phaser y)))))

(defn get-tiles
  "Get all tiles that exist within the given area, defined by the top-left corner, width and height. Values given are in pixels, not tiles.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * x (number) - X position of the top left corner (in pixels).
    * y (number) - Y position of the top left corner (in pixels).
    * width (number) - Width of the area to get (in pixels).
    * height (number) - Height of the area to get (in pixels).
    * collides (boolean) {optional} - If true, _only_ return tiles that collide on one or more faces.
    * interesting-face (boolean) {optional} - If true, _only_ return tiles that have interesting faces.

  Returns:  array.<Phaser.Tile> - An array of Tiles."
  ([tilemap-layer x y width height]
   (phaser->clj
    (.getTiles tilemap-layer
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser width)
               (clj->phaser height))))
  ([tilemap-layer x y width height collides]
   (phaser->clj
    (.getTiles tilemap-layer
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser width)
               (clj->phaser height)
               (clj->phaser collides))))
  ([tilemap-layer x y width height collides interesting-face]
   (phaser->clj
    (.getTiles tilemap-layer
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser width)
               (clj->phaser height)
               (clj->phaser collides)
               (clj->phaser interesting-face)))))

(defn kill
  "Kills a Game Object. A killed Game Object has its `alive`, `exists` and `visible` properties all set to false.

  It will dispatch the `onKilled` event. You can listen to `events.onKilled` for the signal.

  Note that killing a Game Object is a way for you to quickly recycle it in an object pool, 
  it doesn't destroy the object or free it up from memory.

  If you don't need this Game Object any more you should call `destroy` instead.

  Returns:  PIXI.DisplayObject - This instance."
  ([tilemap-layer]
   (phaser->clj
    (.kill tilemap-layer))))

(defn load-texture
  "Changes the base texture the Game Object is using. The old texture is removed and the new one is referenced or fetched from the Cache.

  If your Game Object is using a frame from a texture atlas and you just wish to change to another frame, then see the `frame` or `frameName` properties instead.

  You should only use `loadTexture` if you want to replace the base texture entirely.

  Calling this method causes a WebGL texture update, so use sparingly or in low-intensity portions of your game, or if you know the new texture is already on the GPU.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) - This is the image or texture used by the Sprite during rendering. It can be a string which is a reference to the Cache Image entry, or an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If this Sprite is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.
    * stop-animation (boolean) {optional} - If an animation is already playing on this Sprite you can choose to stop it or let it carry on playing."
  ([tilemap-layer key]
   (phaser->clj
    (.loadTexture tilemap-layer
                  (clj->phaser key))))
  ([tilemap-layer key frame]
   (phaser->clj
    (.loadTexture tilemap-layer
                  (clj->phaser key)
                  (clj->phaser frame))))
  ([tilemap-layer key frame stop-animation]
   (phaser->clj
    (.loadTexture tilemap-layer
                  (clj->phaser key)
                  (clj->phaser frame)
                  (clj->phaser stop-animation)))))

(defn move-down
  "Moves this Game Object down one place in its parents display list.
  This call has no effect if the Game Object is already at the bottom of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object down within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([tilemap-layer]
   (phaser->clj
    (.moveDown tilemap-layer))))

(defn move-up
  "Moves this Game Object up one place in its parents display list.
  This call has no effect if the Game Object is already at the top of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object up within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([tilemap-layer]
   (phaser->clj
    (.moveUp tilemap-layer))))

(defn overlap
  "Checks to see if the bounds of this Game Object overlaps with the bounds of the given Display Object, 
  which can be a Sprite, Image, TileSprite or anything that extends those such as Button or provides a `getBounds` method and result.

  This check ignores the `hitArea` property if set and runs a `getBounds` comparison on both objects to determine the result.

  Therefore it's relatively expensive to use in large quantities, i.e. with lots of Sprites at a high frequency.
  It should be fine for low-volume testing where physics isn't required.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject) - The display object to check against.

  Returns:  boolean - True if the bounds of this Game Object intersects at any point with the bounds of the given display object."
  ([tilemap-layer display-object]
   (phaser->clj
    (.overlap tilemap-layer
              (clj->phaser display-object)))))

(defn play
  "Plays an Animation.

  The animation should have previously been created via `animations.add`.

  If the animation is already playing calling this again won't do anything.
  If you need to reset an already running animation do so directly on the Animation object itself or via `AnimationManager.stop`.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * name (string) - The name of the animation to be played, e.g. 'fire', 'walk', 'jump'. Must have been previously created via 'AnimationManager.add'.
    * frame-rate (number) {optional} - The framerate to play the animation at. The speed is given in frames per second. If not provided the previously set frameRate of the Animation is used.
    * loop (boolean) {optional} - Should the animation be looped after playback. If not provided the previously set loop value of the Animation is used.
    * kill-on-complete (boolean) {optional} - If set to true when the animation completes (only happens if loop=false) the parent Sprite will be killed.

  Returns:  Phaser.Animation - A reference to playing Animation."
  ([tilemap-layer name]
   (phaser->clj
    (.play tilemap-layer
           (clj->phaser name))))
  ([tilemap-layer name frame-rate]
   (phaser->clj
    (.play tilemap-layer
           (clj->phaser name)
           (clj->phaser frame-rate))))
  ([tilemap-layer name frame-rate loop]
   (phaser->clj
    (.play tilemap-layer
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop))))
  ([tilemap-layer name frame-rate loop kill-on-complete]
   (phaser->clj
    (.play tilemap-layer
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop)
           (clj->phaser kill-on-complete)))))

(defn pre-update
  "Automatically called by World.preUpdate.

  Returns:  boolean - True if the Sprite was rendered, otherwise false."
  ([tilemap-layer]
   (phaser->clj
    (.preUpdate tilemap-layer))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([tilemap-layer child]
   (phaser->clj
    (.removeChild tilemap-layer
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([tilemap-layer index]
   (phaser->clj
    (.removeChildAt tilemap-layer
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([tilemap-layer begin-index end-index]
   (phaser->clj
    (.removeChildren tilemap-layer
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([tilemap-layer]
   (phaser->clj
    (.removeStageReference tilemap-layer))))

(defn reset
  "Resets the Game Object.

  This moves the Game Object to the given x/y world coordinates and sets `fresh`, `exists`, 
  `visible` and `renderable` to true.

  If this Game Object has the LifeSpan component it will also set `alive` to true and `health` to the given value.

  If this Game Object has a Physics Body it will reset the Body.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Game Object at.
    * y (number) - The y coordinate (in world space) to position the Game Object at.
    * health (number) {optional} - The health to give the Game Object if it has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([tilemap-layer x y]
   (phaser->clj
    (.reset tilemap-layer
            (clj->phaser x)
            (clj->phaser y))))
  ([tilemap-layer x y health]
   (phaser->clj
    (.reset tilemap-layer
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser health)))))

(defn reset-frame
  "Resets the texture frame dimensions that the Game Object uses for rendering."
  ([tilemap-layer]
   (phaser->clj
    (.resetFrame tilemap-layer))))

(defn reset-tileset-cache
  "The TilemapLayer caches tileset look-ups.

  Call this method of clear the cache if tilesets have been added or updated after the layer has been rendered."
  ([tilemap-layer]
   (phaser->clj
    (.resetTilesetCache tilemap-layer))))

(defn resize
  "Resizes the internal canvas and texture frame used by this TilemapLayer.

  This is an expensive call, so don't bind it to a window resize event! But instead call it at carefully
  selected times.

  Be aware that no validation of the new sizes takes place and the current map scroll coordinates are not
  modified either. You will have to handle both of these things from your game code if required.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * width (number) - The new width of the TilemapLayer
    * height (number) - The new height of the TilemapLayer"
  ([tilemap-layer width height]
   (phaser->clj
    (.resize tilemap-layer
             (clj->phaser width)
             (clj->phaser height)))))

(defn resize-frame
  "Resizes the Frame dimensions that the Game Object uses for rendering.

  You shouldn't normally need to ever call this, but in the case of special texture types such as Video or BitmapData
  it can be useful to adjust the dimensions directly in this way.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * parent (object) - The parent texture object that caused the resize, i.e. a Phaser.Video object.
    * width (integer) - The new width of the texture.
    * height (integer) - The new height of the texture."
  ([tilemap-layer parent width height]
   (phaser->clj
    (.resizeFrame tilemap-layer
                  (clj->phaser parent)
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn resize-world
  "Sets the world size to match the size of this layer."
  ([tilemap-layer]
   (phaser->clj
    (.resizeWorld tilemap-layer))))

(defn revive
  "Brings a 'dead' Game Object back to life, optionally resetting its health value in the process.

  A resurrected Game Object has its `alive`, `exists` and `visible` properties all set to true.

  It will dispatch the `onRevived` event. Listen to `events.onRevived` for the signal.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * health (number) {optional} - The health to give the Game Object. Only set if the GameObject has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([tilemap-layer]
   (phaser->clj
    (.revive tilemap-layer)))
  ([tilemap-layer health]
   (phaser->clj
    (.revive tilemap-layer
             (clj->phaser health)))))

(defn send-to-back
  "Sends this Game Object to the bottom of its parents display list.
  Visually this means it will render below all other children in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will send it to the bottom of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([tilemap-layer]
   (phaser->clj
    (.sendToBack tilemap-layer))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([tilemap-layer child index]
   (phaser->clj
    (.setChildIndex tilemap-layer
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-frame
  "Sets the texture frame the Game Object uses for rendering.

  This is primarily an internal method used by `loadTexture`, but is exposed for the use of plugins and custom classes.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * frame (Phaser.Frame) - The Frame to be used by the texture."
  ([tilemap-layer frame]
   (phaser->clj
    (.setFrame tilemap-layer
               (clj->phaser frame)))))

(defn set-scale
  "This method will set the scale of the tilemap as well as update the underlying block data of this layer

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * x-scale (number) {optional} - The scale factor along the X-plane
    * y-scale (number) {optional} - The scale factor along the Y-plane"
  ([tilemap-layer]
   (phaser->clj
    (.setScale tilemap-layer)))
  ([tilemap-layer x-scale]
   (phaser->clj
    (.setScale tilemap-layer
               (clj->phaser x-scale))))
  ([tilemap-layer x-scale y-scale]
   (phaser->clj
    (.setScale tilemap-layer
               (clj->phaser x-scale)
               (clj->phaser y-scale)))))

(defn set-scale-min-max
  "Sets the scaleMin and scaleMax values. These values are used to limit how far this Game Object will scale based on its parent.

  For example if this Game Object has a `minScale` value of 1 and its parent has a `scale` value of 0.5, the 0.5 will be ignored 
  and the scale value of 1 will be used, as the parents scale is lower than the minimum scale this Game Object should adhere to.

  By setting these values you can carefully control how Game Objects deal with responsive scaling.

  If only one parameter is given then that value will be used for both scaleMin and scaleMax:
  `setScaleMinMax(1)` = scaleMin.x, scaleMin.y, scaleMax.x and scaleMax.y all = 1

  If only two parameters are given the first is set as scaleMin.x and y and the second as scaleMax.x and y:
  `setScaleMinMax(0.5, 2)` = scaleMin.x and y = 0.5 and scaleMax.x and y = 2

  If you wish to set `scaleMin` with different values for x and y then either modify Game Object.scaleMin directly, 
  or pass `null` for the `maxX` and `maxY` parameters.

  Call `setScaleMinMax(null)` to clear all previously set values.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * min-x (number | null) - The minimum horizontal scale value this Game Object can scale down to.
    * min-y (number | null) - The minimum vertical scale value this Game Object can scale down to.
    * max-x (number | null) - The maximum horizontal scale value this Game Object can scale up to.
    * max-y (number | null) - The maximum vertical scale value this Game Object can scale up to."
  ([tilemap-layer min-x min-y max-x max-y]
   (phaser->clj
    (.setScaleMinMax tilemap-layer
                     (clj->phaser min-x)
                     (clj->phaser min-y)
                     (clj->phaser max-x)
                     (clj->phaser max-y)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([tilemap-layer stage]
   (phaser->clj
    (.setStageReference tilemap-layer
                        (clj->phaser stage)))))

(defn set-texture
  "Sets the texture of the sprite

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * texture (PIXI.Texture) - The PIXI texture that is displayed by the sprite"
  ([tilemap-layer texture]
   (phaser->clj
    (.setTexture tilemap-layer
                 (clj->phaser texture)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([tilemap-layer child child-2]
   (phaser->clj
    (.swapChildren tilemap-layer
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([tilemap-layer position]
   (phaser->clj
    (.toGlobal tilemap-layer
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * tilemap-layer (Phaser.TilemapLayer) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([tilemap-layer position]
   (phaser->clj
    (.toLocal tilemap-layer
              (clj->phaser position))))
  ([tilemap-layer position from]
   (phaser->clj
    (.toLocal tilemap-layer
              (clj->phaser position)
              (clj->phaser from)))))

(defn update
  "Override this method in your own custom objects to handle any update requirements.
  It is called immediately after `preUpdate` and before `postUpdate`.
  Remember if this Game Object has any children you should call update on those too."
  ([tilemap-layer]
   (phaser->clj
    (.update tilemap-layer))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([tilemap-layer]
   (phaser->clj
    (.updateCache tilemap-layer))))

(defn update-crop
  "If you have set a crop rectangle on this Game Object via `crop` and since modified the `cropRect` property,
  or the rectangle it references, then you need to update the crop frame by calling this method."
  ([tilemap-layer]
   (phaser->clj
    (.updateCrop tilemap-layer))))