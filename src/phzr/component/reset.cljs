(ns phzr.component.reset
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Reset
  "The Reset component allows a Game Object to be reset and repositioned to a new location."
  ([]
   (js/Phaser.Component.Reset.)))

(defn reset
  "Resets the Game Object.

  This moves the Game Object to the given x/y world coordinates and sets `fresh`, `exists`, 
  `visible` and `renderable` to true.

  If this Game Object has the LifeSpan component it will also set `alive` to true and `health` to the given value.

  If this Game Object has a Physics Body it will reset the Body.

  Parameters:
    * reset (Phaser.Component.Reset) - Targeted instance for method
    * x (number) - The x coordinate (in world space) to position the Game Object at.
    * y (number) - The y coordinate (in world space) to position the Game Object at.
    * health (number) {optional} - The health to give the Game Object if it has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([reset x y]
   (phaser->clj
    (.reset reset
            (clj->phaser x)
            (clj->phaser y))))
  ([reset x y health]
   (phaser->clj
    (.reset reset
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser health)))))