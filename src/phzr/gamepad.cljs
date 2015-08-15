(ns phzr.gamepad
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Gamepad
  "The Gamepad class handles gamepad input and dispatches gamepad events.

  Remember to call `gamepad.start()`.

  HTML5 GAMEPAD API SUPPORT IS AT AN EXPERIMENTAL STAGE!
  At moment of writing this (end of 2013) only Chrome supports parts of it out of the box. Firefox supports it
  via prefs flags (about:config, search gamepad). The browsers map the same controllers differently.
  This class has constants for Windows 7 Chrome mapping of XBOX 360 controller.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Gamepad. (clj->phaser game))))

(defn add-callbacks
  "Add callbacks to the main Gamepad handler to handle connect/disconnect/button down/button up/axis change/float value buttons.

  Parameters:
    * gamepad (Phaser.Gamepad) - Targeted instance for method
    * context (object) - The context under which the callbacks are run.
    * callbacks (object) - Object that takes six different callback methods:
onConnectCallback, onDisconnectCallback, onDownCallback, onUpCallback, onAxisCallback, onFloatCallback"
  ([gamepad context callbacks]
   (phaser->clj
    (.addCallbacks gamepad
                   (clj->phaser context)
                   (clj->phaser callbacks)))))

(defn destroy
  "Destroys this object and the associated event listeners."
  ([gamepad]
   (phaser->clj
    (.destroy gamepad))))

(defn is-down
  "Returns true if the button is currently pressed down, on ANY gamepad.

  Parameters:
    * gamepad (Phaser.Gamepad) - Targeted instance for method
    * button-code (number) - The buttonCode of the button to check for.

  Returns:  boolean - True if a button is currently down."
  ([gamepad button-code]
   (phaser->clj
    (.isDown gamepad
             (clj->phaser button-code)))))

(defn just-pressed
  "Returns the 'just pressed' state of a button from ANY gamepad connected. Just pressed is considered true if the button was pressed down within the duration given (default 250ms).

  Parameters:
    * gamepad (Phaser.Gamepad) - Targeted instance for method
    * button-code (number) - The buttonCode of the button to check for.
    * duration (number) {optional} - The duration below which the button is considered as being just pressed.

  Returns:  boolean - True if the button is just pressed otherwise false."
  ([gamepad button-code]
   (phaser->clj
    (.justPressed gamepad
                  (clj->phaser button-code))))
  ([gamepad button-code duration]
   (phaser->clj
    (.justPressed gamepad
                  (clj->phaser button-code)
                  (clj->phaser duration)))))

(defn reset
  "Reset all buttons/axes of all gamepads"
  ([gamepad]
   (phaser->clj
    (.reset gamepad))))

(defn set-dead-zones
  "Sets the deadZone variable for all four gamepads"
  ([gamepad]
   (phaser->clj
    (.setDeadZones gamepad))))

(defn start
  "Starts the Gamepad event handling.
  This MUST be called manually before Phaser will start polling the Gamepad API."
  ([gamepad]
   (phaser->clj
    (.start gamepad))))

(defn stop
  "Stops the Gamepad event handling."
  ([gamepad]
   (phaser->clj
    (.stop gamepad))))