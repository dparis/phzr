(ns phzr.key
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Key
  "If you need more fine-grained control over the handling of specific keys you can create and use Phaser.Key objects.

  Parameters:
    * game (Phaser.Game) - Current game instance.
    * keycode (number) - The key code this Key is responsible for."
  ([game keycode]
   (js/Phaser.Key. (clj->phaser game)
                   (clj->phaser keycode))))

(defn down-duration
  "Returns `true` if the Key was pressed down within the `duration` value given, or `false` if it either isn't down,
  or was pressed down longer ago than then given duration.

  Parameters:
    * key (Phaser.Key) - Targeted instance for method
    * duration (number) {optional} - The duration within which the key is considered as being just pressed. Given in ms.

  Returns:  boolean - True if the key was pressed down within the given duration."
  ([key]
   (phaser->clj
    (.downDuration key)))
  ([key duration]
   (phaser->clj
    (.downDuration key
                   (clj->phaser duration)))))

(defn reset
  "Resets the state of this Key.

  This sets isDown to false, isUp to true, resets the time to be the current time, and _enables_ the key.
  In addition, if it is a 'hard reset', it clears clears any callbacks associated with the onDown and onUp events and removes the onHoldCallback.

  Parameters:
    * key (Phaser.Key) - Targeted instance for method
    * hard (boolean) {optional} - A soft reset won't reset any events or callbacks; a hard reset will."
  ([key]
   (phaser->clj
    (.reset key)))
  ([key hard]
   (phaser->clj
    (.reset key
            (clj->phaser hard)))))

(defn up-duration
  "Returns `true` if the Key was pressed down within the `duration` value given, or `false` if it either isn't down,
  or was pressed down longer ago than then given duration.

  Parameters:
    * key (Phaser.Key) - Targeted instance for method
    * duration (number) {optional} - The duration within which the key is considered as being just released. Given in ms.

  Returns:  boolean - True if the key was released within the given duration."
  ([key]
   (phaser->clj
    (.upDuration key)))
  ([key duration]
   (phaser->clj
    (.upDuration key
                 (clj->phaser duration)))))