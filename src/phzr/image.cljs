(ns phzr.image
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Image
  "An Image is a light-weight object you can use to display anything that doesn't need physics or animation.
  It can still rotate, scale, crop and receive input events. This makes it perfect for logos, backgrounds, simple buttons and other non-Sprite graphics.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * x (number) {optional} - The x coordinate of the Image. The coordinate is relative to any parent container this Image may be in.
    * y (number) {optional} - The y coordinate of the Image. The coordinate is relative to any parent container this Image may be in.
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture) {optional} - The texture used by the Image during rendering. It can be a string which is a reference to the Cache entry, or an instance of a RenderTexture, BitmapData or PIXI.Texture.
    * frame (string | number) {optional} - If this Image is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index."
  ([game]
   (js/Phaser.Image. (clj->phaser game)))
  ([game x]
   (js/Phaser.Image. (clj->phaser game)
                     (clj->phaser x)))
  ([game x y]
   (js/Phaser.Image. (clj->phaser game)
                     (clj->phaser x)
                     (clj->phaser y)))
  ([game x y key]
   (js/Phaser.Image. (clj->phaser game)
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser key)))
  ([game x y key frame]
   (js/Phaser.Image. (clj->phaser game)
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser key)
                     (clj->phaser frame))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([image child]
   (phaser->clj
    (.addChild image
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([image child index]
   (phaser->clj
    (.addChildAt image
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn bring-to-top
  "Brings this Game Object to the top of its parents display list.
  Visually this means it will render over the top of any old child in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will bring it to the top of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([image]
   (phaser->clj
    (.bringToTop image))))

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
    * image (Phaser.Image) - Targeted instance for method
    * rect (Phaser.Rectangle) - The Rectangle used during cropping. Pass null or no parameters to clear a previously set crop rectangle.
    * copy (boolean) {optional} - If false `cropRect` will be stored as a reference to the given rect. If true it will copy the rect values into a local Phaser Rectangle object stored in cropRect."
  ([image rect]
   (phaser->clj
    (.crop image
           (clj->phaser rect))))
  ([image rect copy]
   (phaser->clj
    (.crop image
           (clj->phaser rect)
           (clj->phaser copy)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([image]
   (phaser->clj
    (.destroy image))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([image resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture image
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Returns the bounds of the Sprite as a rectangle. The bounds calculation takes the worldTransform into account.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * matrix (Matrix) - the transformation matrix of the sprite

  Returns:  Rectangle - the framing rectangle"
  ([image matrix]
   (phaser->clj
    (.getBounds image
                (clj->phaser matrix)))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([image index]
   (phaser->clj
    (.getChildAt image
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([image child]
   (phaser->clj
    (.getChildIndex image
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([image]
   (phaser->clj
    (.getLocalBounds image))))

(defn kill
  "Kills a Game Object. A killed Game Object has its `alive`, `exists` and `visible` properties all set to false.

  It will dispatch the `onKilled` event. You can listen to `events.onKilled` for the signal.

  Note that killing a Game Object is a way for you to quickly recycle it in an object pool, 
  it doesn't destroy the object or free it up from memory.

  If you don't need this Game Object any more you should call `destroy` instead.

  Returns:  PIXI.DisplayObject - This instance."
  ([image]
   (phaser->clj
    (.kill image))))

(defn load-texture
  "Changes the base texture the Game Object is using. The old texture is removed and the new one is referenced or fetched from the Cache.

  If your Game Object is using a frame from a texture atlas and you just wish to change to another frame, then see the `frame` or `frameName` properties instead.

  You should only use `loadTexture` if you want to replace the base texture entirely.

  Calling this method causes a WebGL texture update, so use sparingly or in low-intensity portions of your game, or if you know the new texture is already on the GPU.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) - This is the image or texture used by the Sprite during rendering. It can be a string which is a reference to the Cache Image entry, or an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If this Sprite is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.
    * stop-animation (boolean) {optional} - If an animation is already playing on this Sprite you can choose to stop it or let it carry on playing."
  ([image key]
   (phaser->clj
    (.loadTexture image
                  (clj->phaser key))))
  ([image key frame]
   (phaser->clj
    (.loadTexture image
                  (clj->phaser key)
                  (clj->phaser frame))))
  ([image key frame stop-animation]
   (phaser->clj
    (.loadTexture image
                  (clj->phaser key)
                  (clj->phaser frame)
                  (clj->phaser stop-animation)))))

(defn move-down
  "Moves this Game Object down one place in its parents display list.
  This call has no effect if the Game Object is already at the bottom of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object down within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([image]
   (phaser->clj
    (.moveDown image))))

(defn move-up
  "Moves this Game Object up one place in its parents display list.
  This call has no effect if the Game Object is already at the top of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object up within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([image]
   (phaser->clj
    (.moveUp image))))

(defn overlap
  "Checks to see if the bounds of this Game Object overlaps with the bounds of the given Display Object, 
  which can be a Sprite, Image, TileSprite or anything that extends those such as Button or provides a `getBounds` method and result.

  This check ignores the `hitArea` property if set and runs a `getBounds` comparison on both objects to determine the result.

  Therefore it's relatively expensive to use in large quantities, i.e. with lots of Sprites at a high frequency.
  It should be fine for low-volume testing where physics isn't required.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject) - The display object to check against.

  Returns:  boolean - True if the bounds of this Game Object intersects at any point with the bounds of the given display object."
  ([image display-object]
   (phaser->clj
    (.overlap image
              (clj->phaser display-object)))))

(defn play
  "Plays an Animation.

  The animation should have previously been created via `animations.add`.

  If the animation is already playing calling this again won't do anything.
  If you need to reset an already running animation do so directly on the Animation object itself or via `AnimationManager.stop`.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * name (string) - The name of the animation to be played, e.g. 'fire', 'walk', 'jump'. Must have been previously created via 'AnimationManager.add'.
    * frame-rate (number) {optional} - The framerate to play the animation at. The speed is given in frames per second. If not provided the previously set frameRate of the Animation is used.
    * loop (boolean) {optional} - Should the animation be looped after playback. If not provided the previously set loop value of the Animation is used.
    * kill-on-complete (boolean) {optional} - If set to true when the animation completes (only happens if loop=false) the parent Sprite will be killed.

  Returns:  Phaser.Animation - A reference to playing Animation."
  ([image name]
   (phaser->clj
    (.play image
           (clj->phaser name))))
  ([image name frame-rate]
   (phaser->clj
    (.play image
           (clj->phaser name)
           (clj->phaser frame-rate))))
  ([image name frame-rate loop]
   (phaser->clj
    (.play image
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop))))
  ([image name frame-rate loop kill-on-complete]
   (phaser->clj
    (.play image
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop)
           (clj->phaser kill-on-complete)))))

(defn pre-update
  "Automatically called by World.preUpdate."
  ([image]
   (phaser->clj
    (.preUpdate image))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([image child]
   (phaser->clj
    (.removeChild image
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([image index]
   (phaser->clj
    (.removeChildAt image
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([image begin-index end-index]
   (phaser->clj
    (.removeChildren image
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([image]
   (phaser->clj
    (.removeStageReference image))))

(defn reset
  "Resets the Game Object.

  This moves the Game Object to the given x/y world coordinates and sets `fresh`, `exists`, 
  `visible` and `renderable` to true.

  If this Game Object has the LifeSpan component it will also set `alive` to true and `health` to the given value.

  If this Game Object has a Physics Body it will reset the Body.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Game Object at.
    * y (number) - The y coordinate (in world space) to position the Game Object at.
    * health (number) {optional} - The health to give the Game Object if it has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([image x y]
   (phaser->clj
    (.reset image
            (clj->phaser x)
            (clj->phaser y))))
  ([image x y health]
   (phaser->clj
    (.reset image
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser health)))))

(defn reset-frame
  "Resets the texture frame dimensions that the Game Object uses for rendering."
  ([image]
   (phaser->clj
    (.resetFrame image))))

(defn resize-frame
  "Resizes the Frame dimensions that the Game Object uses for rendering.

  You shouldn't normally need to ever call this, but in the case of special texture types such as Video or BitmapData
  it can be useful to adjust the dimensions directly in this way.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * parent (object) - The parent texture object that caused the resize, i.e. a Phaser.Video object.
    * width (integer) - The new width of the texture.
    * height (integer) - The new height of the texture."
  ([image parent width height]
   (phaser->clj
    (.resizeFrame image
                  (clj->phaser parent)
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn revive
  "Brings a 'dead' Game Object back to life, optionally resetting its health value in the process.

  A resurrected Game Object has its `alive`, `exists` and `visible` properties all set to true.

  It will dispatch the `onRevived` event. Listen to `events.onRevived` for the signal.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * health (number) {optional} - The health to give the Game Object. Only set if the GameObject has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([image]
   (phaser->clj
    (.revive image)))
  ([image health]
   (phaser->clj
    (.revive image
             (clj->phaser health)))))

(defn send-to-back
  "Sends this Game Object to the bottom of its parents display list.
  Visually this means it will render below all other children in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will send it to the bottom of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([image]
   (phaser->clj
    (.sendToBack image))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([image child index]
   (phaser->clj
    (.setChildIndex image
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-frame
  "Sets the texture frame the Game Object uses for rendering.

  This is primarily an internal method used by `loadTexture`, but is exposed for the use of plugins and custom classes.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * frame (Phaser.Frame) - The Frame to be used by the texture."
  ([image frame]
   (phaser->clj
    (.setFrame image
               (clj->phaser frame)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([image stage]
   (phaser->clj
    (.setStageReference image
                        (clj->phaser stage)))))

(defn set-texture
  "Sets the texture of the sprite

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * texture (PIXI.Texture) - The PIXI texture that is displayed by the sprite"
  ([image texture]
   (phaser->clj
    (.setTexture image
                 (clj->phaser texture)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([image child child-2]
   (phaser->clj
    (.swapChildren image
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([image position]
   (phaser->clj
    (.toGlobal image
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * image (Phaser.Image) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([image position]
   (phaser->clj
    (.toLocal image
              (clj->phaser position))))
  ([image position from]
   (phaser->clj
    (.toLocal image
              (clj->phaser position)
              (clj->phaser from)))))

(defn update
  "Override this method in your own custom objects to handle any update requirements.
  It is called immediately after `preUpdate` and before `postUpdate`.
  Remember if this Game Object has any children you should call update on those too."
  ([image]
   (phaser->clj
    (.update image))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([image]
   (phaser->clj
    (.updateCache image))))

(defn update-crop
  "If you have set a crop rectangle on this Game Object via `crop` and since modified the `cropRect` property,
  or the rectangle it references, then you need to update the crop frame by calling this method."
  ([image]
   (phaser->clj
    (.updateCrop image))))