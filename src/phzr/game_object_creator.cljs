(ns phzr.game-object-creator
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [filter]))

(defn ->GameObjectCreator
  "The GameObjectCreator is a quick way to create common game objects _without_ adding them to the game world.
  The object creator can be accessed with {@linkcode Phaser.Game#make `game.make`}.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.GameObjectCreator. (clj->phaser game))))

(defn audio
  "Creates a new Sound object.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * key (string) - The Game.cache key of the sound that this object will use.
    * volume (number) {optional} - The volume at which the sound will be played.
    * loop (boolean) {optional} - Whether or not the sound will loop.
    * connect (boolean) {optional} - Controls if the created Sound object will connect to the master gainNode of the SoundManager when running under WebAudio.

  Returns:  Phaser.Sound - The newly created text object."
  ([game-object-creator key]
   (phaser->clj
    (.audio game-object-creator
            (clj->phaser key))))
  ([game-object-creator key volume]
   (phaser->clj
    (.audio game-object-creator
            (clj->phaser key)
            (clj->phaser volume))))
  ([game-object-creator key volume loop]
   (phaser->clj
    (.audio game-object-creator
            (clj->phaser key)
            (clj->phaser volume)
            (clj->phaser loop))))
  ([game-object-creator key volume loop connect]
   (phaser->clj
    (.audio game-object-creator
            (clj->phaser key)
            (clj->phaser volume)
            (clj->phaser loop)
            (clj->phaser connect)))))

(defn audio-sprite
  "Creates a new AudioSprite object.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * key (string) - The Game.cache key of the sound that this object will use.

  Returns:  Phaser.AudioSprite - The newly created AudioSprite object."
  ([game-object-creator key]
   (phaser->clj
    (.audioSprite game-object-creator
                  (clj->phaser key)))))

(defn bitmap-data
  "Create a BitmpaData object.

  A BitmapData object can be manipulated and drawn to like a traditional Canvas object and used to texture Sprites.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * width (number) {optional} - The width of the BitmapData in pixels.
    * height (number) {optional} - The height of the BitmapData in pixels.
    * key (string) {optional} - Asset key for the BitmapData when stored in the Cache (see addToCache parameter).
    * add-to-cache (boolean) {optional} - Should this BitmapData be added to the Game.Cache? If so you can retrieve it with Cache.getBitmapData(key)

  Returns:  Phaser.BitmapData - The newly created BitmapData object."
  ([game-object-creator]
   (phaser->clj
    (.bitmapData game-object-creator)))
  ([game-object-creator width]
   (phaser->clj
    (.bitmapData game-object-creator
                 (clj->phaser width))))
  ([game-object-creator width height]
   (phaser->clj
    (.bitmapData game-object-creator
                 (clj->phaser width)
                 (clj->phaser height))))
  ([game-object-creator width height key]
   (phaser->clj
    (.bitmapData game-object-creator
                 (clj->phaser width)
                 (clj->phaser height)
                 (clj->phaser key))))
  ([game-object-creator width height key add-to-cache]
   (phaser->clj
    (.bitmapData game-object-creator
                 (clj->phaser width)
                 (clj->phaser height)
                 (clj->phaser key)
                 (clj->phaser add-to-cache)))))

(defn bitmap-text
  "Create a new BitmapText object.

  BitmapText objects work by taking a texture file and an XML file that describes the font structure.
  It then generates a new Sprite object for each letter of the text, proportionally spaced out and aligned to 
  match the font structure.

  BitmapText objects are less flexible than Text objects, in that they have less features such as shadows, fills and the ability 
  to use Web Fonts. However you trade this flexibility for pure rendering speed. You can also create visually compelling BitmapTexts by 
  processing the font texture in an image editor first, applying fills and any other effects required.

  To create multi-line text insert \\r, \\n or \\r\\n escape codes into the text string.

  To create a BitmapText data files you can use:

  BMFont (Windows, free): http://www.angelcode.com/products/bmfont/
  Glyph Designer (OS X, commercial): http://www.71squared.com/en/glyphdesigner
  Littera (Web-based, free): http://kvazars.com/littera/

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * x (number) - X coordinate to display the BitmapText object at.
    * y (number) - Y coordinate to display the BitmapText object at.
    * font (string) - The key of the BitmapText as stored in Phaser.Cache.
    * text (string) {optional} - The text that will be rendered. This can also be set later via BitmapText.text.
    * size (number) {optional} - The size the font will be rendered at in pixels.
    * align (string) {optional} - The alignment of multi-line text. Has no effect if there is only one line of text.

  Returns:  Phaser.BitmapText - The newly created bitmapText object."
  ([game-object-creator x y font]
   (phaser->clj
    (.bitmapText game-object-creator
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser font))))
  ([game-object-creator x y font text]
   (phaser->clj
    (.bitmapText game-object-creator
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser font)
                 (clj->phaser text))))
  ([game-object-creator x y font text size]
   (phaser->clj
    (.bitmapText game-object-creator
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser font)
                 (clj->phaser text)
                 (clj->phaser size))))
  ([game-object-creator x y font text size align]
   (phaser->clj
    (.bitmapText game-object-creator
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser font)
                 (clj->phaser text)
                 (clj->phaser size)
                 (clj->phaser align)))))

(defn button
  "Creates a new Button object.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * x (number) {optional} - X position of the new button object.
    * y (number) {optional} - Y position of the new button object.
    * key (string) {optional} - The image key as defined in the Game.Cache to use as the texture for this button.
    * callback (function) {optional} - The function to call when this button is pressed
    * callback-context (object) {optional} - The context in which the callback will be called (usually 'this')
    * over-frame (string | number) {optional} - This is the frame or frameName that will be set when this button is in an over state. Give either a number to use a frame ID or a string for a frame name.
    * out-frame (string | number) {optional} - This is the frame or frameName that will be set when this button is in an out state. Give either a number to use a frame ID or a string for a frame name.
    * down-frame (string | number) {optional} - This is the frame or frameName that will be set when this button is in a down state. Give either a number to use a frame ID or a string for a frame name.
    * up-frame (string | number) {optional} - This is the frame or frameName that will be set when this button is in an up state. Give either a number to use a frame ID or a string for a frame name.

  Returns:  Phaser.Button - The newly created button object."
  ([game-object-creator]
   (phaser->clj
    (.button game-object-creator)))
  ([game-object-creator x]
   (phaser->clj
    (.button game-object-creator
             (clj->phaser x))))
  ([game-object-creator x y]
   (phaser->clj
    (.button game-object-creator
             (clj->phaser x)
             (clj->phaser y))))
  ([game-object-creator x y key]
   (phaser->clj
    (.button game-object-creator
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key))))
  ([game-object-creator x y key callback]
   (phaser->clj
    (.button game-object-creator
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback))))
  ([game-object-creator x y key callback callback-context]
   (phaser->clj
    (.button game-object-creator
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context))))
  ([game-object-creator x y key callback callback-context over-frame]
   (phaser->clj
    (.button game-object-creator
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser over-frame))))
  ([game-object-creator x y key callback callback-context over-frame out-frame]
   (phaser->clj
    (.button game-object-creator
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser over-frame)
             (clj->phaser out-frame))))
  ([game-object-creator x y key callback callback-context over-frame out-frame down-frame]
   (phaser->clj
    (.button game-object-creator
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser over-frame)
             (clj->phaser out-frame)
             (clj->phaser down-frame))))
  ([game-object-creator x y key callback callback-context over-frame out-frame down-frame up-frame]
   (phaser->clj
    (.button game-object-creator
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser over-frame)
             (clj->phaser out-frame)
             (clj->phaser down-frame)
             (clj->phaser up-frame)))))

(defn emitter
  "Creat a new Emitter.

  An Emitter is a lightweight particle emitter. It can be used for one-time explosions or for
  continuous effects like rain and fire. All it really does is launch Particle objects out
  at set intervals, and fixes their positions and velocities accorindgly.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * x (number) {optional} - The x coordinate within the Emitter that the particles are emitted from.
    * y (number) {optional} - The y coordinate within the Emitter that the particles are emitted from.
    * max-particles (number) {optional} - The total number of particles in this emitter.

  Returns:  Phaser.Emitter - The newly created emitter object."
  ([game-object-creator]
   (phaser->clj
    (.emitter game-object-creator)))
  ([game-object-creator x]
   (phaser->clj
    (.emitter game-object-creator
              (clj->phaser x))))
  ([game-object-creator x y]
   (phaser->clj
    (.emitter game-object-creator
              (clj->phaser x)
              (clj->phaser y))))
  ([game-object-creator x y max-particles]
   (phaser->clj
    (.emitter game-object-creator
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser max-particles)))))

(defn filter
  "A WebGL shader/filter that can be applied to Sprites.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * filter (string) - The name of the filter you wish to create, for example HueRotate or SineWave.
    * args (any) - Whatever parameters are needed to be passed to the filter init function.

  Returns:  Phaser.Filter - The newly created Phaser.Filter object."
  ([game-object-creator filter & args]
   (phaser->clj
    (.apply (aget game-object-creator filter) game-object-creator
            (into-array (concat [(clj->phaser filter)] args))))))

(defn graphics
  "Creates a new Graphics object.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * x (number) {optional} - X position of the new graphics object.
    * y (number) {optional} - Y position of the new graphics object.

  Returns:  Phaser.Graphics - The newly created graphics object."
  ([game-object-creator]
   (phaser->clj
    (.graphics game-object-creator)))
  ([game-object-creator x]
   (phaser->clj
    (.graphics game-object-creator
               (clj->phaser x))))
  ([game-object-creator x y]
   (phaser->clj
    (.graphics game-object-creator
               (clj->phaser x)
               (clj->phaser y)))))

(defn group
  "A Group is a container for display objects that allows for fast pooling, recycling and collision checks.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * parent (any) - The parent Group or DisplayObjectContainer that will hold this group, if any.
    * name (string) {optional} - A name for this Group. Not used internally but useful for debugging.
    * add-to-stage (boolean) {optional} - If set to true this Group will be added directly to the Game.Stage instead of Game.World.
    * enable-body (boolean) {optional} - If true all Sprites created with `Group.create` or `Group.createMulitple` will have a physics body created on them. Change the body type with physicsBodyType.
    * physics-body-type (number) {optional} - If enableBody is true this is the type of physics body that is created on new Sprites. Phaser.Physics.ARCADE, Phaser.Physics.P2, Phaser.Physics.NINJA, etc.

  Returns:  Phaser.Group - The newly created Group."
  ([game-object-creator parent]
   (phaser->clj
    (.group game-object-creator
            (clj->phaser parent))))
  ([game-object-creator parent name]
   (phaser->clj
    (.group game-object-creator
            (clj->phaser parent)
            (clj->phaser name))))
  ([game-object-creator parent name add-to-stage]
   (phaser->clj
    (.group game-object-creator
            (clj->phaser parent)
            (clj->phaser name)
            (clj->phaser add-to-stage))))
  ([game-object-creator parent name add-to-stage enable-body]
   (phaser->clj
    (.group game-object-creator
            (clj->phaser parent)
            (clj->phaser name)
            (clj->phaser add-to-stage)
            (clj->phaser enable-body))))
  ([game-object-creator parent name add-to-stage enable-body physics-body-type]
   (phaser->clj
    (.group game-object-creator
            (clj->phaser parent)
            (clj->phaser name)
            (clj->phaser add-to-stage)
            (clj->phaser enable-body)
            (clj->phaser physics-body-type)))))

(defn image
  "Create a new Image object.

  An Image is a light-weight object you can use to display anything that doesn't need physics or animation.
  It can still rotate, scale, crop and receive input events. This makes it perfect for logos, backgrounds, simple buttons and other non-Sprite graphics.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * x (number) - X position of the image.
    * y (number) - Y position of the image.
    * key (string | Phaser.RenderTexture | PIXI.Texture) - This is the image or texture used by the Sprite during rendering. It can be a string which is a reference to the Cache entry, or an instance of a RenderTexture or PIXI.Texture.
    * frame (string | number) {optional} - If the sprite uses an image from a texture atlas or sprite sheet you can pass the frame here. Either a number for a frame ID or a string for a frame name.

  Returns:  Phaser.Image - the newly created sprite object."
  ([game-object-creator x y key]
   (phaser->clj
    (.image game-object-creator
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser key))))
  ([game-object-creator x y key frame]
   (phaser->clj
    (.image game-object-creator
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser key)
            (clj->phaser frame)))))

(defn render-texture
  "A dynamic initially blank canvas to which images can be drawn.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * width (number) {optional} - the width of the RenderTexture.
    * height (number) {optional} - the height of the RenderTexture.
    * key (string) {optional} - Asset key for the RenderTexture when stored in the Cache (see addToCache parameter).
    * add-to-cache (boolean) {optional} - Should this RenderTexture be added to the Game.Cache? If so you can retrieve it with Cache.getTexture(key)

  Returns:  Phaser.RenderTexture - The newly created RenderTexture object."
  ([game-object-creator]
   (phaser->clj
    (.renderTexture game-object-creator)))
  ([game-object-creator width]
   (phaser->clj
    (.renderTexture game-object-creator
                    (clj->phaser width))))
  ([game-object-creator width height]
   (phaser->clj
    (.renderTexture game-object-creator
                    (clj->phaser width)
                    (clj->phaser height))))
  ([game-object-creator width height key]
   (phaser->clj
    (.renderTexture game-object-creator
                    (clj->phaser width)
                    (clj->phaser height)
                    (clj->phaser key))))
  ([game-object-creator width height key add-to-cache]
   (phaser->clj
    (.renderTexture game-object-creator
                    (clj->phaser width)
                    (clj->phaser height)
                    (clj->phaser key)
                    (clj->phaser add-to-cache)))))

(defn retro-font
  "Create a new RetroFont object.

  A RetroFont can be used as a texture for an Image or Sprite and optionally add it to the Cache.
  A RetroFont uses a bitmap which contains fixed with characters for the font set. You use character spacing to define the set.
  If you need variable width character support then use a BitmapText object instead. The main difference between a RetroFont and a BitmapText
  is that a RetroFont creates a single texture that you can apply to a game object, where-as a BitmapText creates one Sprite object per letter of text.
  The texture can be asssigned or one or multiple images/sprites, but note that the text the RetroFont uses will be shared across them all,
  i.e. if you need each Image to have different text in it, then you need to create multiple RetroFont objects.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * font (string) - The key of the image in the Game.Cache that the RetroFont will use.
    * character-width (number) - The width of each character in the font set.
    * character-height (number) - The height of each character in the font set.
    * chars (string) - The characters used in the font set, in display order. You can use the TEXT_SET consts for common font set arrangements.
    * chars-per-row (number) - The number of characters per row in the font set.
    * x-spacing (number) {optional} - If the characters in the font set have horizontal spacing between them set the required amount here.
    * y-spacing (number) {optional} - If the characters in the font set have vertical spacing between them set the required amount here.
    * x-offset (number) {optional} - If the font set doesn't start at the top left of the given image, specify the X coordinate offset here.
    * y-offset (number) {optional} - If the font set doesn't start at the top left of the given image, specify the Y coordinate offset here.

  Returns:  Phaser.RetroFont - The newly created RetroFont texture which can be applied to an Image or Sprite."
  ([game-object-creator font character-width character-height chars chars-per-row]
   (phaser->clj
    (.retroFont game-object-creator
                (clj->phaser font)
                (clj->phaser character-width)
                (clj->phaser character-height)
                (clj->phaser chars)
                (clj->phaser chars-per-row))))
  ([game-object-creator font character-width character-height chars chars-per-row x-spacing]
   (phaser->clj
    (.retroFont game-object-creator
                (clj->phaser font)
                (clj->phaser character-width)
                (clj->phaser character-height)
                (clj->phaser chars)
                (clj->phaser chars-per-row)
                (clj->phaser x-spacing))))
  ([game-object-creator font character-width character-height chars chars-per-row x-spacing y-spacing]
   (phaser->clj
    (.retroFont game-object-creator
                (clj->phaser font)
                (clj->phaser character-width)
                (clj->phaser character-height)
                (clj->phaser chars)
                (clj->phaser chars-per-row)
                (clj->phaser x-spacing)
                (clj->phaser y-spacing))))
  ([game-object-creator font character-width character-height chars chars-per-row x-spacing y-spacing x-offset]
   (phaser->clj
    (.retroFont game-object-creator
                (clj->phaser font)
                (clj->phaser character-width)
                (clj->phaser character-height)
                (clj->phaser chars)
                (clj->phaser chars-per-row)
                (clj->phaser x-spacing)
                (clj->phaser y-spacing)
                (clj->phaser x-offset))))
  ([game-object-creator font character-width character-height chars chars-per-row x-spacing y-spacing x-offset y-offset]
   (phaser->clj
    (.retroFont game-object-creator
                (clj->phaser font)
                (clj->phaser character-width)
                (clj->phaser character-height)
                (clj->phaser chars)
                (clj->phaser chars-per-row)
                (clj->phaser x-spacing)
                (clj->phaser y-spacing)
                (clj->phaser x-offset)
                (clj->phaser y-offset)))))

(defn rope
  "Creates a new Rope object.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Rope at.
    * y (number) - The y coordinate (in world space) to position the Rope at.
    * width (number) - The width of the Rope.
    * height (number) - The height of the Rope.
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture) - This is the image or texture used by the TileSprite during rendering. It can be a string which is a reference to the Cache entry, or an instance of a RenderTexture or PIXI.Texture.
    * frame (string | number) - If this Rope is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.

  Returns:  Phaser.Rope - The newly created rope object."
  ([game-object-creator x y width height key frame]
   (phaser->clj
    (.rope game-object-creator
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser key)
           (clj->phaser frame)))))

(defn sound
  "Creates a new Sound object.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * key (string) - The Game.cache key of the sound that this object will use.
    * volume (number) {optional} - The volume at which the sound will be played.
    * loop (boolean) {optional} - Whether or not the sound will loop.
    * connect (boolean) {optional} - Controls if the created Sound object will connect to the master gainNode of the SoundManager when running under WebAudio.

  Returns:  Phaser.Sound - The newly created text object."
  ([game-object-creator key]
   (phaser->clj
    (.sound game-object-creator
            (clj->phaser key))))
  ([game-object-creator key volume]
   (phaser->clj
    (.sound game-object-creator
            (clj->phaser key)
            (clj->phaser volume))))
  ([game-object-creator key volume loop]
   (phaser->clj
    (.sound game-object-creator
            (clj->phaser key)
            (clj->phaser volume)
            (clj->phaser loop))))
  ([game-object-creator key volume loop connect]
   (phaser->clj
    (.sound game-object-creator
            (clj->phaser key)
            (clj->phaser volume)
            (clj->phaser loop)
            (clj->phaser connect)))))

(defn sprite
  "Create a new Sprite with specific position and sprite sheet key.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * x (number) - X position of the new sprite.
    * y (number) - Y position of the new sprite.
    * key (string | Phaser.RenderTexture | PIXI.Texture) - This is the image or texture used by the Sprite during rendering. It can be a string which is a reference to the Cache entry, or an instance of a RenderTexture or PIXI.Texture.
    * frame (string | number) {optional} - If the sprite uses an image from a texture atlas or sprite sheet you can pass the frame here. Either a number for a frame ID or a string for a frame name.

  Returns:  Phaser.Sprite - the newly created sprite object."
  ([game-object-creator x y key]
   (phaser->clj
    (.sprite game-object-creator
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key))))
  ([game-object-creator x y key frame]
   (phaser->clj
    (.sprite game-object-creator
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser frame)))))

(defn sprite-batch
  "Create a new SpriteBatch.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * parent (any) - The parent Group or DisplayObjectContainer that will hold this group, if any.
    * name (string) {optional} - A name for this Group. Not used internally but useful for debugging.
    * add-to-stage (boolean) {optional} - If set to true this Group will be added directly to the Game.Stage instead of Game.World.

  Returns:  Phaser.SpriteBatch - The newly created group."
  ([game-object-creator parent]
   (phaser->clj
    (.spriteBatch game-object-creator
                  (clj->phaser parent))))
  ([game-object-creator parent name]
   (phaser->clj
    (.spriteBatch game-object-creator
                  (clj->phaser parent)
                  (clj->phaser name))))
  ([game-object-creator parent name add-to-stage]
   (phaser->clj
    (.spriteBatch game-object-creator
                  (clj->phaser parent)
                  (clj->phaser name)
                  (clj->phaser add-to-stage)))))

(defn text
  "Creates a new Text object.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * x (number) - X position of the new text object.
    * y (number) - Y position of the new text object.
    * text (string) - The actual text that will be written.
    * style (object) - The style object containing style attributes like font, font size , etc.

  Returns:  Phaser.Text - The newly created text object."
  ([game-object-creator x y text style]
   (phaser->clj
    (.text game-object-creator
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser text)
           (clj->phaser style)))))

(defn tile-sprite
  "Creates a new TileSprite object.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the TileSprite at.
    * y (number) - The y coordinate (in world space) to position the TileSprite at.
    * width (number) - The width of the TileSprite.
    * height (number) - The height of the TileSprite.
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | PIXI.Texture) - This is the image or texture used by the TileSprite during rendering. It can be a string which is a reference to the Cache entry, or an instance of a RenderTexture or PIXI.Texture.
    * frame (string | number) - If this TileSprite is using part of a sprite sheet or texture atlas you can specify the exact frame to use by giving a string or numeric index.

  Returns:  Phaser.TileSprite - The newly created tileSprite object."
  ([game-object-creator x y width height key frame]
   (phaser->clj
    (.tileSprite game-object-creator
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser width)
                 (clj->phaser height)
                 (clj->phaser key)
                 (clj->phaser frame)))))

(defn tilemap
  "Creates a new Phaser.Tilemap object.

  The map can either be populated with data from a Tiled JSON file or from a CSV file.
  To do this pass the Cache key as the first parameter. When using Tiled data you need only provide the key.
  When using CSV data you must provide the key and the tileWidth and tileHeight parameters.
  If creating a blank tilemap to be populated later, you can either specify no parameters at all and then use `Tilemap.create` or pass the map and tile dimensions here.
  Note that all Tilemaps use a base tile size to calculate dimensions from, but that a TilemapLayer may have its own unique tile size that overrides it.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * key (string) {optional} - The key of the tilemap data as stored in the Cache. If you're creating a blank map either leave this parameter out or pass `null`.
    * tile-width (number) {optional} - The pixel width of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.
    * tile-height (number) {optional} - The pixel height of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.
    * width (number) {optional} - The width of the map in tiles. If this map is created from Tiled or CSV data you don't need to specify this.
    * height (number) {optional} - The height of the map in tiles. If this map is created from Tiled or CSV data you don't need to specify this."
  ([game-object-creator]
   (phaser->clj
    (.tilemap game-object-creator)))
  ([game-object-creator key]
   (phaser->clj
    (.tilemap game-object-creator
              (clj->phaser key))))
  ([game-object-creator key tile-width]
   (phaser->clj
    (.tilemap game-object-creator
              (clj->phaser key)
              (clj->phaser tile-width))))
  ([game-object-creator key tile-width tile-height]
   (phaser->clj
    (.tilemap game-object-creator
              (clj->phaser key)
              (clj->phaser tile-width)
              (clj->phaser tile-height))))
  ([game-object-creator key tile-width tile-height width]
   (phaser->clj
    (.tilemap game-object-creator
              (clj->phaser key)
              (clj->phaser tile-width)
              (clj->phaser tile-height)
              (clj->phaser width))))
  ([game-object-creator key tile-width tile-height width height]
   (phaser->clj
    (.tilemap game-object-creator
              (clj->phaser key)
              (clj->phaser tile-width)
              (clj->phaser tile-height)
              (clj->phaser width)
              (clj->phaser height)))))

(defn tween
  "Create a tween object for a specific object.

  The object can be any JavaScript object or Phaser object such as Sprite.

  Parameters:
    * game-object-creator (Phaser.GameObjectCreator) - Targeted instance for method
    * obj (object) - Object the tween will be run on.

  Returns:  Phaser.Tween - The Tween object."
  ([game-object-creator obj]
   (phaser->clj
    (.tween game-object-creator
            (clj->phaser obj)))))