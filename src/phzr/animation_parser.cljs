(ns phzr.animation-parser
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn json-data-
  "Parse the JSON data and extract the animation frame data from it.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * json (object) - The JSON data from the Texture Atlas. Must be in Array format.

  Returns:  Phaser.FrameData - A FrameData object containing the parsed frames."
  ([game json]
   (phaser->clj
    (.JSONData js/Phaser.AnimationParser
               (clj->phaser game)
               (clj->phaser json)))))

(defn json-data-hash-
  "Parse the JSON data and extract the animation frame data from it.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * json (object) - The JSON data from the Texture Atlas. Must be in JSON Hash format.

  Returns:  Phaser.FrameData - A FrameData object containing the parsed frames."
  ([game json]
   (phaser->clj
    (.JSONDataHash js/Phaser.AnimationParser
                   (clj->phaser game)
                   (clj->phaser json)))))

(defn sprite-sheet-
  "Parse a Sprite Sheet and extract the animation frame data from it.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * key (string | Image) - The Game.Cache asset key of the Sprite Sheet image or an actual HTML Image element.
    * frame-width (number) - The fixed width of each frame of the animation.
    * frame-height (number) - The fixed height of each frame of the animation.
    * frame-max (number) {optional} - The total number of animation frames to extract from the Sprite Sheet. The default value of -1 means 'extract all frames'.
    * margin (number) {optional} - If the frames have been drawn with a margin, specify the amount here.
    * spacing (number) {optional} - If the frames have been drawn with spacing between them, specify the amount here.

  Returns:  Phaser.FrameData - A FrameData object containing the parsed frames."
  ([game key frame-width frame-height]
   (phaser->clj
    (.spriteSheet js/Phaser.AnimationParser
                  (clj->phaser game)
                  (clj->phaser key)
                  (clj->phaser frame-width)
                  (clj->phaser frame-height))))
  ([game key frame-width frame-height frame-max]
   (phaser->clj
    (.spriteSheet js/Phaser.AnimationParser
                  (clj->phaser game)
                  (clj->phaser key)
                  (clj->phaser frame-width)
                  (clj->phaser frame-height)
                  (clj->phaser frame-max))))
  ([game key frame-width frame-height frame-max margin]
   (phaser->clj
    (.spriteSheet js/Phaser.AnimationParser
                  (clj->phaser game)
                  (clj->phaser key)
                  (clj->phaser frame-width)
                  (clj->phaser frame-height)
                  (clj->phaser frame-max)
                  (clj->phaser margin))))
  ([game key frame-width frame-height frame-max margin spacing]
   (phaser->clj
    (.spriteSheet js/Phaser.AnimationParser
                  (clj->phaser game)
                  (clj->phaser key)
                  (clj->phaser frame-width)
                  (clj->phaser frame-height)
                  (clj->phaser frame-max)
                  (clj->phaser margin)
                  (clj->phaser spacing)))))

(defn xml-data-
  "Parse the XML data and extract the animation frame data from it.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * xml (object) - The XML data from the Texture Atlas. Must be in Starling XML format.

  Returns:  Phaser.FrameData - A FrameData object containing the parsed frames."
  ([game xml]
   (phaser->clj
    (.XMLData js/Phaser.AnimationParser
              (clj->phaser game)
              (clj->phaser xml)))))