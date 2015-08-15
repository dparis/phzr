(ns phzr.button
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Button
  "Create a new `Button` object. A Button is a special type of Sprite that is set-up to handle Pointer events automatically.

  The four states a Button responds to are:

  * 'Over' - when the Pointer moves over the Button. This is also commonly known as 'hover'.
  * 'Out' - when the Pointer that was previously over the Button moves out of it.
  * 'Down' - when the Pointer is pressed down on the Button. I.e. touched on a touch enabled device or clicked with the mouse.
  * 'Up' - when the Pointer that was pressed down on the Button is released again.

  A different texture/frame and activation sound can be specified for any of the states.

  Frames can be specified as either an integer (the frame ID) or a string (the frame name); the same values that can be used with a Sprite constructor.

  Parameters:
    * game (Phaser.Game) - Current game instance.
    * x (number) {optional} - X position of the Button.
    * y (number) {optional} - Y position of the Button.
    * key (string) {optional} - The image key (in the Game.Cache) to use as the texture for this Button.
    * callback (function) {optional} - The function to call when this Button is pressed.
    * callback-context (object) {optional} - The context in which the callback will be called (usually 'this').
    * over-frame (string | integer) {optional} - The frame / frameName when the button is in the Over state.
    * out-frame (string | integer) {optional} - The frame / frameName when the button is in the Out state.
    * down-frame (string | integer) {optional} - The frame / frameName when the button is in the Down state.
    * up-frame (string | integer) {optional} - The frame / frameName when the button is in the Up state."
  ([game]
   (js/Phaser.Button. (clj->phaser game)))
  ([game x]
   (js/Phaser.Button. (clj->phaser game)
                      (clj->phaser x)))
  ([game x y]
   (js/Phaser.Button. (clj->phaser game)
                      (clj->phaser x)
                      (clj->phaser y)))
  ([game x y key]
   (js/Phaser.Button. (clj->phaser game)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser key)))
  ([game x y key callback]
   (js/Phaser.Button. (clj->phaser game)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser key)
                      (clj->phaser callback)))
  ([game x y key callback callback-context]
   (js/Phaser.Button. (clj->phaser game)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser key)
                      (clj->phaser callback)
                      (clj->phaser callback-context)))
  ([game x y key callback callback-context over-frame]
   (js/Phaser.Button. (clj->phaser game)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser key)
                      (clj->phaser callback)
                      (clj->phaser callback-context)
                      (clj->phaser over-frame)))
  ([game x y key callback callback-context over-frame out-frame]
   (js/Phaser.Button. (clj->phaser game)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser key)
                      (clj->phaser callback)
                      (clj->phaser callback-context)
                      (clj->phaser over-frame)
                      (clj->phaser out-frame)))
  ([game x y key callback callback-context over-frame out-frame down-frame]
   (js/Phaser.Button. (clj->phaser game)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser key)
                      (clj->phaser callback)
                      (clj->phaser callback-context)
                      (clj->phaser over-frame)
                      (clj->phaser out-frame)
                      (clj->phaser down-frame)))
  ([game x y key callback callback-context over-frame out-frame down-frame up-frame]
   (js/Phaser.Button. (clj->phaser game)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser key)
                      (clj->phaser callback)
                      (clj->phaser callback-context)
                      (clj->phaser over-frame)
                      (clj->phaser out-frame)
                      (clj->phaser down-frame)
                      (clj->phaser up-frame))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([button child]
   (phaser->clj
    (.addChild button
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([button child index]
   (phaser->clj
    (.addChildAt button
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn bring-to-top
  "Brings this Game Object to the top of its parents display list.
  Visually this means it will render over the top of any old child in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will bring it to the top of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([button]
   (phaser->clj
    (.bringToTop button))))

(defn clear-frames
  "Clears all of the frames set on this Button."
  ([button]
   (phaser->clj
    (.clearFrames button))))

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
    * button (Phaser.Button) - Targeted instance for method
    * rect (Phaser.Rectangle) - The Rectangle used during cropping. Pass null or no parameters to clear a previously set crop rectangle.
    * copy (boolean) {optional} - If false `cropRect` will be stored as a reference to the given rect. If true it will copy the rect values into a local Phaser Rectangle object stored in cropRect."
  ([button rect]
   (phaser->clj
    (.crop button
           (clj->phaser rect))))
  ([button rect copy]
   (phaser->clj
    (.crop button
           (clj->phaser rect)
           (clj->phaser copy)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([button]
   (phaser->clj
    (.destroy button))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([button resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture button
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Returns the bounds of the Sprite as a rectangle. The bounds calculation takes the worldTransform into account.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * matrix (Matrix) - the transformation matrix of the sprite

  Returns:  Rectangle - the framing rectangle"
  ([button matrix]
   (phaser->clj
    (.getBounds button
                (clj->phaser matrix)))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([button index]
   (phaser->clj
    (.getChildAt button
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([button child]
   (phaser->clj
    (.getChildIndex button
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([button]
   (phaser->clj
    (.getLocalBounds button))))

(defn kill
  "Kills a Game Object. A killed Game Object has its `alive`, `exists` and `visible` properties all set to false.

  It will dispatch the `onKilled` event. You can listen to `events.onKilled` for the signal.

  Note that killing a Game Object is a way for you to quickly recycle it in an object pool, 
  it doesn't destroy the object or free it up from memory.

  If you don't need this Game Object any more you should call `destroy` instead.

  Returns:  PIXI.DisplayObject - This instance."
  ([button]
   (phaser->clj
    (.kill button))))

(defn load-texture
  "Changes the base texture the Game Object is using. The old texture is removed and the new one is referenced or fetched from the Cache.

  If your Game Object is using a frame from a texture atlas and you just wish to change to another frame, then see the `frame` or `frameName` properties instead.

  You should only use `loadTexture` if you want to replace the base texture entirely.

  Calling this method causes a WebGL texture update, so use sparingly or in low-intensity portions of your game, or if you know the new texture is already on the GPU.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) - This is the image or texture used by the Sprite during rendering. It can be a string which is a reference to the Cache Image entry, or an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If this Sprite is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.
    * stop-animation (boolean) {optional} - If an animation is already playing on this Sprite you can choose to stop it or let it carry on playing."
  ([button key]
   (phaser->clj
    (.loadTexture button
                  (clj->phaser key))))
  ([button key frame]
   (phaser->clj
    (.loadTexture button
                  (clj->phaser key)
                  (clj->phaser frame))))
  ([button key frame stop-animation]
   (phaser->clj
    (.loadTexture button
                  (clj->phaser key)
                  (clj->phaser frame)
                  (clj->phaser stop-animation)))))

(defn move-down
  "Moves this Game Object down one place in its parents display list.
  This call has no effect if the Game Object is already at the bottom of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object down within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([button]
   (phaser->clj
    (.moveDown button))))

(defn move-up
  "Moves this Game Object up one place in its parents display list.
  This call has no effect if the Game Object is already at the top of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object up within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([button]
   (phaser->clj
    (.moveUp button))))

(defn overlap
  "Checks to see if the bounds of this Game Object overlaps with the bounds of the given Display Object, 
  which can be a Sprite, Image, TileSprite or anything that extends those such as Button or provides a `getBounds` method and result.

  This check ignores the `hitArea` property if set and runs a `getBounds` comparison on both objects to determine the result.

  Therefore it's relatively expensive to use in large quantities, i.e. with lots of Sprites at a high frequency.
  It should be fine for low-volume testing where physics isn't required.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject) - The display object to check against.

  Returns:  boolean - True if the bounds of this Game Object intersects at any point with the bounds of the given display object."
  ([button display-object]
   (phaser->clj
    (.overlap button
              (clj->phaser display-object)))))

(defn play
  "Plays an Animation.

  The animation should have previously been created via `animations.add`.

  If the animation is already playing calling this again won't do anything.
  If you need to reset an already running animation do so directly on the Animation object itself or via `AnimationManager.stop`.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * name (string) - The name of the animation to be played, e.g. 'fire', 'walk', 'jump'. Must have been previously created via 'AnimationManager.add'.
    * frame-rate (number) {optional} - The framerate to play the animation at. The speed is given in frames per second. If not provided the previously set frameRate of the Animation is used.
    * loop (boolean) {optional} - Should the animation be looped after playback. If not provided the previously set loop value of the Animation is used.
    * kill-on-complete (boolean) {optional} - If set to true when the animation completes (only happens if loop=false) the parent Sprite will be killed.

  Returns:  Phaser.Animation - A reference to playing Animation."
  ([button name]
   (phaser->clj
    (.play button
           (clj->phaser name))))
  ([button name frame-rate]
   (phaser->clj
    (.play button
           (clj->phaser name)
           (clj->phaser frame-rate))))
  ([button name frame-rate loop]
   (phaser->clj
    (.play button
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop))))
  ([button name frame-rate loop kill-on-complete]
   (phaser->clj
    (.play button
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop)
           (clj->phaser kill-on-complete)))))

(defn pre-update
  "Automatically called by World.preUpdate."
  ([button]
   (phaser->clj
    (.preUpdate button))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([button child]
   (phaser->clj
    (.removeChild button
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([button index]
   (phaser->clj
    (.removeChildAt button
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([button begin-index end-index]
   (phaser->clj
    (.removeChildren button
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([button]
   (phaser->clj
    (.removeStageReference button))))

(defn reset
  "Resets the Game Object.

  This moves the Game Object to the given x/y world coordinates and sets `fresh`, `exists`, 
  `visible` and `renderable` to true.

  If this Game Object has the LifeSpan component it will also set `alive` to true and `health` to the given value.

  If this Game Object has a Physics Body it will reset the Body.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Game Object at.
    * y (number) - The y coordinate (in world space) to position the Game Object at.
    * health (number) {optional} - The health to give the Game Object if it has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([button x y]
   (phaser->clj
    (.reset button
            (clj->phaser x)
            (clj->phaser y))))
  ([button x y health]
   (phaser->clj
    (.reset button
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser health)))))

(defn reset-frame
  "Resets the texture frame dimensions that the Game Object uses for rendering."
  ([button]
   (phaser->clj
    (.resetFrame button))))

(defn resize-frame
  "Resizes the Frame dimensions that the Game Object uses for rendering.

  You shouldn't normally need to ever call this, but in the case of special texture types such as Video or BitmapData
  it can be useful to adjust the dimensions directly in this way.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * parent (object) - The parent texture object that caused the resize, i.e. a Phaser.Video object.
    * width (integer) - The new width of the texture.
    * height (integer) - The new height of the texture."
  ([button parent width height]
   (phaser->clj
    (.resizeFrame button
                  (clj->phaser parent)
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn revive
  "Brings a 'dead' Game Object back to life, optionally resetting its health value in the process.

  A resurrected Game Object has its `alive`, `exists` and `visible` properties all set to true.

  It will dispatch the `onRevived` event. Listen to `events.onRevived` for the signal.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * health (number) {optional} - The health to give the Game Object. Only set if the GameObject has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([button]
   (phaser->clj
    (.revive button)))
  ([button health]
   (phaser->clj
    (.revive button
             (clj->phaser health)))))

(defn send-to-back
  "Sends this Game Object to the bottom of its parents display list.
  Visually this means it will render below all other children in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will send it to the bottom of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([button]
   (phaser->clj
    (.sendToBack button))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([button child index]
   (phaser->clj
    (.setChildIndex button
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-down-sound
  "The Sound to be played when a Pointer presses down on this Button.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * sound (Phaser.Sound | Phaser.AudioSprite) - The Sound that will be played.
    * marker (string) {optional} - A Sound Marker that will be used in the playback."
  ([button sound]
   (phaser->clj
    (.setDownSound button
                   (clj->phaser sound))))
  ([button sound marker]
   (phaser->clj
    (.setDownSound button
                   (clj->phaser sound)
                   (clj->phaser marker)))))

(defn set-frame
  "Sets the texture frame the Game Object uses for rendering.

  This is primarily an internal method used by `loadTexture`, but is exposed for the use of plugins and custom classes.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * frame (Phaser.Frame) - The Frame to be used by the texture."
  ([button frame]
   (phaser->clj
    (.setFrame button
               (clj->phaser frame)))))

(defn set-frames
  "Used to manually set the frames that will be used for the different states of the Button.

  Frames can be specified as either an integer (the frame ID) or a string (the frame name); these are the same values that can be used with a Sprite constructor.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * over-frame (string | integer) {optional} - The frame / frameName when the button is in the Over state.
    * out-frame (string | integer) {optional} - The frame / frameName when the button is in the Out state.
    * down-frame (string | integer) {optional} - The frame / frameName when the button is in the Down state.
    * up-frame (string | integer) {optional} - The frame / frameName when the button is in the Up state."
  ([button]
   (phaser->clj
    (.setFrames button)))
  ([button over-frame]
   (phaser->clj
    (.setFrames button
                (clj->phaser over-frame))))
  ([button over-frame out-frame]
   (phaser->clj
    (.setFrames button
                (clj->phaser over-frame)
                (clj->phaser out-frame))))
  ([button over-frame out-frame down-frame]
   (phaser->clj
    (.setFrames button
                (clj->phaser over-frame)
                (clj->phaser out-frame)
                (clj->phaser down-frame))))
  ([button over-frame out-frame down-frame up-frame]
   (phaser->clj
    (.setFrames button
                (clj->phaser over-frame)
                (clj->phaser out-frame)
                (clj->phaser down-frame)
                (clj->phaser up-frame)))))

(defn set-out-sound
  "The Sound to be played when a Pointer moves out of this Button.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * sound (Phaser.Sound | Phaser.AudioSprite) - The Sound that will be played.
    * marker (string) {optional} - A Sound Marker that will be used in the playback."
  ([button sound]
   (phaser->clj
    (.setOutSound button
                  (clj->phaser sound))))
  ([button sound marker]
   (phaser->clj
    (.setOutSound button
                  (clj->phaser sound)
                  (clj->phaser marker)))))

(defn set-over-sound
  "The Sound to be played when a Pointer moves over this Button.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * sound (Phaser.Sound | Phaser.AudioSprite) - The Sound that will be played.
    * marker (string) {optional} - A Sound Marker that will be used in the playback."
  ([button sound]
   (phaser->clj
    (.setOverSound button
                   (clj->phaser sound))))
  ([button sound marker]
   (phaser->clj
    (.setOverSound button
                   (clj->phaser sound)
                   (clj->phaser marker)))))

(defn set-sounds
  "Sets the sounds to be played whenever this Button is interacted with. Sounds can be either full Sound objects, or markers pointing to a section of a Sound object.
  The most common forms of sounds are 'hover' effects and 'click' effects, which is why the order of the parameters is overSound then downSound.

  Call this function with no parameters to reset all sounds on this Button.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * over-sound (Phaser.Sound | Phaser.AudioSprite) {optional} - Over Button Sound.
    * over-marker (string) {optional} - Over Button Sound Marker.
    * down-sound (Phaser.Sound | Phaser.AudioSprite) {optional} - Down Button Sound.
    * down-marker (string) {optional} - Down Button Sound Marker.
    * out-sound (Phaser.Sound | Phaser.AudioSprite) {optional} - Out Button Sound.
    * out-marker (string) {optional} - Out Button Sound Marker.
    * up-sound (Phaser.Sound | Phaser.AudioSprite) {optional} - Up Button Sound.
    * up-marker (string) {optional} - Up Button Sound Marker."
  ([button]
   (phaser->clj
    (.setSounds button)))
  ([button over-sound]
   (phaser->clj
    (.setSounds button
                (clj->phaser over-sound))))
  ([button over-sound over-marker]
   (phaser->clj
    (.setSounds button
                (clj->phaser over-sound)
                (clj->phaser over-marker))))
  ([button over-sound over-marker down-sound]
   (phaser->clj
    (.setSounds button
                (clj->phaser over-sound)
                (clj->phaser over-marker)
                (clj->phaser down-sound))))
  ([button over-sound over-marker down-sound down-marker]
   (phaser->clj
    (.setSounds button
                (clj->phaser over-sound)
                (clj->phaser over-marker)
                (clj->phaser down-sound)
                (clj->phaser down-marker))))
  ([button over-sound over-marker down-sound down-marker out-sound]
   (phaser->clj
    (.setSounds button
                (clj->phaser over-sound)
                (clj->phaser over-marker)
                (clj->phaser down-sound)
                (clj->phaser down-marker)
                (clj->phaser out-sound))))
  ([button over-sound over-marker down-sound down-marker out-sound out-marker]
   (phaser->clj
    (.setSounds button
                (clj->phaser over-sound)
                (clj->phaser over-marker)
                (clj->phaser down-sound)
                (clj->phaser down-marker)
                (clj->phaser out-sound)
                (clj->phaser out-marker))))
  ([button over-sound over-marker down-sound down-marker out-sound out-marker up-sound]
   (phaser->clj
    (.setSounds button
                (clj->phaser over-sound)
                (clj->phaser over-marker)
                (clj->phaser down-sound)
                (clj->phaser down-marker)
                (clj->phaser out-sound)
                (clj->phaser out-marker)
                (clj->phaser up-sound))))
  ([button over-sound over-marker down-sound down-marker out-sound out-marker up-sound up-marker]
   (phaser->clj
    (.setSounds button
                (clj->phaser over-sound)
                (clj->phaser over-marker)
                (clj->phaser down-sound)
                (clj->phaser down-marker)
                (clj->phaser out-sound)
                (clj->phaser out-marker)
                (clj->phaser up-sound)
                (clj->phaser up-marker)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([button stage]
   (phaser->clj
    (.setStageReference button
                        (clj->phaser stage)))))

(defn set-texture
  "Sets the texture of the sprite

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * texture (PIXI.Texture) - The PIXI texture that is displayed by the sprite"
  ([button texture]
   (phaser->clj
    (.setTexture button
                 (clj->phaser texture)))))

(defn set-up-sound
  "The Sound to be played when a Pointer has pressed down and is released from this Button.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * sound (Phaser.Sound | Phaser.AudioSprite) - The Sound that will be played.
    * marker (string) {optional} - A Sound Marker that will be used in the playback."
  ([button sound]
   (phaser->clj
    (.setUpSound button
                 (clj->phaser sound))))
  ([button sound marker]
   (phaser->clj
    (.setUpSound button
                 (clj->phaser sound)
                 (clj->phaser marker)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([button child child-2]
   (phaser->clj
    (.swapChildren button
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([button position]
   (phaser->clj
    (.toGlobal button
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * button (Phaser.Button) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([button position]
   (phaser->clj
    (.toLocal button
              (clj->phaser position))))
  ([button position from]
   (phaser->clj
    (.toLocal button
              (clj->phaser position)
              (clj->phaser from)))))

(defn update
  "Override this method in your own custom objects to handle any update requirements.
  It is called immediately after `preUpdate` and before `postUpdate`.
  Remember if this Game Object has any children you should call update on those too."
  ([button]
   (phaser->clj
    (.update button))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([button]
   (phaser->clj
    (.updateCache button))))

(defn update-crop
  "If you have set a crop rectangle on this Game Object via `crop` and since modified the `cropRect` property,
  or the rectangle it references, then you need to update the crop frame by calling this method."
  ([button]
   (phaser->clj
    (.updateCrop button))))