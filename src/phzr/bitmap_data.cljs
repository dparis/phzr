(ns phzr.bitmap-data
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [load update]))

(defn ->BitmapData
  "A BitmapData object contains a Canvas element to which you can draw anything you like via normal Canvas context operations.
  A single BitmapData can be used as the texture for one or many Images/Sprites. 
  So if you need to dynamically create a Sprite texture then they are a good choice.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * key (string) - Internal Phaser reference key for the BitmapData.
    * width (number) {optional} - The width of the BitmapData in pixels. If undefined or zero it's set to a default value.
    * height (number) {optional} - The height of the BitmapData in pixels. If undefined or zero it's set to a default value."
  ([game key]
   (js/Phaser.BitmapData. (clj->phaser game)
                          (clj->phaser key)))
  ([game key width]
   (js/Phaser.BitmapData. (clj->phaser game)
                          (clj->phaser key)
                          (clj->phaser width)))
  ([game key width height]
   (js/Phaser.BitmapData. (clj->phaser game)
                          (clj->phaser key)
                          (clj->phaser width)
                          (clj->phaser height))))

(defn add
  "Updates the given objects so that they use this BitmapData as their texture.
  This will replace any texture they will currently have set.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * object (Phaser.Sprite | Array.<Phaser.Sprite> | Phaser.Image | Array.<Phaser.Image>) - Either a single Sprite/Image or an Array of Sprites/Images.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data object]
   (phaser->clj
    (.add bitmap-data
          (clj->phaser object)))))

(defn add-to-world
  "Creates a new Phaser.Image object, assigns this BitmapData to be its texture, adds it to the world then returns it.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) {optional} - The x coordinate to place the Image at.
    * y (number) {optional} - The y coordinate to place the Image at.
    * anchor-x (number) {optional} - Set the x anchor point of the Image. A value between 0 and 1, where 0 is the top-left and 1 is bottom-right.
    * anchor-y (number) {optional} - Set the y anchor point of the Image. A value between 0 and 1, where 0 is the top-left and 1 is bottom-right.
    * scale-x (number) {optional} - The horizontal scale factor of the Image. A value of 1 means no scaling. 2 would be twice the size, and so on.
    * scale-y (number) {optional} - The vertical scale factor of the Image. A value of 1 means no scaling. 2 would be twice the size, and so on.

  Returns:  Phaser.Image - The newly added Image object."
  ([bitmap-data]
   (phaser->clj
    (.addToWorld bitmap-data)))
  ([bitmap-data x]
   (phaser->clj
    (.addToWorld bitmap-data
                 (clj->phaser x))))
  ([bitmap-data x y]
   (phaser->clj
    (.addToWorld bitmap-data
                 (clj->phaser x)
                 (clj->phaser y))))
  ([bitmap-data x y anchor-x]
   (phaser->clj
    (.addToWorld bitmap-data
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser anchor-x))))
  ([bitmap-data x y anchor-x anchor-y]
   (phaser->clj
    (.addToWorld bitmap-data
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser anchor-x)
                 (clj->phaser anchor-y))))
  ([bitmap-data x y anchor-x anchor-y scale-x]
   (phaser->clj
    (.addToWorld bitmap-data
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser anchor-x)
                 (clj->phaser anchor-y)
                 (clj->phaser scale-x))))
  ([bitmap-data x y anchor-x anchor-y scale-x scale-y]
   (phaser->clj
    (.addToWorld bitmap-data
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser anchor-x)
                 (clj->phaser anchor-y)
                 (clj->phaser scale-x)
                 (clj->phaser scale-y)))))

(defn alpha-mask
  "Draws the image onto this BitmapData using an image as an alpha mask.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * source (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapData | Image | HTMLCanvasElement | string) - The source to copy from. If you give a string it will try and find the Image in the Game.Cache first. This is quite expensive so try to provide the image itself.
    * mask (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapData | Image | HTMLCanvasElement | string) {optional} - The object to be used as the mask. If you give a string it will try and find the Image in the Game.Cache first. This is quite expensive so try to provide the image itself. If you don't provide a mask it will use this BitmapData as the mask.
    * source-rect (Phaser.Rectangle) {optional} - A Rectangle where x/y define the coordinates to draw the Source image to and width/height define the size.
    * mask-rect (Phaser.Rectangle) {optional} - A Rectangle where x/y define the coordinates to draw the Mask image to and width/height define the size.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data source]
   (phaser->clj
    (.alphaMask bitmap-data
                (clj->phaser source))))
  ([bitmap-data source mask]
   (phaser->clj
    (.alphaMask bitmap-data
                (clj->phaser source)
                (clj->phaser mask))))
  ([bitmap-data source mask source-rect]
   (phaser->clj
    (.alphaMask bitmap-data
                (clj->phaser source)
                (clj->phaser mask)
                (clj->phaser source-rect))))
  ([bitmap-data source mask source-rect mask-rect]
   (phaser->clj
    (.alphaMask bitmap-data
                (clj->phaser source)
                (clj->phaser mask)
                (clj->phaser source-rect)
                (clj->phaser mask-rect)))))

(defn blend-add
  "Sets the blend mode to 'lighter'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendAdd bitmap-data))))

(defn blend-color
  "Sets the blend mode to 'color'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendColor bitmap-data))))

(defn blend-color-burn
  "Sets the blend mode to 'color-burn'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendColorBurn bitmap-data))))

(defn blend-color-dodge
  "Sets the blend mode to 'color-dodge'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendColorDodge bitmap-data))))

(defn blend-darken
  "Sets the blend mode to 'darken'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendDarken bitmap-data))))

(defn blend-destination-atop
  "Sets the blend mode to 'destination-atop'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendDestinationAtop bitmap-data))))

(defn blend-destination-in
  "Sets the blend mode to 'destination-in'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendDestinationIn bitmap-data))))

(defn blend-destination-out
  "Sets the blend mode to 'destination-out'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendDestinationOut bitmap-data))))

(defn blend-destination-over
  "Sets the blend mode to 'destination-over'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendDestinationOver bitmap-data))))

(defn blend-difference
  "Sets the blend mode to 'difference'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendDifference bitmap-data))))

(defn blend-exclusion
  "Sets the blend mode to 'exclusion'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendExclusion bitmap-data))))

(defn blend-hard-light
  "Sets the blend mode to 'hard-light'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendHardLight bitmap-data))))

(defn blend-hue
  "Sets the blend mode to 'hue'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendHue bitmap-data))))

(defn blend-lighten
  "Sets the blend mode to 'lighten'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendLighten bitmap-data))))

(defn blend-luminosity
  "Sets the blend mode to 'luminosity'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendLuminosity bitmap-data))))

(defn blend-multiply
  "Sets the blend mode to 'multiply'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendMultiply bitmap-data))))

(defn blend-overlay
  "Sets the blend mode to 'overlay'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendOverlay bitmap-data))))

(defn blend-reset
  "Resets the blend mode (effectively sets it to 'source-over')

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendReset bitmap-data))))

(defn blend-saturation
  "Sets the blend mode to 'saturation'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendSaturation bitmap-data))))

(defn blend-screen
  "Sets the blend mode to 'screen'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendScreen bitmap-data))))

(defn blend-soft-light
  "Sets the blend mode to 'soft-light'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendSoftLight bitmap-data))))

(defn blend-source-atop
  "Sets the blend mode to 'source-atop'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendSourceAtop bitmap-data))))

(defn blend-source-in
  "Sets the blend mode to 'source-in'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendSourceIn bitmap-data))))

(defn blend-source-out
  "Sets the blend mode to 'source-out'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendSourceOut bitmap-data))))

(defn blend-source-over
  "Sets the blend mode to 'source-over'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendSourceOver bitmap-data))))

(defn blend-xor
  "Sets the blend mode to 'xor'

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.blendXor bitmap-data))))

(defn circle
  "Draws a filled Circle to the BitmapData at the given x, y coordinates and radius in size.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) - The x coordinate to draw the Circle at. This is the center of the circle.
    * y (number) - The y coordinate to draw the Circle at. This is the center of the circle.
    * radius (number) - The radius of the Circle in pixels. The radius is half the diameter.
    * fill-style (string) {optional} - If set the context fillStyle will be set to this value before the circle is drawn.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data x y radius]
   (phaser->clj
    (.circle bitmap-data
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser radius))))
  ([bitmap-data x y radius fill-style]
   (phaser->clj
    (.circle bitmap-data
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser radius)
             (clj->phaser fill-style)))))

(defn clear
  "Clears the BitmapData context using a clearRect.

  You can optionally define the area to clear.
  If the arguments are left empty it will clear the entire canvas.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the top-left of the area to clear.
    * y (number) {optional} - The y coordinate of the top-left of the area to clear.
    * width (number) {optional} - The width of the area to clear. If undefined it will use BitmapData.width.
    * height (number) {optional} - The height of the area to clear. If undefined it will use BitmapData.height.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.clear bitmap-data)))
  ([bitmap-data x]
   (phaser->clj
    (.clear bitmap-data
            (clj->phaser x))))
  ([bitmap-data x y]
   (phaser->clj
    (.clear bitmap-data
            (clj->phaser x)
            (clj->phaser y))))
  ([bitmap-data x y width]
   (phaser->clj
    (.clear bitmap-data
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser width))))
  ([bitmap-data x y width height]
   (phaser->clj
    (.clear bitmap-data
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser width)
            (clj->phaser height)))))

(defn cls
  "Clears the BitmapData context using a clearRect."
  ([bitmap-data]
   (phaser->clj
    (.cls bitmap-data))))

(defn copy
  "Copies a rectangular area from the source object to this BitmapData. If you give `null` as the source it will copy from itself.
  You can optionally resize, translate, rotate, scale, alpha or blend as it's drawn.
  All rotation, scaling and drawing takes place around the regions center point by default, but can be changed with the anchor parameters.
  Note that the source image can also be this BitmapData, which can create some interesting effects.

  This method has a lot of parameters for maximum control.
  You can use the more friendly methods like `copyRect` and `draw` to avoid having to remember them all.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * source (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapData | Image | HTMLCanvasElement | string) {optional} - The source to copy from. If you give a string it will try and find the Image in the Game.Cache first. This is quite expensive so try to provide the image itself.
    * x (number) {optional} - The x coordinate representing the top-left of the region to copy from the source image.
    * y (number) {optional} - The y coordinate representing the top-left of the region to copy from the source image.
    * width (number) {optional} - The width of the region to copy from the source image. If not specified it will use the full source image width.
    * height (number) {optional} - The height of the region to copy from the source image. If not specified it will use the full source image height.
    * tx (number) {optional} - The x coordinate to translate to before drawing. If not specified it will default to the `x` parameter. If `null` and `source` is a Display Object, it will default to `source.x`.
    * ty (number) {optional} - The y coordinate to translate to before drawing. If not specified it will default to the `y` parameter. If `null` and `source` is a Display Object, it will default to `source.y`.
    * new-width (number) {optional} - The new width of the block being copied. If not specified it will default to the `width` parameter.
    * new-height (number) {optional} - The new height of the block being copied. If not specified it will default to the `height` parameter.
    * rotate (number) {optional} - The angle in radians to rotate the block to before drawing. Rotation takes place around the center by default, but can be changed with the `anchor` parameters.
    * anchor-x (number) {optional} - The anchor point around which the block is rotated and scaled. A value between 0 and 1, where 0 is the top-left and 1 is bottom-right.
    * anchor-y (number) {optional} - The anchor point around which the block is rotated and scaled. A value between 0 and 1, where 0 is the top-left and 1 is bottom-right.
    * scale-x (number) {optional} - The horizontal scale factor of the block. A value of 1 means no scaling. 2 would be twice the size, and so on.
    * scale-y (number) {optional} - The vertical scale factor of the block. A value of 1 means no scaling. 2 would be twice the size, and so on.
    * alpha (number) {optional} - The alpha that will be set on the context before drawing. A value between 0 (fully transparent) and 1, opaque.
    * blend-mode (string) {optional} - The composite blend mode that will be used when drawing. The default is no blend mode at all. This is a Canvas globalCompositeOperation value such as 'lighter' or 'xor'.
    * round-px (boolean) {optional} - Should the x and y values be rounded to integers before drawing? This prevents anti-aliasing in some instances.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.copy bitmap-data)))
  ([bitmap-data source]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source))))
  ([bitmap-data source x]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x))))
  ([bitmap-data source x y]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y))))
  ([bitmap-data source x y width]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width))))
  ([bitmap-data source x y width height]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height))))
  ([bitmap-data source x y width height tx]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx))))
  ([bitmap-data source x y width height tx ty]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty))))
  ([bitmap-data source x y width height tx ty new-width]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width))))
  ([bitmap-data source x y width height tx ty new-width new-height]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width)
           (clj->phaser new-height))))
  ([bitmap-data source x y width height tx ty new-width new-height rotate]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width)
           (clj->phaser new-height)
           (clj->phaser rotate))))
  ([bitmap-data source x y width height tx ty new-width new-height rotate anchor-x]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width)
           (clj->phaser new-height)
           (clj->phaser rotate)
           (clj->phaser anchor-x))))
  ([bitmap-data source x y width height tx ty new-width new-height rotate anchor-x anchor-y]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width)
           (clj->phaser new-height)
           (clj->phaser rotate)
           (clj->phaser anchor-x)
           (clj->phaser anchor-y))))
  ([bitmap-data source x y width height tx ty new-width new-height rotate anchor-x anchor-y scale-x]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width)
           (clj->phaser new-height)
           (clj->phaser rotate)
           (clj->phaser anchor-x)
           (clj->phaser anchor-y)
           (clj->phaser scale-x))))
  ([bitmap-data source x y width height tx ty new-width new-height rotate anchor-x anchor-y scale-x scale-y]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width)
           (clj->phaser new-height)
           (clj->phaser rotate)
           (clj->phaser anchor-x)
           (clj->phaser anchor-y)
           (clj->phaser scale-x)
           (clj->phaser scale-y))))
  ([bitmap-data source x y width height tx ty new-width new-height rotate anchor-x anchor-y scale-x scale-y alpha]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width)
           (clj->phaser new-height)
           (clj->phaser rotate)
           (clj->phaser anchor-x)
           (clj->phaser anchor-y)
           (clj->phaser scale-x)
           (clj->phaser scale-y)
           (clj->phaser alpha))))
  ([bitmap-data source x y width height tx ty new-width new-height rotate anchor-x anchor-y scale-x scale-y alpha blend-mode]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width)
           (clj->phaser new-height)
           (clj->phaser rotate)
           (clj->phaser anchor-x)
           (clj->phaser anchor-y)
           (clj->phaser scale-x)
           (clj->phaser scale-y)
           (clj->phaser alpha)
           (clj->phaser blend-mode))))
  ([bitmap-data source x y width height tx ty new-width new-height rotate anchor-x anchor-y scale-x scale-y alpha blend-mode round-px]
   (phaser->clj
    (.copy bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser tx)
           (clj->phaser ty)
           (clj->phaser new-width)
           (clj->phaser new-height)
           (clj->phaser rotate)
           (clj->phaser anchor-x)
           (clj->phaser anchor-y)
           (clj->phaser scale-x)
           (clj->phaser scale-y)
           (clj->phaser alpha)
           (clj->phaser blend-mode)
           (clj->phaser round-px)))))

(defn copy-rect
  "Copies the area defined by the Rectangle parameter from the source image to this BitmapData at the given location.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * source (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapData | Image | string) - The Image to copy from. If you give a string it will try and find the Image in the Game.Cache.
    * area (Phaser.Rectangle) - The Rectangle region to copy from the source image.
    * x (number) - The destination x coordinate to copy the image to.
    * y (number) - The destination y coordinate to copy the image to.
    * alpha (number) {optional} - The alpha that will be set on the context before drawing. A value between 0 (fully transparent) and 1, opaque.
    * blend-mode (string) {optional} - The composite blend mode that will be used when drawing. The default is no blend mode at all. This is a Canvas globalCompositeOperation value such as 'lighter' or 'xor'.
    * round-px (boolean) {optional} - Should the x and y values be rounded to integers before drawing? This prevents anti-aliasing in some instances.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data source area x y]
   (phaser->clj
    (.copyRect bitmap-data
               (clj->phaser source)
               (clj->phaser area)
               (clj->phaser x)
               (clj->phaser y))))
  ([bitmap-data source area x y alpha]
   (phaser->clj
    (.copyRect bitmap-data
               (clj->phaser source)
               (clj->phaser area)
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser alpha))))
  ([bitmap-data source area x y alpha blend-mode]
   (phaser->clj
    (.copyRect bitmap-data
               (clj->phaser source)
               (clj->phaser area)
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser alpha)
               (clj->phaser blend-mode))))
  ([bitmap-data source area x y alpha blend-mode round-px]
   (phaser->clj
    (.copyRect bitmap-data
               (clj->phaser source)
               (clj->phaser area)
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser alpha)
               (clj->phaser blend-mode)
               (clj->phaser round-px)))))

(defn draw
  "Draws the given Phaser.Sprite, Phaser.Image or Phaser.Text to this BitmapData at the coordinates specified.
  You can use the optional width and height values to 'stretch' the sprite as it is drawn. This uses drawImage stretching, not scaling.
  When drawing it will take into account the Sprites rotation, scale and alpha values.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * source (Phaser.Sprite | Phaser.Image | Phaser.Text) - The Sprite, Image or Text object to draw onto this BitmapData.
    * x (number) {optional} - The x coordinate to translate to before drawing. If not specified it will default to `source.x`.
    * y (number) {optional} - The y coordinate to translate to before drawing. If not specified it will default to `source.y`.
    * width (number) {optional} - The new width of the Sprite being copied. If not specified it will default to `source.width`.
    * height (number) {optional} - The new height of the Sprite being copied. If not specified it will default to `source.height`.
    * blend-mode (string) {optional} - The composite blend mode that will be used when drawing. The default is no blend mode at all. This is a Canvas globalCompositeOperation value such as 'lighter' or 'xor'.
    * round-px (boolean) {optional} - Should the x and y values be rounded to integers before drawing? This prevents anti-aliasing in some instances.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data source]
   (phaser->clj
    (.draw bitmap-data
           (clj->phaser source))))
  ([bitmap-data source x]
   (phaser->clj
    (.draw bitmap-data
           (clj->phaser source)
           (clj->phaser x))))
  ([bitmap-data source x y]
   (phaser->clj
    (.draw bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y))))
  ([bitmap-data source x y width]
   (phaser->clj
    (.draw bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width))))
  ([bitmap-data source x y width height]
   (phaser->clj
    (.draw bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height))))
  ([bitmap-data source x y width height blend-mode]
   (phaser->clj
    (.draw bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser blend-mode))))
  ([bitmap-data source x y width height blend-mode round-px]
   (phaser->clj
    (.draw bitmap-data
           (clj->phaser source)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser blend-mode)
           (clj->phaser round-px)))))

(defn draw-group
  "Draws the immediate children of a Phaser.Group to this BitmapData.
  Children are only drawn if they have their `exists` property set to `true`.
  The children will be drawn at their `x` and `y` world space coordinates. If this is outside the bounds of the BitmapData they won't be drawn.
  When drawing it will take into account the child's rotation, scale and alpha values.
  No iteration takes place. Groups nested inside other Groups will not be iterated through.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * group (Phaser.Group) - The Group to draw onto this BitmapData.
    * blend-mode (string) {optional} - The composite blend mode that will be used when drawing. The default is no blend mode at all. This is a Canvas globalCompositeOperation value such as 'lighter' or 'xor'.
    * round-px (boolean) {optional} - Should the x and y values be rounded to integers before drawing? This prevents anti-aliasing in some instances.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data group]
   (phaser->clj
    (.drawGroup bitmap-data
                (clj->phaser group))))
  ([bitmap-data group blend-mode]
   (phaser->clj
    (.drawGroup bitmap-data
                (clj->phaser group)
                (clj->phaser blend-mode))))
  ([bitmap-data group blend-mode round-px]
   (phaser->clj
    (.drawGroup bitmap-data
                (clj->phaser group)
                (clj->phaser blend-mode)
                (clj->phaser round-px)))))

(defn extract
  "Scans this BitmapData for all pixels matching the given r,g,b values and then draws them into the given destination BitmapData.
  The original BitmapData remains unchanged.
  The destination BitmapData must be large enough to receive all of the pixels that are scanned unless the 'resize' parameter is true.
  Although the destination BitmapData is returned from this method, it's actually modified directly in place, meaning this call is perfectly valid:
  `picture.extract(mask, r, g, b)`
  You can specify optional r2, g2, b2 color values. If given the pixel written to the destination bitmap will be of the r2, g2, b2 color.
  If not given it will be written as the same color it was extracted. You can provide one or more alternative colors, allowing you to tint
  the color during extraction.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * destination (Phaser.BitmapData) - The BitmapData that the extracted pixels will be drawn to.
    * r (number) - The red color component, in the range 0 - 255.
    * g (number) - The green color component, in the range 0 - 255.
    * b (number) - The blue color component, in the range 0 - 255.
    * a (number) {optional} - The alpha color component, in the range 0 - 255 that the new pixel will be drawn at.
    * resize (boolean) {optional} - Should the destination BitmapData be resized to match this one before the pixels are copied?
    * r-2 (number) {optional} - An alternative red color component to be written to the destination, in the range 0 - 255.
    * g-2 (number) {optional} - An alternative green color component to be written to the destination, in the range 0 - 255.
    * b-2 (number) {optional} - An alternative blue color component to be written to the destination, in the range 0 - 255.

  Returns:  Phaser.BitmapData - The BitmapData that the extract pixels were drawn on."
  ([bitmap-data destination r g b]
   (phaser->clj
    (.extract bitmap-data
              (clj->phaser destination)
              (clj->phaser r)
              (clj->phaser g)
              (clj->phaser b))))
  ([bitmap-data destination r g b a]
   (phaser->clj
    (.extract bitmap-data
              (clj->phaser destination)
              (clj->phaser r)
              (clj->phaser g)
              (clj->phaser b)
              (clj->phaser a))))
  ([bitmap-data destination r g b a resize]
   (phaser->clj
    (.extract bitmap-data
              (clj->phaser destination)
              (clj->phaser r)
              (clj->phaser g)
              (clj->phaser b)
              (clj->phaser a)
              (clj->phaser resize))))
  ([bitmap-data destination r g b a resize r-2]
   (phaser->clj
    (.extract bitmap-data
              (clj->phaser destination)
              (clj->phaser r)
              (clj->phaser g)
              (clj->phaser b)
              (clj->phaser a)
              (clj->phaser resize)
              (clj->phaser r-2))))
  ([bitmap-data destination r g b a resize r-2 g-2]
   (phaser->clj
    (.extract bitmap-data
              (clj->phaser destination)
              (clj->phaser r)
              (clj->phaser g)
              (clj->phaser b)
              (clj->phaser a)
              (clj->phaser resize)
              (clj->phaser r-2)
              (clj->phaser g-2))))
  ([bitmap-data destination r g b a resize r-2 g-2 b-2]
   (phaser->clj
    (.extract bitmap-data
              (clj->phaser destination)
              (clj->phaser r)
              (clj->phaser g)
              (clj->phaser b)
              (clj->phaser a)
              (clj->phaser resize)
              (clj->phaser r-2)
              (clj->phaser g-2)
              (clj->phaser b-2)))))

(defn fill
  "Fills the BitmapData with the given color.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * r (number) - The red color value, between 0 and 0xFF (255).
    * g (number) - The green color value, between 0 and 0xFF (255).
    * b (number) - The blue color value, between 0 and 0xFF (255).
    * a (number) {optional} - The alpha color value, between 0 and 1.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data r g b]
   (phaser->clj
    (.fill bitmap-data
           (clj->phaser r)
           (clj->phaser g)
           (clj->phaser b))))
  ([bitmap-data r g b a]
   (phaser->clj
    (.fill bitmap-data
           (clj->phaser r)
           (clj->phaser g)
           (clj->phaser b)
           (clj->phaser a)))))

(defn generate-texture
  "Creates a new Image element by converting this BitmapDatas canvas into a dataURL.

  The image is then stored in the image Cache using the key given.

  Finally a PIXI.Texture is created based on the image and returned.

  You can apply the texture to a sprite or any other supporting object by using either the
  key or the texture. First call generateTexture:

  `var texture = bitmapdata.generateTexture('ball');`

  Then you can either apply the texture to a sprite:

  `game.add.sprite(0, 0, texture);`

  or by using the string based key:

  `game.add.sprite(0, 0, 'ball');`

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * key (string) - The key which will be used to store the image in the Cache.

  Returns:  PIXI.Texture - The newly generated texture."
  ([bitmap-data key]
   (phaser->clj
    (.generateTexture bitmap-data
                      (clj->phaser key)))))

(defn get-bounds
  "Scans the BitmapData and calculates the bounds. This is a rectangle that defines the extent of all non-transparent pixels.
  The rectangle returned will extend from the top-left of the image to the bottom-right, excluding transparent pixels.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * rect (Phaser.Rectangle) {optional} - If provided this Rectangle object will be populated with the bounds, otherwise a new object will be created.

  Returns:  Phaser.Rectangle - A Rectangle whose dimensions encompass the full extent of non-transparent pixels in this BitmapData."
  ([bitmap-data]
   (phaser->clj
    (.getBounds bitmap-data)))
  ([bitmap-data rect]
   (phaser->clj
    (.getBounds bitmap-data
                (clj->phaser rect)))))

(defn get-first-pixel
  "Scans the BitmapData, pixel by pixel, until it encounters a pixel that isn't transparent (i.e. has an alpha value > 0).
  It then stops scanning and returns an object containing the color of the pixel in r, g and b properties and the location in the x and y properties.

  The direction parameter controls from which direction it should start the scan:

  0 = top to bottom
  1 = bottom to top
  2 = left to right
  3 = right to left

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * direction (number) {optional} - The direction in which to scan for the first pixel. 0 = top to bottom, 1 = bottom to top, 2 = left to right and 3 = right to left.

  Returns:  object - Returns an object containing the color of the pixel in the `r`, `g` and `b` properties and the location in the `x` and `y` properties."
  ([bitmap-data]
   (phaser->clj
    (.getFirstPixel bitmap-data)))
  ([bitmap-data direction]
   (phaser->clj
    (.getFirstPixel bitmap-data
                    (clj->phaser direction)))))

(defn get-pixel
  "Get the color of a specific pixel in the context into a color object.
  If you have drawn anything to the BitmapData since it was created you must call BitmapData.update to refresh the array buffer,
  otherwise this may return out of date color values, or worse - throw a run-time error as it tries to access an array element that doesn't exist.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) - The x coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.
    * y (number) - The y coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.
    * out (object) {optional} - An object into which 4 properties will be created: r, g, b and a. If not provided a new object will be created.

  Returns:  object - An object with the red, green, blue and alpha values set in the r, g, b and a properties."
  ([bitmap-data x y]
   (phaser->clj
    (.getPixel bitmap-data
               (clj->phaser x)
               (clj->phaser y))))
  ([bitmap-data x y out]
   (phaser->clj
    (.getPixel bitmap-data
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser out)))))

(defn get-pixel-32
  "Get the color of a specific pixel including its alpha value.
  If you have drawn anything to the BitmapData since it was created you must call BitmapData.update to refresh the array buffer,
  otherwise this may return out of date color values, or worse - throw a run-time error as it tries to access an array element that doesn't exist.
  Note that on little-endian systems the format is 0xAABBGGRR and on big-endian the format is 0xRRGGBBAA.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) - The x coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.
    * y (number) - The y coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.

  Returns:  number - A native color value integer (format: 0xAARRGGBB)"
  ([bitmap-data x y]
   (phaser->clj
    (.getPixel32 bitmap-data
                 (clj->phaser x)
                 (clj->phaser y)))))

(defn get-pixel-rgb
  "Get the color of a specific pixel including its alpha value as a color object containing r,g,b,a and rgba properties.
  If you have drawn anything to the BitmapData since it was created you must call BitmapData.update to refresh the array buffer,
  otherwise this may return out of date color values, or worse - throw a run-time error as it tries to access an array element that doesn't exist.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) - The x coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.
    * y (number) - The y coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.
    * out (object) {optional} - An object into which 3 properties will be created: r, g and b. If not provided a new object will be created.
    * hsl (boolean) {optional} - Also convert the rgb values into hsl?
    * hsv (boolean) {optional} - Also convert the rgb values into hsv?

  Returns:  object - An object with the red, green and blue values set in the r, g and b properties."
  ([bitmap-data x y]
   (phaser->clj
    (.getPixelRGB bitmap-data
                  (clj->phaser x)
                  (clj->phaser y))))
  ([bitmap-data x y out]
   (phaser->clj
    (.getPixelRGB bitmap-data
                  (clj->phaser x)
                  (clj->phaser y)
                  (clj->phaser out))))
  ([bitmap-data x y out hsl]
   (phaser->clj
    (.getPixelRGB bitmap-data
                  (clj->phaser x)
                  (clj->phaser y)
                  (clj->phaser out)
                  (clj->phaser hsl))))
  ([bitmap-data x y out hsl hsv]
   (phaser->clj
    (.getPixelRGB bitmap-data
                  (clj->phaser x)
                  (clj->phaser y)
                  (clj->phaser out)
                  (clj->phaser hsl)
                  (clj->phaser hsv)))))

(defn get-pixels
  "Gets all the pixels from the region specified by the given Rectangle object.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * rect (Phaser.Rectangle) - The Rectangle region to get.

  Returns:  ImageData - Returns a ImageData object containing a Uint8ClampedArray data property."
  ([bitmap-data rect]
   (phaser->clj
    (.getPixels bitmap-data
                (clj->phaser rect)))))

(defn get-transform-
  "Gets a JavaScript object that has 6 properties set that are used by BitmapData in a transform.

  Parameters:
    * translate-x (number) - The x translate value.
    * translate-y (number) - The y translate value.
    * scale-x (number) - The scale x value.
    * scale-y (number) - The scale y value.
    * skew-x (number) - The skew x value.
    * skew-y (number) - The skew y value.

  Returns:  object - A JavaScript object containing all of the properties BitmapData needs for transforms."
  ([translate-x translate-y scale-x scale-y skew-x skew-y]
   (phaser->clj
    (.getTransform js/Phaser.BitmapData
                   (clj->phaser translate-x)
                   (clj->phaser translate-y)
                   (clj->phaser scale-x)
                   (clj->phaser scale-y)
                   (clj->phaser skew-x)
                   (clj->phaser skew-y)))))

(defn load
  "Takes the given Game Object, resizes this BitmapData to match it and then draws it into this BitmapDatas canvas, ready for further processing.
  The source game object is not modified by this operation.
  If the source object uses a texture as part of a Texture Atlas or Sprite Sheet, only the current frame will be used for sizing.
  If a string is given it will assume it's a cache key and look in Phaser.Cache for an image key matching the string.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * source (Phaser.Sprite | Phaser.Image | Phaser.Text | Phaser.BitmapData | Image | HTMLCanvasElement | string) - The object that will be used to populate this BitmapData. If you give a string it will try and find the Image in the Game.Cache first.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data source]
   (phaser->clj
    (.load bitmap-data
           (clj->phaser source)))))

(defn move
  "Shifts the contents of this BitmapData by the distances given.

  The image will wrap-around the edges on all sides.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (integer) - The amount of pixels to horizontally shift the canvas by. Use a negative value to shift to the left, positive to the right.
    * y (integer) - The amount of pixels to vertically shift the canvas by. Use a negative value to shift up, positive to shift down.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data x y]
   (phaser->clj
    (.move bitmap-data
           (clj->phaser x)
           (clj->phaser y)))))

(defn move-h
  "Shifts the contents of this BitmapData horizontally.

  The image will wrap-around the sides.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * distance (integer) - The amount of pixels to horizontally shift the canvas by. Use a negative value to shift to the left, positive to the right.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data distance]
   (phaser->clj
    (.moveH bitmap-data
            (clj->phaser distance)))))

(defn move-v
  "Shifts the contents of this BitmapData vertically.

  The image will wrap-around the sides.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * distance (integer) - The amount of pixels to vertically shift the canvas by. Use a negative value to shift up, positive to shift down.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data distance]
   (phaser->clj
    (.moveV bitmap-data
            (clj->phaser distance)))))

(defn process-pixel
  "Scans through the area specified in this BitmapData and sends the color for every pixel to the given callback along with its x and y coordinates.
  Whatever value the callback returns is set as the new color for that pixel, unless it returns the same color, in which case it's skipped.
  Note that the format of the color received will be different depending on if the system is big or little endian.
  It is expected that your callback will deal with endianess. If you'd rather Phaser did it then use processPixelRGB instead.
  The callback will also be sent the pixels x and y coordinates respectively.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * callback (function) - The callback that will be sent each pixel color to be processed.
    * callback-context (object) - The context under which the callback will be called.
    * x (number) {optional} - The x coordinate of the top-left of the region to process from.
    * y (number) {optional} - The y coordinate of the top-left of the region to process from.
    * width (number) {optional} - The width of the region to process.
    * height (number) {optional} - The height of the region to process.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data callback callback-context]
   (phaser->clj
    (.processPixel bitmap-data
                   (clj->phaser callback)
                   (clj->phaser callback-context))))
  ([bitmap-data callback callback-context x]
   (phaser->clj
    (.processPixel bitmap-data
                   (clj->phaser callback)
                   (clj->phaser callback-context)
                   (clj->phaser x))))
  ([bitmap-data callback callback-context x y]
   (phaser->clj
    (.processPixel bitmap-data
                   (clj->phaser callback)
                   (clj->phaser callback-context)
                   (clj->phaser x)
                   (clj->phaser y))))
  ([bitmap-data callback callback-context x y width]
   (phaser->clj
    (.processPixel bitmap-data
                   (clj->phaser callback)
                   (clj->phaser callback-context)
                   (clj->phaser x)
                   (clj->phaser y)
                   (clj->phaser width))))
  ([bitmap-data callback callback-context x y width height]
   (phaser->clj
    (.processPixel bitmap-data
                   (clj->phaser callback)
                   (clj->phaser callback-context)
                   (clj->phaser x)
                   (clj->phaser y)
                   (clj->phaser width)
                   (clj->phaser height)))))

(defn process-pixel-rgb
  "Scans through the area specified in this BitmapData and sends a color object for every pixel to the given callback.
  The callback will be sent a color object with 6 properties: `{ r: number, g: number, b: number, a: number, color: number, rgba: string }`.
  Where r, g, b and a are integers between 0 and 255 representing the color component values for red, green, blue and alpha.
  The `color` property is an Int32 of the full color. Note the endianess of this will change per system.
  The `rgba` property is a CSS style rgba() string which can be used with context.fillStyle calls, among others.
  The callback will also be sent the pixels x and y coordinates respectively.
  The callback must return either `false`, in which case no change will be made to the pixel, or a new color object.
  If a new color object is returned the pixel will be set to the r, g, b and a color values given within it.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * callback (function) - The callback that will be sent each pixel color object to be processed.
    * callback-context (object) - The context under which the callback will be called.
    * x (number) {optional} - The x coordinate of the top-left of the region to process from.
    * y (number) {optional} - The y coordinate of the top-left of the region to process from.
    * width (number) {optional} - The width of the region to process.
    * height (number) {optional} - The height of the region to process.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data callback callback-context]
   (phaser->clj
    (.processPixelRGB bitmap-data
                      (clj->phaser callback)
                      (clj->phaser callback-context))))
  ([bitmap-data callback callback-context x]
   (phaser->clj
    (.processPixelRGB bitmap-data
                      (clj->phaser callback)
                      (clj->phaser callback-context)
                      (clj->phaser x))))
  ([bitmap-data callback callback-context x y]
   (phaser->clj
    (.processPixelRGB bitmap-data
                      (clj->phaser callback)
                      (clj->phaser callback-context)
                      (clj->phaser x)
                      (clj->phaser y))))
  ([bitmap-data callback callback-context x y width]
   (phaser->clj
    (.processPixelRGB bitmap-data
                      (clj->phaser callback)
                      (clj->phaser callback-context)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser width))))
  ([bitmap-data callback callback-context x y width height]
   (phaser->clj
    (.processPixelRGB bitmap-data
                      (clj->phaser callback)
                      (clj->phaser callback-context)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser width)
                      (clj->phaser height)))))

(defn rect
  "Draws a filled Rectangle to the BitmapData at the given x, y coordinates and width / height in size.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) - The x coordinate of the top-left of the Rectangle.
    * y (number) - The y coordinate of the top-left of the Rectangle.
    * width (number) - The width of the Rectangle.
    * height (number) - The height of the Rectangle.
    * fill-style (string) {optional} - If set the context fillStyle will be set to this value before the rect is drawn.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data x y width height]
   (phaser->clj
    (.rect bitmap-data
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height))))
  ([bitmap-data x y width height fill-style]
   (phaser->clj
    (.rect bitmap-data
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser fill-style)))))

(defn render
  "If the game is running in WebGL this will push the texture up to the GPU if it's dirty.
  This is called automatically if the BitmapData is being used by a Sprite, otherwise you need to remember to call it in your render function.
  If you wish to suppress this functionality set BitmapData.disableTextureUpload to `true`.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.render bitmap-data))))

(defn replace-rgb
  "Replaces all pixels matching one color with another. The color values are given as two sets of RGBA values.
  An optional region parameter controls if the replacement happens in just a specific area of the BitmapData or the entire thing.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * r-1 (number) - The red color value to be replaced. Between 0 and 255.
    * g-1 (number) - The green color value to be replaced. Between 0 and 255.
    * b-1 (number) - The blue color value to be replaced. Between 0 and 255.
    * a-1 (number) - The alpha color value to be replaced. Between 0 and 255.
    * r-2 (number) - The red color value that is the replacement color. Between 0 and 255.
    * g-2 (number) - The green color value that is the replacement color. Between 0 and 255.
    * b-2 (number) - The blue color value that is the replacement color. Between 0 and 255.
    * a-2 (number) - The alpha color value that is the replacement color. Between 0 and 255.
    * region (Phaser.Rectangle) {optional} - The area to perform the search over. If not given it will replace over the whole BitmapData.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data r-1 g-1 b-1 a-1 r-2 g-2 b-2 a-2]
   (phaser->clj
    (.replaceRGB bitmap-data
                 (clj->phaser r-1)
                 (clj->phaser g-1)
                 (clj->phaser b-1)
                 (clj->phaser a-1)
                 (clj->phaser r-2)
                 (clj->phaser g-2)
                 (clj->phaser b-2)
                 (clj->phaser a-2))))
  ([bitmap-data r-1 g-1 b-1 a-1 r-2 g-2 b-2 a-2 region]
   (phaser->clj
    (.replaceRGB bitmap-data
                 (clj->phaser r-1)
                 (clj->phaser g-1)
                 (clj->phaser b-1)
                 (clj->phaser a-1)
                 (clj->phaser r-2)
                 (clj->phaser g-2)
                 (clj->phaser b-2)
                 (clj->phaser a-2)
                 (clj->phaser region)))))

(defn resize
  "Resizes the BitmapData. This changes the size of the underlying canvas and refreshes the buffer.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.resize bitmap-data))))

(defn set-hsl
  "Sets the hue, saturation and lightness values on every pixel in the given region, or the whole BitmapData if no region was specified.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * h (number) {optional} - The hue, in the range 0 - 1.
    * s (number) {optional} - The saturation, in the range 0 - 1.
    * l (number) {optional} - The lightness, in the range 0 - 1.
    * region (Phaser.Rectangle) {optional} - The area to perform the operation on. If not given it will run over the whole BitmapData.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.setHSL bitmap-data)))
  ([bitmap-data h]
   (phaser->clj
    (.setHSL bitmap-data
             (clj->phaser h))))
  ([bitmap-data h s]
   (phaser->clj
    (.setHSL bitmap-data
             (clj->phaser h)
             (clj->phaser s))))
  ([bitmap-data h s l]
   (phaser->clj
    (.setHSL bitmap-data
             (clj->phaser h)
             (clj->phaser s)
             (clj->phaser l))))
  ([bitmap-data h s l region]
   (phaser->clj
    (.setHSL bitmap-data
             (clj->phaser h)
             (clj->phaser s)
             (clj->phaser l)
             (clj->phaser region)))))

(defn set-pixel
  "Sets the color of the given pixel to the specified red, green and blue values.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) - The x coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.
    * y (number) - The y coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.
    * red (number) - The red color value, between 0 and 0xFF (255).
    * green (number) - The green color value, between 0 and 0xFF (255).
    * blue (number) - The blue color value, between 0 and 0xFF (255).
    * alpha (number) - The alpha color value, between 0 and 0xFF (255).
    * immediate (boolean) {optional} - If `true` the context.putImageData will be called and the dirty flag set.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data x y red green blue alpha]
   (phaser->clj
    (.setPixel bitmap-data
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser red)
               (clj->phaser green)
               (clj->phaser blue)
               (clj->phaser alpha))))
  ([bitmap-data x y red green blue alpha immediate]
   (phaser->clj
    (.setPixel bitmap-data
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser red)
               (clj->phaser green)
               (clj->phaser blue)
               (clj->phaser alpha)
               (clj->phaser immediate)))))

(defn set-pixel-32
  "Sets the color of the given pixel to the specified red, green, blue and alpha values.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) - The x coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.
    * y (number) - The y coordinate of the pixel to be set. Must lay within the dimensions of this BitmapData.
    * red (number) - The red color value, between 0 and 0xFF (255).
    * green (number) - The green color value, between 0 and 0xFF (255).
    * blue (number) - The blue color value, between 0 and 0xFF (255).
    * alpha (number) - The alpha color value, between 0 and 0xFF (255).
    * immediate (boolean) {optional} - If `true` the context.putImageData will be called and the dirty flag set.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data x y red green blue alpha]
   (phaser->clj
    (.setPixel32 bitmap-data
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser red)
                 (clj->phaser green)
                 (clj->phaser blue)
                 (clj->phaser alpha))))
  ([bitmap-data x y red green blue alpha immediate]
   (phaser->clj
    (.setPixel32 bitmap-data
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser red)
                 (clj->phaser green)
                 (clj->phaser blue)
                 (clj->phaser alpha)
                 (clj->phaser immediate)))))

(defn shadow
  "Sets the shadow properties of this BitmapDatas context which will affect all draw operations made to it.
  You can cancel an existing shadow by calling this method and passing no parameters.
  Note: At the time of writing (October 2014) Chrome still doesn't support shadowBlur used with drawImage.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * color (string) - The color of the shadow, given in a CSS format, i.e. `#000000` or `rgba(0,0,0,1)`. If `null` or `undefined` the shadow will be reset.
    * blur (number) {optional} - The amount the shadow will be blurred by. Low values = a crisp shadow, high values = a softer shadow.
    * x (number) {optional} - The horizontal offset of the shadow in pixels.
    * y (number) {optional} - The vertical offset of the shadow in pixels.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data color]
   (phaser->clj
    (.shadow bitmap-data
             (clj->phaser color))))
  ([bitmap-data color blur]
   (phaser->clj
    (.shadow bitmap-data
             (clj->phaser color)
             (clj->phaser blur))))
  ([bitmap-data color blur x]
   (phaser->clj
    (.shadow bitmap-data
             (clj->phaser color)
             (clj->phaser blur)
             (clj->phaser x))))
  ([bitmap-data color blur x y]
   (phaser->clj
    (.shadow bitmap-data
             (clj->phaser color)
             (clj->phaser blur)
             (clj->phaser x)
             (clj->phaser y)))))

(defn shift-hsl
  "Shifts any or all of the hue, saturation and lightness values on every pixel in the given region, or the whole BitmapData if no region was specified.
  Shifting will add the given value onto the current h, s and l values, not replace them.
  The hue is wrapped to keep it within the range 0 to 1. Saturation and lightness are clamped to not exceed 1.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * h (number) {optional} - The amount to shift the hue by.
    * s (number) {optional} - The amount to shift the saturation by.
    * l (number) {optional} - The amount to shift the lightness by.
    * region (Phaser.Rectangle) {optional} - The area to perform the operation on. If not given it will run over the whole BitmapData.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.shiftHSL bitmap-data)))
  ([bitmap-data h]
   (phaser->clj
    (.shiftHSL bitmap-data
               (clj->phaser h))))
  ([bitmap-data h s]
   (phaser->clj
    (.shiftHSL bitmap-data
               (clj->phaser h)
               (clj->phaser s))))
  ([bitmap-data h s l]
   (phaser->clj
    (.shiftHSL bitmap-data
               (clj->phaser h)
               (clj->phaser s)
               (clj->phaser l))))
  ([bitmap-data h s l region]
   (phaser->clj
    (.shiftHSL bitmap-data
               (clj->phaser h)
               (clj->phaser s)
               (clj->phaser l)
               (clj->phaser region)))))

(defn text
  "Draws text to the BitmapData in the given font and color.
  The default font is 14px Courier, so useful for quickly drawing debug text.
  If you need to do a lot of font work to this BitmapData we'd recommend implementing your own text draw method.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * text (string) - The text to write to the BitmapData.
    * x (number) - The x coordinate of the top-left of the text string.
    * y (number) - The y coordinate of the top-left of the text string.
    * font (string) {optional} - The font. This is passed directly to Context.font, so anything that can support, this can.
    * color (string) {optional} - The color the text will be drawn in.
    * shadow (boolean) {optional} - Draw a single pixel black shadow below the text (offset by text.x/y + 1)

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data text x y]
   (phaser->clj
    (.text bitmap-data
           (clj->phaser text)
           (clj->phaser x)
           (clj->phaser y))))
  ([bitmap-data text x y font]
   (phaser->clj
    (.text bitmap-data
           (clj->phaser text)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser font))))
  ([bitmap-data text x y font color]
   (phaser->clj
    (.text bitmap-data
           (clj->phaser text)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser font)
           (clj->phaser color))))
  ([bitmap-data text x y font color shadow]
   (phaser->clj
    (.text bitmap-data
           (clj->phaser text)
           (clj->phaser x)
           (clj->phaser y)
           (clj->phaser font)
           (clj->phaser color)
           (clj->phaser shadow)))))

(defn texture-line
  "Takes the given Line object and image and renders it to this BitmapData as a repeating texture line.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * line (Phaser.Line) - A Phaser.Line object that will be used to plot the start and end of the line.
    * image (string | Image) - The key of an image in the Phaser.Cache to use as the texture for this line, or an actual Image.
    * repeat (string) {optional} - The pattern repeat mode to use when drawing the line. Either `repeat`, `repeat-x` or `no-repeat`.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data line image]
   (phaser->clj
    (.textureLine bitmap-data
                  (clj->phaser line)
                  (clj->phaser image))))
  ([bitmap-data line image repeat]
   (phaser->clj
    (.textureLine bitmap-data
                  (clj->phaser line)
                  (clj->phaser image)
                  (clj->phaser repeat)))))

(defn update
  "This re-creates the BitmapData.imageData from the current context.
  It then re-builds the ArrayBuffer, the data Uint8ClampedArray reference and the pixels Int32Array.
  If not given the dimensions defaults to the full size of the context.

  Parameters:
    * bitmap-data (Phaser.BitmapData) - Targeted instance for method
    * x (number) {optional} - The x coordinate of the top-left of the image data area to grab from.
    * y (number) {optional} - The y coordinate of the top-left of the image data area to grab from.
    * width (number) {optional} - The width of the image data area.
    * height (number) {optional} - The height of the image data area.

  Returns:  Phaser.BitmapData - This BitmapData object for method chaining."
  ([bitmap-data]
   (phaser->clj
    (.update bitmap-data)))
  ([bitmap-data x]
   (phaser->clj
    (.update bitmap-data
             (clj->phaser x))))
  ([bitmap-data x y]
   (phaser->clj
    (.update bitmap-data
             (clj->phaser x)
             (clj->phaser y))))
  ([bitmap-data x y width]
   (phaser->clj
    (.update bitmap-data
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser width))))
  ([bitmap-data x y width height]
   (phaser->clj
    (.update bitmap-data
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser width)
             (clj->phaser height)))))