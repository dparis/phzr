(ns phzr.component.destroy
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Destroy
  "The Destroy component is responsible for destroying a Game Object."
  ([]
   (js/Phaser.Component.Destroy.)))

(defn destroy
  "Destroys the Game Object. This removes it from its parent group, destroys the input, event and animation handlers if present
  and nulls its reference to `game`, freeing it up for garbage collection.

  If this Game Object has the Events component it will also dispatch the `onDestroy` event.

  Parameters:
    * destroy (Phaser.Component.Destroy) - Targeted instance for method
    * destroy-children (boolean) {optional} - Should every child of this object have its destroy method called as well?"
  ([destroy]
   (phaser->clj
    (.destroy destroy)))
  ([destroy destroy-children]
   (phaser->clj
    (.destroy destroy
              (clj->phaser destroy-children)))))