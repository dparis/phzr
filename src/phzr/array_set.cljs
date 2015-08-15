(ns phzr.array-set
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [remove]))

(defn ->ArraySet
  "ArraySet is a Set data structure (items must be unique within the set) that also maintains order.
  This allows specific items to be easily added or removed from the Set.

  Item equality (and uniqueness) is determined by the behavior of `Array.indexOf`.

  This used primarily by the Input subsystem.

  Parameters:
    * list (Array.<any>) {optional} - The backing array: if specified the items in the list _must_ be unique, per `Array.indexOf`, and the ownership of the array _should_ be relinquished to the ArraySet."
  ([]
   (js/Phaser.ArraySet.))
  ([list]
   (js/Phaser.ArraySet. (clj->phaser list))))

(defn add
  "Adds a new element to the end of the list.
  If the item already exists in the list it is not moved.

  Parameters:
    * array-set (Phaser.ArraySet) - Targeted instance for method
    * item (any) - The element to add to this list.

  Returns:  any - The item that was added."
  ([array-set item]
   (phaser->clj
    (.add array-set
          (clj->phaser item)))))

(defn call-all
  "Calls a function on all members of this list, using the member as the context for the callback.

  If the `key` property is present it must be a function.
  The function is invoked using the item as the context.

  Parameters:
    * array-set (Phaser.ArraySet) - Targeted instance for method
    * key (string) - The name of the property with the function to call.
    * parameter (*) - Additional parameters that will be passed to the callback."
  ([array-set key parameter]
   (phaser->clj
    (.callAll array-set
              (clj->phaser key)
              (clj->phaser parameter)))))

(defn exists
  "Checks for the item within this list.

  Parameters:
    * array-set (Phaser.ArraySet) - Targeted instance for method
    * item (any) - The element to get the list index for.

  Returns:  boolean - True if the item is found in the list, otherwise false."
  ([array-set item]
   (phaser->clj
    (.exists array-set
             (clj->phaser item)))))

(defn get-by-key
  "Gets an item from the set based on the property strictly equaling the value given.
  Returns null if not found.

  Parameters:
    * array-set (Phaser.ArraySet) - Targeted instance for method
    * property (string) - The property to check against the value.
    * value (any) - The value to check if the property strictly equals.

  Returns:  any - The item that was found, or null if nothing matched."
  ([array-set property value]
   (phaser->clj
    (.getByKey array-set
               (clj->phaser property)
               (clj->phaser value)))))

(defn get-index
  "Gets the index of the item in the list, or -1 if it isn't in the list.

  Parameters:
    * array-set (Phaser.ArraySet) - Targeted instance for method
    * item (any) - The element to get the list index for.

  Returns:  integer - The index of the item or -1 if not found."
  ([array-set item]
   (phaser->clj
    (.getIndex array-set
               (clj->phaser item)))))

(defn remove
  "Removes the given element from this list if it exists.

  Parameters:
    * array-set (Phaser.ArraySet) - Targeted instance for method
    * item (any) - The item to be removed from the list.

  Returns:  any - item - The item that was removed."
  ([array-set item]
   (phaser->clj
    (.remove array-set
             (clj->phaser item)))))

(defn remove-all
  "Removes every member from this ArraySet and optionally destroys it.

  Parameters:
    * array-set (Phaser.ArraySet) - Targeted instance for method
    * destroy (boolean) {optional} - Call `destroy` on each member as it's removed from this set."
  ([array-set]
   (phaser->clj
    (.removeAll array-set)))
  ([array-set destroy]
   (phaser->clj
    (.removeAll array-set
                (clj->phaser destroy)))))

(defn reset
  "Removes all the items."
  ([array-set]
   (phaser->clj
    (.reset array-set))))

(defn set-all
  "Sets the property `key` to the given value on all members of this list.

  Parameters:
    * array-set (Phaser.ArraySet) - Targeted instance for method
    * key (any) - The property of the item to set.
    * value (any) - The value to set the property to."
  ([array-set key value]
   (phaser->clj
    (.setAll array-set
             (clj->phaser key)
             (clj->phaser value)))))