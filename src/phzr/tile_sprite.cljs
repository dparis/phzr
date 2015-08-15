(ns phzr.tile-sprite
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->TileSprite
  "A TileSprite is a Sprite that has a repeating texture. The texture can be scrolled and scaled independently of the TileSprite itself.
  Textures will automatically wrap and are designed so that you can create game backdrops using seamless textures as a source.

  TileSprites have no input handler or physics bodies by default, both need enabling in the same way as for normal Sprites.

  You shouldn't ever create a TileSprite any larger than your actual screen size. If you want to create a large repeating background
  that scrolls across the whole map of your game, then you create a TileSprite that fits the screen size and then use the `tilePosition`
  property to scroll the texture as the player moves. If you create a TileSprite that is thousands of pixels in size then it will 
  consume huge amounts of memory and cause performance issues. Remember: use `tilePosition` to scroll your texture and `tileScale` to
  adjust the scale of the texture - don't resize the sprite itself or make it larger than it needs.

  An important note about texture dimensions:

  When running under Canvas a TileSprite can use any texture size without issue. When running under WebGL the texture should ideally be
  a power of two in size (i.e. 4, 8, 16, 32, 64, 128, 256, 512, etch pixels width by height). If the texture isn't a power of two
  it will be rendered to a blank canvas that is the correct size, which means you may have 'blank' areas appearing to the right and
  bottom of your frame. To avoid this ensure your textures are perfect powers of two.

  TileSprites support animations in the same way that Sprites do. You add and play animations using the AnimationManager. However
  if your game is running under WebGL please note that each frame of the animation must be a power of two in size, or it will receive
  additional padding to enforce it to be so.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * x (number) - The x coordinate (in world space) to position the TileSprite at.
    * y (number) - The y coordinate (in world space) to position the TileSprite at.
    * width (number) - The width of the TileSprite.
    * height (number) - The height of the TileSprite.
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture) - This is the image or texture used by the TileSprite during rendering. It can be a string which is a reference to the Phaser Image Cache entry, or an instance of a RenderTexture, PIXI.Texture or BitmapData.
    * frame (string | number) - If this TileSprite is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index."
  ([game x y width height key frame]
   (js/Phaser.TileSprite. (clj->phaser game)
                          (clj->phaser x)
                          (clj->phaser y)
                          (clj->phaser width)
                          (clj->phaser height)
                          (clj->phaser key)
                          (clj->phaser frame))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([tile-sprite child]
   (phaser->clj
    (.addChild tile-sprite
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([tile-sprite child index]
   (phaser->clj
    (.addChildAt tile-sprite
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn auto-scroll
  "Sets this TileSprite to automatically scroll in the given direction until stopped via TileSprite.stopScroll().
  The scroll speed is specified in pixels per second.
  A negative x value will scroll to the left. A positive x value will scroll to the right.
  A negative y value will scroll up. A positive y value will scroll down.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * x (number) - Horizontal scroll speed in pixels per second.
    * y (number) - Vertical scroll speed in pixels per second."
  ([tile-sprite x y]
   (phaser->clj
    (.autoScroll tile-sprite
                 (clj->phaser x)
                 (clj->phaser y)))))

(defn bring-to-top
  "Brings this Game Object to the top of its parents display list.
  Visually this means it will render over the top of any old child in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will bring it to the top of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([tile-sprite]
   (phaser->clj
    (.bringToTop tile-sprite))))

(defn destroy
  "Destroys the TileSprite. This removes it from its parent group, destroys the event and animation handlers if present
  and nulls its reference to game, freeing it up for garbage collection.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * destroy-children (boolean) {optional} - Should every child of this object have its destroy method called?"
  ([tile-sprite]
   (phaser->clj
    (.destroy tile-sprite)))
  ([tile-sprite destroy-children]
   (phaser->clj
    (.destroy tile-sprite
              (clj->phaser destroy-children)))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([tile-sprite resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture tile-sprite
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn generate-tiling-texture
  "

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * force-power-of-two (Boolean) - Whether we want to force the texture to be a power of two"
  ([tile-sprite force-power-of-two]
   (phaser->clj
    (.generateTilingTexture tile-sprite
                            (clj->phaser force-power-of-two)))))

(defn get-bounds
  "Returns the framing rectangle of the sprite as a PIXI.Rectangle object

  Returns:  Rectangle - the framing rectangle"
  ([tile-sprite]
   (phaser->clj
    (.getBounds tile-sprite))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([tile-sprite index]
   (phaser->clj
    (.getChildAt tile-sprite
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([tile-sprite child]
   (phaser->clj
    (.getChildIndex tile-sprite
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([tile-sprite]
   (phaser->clj
    (.getLocalBounds tile-sprite))))

(defn kill
  "Kills a Game Object. A killed Game Object has its `alive`, `exists` and `visible` properties all set to false.

  It will dispatch the `onKilled` event. You can listen to `events.onKilled` for the signal.

  Note that killing a Game Object is a way for you to quickly recycle it in an object pool, 
  it doesn't destroy the object or free it up from memory.

  If you don't need this Game Object any more you should call `destroy` instead.

  Returns:  PIXI.DisplayObject - This instance."
  ([tile-sprite]
   (phaser->clj
    (.kill tile-sprite))))

(defn load-texture
  "Changes the base texture the Game Object is using. The old texture is removed and the new one is referenced or fetched from the Cache.

  If your Game Object is using a frame from a texture atlas and you just wish to change to another frame, then see the `frame` or `frameName` properties instead.

  You should only use `loadTexture` if you want to replace the base texture entirely.

  Calling this method causes a WebGL texture update, so use sparingly or in low-intensity portions of your game, or if you know the new texture is already on the GPU.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) - This is the image or texture used by the Sprite during rendering. It can be a string which is a reference to the Cache Image entry, or an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If this Sprite is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.
    * stop-animation (boolean) {optional} - If an animation is already playing on this Sprite you can choose to stop it or let it carry on playing."
  ([tile-sprite key]
   (phaser->clj
    (.loadTexture tile-sprite
                  (clj->phaser key))))
  ([tile-sprite key frame]
   (phaser->clj
    (.loadTexture tile-sprite
                  (clj->phaser key)
                  (clj->phaser frame))))
  ([tile-sprite key frame stop-animation]
   (phaser->clj
    (.loadTexture tile-sprite
                  (clj->phaser key)
                  (clj->phaser frame)
                  (clj->phaser stop-animation)))))

(defn move-down
  "Moves this Game Object down one place in its parents display list.
  This call has no effect if the Game Object is already at the bottom of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object down within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([tile-sprite]
   (phaser->clj
    (.moveDown tile-sprite))))

(defn move-up
  "Moves this Game Object up one place in its parents display list.
  This call has no effect if the Game Object is already at the top of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object up within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([tile-sprite]
   (phaser->clj
    (.moveUp tile-sprite))))

(defn overlap
  "Checks to see if the bounds of this Game Object overlaps with the bounds of the given Display Object, 
  which can be a Sprite, Image, TileSprite or anything that extends those such as Button or provides a `getBounds` method and result.

  This check ignores the `hitArea` property if set and runs a `getBounds` comparison on both objects to determine the result.

  Therefore it's relatively expensive to use in large quantities, i.e. with lots of Sprites at a high frequency.
  It should be fine for low-volume testing where physics isn't required.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject) - The display object to check against.

  Returns:  boolean - True if the bounds of this Game Object intersects at any point with the bounds of the given display object."
  ([tile-sprite display-object]
   (phaser->clj
    (.overlap tile-sprite
              (clj->phaser display-object)))))

(defn play
  "Plays an Animation.

  The animation should have previously been created via `animations.add`.

  If the animation is already playing calling this again won't do anything.
  If you need to reset an already running animation do so directly on the Animation object itself or via `AnimationManager.stop`.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * name (string) - The name of the animation to be played, e.g. 'fire', 'walk', 'jump'. Must have been previously created via 'AnimationManager.add'.
    * frame-rate (number) {optional} - The framerate to play the animation at. The speed is given in frames per second. If not provided the previously set frameRate of the Animation is used.
    * loop (boolean) {optional} - Should the animation be looped after playback. If not provided the previously set loop value of the Animation is used.
    * kill-on-complete (boolean) {optional} - If set to true when the animation completes (only happens if loop=false) the parent Sprite will be killed.

  Returns:  Phaser.Animation - A reference to playing Animation."
  ([tile-sprite name]
   (phaser->clj
    (.play tile-sprite
           (clj->phaser name))))
  ([tile-sprite name frame-rate]
   (phaser->clj
    (.play tile-sprite
           (clj->phaser name)
           (clj->phaser frame-rate))))
  ([tile-sprite name frame-rate loop]
   (phaser->clj
    (.play tile-sprite
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop))))
  ([tile-sprite name frame-rate loop kill-on-complete]
   (phaser->clj
    (.play tile-sprite
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop)
           (clj->phaser kill-on-complete)))))

(defn pre-update
  "Automatically called by World.preUpdate."
  ([tile-sprite]
   (phaser->clj
    (.preUpdate tile-sprite))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([tile-sprite child]
   (phaser->clj
    (.removeChild tile-sprite
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([tile-sprite index]
   (phaser->clj
    (.removeChildAt tile-sprite
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([tile-sprite begin-index end-index]
   (phaser->clj
    (.removeChildren tile-sprite
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([tile-sprite]
   (phaser->clj
    (.removeStageReference tile-sprite))))

(defn reset
  "Resets the TileSprite. This places the TileSprite at the given x/y world coordinates, resets the tilePosition and then
  sets alive, exists, visible and renderable all to true. Also resets the outOfBounds state.
  If the TileSprite has a physics body that too is reset.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Sprite at.
    * y (number) - The y coordinate (in world space) to position the Sprite at.

  Returns:   - (Phaser.TileSprite) This instance."
  ([tile-sprite x y]
   (phaser->clj
    (.reset tile-sprite
            (clj->phaser x)
            (clj->phaser y)))))

(defn reset-frame
  "Resets the texture frame dimensions that the Game Object uses for rendering."
  ([tile-sprite]
   (phaser->clj
    (.resetFrame tile-sprite))))

(defn resize-frame
  "Resizes the Frame dimensions that the Game Object uses for rendering.

  You shouldn't normally need to ever call this, but in the case of special texture types such as Video or BitmapData
  it can be useful to adjust the dimensions directly in this way.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * parent (object) - The parent texture object that caused the resize, i.e. a Phaser.Video object.
    * width (integer) - The new width of the texture.
    * height (integer) - The new height of the texture."
  ([tile-sprite parent width height]
   (phaser->clj
    (.resizeFrame tile-sprite
                  (clj->phaser parent)
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn revive
  "Brings a 'dead' Game Object back to life, optionally resetting its health value in the process.

  A resurrected Game Object has its `alive`, `exists` and `visible` properties all set to true.

  It will dispatch the `onRevived` event. Listen to `events.onRevived` for the signal.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * health (number) {optional} - The health to give the Game Object. Only set if the GameObject has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([tile-sprite]
   (phaser->clj
    (.revive tile-sprite)))
  ([tile-sprite health]
   (phaser->clj
    (.revive tile-sprite
             (clj->phaser health)))))

(defn send-to-back
  "Sends this Game Object to the bottom of its parents display list.
  Visually this means it will render below all other children in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will send it to the bottom of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([tile-sprite]
   (phaser->clj
    (.sendToBack tile-sprite))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([tile-sprite child index]
   (phaser->clj
    (.setChildIndex tile-sprite
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-frame
  "Sets the texture frame the Game Object uses for rendering.

  This is primarily an internal method used by `loadTexture`, but is exposed for the use of plugins and custom classes.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * frame (Phaser.Frame) - The Frame to be used by the texture."
  ([tile-sprite frame]
   (phaser->clj
    (.setFrame tile-sprite
               (clj->phaser frame)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([tile-sprite stage]
   (phaser->clj
    (.setStageReference tile-sprite
                        (clj->phaser stage)))))

(defn set-texture
  "Sets the texture of the sprite

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * texture (PIXI.Texture) - The PIXI texture that is displayed by the sprite"
  ([tile-sprite texture]
   (phaser->clj
    (.setTexture tile-sprite
                 (clj->phaser texture)))))

(defn stop-scroll
  "Stops an automatically scrolling TileSprite."
  ([tile-sprite]
   (phaser->clj
    (.stopScroll tile-sprite))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([tile-sprite child child-2]
   (phaser->clj
    (.swapChildren tile-sprite
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([tile-sprite position]
   (phaser->clj
    (.toGlobal tile-sprite
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * tile-sprite (Phaser.TileSprite) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([tile-sprite position]
   (phaser->clj
    (.toLocal tile-sprite
              (clj->phaser position))))
  ([tile-sprite position from]
   (phaser->clj
    (.toLocal tile-sprite
              (clj->phaser position)
              (clj->phaser from)))))

(defn update
  "Override this method in your own custom objects to handle any update requirements.
  It is called immediately after `preUpdate` and before `postUpdate`.
  Remember if this Game Object has any children you should call update on those too."
  ([tile-sprite]
   (phaser->clj
    (.update tile-sprite))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([tile-sprite]
   (phaser->clj
    (.updateCache tile-sprite))))