(ns phzr.loader
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Loader
  "The Loader handles loading all external content such as Images, Sounds, Texture Atlases and data files.

  The loader uses a combination of tag loading (eg. Image elements) and XHR and provides progress and completion callbacks.

  Parallel loading (see {@link Phaser.Loader#enableParallel enableParallel}) is supported and enabled by default.
  Load-before behavior of parallel resources is controlled by synchronization points as discussed in {@link Phaser.Loader#withSyncPoint withSyncPoint}.

  Texture Atlases can be created with tools such as [Texture Packer](https://www.codeandweb.com/texturepacker/phaser) and
  [Shoebox](http://renderhjs.net/shoebox/)

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Loader. (clj->phaser game))))

(defn add-sync-point
  "Add a synchronization point to a specific file/asset in the load queue.

  This has no effect on already loaded assets.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * type (string) - The type of resource to turn into a sync point (image, audio, xml, etc).
    * key (string) - Key of the file you want to turn into a sync point.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader type key]
   (phaser->clj
    (.addSyncPoint loader
                   (clj->phaser type)
                   (clj->phaser key)))))

(defn atlas
  "Adds a Texture Atlas file to the current load queue.

  To create the Texture Atlas you can use tools such as:

  [Texture Packer](https://www.codeandweb.com/texturepacker/phaser)
  [Shoebox](http://renderhjs.net/shoebox/)

  If using Texture Packer we recommend you enable 'Trim sprite names'.
  If your atlas software has an option to 'rotate' the resulting frames, you must disable it.

  You can choose to either load the data externally, by providing a URL to a json file.
  Or you can pass in a JSON object or String via the `atlasData` parameter.
  If you pass a String the data is automatically run through `JSON.parse` and then immediately added to the Phaser.Cache.

  If URLs are provided the files are **not** loaded immediately after calling this method, but are added to the load queue.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getImage(key)`. JSON files are automatically parsed upon load.
  If you need to control when the JSON is parsed then use `Loader.text` instead and parse the JSON file as needed.

  The URLs can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the textureURL isn't specified then the Loader will take the key and create a filename from that.
  For example if the key is 'player' and textureURL is null then the Loader will set the URL to be 'player.png'.
  The same is true for the atlasURL. If atlasURL isn't specified and no atlasData has been provided then the Loader will
  set the atlasURL to be the key. For example if the key is 'player' the atlasURL will be set to 'player.json'.

  If you do not desire this action then provide URLs and / or a data object.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the texture atlas file.
    * texture-url (string) {optional} - URL of the texture atlas image file. If undefined or `null` the url will be set to `<key>.png`, i.e. if `key` was 'alien' then the URL will be 'alien.png'.
    * atlas-url (string) {optional} - URL of the texture atlas data file. If undefined or `null` and no atlasData is given, the url will be set to `<key>.json`, i.e. if `key` was 'alien' then the URL will be 'alien.json'.
    * atlas-data (object) {optional} - A JSON or XML data object. You don't need this if the data is being loaded from a URL.
    * format (number) {optional} - The format of the data. Can be Phaser.Loader.TEXTURE_ATLAS_JSON_ARRAY (the default), Phaser.Loader.TEXTURE_ATLAS_JSON_HASH or Phaser.Loader.TEXTURE_ATLAS_XML_STARLING.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.atlas loader
            (clj->phaser key))))
  ([loader key texture-url]
   (phaser->clj
    (.atlas loader
            (clj->phaser key)
            (clj->phaser texture-url))))
  ([loader key texture-url atlas-url]
   (phaser->clj
    (.atlas loader
            (clj->phaser key)
            (clj->phaser texture-url)
            (clj->phaser atlas-url))))
  ([loader key texture-url atlas-url atlas-data]
   (phaser->clj
    (.atlas loader
            (clj->phaser key)
            (clj->phaser texture-url)
            (clj->phaser atlas-url)
            (clj->phaser atlas-data))))
  ([loader key texture-url atlas-url atlas-data format]
   (phaser->clj
    (.atlas loader
            (clj->phaser key)
            (clj->phaser texture-url)
            (clj->phaser atlas-url)
            (clj->phaser atlas-data)
            (clj->phaser format)))))

(defn atlas-json-array
  "Adds a Texture Atlas file to the current load queue.

  Unlike `Loader.atlasJSONHash` this call expects the atlas data to be in a JSON Array format.

  To create the Texture Atlas you can use tools such as:

  [Texture Packer](https://www.codeandweb.com/texturepacker/phaser)
  [Shoebox](http://renderhjs.net/shoebox/)

  If using Texture Packer we recommend you enable 'Trim sprite names'.
  If your atlas software has an option to 'rotate' the resulting frames, you must disable it.

  You can choose to either load the data externally, by providing a URL to a json file.
  Or you can pass in a JSON object or String via the `atlasData` parameter.
  If you pass a String the data is automatically run through `JSON.parse` and then immediately added to the Phaser.Cache.

  If URLs are provided the files are **not** loaded immediately after calling this method, but are added to the load queue.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getImage(key)`. JSON files are automatically parsed upon load.
  If you need to control when the JSON is parsed then use `Loader.text` instead and parse the JSON file as needed.

  The URLs can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the textureURL isn't specified then the Loader will take the key and create a filename from that.
  For example if the key is 'player' and textureURL is null then the Loader will set the URL to be 'player.png'.
  The same is true for the atlasURL. If atlasURL isn't specified and no atlasData has been provided then the Loader will
  set the atlasURL to be the key. For example if the key is 'player' the atlasURL will be set to 'player.json'.

  If you do not desire this action then provide URLs and / or a data object.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the texture atlas file.
    * texture-url (string) {optional} - URL of the texture atlas image file. If undefined or `null` the url will be set to `<key>.png`, i.e. if `key` was 'alien' then the URL will be 'alien.png'.
    * atlas-url (string) {optional} - URL of the texture atlas data file. If undefined or `null` and no atlasData is given, the url will be set to `<key>.json`, i.e. if `key` was 'alien' then the URL will be 'alien.json'.
    * atlas-data (object) {optional} - A JSON data object. You don't need this if the data is being loaded from a URL.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.atlasJSONArray loader
                     (clj->phaser key))))
  ([loader key texture-url]
   (phaser->clj
    (.atlasJSONArray loader
                     (clj->phaser key)
                     (clj->phaser texture-url))))
  ([loader key texture-url atlas-url]
   (phaser->clj
    (.atlasJSONArray loader
                     (clj->phaser key)
                     (clj->phaser texture-url)
                     (clj->phaser atlas-url))))
  ([loader key texture-url atlas-url atlas-data]
   (phaser->clj
    (.atlasJSONArray loader
                     (clj->phaser key)
                     (clj->phaser texture-url)
                     (clj->phaser atlas-url)
                     (clj->phaser atlas-data)))))

(defn atlas-json-hash
  "Adds a Texture Atlas file to the current load queue.

  Unlike `Loader.atlas` this call expects the atlas data to be in a JSON Hash format.

  To create the Texture Atlas you can use tools such as:

  [Texture Packer](https://www.codeandweb.com/texturepacker/phaser)
  [Shoebox](http://renderhjs.net/shoebox/)

  If using Texture Packer we recommend you enable 'Trim sprite names'.
  If your atlas software has an option to 'rotate' the resulting frames, you must disable it.

  You can choose to either load the data externally, by providing a URL to a json file.
  Or you can pass in a JSON object or String via the `atlasData` parameter.
  If you pass a String the data is automatically run through `JSON.parse` and then immediately added to the Phaser.Cache.

  If URLs are provided the files are **not** loaded immediately after calling this method, but are added to the load queue.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getImage(key)`. JSON files are automatically parsed upon load.
  If you need to control when the JSON is parsed then use `Loader.text` instead and parse the JSON file as needed.

  The URLs can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the textureURL isn't specified then the Loader will take the key and create a filename from that.
  For example if the key is 'player' and textureURL is null then the Loader will set the URL to be 'player.png'.
  The same is true for the atlasURL. If atlasURL isn't specified and no atlasData has been provided then the Loader will
  set the atlasURL to be the key. For example if the key is 'player' the atlasURL will be set to 'player.json'.

  If you do not desire this action then provide URLs and / or a data object.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the texture atlas file.
    * texture-url (string) {optional} - URL of the texture atlas image file. If undefined or `null` the url will be set to `<key>.png`, i.e. if `key` was 'alien' then the URL will be 'alien.png'.
    * atlas-url (string) {optional} - URL of the texture atlas data file. If undefined or `null` and no atlasData is given, the url will be set to `<key>.json`, i.e. if `key` was 'alien' then the URL will be 'alien.json'.
    * atlas-data (object) {optional} - A JSON data object. You don't need this if the data is being loaded from a URL.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.atlasJSONHash loader
                    (clj->phaser key))))
  ([loader key texture-url]
   (phaser->clj
    (.atlasJSONHash loader
                    (clj->phaser key)
                    (clj->phaser texture-url))))
  ([loader key texture-url atlas-url]
   (phaser->clj
    (.atlasJSONHash loader
                    (clj->phaser key)
                    (clj->phaser texture-url)
                    (clj->phaser atlas-url))))
  ([loader key texture-url atlas-url atlas-data]
   (phaser->clj
    (.atlasJSONHash loader
                    (clj->phaser key)
                    (clj->phaser texture-url)
                    (clj->phaser atlas-url)
                    (clj->phaser atlas-data)))))

(defn atlas-xml
  "Adds a Texture Atlas file to the current load queue.

  This call expects the atlas data to be in the Starling XML data format.

  To create the Texture Atlas you can use tools such as:

  [Texture Packer](https://www.codeandweb.com/texturepacker/phaser)
  [Shoebox](http://renderhjs.net/shoebox/)

  If using Texture Packer we recommend you enable 'Trim sprite names'.
  If your atlas software has an option to 'rotate' the resulting frames, you must disable it.

  You can choose to either load the data externally, by providing a URL to an xml file.
  Or you can pass in an XML object or String via the `atlasData` parameter.
  If you pass a String the data is automatically run through `Loader.parseXML` and then immediately added to the Phaser.Cache.

  If URLs are provided the files are **not** loaded immediately after calling this method, but are added to the load queue.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getImage(key)`. XML files are automatically parsed upon load.
  If you need to control when the XML is parsed then use `Loader.text` instead and parse the XML file as needed.

  The URLs can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the textureURL isn't specified then the Loader will take the key and create a filename from that.
  For example if the key is 'player' and textureURL is null then the Loader will set the URL to be 'player.png'.
  The same is true for the atlasURL. If atlasURL isn't specified and no atlasData has been provided then the Loader will
  set the atlasURL to be the key. For example if the key is 'player' the atlasURL will be set to 'player.xml'.

  If you do not desire this action then provide URLs and / or a data object.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the texture atlas file.
    * texture-url (string) {optional} - URL of the texture atlas image file. If undefined or `null` the url will be set to `<key>.png`, i.e. if `key` was 'alien' then the URL will be 'alien.png'.
    * atlas-url (string) {optional} - URL of the texture atlas data file. If undefined or `null` and no atlasData is given, the url will be set to `<key>.json`, i.e. if `key` was 'alien' then the URL will be 'alien.xml'.
    * atlas-data (object) {optional} - An XML data object. You don't need this if the data is being loaded from a URL.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.atlasXML loader
               (clj->phaser key))))
  ([loader key texture-url]
   (phaser->clj
    (.atlasXML loader
               (clj->phaser key)
               (clj->phaser texture-url))))
  ([loader key texture-url atlas-url]
   (phaser->clj
    (.atlasXML loader
               (clj->phaser key)
               (clj->phaser texture-url)
               (clj->phaser atlas-url))))
  ([loader key texture-url atlas-url atlas-data]
   (phaser->clj
    (.atlasXML loader
               (clj->phaser key)
               (clj->phaser texture-url)
               (clj->phaser atlas-url)
               (clj->phaser atlas-data)))))

(defn audio
  "Adds an audio file to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getSound(key)`.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  Mobile warning: There are some mobile devices (certain iPad 2 and iPad Mini revisions) that cannot play 48000 Hz audio.
  When they try to play the audio becomes extremely distorted and buzzes, eventually crashing the sound system.
  The solution is to use a lower encoding rate such as 44100 Hz.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the audio file.
    * urls (string | Array.<string> | Array.<object>) - Either a single string or an array of URIs or pairs of `{uri: .., type: ..}`.
   If an array is specified then the first URI (or URI + mime pair) that is device-compatible will be selected.
   For example: `'jump.mp3'`, `['jump.mp3', 'jump.ogg', 'jump.m4a']`, or `[{uri: 'data:<opus_resource>', type: 'opus'}, 'fallback.mp3']`.
   BLOB and DATA URIs can be used but only support automatic detection when used in the pair form; otherwise the format must be manually checked before adding the resource.
    * auto-decode (boolean) {optional} - When using Web Audio the audio files can either be decoded at load time or run-time.
   Audio files can't be played until they are decoded and, if specified, this enables immediate decoding. Decoding is a non-blocking async process, however it consumes huge amounts of CPU time on mobiles especially.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key urls]
   (phaser->clj
    (.audio loader
            (clj->phaser key)
            (clj->phaser urls))))
  ([loader key urls auto-decode]
   (phaser->clj
    (.audio loader
            (clj->phaser key)
            (clj->phaser urls)
            (clj->phaser auto-decode)))))

(defn audiosprite
  "Adds an audio sprite file to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Audio Sprites are a combination of audio files and a JSON configuration.

  The JSON follows the format of that created by https://github.com/tonistiigi/audiosprite

  Retrieve the file via `Cache.getSoundData(key)`.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the audio file.
    * urls (Array | string) - An array containing the URLs of the audio files, i.e.: [ 'audiosprite.mp3', 'audiosprite.ogg', 'audiosprite.m4a' ] or a single string containing just one URL.
    * json-url (string) {optional} - The URL of the audiosprite configuration JSON object. If you wish to pass the data directly set this parameter to null.
    * json-data (string | object) {optional} - A JSON object or string containing the audiosprite configuration data. This is ignored if jsonURL is not null.
    * auto-decode (boolean) {optional} - When using Web Audio the audio files can either be decoded at load time or run-time.
   Audio files can't be played until they are decoded and, if specified, this enables immediate decoding. Decoding is a non-blocking async process, however it consumes huge amounts of CPU time on mobiles especially.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key urls]
   (phaser->clj
    (.audiosprite loader
                  (clj->phaser key)
                  (clj->phaser urls))))
  ([loader key urls json-url]
   (phaser->clj
    (.audiosprite loader
                  (clj->phaser key)
                  (clj->phaser urls)
                  (clj->phaser json-url))))
  ([loader key urls json-url json-data]
   (phaser->clj
    (.audiosprite loader
                  (clj->phaser key)
                  (clj->phaser urls)
                  (clj->phaser json-url)
                  (clj->phaser json-data))))
  ([loader key urls json-url json-data auto-decode]
   (phaser->clj
    (.audiosprite loader
                  (clj->phaser key)
                  (clj->phaser urls)
                  (clj->phaser json-url)
                  (clj->phaser json-data)
                  (clj->phaser auto-decode)))))

(defn binary
  "Adds a binary file to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getBinary(key)`.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is 'alien'
  and no URL is given then the Loader will set the URL to be 'alien.bin'. It will always add `.bin` as the extension.
  If you do not desire this action then provide a URL.

  It will be loaded via xhr with a responseType of 'arraybuffer'. You can specify an optional callback to process the file after load.
  When the callback is called it will be passed 2 parameters: the key of the file and the file data.

  WARNING: If a callback is specified the data will be set to whatever it returns. Always return the data object, even if you didn't modify it.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the binary file.
    * url (string) {optional} - URL of the binary file. If undefined or `null` the url will be set to `<key>.bin`, i.e. if `key` was 'alien' then the URL will be 'alien.bin'.
    * callback (function) {optional} - Optional callback that will be passed the file after loading, so you can perform additional processing on it.
    * callback-context (object) {optional} - The context under which the callback will be applied. If not specified it will use the callback itself as the context.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.binary loader
             (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.binary loader
             (clj->phaser key)
             (clj->phaser url))))
  ([loader key url callback]
   (phaser->clj
    (.binary loader
             (clj->phaser key)
             (clj->phaser url)
             (clj->phaser callback))))
  ([loader key url callback callback-context]
   (phaser->clj
    (.binary loader
             (clj->phaser key)
             (clj->phaser url)
             (clj->phaser callback)
             (clj->phaser callback-context)))))

(defn bitmap-font
  "Adds Bitmap Font files to the current load queue.

  To create the Bitmap Font files you can use:

  BMFont (Windows, free): http://www.angelcode.com/products/bmfont/
  Glyph Designer (OS X, commercial): http://www.71squared.com/en/glyphdesigner
  Littera (Web-based, free): http://kvazars.com/littera/

  You can choose to either load the data externally, by providing a URL to an xml file.
  Or you can pass in an XML object or String via the `xmlData` parameter.
  If you pass a String the data is automatically run through `Loader.parseXML` and then immediately added to the Phaser.Cache.

  If URLs are provided the files are **not** loaded immediately after calling this method, but are added to the load queue.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getBitmapFont(key)`. XML files are automatically parsed upon load.
  If you need to control when the XML is parsed then use `Loader.text` instead and parse the XML file as needed.

  The URLs can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the textureURL isn't specified then the Loader will take the key and create a filename from that.
  For example if the key is 'megaFont' and textureURL is null then the Loader will set the URL to be 'megaFont.png'.
  The same is true for the xmlURL. If xmlURL isn't specified and no xmlData has been provided then the Loader will
  set the xmlURL to be the key. For example if the key is 'megaFont' the xmlURL will be set to 'megaFont.xml'.

  If you do not desire this action then provide URLs and / or a data object.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the bitmap font.
    * texture-url (string) - URL of the Bitmap Font texture file. If undefined or `null` the url will be set to `<key>.png`, i.e. if `key` was 'megaFont' then the URL will be 'megaFont.png'.
    * atlas-url (string) - URL of the Bitmap Font atlas file (xml/json).
    * atlas-data (object) - An optional Bitmap Font atlas in string form (stringified xml/json).
    * x-spacing (number) {optional} - If you'd like to add additional horizontal spacing between the characters then set the pixel value here.
    * y-spacing (number) {optional} - If you'd like to add additional vertical spacing between the lines then set the pixel value here.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key texture-url atlas-url atlas-data]
   (phaser->clj
    (.bitmapFont loader
                 (clj->phaser key)
                 (clj->phaser texture-url)
                 (clj->phaser atlas-url)
                 (clj->phaser atlas-data))))
  ([loader key texture-url atlas-url atlas-data x-spacing]
   (phaser->clj
    (.bitmapFont loader
                 (clj->phaser key)
                 (clj->phaser texture-url)
                 (clj->phaser atlas-url)
                 (clj->phaser atlas-data)
                 (clj->phaser x-spacing))))
  ([loader key texture-url atlas-url atlas-data x-spacing y-spacing]
   (phaser->clj
    (.bitmapFont loader
                 (clj->phaser key)
                 (clj->phaser texture-url)
                 (clj->phaser atlas-url)
                 (clj->phaser atlas-data)
                 (clj->phaser x-spacing)
                 (clj->phaser y-spacing)))))

(defn check-key-exists
  "Check whether a file/asset with a specific key is queued to be loaded.

  To access a loaded asset use Phaser.Cache, eg. {@link Phaser.Cache#checkImageKey}

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * type (string) - The type asset you want to check.
    * key (string) - Key of the asset you want to check.

  Returns:  boolean - Return true if exists, otherwise return false."
  ([loader type key]
   (phaser->clj
    (.checkKeyExists loader
                     (clj->phaser type)
                     (clj->phaser key)))))

(defn get-asset
  "Find a file/asset with a specific key.

  Only assets in the download file queue will be found.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * type (string) - The type asset you want to check.
    * key (string) - Key of the asset you want to check.

  Returns:  any - Returns an object if found that has 2 properties: `index` and `file`; otherwise a non-true value is returned.
    The index may change and should only be used immediately following this call."
  ([loader type key]
   (phaser->clj
    (.getAsset loader
               (clj->phaser type)
               (clj->phaser key)))))

(defn get-asset-index
  "Get the queue-index of the file/asset with a specific key.

  Only assets in the download file queue will be found.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * type (string) - The type asset you want to check.
    * key (string) - Key of the asset you want to check.

  Returns:  number - The index of this key in the filelist, or -1 if not found.
    The index may change and should only be used immediately following this call"
  ([loader type key]
   (phaser->clj
    (.getAssetIndex loader
                    (clj->phaser type)
                    (clj->phaser key)))))

(defn image
  "Adds an Image to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the image via `Cache.getImage(key)`

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is 'alien'
  and no URL is given then the Loader will set the URL to be 'alien.png'. It will always add `.png` as the extension.
  If you do not desire this action then provide a URL.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of this image file.
    * url (string) {optional} - URL of an image file. If undefined or `null` the url will be set to `<key>.png`, i.e. if `key` was 'alien' then the URL will be 'alien.png'.
    * overwrite (boolean) {optional} - If an unloaded file with a matching key already exists in the queue, this entry will overwrite it.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.image loader
            (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.image loader
            (clj->phaser key)
            (clj->phaser url))))
  ([loader key url overwrite]
   (phaser->clj
    (.image loader
            (clj->phaser key)
            (clj->phaser url)
            (clj->phaser overwrite)))))

(defn json
  "Adds a JSON file to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getJSON(key)`. JSON files are automatically parsed upon load.
  If you need to control when the JSON is parsed then use `Loader.text` instead and parse the text file as needed.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is 'alien'
  and no URL is given then the Loader will set the URL to be 'alien.json'. It will always add `.json` as the extension.
  If you do not desire this action then provide a URL.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the json file.
    * url (string) {optional} - URL of the JSON file. If undefined or `null` the url will be set to `<key>.json`, i.e. if `key` was 'alien' then the URL will be 'alien.json'.
    * overwrite (boolean) {optional} - If an unloaded file with a matching key already exists in the queue, this entry will overwrite it.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.json loader
           (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.json loader
           (clj->phaser key)
           (clj->phaser url))))
  ([loader key url overwrite]
   (phaser->clj
    (.json loader
           (clj->phaser key)
           (clj->phaser url)
           (clj->phaser overwrite)))))

(defn pack
  "Add a JSON resource pack ('packfile') to the Loader.

  A packfile is a JSON file that contains a list of assets to the be loaded.
  Please see the example 'loader/asset pack' in the Phaser Examples repository.

  Packs are always put before the first non-pack file that is not loaded / loading.

  This means that all packs added before any loading has started are added to the front
  of the file queue, in the order added.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  The URL of the packfile can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of this resource pack.
    * url (string) {optional} - URL of the Asset Pack JSON file. If you wish to pass a json object instead set this to null and pass the object as the data parameter.
    * data (object) {optional} - The Asset Pack JSON data. Use this to pass in a json data object rather than loading it from a URL. TODO
    * callback-context (object) {optional} - Some Loader operations, like Binary and Script require a context for their callbacks. Pass the context here.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.pack loader
           (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.pack loader
           (clj->phaser key)
           (clj->phaser url))))
  ([loader key url data]
   (phaser->clj
    (.pack loader
           (clj->phaser key)
           (clj->phaser url)
           (clj->phaser data))))
  ([loader key url data callback-context]
   (phaser->clj
    (.pack loader
           (clj->phaser key)
           (clj->phaser url)
           (clj->phaser data)
           (clj->phaser callback-context)))))

(defn physics
  "Adds a physics data file to the current load queue.

  The data must be in `Lime + Corona` JSON format. [Physics Editor](https://www.codeandweb.com) by code'n'web exports in this format natively.

  You can choose to either load the data externally, by providing a URL to a json file.
  Or you can pass in a JSON object or String via the `data` parameter.
  If you pass a String the data is automatically run through `JSON.parse` and then immediately added to the Phaser.Cache.

  If a URL is provided the file is **not** loaded immediately after calling this method, but is added to the load queue.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getJSON(key)`. JSON files are automatically parsed upon load.
  If you need to control when the JSON is parsed then use `Loader.text` instead and parse the text file as needed.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified and no data is given then the Loader will take the key and create a filename from that.
  For example if the key is 'alien' and no URL or data is given then the Loader will set the URL to be 'alien.json'.
  It will always use `.json` as the extension.

  If you do not desire this action then provide a URL or data object.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the physics json data.
    * url (string) {optional} - URL of the physics data file. If undefined or `null` and no data is given the url will be set to `<key>.json`, i.e. if `key` was 'alien' then the URL will be 'alien.json'.
    * data (object | string) {optional} - An optional JSON data object. If given then the url is ignored and this JSON object is used for physics data instead.
    * format (string) {optional} - The format of the physics data.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.physics loader
              (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.physics loader
              (clj->phaser key)
              (clj->phaser url))))
  ([loader key url data]
   (phaser->clj
    (.physics loader
              (clj->phaser key)
              (clj->phaser url)
              (clj->phaser data))))
  ([loader key url data format]
   (phaser->clj
    (.physics loader
              (clj->phaser key)
              (clj->phaser url)
              (clj->phaser data)
              (clj->phaser format)))))

(defn script
  "Adds a JavaScript file to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  The key must be a unique String.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is 'alien'
  and no URL is given then the Loader will set the URL to be 'alien.js'. It will always add `.js` as the extension.
  If you do not desire this action then provide a URL.

  Upon successful load the JavaScript is automatically turned into a script tag and executed, so be careful what you load!

  A callback, which will be invoked as the script tag has been created, can also be specified.
  The callback must return relevant `data`.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the script file.
    * url (string) {optional} - URL of the JavaScript file. If undefined or `null` the url will be set to `<key>.js`, i.e. if `key` was 'alien' then the URL will be 'alien.js'.
    * callback (function) {optional} - Optional callback that will be called after the script tag has loaded, so you can perform additional processing.
    * callback-context (object) {optional} - The context under which the callback will be applied. If not specified it will use the Phaser Loader as the context.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.script loader
             (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.script loader
             (clj->phaser key)
             (clj->phaser url))))
  ([loader key url callback]
   (phaser->clj
    (.script loader
             (clj->phaser key)
             (clj->phaser url)
             (clj->phaser callback))))
  ([loader key url callback callback-context]
   (phaser->clj
    (.script loader
             (clj->phaser key)
             (clj->phaser url)
             (clj->phaser callback)
             (clj->phaser callback-context)))))

(defn set-preload-sprite
  "Set a Sprite to be a 'preload' sprite by passing it to this method.

  A 'preload' sprite will have its width or height crop adjusted based on the percentage of the loader in real-time.
  This allows you to easily make loading bars for games.

  The sprite will automatically be made visible when calling this.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * sprite (Phaser.Sprite | Phaser.Image) - The sprite or image that will be cropped during the load.
    * direction (number) {optional} - A value of zero means the sprite will be cropped horizontally, a value of 1 means its will be cropped vertically."
  ([loader sprite]
   (phaser->clj
    (.setPreloadSprite loader
                       (clj->phaser sprite))))
  ([loader sprite direction]
   (phaser->clj
    (.setPreloadSprite loader
                       (clj->phaser sprite)
                       (clj->phaser direction)))))

(defn shader
  "Adds a fragment shader file to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getShader(key)`.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is 'blur'
  and no URL is given then the Loader will set the URL to be 'blur.frag'. It will always add `.frag` as the extension.
  If you do not desire this action then provide a URL.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the fragment file.
    * url (string) {optional} - URL of the fragment file. If undefined or `null` the url will be set to `<key>.frag`, i.e. if `key` was 'blur' then the URL will be 'blur.frag'.
    * overwrite (boolean) {optional} - If an unloaded file with a matching key already exists in the queue, this entry will overwrite it.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.shader loader
             (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.shader loader
             (clj->phaser key)
             (clj->phaser url))))
  ([loader key url overwrite]
   (phaser->clj
    (.shader loader
             (clj->phaser key)
             (clj->phaser url)
             (clj->phaser overwrite)))))

(defn spritesheet
  "Adds a Sprite Sheet to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  To clarify the terminology that Phaser uses: A Sprite Sheet is an image containing frames, usually of an animation, that are all equal
  dimensions and often in sequence. For example if the frame size is 32x32 then every frame in the sprite sheet will be that size. 
  Sometimes (outside of Phaser) the term 'sprite sheet' is used to refer to a texture atlas.
  A Texture Atlas works by packing together images as best it can, using whatever frame sizes it likes, often with cropping and trimming
  the frames in the process. Software such as Texture Packer, Flash CC or Shoebox all generate texture atlases, not sprite sheets.
  If you've got an atlas then use `Loader.atlas` instead.

  The key must be a unique String. It is used to add the image to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getImage(key)`. Sprite sheets, being image based, live in the same Cache as all other Images.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is 'alien'
  and no URL is given then the Loader will set the URL to be 'alien.png'. It will always add `.png` as the extension.
  If you do not desire this action then provide a URL.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the sheet file.
    * url (string) - URL of the sprite sheet file. If undefined or `null` the url will be set to `<key>.png`, i.e. if `key` was 'alien' then the URL will be 'alien.png'.
    * frame-width (number) - Width in pixels of a single frame in the sprite sheet.
    * frame-height (number) - Height in pixels of a single frame in the sprite sheet.
    * frame-max (number) {optional} - How many frames in this sprite sheet. If not specified it will divide the whole image into frames.
    * margin (number) {optional} - If the frames have been drawn with a margin, specify the amount here.
    * spacing (number) {optional} - If the frames have been drawn with spacing between them, specify the amount here.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key url frame-width frame-height]
   (phaser->clj
    (.spritesheet loader
                  (clj->phaser key)
                  (clj->phaser url)
                  (clj->phaser frame-width)
                  (clj->phaser frame-height))))
  ([loader key url frame-width frame-height frame-max]
   (phaser->clj
    (.spritesheet loader
                  (clj->phaser key)
                  (clj->phaser url)
                  (clj->phaser frame-width)
                  (clj->phaser frame-height)
                  (clj->phaser frame-max))))
  ([loader key url frame-width frame-height frame-max margin]
   (phaser->clj
    (.spritesheet loader
                  (clj->phaser key)
                  (clj->phaser url)
                  (clj->phaser frame-width)
                  (clj->phaser frame-height)
                  (clj->phaser frame-max)
                  (clj->phaser margin))))
  ([loader key url frame-width frame-height frame-max margin spacing]
   (phaser->clj
    (.spritesheet loader
                  (clj->phaser key)
                  (clj->phaser url)
                  (clj->phaser frame-width)
                  (clj->phaser frame-height)
                  (clj->phaser frame-max)
                  (clj->phaser margin)
                  (clj->phaser spacing)))))

(defn start
  "Start loading the assets. Normally you don't need to call this yourself as the StateManager will do so."
  ([loader]
   (phaser->clj
    (.start loader))))

(defn text
  "Adds a Text file to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getText(key)`

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is 'alien'
  and no URL is given then the Loader will set the URL to be 'alien.txt'. It will always add `.txt` as the extension.
  If you do not desire this action then provide a URL.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the text file.
    * url (string) {optional} - URL of the text file. If undefined or `null` the url will be set to `<key>.txt`, i.e. if `key` was 'alien' then the URL will be 'alien.txt'.
    * overwrite (boolean) {optional} - If an unloaded file with a matching key already exists in the queue, this entry will overwrite it.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.text loader
           (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.text loader
           (clj->phaser key)
           (clj->phaser url))))
  ([loader key url overwrite]
   (phaser->clj
    (.text loader
           (clj->phaser key)
           (clj->phaser url)
           (clj->phaser overwrite)))))

(defn tilemap
  "Adds a Tile Map data file to the current load queue.

  You can choose to either load the data externally, by providing a URL to a json file.
  Or you can pass in a JSON object or String via the `data` parameter.
  If you pass a String the data is automatically run through `JSON.parse` and then immediately added to the Phaser.Cache.

  If a URL is provided the file is **not** loaded immediately after calling this method, but is added to the load queue.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getTilemapData(key)`. JSON files are automatically parsed upon load.
  If you need to control when the JSON is parsed then use `Loader.text` instead and parse the text file as needed.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified and no data is given then the Loader will take the key and create a filename from that.
  For example if the key is 'level1' and no URL or data is given then the Loader will set the URL to be 'level1.json'.
  If you set the format to be Tilemap.CSV it will set the URL to be 'level1.csv' instead.

  If you do not desire this action then provide a URL or data object.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the tilemap data.
    * url (string) {optional} - URL of the tile map file. If undefined or `null` and no data is given the url will be set to `<key>.json`, i.e. if `key` was 'level1' then the URL will be 'level1.json'.
    * data (object | string) {optional} - An optional JSON data object. If given then the url is ignored and this JSON object is used for map data instead.
    * format (number) {optional} - The format of the map data. Either Phaser.Tilemap.CSV or Phaser.Tilemap.TILED_JSON.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.tilemap loader
              (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.tilemap loader
              (clj->phaser key)
              (clj->phaser url))))
  ([loader key url data]
   (phaser->clj
    (.tilemap loader
              (clj->phaser key)
              (clj->phaser url)
              (clj->phaser data))))
  ([loader key url data format]
   (phaser->clj
    (.tilemap loader
              (clj->phaser key)
              (clj->phaser url)
              (clj->phaser data)
              (clj->phaser format)))))

(defn video
  "Adds a video file to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getVideo(key)`.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  You don't need to preload a video in order to play it in your game. See `Video.createVideoFromURL` for details.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the video file.
    * urls (string | Array.<string> | Array.<object>) - Either a single string or an array of URIs or pairs of `{uri: .., type: ..}`.
   If an array is specified then the first URI (or URI + mime pair) that is device-compatible will be selected.
   For example: `'boom.mp4'`, `['boom.mp4', 'boom.ogg', 'boom.webm']`, or `[{uri: 'data:<opus_resource>', type: 'opus'}, 'fallback.mp4']`.
   BLOB and DATA URIs can be used but only support automatic detection when used in the pair form; otherwise the format must be manually checked before adding the resource.
    * load-event (string) {optional} - This sets the Video source event to listen for before the load is considered complete.
   'canplaythrough' implies the video has downloaded enough, and bandwidth is high enough that it can be played to completion.
   'canplay' implies the video has downloaded enough to start playing, but not necessarily to finish.
   'loadeddata' just makes sure that the video meta data and first frame have downloaded. Phaser uses this value automatically if the
   browser is detected as being Firefox and no `loadEvent` is given, otherwise it defaults to `canplaythrough`.
    * as-blob (boolean) {optional} - Video files can either be loaded via the creation of a video element which has its src property set.
   Or they can be loaded via xhr, stored as binary data in memory and then converted to a Blob. This isn't supported in IE9 or Android 2.
   If you need to have the same video playing at different times across multiple Sprites then you need to load it as a Blob.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key urls]
   (phaser->clj
    (.video loader
            (clj->phaser key)
            (clj->phaser urls))))
  ([loader key urls load-event]
   (phaser->clj
    (.video loader
            (clj->phaser key)
            (clj->phaser urls)
            (clj->phaser load-event))))
  ([loader key urls load-event as-blob]
   (phaser->clj
    (.video loader
            (clj->phaser key)
            (clj->phaser urls)
            (clj->phaser load-event)
            (clj->phaser as-blob)))))

(defn with-sync-points
  "Add a synchronization point to the assets/files added within the supplied callback.

  A synchronization point denotes that an asset _must_ be completely loaded before
  subsequent assets can be loaded. An asset marked as a sync-point does not need to wait
  for previous assets to load (unless they are sync-points). Resources, such as packs, may still
  be downloaded around sync-points, as long as they do not finalize loading.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * callback (function) - The callback is invoked and is supplied with a single argument: the loader.
    * callback-context (object) {optional} - Context for the callback.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader callback]
   (phaser->clj
    (.withSyncPoints loader
                     (clj->phaser callback))))
  ([loader callback callback-context]
   (phaser->clj
    (.withSyncPoints loader
                     (clj->phaser callback)
                     (clj->phaser callback-context)))))

(defn xml
  "Adds an XML file to the current load queue.

  The file is **not** loaded immediately after calling this method. The file is added to the queue ready to be loaded when the loader starts.

  The key must be a unique String. It is used to add the file to the Phaser.Cache upon successful load.

  Retrieve the file via `Cache.getXML(key)`.

  The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.

  If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is 'alien'
  and no URL is given then the Loader will set the URL to be 'alien.xml'. It will always add `.xml` as the extension.
  If you do not desire this action then provide a URL.

  Parameters:
    * loader (Phaser.Loader) - Targeted instance for method
    * key (string) - Unique asset key of the xml file.
    * url (string) {optional} - URL of the XML file. If undefined or `null` the url will be set to `<key>.xml`, i.e. if `key` was 'alien' then the URL will be 'alien.xml'.
    * overwrite (boolean) {optional} - If an unloaded file with a matching key already exists in the queue, this entry will overwrite it.

  Returns:  Phaser.Loader - This Loader instance."
  ([loader key]
   (phaser->clj
    (.xml loader
          (clj->phaser key))))
  ([loader key url]
   (phaser->clj
    (.xml loader
          (clj->phaser key)
          (clj->phaser url))))
  ([loader key url overwrite]
   (phaser->clj
    (.xml loader
          (clj->phaser key)
          (clj->phaser url)
          (clj->phaser overwrite)))))