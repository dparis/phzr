(ns phzr.single-pad
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->SinglePad
  "A single Phaser Gamepad

  Parameters:
    * game (Phaser.Game) - Current game instance.
    * pad-parent (object) - The parent Phaser.Gamepad object (all gamepads reside under this)"
  ([game pad-parent]
   (js/Phaser.SinglePad. (clj->phaser game)
                         (clj->phaser pad-parent))))

(defn add-callbacks
  "Add callbacks to this Gamepad to handle connect / disconnect / button down / button up / axis change / float value buttons.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * context (object) - The context under which the callbacks are run.
    * callbacks (object) - Object that takes six different callbak methods:
onConnectCallback, onDisconnectCallback, onDownCallback, onUpCallback, onAxisCallback, onFloatCallback"
  ([single-pad context callbacks]
   (phaser->clj
    (.addCallbacks single-pad
                   (clj->phaser context)
                   (clj->phaser callbacks)))))

(defn axis
  "Returns value of requested axis.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * axis-code (number) - The index of the axis to check

  Returns:  number - Axis value if available otherwise false"
  ([single-pad axis-code]
   (phaser->clj
    (.axis single-pad
           (clj->phaser axis-code)))))

(defn button-value
  "Returns the value of a gamepad button. Intended mainly for cases when you have floating button values, for example
  analog trigger buttons on the XBOX 360 controller.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * button-code (number) - The buttonCode of the button to check.

  Returns:  number - Button value if available otherwise null. Be careful as this can incorrectly evaluate to 0."
  ([single-pad button-code]
   (phaser->clj
    (.buttonValue single-pad
                  (clj->phaser button-code)))))

(defn connect
  "Gamepad connect function, should be called by Phaser.Gamepad.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * raw-pad (object) - The raw gamepad object"
  ([single-pad raw-pad]
   (phaser->clj
    (.connect single-pad
              (clj->phaser raw-pad)))))

(defn destroy
  "Destroys this object and associated callback references."
  ([single-pad]
   (phaser->clj
    (.destroy single-pad))))

(defn disconnect
  "Gamepad disconnect function, should be called by Phaser.Gamepad."
  ([single-pad]
   (phaser->clj
    (.disconnect single-pad))))

(defn get-button
  "Gets a DeviceButton object from this controller to be stored and referenced locally.
  The DeviceButton object can then be polled, have events attached to it, etc.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * button-code (number) - The buttonCode of the button, i.e. Phaser.Gamepad.BUTTON_0, Phaser.Gamepad.XBOX360_A, etc.

  Returns:  Phaser.DeviceButton - The DeviceButton object which you can store locally and reference directly."
  ([single-pad button-code]
   (phaser->clj
    (.getButton single-pad
                (clj->phaser button-code)))))

(defn is-down
  "Returns true if the button is pressed down.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * button-code (number) - The buttonCode of the button to check.

  Returns:  boolean - True if the button is pressed down."
  ([single-pad button-code]
   (phaser->clj
    (.isDown single-pad
             (clj->phaser button-code)))))

(defn is-up
  "Returns true if the button is not currently pressed.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * button-code (number) - The buttonCode of the button to check.

  Returns:  boolean - True if the button is not currently pressed down."
  ([single-pad button-code]
   (phaser->clj
    (.isUp single-pad
           (clj->phaser button-code)))))

(defn just-pressed
  "Returns the 'just pressed' state of a button from this gamepad. Just pressed is considered true if the button was pressed down within the duration given (default 250ms).

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * button-code (number) - The buttonCode of the button to check for.
    * duration (number) {optional} - The duration below which the button is considered as being just pressed.

  Returns:  boolean - True if the button is just pressed otherwise false."
  ([single-pad button-code]
   (phaser->clj
    (.justPressed single-pad
                  (clj->phaser button-code))))
  ([single-pad button-code duration]
   (phaser->clj
    (.justPressed single-pad
                  (clj->phaser button-code)
                  (clj->phaser duration)))))

(defn just-released
  "Returns the 'just released' state of a button from this gamepad. Just released is considered as being true if the button was released within the duration given (default 250ms).

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * button-code (number) - The buttonCode of the button to check for.
    * duration (number) {optional} - The duration below which the button is considered as being just released.

  Returns:  boolean - True if the button is just released otherwise false."
  ([single-pad button-code]
   (phaser->clj
    (.justReleased single-pad
                   (clj->phaser button-code))))
  ([single-pad button-code duration]
   (phaser->clj
    (.justReleased single-pad
                   (clj->phaser button-code)
                   (clj->phaser duration)))))

(defn poll-status
  "Main update function called by Phaser.Gamepad."
  ([single-pad]
   (phaser->clj
    (.pollStatus single-pad))))

(defn process-axis-change
  "Handles changes in axis.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * axis-state (object) - State of the relevant axis"
  ([single-pad axis-state]
   (phaser->clj
    (.processAxisChange single-pad
                        (clj->phaser axis-state)))))

(defn process-button-down
  "Handles button down press.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * button-code (number) - Which buttonCode of this button
    * value (object) - Button value"
  ([single-pad button-code value]
   (phaser->clj
    (.processButtonDown single-pad
                        (clj->phaser button-code)
                        (clj->phaser value)))))

(defn process-button-float
  "Handles buttons with floating values (like analog buttons that acts almost like an axis but still registers like a button)

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * button-code (number) - Which buttonCode of this button
    * value (object) - Button value (will range somewhere between 0 and 1, but not specifically 0 or 1."
  ([single-pad button-code value]
   (phaser->clj
    (.processButtonFloat single-pad
                         (clj->phaser button-code)
                         (clj->phaser value)))))

(defn process-button-up
  "Handles button release.

  Parameters:
    * single-pad (Phaser.SinglePad) - Targeted instance for method
    * button-code (number) - Which buttonCode of this button
    * value (object) - Button value"
  ([single-pad button-code value]
   (phaser->clj
    (.processButtonUp single-pad
                      (clj->phaser button-code)
                      (clj->phaser value)))))

(defn reset
  "Reset all buttons/axes of this gamepad."
  ([single-pad]
   (phaser->clj
    (.reset single-pad))))