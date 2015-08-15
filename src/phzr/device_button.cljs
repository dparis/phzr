(ns phzr.device-button
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->DeviceButton
  "DeviceButtons belong to both `Phaser.Pointer` and `Phaser.SinglePad` (Gamepad) instances.

  For Pointers they represent the various buttons that can exist on mice and pens, such as the left button, right button,
  middle button and advanced buttons like back and forward.

  Access them via `Pointer.leftbutton`, `Pointer.rightButton` and so on.

  On Gamepads they represent all buttons on the pad: from shoulder buttons to action buttons.

  At the time of writing this there are device limitations you should be aware of:

  - On Windows, if you install a mouse driver, and its utility software allows you to customize button actions 
    (e.g., IntelliPoint and SetPoint), the middle (wheel) button, the 4th button, and the 5th button might not be set, 
    even when they are pressed.
  - On Linux (GTK), the 4th button and the 5th button are not supported.
  - On Mac OS X 10.5 there is no platform API for implementing any advanced buttons.

  Parameters:
    * parent (Phaser.Pointer | Phaser.SinglePad) - A reference to the parent of this button. Either a Pointer or a Gamepad.
    * button-code (number) - The button code this DeviceButton is responsible for."
  ([parent button-code]
   (js/Phaser.DeviceButton. (clj->phaser parent)
                            (clj->phaser button-code))))

(defn destroy
  "Destroys this DeviceButton, this disposes of the onDown, onUp and onFloat signals 
  and clears the parent and game references."
  ([device-button]
   (phaser->clj
    (.destroy device-button))))

(defn just-pressed
  "Returns the 'just pressed' state of this button.
  Just pressed is considered true if the button was pressed down within the duration given (default 250ms).

  Parameters:
    * device-button (Phaser.DeviceButton) - Targeted instance for method
    * duration (number) {optional} - The duration in ms below which the button is considered as being just pressed.

  Returns:  boolean - True if the button is just pressed otherwise false."
  ([device-button]
   (phaser->clj
    (.justPressed device-button)))
  ([device-button duration]
   (phaser->clj
    (.justPressed device-button
                  (clj->phaser duration)))))

(defn just-released
  "Returns the 'just released' state of this button.
  Just released is considered as being true if the button was released within the duration given (default 250ms).

  Parameters:
    * device-button (Phaser.DeviceButton) - Targeted instance for method
    * duration (number) {optional} - The duration in ms below which the button is considered as being just released.

  Returns:  boolean - True if the button is just released otherwise false."
  ([device-button]
   (phaser->clj
    (.justReleased device-button)))
  ([device-button duration]
   (phaser->clj
    (.justReleased device-button
                   (clj->phaser duration)))))

(defn reset
  "Resets this DeviceButton, changing it to an isUp state and resetting the duration and repeats counters."
  ([device-button]
   (phaser->clj
    (.reset device-button))))