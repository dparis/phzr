(ns phzr.game-object-factory
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [filter]))

(defn ->GameObjectFactory
  "The GameObjectFactory is a quick way to create many common game objects
  using {@linkcode Phaser.Game#add `game.add`}.

  Created objects are _automatically added_ to the appropriate Manager, World, or manually specified parent Group.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.GameObjectFactory. (clj->phaser game))))

(defn audio
  "Creates a new Sound object.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * key (string) - The Game.cache key of the sound that this object will use.
    * volume (number) {optional} - The volume at which the sound will be played.
    * loop (boolean) {optional} - Whether or not the sound will loop.
    * connect (boolean) {optional} - Controls if the created Sound object will connect to the master gainNode of the SoundManager when running under WebAudio.

  Returns:  Phaser.Sound - The newly created sound object."
  ([game-object-factory key]
   (phaser->clj
    (.audio game-object-factory
            (clj->phaser key))))
  ([game-object-factory key volume]
   (phaser->clj
    (.audio game-object-factory
            (clj->phaser key)
            (clj->phaser volume))))
  ([game-object-factory key volume loop]
   (phaser->clj
    (.audio game-object-factory
            (clj->phaser key)
            (clj->phaser volume)
            (clj->phaser loop))))
  ([game-object-factory key volume loop connect]
   (phaser->clj
    (.audio game-object-factory
            (clj->phaser key)
            (clj->phaser volume)
            (clj->phaser loop)
            (clj->phaser connect)))))

(defn audio-sprite
  "Creates a new AudioSprite object.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * key (string) - The Game.cache key of the sound that this object will use.

  Returns:  Phaser.AudioSprite - The newly created AudioSprite object."
  ([game-object-factory key]
   (phaser->clj
    (.audioSprite game-object-factory
                  (clj->phaser key)))))

(defn bitmap-data
  "Create a BitmapData object.

  A BitmapData object can be manipulated and drawn to like a traditional Canvas object and used to texture Sprites.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * width (number) {optional} - The width of the BitmapData in pixels.
    * height (number) {optional} - The height of the BitmapData in pixels.
    * key (string) {optional} - Asset key for the BitmapData when stored in the Cache (see addToCache parameter).
    * add-to-cache (boolean) {optional} - Should this BitmapData be added to the Game.Cache? If so you can retrieve it with Cache.getBitmapData(key)

  Returns:  Phaser.BitmapData - The newly created BitmapData object."
  ([game-object-factory]
   (phaser->clj
    (.bitmapData game-object-factory)))
  ([game-object-factory width]
   (phaser->clj
    (.bitmapData game-object-factory
                 (clj->phaser width))))
  ([game-object-factory width height]
   (phaser->clj
    (.bitmapData game-object-factory
                 (clj->phaser width)
                 (clj->phaser height))))
  ([game-object-factory width height key]
   (phaser->clj
    (.bitmapData game-object-factory
                 (clj->phaser width)
                 (clj->phaser height)
                 (clj->phaser key))))
  ([game-object-factory width height key add-to-cache]
   (phaser->clj
    (.bitmapData game-object-factory
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
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) - X coordinate to display the BitmapText object at.
    * y (number) - Y coordinate to display the BitmapText object at.
    * font (string) - The key of the BitmapText as stored in Phaser.Cache.
    * text (string) {optional} - The text that will be rendered. This can also be set later via BitmapText.text.
    * size (number) {optional} - The size the font will be rendered at in pixels.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.BitmapText - The newly created bitmapText object."
  ([game-object-factory x y font]
   (phaser->clj
    (.bitmapText game-object-factory
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser font))))
  ([game-object-factory x y font text]
   (phaser->clj
    (.bitmapText game-object-factory
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser font)
                 (clj->phaser text))))
  ([game-object-factory x y font text size]
   (phaser->clj
    (.bitmapText game-object-factory
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser font)
                 (clj->phaser text)
                 (clj->phaser size))))
  ([game-object-factory x y font text size group]
   (phaser->clj
    (.bitmapText game-object-factory
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser font)
                 (clj->phaser text)
                 (clj->phaser size)
                 (clj->phaser group)))))

(defn button
  "Creates a new Button object.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the Button. The coordinate is relative to any parent container this button may be in.
    * y (number) {optional} - The y coordinate of the Button. The coordinate is relative to any parent container this button may be in.
    * key (string) {optional} - The image key as defined in the Game.Cache to use as the texture for this button.
    * callback (function) {optional} - The function to call when this button is pressed
    * callback-context (object) {optional} - The context in which the callback will be called (usually 'this')
    * over-frame (string | number) {optional} - This is the frame or frameName that will be set when this button is in an over state. Give either a number to use a frame ID or a string for a frame name.
    * out-frame (string | number) {optional} - This is the frame or frameName that will be set when this button is in an out state. Give either a number to use a frame ID or a string for a frame name.
    * down-frame (string | number) {optional} - This is the frame or frameName that will be set when this button is in a down state. Give either a number to use a frame ID or a string for a frame name.
    * up-frame (string | number) {optional} - This is the frame or frameName that will be set when this button is in an up state. Give either a number to use a frame ID or a string for a frame name.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.Button - The newly created Button object."
  ([game-object-factory]
   (phaser->clj
    (.button game-object-factory)))
  ([game-object-factory x]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x))))
  ([game-object-factory x y]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x)
             (clj->phaser y))))
  ([game-object-factory x y key]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key))))
  ([game-object-factory x y key callback]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback))))
  ([game-object-factory x y key callback callback-context]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context))))
  ([game-object-factory x y key callback callback-context over-frame]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser over-frame))))
  ([game-object-factory x y key callback callback-context over-frame out-frame]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser over-frame)
             (clj->phaser out-frame))))
  ([game-object-factory x y key callback callback-context over-frame out-frame down-frame]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser over-frame)
             (clj->phaser out-frame)
             (clj->phaser down-frame))))
  ([game-object-factory x y key callback callback-context over-frame out-frame down-frame up-frame]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser over-frame)
             (clj->phaser out-frame)
             (clj->phaser down-frame)
             (clj->phaser up-frame))))
  ([game-object-factory x y key callback callback-context over-frame out-frame down-frame up-frame group]
   (phaser->clj
    (.button game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser over-frame)
             (clj->phaser out-frame)
             (clj->phaser down-frame)
             (clj->phaser up-frame)
             (clj->phaser group)))))

(defn creature
  "Create a new Creature Animation object.

  Creature is a custom Game Object used in conjunction with the Creature Runtime libraries by Kestrel Moon Studios.

  It allows you to display animated Game Objects that were created with the [Creature Automated Animation Tool](http://www.kestrelmoon.com/creature/).

  Note 1: You can only use Phaser.Creature objects in WebGL enabled games. They do not work in Canvas mode games.

  Note 2: You must use a build of Phaser that includes the CreatureMeshBone.js runtime and gl-matrix.js, or have them
  loaded before your Phaser game boots.

  See the Phaser custom build process for more details.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the creature. The coordinate is relative to any parent container this creature may be in.
    * y (number) {optional} - The y coordinate of the creature. The coordinate is relative to any parent container this creature may be in.
    * key (string | PIXI.Texture) {optional} - The image used as a texture by this creature object during rendering. If a string Phaser will get for an entry in the Image Cache. Or it can be an instance of a PIXI.Texture.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.Creature - The newly created Sprite object."
  ([game-object-factory]
   (phaser->clj
    (.creature game-object-factory)))
  ([game-object-factory x]
   (phaser->clj
    (.creature game-object-factory
               (clj->phaser x))))
  ([game-object-factory x y]
   (phaser->clj
    (.creature game-object-factory
               (clj->phaser x)
               (clj->phaser y))))
  ([game-object-factory x y key]
   (phaser->clj
    (.creature game-object-factory
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser key))))
  ([game-object-factory x y key group]
   (phaser->clj
    (.creature game-object-factory
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser key)
               (clj->phaser group)))))

(defn emitter
  "Create a new Emitter.

  A particle emitter can be used for one-time explosions or for
  continuous effects like rain and fire. All it really does is launch Particle objects out
  at set intervals, and fixes their positions and velocities accordingly.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) {optional} - The x coordinate within the Emitter that the particles are emitted from.
    * y (number) {optional} - The y coordinate within the Emitter that the particles are emitted from.
    * max-particles (number) {optional} - The total number of particles in this emitter.

  Returns:  Phaser.Particles.Arcade.Emitter - The newly created emitter object."
  ([game-object-factory]
   (phaser->clj
    (.emitter game-object-factory)))
  ([game-object-factory x]
   (phaser->clj
    (.emitter game-object-factory
              (clj->phaser x))))
  ([game-object-factory x y]
   (phaser->clj
    (.emitter game-object-factory
              (clj->phaser x)
              (clj->phaser y))))
  ([game-object-factory x y max-particles]
   (phaser->clj
    (.emitter game-object-factory
              (clj->phaser x)
              (clj->phaser y)
              (clj->phaser max-particles)))))

(defn existing
  "Adds an existing display object to the game world.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * object (any) - An instance of Phaser.Sprite, Phaser.Button or any other display object.

  Returns:  any - The child that was added to the World."
  ([game-object-factory object]
   (phaser->clj
    (.existing game-object-factory
               (clj->phaser object)))))

(defn filter
  "A WebGL shader/filter that can be applied to Sprites.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * filter (string) - The name of the filter you wish to create, for example HueRotate or SineWave.
    * args (any) - Whatever parameters are needed to be passed to the filter init function.

  Returns:  Phaser.Filter - The newly created Phaser.Filter object."
  ([game-object-factory filter & args]
   (phaser->clj
    (.apply (aget game-object-factory filter) game-object-factory
            (into-array (concat [(clj->phaser filter)] args))))))

(defn graphics
  "Creates a new Graphics object.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the Graphic. The coordinate is relative to any parent container this object may be in.
    * y (number) {optional} - The y coordinate of the Graphic. The coordinate is relative to any parent container this object may be in.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.Graphics - The newly created graphics object."
  ([game-object-factory]
   (phaser->clj
    (.graphics game-object-factory)))
  ([game-object-factory x]
   (phaser->clj
    (.graphics game-object-factory
               (clj->phaser x))))
  ([game-object-factory x y]
   (phaser->clj
    (.graphics game-object-factory
               (clj->phaser x)
               (clj->phaser y))))
  ([game-object-factory x y group]
   (phaser->clj
    (.graphics game-object-factory
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser group)))))

(defn group
  "A Group is a container for display objects that allows for fast pooling, recycling and collision checks.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * parent (any) {optional} - The parent Group or DisplayObjectContainer that will hold this group, if any. If set to null the Group won't be added to the display list. If undefined it will be added to World by default.
    * name (string) {optional} - A name for this Group. Not used internally but useful for debugging.
    * add-to-stage (boolean) {optional} - If set to true this Group will be added directly to the Game.Stage instead of Game.World.
    * enable-body (boolean) {optional} - If true all Sprites created with `Group.create` or `Group.createMulitple` will have a physics body created on them. Change the body type with physicsBodyType.
    * physics-body-type (number) {optional} - If enableBody is true this is the type of physics body that is created on new Sprites. Phaser.Physics.ARCADE, Phaser.Physics.P2, Phaser.Physics.NINJA, etc.

  Returns:  Phaser.Group - The newly created Group."
  ([game-object-factory]
   (phaser->clj
    (.group game-object-factory)))
  ([game-object-factory parent]
   (phaser->clj
    (.group game-object-factory
            (clj->phaser parent))))
  ([game-object-factory parent name]
   (phaser->clj
    (.group game-object-factory
            (clj->phaser parent)
            (clj->phaser name))))
  ([game-object-factory parent name add-to-stage]
   (phaser->clj
    (.group game-object-factory
            (clj->phaser parent)
            (clj->phaser name)
            (clj->phaser add-to-stage))))
  ([game-object-factory parent name add-to-stage enable-body]
   (phaser->clj
    (.group game-object-factory
            (clj->phaser parent)
            (clj->phaser name)
            (clj->phaser add-to-stage)
            (clj->phaser enable-body))))
  ([game-object-factory parent name add-to-stage enable-body physics-body-type]
   (phaser->clj
    (.group game-object-factory
            (clj->phaser parent)
            (clj->phaser name)
            (clj->phaser add-to-stage)
            (clj->phaser enable-body)
            (clj->phaser physics-body-type)))))

(defn image
  "Create a new `Image` object.

  An Image is a light-weight object you can use to display anything that doesn't need physics or animation.

  It can still rotate, scale, crop and receive input events. 
  This makes it perfect for logos, backgrounds, simple buttons and other non-Sprite graphics.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the Image. The coordinate is relative to any parent container this Image may be in.
    * y (number) {optional} - The y coordinate of the Image. The coordinate is relative to any parent container this Image may be in.
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) {optional} - The image used as a texture by this display object during rendering. If a string Phaser will get for an entry in the Image Cache. Or it can be an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If a Texture Atlas or Sprite Sheet is used this allows you to specify the frame to be used. Use either an integer for a Frame ID or a string for a frame name.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.Image - The newly created Image object."
  ([game-object-factory]
   (phaser->clj
    (.image game-object-factory)))
  ([game-object-factory x]
   (phaser->clj
    (.image game-object-factory
            (clj->phaser x))))
  ([game-object-factory x y]
   (phaser->clj
    (.image game-object-factory
            (clj->phaser x)
            (clj->phaser y))))
  ([game-object-factory x y key]
   (phaser->clj
    (.image game-object-factory
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser key))))
  ([game-object-factory x y key frame]
   (phaser->clj
    (.image game-object-factory
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser key)
            (clj->phaser frame))))
  ([game-object-factory x y key frame group]
   (phaser->clj
    (.image game-object-factory
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser key)
            (clj->phaser frame)
            (clj->phaser group)))))

(defn physics-group
  "A Group is a container for display objects that allows for fast pooling, recycling and collision checks.

  A Physics Group is the same as an ordinary Group except that is has enableBody turned on by default, so any Sprites it creates
  are automatically given a physics body.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * physics-body-type (number) {optional} - If enableBody is true this is the type of physics body that is created on new Sprites. Phaser.Physics.ARCADE, Phaser.Physics.P2, Phaser.Physics.NINJA, etc.
    * parent (any) {optional} - The parent Group or DisplayObjectContainer that will hold this group, if any. If set to null the Group won't be added to the display list. If undefined it will be added to World by default.
    * name (string) {optional} - A name for this Group. Not used internally but useful for debugging.
    * add-to-stage (boolean) {optional} - If set to true this Group will be added directly to the Game.Stage instead of Game.World.

  Returns:  Phaser.Group - The newly created Group."
  ([game-object-factory]
   (phaser->clj
    (.physicsGroup game-object-factory)))
  ([game-object-factory physics-body-type]
   (phaser->clj
    (.physicsGroup game-object-factory
                   (clj->phaser physics-body-type))))
  ([game-object-factory physics-body-type parent]
   (phaser->clj
    (.physicsGroup game-object-factory
                   (clj->phaser physics-body-type)
                   (clj->phaser parent))))
  ([game-object-factory physics-body-type parent name]
   (phaser->clj
    (.physicsGroup game-object-factory
                   (clj->phaser physics-body-type)
                   (clj->phaser parent)
                   (clj->phaser name))))
  ([game-object-factory physics-body-type parent name add-to-stage]
   (phaser->clj
    (.physicsGroup game-object-factory
                   (clj->phaser physics-body-type)
                   (clj->phaser parent)
                   (clj->phaser name)
                   (clj->phaser add-to-stage)))))

(defn plugin
  "Add a new Plugin into the PluginManager.

  The Plugin must have 2 properties: `game` and `parent`. Plugin.game is set to the game reference the PluginManager uses, and parent is set to the PluginManager.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * plugin (object | Phaser.Plugin) - The Plugin to add into the PluginManager. This can be a function or an existing object.
    * parameter (*) - Additional parameters that will be passed to the Plugin.init method.

  Returns:  Phaser.Plugin - The Plugin that was added to the manager."
  ([game-object-factory plugin parameter]
   (phaser->clj
    (.plugin game-object-factory
             (clj->phaser plugin)
             (clj->phaser parameter)))))

(defn render-texture
  "A dynamic initially blank canvas to which images can be drawn.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * width (number) {optional} - the width of the RenderTexture.
    * height (number) {optional} - the height of the RenderTexture.
    * key (string) {optional} - Asset key for the RenderTexture when stored in the Cache (see addToCache parameter).
    * add-to-cache (boolean) {optional} - Should this RenderTexture be added to the Game.Cache? If so you can retrieve it with Cache.getTexture(key)

  Returns:  Phaser.RenderTexture - The newly created RenderTexture object."
  ([game-object-factory]
   (phaser->clj
    (.renderTexture game-object-factory)))
  ([game-object-factory width]
   (phaser->clj
    (.renderTexture game-object-factory
                    (clj->phaser width))))
  ([game-object-factory width height]
   (phaser->clj
    (.renderTexture game-object-factory
                    (clj->phaser width)
                    (clj->phaser height))))
  ([game-object-factory width height key]
   (phaser->clj
    (.renderTexture game-object-factory
                    (clj->phaser width)
                    (clj->phaser height)
                    (clj->phaser key))))
  ([game-object-factory width height key add-to-cache]
   (phaser->clj
    (.renderTexture game-object-factory
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
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
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
  ([game-object-factory font character-width character-height chars chars-per-row]
   (phaser->clj
    (.retroFont game-object-factory
                (clj->phaser font)
                (clj->phaser character-width)
                (clj->phaser character-height)
                (clj->phaser chars)
                (clj->phaser chars-per-row))))
  ([game-object-factory font character-width character-height chars chars-per-row x-spacing]
   (phaser->clj
    (.retroFont game-object-factory
                (clj->phaser font)
                (clj->phaser character-width)
                (clj->phaser character-height)
                (clj->phaser chars)
                (clj->phaser chars-per-row)
                (clj->phaser x-spacing))))
  ([game-object-factory font character-width character-height chars chars-per-row x-spacing y-spacing]
   (phaser->clj
    (.retroFont game-object-factory
                (clj->phaser font)
                (clj->phaser character-width)
                (clj->phaser character-height)
                (clj->phaser chars)
                (clj->phaser chars-per-row)
                (clj->phaser x-spacing)
                (clj->phaser y-spacing))))
  ([game-object-factory font character-width character-height chars chars-per-row x-spacing y-spacing x-offset]
   (phaser->clj
    (.retroFont game-object-factory
                (clj->phaser font)
                (clj->phaser character-width)
                (clj->phaser character-height)
                (clj->phaser chars)
                (clj->phaser chars-per-row)
                (clj->phaser x-spacing)
                (clj->phaser y-spacing)
                (clj->phaser x-offset))))
  ([game-object-factory font character-width character-height chars chars-per-row x-spacing y-spacing x-offset y-offset]
   (phaser->clj
    (.retroFont game-object-factory
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

  Example usage: https://github.com/codevinsky/phaser-rope-demo/blob/master/dist/demo.js

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the Rope. The coordinate is relative to any parent container this rope may be in.
    * y (number) {optional} - The y coordinate of the Rope. The coordinate is relative to any parent container this rope may be in.
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) {optional} - The image used as a texture by this display object during rendering. If a string Phaser will get for an entry in the Image Cache. Or it can be an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If a Texture Atlas or Sprite Sheet is used this allows you to specify the frame to be used. Use either an integer for a Frame ID or a string for a frame name.
    * points (Array) - An array of {Phaser.Point}.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.Rope - The newly created Rope object."
  ([game-object-factory points]
   (phaser->clj
    (.rope game-object-factory
           (clj->phaser points))))
  ([game-object-factory points x]
   (phaser->clj
    (.rope game-object-factory
           (clj->phaser points)
           (clj->phaser x))))
  ([game-object-factory points x y]
   (phaser->clj
    (.rope game-object-factory
           (clj->phaser points)
           (clj->phaser x)
           (clj->phaser y))))
  ([game-object-factory points x y key]
   (phaser->clj
    (.rope game-object-factory
           (clj->phaser points)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser key))))
  ([game-object-factory points x y key frame]
   (phaser->clj
    (.rope game-object-factory
           (clj->phaser points)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser key)
           (clj->phaser frame))))
  ([game-object-factory points x y key frame group]
   (phaser->clj
    (.rope game-object-factory
           (clj->phaser points)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser key)
           (clj->phaser frame)
           (clj->phaser group)))))

(defn sound
  "Creates a new Sound object.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * key (string) - The Game.cache key of the sound that this object will use.
    * volume (number) {optional} - The volume at which the sound will be played.
    * loop (boolean) {optional} - Whether or not the sound will loop.
    * connect (boolean) {optional} - Controls if the created Sound object will connect to the master gainNode of the SoundManager when running under WebAudio.

  Returns:  Phaser.Sound - The newly created sound object."
  ([game-object-factory key]
   (phaser->clj
    (.sound game-object-factory
            (clj->phaser key))))
  ([game-object-factory key volume]
   (phaser->clj
    (.sound game-object-factory
            (clj->phaser key)
            (clj->phaser volume))))
  ([game-object-factory key volume loop]
   (phaser->clj
    (.sound game-object-factory
            (clj->phaser key)
            (clj->phaser volume)
            (clj->phaser loop))))
  ([game-object-factory key volume loop connect]
   (phaser->clj
    (.sound game-object-factory
            (clj->phaser key)
            (clj->phaser volume)
            (clj->phaser loop)
            (clj->phaser connect)))))

(defn sprite
  "Create a new Sprite with specific position and sprite sheet key.

  At its most basic a Sprite consists of a set of coordinates and a texture that is used when rendered.
  They also contain additional properties allowing for physics motion (via Sprite.body), input handling (via Sprite.input),
  events (via Sprite.events), animation (via Sprite.animations), camera culling and more. Please see the Examples for use cases.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the sprite. The coordinate is relative to any parent container this sprite may be in.
    * y (number) {optional} - The y coordinate of the sprite. The coordinate is relative to any parent container this sprite may be in.
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) {optional} - The image used as a texture by this display object during rendering. If a string Phaser will get for an entry in the Image Cache. Or it can be an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If a Texture Atlas or Sprite Sheet is used this allows you to specify the frame to be used. Use either an integer for a Frame ID or a string for a frame name.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.Sprite - The newly created Sprite object."
  ([game-object-factory]
   (phaser->clj
    (.sprite game-object-factory)))
  ([game-object-factory x]
   (phaser->clj
    (.sprite game-object-factory
             (clj->phaser x))))
  ([game-object-factory x y]
   (phaser->clj
    (.sprite game-object-factory
             (clj->phaser x)
             (clj->phaser y))))
  ([game-object-factory x y key]
   (phaser->clj
    (.sprite game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key))))
  ([game-object-factory x y key frame]
   (phaser->clj
    (.sprite game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser frame))))
  ([game-object-factory x y key frame group]
   (phaser->clj
    (.sprite game-object-factory
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser frame)
             (clj->phaser group)))))

(defn sprite-batch
  "A SpriteBatch is a really fast version of a Phaser Group built solely for speed.
  Use when you need a lot of sprites or particles all sharing the same texture.
  The speed gains are specifically for WebGL. In Canvas mode you won't see any real difference.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * parent (Phaser.Group | null) - The parent Group that will hold this Sprite Batch. Set to `undefined` or `null` to add directly to game.world.
    * name (string) {optional} - A name for this Sprite Batch. Not used internally but useful for debugging.
    * add-to-stage (boolean) {optional} - If set to true this Sprite Batch will be added directly to the Game.Stage instead of the parent.

  Returns:  Phaser.SpriteBatch - The newly created Sprite Batch."
  ([game-object-factory parent]
   (phaser->clj
    (.spriteBatch game-object-factory
                  (clj->phaser parent))))
  ([game-object-factory parent name]
   (phaser->clj
    (.spriteBatch game-object-factory
                  (clj->phaser parent)
                  (clj->phaser name))))
  ([game-object-factory parent name add-to-stage]
   (phaser->clj
    (.spriteBatch game-object-factory
                  (clj->phaser parent)
                  (clj->phaser name)
                  (clj->phaser add-to-stage)))))

(defn text
  "Creates a new Text object.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the Text. The coordinate is relative to any parent container this text may be in.
    * y (number) {optional} - The y coordinate of the Text. The coordinate is relative to any parent container this text may be in.
    * text (string) {optional} - The text string that will be displayed.
    * style (object) {optional} - The style object containing style attributes like font, font size , etc.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.Text - The newly created text object."
  ([game-object-factory]
   (phaser->clj
    (.text game-object-factory)))
  ([game-object-factory x]
   (phaser->clj
    (.text game-object-factory
           (clj->phaser x))))
  ([game-object-factory x y]
   (phaser->clj
    (.text game-object-factory
           (clj->phaser x)
           (clj->phaser y))))
  ([game-object-factory x y text]
   (phaser->clj
    (.text game-object-factory
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser text))))
  ([game-object-factory x y text style]
   (phaser->clj
    (.text game-object-factory
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser text)
           (clj->phaser style))))
  ([game-object-factory x y text style group]
   (phaser->clj
    (.text game-object-factory
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser text)
           (clj->phaser style)
           (clj->phaser group)))))

(defn tile-sprite
  "Creates a new TileSprite object.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * x (number) - The x coordinate of the TileSprite. The coordinate is relative to any parent container this TileSprite may be in.
    * y (number) - The y coordinate of the TileSprite. The coordinate is relative to any parent container this TileSprite may be in.
    * width (number) - The width of the TileSprite.
    * height (number) - The height of the TileSprite.
    * key (string | Phaser.RenderTexture | Phaser.BitmapData | Phaser.Video | PIXI.Texture) - The image used as a texture by this display object during rendering. If a string Phaser will get for an entry in the Image Cache. Or it can be an instance of a RenderTexture, BitmapData, Video or PIXI.Texture.
    * frame (string | number) {optional} - If a Texture Atlas or Sprite Sheet is used this allows you to specify the frame to be used. Use either an integer for a Frame ID or a string for a frame name.
    * group (Phaser.Group) {optional} - Optional Group to add the object to. If not specified it will be added to the World group.

  Returns:  Phaser.TileSprite - The newly created TileSprite object."
  ([game-object-factory x y width height key]
   (phaser->clj
    (.tileSprite game-object-factory
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser width)
                 (clj->phaser height)
                 (clj->phaser key))))
  ([game-object-factory x y width height key frame]
   (phaser->clj
    (.tileSprite game-object-factory
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser width)
                 (clj->phaser height)
                 (clj->phaser key)
                 (clj->phaser frame))))
  ([game-object-factory x y width height key frame group]
   (phaser->clj
    (.tileSprite game-object-factory
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser width)
                 (clj->phaser height)
                 (clj->phaser key)
                 (clj->phaser frame)
                 (clj->phaser group)))))

(defn tilemap
  "Creates a new Phaser.Tilemap object.

  The map can either be populated with data from a Tiled JSON file or from a CSV file.
  To do this pass the Cache key as the first parameter. When using Tiled data you need only provide the key.
  When using CSV data you must provide the key and the tileWidth and tileHeight parameters.
  If creating a blank tilemap to be populated later, you can either specify no parameters at all and then use `Tilemap.create` or pass the map and tile dimensions here.
  Note that all Tilemaps use a base tile size to calculate dimensions from, but that a TilemapLayer may have its own unique tile size that overrides it.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * key (string) {optional} - The key of the tilemap data as stored in the Cache. If you're creating a blank map either leave this parameter out or pass `null`.
    * tile-width (number) {optional} - The pixel width of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.
    * tile-height (number) {optional} - The pixel height of a single map tile. If using CSV data you must specify this. Not required if using Tiled map data.
    * width (number) {optional} - The width of the map in tiles. If this map is created from Tiled or CSV data you don't need to specify this.
    * height (number) {optional} - The height of the map in tiles. If this map is created from Tiled or CSV data you don't need to specify this.

  Returns:  Phaser.Tilemap - The newly created tilemap object."
  ([game-object-factory]
   (phaser->clj
    (.tilemap game-object-factory)))
  ([game-object-factory key]
   (phaser->clj
    (.tilemap game-object-factory
              (clj->phaser key))))
  ([game-object-factory key tile-width]
   (phaser->clj
    (.tilemap game-object-factory
              (clj->phaser key)
              (clj->phaser tile-width))))
  ([game-object-factory key tile-width tile-height]
   (phaser->clj
    (.tilemap game-object-factory
              (clj->phaser key)
              (clj->phaser tile-width)
              (clj->phaser tile-height))))
  ([game-object-factory key tile-width tile-height width]
   (phaser->clj
    (.tilemap game-object-factory
              (clj->phaser key)
              (clj->phaser tile-width)
              (clj->phaser tile-height)
              (clj->phaser width))))
  ([game-object-factory key tile-width tile-height width height]
   (phaser->clj
    (.tilemap game-object-factory
              (clj->phaser key)
              (clj->phaser tile-width)
              (clj->phaser tile-height)
              (clj->phaser width)
              (clj->phaser height)))))

(defn tween
  "Create a tween on a specific object.

  The object can be any JavaScript object or Phaser object such as Sprite.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * object (object) - Object the tween will be run on.

  Returns:  Phaser.Tween - The newly created Phaser.Tween object."
  ([game-object-factory object]
   (phaser->clj
    (.tween game-object-factory
            (clj->phaser object)))))

(defn video
  "Create a Video object.

  This will return a Phaser.Video object which you can pass to a Sprite to be used as a texture.

  Parameters:
    * game-object-factory (Phaser.GameObjectFactory) - Targeted instance for method
    * key (string | null) {optional} - The key of the video file in the Phaser.Cache that this Video object will play. Set to `null` or leave undefined if you wish to use a webcam as the source. See `startMediaStream` to start webcam capture.
    * url (string | null) {optional} - If the video hasn't been loaded then you can provide a full URL to the file here (make sure to set key to null)

  Returns:  Phaser.Video - The newly created Video object."
  ([game-object-factory]
   (phaser->clj
    (.video game-object-factory)))
  ([game-object-factory key]
   (phaser->clj
    (.video game-object-factory
            (clj->phaser key))))
  ([game-object-factory key url]
   (phaser->clj
    (.video game-object-factory
            (clj->phaser key)
            (clj->phaser url)))))