(ns phzr.keyboard
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Keyboard
  "The Keyboard class monitors keyboard input and dispatches keyboard events.

  _Be aware_ that many keyboards are unable to process certain combinations of keys due to hardware
  limitations known as ghosting. Full details here: http://www.html5gamedevs.com/topic/4876-impossible-to-use-more-than-2-keyboard-input-buttons-at-the-same-time/

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Keyboard. (clj->phaser game))))

(defn add-callbacks
  "Add callbacks to the Keyboard handler so that each time a key is pressed down or released the callbacks are activated.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * context (object) - The context under which the callbacks are run.
    * on-down (function) {optional} - This callback is invoked every time a key is pressed down.
    * on-up (function) {optional} - This callback is invoked every time a key is released.
    * on-press (function) {optional} - This callback is invoked every time the onkeypress event is raised."
  ([keyboard context]
   (phaser->clj
    (.addCallbacks keyboard
                   (clj->phaser context))))
  ([keyboard context on-down]
   (phaser->clj
    (.addCallbacks keyboard
                   (clj->phaser context)
                   (clj->phaser on-down))))
  ([keyboard context on-down on-up]
   (phaser->clj
    (.addCallbacks keyboard
                   (clj->phaser context)
                   (clj->phaser on-down)
                   (clj->phaser on-up))))
  ([keyboard context on-down on-up on-press]
   (phaser->clj
    (.addCallbacks keyboard
                   (clj->phaser context)
                   (clj->phaser on-down)
                   (clj->phaser on-up)
                   (clj->phaser on-press)))))

(defn add-key
  "If you need more fine-grained control over a Key you can create a new Phaser.Key object via this method.
  The Key object can then be polled, have events attached to it, etc.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * keycode (number) - The keycode of the key, i.e. Phaser.Keyboard.UP or Phaser.Keyboard.SPACEBAR

  Returns:  Phaser.Key - The Key object which you can store locally and reference directly."
  ([keyboard keycode]
   (phaser->clj
    (.addKey keyboard
             (clj->phaser keycode)))))

(defn add-key-capture
  "By default when a key is pressed Phaser will not stop the event from propagating up to the browser.
  There are some keys this can be annoying for, like the arrow keys or space bar, which make the browser window scroll.
  You can use addKeyCapture to consume the keyboard event for specific keys so it doesn't bubble up to the the browser.
  Pass in either a single keycode or an array/hash of keycodes.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * keycode (number | array | object) - Either a single numeric keycode or an array/hash of keycodes: [65, 67, 68]."
  ([keyboard keycode]
   (phaser->clj
    (.addKeyCapture keyboard
                    (clj->phaser keycode)))))

(defn add-keys
  "A practical way to create an object containing user selected hotkeys.

  For example: `addKeys( { 'up': Phaser.Keyboard.W, 'down': Phaser.Keyboard.S, 'left': Phaser.Keyboard.A, 'right': Phaser.Keyboard.D } );`

  Would return an object containing the properties `up`, `down`, `left` and `right` that you could poll just like a Phaser.Key object.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * keys (object) - A key mapping object, i.e. `{ 'up': Phaser.Keyboard.W, 'down': Phaser.Keyboard.S }` or `{ 'up': 52, 'down': 53 }`.

  Returns:  object - An object containing user selected properties"
  ([keyboard keys]
   (phaser->clj
    (.addKeys keyboard
              (clj->phaser keys)))))

(defn clear-captures
  "Clear all set key captures."
  ([keyboard]
   (phaser->clj
    (.clearCaptures keyboard))))

(defn create-cursor-keys
  "Creates and returns an object containing 4 hotkeys for Up, Down, Left and Right.

  Returns:  object - An object containing properties: up, down, left and right. Which can be polled like any other Phaser.Key object."
  ([keyboard]
   (phaser->clj
    (.createCursorKeys keyboard))))

(defn destroy
  "Stops the Keyboard event listeners from running (keydown and keyup). They are removed from the window.
  Also clears all key captures and currently created Key objects."
  ([keyboard]
   (phaser->clj
    (.destroy keyboard))))

(defn down-duration
  "Returns `true` if the Key was pressed down within the `duration` value given, or `false` if it either isn't down,
  or was pressed down longer ago than then given duration.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * keycode (number) - The keycode of the key to check, i.e. Phaser.Keyboard.UP or Phaser.Keyboard.SPACEBAR
    * duration (number) {optional} - The duration within which the key is considered as being just pressed. Given in ms.

  Returns:  boolean - True if the key was pressed down within the given duration, false if not or null if the Key wasn't found."
  ([keyboard keycode]
   (phaser->clj
    (.downDuration keyboard
                   (clj->phaser keycode))))
  ([keyboard keycode duration]
   (phaser->clj
    (.downDuration keyboard
                   (clj->phaser keycode)
                   (clj->phaser duration)))))

(defn is-down
  "Returns true of the key is currently pressed down. Note that it can only detect key presses on the web browser.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * keycode (number) - The keycode of the key to check, i.e. Phaser.Keyboard.UP or Phaser.Keyboard.SPACEBAR

  Returns:  boolean - True if the key is currently down, false if not or null if the Key wasn't found."
  ([keyboard keycode]
   (phaser->clj
    (.isDown keyboard
             (clj->phaser keycode)))))

(defn remove-key
  "Removes a Key object from the Keyboard manager.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * keycode (number) - The keycode of the key to remove, i.e. Phaser.Keyboard.UP or Phaser.Keyboard.SPACEBAR"
  ([keyboard keycode]
   (phaser->clj
    (.removeKey keyboard
                (clj->phaser keycode)))))

(defn remove-key-capture
  "Removes an existing key capture.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * keycode (number) - No description"
  ([keyboard keycode]
   (phaser->clj
    (.removeKeyCapture keyboard
                       (clj->phaser keycode)))))

(defn reset
  "Resets all Keys.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * hard (boolean) {optional} - A soft reset won't reset any events or callbacks that are bound to the Keys. A hard reset will."
  ([keyboard]
   (phaser->clj
    (.reset keyboard)))
  ([keyboard hard]
   (phaser->clj
    (.reset keyboard
            (clj->phaser hard)))))

(defn start
  "Starts the Keyboard event listeners running (keydown and keyup). They are attached to the window.
  This is called automatically by Phaser.Input and should not normally be invoked directly."
  ([keyboard]
   (phaser->clj
    (.start keyboard))))

(defn stop
  "Stops the Keyboard event listeners from running (keydown, keyup and keypress). They are removed from the window."
  ([keyboard]
   (phaser->clj
    (.stop keyboard))))

(defn up-duration
  "Returns `true` if the Key was pressed down within the `duration` value given, or `false` if it either isn't down,
  or was pressed down longer ago than then given duration.

  Parameters:
    * keyboard (Phaser.Keyboard) - Targeted instance for method
    * keycode (number) - The keycode of the key to check, i.e. Phaser.Keyboard.UP or Phaser.Keyboard.SPACEBAR
    * duration (number) {optional} - The duration within which the key is considered as being just released. Given in ms.

  Returns:  boolean - True if the key was released within the given duration, false if not or null if the Key wasn't found."
  ([keyboard keycode]
   (phaser->clj
    (.upDuration keyboard
                 (clj->phaser keycode))))
  ([keyboard keycode duration]
   (phaser->clj
    (.upDuration keyboard
                 (clj->phaser keycode)
                 (clj->phaser duration)))))

(defn update
  "Updates all currently defined keys."
  ([keyboard]
   (phaser->clj
    (.update keyboard))))