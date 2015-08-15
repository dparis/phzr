(ns phzr.mouse
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Mouse
  "The Mouse class is responsible for handling all aspects of mouse interaction with the browser.

  It captures and processes mouse events that happen on the game canvas object.
  It also adds a single `mouseup` listener to `window` which is used to capture the mouse being released 
  when not over the game.

  You should not normally access this class directly, but instead use a Phaser.Pointer object 
  which normalises all game input for you, including accurate button handling.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Mouse. (clj->phaser game))))

(defn on-mouse-down
  "The internal method that handles the mouse down event from the browser.

  Parameters:
    * mouse (Phaser.Mouse) - Targeted instance for method
    * event (MouseEvent) - The native event from the browser. This gets stored in Mouse.event."
  ([mouse event]
   (phaser->clj
    (.onMouseDown mouse
                  (clj->phaser event)))))

(defn on-mouse-move
  "The internal method that handles the mouse move event from the browser.

  Parameters:
    * mouse (Phaser.Mouse) - Targeted instance for method
    * event (MouseEvent) - The native event from the browser. This gets stored in Mouse.event."
  ([mouse event]
   (phaser->clj
    (.onMouseMove mouse
                  (clj->phaser event)))))

(defn on-mouse-out
  "The internal method that handles the mouse out event from the browser.

  Parameters:
    * mouse (Phaser.Mouse) - Targeted instance for method
    * event (MouseEvent) - The native event from the browser. This gets stored in Mouse.event."
  ([mouse event]
   (phaser->clj
    (.onMouseOut mouse
                 (clj->phaser event)))))

(defn on-mouse-over
  "The internal method that handles the mouse over event from the browser.

  Parameters:
    * mouse (Phaser.Mouse) - Targeted instance for method
    * event (MouseEvent) - The native event from the browser. This gets stored in Mouse.event."
  ([mouse event]
   (phaser->clj
    (.onMouseOver mouse
                  (clj->phaser event)))))

(defn on-mouse-up
  "The internal method that handles the mouse up event from the browser.

  Parameters:
    * mouse (Phaser.Mouse) - Targeted instance for method
    * event (MouseEvent) - The native event from the browser. This gets stored in Mouse.event."
  ([mouse event]
   (phaser->clj
    (.onMouseUp mouse
                (clj->phaser event)))))

(defn on-mouse-up-global
  "The internal method that handles the mouse up event from the window.

  Parameters:
    * mouse (Phaser.Mouse) - Targeted instance for method
    * event (MouseEvent) - The native event from the browser. This gets stored in Mouse.event."
  ([mouse event]
   (phaser->clj
    (.onMouseUpGlobal mouse
                      (clj->phaser event)))))

(defn on-mouse-wheel
  "The internal method that handles the mouse wheel event from the browser.

  Parameters:
    * mouse (Phaser.Mouse) - Targeted instance for method
    * event (MouseEvent) - The native event from the browser."
  ([mouse event]
   (phaser->clj
    (.onMouseWheel mouse
                   (clj->phaser event)))))

(defn pointer-lock-change
  "Internal pointerLockChange handler.

  Parameters:
    * mouse (Phaser.Mouse) - Targeted instance for method
    * event (Event) - The native event from the browser. This gets stored in Mouse.event."
  ([mouse event]
   (phaser->clj
    (.pointerLockChange mouse
                        (clj->phaser event)))))

(defn release-pointer-lock
  "Internal release pointer lock handler."
  ([mouse]
   (phaser->clj
    (.releasePointerLock mouse))))

(defn request-pointer-lock
  "If the browser supports it you can request that the pointer be locked to the browser window.
  This is classically known as 'FPS controls', where the pointer can't leave the browser until the user presses an exit key.
  If the browser successfully enters a locked state the event Phaser.Mouse.pointerLock will be dispatched and the first parameter will be 'true'."
  ([mouse]
   (phaser->clj
    (.requestPointerLock mouse))))

(defn start
  "Starts the event listeners running."
  ([mouse]
   (phaser->clj
    (.start mouse))))

(defn stop
  "Stop the event listeners."
  ([mouse]
   (phaser->clj
    (.stop mouse))))