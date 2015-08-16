(ns phzr.cache
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Cache
  "Phaser has one single cache in which it stores all assets.

  The cache is split up into sections, such as images, sounds, video, json, etc. All assets are stored using
  a unique string-based key as their identifier. Assets stored in different areas of the cache can have the
  same key, for example 'playerWalking' could be used as the key for both a sprite sheet and an audio file,
  because they are unique data types.

  The cache is automatically populated by the Phaser.Loader. When you use the loader to pull in external assets
  such as images they are automatically placed into their respective cache. Most common Game Objects, such as
  Sprites and Videos automatically query the cache to extract the assets they need on instantiation.

  You can access the cache from within a State via `this.cache`. From here you can call any public method it has,
  including adding new entries to it, deleting them or querying them.

  Understand that almost without exception when you get an item from the cache it will return a reference to the
  item stored in the cache, not a copy of it. Therefore if you retrieve an item and then modify it, the original
  object in the cache will also be updated, even if you don't put it back into the cache again.

  By default when you change State the cache is _not_ cleared, although there is an option to clear it should
  your game require it. In a typical game set-up the cache is populated once after the main game has loaded and
  then used as an asset store.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Cache. (clj->phaser game))))

(defn const
  [k]
  (when-let [cn (get phzr.impl.accessors.cache/cache-constants k)]
    (aget js/Phaser.Cache cn)))

(defn add-binary
  "Add a binary object in to the cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * binary-data (object) - The binary object to be added to the cache."
  ([cache key binary-data]
   (phaser->clj
    (.addBinary cache
                (clj->phaser key)
                (clj->phaser binary-data)))))

(defn add-bitmap-data
  "Add a BitmapData object to the cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * bitmap-data (Phaser.BitmapData) - The BitmapData object to be addded to the cache.
    * frame-data (Phaser.FrameData | null) {optional} - Optional FrameData set associated with the given BitmapData. If not specified (or `undefined`) a new FrameData object is created containing the Bitmap's Frame. If `null` is supplied then no FrameData will be created.

  Returns:  Phaser.BitmapData - The BitmapData object to be addded to the cache."
  ([cache key bitmap-data]
   (phaser->clj
    (.addBitmapData cache
                    (clj->phaser key)
                    (clj->phaser bitmap-data))))
  ([cache key bitmap-data frame-data]
   (phaser->clj
    (.addBitmapData cache
                    (clj->phaser key)
                    (clj->phaser bitmap-data)
                    (clj->phaser frame-data)))))

(defn add-bitmap-font
  "Add a new Bitmap Font to the Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra font data.
    * atlas-data (object) - Texture atlas frames data.
    * x-spacing (number) {optional} - If you'd like to add additional horizontal spacing between the characters then set the pixel value here.
    * y-spacing (number) {optional} - If you'd like to add additional vertical spacing between the lines then set the pixel value here."
  ([cache key url data atlas-data]
   (phaser->clj
    (.addBitmapFont cache
                    (clj->phaser key)
                    (clj->phaser url)
                    (clj->phaser data)
                    (clj->phaser atlas-data))))
  ([cache key url data atlas-data x-spacing]
   (phaser->clj
    (.addBitmapFont cache
                    (clj->phaser key)
                    (clj->phaser url)
                    (clj->phaser data)
                    (clj->phaser atlas-data)
                    (clj->phaser x-spacing))))
  ([cache key url data atlas-data x-spacing y-spacing]
   (phaser->clj
    (.addBitmapFont cache
                    (clj->phaser key)
                    (clj->phaser url)
                    (clj->phaser data)
                    (clj->phaser atlas-data)
                    (clj->phaser x-spacing)
                    (clj->phaser y-spacing)))))

(defn add-canvas
  "Add a new canvas object in to the cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * canvas (HTMLCanvasElement) - The Canvas DOM element.
    * context (CanvasRenderingContext2D) {optional} - The context of the canvas element. If not specified it will default go `getContext('2d')`."
  ([cache key canvas]
   (phaser->clj
    (.addCanvas cache
                (clj->phaser key)
                (clj->phaser canvas))))
  ([cache key canvas context]
   (phaser->clj
    (.addCanvas cache
                (clj->phaser key)
                (clj->phaser canvas)
                (clj->phaser context)))))

(defn add-image
  "Adds an Image file into the Cache. The file must have already been loaded, typically via Phaser.Loader, but can also have been loaded into the DOM.
  If an image already exists in the cache with the same key then it is removed and destroyed, and the new image inserted in its place.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra image data.

  Returns:  object - The full image object that was added to the cache."
  ([cache key url data]
   (phaser->clj
    (.addImage cache
               (clj->phaser key)
               (clj->phaser url)
               (clj->phaser data)))))

(defn add-json
  "Add a new json object into the cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra json data."
  ([cache key url data]
   (phaser->clj
    (.addJSON cache
              (clj->phaser key)
              (clj->phaser url)
              (clj->phaser data)))))

(defn add-physics-data
  "Add a new physics data object to the Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * json-data (object) - The physics data object (a JSON file).
    * format (number) - The format of the physics data."
  ([cache key url json-data format]
   (phaser->clj
    (.addPhysicsData cache
                     (clj->phaser key)
                     (clj->phaser url)
                     (clj->phaser json-data)
                     (clj->phaser format)))))

(defn add-render-texture
  "Add a new Phaser.RenderTexture in to the cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * texture (Phaser.RenderTexture) - The texture to use as the base of the RenderTexture."
  ([cache key texture]
   (phaser->clj
    (.addRenderTexture cache
                       (clj->phaser key)
                       (clj->phaser texture)))))

(defn add-shader
  "Adds a Fragment Shader in to the Cache. The file must have already been loaded, typically via Phaser.Loader.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra shader data."
  ([cache key url data]
   (phaser->clj
    (.addShader cache
                (clj->phaser key)
                (clj->phaser url)
                (clj->phaser data)))))

(defn add-sound
  "Adds a Sound file into the Cache. The file must have already been loaded, typically via Phaser.Loader.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra sound data.
    * web-audio (boolean) - True if the file is using web audio.
    * audio-tag (boolean) - True if the file is using legacy HTML audio."
  ([cache key url data web-audio audio-tag]
   (phaser->clj
    (.addSound cache
               (clj->phaser key)
               (clj->phaser url)
               (clj->phaser data)
               (clj->phaser web-audio)
               (clj->phaser audio-tag)))))

(defn add-sprite-sheet
  "Add a new sprite sheet in to the cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra sprite sheet data.
    * frame-width (number) - Width of the sprite sheet.
    * frame-height (number) - Height of the sprite sheet.
    * frame-max (number) {optional} - How many frames stored in the sprite sheet. If -1 then it divides the whole sheet evenly.
    * margin (number) {optional} - If the frames have been drawn with a margin, specify the amount here.
    * spacing (number) {optional} - If the frames have been drawn with spacing between them, specify the amount here."
  ([cache key url data frame-width frame-height]
   (phaser->clj
    (.addSpriteSheet cache
                     (clj->phaser key)
                     (clj->phaser url)
                     (clj->phaser data)
                     (clj->phaser frame-width)
                     (clj->phaser frame-height))))
  ([cache key url data frame-width frame-height frame-max]
   (phaser->clj
    (.addSpriteSheet cache
                     (clj->phaser key)
                     (clj->phaser url)
                     (clj->phaser data)
                     (clj->phaser frame-width)
                     (clj->phaser frame-height)
                     (clj->phaser frame-max))))
  ([cache key url data frame-width frame-height frame-max margin]
   (phaser->clj
    (.addSpriteSheet cache
                     (clj->phaser key)
                     (clj->phaser url)
                     (clj->phaser data)
                     (clj->phaser frame-width)
                     (clj->phaser frame-height)
                     (clj->phaser frame-max)
                     (clj->phaser margin))))
  ([cache key url data frame-width frame-height frame-max margin spacing]
   (phaser->clj
    (.addSpriteSheet cache
                     (clj->phaser key)
                     (clj->phaser url)
                     (clj->phaser data)
                     (clj->phaser frame-width)
                     (clj->phaser frame-height)
                     (clj->phaser frame-max)
                     (clj->phaser margin)
                     (clj->phaser spacing)))))

(defn add-text
  "Add a new text data.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra text data."
  ([cache key url data]
   (phaser->clj
    (.addText cache
              (clj->phaser key)
              (clj->phaser url)
              (clj->phaser data)))))

(defn add-texture-atlas
  "Add a new texture atlas to the Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra texture atlas data.
    * atlas-data (object) - Texture atlas frames data.
    * format (number) - The format of the texture atlas."
  ([cache key url data atlas-data format]
   (phaser->clj
    (.addTextureAtlas cache
                      (clj->phaser key)
                      (clj->phaser url)
                      (clj->phaser data)
                      (clj->phaser atlas-data)
                      (clj->phaser format)))))

(defn add-tilemap
  "Add a new tilemap to the Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * map-data (object) - The tilemap data object (either a CSV or JSON file).
    * format (number) - The format of the tilemap data."
  ([cache key url map-data format]
   (phaser->clj
    (.addTilemap cache
                 (clj->phaser key)
                 (clj->phaser url)
                 (clj->phaser map-data)
                 (clj->phaser format)))))

(defn add-video
  "Adds a Video file into the Cache. The file must have already been loaded, typically via Phaser.Loader.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra video data.
    * is-blob (boolean) - True if the file was preloaded via xhr and the data parameter is a Blob. false if a Video tag was created instead."
  ([cache key url data is-blob]
   (phaser->clj
    (.addVideo cache
               (clj->phaser key)
               (clj->phaser url)
               (clj->phaser data)
               (clj->phaser is-blob)))))

(defn add-xml
  "Add a new xml object into the cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key that this asset will be stored in the cache under. This should be unique within this cache.
    * url (string) - The URL the asset was loaded from. If the asset was not loaded externally set to `null`.
    * data (object) - Extra text data."
  ([cache key url data]
   (phaser->clj
    (.addXML cache
             (clj->phaser key)
             (clj->phaser url)
             (clj->phaser data)))))

(defn check-binary-key
  "Checks if the given key exists in the Binary Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkBinaryKey cache
                     (clj->phaser key)))))

(defn check-bitmap-data-key
  "Checks if the given key exists in the BitmapData Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkBitmapDataKey cache
                         (clj->phaser key)))))

(defn check-bitmap-font-key
  "Checks if the given key exists in the BitmapFont Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkBitmapFontKey cache
                         (clj->phaser key)))))

(defn check-canvas-key
  "Checks if the given key exists in the Canvas Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkCanvasKey cache
                     (clj->phaser key)))))

(defn check-image-key
  "Checks if the given key exists in the Image Cache. Note that this also includes Texture Atlases, Sprite Sheets and Retro Fonts.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkImageKey cache
                    (clj->phaser key)))))

(defn check-json-key
  "Checks if the given key exists in the JSON Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkJSONKey cache
                   (clj->phaser key)))))

(defn check-key
  "Checks if a key for the given cache object type exists.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * cache (integer) - The cache to search. One of the Cache consts such as `Phaser.Cache.IMAGE` or `Phaser.Cache.SOUND`.
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists, otherwise false."
  ([cache cache key]
   (phaser->clj
    (.checkKey cache
               (clj->phaser cache)
               (clj->phaser key)))))

(defn check-physics-key
  "Checks if the given key exists in the Physics Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkPhysicsKey cache
                      (clj->phaser key)))))

(defn check-render-texture-key
  "Checks if the given key exists in the Render Texture Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkRenderTextureKey cache
                            (clj->phaser key)))))

(defn check-shader-key
  "Checks if the given key exists in the Fragment Shader Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkShaderKey cache
                     (clj->phaser key)))))

(defn check-sound-key
  "Checks if the given key exists in the Sound Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkSoundKey cache
                    (clj->phaser key)))))

(defn check-text-key
  "Checks if the given key exists in the Text Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkTextKey cache
                   (clj->phaser key)))))

(defn check-texture-key
  "Checks if the given key exists in the Texture Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkTextureKey cache
                      (clj->phaser key)))))

(defn check-tilemap-key
  "Checks if the given key exists in the Tilemap Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkTilemapKey cache
                      (clj->phaser key)))))

(defn check-url
  "Checks if the given URL has been loaded into the Cache.
  This method will only work if Cache.autoResolveURL was set to `true` before any preloading took place.
  The method will make a DOM src call to the URL given, so please be aware of this for certain file types, such as Sound files on Firefox
  which may cause double-load instances.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * url (string) - The url to check for in the cache.

  Returns:  boolean - True if the url exists, otherwise false."
  ([cache url]
   (phaser->clj
    (.checkURL cache
               (clj->phaser url)))))

(defn check-video-key
  "Checks if the given key exists in the Video Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkVideoKey cache
                    (clj->phaser key)))))

(defn check-xml-key
  "Checks if the given key exists in the XML Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the key exists in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.checkXMLKey cache
                  (clj->phaser key)))))

(defn decoded-sound
  "Add a new decoded sound.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.
    * data (object) - Extra sound data."
  ([cache key data]
   (phaser->clj
    (.decodedSound cache
                   (clj->phaser key)
                   (clj->phaser data)))))

(defn destroy
  "Clears the cache. Removes every local cache object reference.
  If an object in the cache has a `destroy` method it will also be called."
  ([cache]
   (phaser->clj
    (.destroy cache))))

(defn get-base-texture
  "Gets a PIXI.BaseTexture by key from the given Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Asset key of the image for which you want the BaseTexture for.
    * cache (integer) {optional} - The cache to search for the item in.

  Returns:  PIXI.BaseTexture - The BaseTexture object."
  ([cache key]
   (phaser->clj
    (.getBaseTexture cache
                     (clj->phaser key))))
  ([cache key cache]
   (phaser->clj
    (.getBaseTexture cache
                     (clj->phaser key)
                     (clj->phaser cache)))))

(defn get-binary
  "Gets a binary object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  object - The binary data object."
  ([cache key]
   (phaser->clj
    (.getBinary cache
                (clj->phaser key)))))

(defn get-bitmap-data
  "Gets a BitmapData object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  Phaser.BitmapData - The requested BitmapData object if found, or null if not."
  ([cache key]
   (phaser->clj
    (.getBitmapData cache
                    (clj->phaser key)))))

(defn get-bitmap-font
  "Gets a Bitmap Font object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  Phaser.BitmapFont - The requested BitmapFont object if found, or null if not."
  ([cache key]
   (phaser->clj
    (.getBitmapFont cache
                    (clj->phaser key)))))

(defn get-canvas
  "Gets a Canvas object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  object - The canvas object or `null` if no item could be found matching the given key."
  ([cache key]
   (phaser->clj
    (.getCanvas cache
                (clj->phaser key)))))

(defn get-frame
  "Get a single frame by key. You'd only do this to get the default Frame created for a non-atlas/spritesheet image.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Asset key of the frame data to retrieve from the Cache.
    * cache (integer) {optional} - The cache to search for the item in.

  Returns:  Phaser.Frame - The frame data."
  ([cache key]
   (phaser->clj
    (.getFrame cache
               (clj->phaser key))))
  ([cache key cache]
   (phaser->clj
    (.getFrame cache
               (clj->phaser key)
               (clj->phaser cache)))))

(defn get-frame-by-index
  "Get a single frame out of a frameData set by key.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Asset key of the frame data to retrieve from the Cache.
    * index (number) - The index of the frame you want to get.
    * cache (integer) {optional} - The cache to search. One of the Cache consts such as `Phaser.Cache.IMAGE` or `Phaser.Cache.SOUND`.

  Returns:  Phaser.Frame - The frame object."
  ([cache key index]
   (phaser->clj
    (.getFrameByIndex cache
                      (clj->phaser key)
                      (clj->phaser index))))
  ([cache key index cache]
   (phaser->clj
    (.getFrameByIndex cache
                      (clj->phaser key)
                      (clj->phaser index)
                      (clj->phaser cache)))))

(defn get-frame-by-name
  "Get a single frame out of a frameData set by key.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Asset key of the frame data to retrieve from the Cache.
    * name (string) - The name of the frame you want to get.
    * cache (integer) {optional} - The cache to search. One of the Cache consts such as `Phaser.Cache.IMAGE` or `Phaser.Cache.SOUND`.

  Returns:  Phaser.Frame - The frame object."
  ([cache key name]
   (phaser->clj
    (.getFrameByName cache
                     (clj->phaser key)
                     (clj->phaser name))))
  ([cache key name cache]
   (phaser->clj
    (.getFrameByName cache
                     (clj->phaser key)
                     (clj->phaser name)
                     (clj->phaser cache)))))

(defn get-frame-count
  "Get the total number of frames contained in the FrameData object specified by the given key.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Asset key of the FrameData you want.
    * cache (integer) {optional} - The cache to search for the item in.

  Returns:  number - Then number of frames. 0 if the image is not found."
  ([cache key]
   (phaser->clj
    (.getFrameCount cache
                    (clj->phaser key))))
  ([cache key cache]
   (phaser->clj
    (.getFrameCount cache
                    (clj->phaser key)
                    (clj->phaser cache)))))

(defn get-frame-data
  "Gets a Phaser.FrameData object from the Image Cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Asset key of the frame data to retrieve from the Cache.
    * cache (integer) {optional} - The cache to search for the item in.

  Returns:  Phaser.FrameData - The frame data."
  ([cache key]
   (phaser->clj
    (.getFrameData cache
                   (clj->phaser key))))
  ([cache key cache]
   (phaser->clj
    (.getFrameData cache
                   (clj->phaser key)
                   (clj->phaser cache)))))

(defn get-image
  "Gets a Image object from the cache. This returns a DOM Image object, not a Phaser.Image object.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Only the Image cache is searched, which covers images loaded via Loader.image, Sprite Sheets and Texture Atlases.

  If you need the image used by a bitmap font or similar then please use those respective 'get' methods.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) {optional} - The key of the asset to retrieve from the cache. If not given or null it will return a default image. If given but not found in the cache it will throw a warning and return the missing image.
    * full (boolean) {optional} - If true the full image object will be returned, if false just the HTML Image object is returned.

  Returns:  Image - The Image object if found in the Cache, otherwise `null`. If `full` was true then a JavaScript object is returned."
  ([cache]
   (phaser->clj
    (.getImage cache)))
  ([cache key]
   (phaser->clj
    (.getImage cache
               (clj->phaser key))))
  ([cache key full]
   (phaser->clj
    (.getImage cache
               (clj->phaser key)
               (clj->phaser full)))))

(defn get-item
  "Get an item from a cache based on the given key and property.

  This method is mostly used internally by other Cache methods such as `getImage` but is exposed
  publicly for your own use as well.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.
    * cache (integer) - The cache to search. One of the Cache consts such as `Phaser.Cache.IMAGE` or `Phaser.Cache.SOUND`.
    * method (string) {optional} - The string name of the method calling getItem. Can be empty, in which case no console warning is output.
    * property (string) {optional} - If you require a specific property from the cache item, specify it here.

  Returns:  object - The cached item if found, otherwise `null`. If the key is invalid and `method` is set then a console.warn is output."
  ([cache key cache]
   (phaser->clj
    (.getItem cache
              (clj->phaser key)
              (clj->phaser cache))))
  ([cache key cache method]
   (phaser->clj
    (.getItem cache
              (clj->phaser key)
              (clj->phaser cache)
              (clj->phaser method))))
  ([cache key cache method property]
   (phaser->clj
    (.getItem cache
              (clj->phaser key)
              (clj->phaser cache)
              (clj->phaser method)
              (clj->phaser property)))))

(defn get-json
  "Gets a JSON object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  You can either return the object by reference (the default), or return a clone
  of it by setting the `clone` argument to `true`.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.
    * clone (boolean) {optional} - Return a clone of the original object (true) or a reference to it? (false)

  Returns:  object - The JSON object."
  ([cache key]
   (phaser->clj
    (.getJSON cache
              (clj->phaser key))))
  ([cache key clone]
   (phaser->clj
    (.getJSON cache
              (clj->phaser key)
              (clj->phaser clone)))))

(defn get-keys
  "Gets all keys used in the requested Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * cache (integer) {optional} - The Cache you wish to get the keys from. Can be any of the Cache consts such as `Phaser.Cache.IMAGE`, `Phaser.Cache.SOUND` etc.

  Returns:  Array - The array of keys in the requested cache."
  ([cache]
   (phaser->clj
    (.getKeys cache)))
  ([cache cache]
   (phaser->clj
    (.getKeys cache
              (clj->phaser cache)))))

(defn get-physics-data
  "Gets a Physics Data object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  You can get either the entire data set, a single object or a single fixture of an object from it.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.
    * object (string) {optional} - If specified it will return just the physics object that is part of the given key, if null it will return them all.
    * fixture-key (string) - Fixture key of fixture inside an object. This key can be set per fixture with the Phaser Exporter.

  Returns:  object - The requested physics object data if found."
  ([cache key fixture-key]
   (phaser->clj
    (.getPhysicsData cache
                     (clj->phaser key)
                     (clj->phaser fixture-key))))
  ([cache key fixture-key object]
   (phaser->clj
    (.getPhysicsData cache
                     (clj->phaser key)
                     (clj->phaser fixture-key)
                     (clj->phaser object)))))

(defn get-pixi-base-texture
  "Gets a PIXI.BaseTexture by key from the PIXI.BaseTextureCache.

  If the texture isn't found in the cache, then it searches the Phaser Image Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Asset key of the BaseTexture to retrieve from the Cache.

  Returns:  PIXI.BaseTexture - The BaseTexture object or null if not found."
  ([cache key]
   (phaser->clj
    (.getPixiBaseTexture cache
                         (clj->phaser key)))))

(defn get-pixi-texture
  "Gets a PIXI.Texture by key from the PIXI.TextureCache.

  If the texture isn't found in the cache, then it searches the Phaser Image Cache and
  creates a new PIXI.Texture object which is then returned.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Asset key of the Texture to retrieve from the Cache.

  Returns:  PIXI.Texture - The Texture object."
  ([cache key]
   (phaser->clj
    (.getPixiTexture cache
                     (clj->phaser key)))))

(defn get-render-texture
  "Gets a RenderTexture object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  Phaser.RenderTexture - The RenderTexture object."
  ([cache key]
   (phaser->clj
    (.getRenderTexture cache
                       (clj->phaser key)))))

(defn get-shader
  "Gets a fragment shader object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  string - The shader object."
  ([cache key]
   (phaser->clj
    (.getShader cache
                (clj->phaser key)))))

(defn get-sound
  "Gets a Phaser.Sound object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  Phaser.Sound - The sound object."
  ([cache key]
   (phaser->clj
    (.getSound cache
               (clj->phaser key)))))

(defn get-sound-data
  "Gets a raw Sound data object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  object - The sound data."
  ([cache key]
   (phaser->clj
    (.getSoundData cache
                   (clj->phaser key)))))

(defn get-text
  "Gets a Text object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  object - The text data."
  ([cache key]
   (phaser->clj
    (.getText cache
              (clj->phaser key)))))

(defn get-texture-frame
  "Get a single texture frame by key.

  You'd only do this to get the default Frame created for a non-atlas / spritesheet image.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  Phaser.Frame - The frame data."
  ([cache key]
   (phaser->clj
    (.getTextureFrame cache
                      (clj->phaser key)))))

(defn get-tilemap-data
  "Gets a raw Tilemap data object from the cache. This will be in either CSV or JSON format.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  object - The raw tilemap data in CSV or JSON format."
  ([cache key]
   (phaser->clj
    (.getTilemapData cache
                     (clj->phaser key)))))

(defn get-url
  "Get a cached object by the URL.
  This only returns a value if you set Cache.autoResolveURL to `true` *before* starting the preload of any assets.
  Be aware that every call to this function makes a DOM src query, so use carefully and double-check for implications in your target browsers/devices.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * url (string) - The url for the object loaded to get from the cache.

  Returns:  object - The cached object."
  ([cache url]
   (phaser->clj
    (.getURL cache
             (clj->phaser url)))))

(defn get-video
  "Gets a Phaser.Video object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  Phaser.Video - The video object."
  ([cache key]
   (phaser->clj
    (.getVideo cache
               (clj->phaser key)))))

(defn get-xml
  "Gets an XML object from the cache.

  The object is looked-up based on the key given.

  Note: If the object cannot be found a `console.warn` message is displayed.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset to retrieve from the cache.

  Returns:  object - The XML object."
  ([cache key]
   (phaser->clj
    (.getXML cache
             (clj->phaser key)))))

(defn has-frame-data
  "Check if the FrameData for the given key exists in the Image Cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Asset key of the frame data to retrieve from the Cache.
    * cache (integer) {optional} - The cache to search for the item in.

  Returns:  boolean - True if the given key has frameData in the cache, otherwise false."
  ([cache key]
   (phaser->clj
    (.hasFrameData cache
                   (clj->phaser key))))
  ([cache key cache]
   (phaser->clj
    (.hasFrameData cache
                   (clj->phaser key)
                   (clj->phaser cache)))))

(defn is-sound-decoded
  "Check if the given sound has finished decoding.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - The decoded state of the Sound object."
  ([cache key]
   (phaser->clj
    (.isSoundDecoded cache
                     (clj->phaser key)))))

(defn is-sound-ready
  "Check if the given sound is ready for playback.
  A sound is considered ready when it has finished decoding and the device is no longer touch locked.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache.

  Returns:  boolean - True if the sound is decoded and the device is not touch locked."
  ([cache key]
   (phaser->clj
    (.isSoundReady cache
                   (clj->phaser key)))))

(defn reload-sound
  "Reload a Sound file from the server.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache."
  ([cache key]
   (phaser->clj
    (.reloadSound cache
                  (clj->phaser key)))))

(defn reload-sound-complete
  "Fires the onSoundUnlock event when the sound has completed reloading.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache."
  ([cache key]
   (phaser->clj
    (.reloadSoundComplete cache
                          (clj->phaser key)))))

(defn remove-binary
  "Removes a binary file from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeBinary cache
                   (clj->phaser key)))))

(defn remove-bitmap-data
  "Removes a bitmap data from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeBitmapData cache
                       (clj->phaser key)))))

(defn remove-bitmap-font
  "Removes a bitmap font from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeBitmapFont cache
                       (clj->phaser key)))))

(defn remove-canvas
  "Removes a canvas from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeCanvas cache
                   (clj->phaser key)))))

(defn remove-image
  "Removes an image from the cache.

  You can optionally elect to destroy it as well. This calls BaseTexture.destroy on it.

  Note that this only removes it from the Phaser and PIXI Caches. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove.
    * remove-from-pixi (boolean) {optional} - Should this image also be destroyed? Removing it from the PIXI.BaseTextureCache?"
  ([cache key]
   (phaser->clj
    (.removeImage cache
                  (clj->phaser key))))
  ([cache key remove-from-pixi]
   (phaser->clj
    (.removeImage cache
                  (clj->phaser key)
                  (clj->phaser remove-from-pixi)))))

(defn remove-json
  "Removes a json object from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeJSON cache
                 (clj->phaser key)))))

(defn remove-physics
  "Removes a physics data file from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removePhysics cache
                    (clj->phaser key)))))

(defn remove-render-texture
  "Removes a Render Texture from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeRenderTexture cache
                          (clj->phaser key)))))

(defn remove-shader
  "Removes a shader from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeShader cache
                   (clj->phaser key)))))

(defn remove-sound
  "Removes a sound from the cache.

  If any `Phaser.Sound` objects use the audio file in the cache that you remove with this method, they will
  _automatically_ destroy themselves. If you wish to have full control over when Sounds are destroyed then
  you must finish your house-keeping and destroy them all yourself first, before calling this method.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeSound cache
                  (clj->phaser key)))))

(defn remove-sprite-sheet
  "Removes a Sprite Sheet from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeSpriteSheet cache
                        (clj->phaser key)))))

(defn remove-text
  "Removes a text file from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeText cache
                 (clj->phaser key)))))

(defn remove-texture-atlas
  "Removes a Texture Atlas from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeTextureAtlas cache
                         (clj->phaser key)))))

(defn remove-tilemap
  "Removes a tilemap from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeTilemap cache
                    (clj->phaser key)))))

(defn remove-video
  "Removes a video from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeVideo cache
                  (clj->phaser key)))))

(defn remove-xml
  "Removes a xml object from the cache.

  Note that this only removes it from the Phaser.Cache. If you still have references to the data elsewhere
  then it will persist in memory.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - Key of the asset you want to remove."
  ([cache key]
   (phaser->clj
    (.removeXML cache
                (clj->phaser key)))))

(defn update-frame-data
  "Replaces a set of frameData with a new Phaser.FrameData object.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The unique key by which you will reference this object.
    * frame-data (number) - The new FrameData.
    * cache (integer) {optional} - The cache to search. One of the Cache consts such as `Phaser.Cache.IMAGE` or `Phaser.Cache.SOUND`."
  ([cache key frame-data]
   (phaser->clj
    (.updateFrameData cache
                      (clj->phaser key)
                      (clj->phaser frame-data))))
  ([cache key frame-data cache]
   (phaser->clj
    (.updateFrameData cache
                      (clj->phaser key)
                      (clj->phaser frame-data)
                      (clj->phaser cache)))))

(defn update-sound
  "Updates the sound object in the cache.

  Parameters:
    * cache (Phaser.Cache) - Targeted instance for method
    * key (string) - The key of the asset within the cache."
  ([cache key]
   (phaser->clj
    (.updateSound cache
                  (clj->phaser key)))))