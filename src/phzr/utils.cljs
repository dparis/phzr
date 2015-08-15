(ns phzr.utils
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [extend]))

(defn extend-
  "This is a slightly modified version of http://api.jquery.com/jQuery.extend/

  Parameters:
    * deep (boolean) - Perform a deep copy?
    * target (object) - The target object to copy to.

  Returns:  object - The extended object."
  ([deep target]
   (phaser->clj
    (.extend js/Phaser.Utils
             (clj->phaser deep)
             (clj->phaser target)))))

(defn get-property-
  "Gets an objects property by string.

  Parameters:
    * obj (object) - The object to traverse.
    * prop (string) - The property whose value will be returned.

  Returns:  * - the value of the property or null if property isn't found ."
  ([obj prop]
   (phaser->clj
    (.getProperty js/Phaser.Utils
                  (clj->phaser obj)
                  (clj->phaser prop)))))

(defn is-plain-object-
  "This is a slightly modified version of jQuery.isPlainObject.
  A plain object is an object whose internal class property is [object Object].

  Parameters:
    * obj (object) - The object to inspect.

  Returns:  boolean - - true if the object is plain, otherwise false."
  ([obj]
   (phaser->clj
    (.isPlainObject js/Phaser.Utils
                    (clj->phaser obj)))))

(defn mixin-
  "Mixes the source object into the destination object, returning the newly modified destination object.
  Based on original code by @mudcube

  Parameters:
    * from (object) - The object to copy (the source object).
    * to (object) - The object to copy to (the destination object).

  Returns:  object - The modified destination object."
  ([from to]
   (phaser->clj
    (.mixin js/Phaser.Utils
            (clj->phaser from)
            (clj->phaser to)))))

(defn mixin-prototype-
  "Mixes in an existing mixin object with the target.

  Values in the mixin that have either `get` or `set` functions are created as properties via `defineProperty`
  _except_ if they also define a `clone` method - if a clone method is defined that is called instead and
  the result is assigned directly.

  Parameters:
    * target (object) - The target object to receive the new functions.
    * mixin (object) - The object to copy the functions from.
    * replace (boolean) {optional} - If the target object already has a matching function should it be overwritten or not?"
  ([target mixin]
   (phaser->clj
    (.mixinPrototype js/Phaser.Utils
                     (clj->phaser target)
                     (clj->phaser mixin))))
  ([target mixin replace]
   (phaser->clj
    (.mixinPrototype js/Phaser.Utils
                     (clj->phaser target)
                     (clj->phaser mixin)
                     (clj->phaser replace)))))

(defn pad-
  "JavaScript string pad http://www.webtoolkit.info/.

  Parameters:
    * str (string) - The target string.
    * len (integer) {optional} - The number of characters to be added.
    * pad (string) {optional} - The string to pad it out with (defaults to a space).
    * dir (integer) {optional} - The direction dir = 1 (left), 2 (right), 3 (both).

  Returns:  string - The padded string"
  ([str]
   (phaser->clj
    (.pad js/Phaser.Utils
          (clj->phaser str))))
  ([str len]
   (phaser->clj
    (.pad js/Phaser.Utils
          (clj->phaser str)
          (clj->phaser len))))
  ([str len pad]
   (phaser->clj
    (.pad js/Phaser.Utils
          (clj->phaser str)
          (clj->phaser len)
          (clj->phaser pad))))
  ([str len pad dir]
   (phaser->clj
    (.pad js/Phaser.Utils
          (clj->phaser str)
          (clj->phaser len)
          (clj->phaser pad)
          (clj->phaser dir)))))

(defn parse-dimension-
  "Get a unit dimension from a string.

  Parameters:
    * size (string | number) - The size to parse.
    * dimension (number) - The window dimension to check.

  Returns:  number - The parsed dimension."
  ([size dimension]
   (phaser->clj
    (.parseDimension js/Phaser.Utils
                     (clj->phaser size)
                     (clj->phaser dimension)))))

(defn random-choice-
  "Choose between one of two values randomly.

  Parameters:
    * choice-1 (any) - No description
    * choice-2 (any) - No description

  Returns:  any - The randomly selected choice"
  ([choice-1 choice-2]
   (phaser->clj
    (.randomChoice js/Phaser.Utils
                   (clj->phaser choice-1)
                   (clj->phaser choice-2)))))

(defn set-property-
  "Sets an objects property by string.

  Parameters:
    * obj (object) - The object to traverse
    * prop (string) - The property whose value will be changed

  Returns:  object - The object on which the property was set."
  ([obj prop]
   (phaser->clj
    (.setProperty js/Phaser.Utils
                  (clj->phaser obj)
                  (clj->phaser prop)))))