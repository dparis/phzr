(ns phzr.pixi
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn can-use-new-canvas-blend-modes
  "Checks whether the Canvas BlendModes are supported by the current browser for drawImage

  Returns:  Boolean - whether they are supported"
  ([pixi]
   (phaser->clj
    (.canUseNewCanvasBlendModes pixi))))

(defn get-next-power-of-two
  "Given a number, this function returns the closest number that is a power of two
  this function is taken from Starling Framework as its pretty neat ;)

  Parameters:
    * pixi (PIXI) - Targeted instance for method
    * number (Number) - -

  Returns:  Number - the closest number that is a power of two"
  ([pixi number]
   (phaser->clj
    (.getNextPowerOfTwo pixi
                        (clj->phaser number)))))

(defn hex-2rgb
  "Converts a hex color number to an [R, G, B] array

  Parameters:
    * pixi (PIXI) - Targeted instance for method
    * hex (Number) - -"
  ([pixi hex]
   (phaser->clj
    (.hex2rgb pixi
              (clj->phaser hex)))))

(defn is-power-of-two
  "checks if the given width and height make a power of two texture

  Parameters:
    * pixi (PIXI) - Targeted instance for method
    * width (Number) - -
    * height (Number) - -

  Returns:  Boolean - "
  ([pixi width height]
   (phaser->clj
    (.isPowerOfTwo pixi
                   (clj->phaser width)
                   (clj->phaser height)))))

(defn rgb-2hex
  "Converts a color as an [R, G, B] array to a hex number

  Parameters:
    * pixi (PIXI) - Targeted instance for method
    * rgb (Array) - -"
  ([pixi rgb]
   (phaser->clj
    (.rgb2hex pixi
              (clj->phaser rgb)))))