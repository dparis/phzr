(ns phzr.component.life-span
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->LifeSpan
  "LifeSpan Component Features."
  ([]
   (js/Phaser.Component.LifeSpan.)))

(defn kill
  "Kills a Game Object. A killed Game Object has its `alive`, `exists` and `visible` properties all set to false.

  It will dispatch the `onKilled` event. You can listen to `events.onKilled` for the signal.

  Note that killing a Game Object is a way for you to quickly recycle it in an object pool, 
  it doesn't destroy the object or free it up from memory.

  If you don't need this Game Object any more you should call `destroy` instead.

  Returns:  PIXI.DisplayObject - This instance."
  ([life-span]
   (phaser->clj
    (.kill life-span))))

(defn pre-update-
  "The LifeSpan component preUpdate handler.
  Called automatically by the Game Object."
  ([]
   (phaser->clj
    (.preUpdate js/Phaser.Component.LifeSpan))))

(defn revive
  "Brings a 'dead' Game Object back to life, optionally resetting its health value in the process.

  A resurrected Game Object has its `alive`, `exists` and `visible` properties all set to true.

  It will dispatch the `onRevived` event. Listen to `events.onRevived` for the signal.

  Parameters:
    * life-span (Phaser.Component.LifeSpan) - Targeted instance for method
    * health (number) {optional} - The health to give the Game Object. Only set if the GameObject has the Health component.

  Returns:  PIXI.DisplayObject - This instance."
  ([life-span]
   (phaser->clj
    (.revive life-span)))
  ([life-span health]
   (phaser->clj
    (.revive life-span
             (clj->phaser health)))))