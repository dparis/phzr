(ns phzr.audio-sprite
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [get]))

(defn ->AudioSprite
  "Audio Sprites are a combination of audio files and a JSON configuration.
  The JSON follows the format of that created by https://github.com/tonistiigi/audiosprite

  Parameters:
    * game (Phaser.Game) - Reference to the current game instance.
    * key (string) - Asset key for the sound."
  ([game key]
   (js/Phaser.AudioSprite. (clj->phaser game)
                           (clj->phaser key))))

(defn get
  "Get a sound with the given name.

  Parameters:
    * audio-sprite (Phaser.AudioSprite) - Targeted instance for method
    * marker (string) - The name of sound to get.

  Returns:  Phaser.Sound - The sound instance."
  ([audio-sprite marker]
   (phaser->clj
    (.get audio-sprite
          (clj->phaser marker)))))

(defn play
  "Play a sound with the given name.

  Parameters:
    * audio-sprite (Phaser.AudioSprite) - Targeted instance for method
    * marker (string) - The name of sound to play
    * volume (number) {optional} - Volume of the sound you want to play. If none is given it will use the volume given to the Sound when it was created (which defaults to 1 if none was specified).

  Returns:  Phaser.Sound - This sound instance."
  ([audio-sprite marker]
   (phaser->clj
    (.play audio-sprite
           (clj->phaser marker))))
  ([audio-sprite marker volume]
   (phaser->clj
    (.play audio-sprite
           (clj->phaser marker)
           (clj->phaser volume)))))

(defn stop
  "Stop a sound with the given name.

  Parameters:
    * audio-sprite (Phaser.AudioSprite) - Targeted instance for method
    * marker (string) {optional} - The name of sound to stop. If none is given it will stop all sounds in the audio sprite."
  ([audio-sprite]
   (phaser->clj
    (.stop audio-sprite)))
  ([audio-sprite marker]
   (phaser->clj
    (.stop audio-sprite
           (clj->phaser marker)))))