(ns phzr.timer-event
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->TimerEvent
  "A TimerEvent is a single event that is processed by a Phaser.Timer.

  It consists of a delay, which is a value in milliseconds after which the event will fire.
  When the event fires it calls a specific callback with the specified arguments.

  Use {@link Phaser.Timer#add}, {@link Phaser.Timer#add}, or {@link Phaser.Timer#add} methods to create a new event.

  Parameters:
    * timer (Phaser.Timer) - The Timer object that this TimerEvent belongs to.
    * delay (number) - The delay in ms at which this TimerEvent fires.
    * tick (number) - The tick is the next game clock time that this event will fire at.
    * repeat-count (number) - If this TimerEvent repeats it will do so this many times.
    * loop (boolean) - True if this TimerEvent loops, otherwise false.
    * callback (function) - The callback that will be called when the TimerEvent occurs.
    * callback-context (object) - The context in which the callback will be called.
    * args (Array.<any>) - Additional arguments to be passed to the callback."
  ([timer delay tick repeat-count loop callback callback-context args]
   (js/Phaser.TimerEvent. (clj->phaser timer)
                          (clj->phaser delay)
                          (clj->phaser tick)
                          (clj->phaser repeat-count)
                          (clj->phaser loop)
                          (clj->phaser callback)
                          (clj->phaser callback-context)
                          (clj->phaser args))))

