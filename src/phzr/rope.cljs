(ns phzr.rope
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Rope
  "A Rope is a Sprite that has a repeating texture. The texture can be scrolled and scaled and will automatically wrap on the edges as it does so.
  Please note that Ropes, as with normal Sprites, have no input handler or physics bodies by default. Both need enabling.
  Example usage: https://github.com/codevinsky/phaser-rope-demo/blob/master/dist/demo.js

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * x (number) - The x coordinate (in world space) to position the Rope at.
    * y (number) - The y coordinate (in world space) to position the Rope at.
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture) - This is the image or texture used by the Rope during rendering. It can be a string which is a reference to the Cache entry, or an instance of a RenderTexture or PIXI.Texture.
    * frame (string | number) - If this Rope is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.
    * points (Array) - An array of {Phaser.Point}."
  ([game x y key frame points]
   (js/Phaser.Rope. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser key)
                    (clj->phaser frame)
                    (clj->phaser points))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([rope child]
   (phaser->clj
    (.addChild rope
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([rope child index]
   (phaser->clj
    (.addChildAt rope
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn bring-to-top
  "Brings this Game Object to the top of its parents display list.
  Visually this means it will render over the top of any old child in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will bring it to the top of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([rope]
   (phaser->clj
    (.bringToTop rope))))

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
    * rope (Phaser.Rope) - Targeted instance for method
    * rect (Phaser.Rectangle) - The Rectangle used during cropping. Pass null or no parameters to clear a previously set crop rectangle.
    * copy (boolean) {optional} - If false `cropRect` will be stored as a reference to the given rect. If true it will copy the rect values into a local Phaser Rectangle object stored in cropRect."
  ([rope rect]
   (phaser->clj
    (.crop rope
           (clj->phaser rect))))
  ([rope rect copy]
   (phaser->clj
    (.crop rope
           (clj->phaser rect)
           (clj->phaser copy)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([rope]
   (phaser->clj
    (.destroy rope))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([rope resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture rope
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Returns the bounds of the mesh as a rectangle. The bounds calculation takes the worldTransform into account.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * matrix (Matrix) - the transformation matrix of the sprite

  Returns:  Rectangle - the framing rectangle"
  ([rope matrix]
   (phaser->clj
    (.getBounds rope
                (clj->phaser matrix)))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([rope index]
   (phaser->clj
    (.getChildAt rope
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([rope child]
   (phaser->clj
    (.getChildIndex rope
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([rope]
   (phaser->clj
    (.getLocalBounds rope))))

(defn kill
  "Kills a Game Object. A killed Game Object has its `alive`, `exists` and `visible` properties all set to false.

  It will dispatch the `onKilled` event. You can listen to `events.onKilled` for the signal.

  Note that killing a Game Object is a way for you to quickly recycle it in an object pool, 
  it doesn't destroy the object or free it up from memory.

  If you don't need this Game Object any more you should call `destroy` instead.

  Returns:  PIXI.DisplayObject - This instance."
  ([rope]
   (phaser->clj
    (.kill rope))))

(defn load-texture
  "Changes the base texture the Game Object is using. The old texture is removed and the new one is referenced or fetched from the Cache.

  If your Game Object is using a frame from a texture atlas and you just wish to change to another frame, then see the `frame` or `frameName` properties instead.

  You should only use `loadTexture` if you want to replace the base texture entirely.

  Calling this method causes a WebGL texture update, so use sparingly or in low-intensity portions of your game, or if you know the new texture is already on the GPU.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) - This is the image or texture used by the Sprite during rendering. It can be a string which is a reference to the Cache Image entry, or an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If this Sprite is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.
    * stop-animation (boolean) {optional} - If an animation is already playing on this Sprite you can choose to stop it or let it carry on playing."
  ([rope key]
   (phaser->clj
    (.loadTexture rope
                  (clj->phaser key))))
  ([rope key frame]
   (phaser->clj
    (.loadTexture rope
                  (clj->phaser key)
                  (clj->phaser frame))))
  ([rope key frame stop-animation]
   (phaser->clj
    (.loadTexture rope
                  (clj->phaser key)
                  (clj->phaser frame)
                  (clj->phaser stop-animation)))))

(defn move-down
  "Moves this Game Object down one place in its parents display list.
  This call has no effect if the Game Object is already at the bottom of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object down within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([rope]
   (phaser->clj
    (.moveDown rope))))

(defn move-up
  "Moves this Game Object up one place in its parents display list.
  This call has no effect if the Game Object is already at the top of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object up within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([rope]
   (phaser->clj
    (.moveUp rope))))

(defn overlap
  "Checks to see if the bounds of this Game Object overlaps with the bounds of the given Display Object, 
  which can be a Sprite, Image, TileSprite or anything that extends those such as Button or provides a `getBounds` method and result.

  This check ignores the `hitArea` property if set and runs a `getBounds` comparison on both objects to determine the result.

  Therefore it's relatively expensive to use in large quantities, i.e. with lots of Sprites at a high frequency.
  It should be fine for low-volume testing where physics isn't required.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject) - The display object to check against.

  Returns:  boolean - True if the bounds of this Game Object intersects at any point with the bounds of the given display object."
  ([rope display-object]
   (phaser->clj
    (.overlap rope
              (clj->phaser display-object)))))

(defn play
  "Plays an Animation.

  The animation should have previously been created via `animations.add`.

  If the animation is already playing calling this again won't do anything.
  If you need to reset an already running animation do so directly on the Animation object itself or via `AnimationManager.stop`.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * name (string) - The name of the animation to be played, e.g. 'fire', 'walk', 'jump'. Must have been previously created via 'AnimationManager.add'.
    * frame-rate (number) {optional} - The framerate to play the animation at. The speed is given in frames per second. If not provided the previously set frameRate of the Animation is used.
    * loop (boolean) {optional} - Should the animation be looped after playback. If not provided the previously set loop value of the Animation is used.
    * kill-on-complete (boolean) {optional} - If set to true when the animation completes (only happens if loop=false) the parent Sprite will be killed.

  Returns:  Phaser.Animation - A reference to playing Animation."
  ([rope name]
   (phaser->clj
    (.play rope
           (clj->phaser name))))
  ([rope name frame-rate]
   (phaser->clj
    (.play rope
           (clj->phaser name)
           (clj->phaser frame-rate))))
  ([rope name frame-rate loop]
   (phaser->clj
    (.play rope
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop))))
  ([rope name frame-rate loop kill-on-complete]
   (phaser->clj
    (.play rope
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop)
           (clj->phaser kill-on-complete)))))

(defn pre-update
  "Automatically called by World.preUpdate."
  ([rope]
   (phaser->clj
    (.preUpdate rope))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([rope child]
   (phaser->clj
    (.removeChild rope
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([rope index]
   (phaser->clj
    (.removeChildAt rope
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([rope begin-index end-index]
   (phaser->clj
    (.removeChildren rope
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([rope]
   (phaser->clj
    (.removeStageReference rope))))

(defn reset
  "Resets the Rope. This places the Rope at the given x/y world coordinates, resets the tilePosition and then
  sets alive, exists, visible and renderable all to true. Also resets the outOfBounds state.
  If the Rope has a physics body that too is reset.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Sprite at.
    * y (number) - The y coordinate (in world space) to position the Sprite at.

  Returns:   - (Phaser.Rope) This instance."
  ([rope x y]
   (phaser->clj
    (.reset rope
            (clj->phaser x)
            (clj->phaser y)))))

(defn reset-frame
  "Resets the texture frame dimensions that the Game Object uses for rendering."
  ([rope]
   (phaser->clj
    (.resetFrame rope))))

(defn resize-frame
  "Resizes the Frame dimensions that the Game Object uses for rendering.

  You shouldn't normally need to ever call this, but in the case of special texture types such as Video or BitmapData
  it can be useful to adjust the dimensions directly in this way.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * parent (object) - The parent texture object that caused the resize, i.e. a Phaser.Video object.
    * width (integer) - The new width of the texture.
    * height (integer) - The new height of the texture."
  ([rope parent width height]
   (phaser->clj
    (.resizeFrame rope
                  (clj->phaser parent)
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn revive
  "Brings a 'dead' Game Object back to life, optionally resetting its health value in the process.

  A resurrected Game Object has its `alive`, `exists` and `visible` properties all set to true.

  It will dispatch the `onRevived` event. Listen to `events.onRevived` for the signal.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * health (number) {optional} - The health to give the Game Object. Only set if the GameObject has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([rope]
   (phaser->clj
    (.revive rope)))
  ([rope health]
   (phaser->clj
    (.revive rope
             (clj->phaser health)))))

(defn send-to-back
  "Sends this Game Object to the bottom of its parents display list.
  Visually this means it will render below all other children in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will send it to the bottom of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([rope]
   (phaser->clj
    (.sendToBack rope))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([rope child index]
   (phaser->clj
    (.setChildIndex rope
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-frame
  "Sets the texture frame the Game Object uses for rendering.

  This is primarily an internal method used by `loadTexture`, but is exposed for the use of plugins and custom classes.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * frame (Phaser.Frame) - The Frame to be used by the texture."
  ([rope frame]
   (phaser->clj
    (.setFrame rope
               (clj->phaser frame)))))

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
    * rope (Phaser.Rope) - Targeted instance for method
    * min-x (number | null) - The minimum horizontal scale value this Game Object can scale down to.
    * min-y (number | null) - The minimum vertical scale value this Game Object can scale down to.
    * max-x (number | null) - The maximum horizontal scale value this Game Object can scale up to.
    * max-y (number | null) - The maximum vertical scale value this Game Object can scale up to."
  ([rope min-x min-y max-x max-y]
   (phaser->clj
    (.setScaleMinMax rope
                     (clj->phaser min-x)
                     (clj->phaser min-y)
                     (clj->phaser max-x)
                     (clj->phaser max-y)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([rope stage]
   (phaser->clj
    (.setStageReference rope
                        (clj->phaser stage)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([rope child child-2]
   (phaser->clj
    (.swapChildren rope
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([rope position]
   (phaser->clj
    (.toGlobal rope
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * rope (Phaser.Rope) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([rope position]
   (phaser->clj
    (.toLocal rope
              (clj->phaser position))))
  ([rope position from]
   (phaser->clj
    (.toLocal rope
              (clj->phaser position)
              (clj->phaser from)))))

(defn update
  "Override and use this function in your own custom objects to handle any update requirements you may have."
  ([rope]
   (phaser->clj
    (.update rope))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([rope]
   (phaser->clj
    (.updateCache rope))))

(defn update-crop
  "If you have set a crop rectangle on this Game Object via `crop` and since modified the `cropRect` property,
  or the rectangle it references, then you need to update the crop frame by calling this method."
  ([rope]
   (phaser->clj
    (.updateCrop rope))))