(ns phzr.tween-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [remove update]))

(defn ->TweenManager
  "Phaser.Game has a single instance of the TweenManager through which all Tween objects are created and updated.
  Tweens are hooked into the game clock and pause system, adjusting based on the game state.

  TweenManager is based heavily on tween.js by http://soledadpenades.com.
  The difference being that tweens belong to a games instance of TweenManager, rather than to a global TWEEN object.
  It also has callbacks swapped for Signals and a few issues patched with regard to properties and completion errors.
  Please see https://github.com/sole/tween.js for a full list of contributors.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.TweenManager. (clj->phaser game))))

(defn add
  "Add a new tween into the TweenManager.

  Parameters:
    * tween-manager (Phaser.TweenManager) - Targeted instance for method
    * tween (Phaser.Tween) - The tween object you want to add.

  Returns:  Phaser.Tween - The tween object you added to the manager."
  ([tween-manager tween]
   (phaser->clj
    (.add tween-manager
          (clj->phaser tween)))))

(defn create
  "Create a tween object for a specific object. The object can be any JavaScript object or Phaser object such as Sprite.

  Parameters:
    * tween-manager (Phaser.TweenManager) - Targeted instance for method
    * object (object) - Object the tween will be run on.

  Returns:  Phaser.Tween - The newly created tween object."
  ([tween-manager object]
   (phaser->clj
    (.create tween-manager
             (clj->phaser object)))))

(defn get-all
  "Get all the tween objects in an array.

  Returns:  Array.<Phaser.Tween> - Array with all tween objects."
  ([tween-manager]
   (phaser->clj
    (.getAll tween-manager))))

(defn is-tweening
  "Checks to see if a particular Sprite is currently being tweened.

  Parameters:
    * tween-manager (Phaser.TweenManager) - Targeted instance for method
    * object (object) - The object to check for tweens against.

  Returns:  boolean - Returns true if the object is currently being tweened, false if not."
  ([tween-manager object]
   (phaser->clj
    (.isTweening tween-manager
                 (clj->phaser object)))))

(defn pause-all
  "Pauses all currently running tweens."
  ([tween-manager]
   (phaser->clj
    (.pauseAll tween-manager))))

(defn remove
  "Remove a tween from this manager.

  Parameters:
    * tween-manager (Phaser.TweenManager) - Targeted instance for method
    * tween (Phaser.Tween) - The tween object you want to remove."
  ([tween-manager tween]
   (phaser->clj
    (.remove tween-manager
             (clj->phaser tween)))))

(defn remove-all
  "Remove all tweens running and in the queue. Doesn't call any of the tween onComplete events."
  ([tween-manager]
   (phaser->clj
    (.removeAll tween-manager))))

(defn remove-from
  "Remove all tweens from a specific object, array of objects or Group.

  Parameters:
    * tween-manager (Phaser.TweenManager) - Targeted instance for method
    * obj (object | Array.<object> | Phaser.Group) - The object you want to remove the tweens from.
    * children (boolean) {optional} - If passing a group, setting this to true will remove the tweens from all of its children instead of the group itself."
  ([tween-manager obj]
   (phaser->clj
    (.removeFrom tween-manager
                 (clj->phaser obj))))
  ([tween-manager obj children]
   (phaser->clj
    (.removeFrom tween-manager
                 (clj->phaser obj)
                 (clj->phaser children)))))

(defn resume-all
  "Resumes all currently paused tweens."
  ([tween-manager]
   (phaser->clj
    (.resumeAll tween-manager))))

(defn update
  "Update all the tween objects you added to this manager.

  Returns:  boolean - Return false if there's no tween to update, otherwise return true."
  ([tween-manager]
   (phaser->clj
    (.update tween-manager))))