(ns phzr.component.bring-to-top
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->BringToTop
  "The BringToTop Component features quick access to Group sorting related methods."
  ([]
   (js/Phaser.Component.BringToTop.)))

(defn bring-to-top
  "Brings this Game Object to the top of its parents display list.
  Visually this means it will render over the top of any old child in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will bring it to the top of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([bring-to-top]
   (phaser->clj
    (.bringToTop bring-to-top))))

(defn move-down
  "Moves this Game Object down one place in its parents display list.
  This call has no effect if the Game Object is already at the bottom of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object down within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([bring-to-top]
   (phaser->clj
    (.moveDown bring-to-top))))

(defn move-up
  "Moves this Game Object up one place in its parents display list.
  This call has no effect if the Game Object is already at the top of the display list.

  If this Game Object hasn't been added to a custom Group then this method will move it one object up within the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([bring-to-top]
   (phaser->clj
    (.moveUp bring-to-top))))

(defn send-to-back
  "Sends this Game Object to the bottom of its parents display list.
  Visually this means it will render below all other children in the same Group.

  If this Game Object hasn't been added to a custom Group then this method will send it to the bottom of the Game World, 
  because the World is the root Group from which all Game Objects descend.

  Returns:  PIXI.DisplayObject - This instance."
  ([bring-to-top]
   (phaser->clj
    (.sendToBack bring-to-top))))