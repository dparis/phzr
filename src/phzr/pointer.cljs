(ns phzr.pointer
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Pointer
  "A Pointer object is used by the Mouse, Touch and MSPoint managers and represents a single finger on the touch screen.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * id (number) - The ID of the Pointer object within the game. Each game can have up to 10 active pointers."
  ([game id]
   (js/Phaser.Pointer. (clj->phaser game)
                       (clj->phaser id))))

(defn const
  [k]
  (when-let [cn (get phzr.impl.accessors.pointer/pointer-constants k)]
    (aget js/Phaser.Pointer cn)))

(defn just-pressed
  "The Pointer is considered justPressed if the time it was pressed onto the touchscreen or clicked is less than justPressedRate.
  Note that calling justPressed doesn't reset the pressed status of the Pointer, it will return `true` for as long as the duration is valid.
  If you wish to check if the Pointer was pressed down just once then see the Sprite.events.onInputDown event.

  Parameters:
    * pointer (Phaser.Pointer) - Targeted instance for method
    * duration (number) {optional} - The time to check against. If none given it will use InputManager.justPressedRate.

  Returns:  boolean - true if the Pointer was pressed down within the duration given."
  ([pointer]
   (phaser->clj
    (.justPressed pointer)))
  ([pointer duration]
   (phaser->clj
    (.justPressed pointer
                  (clj->phaser duration)))))

(defn just-released
  "The Pointer is considered justReleased if the time it left the touchscreen is less than justReleasedRate.
  Note that calling justReleased doesn't reset the pressed status of the Pointer, it will return `true` for as long as the duration is valid.
  If you wish to check if the Pointer was released just once then see the Sprite.events.onInputUp event.

  Parameters:
    * pointer (Phaser.Pointer) - Targeted instance for method
    * duration (number) {optional} - The time to check against. If none given it will use InputManager.justReleasedRate.

  Returns:  boolean - true if the Pointer was released within the duration given."
  ([pointer]
   (phaser->clj
    (.justReleased pointer)))
  ([pointer duration]
   (phaser->clj
    (.justReleased pointer
                   (clj->phaser duration)))))

(defn leave
  "Called when the Pointer leaves the target area.

  Parameters:
    * pointer (Phaser.Pointer) - Targeted instance for method
    * event (MouseEvent | PointerEvent | TouchEvent) - The event passed up from the input handler."
  ([pointer event]
   (phaser->clj
    (.leave pointer
            (clj->phaser event)))))

(defn move
  "Called when the Pointer is moved.

  Parameters:
    * pointer (Phaser.Pointer) - Targeted instance for method
    * event (MouseEvent | PointerEvent | TouchEvent) - The event passed up from the input handler.
    * from-click (boolean) {optional} - Was this called from the click event?"
  ([pointer event]
   (phaser->clj
    (.move pointer
           (clj->phaser event))))
  ([pointer event from-click]
   (phaser->clj
    (.move pointer
           (clj->phaser event)
           (clj->phaser from-click)))))

(defn reset
  "Resets the Pointer properties. Called by InputManager.reset when you perform a State change."
  ([pointer]
   (phaser->clj
    (.reset pointer))))

(defn reset-movement
  "Resets the movementX and movementY properties. Use in your update handler after retrieving the values."
  ([pointer]
   (phaser->clj
    (.resetMovement pointer))))

(defn start
  "Called when the Pointer is pressed onto the touchscreen.

  Parameters:
    * pointer (Phaser.Pointer) - Targeted instance for method
    * event (any) - The DOM event from the browser."
  ([pointer event]
   (phaser->clj
    (.start pointer
            (clj->phaser event)))))

(defn stop
  "Called when the Pointer leaves the touchscreen.

  Parameters:
    * pointer (Phaser.Pointer) - Targeted instance for method
    * event (MouseEvent | PointerEvent | TouchEvent) - The event passed up from the input handler."
  ([pointer event]
   (phaser->clj
    (.stop pointer
           (clj->phaser event)))))

(defn update
  "Called by the Input Manager."
  ([pointer]
   (phaser->clj
    (.update pointer))))