(ns phzr.text
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Text
  "Create a new game object for displaying Text.

  This uses a local hidden Canvas object and renders the type into it. It then makes a texture from this for rendering to the view.
  Because of this you can only display fonts that are currently loaded and available to the browser: fonts must be pre-loaded.

  See {@link http://www.jordanm.co.uk/tinytype this compatibility table} for the available default fonts across mobile browsers.

  Parameters:
    * game (Phaser.Game) - Current game instance.
    * x (number) - X position of the new text object.
    * y (number) - Y position of the new text object.
    * text (string) - The actual text that will be written.
    * style (object) {optional} - The style properties to be set on the Text.
    * style.font (string) {optional} - The style and size of the font.
    * style.font-style (string) {optional} - The style of the font (eg. 'italic'): overrides the value in `style.font`.
    * style.font-variant (string) {optional} - The variant of the font (eg. 'small-caps'): overrides the value in `style.font`.
    * style.font-weight (string) {optional} - The weight of the font (eg. 'bold'): overrides the value in `style.font`.
    * style.font-size (string | number) {optional} - The size of the font (eg. 32 or '32px'): overrides the value in `style.font`.
    * style.background-color (string) {optional} - A canvas fillstyle that will be used as the background for the whole Text object. Set to `null` to disable.
    * style.fill (string) {optional} - A canvas fillstyle that will be used on the text eg 'red', '#00FF00'.
    * style.align (string) {optional} - Horizontal alignment of each line in multiline text. Can be: 'left', 'center' or 'right'. Does not affect single lines of text (see `textBounds` and `boundsAlignH` for that).
    * style.bounds-align-h (string) {optional} - Horizontal alignment of the text within the `textBounds`. Can be: 'left', 'center' or 'right'.
    * style.bounds-align-v (string) {optional} - Vertical alignment of the text within the `textBounds`. Can be: 'top', 'middle' or 'bottom'.
    * style.stroke (string) {optional} - A canvas stroke style that will be used on the text stroke eg 'blue', '#FCFF00'.
    * style.stroke-thickness (number) {optional} - A number that represents the thickness of the stroke. Default is 0 (no stroke).
    * style.word-wrap (boolean) {optional} - Indicates if word wrap should be used.
    * style.word-wrap-width (number) {optional} - The width in pixels at which text will wrap.
    * style.tabs (number) {optional} - The size (in pixels) of the tabs, for when text includes tab characters. 0 disables. Can be an array of varying tab sizes, one per tab stop."
  ([game x y text]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)))
  ([game x y text style]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)))
  ([game x y text style style.font]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)))
  ([game x y text style style.font style.font-style]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)))
  ([game x y text style style.font style.font-style style.font-variant]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)
                    (clj->phaser style.fill)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)
                    (clj->phaser style.fill)
                    (clj->phaser style.align)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)
                    (clj->phaser style.fill)
                    (clj->phaser style.align)
                    (clj->phaser style.bounds-align-h)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)
                    (clj->phaser style.fill)
                    (clj->phaser style.align)
                    (clj->phaser style.bounds-align-h)
                    (clj->phaser style.bounds-align-v)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)
                    (clj->phaser style.fill)
                    (clj->phaser style.align)
                    (clj->phaser style.bounds-align-h)
                    (clj->phaser style.bounds-align-v)
                    (clj->phaser style.stroke)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke style.stroke-thickness]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)
                    (clj->phaser style.fill)
                    (clj->phaser style.align)
                    (clj->phaser style.bounds-align-h)
                    (clj->phaser style.bounds-align-v)
                    (clj->phaser style.stroke)
                    (clj->phaser style.stroke-thickness)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke style.stroke-thickness style.word-wrap]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)
                    (clj->phaser style.fill)
                    (clj->phaser style.align)
                    (clj->phaser style.bounds-align-h)
                    (clj->phaser style.bounds-align-v)
                    (clj->phaser style.stroke)
                    (clj->phaser style.stroke-thickness)
                    (clj->phaser style.word-wrap)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke style.stroke-thickness style.word-wrap style.word-wrap-width]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)
                    (clj->phaser style.fill)
                    (clj->phaser style.align)
                    (clj->phaser style.bounds-align-h)
                    (clj->phaser style.bounds-align-v)
                    (clj->phaser style.stroke)
                    (clj->phaser style.stroke-thickness)
                    (clj->phaser style.word-wrap)
                    (clj->phaser style.word-wrap-width)))
  ([game x y text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke style.stroke-thickness style.word-wrap style.word-wrap-width style.tabs]
   (js/Phaser.Text. (clj->phaser game)
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser text)
                    (clj->phaser style)
                    (clj->phaser style.font)
                    (clj->phaser style.font-style)
                    (clj->phaser style.font-variant)
                    (clj->phaser style.font-weight)
                    (clj->phaser style.font-size)
                    (clj->phaser style.background-color)
                    (clj->phaser style.fill)
                    (clj->phaser style.align)
                    (clj->phaser style.bounds-align-h)
                    (clj->phaser style.bounds-align-v)
                    (clj->phaser style.stroke)
                    (clj->phaser style.stroke-thickness)
                    (clj->phaser style.word-wrap)
                    (clj->phaser style.word-wrap-width)
                    (clj->phaser style.tabs))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([text child]
   (phaser->clj
    (.addChild text
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([text child index]
   (phaser->clj
    (.addChildAt text
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn add-color
  "Set specific colors for certain characters within the Text.

  It works by taking a color value, which is a typical HTML string such as `#ff0000` or `rgb(255,0,0)` and a position.
  The position value is the index of the character in the Text string to start applying this color to.
  Once set the color remains in use until either another color or the end of the string is encountered.
  For example if the Text was `Photon Storm` and you did `Text.addColor('#ffff00', 6)` it would color in the word `Storm` in yellow.

  If you wish to change the stroke color see addStrokeColor instead.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * color (string) - A canvas fillstyle that will be used on the text eg `red`, `#00FF00`, `rgba()`.
    * position (number) - The index of the character in the string to start applying this color value from.

  Returns:  Phaser.Text - This Text instance."
  ([text color position]
   (phaser->clj
    (.addColor text
               (clj->phaser color)
               (clj->phaser position)))))

(defn add-stroke-color
  "Set specific stroke colors for certain characters within the Text.

  It works by taking a color value, which is a typical HTML string such as `#ff0000` or `rgb(255,0,0)` and a position.
  The position value is the index of the character in the Text string to start applying this color to.
  Once set the color remains in use until either another color or the end of the string is encountered.
  For example if the Text was `Photon Storm` and you did `Text.addColor('#ffff00', 6)` it would color in the word `Storm` in yellow.

  This has no effect if stroke is disabled or has a thickness of 0.

  If you wish to change the text fill color see addColor instead.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * color (string) - A canvas fillstyle that will be used on the text stroke eg `red`, `#00FF00`, `rgba()`.
    * position (number) - The index of the character in the string to start applying this color value from.

  Returns:  Phaser.Text - This Text instance."
  ([text color position]
   (phaser->clj
    (.addStrokeColor text
                     (clj->phaser color)
                     (clj->phaser position)))))

(defn bring-to-top
  "Brings this Game Object to the top of its parents display list.
  Visually this means it will render over the top of any old child in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will bring it to the top of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([text]
   (phaser->clj
    (.bringToTop text))))

(defn clear-colors
  "Clears any text fill or stroke colors that were set by `addColor` or `addStrokeColor`.

  Returns:  Phaser.Text - This Text instance."
  ([text]
   (phaser->clj
    (.clearColors text))))

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
    * text (Phaser.Text) - Targeted instance for method
    * rect (Phaser.Rectangle) - The Rectangle used during cropping. Pass null or no parameters to clear a previously set crop rectangle.
    * copy (boolean) {optional} - If false `cropRect` will be stored as a reference to the given rect. If true it will copy the rect values into a local Phaser Rectangle object stored in cropRect."
  ([text rect]
   (phaser->clj
    (.crop text
           (clj->phaser rect))))
  ([text rect copy]
   (phaser->clj
    (.crop text
           (clj->phaser rect)
           (clj->phaser copy)))))

(defn destroy
  "Destroy this Text object, removing it from the group it belongs to.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * destroy-children (boolean) {optional} - Should every child of this object have its destroy method called?"
  ([text]
   (phaser->clj
    (.destroy text)))
  ([text destroy-children]
   (phaser->clj
    (.destroy text
              (clj->phaser destroy-children)))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([text resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture text
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Returns the bounds of the Text as a rectangle.
  The bounds calculation takes the worldTransform into account.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * matrix (Phaser.Matrix) - The transformation matrix of the Text.

  Returns:  Phaser.Rectangle - The framing rectangle"
  ([text matrix]
   (phaser->clj
    (.getBounds text
                (clj->phaser matrix)))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([text index]
   (phaser->clj
    (.getChildAt text
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([text child]
   (phaser->clj
    (.getChildIndex text
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([text]
   (phaser->clj
    (.getLocalBounds text))))

(defn kill
  "Kills a Game Object. A killed Game Object has its `alive`, `exists` and `visible` properties all set to false.

  It will dispatch the `onKilled` event. You can listen to `events.onKilled` for the signal.

  Note that killing a Game Object is a way for you to quickly recycle it in an object pool, 
  it doesn't destroy the object or free it up from memory.

  If you don't need this Game Object any more you should call `destroy` instead.

  Returns:  PIXI.DisplayObject - This instance."
  ([text]
   (phaser->clj
    (.kill text))))

(defn load-texture
  "Changes the base texture the Game Object is using. The old texture is removed and the new one is referenced or fetched from the Cache.

  If your Game Object is using a frame from a texture atlas and you just wish to change to another frame, then see the `frame` or `frameName` properties instead.

  You should only use `loadTexture` if you want to replace the base texture entirely.

  Calling this method causes a WebGL texture update, so use sparingly or in low-intensity portions of your game, or if you know the new texture is already on the GPU.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) - This is the image or texture used by the Sprite during rendering. It can be a string which is a reference to the Cache Image entry, or an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If this Sprite is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.
    * stop-animation (boolean) {optional} - If an animation is already playing on this Sprite you can choose to stop it or let it carry on playing."
  ([text key]
   (phaser->clj
    (.loadTexture text
                  (clj->phaser key))))
  ([text key frame]
   (phaser->clj
    (.loadTexture text
                  (clj->phaser key)
                  (clj->phaser frame))))
  ([text key frame stop-animation]
   (phaser->clj
    (.loadTexture text
                  (clj->phaser key)
                  (clj->phaser frame)
                  (clj->phaser stop-animation)))))

(defn move-down
  "Moves this Game Object down one place in its parents display list.
  This call has no effect if the Game Object is already at the bottom of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object down within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([text]
   (phaser->clj
    (.moveDown text))))

(defn move-up
  "Moves this Game Object up one place in its parents display list.
  This call has no effect if the Game Object is already at the top of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object up within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([text]
   (phaser->clj
    (.moveUp text))))

(defn overlap
  "Checks to see if the bounds of this Game Object overlaps with the bounds of the given Display Object, 
  which can be a Sprite, Image, TileSprite or anything that extends those such as Button or provides a `getBounds` method and result.

  This check ignores the `hitArea` property if set and runs a `getBounds` comparison on both objects to determine the result.

  Therefore it's relatively expensive to use in large quantities, i.e. with lots of Sprites at a high frequency.
  It should be fine for low-volume testing where physics isn't required.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject) - The display object to check against.

  Returns:  boolean - True if the bounds of this Game Object intersects at any point with the bounds of the given display object."
  ([text display-object]
   (phaser->clj
    (.overlap text
              (clj->phaser display-object)))))

(defn parse-list
  "Converts the given array into a tab delimited string and then updates this Text object.
  This is mostly used when you want to display external data using tab stops.

  The array can be either single or multi dimensional depending on the result you need:

  `[ 'a', 'b', 'c' ]` would convert in to `'a\\tb\\tc'`.

  Where as:

  `[
       [ 'a', 'b', 'c' ],
       [ 'd', 'e', 'f']
  ]`

  would convert in to: `'a\\tb\\tc\\nd\\te\\tf'`

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * list (array) - The array of data to convert into a string.

  Returns:  Phaser.Text - This Text instance."
  ([text list]
   (phaser->clj
    (.parseList text
                (clj->phaser list)))))

(defn play
  "Plays an Animation.

  The animation should have previously been created via `animations.add`.

  If the animation is already playing calling this again won't do anything.
  If you need to reset an already running animation do so directly on the Animation object itself or via `AnimationManager.stop`.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * name (string) - The name of the animation to be played, e.g. 'fire', 'walk', 'jump'. Must have been previously created via 'AnimationManager.add'.
    * frame-rate (number) {optional} - The framerate to play the animation at. The speed is given in frames per second. If not provided the previously set frameRate of the Animation is used.
    * loop (boolean) {optional} - Should the animation be looped after playback. If not provided the previously set loop value of the Animation is used.
    * kill-on-complete (boolean) {optional} - If set to true when the animation completes (only happens if loop=false) the parent Sprite will be killed.

  Returns:  Phaser.Animation - A reference to playing Animation."
  ([text name]
   (phaser->clj
    (.play text
           (clj->phaser name))))
  ([text name frame-rate]
   (phaser->clj
    (.play text
           (clj->phaser name)
           (clj->phaser frame-rate))))
  ([text name frame-rate loop]
   (phaser->clj
    (.play text
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop))))
  ([text name frame-rate loop kill-on-complete]
   (phaser->clj
    (.play text
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop)
           (clj->phaser kill-on-complete)))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([text child]
   (phaser->clj
    (.removeChild text
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([text index]
   (phaser->clj
    (.removeChildAt text
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([text begin-index end-index]
   (phaser->clj
    (.removeChildren text
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([text]
   (phaser->clj
    (.removeStageReference text))))

(defn reset
  "Resets the Game Object.

  This moves the Game Object to the given x/y world coordinates and sets `fresh`, `exists`, 
  `visible` and `renderable` to true.

  If this Game Object has the LifeSpan component it will also set `alive` to true and `health` to the given value.

  If this Game Object has a Physics Body it will reset the Body.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Game Object at.
    * y (number) - The y coordinate (in world space) to position the Game Object at.
    * health (number) {optional} - The health to give the Game Object if it has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([text x y]
   (phaser->clj
    (.reset text
            (clj->phaser x)
            (clj->phaser y))))
  ([text x y health]
   (phaser->clj
    (.reset text
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser health)))))

(defn reset-frame
  "Resets the texture frame dimensions that the Game Object uses for rendering."
  ([text]
   (phaser->clj
    (.resetFrame text))))

(defn resize-frame
  "Resizes the Frame dimensions that the Game Object uses for rendering.

  You shouldn't normally need to ever call this, but in the case of special texture types such as Video or BitmapData
  it can be useful to adjust the dimensions directly in this way.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * parent (object) - The parent texture object that caused the resize, i.e. a Phaser.Video object.
    * width (integer) - The new width of the texture.
    * height (integer) - The new height of the texture."
  ([text parent width height]
   (phaser->clj
    (.resizeFrame text
                  (clj->phaser parent)
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn revive
  "Brings a 'dead' Game Object back to life, optionally resetting its health value in the process.

  A resurrected Game Object has its `alive`, `exists` and `visible` properties all set to true.

  It will dispatch the `onRevived` event. Listen to `events.onRevived` for the signal.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * health (number) {optional} - The health to give the Game Object. Only set if the GameObject has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([text]
   (phaser->clj
    (.revive text)))
  ([text health]
   (phaser->clj
    (.revive text
             (clj->phaser health)))))

(defn send-to-back
  "Sends this Game Object to the bottom of its parents display list.
  Visually this means it will render below all other children in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will send it to the bottom of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([text]
   (phaser->clj
    (.sendToBack text))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([text child index]
   (phaser->clj
    (.setChildIndex text
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-frame
  "Sets the texture frame the Game Object uses for rendering.

  This is primarily an internal method used by `loadTexture`, but is exposed for the use of plugins and custom classes.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * frame (Phaser.Frame) - The Frame to be used by the texture."
  ([text frame]
   (phaser->clj
    (.setFrame text
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
    * text (Phaser.Text) - Targeted instance for method
    * min-x (number | null) - The minimum horizontal scale value this Game Object can scale down to.
    * min-y (number | null) - The minimum vertical scale value this Game Object can scale down to.
    * max-x (number | null) - The maximum horizontal scale value this Game Object can scale up to.
    * max-y (number | null) - The maximum vertical scale value this Game Object can scale up to."
  ([text min-x min-y max-x max-y]
   (phaser->clj
    (.setScaleMinMax text
                     (clj->phaser min-x)
                     (clj->phaser min-y)
                     (clj->phaser max-x)
                     (clj->phaser max-y)))))

(defn set-shadow
  "Sets a drop shadow effect on the Text. You can specify the horizontal and vertical distance of the drop shadow with the `x` and `y` parameters.
  The color controls the shade of the shadow (default is black) and can be either an `rgba` or `hex` value.
  The blur is the strength of the shadow. A value of zero means a hard shadow, a value of 10 means a very soft shadow.
  To remove a shadow already in place you can call this method with no parameters set.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * x (number) {optional} - The shadowOffsetX value in pixels. This is how far offset horizontally the shadow effect will be.
    * y (number) {optional} - The shadowOffsetY value in pixels. This is how far offset vertically the shadow effect will be.
    * color (string) {optional} - The color of the shadow, as given in CSS rgba or hex format. Set the alpha component to 0 to disable the shadow.
    * blur (number) {optional} - The shadowBlur value. Make the shadow softer by applying a Gaussian blur to it. A number from 0 (no blur) up to approx. 10 (depending on scene).
    * shadow-stroke (boolean) {optional} - Apply the drop shadow to the Text stroke (if set).
    * shadow-fill (boolean) {optional} - Apply the drop shadow to the Text fill (if set).

  Returns:  Phaser.Text - This Text instance."
  ([text]
   (phaser->clj
    (.setShadow text)))
  ([text x]
   (phaser->clj
    (.setShadow text
                (clj->phaser x))))
  ([text x y]
   (phaser->clj
    (.setShadow text
                (clj->phaser x)
                (clj->phaser y))))
  ([text x y color]
   (phaser->clj
    (.setShadow text
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser color))))
  ([text x y color blur]
   (phaser->clj
    (.setShadow text
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser color)
                (clj->phaser blur))))
  ([text x y color blur shadow-stroke]
   (phaser->clj
    (.setShadow text
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser color)
                (clj->phaser blur)
                (clj->phaser shadow-stroke))))
  ([text x y color blur shadow-stroke shadow-fill]
   (phaser->clj
    (.setShadow text
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser color)
                (clj->phaser blur)
                (clj->phaser shadow-stroke)
                (clj->phaser shadow-fill)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([text stage]
   (phaser->clj
    (.setStageReference text
                        (clj->phaser stage)))))

(defn set-style
  "Set the style of the text by passing a single style object to it.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * style (object) {optional} - The style properties to be set on the Text.
    * style.font (string) {optional} - The style and size of the font.
    * style.font-style (string) {optional} - The style of the font (eg. 'italic'): overrides the value in `style.font`.
    * style.font-variant (string) {optional} - The variant of the font (eg. 'small-caps'): overrides the value in `style.font`.
    * style.font-weight (string) {optional} - The weight of the font (eg. 'bold'): overrides the value in `style.font`.
    * style.font-size (string | number) {optional} - The size of the font (eg. 32 or '32px'): overrides the value in `style.font`.
    * style.background-color (string) {optional} - A canvas fillstyle that will be used as the background for the whole Text object. Set to `null` to disable.
    * style.fill (string) {optional} - A canvas fillstyle that will be used on the text eg 'red', '#00FF00'.
    * style.align (string) {optional} - Horizontal alignment of each line in multiline text. Can be: 'left', 'center' or 'right'. Does not affect single lines of text (see `textBounds` and `boundsAlignH` for that).
    * style.bounds-align-h (string) {optional} - Horizontal alignment of the text within the `textBounds`. Can be: 'left', 'center' or 'right'.
    * style.bounds-align-v (string) {optional} - Vertical alignment of the text within the `textBounds`. Can be: 'top', 'middle' or 'bottom'.
    * style.stroke (string) {optional} - A canvas stroke style that will be used on the text stroke eg 'blue', '#FCFF00'.
    * style.stroke-thickness (number) {optional} - A number that represents the thickness of the stroke. Default is 0 (no stroke).
    * style.word-wrap (boolean) {optional} - Indicates if word wrap should be used.
    * style.word-wrap-width (number) {optional} - The width in pixels at which text will wrap.
    * style.tabs (number | array) {optional} - The size (in pixels) of the tabs, for when text includes tab characters. 0 disables. Can be an array of varying tab sizes, one per tab stop.

  Returns:  Phaser.Text - This Text instance."
  ([text]
   (phaser->clj
    (.setStyle text)))
  ([text style]
   (phaser->clj
    (.setStyle text
               (clj->phaser style))))
  ([text style style.font]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font))))
  ([text style style.font style.font-style]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style))))
  ([text style style.font style.font-style style.font-variant]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant))))
  ([text style style.font style.font-style style.font-variant style.font-weight]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color)
               (clj->phaser style.fill))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color)
               (clj->phaser style.fill)
               (clj->phaser style.align))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color)
               (clj->phaser style.fill)
               (clj->phaser style.align)
               (clj->phaser style.bounds-align-h))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color)
               (clj->phaser style.fill)
               (clj->phaser style.align)
               (clj->phaser style.bounds-align-h)
               (clj->phaser style.bounds-align-v))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color)
               (clj->phaser style.fill)
               (clj->phaser style.align)
               (clj->phaser style.bounds-align-h)
               (clj->phaser style.bounds-align-v)
               (clj->phaser style.stroke))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke style.stroke-thickness]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color)
               (clj->phaser style.fill)
               (clj->phaser style.align)
               (clj->phaser style.bounds-align-h)
               (clj->phaser style.bounds-align-v)
               (clj->phaser style.stroke)
               (clj->phaser style.stroke-thickness))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke style.stroke-thickness style.word-wrap]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color)
               (clj->phaser style.fill)
               (clj->phaser style.align)
               (clj->phaser style.bounds-align-h)
               (clj->phaser style.bounds-align-v)
               (clj->phaser style.stroke)
               (clj->phaser style.stroke-thickness)
               (clj->phaser style.word-wrap))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke style.stroke-thickness style.word-wrap style.word-wrap-width]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color)
               (clj->phaser style.fill)
               (clj->phaser style.align)
               (clj->phaser style.bounds-align-h)
               (clj->phaser style.bounds-align-v)
               (clj->phaser style.stroke)
               (clj->phaser style.stroke-thickness)
               (clj->phaser style.word-wrap)
               (clj->phaser style.word-wrap-width))))
  ([text style style.font style.font-style style.font-variant style.font-weight style.font-size style.background-color style.fill style.align style.bounds-align-h style.bounds-align-v style.stroke style.stroke-thickness style.word-wrap style.word-wrap-width style.tabs]
   (phaser->clj
    (.setStyle text
               (clj->phaser style)
               (clj->phaser style.font)
               (clj->phaser style.font-style)
               (clj->phaser style.font-variant)
               (clj->phaser style.font-weight)
               (clj->phaser style.font-size)
               (clj->phaser style.background-color)
               (clj->phaser style.fill)
               (clj->phaser style.align)
               (clj->phaser style.bounds-align-h)
               (clj->phaser style.bounds-align-v)
               (clj->phaser style.stroke)
               (clj->phaser style.stroke-thickness)
               (clj->phaser style.word-wrap)
               (clj->phaser style.word-wrap-width)
               (clj->phaser style.tabs)))))

(defn set-text
  "The text to be displayed by this Text object.
  Use a \\n to insert a carriage return and split the text.
  The text will be rendered with any style currently set.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * text (string) {optional} - The text to be displayed. Set to an empty string to clear text that is already present.

  Returns:  Phaser.Text - This Text instance."
  ([text]
   (phaser->clj
    (.setText text)))
  ([text text]
   (phaser->clj
    (.setText text
              (clj->phaser text)))))

(defn set-text-bounds
  "The Text Bounds is a rectangular region that you control the dimensions of into which the Text object itself is positioned,
  regardless of the number of lines in the text, the font size or any other attribute.

  Alignment is controlled via the properties `boundsAlignH` and `boundsAlignV` within the Text.style object, or can be directly
  set through the setters `Text.boundsAlignH` and `Text.boundsAlignV`. Bounds alignment is independent of text alignment.

  For example: If your game is 800x600 in size and you set the text bounds to be 0,0,800,600 then by setting boundsAlignH to
  'center' and boundsAlignV to 'bottom' the text will render in the center and at the bottom of your game window, regardless of
  how many lines of text there may be. Even if you adjust the text content or change the style it will remain at the bottom center
  of the text bounds.

  This is especially powerful when you need to align text against specific coordinates in your game, but the actual text dimensions
  may vary based on font (say for multi-lingual games).

  If `Text.wordWrapWidth` is greater than the width of the text bounds it is clamped to match the bounds width.

  Call this method with no arguments given to reset an existing textBounds.

  It works by calculating the final position based on the Text.canvas size, which is modified as the text is updated. Some fonts
  have additional padding around them which you can mitigate by tweaking the Text.padding property. It then adjusts the `pivot`
  property based on the given bounds and canvas size. This means if you need to set the pivot property directly in your game then
  you either cannot use `setTextBounds` or you must place the Text object inside another DisplayObject on which you set the pivot.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the Text Bounds region.
    * y (number) {optional} - The y coordinate of the Text Bounds region.
    * width (number) {optional} - The width of the Text Bounds region.
    * height (number) {optional} - The height of the Text Bounds region.

  Returns:  Phaser.Text - This Text instance."
  ([text]
   (phaser->clj
    (.setTextBounds text)))
  ([text x]
   (phaser->clj
    (.setTextBounds text
                    (clj->phaser x))))
  ([text x y]
   (phaser->clj
    (.setTextBounds text
                    (clj->phaser x)
                    (clj->phaser y))))
  ([text x y width]
   (phaser->clj
    (.setTextBounds text
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser width))))
  ([text x y width height]
   (phaser->clj
    (.setTextBounds text
                    (clj->phaser x)
                    (clj->phaser y)
                    (clj->phaser width)
                    (clj->phaser height)))))

(defn set-texture
  "Sets the texture of the sprite

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * texture (PIXI.Texture) - The PIXI texture that is displayed by the sprite"
  ([text texture]
   (phaser->clj
    (.setTexture text
                 (clj->phaser texture)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([text child child-2]
   (phaser->clj
    (.swapChildren text
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([text position]
   (phaser->clj
    (.toGlobal text
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([text position]
   (phaser->clj
    (.toLocal text
              (clj->phaser position))))
  ([text position from]
   (phaser->clj
    (.toLocal text
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([text]
   (phaser->clj
    (.updateCache text))))

(defn update-crop
  "If you have set a crop rectangle on this Game Object via `crop` and since modified the `cropRect` property,
  or the rectangle it references, then you need to update the crop frame by calling this method."
  ([text]
   (phaser->clj
    (.updateCrop text))))

(defn update-shadow
  "Sets the Shadow on the Text.context based on the Style settings, or disables it if not enabled.
  This is called automatically by Text.updateText.

  Parameters:
    * text (Phaser.Text) - Targeted instance for method
    * state (boolean) - If true the shadow will be set to the Style values, otherwise it will be set to zero."
  ([text state]
   (phaser->clj
    (.updateShadow text
                   (clj->phaser state)))))