(ns phzr.linked-list
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [remove]))

(defn ->LinkedList
  "A basic Linked List data structure.

  This implementation _modifies_ the `prev` and `next` properties of each item added:
  - The `prev` and `next` properties must be writable and should not be used for any other purpose.
  - Items _cannot_ be added to multiple LinkedLists at the same time.
  - Only objects can be added."
  ([]
   (js/Phaser.LinkedList.)))

(defn add
  "Adds a new element to this linked list.

  Parameters:
    * linked-list (Phaser.LinkedList) - Targeted instance for method
    * item (object) - The element to add to this list. Can be a Phaser.Sprite or any other object you need to quickly iterate through.

  Returns:  object - The item that was added."
  ([linked-list item]
   (phaser->clj
    (.add linked-list
          (clj->phaser item)))))

(defn call-all
  "Calls a function on all members of this list, using the member as the context for the callback.
  The function must exist on the member.

  Parameters:
    * linked-list (Phaser.LinkedList) - Targeted instance for method
    * callback (function) - The function to call."
  ([linked-list callback]
   (phaser->clj
    (.callAll linked-list
              (clj->phaser callback)))))

(defn remove
  "Removes the given element from this linked list if it exists.

  Parameters:
    * linked-list (Phaser.LinkedList) - Targeted instance for method
    * item (object) - The item to be removed from the list."
  ([linked-list item]
   (phaser->clj
    (.remove linked-list
             (clj->phaser item)))))

(defn reset
  "Resets the first, last, next and previous node pointers in this list."
  ([linked-list]
   (phaser->clj
    (.reset linked-list))))