(ns phzr.component.overlap
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Overlap
  "The Overlap component allows a Game Object to check if it overlaps with the bounds of another Game Object."
  ([]
   (js/Phaser.Component.Overlap.)))

(defn overlap
  "Checks to see if the bounds of this Game Object overlaps with the bounds of the given Display Object, 
  which can be a Sprite, Image, TileSprite or anything that extends those such as Button or provides a `getBounds` method and result.

  This check ignores the `hitArea` property if set and runs a `getBounds` comparison on both objects to determine the result.

  Therefore it's relatively expensive to use in large quantities, i.e. with lots of Sprites at a high frequency.
  It should be fine for low-volume testing where physics isn't required.

  Parameters:
    * overlap (Phaser.Component.Overlap) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Button | PIXI.DisplayObject) - The display object to check against.

  Returns:  boolean - True if the bounds of this Game Object intersects at any point with the bounds of the given display object."
  ([overlap display-object]
   (phaser->clj
    (.overlap overlap
              (clj->phaser display-object)))))