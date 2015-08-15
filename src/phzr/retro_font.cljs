(ns phzr.retro-font
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->RetroFont
  "A Retro Font is similar to a BitmapFont, in that it uses a texture to render the text. However unlike a BitmapFont every character in a RetroFont
  is the same size. This makes it similar to a sprite sheet. You typically find font sheets like this from old 8/16-bit games and demos.

  Parameters:
    * game (Phaser.Game) - Current game instance.
    * key (string) - The font set graphic set as stored in the Game.Cache.
    * character-width (number) - The width of each character in the font set.
    * character-height (number) - The height of each character in the font set.
    * chars (string) - The characters used in the font set, in display order. You can use the TEXT_SET consts for common font set arrangements.
    * chars-per-row (number) {optional} - The number of characters per row in the font set. If not given charsPerRow will be the image width / characterWidth.
    * x-spacing (number) {optional} - If the characters in the font set have horizontal spacing between them set the required amount here.
    * y-spacing (number) {optional} - If the characters in the font set have vertical spacing between them set the required amount here.
    * x-offset (number) {optional} - If the font set doesn't start at the top left of the given image, specify the X coordinate offset here.
    * y-offset (number) {optional} - If the font set doesn't start at the top left of the given image, specify the Y coordinate offset here."
  ([game key character-width character-height chars]
   (js/Phaser.RetroFont. (clj->phaser game)
                         (clj->phaser key)
                         (clj->phaser character-width)
                         (clj->phaser character-height)
                         (clj->phaser chars)))
  ([game key character-width character-height chars chars-per-row]
   (js/Phaser.RetroFont. (clj->phaser game)
                         (clj->phaser key)
                         (clj->phaser character-width)
                         (clj->phaser character-height)
                         (clj->phaser chars)
                         (clj->phaser chars-per-row)))
  ([game key character-width character-height chars chars-per-row x-spacing]
   (js/Phaser.RetroFont. (clj->phaser game)
                         (clj->phaser key)
                         (clj->phaser character-width)
                         (clj->phaser character-height)
                         (clj->phaser chars)
                         (clj->phaser chars-per-row)
                         (clj->phaser x-spacing)))
  ([game key character-width character-height chars chars-per-row x-spacing y-spacing]
   (js/Phaser.RetroFont. (clj->phaser game)
                         (clj->phaser key)
                         (clj->phaser character-width)
                         (clj->phaser character-height)
                         (clj->phaser chars)
                         (clj->phaser chars-per-row)
                         (clj->phaser x-spacing)
                         (clj->phaser y-spacing)))
  ([game key character-width character-height chars chars-per-row x-spacing y-spacing x-offset]
   (js/Phaser.RetroFont. (clj->phaser game)
                         (clj->phaser key)
                         (clj->phaser character-width)
                         (clj->phaser character-height)
                         (clj->phaser chars)
                         (clj->phaser chars-per-row)
                         (clj->phaser x-spacing)
                         (clj->phaser y-spacing)
                         (clj->phaser x-offset)))
  ([game key character-width character-height chars chars-per-row x-spacing y-spacing x-offset y-offset]
   (js/Phaser.RetroFont. (clj->phaser game)
                         (clj->phaser key)
                         (clj->phaser character-width)
                         (clj->phaser character-height)
                         (clj->phaser chars)
                         (clj->phaser chars-per-row)
                         (clj->phaser x-spacing)
                         (clj->phaser y-spacing)
                         (clj->phaser x-offset)
                         (clj->phaser y-offset))))

(defn build-retro-font-text
  "Updates the texture with the new text."
  ([retro-font]
   (phaser->clj
    (.buildRetroFontText retro-font))))

(defn clear
  "Clears the RenderTexture."
  ([retro-font]
   (phaser->clj
    (.clear retro-font))))

(defn destroy
  "Destroys this texture

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * destroy-base (Boolean) - Whether to destroy the base texture as well"
  ([retro-font destroy-base]
   (phaser->clj
    (.destroy retro-font
              (clj->phaser destroy-base)))))

(defn get-base-64
  "Will return a base64 encoded string of this texture. It works by calling RenderTexture.getCanvas and then running toDataURL on that.

  Returns:  String - A base64 encoded string of the texture."
  ([retro-font]
   (phaser->clj
    (.getBase64 retro-font))))

(defn get-canvas
  "Creates a Canvas element, renders this RenderTexture to it and then returns it.

  Returns:  HTMLCanvasElement - A Canvas element with the texture rendered on."
  ([retro-font]
   (phaser->clj
    (.getCanvas retro-font))))

(defn get-image
  "Will return a HTML Image of the texture

  Returns:  Image - "
  ([retro-font]
   (phaser->clj
    (.getImage retro-font))))

(defn get-longest-line
  "Works out the longest line of text in _text and returns its length

  Returns:  number - The length of the longest line of text."
  ([retro-font]
   (phaser->clj
    (.getLongestLine retro-font))))

(defn paste-line
  "Internal function that takes a single line of text (2nd parameter) and pastes it into the BitmapData at the given coordinates.
  Used by getLine and getMultiLine

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * line (string) - The single line of text to paste.
    * x (number) - The x coordinate.
    * y (number) - The y coordinate.
    * custom-spacing-x (number) - Custom X spacing."
  ([retro-font line x y custom-spacing-x]
   (phaser->clj
    (.pasteLine retro-font
                (clj->phaser line)
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser custom-spacing-x)))))

(defn render
  "This function will draw the display object to the RenderTexture.

  In versions of Phaser prior to 2.4.0 the second parameter was a Phaser.Point object. 
  This is now a Matrix allowing you much more control over how the Display Object is rendered.
  If you need to replicate the earlier behavior please use Phaser.RenderTexture.renderXY instead.

  If you wish for the displayObject to be rendered taking its current scale, rotation and translation into account then either
  pass `null`, leave it undefined or pass `displayObject.worldTransform` as the matrix value.

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapText | Phaser.Group) - The display object to render to this texture.
    * matrix (Phaser.Matrix) {optional} - Optional matrix to apply to the display object before rendering. If null or undefined it will use the worldTransform matrix of the given display object.
    * clear (boolean) {optional} - If true the texture will be cleared before the display object is drawn."
  ([retro-font display-object]
   (phaser->clj
    (.render retro-font
             (clj->phaser display-object))))
  ([retro-font display-object matrix]
   (phaser->clj
    (.render retro-font
             (clj->phaser display-object)
             (clj->phaser matrix))))
  ([retro-font display-object matrix clear]
   (phaser->clj
    (.render retro-font
             (clj->phaser display-object)
             (clj->phaser matrix)
             (clj->phaser clear)))))

(defn render-raw-xy
  "This function will draw the display object to the RenderTexture at the given coordinates.

  When the display object is drawn it doesn't take into account scale, rotation or translation.

  If you need those then use RenderTexture.renderXY instead.

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapText | Phaser.Group) - The display object to render to this texture.
    * x (number) - The x position to render the object at.
    * y (number) - The y position to render the object at.
    * clear (boolean) {optional} - If true the texture will be cleared before the display object is drawn."
  ([retro-font display-object x y]
   (phaser->clj
    (.renderRawXY retro-font
                  (clj->phaser display-object)
                  (clj->phaser x)
                  (clj->phaser y))))
  ([retro-font display-object x y clear]
   (phaser->clj
    (.renderRawXY retro-font
                  (clj->phaser display-object)
                  (clj->phaser x)
                  (clj->phaser y)
                  (clj->phaser clear)))))

(defn render-xy
  "This function will draw the display object to the RenderTexture at the given coordinates.

  When the display object is drawn it takes into account scale and rotation.

  If you don't want those then use RenderTexture.renderRawXY instead.

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapText | Phaser.Group) - The display object to render to this texture.
    * x (number) - The x position to render the object at.
    * y (number) - The y position to render the object at.
    * clear (boolean) {optional} - If true the texture will be cleared before the display object is drawn."
  ([retro-font display-object x y]
   (phaser->clj
    (.renderXY retro-font
               (clj->phaser display-object)
               (clj->phaser x)
               (clj->phaser y))))
  ([retro-font display-object x y clear]
   (phaser->clj
    (.renderXY retro-font
               (clj->phaser display-object)
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser clear)))))

(defn resize
  "Resizes the RenderTexture.

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * width (Number) - The width to resize to.
    * height (Number) - The height to resize to.
    * update-base (Boolean) - Should the baseTexture.width and height values be resized as well?"
  ([retro-font width height update-base]
   (phaser->clj
    (.resize retro-font
             (clj->phaser width)
             (clj->phaser height)
             (clj->phaser update-base)))))

(defn set-fixed-width
  "If you need this RetroFont to have a fixed width and custom alignment you can set the width here.
  If text is wider than the width specified it will be cropped off.

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * width (number) - Width in pixels of this RetroFont. Set to zero to disable and re-enable automatic resizing.
    * line-alignment (string) {optional} - Align the text within this width. Set to RetroFont.ALIGN_LEFT (default), RetroFont.ALIGN_RIGHT or RetroFont.ALIGN_CENTER."
  ([retro-font width]
   (phaser->clj
    (.setFixedWidth retro-font
                    (clj->phaser width))))
  ([retro-font width line-alignment]
   (phaser->clj
    (.setFixedWidth retro-font
                    (clj->phaser width)
                    (clj->phaser line-alignment)))))

(defn set-frame
  "Specifies the region of the baseTexture that this texture will use.

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * frame (Rectangle) - The frame of the texture to set it to"
  ([retro-font frame]
   (phaser->clj
    (.setFrame retro-font
               (clj->phaser frame)))))

(defn set-text
  "A helper function that quickly sets lots of variables at once, and then updates the text.

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * content (string) - The text of this sprite.
    * multi-line (boolean) {optional} - Set to true if you want to support carriage-returns in the text and create a multi-line sprite instead of a single line.
    * character-spacing (number) {optional} - To add horizontal spacing between each character specify the amount in pixels.
    * line-spacing (number) {optional} - To add vertical spacing between each line of text, set the amount in pixels.
    * line-alignment (string) {optional} - Align each line of multi-line text. Set to RetroFont.ALIGN_LEFT, RetroFont.ALIGN_RIGHT or RetroFont.ALIGN_CENTER.
    * allow-lower-case (boolean) {optional} - Lots of bitmap font sets only include upper-case characters, if yours needs to support lower case then set this to true."
  ([retro-font content]
   (phaser->clj
    (.setText retro-font
              (clj->phaser content))))
  ([retro-font content multi-line]
   (phaser->clj
    (.setText retro-font
              (clj->phaser content)
              (clj->phaser multi-line))))
  ([retro-font content multi-line character-spacing]
   (phaser->clj
    (.setText retro-font
              (clj->phaser content)
              (clj->phaser multi-line)
              (clj->phaser character-spacing))))
  ([retro-font content multi-line character-spacing line-spacing]
   (phaser->clj
    (.setText retro-font
              (clj->phaser content)
              (clj->phaser multi-line)
              (clj->phaser character-spacing)
              (clj->phaser line-spacing))))
  ([retro-font content multi-line character-spacing line-spacing line-alignment]
   (phaser->clj
    (.setText retro-font
              (clj->phaser content)
              (clj->phaser multi-line)
              (clj->phaser character-spacing)
              (clj->phaser line-spacing)
              (clj->phaser line-alignment))))
  ([retro-font content multi-line character-spacing line-spacing line-alignment allow-lower-case]
   (phaser->clj
    (.setText retro-font
              (clj->phaser content)
              (clj->phaser multi-line)
              (clj->phaser character-spacing)
              (clj->phaser line-spacing)
              (clj->phaser line-alignment)
              (clj->phaser allow-lower-case)))))

(defn update-offset
  "Updates the x and/or y offset that the font is rendered from. This updates all of the texture frames, so be careful how often it is called.
  Note that the values given for the x and y properties are either ADDED to or SUBTRACTED from (if negative) the existing offsetX/Y values of the characters.
  So if the current offsetY is 8 and you want it to start rendering from y16 you would call updateOffset(0, 8) to add 8 to the current y offset.

  Parameters:
    * retro-font (Phaser.RetroFont) - Targeted instance for method
    * x-offset (number) {optional} - If the font set doesn't start at the top left of the given image, specify the X coordinate offset here.
    * y-offset (number) {optional} - If the font set doesn't start at the top left of the given image, specify the Y coordinate offset here."
  ([retro-font]
   (phaser->clj
    (.updateOffset retro-font)))
  ([retro-font x-offset]
   (phaser->clj
    (.updateOffset retro-font
                   (clj->phaser x-offset))))
  ([retro-font x-offset y-offset]
   (phaser->clj
    (.updateOffset retro-font
                   (clj->phaser x-offset)
                   (clj->phaser y-offset)))))