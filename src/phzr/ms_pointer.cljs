(ns phzr.ms-pointer
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->MSPointer
  "The MSPointer class handles Microsoft touch interactions with the game and the resulting Pointer objects.

  It will work only in Internet Explorer 10+ and Windows Store or Windows Phone 8 apps using JavaScript.
  http://msdn.microsoft.com/en-us/library/ie/hh673557(v=vs.85).aspx

  You should not normally access this class directly, but instead use a Phaser.Pointer object which 
  normalises all game input for you including accurate button handling.

  Please note that at the current time of writing Phaser does not yet support chorded button interactions:
  http://www.w3.org/TR/pointerevents/#chorded-button-interactions

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.MSPointer. (clj->phaser game))))

(defn on-pointer-down
  "The function that handles the PointerDown event.

  Parameters:
    * ms-pointer (Phaser.MSPointer) - Targeted instance for method
    * event (PointerEvent) - The native DOM event."
  ([ms-pointer event]
   (phaser->clj
    (.onPointerDown ms-pointer
                    (clj->phaser event)))))

(defn on-pointer-move
  "The function that handles the PointerMove event.

  Parameters:
    * ms-pointer (Phaser.MSPointer) - Targeted instance for method
    * event (PointerEvent) - The native DOM event."
  ([ms-pointer event]
   (phaser->clj
    (.onPointerMove ms-pointer
                    (clj->phaser event)))))

(defn on-pointer-up
  "The function that handles the PointerUp event.

  Parameters:
    * ms-pointer (Phaser.MSPointer) - Targeted instance for method
    * event (PointerEvent) - The native DOM event."
  ([ms-pointer event]
   (phaser->clj
    (.onPointerUp ms-pointer
                  (clj->phaser event)))))

(defn start
  "Starts the event listeners running."
  ([ms-pointer]
   (phaser->clj
    (.start ms-pointer))))

(defn stop
  "Stop the event listeners."
  ([ms-pointer]
   (phaser->clj
    (.stop ms-pointer))))