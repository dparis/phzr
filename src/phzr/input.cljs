(ns phzr.input
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Input
  "Phaser.Input is the Input Manager for all types of Input across Phaser, including mouse, keyboard, touch and MSPointer.
  The Input manager is updated automatically by the core game loop.

  Parameters:
    * game (Phaser.Game) - Current game instance."
  ([game]
   (js/Phaser.Input. (clj->phaser game))))

(defn add-move-callback
  "Adds a callback that is fired every time the activePointer receives a DOM move event such as a mousemove or touchmove.

  The callback will be sent 4 parameters: The Pointer that moved, the x position of the pointer, the y position and the down state.

  It will be called every time the activePointer moves, which in a multi-touch game can be a lot of times, so this is best
  to only use if you've limited input to a single pointer (i.e. mouse or touch).

  The callback is added to the Phaser.Input.moveCallbacks array and should be removed with Phaser.Input.deleteMoveCallback.

  Parameters:
    * input (Phaser.Input) - Targeted instance for method
    * callback (function) - The callback that will be called each time the activePointer receives a DOM move event.
    * context (object) - The context in which the callback will be called."
  ([input callback context]
   (phaser->clj
    (.addMoveCallback input
                      (clj->phaser callback)
                      (clj->phaser context)))))

(defn add-pointer
  "Add a new Pointer object to the Input Manager.
  By default Input creates 3 pointer objects: `mousePointer` (not include in part of general pointer pool), `pointer1` and `pointer2`.
  This method adds an additional pointer, up to a maximum of Phaser.Input.MAX_POINTERS (default of 10).

  Returns:  [Phaser.Pointer | null] - The new Pointer object that was created; null if a new pointer could not be added."
  ([input]
   (phaser->clj
    (.addPointer input))))

(defn delete-move-callback
  "Removes the callback from the Phaser.Input.moveCallbacks array.

  Parameters:
    * input (Phaser.Input) - Targeted instance for method
    * callback (function) - The callback to be removed.
    * context (object) - The context in which the callback exists."
  ([input callback context]
   (phaser->clj
    (.deleteMoveCallback input
                         (clj->phaser callback)
                         (clj->phaser context)))))

(defn destroy
  "Stops all of the Input Managers from running."
  ([input]
   (phaser->clj
    (.destroy input))))

(defn get-local-position
  "This will return the local coordinates of the specified displayObject based on the given Pointer.

  Parameters:
    * input (Phaser.Input) - Targeted instance for method
    * display-object (Phaser.Sprite | Phaser.Image) - The DisplayObject to get the local coordinates for.
    * pointer (Phaser.Pointer) - The Pointer to use in the check against the displayObject.

  Returns:  Phaser.Point - A point containing the coordinates of the Pointer position relative to the DisplayObject."
  ([input display-object pointer]
   (phaser->clj
    (.getLocalPosition input
                       (clj->phaser display-object)
                       (clj->phaser pointer)))))

(defn get-pointer
  "Get the first Pointer with the given active state.

  Parameters:
    * input (Phaser.Input) - Targeted instance for method
    * is-active (boolean) {optional} - The state the Pointer should be in - active or inactive?

  Returns:  Phaser.Pointer - A Pointer object or null if no Pointer object matches the requested state."
  ([input]
   (phaser->clj
    (.getPointer input)))
  ([input is-active]
   (phaser->clj
    (.getPointer input
                 (clj->phaser is-active)))))

(defn get-pointer-from-id
  "Get the Pointer object whos `pointerId` property matches the given value.

  The pointerId property is not set until the Pointer has been used at least once, as its populated by the DOM event.
  Also it can change every time you press the pointer down if the browser recycles it.

  Parameters:
    * input (Phaser.Input) - Targeted instance for method
    * pointer-id (number) - The `pointerId` (not 'id') value to search for.

  Returns:  Phaser.Pointer - A Pointer object or null if no Pointer object matches the requested identifier."
  ([input pointer-id]
   (phaser->clj
    (.getPointerFromId input
                       (clj->phaser pointer-id)))))

(defn get-pointer-from-identifier
  "Get the Pointer object whos `identifier` property matches the given identifier value.

  The identifier property is not set until the Pointer has been used at least once, as its populated by the DOM event.
  Also it can change every time you press the pointer down, and is not fixed once set.
  Note: Not all browsers set the identifier property and it's not part of the W3C spec, so you may need getPointerFromId instead.

  Parameters:
    * input (Phaser.Input) - Targeted instance for method
    * identifier (number) - The Pointer.identifier value to search for.

  Returns:  Phaser.Pointer - A Pointer object or null if no Pointer object matches the requested identifier."
  ([input identifier]
   (phaser->clj
    (.getPointerFromIdentifier input
                               (clj->phaser identifier)))))

(defn hit-test
  "Tests if the pointer hits the given object.

  Parameters:
    * input (Phaser.Input) - Targeted instance for method
    * display-object (DisplayObject) - The displayObject to test for a hit.
    * pointer (Phaser.Pointer) - The pointer to use for the test.
    * local-point (Phaser.Point) - The local translated point."
  ([input display-object pointer local-point]
   (phaser->clj
    (.hitTest input
              (clj->phaser display-object)
              (clj->phaser pointer)
              (clj->phaser local-point)))))

(defn reset
  "Reset all of the Pointers and Input states.

  The optional `hard` parameter will reset any events or callbacks that may be bound.
  Input.reset is called automatically during a State change or if a game loses focus / visibility.
  To control control the reset manually set {@link Phaser.InputManager.resetLocked} to `true`.

  Parameters:
    * input (Phaser.Input) - Targeted instance for method
    * hard (boolean) {optional} - A soft reset won't reset any events or callbacks that are bound. A hard reset will."
  ([input]
   (phaser->clj
    (.reset input)))
  ([input hard]
   (phaser->clj
    (.reset input
            (clj->phaser hard)))))

(defn reset-speed
  "Resets the speed and old position properties.

  Parameters:
    * input (Phaser.Input) - Targeted instance for method
    * x (number) - Sets the oldPosition.x value.
    * y (number) - Sets the oldPosition.y value."
  ([input x y]
   (phaser->clj
    (.resetSpeed input
                 (clj->phaser x)
                 (clj->phaser y)))))