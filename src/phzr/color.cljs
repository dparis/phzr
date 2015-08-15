(ns phzr.color
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn blend-add-
  "Adds the source and backdrop colors together and returns the value, up to a maximum of 255.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendAdd js/Phaser.Color
               (clj->phaser a)
               (clj->phaser b)))))

(defn blend-average-
  "Takes the average of the source and backdrop colors.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendAverage js/Phaser.Color
                   (clj->phaser a)
                   (clj->phaser b)))))

(defn blend-color-burn-
  "Darkens the backdrop color to reflect the source color.
  Painting with white produces no change.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendColorBurn js/Phaser.Color
                     (clj->phaser a)
                     (clj->phaser b)))))

(defn blend-color-dodge-
  "Brightens the backdrop color to reflect the source color. 
  Painting with black produces no change.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendColorDodge js/Phaser.Color
                      (clj->phaser a)
                      (clj->phaser b)))))

(defn blend-darken-
  "Selects the darker of the backdrop and source colors.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendDarken js/Phaser.Color
                  (clj->phaser a)
                  (clj->phaser b)))))

(defn blend-difference-
  "Subtracts the darker of the two constituent colors from the lighter.

  Painting with white inverts the backdrop color; painting with black produces no change.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendDifference js/Phaser.Color
                      (clj->phaser a)
                      (clj->phaser b)))))

(defn blend-exclusion-
  "Produces an effect similar to that of the Difference mode, but lower in contrast. 
  Painting with white inverts the backdrop color; painting with black produces no change.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendExclusion js/Phaser.Color
                     (clj->phaser a)
                     (clj->phaser b)))))

(defn blend-glow-
  "Glow blend mode. This mode is a variation of reflect mode with the source and backdrop colors swapped.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendGlow js/Phaser.Color
                (clj->phaser a)
                (clj->phaser b)))))

(defn blend-hard-light-
  "Multiplies or screens the colors, depending on the source color value. 

  If the source color is lighter than 0.5, the backdrop is lightened, as if it were screened; 
  this is useful for adding highlights to a scene. 

  If the source color is darker than 0.5, the backdrop is darkened, as if it were multiplied; 
  this is useful for adding shadows to a scene. 

  The degree of lightening or darkening is proportional to the difference between the source color and 0.5; 
  if it is equal to 0.5, the backdrop is unchanged.

  Painting with pure black or white produces pure black or white. The effect is similar to shining a harsh spotlight on the backdrop.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendHardLight js/Phaser.Color
                     (clj->phaser a)
                     (clj->phaser b)))))

(defn blend-hard-mix-
  "Runs blendVividLight on the source and backdrop colors.
  If the resulting color is 128 or more, it receives a value of 255; if less than 128, a value of 0.
  Therefore, all blended pixels have red, green, and blue channel values of either 0 or 255.
  This changes all pixels to primary additive colors (red, green, or blue), white, or black.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendHardMix js/Phaser.Color
                   (clj->phaser a)
                   (clj->phaser b)))))

(defn blend-lighten-
  "Selects the lighter of the backdrop and source colors.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendLighten js/Phaser.Color
                   (clj->phaser a)
                   (clj->phaser b)))))

(defn blend-linear-burn-
  "An alias for blendSubtract, it simply sums the values of the two colors and subtracts 255.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendLinearBurn js/Phaser.Color
                      (clj->phaser a)
                      (clj->phaser b)))))

(defn blend-linear-dodge-
  "An alias for blendAdd, it simply sums the values of the two colors.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendLinearDodge js/Phaser.Color
                       (clj->phaser a)
                       (clj->phaser b)))))

(defn blend-linear-light-
  "This blend mode combines Linear Dodge and Linear Burn (rescaled so that neutral colors become middle gray).
  Dodge applies to values of top layer lighter than middle gray, and burn to darker values.
  The calculation simplifies to the sum of bottom layer and twice the top layer, subtract 128. The contrast decreases.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendLinearLight js/Phaser.Color
                       (clj->phaser a)
                       (clj->phaser b)))))

(defn blend-multiply-
  "Multiplies the backdrop and source color values.
  The result color is always at least as dark as either of the two constituent
  colors. Multiplying any color with black produces black;
  multiplying with white leaves the original color unchanged.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendMultiply js/Phaser.Color
                    (clj->phaser a)
                    (clj->phaser b)))))

(defn blend-negation-
  "Negation blend mode.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendNegation js/Phaser.Color
                    (clj->phaser a)
                    (clj->phaser b)))))

(defn blend-normal-
  "Blends the source color, ignoring the backdrop.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendNormal js/Phaser.Color
                  (clj->phaser a)
                  (clj->phaser b)))))

(defn blend-overlay-
  "Multiplies or screens the colors, depending on the backdrop color.
  Source colors overlay the backdrop while preserving its highlights and shadows. 
  The backdrop color is not replaced, but is mixed with the source color to reflect the lightness or darkness of the backdrop.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendOverlay js/Phaser.Color
                   (clj->phaser a)
                   (clj->phaser b)))))

(defn blend-phoenix-
  "Phoenix blend mode. This subtracts the lighter color from the darker color, and adds 255, giving a bright result.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendPhoenix js/Phaser.Color
                   (clj->phaser a)
                   (clj->phaser b)))))

(defn blend-pin-light-
  "If the backdrop color (light source) is lighter than 50%, the blendDarken mode is used, and colors lighter than the backdrop color do not change.
  If the backdrop color is darker than 50% gray, colors lighter than the blend color are replaced, and colors darker than the blend color do not change.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendPinLight js/Phaser.Color
                    (clj->phaser a)
                    (clj->phaser b)))))

(defn blend-reflect-
  "Reflect blend mode. This mode is useful when adding shining objects or light zones to images.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendReflect js/Phaser.Color
                   (clj->phaser a)
                   (clj->phaser b)))))

(defn blend-screen-
  "Multiplies the complements of the backdrop and source color values, then complements the result.
  The result color is always at least as light as either of the two constituent colors. 
  Screening any color with white produces white; screening with black leaves the original color unchanged.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendScreen js/Phaser.Color
                  (clj->phaser a)
                  (clj->phaser b)))))

(defn blend-soft-light-
  "Darkens or lightens the colors, depending on the source color value. 

  If the source color is lighter than 0.5, the backdrop is lightened, as if it were dodged; 
  this is useful for adding highlights to a scene. 

  If the source color is darker than 0.5, the backdrop is darkened, as if it were burned in. 
  The degree of lightening or darkening is proportional to the difference between the source color and 0.5; 
  if it is equal to 0.5, the backdrop is unchanged.

  Painting with pure black or white produces a distinctly darker or lighter area, but does not result in pure black or white. 
  The effect is similar to shining a diffused spotlight on the backdrop.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendSoftLight js/Phaser.Color
                     (clj->phaser a)
                     (clj->phaser b)))))

(defn blend-subtract-
  "Combines the source and backdrop colors and returns their value minus 255.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendSubtract js/Phaser.Color
                    (clj->phaser a)
                    (clj->phaser b)))))

(defn blend-vivid-light-
  "This blend mode combines Color Dodge and Color Burn (rescaled so that neutral colors become middle gray).
  Dodge applies when values in the top layer are lighter than middle gray, and burn to darker values.
  The middle gray is the neutral color. When color is lighter than this, this effectively moves the white point of the bottom 
  layer down by twice the difference; when it is darker, the black point is moved up by twice the difference. The perceived contrast increases.

  Parameters:
    * a (integer) - The source color to blend, in the range 1 to 255.
    * b (integer) - The backdrop color to blend, in the range 1 to 255.

  Returns:  integer - The blended color value, in the range 1 to 255."
  ([a b]
   (phaser->clj
    (.blendVividLight js/Phaser.Color
                      (clj->phaser a)
                      (clj->phaser b)))))

(defn component-to-hex-
  "Return a string containing a hex representation of the given color component.

  Parameters:
    * color (number) - The color channel to get the hex value for, must be a value between 0 and 255.

  Returns:  string - A string of length 2 characters, i.e. 255 = ff, 100 = 64."
  ([color]
   (phaser->clj
    (.componentToHex js/Phaser.Color
                     (clj->phaser color)))))

(defn create-color-
  "A utility function to create a lightweight 'color' object with the default components.
  Any components that are not specified will default to zero.

  This is useful when you want to use a shared color object for the getPixel and getPixelAt methods.

  Parameters:
    * r (number) {optional} - The red color component, in the range 0 - 255.
    * g (number) {optional} - The green color component, in the range 0 - 255.
    * b (number) {optional} - The blue color component, in the range 0 - 255.
    * a (number) {optional} - The alpha color component, in the range 0 - 1.
    * h (number) {optional} - The hue, in the range 0 - 1.
    * s (number) {optional} - The saturation, in the range 0 - 1.
    * l (number) {optional} - The lightness, in the range 0 - 1.
    * v (number) {optional} - The value, in the range 0 - 1.

  Returns:  object - The resulting object with r, g, b, a properties and h, s, l and v."
  ([]
   (phaser->clj
    (.createColor js/Phaser.Color)))
  ([r]
   (phaser->clj
    (.createColor js/Phaser.Color
                  (clj->phaser r))))
  ([r g]
   (phaser->clj
    (.createColor js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g))))
  ([r g b]
   (phaser->clj
    (.createColor js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g)
                  (clj->phaser b))))
  ([r g b a]
   (phaser->clj
    (.createColor js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g)
                  (clj->phaser b)
                  (clj->phaser a))))
  ([r g b a h]
   (phaser->clj
    (.createColor js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g)
                  (clj->phaser b)
                  (clj->phaser a)
                  (clj->phaser h))))
  ([r g b a h s]
   (phaser->clj
    (.createColor js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g)
                  (clj->phaser b)
                  (clj->phaser a)
                  (clj->phaser h)
                  (clj->phaser s))))
  ([r g b a h s l]
   (phaser->clj
    (.createColor js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g)
                  (clj->phaser b)
                  (clj->phaser a)
                  (clj->phaser h)
                  (clj->phaser s)
                  (clj->phaser l))))
  ([r g b a h s l v]
   (phaser->clj
    (.createColor js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g)
                  (clj->phaser b)
                  (clj->phaser a)
                  (clj->phaser h)
                  (clj->phaser s)
                  (clj->phaser l)
                  (clj->phaser v)))))

(defn from-rgba-
  "A utility to convert an integer in 0xRRGGBBAA format to a color object.
  This does not rely on endianness.

  Parameters:
    * rgba (number) - An RGBA hex
    * out (object) {optional} - The object to use, optional.

  Returns:  object - A color object."
  ([rgba]
   (phaser->clj
    (.fromRGBA js/Phaser.Color
               (clj->phaser rgba))))
  ([rgba out]
   (phaser->clj
    (.fromRGBA js/Phaser.Color
               (clj->phaser rgba)
               (clj->phaser out)))))

(defn get-alpha-
  "Given a native color value (in the format 0xAARRGGBB) this will return the Alpha component, as a value between 0 and 255.

  Parameters:
    * color (number) - In the format 0xAARRGGBB.

  Returns:  number - The Alpha component of the color, will be between 0 and 1 (0 being no Alpha (opaque), 1 full Alpha (transparent))."
  ([color]
   (phaser->clj
    (.getAlpha js/Phaser.Color
               (clj->phaser color)))))

(defn get-alpha-float-
  "Given a native color value (in the format 0xAARRGGBB) this will return the Alpha component as a value between 0 and 1.

  Parameters:
    * color (number) - In the format 0xAARRGGBB.

  Returns:  number - The Alpha component of the color, will be between 0 and 1 (0 being no Alpha (opaque), 1 full Alpha (transparent))."
  ([color]
   (phaser->clj
    (.getAlphaFloat js/Phaser.Color
                    (clj->phaser color)))))

(defn get-blue-
  "Given a native color value (in the format 0xAARRGGBB) this will return the Blue component, as a value between 0 and 255.

  Parameters:
    * color (number) - In the format 0xAARRGGBB.

  Returns:  number - The Blue component of the color, will be between 0 and 255 (0 being no color, 255 full Blue)."
  ([color]
   (phaser->clj
    (.getBlue js/Phaser.Color
              (clj->phaser color)))))

(defn get-color-
  "Given 3 color values this will return an integer representation of it.

  Parameters:
    * r (number) - The red color component, in the range 0 - 255.
    * g (number) - The green color component, in the range 0 - 255.
    * b (number) - The blue color component, in the range 0 - 255.

  Returns:  number - A native color value integer (format: 0xRRGGBB)."
  ([r g b]
   (phaser->clj
    (.getColor js/Phaser.Color
               (clj->phaser r)
               (clj->phaser g)
               (clj->phaser b)))))

(defn get-color-32-
  "Given an alpha and 3 color values this will return an integer representation of it.

  Parameters:
    * a (number) - The alpha color component, in the range 0 - 255.
    * r (number) - The red color component, in the range 0 - 255.
    * g (number) - The green color component, in the range 0 - 255.
    * b (number) - The blue color component, in the range 0 - 255.

  Returns:  number - A native color value integer (format: 0xAARRGGBB)."
  ([a r g b]
   (phaser->clj
    (.getColor32 js/Phaser.Color
                 (clj->phaser a)
                 (clj->phaser r)
                 (clj->phaser g)
                 (clj->phaser b)))))

(defn get-green-
  "Given a native color value (in the format 0xAARRGGBB) this will return the Green component, as a value between 0 and 255.

  Parameters:
    * color (number) - In the format 0xAARRGGBB.

  Returns:  number - The Green component of the color, will be between 0 and 255 (0 being no color, 255 full Green)."
  ([color]
   (phaser->clj
    (.getGreen js/Phaser.Color
               (clj->phaser color)))))

(defn get-random-color-
  "Returns a random color value between black and white
  Set the min value to start each channel from the given offset.
  Set the max value to restrict the maximum color used per channel.

  Parameters:
    * min (number) - The lowest value to use for the color.
    * max (number) - The highest value to use for the color.
    * alpha (number) - The alpha value of the returning color (default 255 = fully opaque).

  Returns:  number - 32-bit color value with alpha."
  ([min max alpha]
   (phaser->clj
    (.getRandomColor js/Phaser.Color
                     (clj->phaser min)
                     (clj->phaser max)
                     (clj->phaser alpha)))))

(defn get-red-
  "Given a native color value (in the format 0xAARRGGBB) this will return the Red component, as a value between 0 and 255.

  Parameters:
    * color (number) - In the format 0xAARRGGBB.

  Returns:  number - The Red component of the color, will be between 0 and 255 (0 being no color, 255 full Red)."
  ([color]
   (phaser->clj
    (.getRed js/Phaser.Color
             (clj->phaser color)))))

(defn get-rgb-
  "Return the component parts of a color as an Object with the properties alpha, red, green, blue.

  Alpha will only be set if it exist in the given color (0xAARRGGBB)

  Parameters:
    * color (number) - Color in RGB (0xRRGGBB) or ARGB format (0xAARRGGBB).

  Returns:  object - An Object with properties: alpha, red, green, blue (also r, g, b and a). Alpha will only be present if a color value > 16777215 was given."
  ([color]
   (phaser->clj
    (.getRGB js/Phaser.Color
             (clj->phaser color)))))

(defn get-web-rgb-
  "Returns a CSS friendly string value from the given color.

  Parameters:
    * color (number | Object) - Color in RGB (0xRRGGBB), ARGB format (0xAARRGGBB) or an Object with r, g, b, a properties.

  Returns:  string - A string in the format: 'rgba(r,g,b,a)'"
  ([color]
   (phaser->clj
    (.getWebRGB js/Phaser.Color
                (clj->phaser color)))))

(defn hex-to-color-
  "Converts a hex string into a Phaser Color object.

  The hex string can supplied as `'#0033ff'` or the short-hand format of `'#03f'`; it can begin with an optional '#' or '0x', or be unprefixed.    

  An alpha channel is _not_ supported.

  Parameters:
    * hex (string) - The color string in a hex format.
    * out (object) {optional} - An object into which 3 properties will be created or set: r, g and b. If not provided a new object will be created.

  Returns:  object - An object with the red, green and blue values set in the r, g and b properties."
  ([hex]
   (phaser->clj
    (.hexToColor js/Phaser.Color
                 (clj->phaser hex))))
  ([hex out]
   (phaser->clj
    (.hexToColor js/Phaser.Color
                 (clj->phaser hex)
                 (clj->phaser out)))))

(defn hex-to-rgb-
  "Converts a hex string into an integer color value.

  Parameters:
    * hex (string) - The hex string to convert. Can be in the short-hand format `#03f` or `#0033ff`.

  Returns:  number - The rgb color value in the format 0xAARRGGBB."
  ([hex]
   (phaser->clj
    (.hexToRGB js/Phaser.Color
               (clj->phaser hex)))))

(defn hs-lto-rgb-
  "Converts an HSL (hue, saturation and lightness) color value to RGB.
  Conversion forumla from http://en.wikipedia.org/wiki/HSL_color_space.
  Assumes HSL values are contained in the set [0, 1] and returns r, g and b values in the set [0, 255].
  Based on code by Michael Jackson (https://github.com/mjijackson)

  Parameters:
    * h (number) - The hue, in the range 0 - 1.
    * s (number) - The saturation, in the range 0 - 1.
    * l (number) - The lightness, in the range 0 - 1.
    * out (object) {optional} - An object into which 3 properties will be created: r, g and b. If not provided a new object will be created.

  Returns:  object - An object with the red, green and blue values set in the r, g and b properties."
  ([h s l]
   (phaser->clj
    (.HSLtoRGB js/Phaser.Color
               (clj->phaser h)
               (clj->phaser s)
               (clj->phaser l))))
  ([h s l out]
   (phaser->clj
    (.HSLtoRGB js/Phaser.Color
               (clj->phaser h)
               (clj->phaser s)
               (clj->phaser l)
               (clj->phaser out)))))

(defn hs-vto-rgb-
  "Converts an HSV (hue, saturation and value) color value to RGB.
  Conversion forumla from http://en.wikipedia.org/wiki/HSL_color_space.
  Assumes HSV values are contained in the set [0, 1] and returns r, g and b values in the set [0, 255].
  Based on code by Michael Jackson (https://github.com/mjijackson)

  Parameters:
    * h (number) - The hue, in the range 0 - 1.
    * s (number) - The saturation, in the range 0 - 1.
    * v (number) - The value, in the range 0 - 1.
    * out (object) {optional} - An object into which 3 properties will be created: r, g and b. If not provided a new object will be created.

  Returns:  object - An object with the red, green and blue values set in the r, g and b properties."
  ([h s v]
   (phaser->clj
    (.HSVtoRGB js/Phaser.Color
               (clj->phaser h)
               (clj->phaser s)
               (clj->phaser v))))
  ([h s v out]
   (phaser->clj
    (.HSVtoRGB js/Phaser.Color
               (clj->phaser h)
               (clj->phaser s)
               (clj->phaser v)
               (clj->phaser out)))))

(defn hsl-color-wheel-
  "Get HSL color wheel values in an array which will be 360 elements in size.

  Parameters:
    * s (number) {optional} - The saturation, in the range 0 - 1.
    * l (number) {optional} - The lightness, in the range 0 - 1.

  Returns:  array - An array containing 360 elements corresponding to the HSL color wheel."
  ([]
   (phaser->clj
    (.HSLColorWheel js/Phaser.Color)))
  ([s]
   (phaser->clj
    (.HSLColorWheel js/Phaser.Color
                    (clj->phaser s))))
  ([s l]
   (phaser->clj
    (.HSLColorWheel js/Phaser.Color
                    (clj->phaser s)
                    (clj->phaser l)))))

(defn hsv-color-wheel-
  "Get HSV color wheel values in an array which will be 360 elements in size.

  Parameters:
    * s (number) {optional} - The saturation, in the range 0 - 1.
    * v (number) {optional} - The value, in the range 0 - 1.

  Returns:  array - An array containing 360 elements corresponding to the HSV color wheel."
  ([]
   (phaser->clj
    (.HSVColorWheel js/Phaser.Color)))
  ([s]
   (phaser->clj
    (.HSVColorWheel js/Phaser.Color
                    (clj->phaser s))))
  ([s v]
   (phaser->clj
    (.HSVColorWheel js/Phaser.Color
                    (clj->phaser s)
                    (clj->phaser v)))))

(defn hue-to-color-
  "Converts a hue to an RGB color.
  Based on code by Michael Jackson (https://github.com/mjijackson)

  Parameters:
    * p (number) - No description
    * q (number) - No description
    * t (number) - No description

  Returns:  number - The color component value."
  ([p q t]
   (phaser->clj
    (.hueToColor js/Phaser.Color
                 (clj->phaser p)
                 (clj->phaser q)
                 (clj->phaser t)))))

(defn interpolate-color-
  "Interpolates the two given colours based on the supplied step and currentStep properties.

  Parameters:
    * color-1 (number) - The first color value.
    * color-2 (number) - The second color value.
    * steps (number) - The number of steps to run the interpolation over.
    * current-step (number) - The currentStep value. If the interpolation will take 100 steps, a currentStep value of 50 would be half-way between the two.
    * alpha (number) - The alpha of the returned color.

  Returns:  number - The interpolated color value."
  ([color-1 color-2 steps current-step alpha]
   (phaser->clj
    (.interpolateColor js/Phaser.Color
                       (clj->phaser color-1)
                       (clj->phaser color-2)
                       (clj->phaser steps)
                       (clj->phaser current-step)
                       (clj->phaser alpha)))))

(defn interpolate-color-with-rgb-
  "Interpolates the two given colours based on the supplied step and currentStep properties.

  Parameters:
    * color (number) - The first color value.
    * r (number) - The red color value, between 0 and 0xFF (255).
    * g (number) - The green color value, between 0 and 0xFF (255).
    * b (number) - The blue color value, between 0 and 0xFF (255).
    * steps (number) - The number of steps to run the interpolation over.
    * current-step (number) - The currentStep value. If the interpolation will take 100 steps, a currentStep value of 50 would be half-way between the two.

  Returns:  number - The interpolated color value."
  ([color r g b steps current-step]
   (phaser->clj
    (.interpolateColorWithRGB js/Phaser.Color
                              (clj->phaser color)
                              (clj->phaser r)
                              (clj->phaser g)
                              (clj->phaser b)
                              (clj->phaser steps)
                              (clj->phaser current-step)))))

(defn interpolate-rgb-
  "Interpolates the two given colours based on the supplied step and currentStep properties.

  Parameters:
    * r-1 (number) - The red color value, between 0 and 0xFF (255).
    * g-1 (number) - The green color value, between 0 and 0xFF (255).
    * b-1 (number) - The blue color value, between 0 and 0xFF (255).
    * r-2 (number) - The red color value, between 0 and 0xFF (255).
    * g-2 (number) - The green color value, between 0 and 0xFF (255).
    * b-2 (number) - The blue color value, between 0 and 0xFF (255).
    * steps (number) - The number of steps to run the interpolation over.
    * current-step (number) - The currentStep value. If the interpolation will take 100 steps, a currentStep value of 50 would be half-way between the two.

  Returns:  number - The interpolated color value."
  ([r-1 g-1 b-1 r-2 g-2 b-2 steps current-step]
   (phaser->clj
    (.interpolateRGB js/Phaser.Color
                     (clj->phaser r-1)
                     (clj->phaser g-1)
                     (clj->phaser b-1)
                     (clj->phaser r-2)
                     (clj->phaser g-2)
                     (clj->phaser b-2)
                     (clj->phaser steps)
                     (clj->phaser current-step)))))

(defn pack-pixel-
  "Packs the r, g, b, a components into a single integer, for use with Int32Array.
  If device is little endian then ABGR order is used. Otherwise RGBA order is used.

  Parameters:
    * r (number) - The red color component, in the range 0 - 255.
    * g (number) - The green color component, in the range 0 - 255.
    * b (number) - The blue color component, in the range 0 - 255.
    * a (number) - The alpha color component, in the range 0 - 255.

  Returns:  number - The packed color as uint32"
  ([r g b a]
   (phaser->clj
    (.packPixel js/Phaser.Color
                (clj->phaser r)
                (clj->phaser g)
                (clj->phaser b)
                (clj->phaser a)))))

(defn rg-bto-hsl-
  "Converts an RGB color value to HSL (hue, saturation and lightness).
  Conversion forumla from http://en.wikipedia.org/wiki/HSL_color_space.
  Assumes RGB values are contained in the set [0, 255] and returns h, s and l in the set [0, 1].
  Based on code by Michael Jackson (https://github.com/mjijackson)

  Parameters:
    * r (number) - The red color component, in the range 0 - 255.
    * g (number) - The green color component, in the range 0 - 255.
    * b (number) - The blue color component, in the range 0 - 255.
    * out (object) {optional} - An object into which 3 properties will be created, h, s and l. If not provided a new object will be created.

  Returns:  object - An object with the hue, saturation and lightness values set in the h, s and l properties."
  ([r g b]
   (phaser->clj
    (.RGBtoHSL js/Phaser.Color
               (clj->phaser r)
               (clj->phaser g)
               (clj->phaser b))))
  ([r g b out]
   (phaser->clj
    (.RGBtoHSL js/Phaser.Color
               (clj->phaser r)
               (clj->phaser g)
               (clj->phaser b)
               (clj->phaser out)))))

(defn rg-bto-hsv-
  "Converts an RGB color value to HSV (hue, saturation and value).
  Conversion forumla from http://en.wikipedia.org/wiki/HSL_color_space.
  Assumes RGB values are contained in the set [0, 255] and returns h, s and v in the set [0, 1].
  Based on code by Michael Jackson (https://github.com/mjijackson)

  Parameters:
    * r (number) - The red color component, in the range 0 - 255.
    * g (number) - The green color component, in the range 0 - 255.
    * b (number) - The blue color component, in the range 0 - 255.
    * out (object) {optional} - An object into which 3 properties will be created, h, s and v. If not provided a new object will be created.

  Returns:  object - An object with the hue, saturation and value set in the h, s and v properties."
  ([r g b]
   (phaser->clj
    (.RGBtoHSV js/Phaser.Color
               (clj->phaser r)
               (clj->phaser g)
               (clj->phaser b))))
  ([r g b out]
   (phaser->clj
    (.RGBtoHSV js/Phaser.Color
               (clj->phaser r)
               (clj->phaser g)
               (clj->phaser b)
               (clj->phaser out)))))

(defn rg-bto-string-
  "Converts the given color values into a string.
  If prefix was '#' it will be in the format `#RRGGBB` otherwise `0xAARRGGBB`.

  Parameters:
    * r (number) - The red color component, in the range 0 - 255.
    * g (number) - The green color component, in the range 0 - 255.
    * b (number) - The blue color component, in the range 0 - 255.
    * a (number) {optional} - The alpha color component, in the range 0 - 255.
    * prefix (string) {optional} - The prefix used in the return string. If '#' it will return `#RRGGBB`, else `0xAARRGGBB`.

  Returns:  string - A string containing the color values. If prefix was '#' it will be in the format `#RRGGBB` otherwise `0xAARRGGBB`."
  ([r g b]
   (phaser->clj
    (.RGBtoString js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g)
                  (clj->phaser b))))
  ([r g b a]
   (phaser->clj
    (.RGBtoString js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g)
                  (clj->phaser b)
                  (clj->phaser a))))
  ([r g b a prefix]
   (phaser->clj
    (.RGBtoString js/Phaser.Color
                  (clj->phaser r)
                  (clj->phaser g)
                  (clj->phaser b)
                  (clj->phaser a)
                  (clj->phaser prefix)))))

(defn to-rgba-
  "A utility to convert RGBA components to a 32 bit integer in RRGGBBAA format.

  Parameters:
    * r (number) - The red color component, in the range 0 - 255.
    * g (number) - The green color component, in the range 0 - 255.
    * b (number) - The blue color component, in the range 0 - 255.
    * a (number) - The alpha color component, in the range 0 - 255.

  Returns:  number - A RGBA-packed 32 bit integer"
  ([r g b a]
   (phaser->clj
    (.toRGBA js/Phaser.Color
             (clj->phaser r)
             (clj->phaser g)
             (clj->phaser b)
             (clj->phaser a)))))

(defn unpack-pixel-
  "Unpacks the r, g, b, a components into the specified color object, or a new
  object, for use with Int32Array. If little endian, then ABGR order is used when
  unpacking, otherwise, RGBA order is used. The resulting color object has the
  `r, g, b, a` properties which are unrelated to endianness.

  Note that the integer is assumed to be packed in the correct endianness. On little-endian
  the format is 0xAABBGGRR and on big-endian the format is 0xRRGGBBAA. If you want a
  endian-independent method, use fromRGBA(rgba) and toRGBA(r, g, b, a).

  Parameters:
    * rgba (number) - The integer, packed in endian order by packPixel.
    * out (object) {optional} - An object into which 3 properties will be created: r, g and b. If not provided a new object will be created.
    * hsl (boolean) {optional} - Also convert the rgb values into hsl?
    * hsv (boolean) {optional} - Also convert the rgb values into hsv?

  Returns:  object - An object with the red, green and blue values set in the r, g and b properties."
  ([rgba]
   (phaser->clj
    (.unpackPixel js/Phaser.Color
                  (clj->phaser rgba))))
  ([rgba out]
   (phaser->clj
    (.unpackPixel js/Phaser.Color
                  (clj->phaser rgba)
                  (clj->phaser out))))
  ([rgba out hsl]
   (phaser->clj
    (.unpackPixel js/Phaser.Color
                  (clj->phaser rgba)
                  (clj->phaser out)
                  (clj->phaser hsl))))
  ([rgba out hsl hsv]
   (phaser->clj
    (.unpackPixel js/Phaser.Color
                  (clj->phaser rgba)
                  (clj->phaser out)
                  (clj->phaser hsl)
                  (clj->phaser hsv)))))

(defn update-color-
  "Takes a color object and updates the rgba property.

  Parameters:
    * out (object) - The color object to update.

  Returns:  number - A native color value integer (format: 0xAARRGGBB)."
  ([out]
   (phaser->clj
    (.updateColor js/Phaser.Color
                  (clj->phaser out)))))

(defn value-to-color-
  "Converts a value - a 'hex' string, a 'CSS 'web' string', or a number - into red, green, blue, and alpha components.

  The value can be a string (see `hexToColor` and `webToColor` for the supported formats) or a packed integer (see `getRGB`).

  An alpha channel is _not_ supported when specifying a hex string.

  Parameters:
    * value (string | number) - The color expressed as a recognized string format or a packed integer.
    * out (object) {optional} - The object to use for the output. If not provided a new object will be created.

  Returns:  object - The (`out`) object with the red, green, blue, and alpha values set as the r/g/b/a properties."
  ([value]
   (phaser->clj
    (.valueToColor js/Phaser.Color
                   (clj->phaser value))))
  ([value out]
   (phaser->clj
    (.valueToColor js/Phaser.Color
                   (clj->phaser value)
                   (clj->phaser out)))))

(defn web-to-color-
  "Converts a CSS 'web' string into a Phaser Color object.

  The web string can be in the format `'rgb(r,g,b)'` or `'rgba(r,g,b,a)'` where r/g/b are in the range [0..255] and a is in the range [0..1].

  Parameters:
    * web (string) - The color string in CSS 'web' format.
    * out (object) {optional} - An object into which 4 properties will be created: r, g, b and a. If not provided a new object will be created.

  Returns:  object - An object with the red, green, blue and alpha values set in the r, g, b and a properties."
  ([web]
   (phaser->clj
    (.webToColor js/Phaser.Color
                 (clj->phaser web))))
  ([web out]
   (phaser->clj
    (.webToColor js/Phaser.Color
                 (clj->phaser web)
                 (clj->phaser out)))))