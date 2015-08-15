(ns phzr.touch
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Touch
  "Phaser.Touch handles touch events with your game. Note: Android 2.x only supports 1 touch event at once, no multi-touch.

  You should not normally access this class directly, but instead use a Phaser.Pointer object which normalises all game input for you.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Touch. (clj->phaser game))))

(defn add-touch-lock-callback
  "Adds a callback that is fired when a browser touchstart event is received.

  This is used internally to handle audio and video unlocking on mobile devices.

  If the callback returns 'true' then the callback is automatically deleted once invoked.

  The callback is added to the Phaser.Touch.touchLockCallbacks array and should be removed with Phaser.Touch.removeTouchLockCallback.

  Parameters:
    * touch (Phaser.Touch) - Targeted instance for method
    * callback (function) - The callback that will be called when a touchstart event is received.
    * context (object) - The context in which the callback will be called."
  ([touch callback context]
   (phaser->clj
    (.addTouchLockCallback touch
                           (clj->phaser callback)
                           (clj->phaser context)))))

(defn consume-touch-move
  "Consumes all touchmove events on the document (only enable this if you know you need it!)."
  ([touch]
   (phaser->clj
    (.consumeTouchMove touch))))

(defn on-touch-cancel
  "Touch cancel - touches that were disrupted (perhaps by moving into a plugin or browser chrome).
  Occurs for example on iOS when you put down 4 fingers and the app selector UI appears.

  Parameters:
    * touch (Phaser.Touch) - Targeted instance for method
    * event (TouchEvent) - The native event from the browser. This gets stored in Touch.event."
  ([touch event]
   (phaser->clj
    (.onTouchCancel touch
                    (clj->phaser event)))))

(defn on-touch-end
  "The handler for the touchend events.

  Parameters:
    * touch (Phaser.Touch) - Targeted instance for method
    * event (TouchEvent) - The native event from the browser. This gets stored in Touch.event."
  ([touch event]
   (phaser->clj
    (.onTouchEnd touch
                 (clj->phaser event)))))

(defn on-touch-enter
  "For touch enter and leave its a list of the touch points that have entered or left the target.
  Doesn't appear to be supported by most browsers on a canvas element yet.

  Parameters:
    * touch (Phaser.Touch) - Targeted instance for method
    * event (TouchEvent) - The native event from the browser. This gets stored in Touch.event."
  ([touch event]
   (phaser->clj
    (.onTouchEnter touch
                   (clj->phaser event)))))

(defn on-touch-leave
  "For touch enter and leave its a list of the touch points that have entered or left the target.
  Doesn't appear to be supported by most browsers on a canvas element yet.

  Parameters:
    * touch (Phaser.Touch) - Targeted instance for method
    * event (TouchEvent) - The native event from the browser. This gets stored in Touch.event."
  ([touch event]
   (phaser->clj
    (.onTouchLeave touch
                   (clj->phaser event)))))

(defn on-touch-move
  "The handler for the touchmove events.

  Parameters:
    * touch (Phaser.Touch) - Targeted instance for method
    * event (TouchEvent) - The native event from the browser. This gets stored in Touch.event."
  ([touch event]
   (phaser->clj
    (.onTouchMove touch
                  (clj->phaser event)))))

(defn on-touch-start
  "The internal method that handles the touchstart event from the browser.

  Parameters:
    * touch (Phaser.Touch) - Targeted instance for method
    * event (TouchEvent) - The native event from the browser. This gets stored in Touch.event."
  ([touch event]
   (phaser->clj
    (.onTouchStart touch
                   (clj->phaser event)))))

(defn remove-touch-lock-callback
  "Removes the callback at the defined index from the Phaser.Touch.touchLockCallbacks array

  Parameters:
    * touch (Phaser.Touch) - Targeted instance for method
    * callback (function) - The callback to be removed.
    * context (object) - The context in which the callback exists.

  Returns:  boolean - True if the callback was deleted, otherwise false."
  ([touch callback context]
   (phaser->clj
    (.removeTouchLockCallback touch
                              (clj->phaser callback)
                              (clj->phaser context)))))

(defn start
  "Starts the event listeners running."
  ([touch]
   (phaser->clj
    (.start touch))))

(defn stop
  "Stop the event listeners."
  ([touch]
   (phaser->clj
    (.stop touch))))