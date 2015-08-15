(ns phzr.bitmap-text
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->BitmapText
  "BitmapText objects work by taking a texture file and an XML or JSON file that describes the font structure.
  It then generates a new Sprite object for each letter of the text, proportionally spaced out and aligned to 
  match the font structure.

  BitmapText objects are less flexible than Text objects, in that they have less features such as shadows, fills and the ability 
  to use Web Fonts, however you trade this flexibility for rendering speed. You can also create visually compelling BitmapTexts by
  processing the font texture in an image editor, applying fills and any other effects required.

  To create multi-line text insert \\r, \\n or \\r\\n escape codes into the text string.

  If you are having performance issues due to the volume of sprites being rendered, and do not require the text to be constantly
  updating, you can use BitmapText.generateTexture to create a static texture from this BitmapText.

  To create a BitmapText data files you can use:

  BMFont (Windows, free): http://www.angelcode.com/products/bmfont/
  Glyph Designer (OS X, commercial): http://www.71squared.com/en/glyphdesigner
  Littera (Web-based, free): http://kvazars.com/littera/

  For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
  converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: http://codebeautify.org/xmltojson

  If you were using an older version of Phaser (< 2.4) and using the DOMish parser hack, please remove this. It isn't required any longer.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * x (number) - X coordinate to display the BitmapText object at.
    * y (number) - Y coordinate to display the BitmapText object at.
    * font (string) - The key of the BitmapText as stored in Phaser.Cache.
    * text (string) {optional} - The text that will be rendered. This can also be set later via BitmapText.text.
    * size (number) {optional} - The size the font will be rendered at in pixels.
    * align (string) {optional} - The alignment of multi-line text. Has no effect if there is only one line of text."
  ([game x y font]
   (js/Phaser.BitmapText. (clj->phaser game)
                          (clj->phaser x)
                          (clj->phaser y)
                          (clj->phaser font)))
  ([game x y font text]
   (js/Phaser.BitmapText. (clj->phaser game)
                          (clj->phaser x)
                          (clj->phaser y)
                          (clj->phaser font)
                          (clj->phaser text)))
  ([game x y font text size]
   (js/Phaser.BitmapText. (clj->phaser game)
                          (clj->phaser x)
                          (clj->phaser y)
                          (clj->phaser font)
                          (clj->phaser text)
                          (clj->phaser size)))
  ([game x y font text size align]
   (js/Phaser.BitmapText. (clj->phaser game)
                          (clj->phaser x)
                          (clj->phaser y)
                          (clj->phaser font)
                          (clj->phaser text)
                          (clj->phaser size)
                          (clj->phaser align))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([bitmap-text child]
   (phaser->clj
    (.addChild bitmap-text
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([bitmap-text child index]
   (phaser->clj
    (.addChildAt bitmap-text
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn destroy
  "Destroy this DisplayObject.
  Removes all references to transformCallbacks, its parent, the stage, filters, bounds, mask and cached Sprites."
  ([bitmap-text]
   (phaser->clj
    (.destroy bitmap-text))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([bitmap-text resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture bitmap-text
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-bounds
  "Retrieves the bounds of the displayObjectContainer as a rectangle. The bounds calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([bitmap-text]
   (phaser->clj
    (.getBounds bitmap-text))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([bitmap-text index]
   (phaser->clj
    (.getChildAt bitmap-text
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([bitmap-text child]
   (phaser->clj
    (.getChildIndex bitmap-text
                    (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([bitmap-text]
   (phaser->clj
    (.getLocalBounds bitmap-text))))

(defn kill
  "Kills a Game Object. A killed Game Object has its `alive`, `exists` and `visible` properties all set to false.

  It will dispatch the `onKilled` event. You can listen to `events.onKilled` for the signal.

  Note that killing a Game Object is a way for you to quickly recycle it in an object pool, 
  it doesn't destroy the object or free it up from memory.

  If you don't need this Game Object any more you should call `destroy` instead.

  Returns:  PIXI.DisplayObject - This instance."
  ([bitmap-text]
   (phaser->clj
    (.kill bitmap-text))))

(defn post-update
  "Automatically called by World.preUpdate."
  ([bitmap-text]
   (phaser->clj
    (.postUpdate bitmap-text))))

(defn pre-update
  "Automatically called by World.preUpdate.

  Returns:  boolean - True if the BitmapText was rendered, otherwise false."
  ([bitmap-text]
   (phaser->clj
    (.preUpdate bitmap-text))))

(defn purge-glyphs
  "If a BitmapText changes from having a large number of characters to having very few characters it will cause lots of
  Sprites to be retained in the BitmapText._glyphs array. Although they are not attached to the display list they
  still take up memory while sat in the glyphs pool waiting to be re-used in the future.

  If you know that the BitmapText will not grow any larger then you can purge out the excess glyphs from the pool 
  by calling this method.

  Calling this doesn't prevent you from increasing the length of the text again in the future.

  Returns:  integer - The amount of glyphs removed from the pool."
  ([bitmap-text]
   (phaser->clj
    (.purgeGlyphs bitmap-text))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([bitmap-text child]
   (phaser->clj
    (.removeChild bitmap-text
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([bitmap-text index]
   (phaser->clj
    (.removeChildAt bitmap-text
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([bitmap-text begin-index end-index]
   (phaser->clj
    (.removeChildren bitmap-text
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([bitmap-text]
   (phaser->clj
    (.removeStageReference bitmap-text))))

(defn reset
  "Resets the Game Object.

  This moves the Game Object to the given x/y world coordinates and sets `fresh`, `exists`, 
  `visible` and `renderable` to true.

  If this Game Object has the LifeSpan component it will also set `alive` to true and `health` to the given value.

  If this Game Object has a Physics Body it will reset the Body.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Game Object at.
    * y (number) - The y coordinate (in world space) to position the Game Object at.
    * health (number) {optional} - The health to give the Game Object if it has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([bitmap-text x y]
   (phaser->clj
    (.reset bitmap-text
            (clj->phaser x)
            (clj->phaser y))))
  ([bitmap-text x y health]
   (phaser->clj
    (.reset bitmap-text
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser health)))))

(defn revive
  "Brings a 'dead' Game Object back to life, optionally resetting its health value in the process.

  A resurrected Game Object has its `alive`, `exists` and `visible` properties all set to true.

  It will dispatch the `onRevived` event. Listen to `events.onRevived` for the signal.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * health (number) {optional} - The health to give the Game Object. Only set if the GameObject has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([bitmap-text]
   (phaser->clj
    (.revive bitmap-text)))
  ([bitmap-text health]
   (phaser->clj
    (.revive bitmap-text
             (clj->phaser health)))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([bitmap-text child index]
   (phaser->clj
    (.setChildIndex bitmap-text
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([bitmap-text stage]
   (phaser->clj
    (.setStageReference bitmap-text
                        (clj->phaser stage)))))

(defn set-text
  "The text to be displayed by this BitmapText object.

  It's faster to use `BitmapText.text = string`, but this is kept for backwards compatibility.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * text (string) - The text to be displayed by this BitmapText object."
  ([bitmap-text text]
   (phaser->clj
    (.setText bitmap-text
              (clj->phaser text)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([bitmap-text child child-2]
   (phaser->clj
    (.swapChildren bitmap-text
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([bitmap-text position]
   (phaser->clj
    (.toGlobal bitmap-text
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * bitmap-text (Phaser.BitmapText) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([bitmap-text position]
   (phaser->clj
    (.toLocal bitmap-text
              (clj->phaser position))))
  ([bitmap-text position from]
   (phaser->clj
    (.toLocal bitmap-text
              (clj->phaser position)
              (clj->phaser from)))))

(defn update
  "Override this method in your own custom objects to handle any update requirements.
  It is called immediately after `preUpdate` and before `postUpdate`.
  Remember if this Game Object has any children you should call update on those too."
  ([bitmap-text]
   (phaser->clj
    (.update bitmap-text))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([bitmap-text]
   (phaser->clj
    (.updateCache bitmap-text))))