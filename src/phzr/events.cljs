(ns phzr.events
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Events
  "The Events component is a collection of events fired by the parent game object.

  For example to tell when a Sprite has been added to a new group:

  `sprite.events.onAddedToGroup.add(yourFunction, this);`

  Where `yourFunction` is the function you want called when this event occurs.

  The Input-related events will only be dispatched if the Sprite has had `inputEnabled` set to `true`
  and the Animation-related events only apply to game objects with animations like {@link Phaser.Sprite}.

  Parameters:
    * sprite (Phaser.Sprite) - A reference to the game object / Sprite that owns this Events object."
  ([sprite]
   (js/Phaser.Events. (clj->phaser sprite))))

(defn destroy
  "Removes all events."
  ([events]
   (phaser->clj
    (.destroy events))))