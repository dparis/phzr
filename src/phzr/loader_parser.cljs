(ns phzr.loader-parser
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn bitmap-font-
  "Alias for xmlBitmapFont, for backwards compatibility.

  Parameters:
    * xml (object) - XML data you want to parse.
    * base-texture (PIXI.BaseTexture) - The BaseTexture this font uses.
    * x-spacing (number) {optional} - Additional horizontal spacing between the characters.
    * y-spacing (number) {optional} - Additional vertical spacing between the characters.

  Returns:  object - The parsed Bitmap Font data."
  ([xml base-texture]
   (phaser->clj
    (.bitmapFont js/Phaser.LoaderParser
                 (clj->phaser xml)
                 (clj->phaser base-texture))))
  ([xml base-texture x-spacing]
   (phaser->clj
    (.bitmapFont js/Phaser.LoaderParser
                 (clj->phaser xml)
                 (clj->phaser base-texture)
                 (clj->phaser x-spacing))))
  ([xml base-texture x-spacing y-spacing]
   (phaser->clj
    (.bitmapFont js/Phaser.LoaderParser
                 (clj->phaser xml)
                 (clj->phaser base-texture)
                 (clj->phaser x-spacing)
                 (clj->phaser y-spacing)))))

(defn json-bitmap-font-
  "Parse a Bitmap Font from a JSON file.

  Parameters:
    * json (object) - JSON data you want to parse.
    * base-texture (PIXI.BaseTexture) - The BaseTexture this font uses.
    * x-spacing (number) {optional} - Additional horizontal spacing between the characters.
    * y-spacing (number) {optional} - Additional vertical spacing between the characters.

  Returns:  object - The parsed Bitmap Font data."
  ([json base-texture]
   (phaser->clj
    (.jsonBitmapFont js/Phaser.LoaderParser
                     (clj->phaser json)
                     (clj->phaser base-texture))))
  ([json base-texture x-spacing]
   (phaser->clj
    (.jsonBitmapFont js/Phaser.LoaderParser
                     (clj->phaser json)
                     (clj->phaser base-texture)
                     (clj->phaser x-spacing))))
  ([json base-texture x-spacing y-spacing]
   (phaser->clj
    (.jsonBitmapFont js/Phaser.LoaderParser
                     (clj->phaser json)
                     (clj->phaser base-texture)
                     (clj->phaser x-spacing)
                     (clj->phaser y-spacing)))))

(defn xml-bitmap-font-
  "Parse a Bitmap Font from an XML file.

  Parameters:
    * xml (object) - XML data you want to parse.
    * base-texture (PIXI.BaseTexture) - The BaseTexture this font uses.
    * x-spacing (number) {optional} - Additional horizontal spacing between the characters.
    * y-spacing (number) {optional} - Additional vertical spacing between the characters.

  Returns:  object - The parsed Bitmap Font data."
  ([xml base-texture]
   (phaser->clj
    (.xmlBitmapFont js/Phaser.LoaderParser
                    (clj->phaser xml)
                    (clj->phaser base-texture))))
  ([xml base-texture x-spacing]
   (phaser->clj
    (.xmlBitmapFont js/Phaser.LoaderParser
                    (clj->phaser xml)
                    (clj->phaser base-texture)
                    (clj->phaser x-spacing))))
  ([xml base-texture x-spacing y-spacing]
   (phaser->clj
    (.xmlBitmapFont js/Phaser.LoaderParser
                    (clj->phaser xml)
                    (clj->phaser base-texture)
                    (clj->phaser x-spacing)
                    (clj->phaser y-spacing)))))