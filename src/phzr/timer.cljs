(ns phzr.timer
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [repeat loop remove]))

(defn ->Timer
  "A Timer is a way to create small re-usable (or disposable) objects that wait for a specific moment in time,
  and then run the specified callbacks.

  You can add many events to a Timer, each with their own delays. A Timer uses milliseconds as its unit of time (there are 1000 ms in 1 second).
  So a delay to 250 would fire the event every quarter of a second.

  Timers are based on real-world (not physics) time, adjusted for game pause durations.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * auto-destroy (boolean) {optional} - If true, the timer will automatically destroy itself after all the events have been dispatched (assuming no looping events)."
  ([game]
   (js/Phaser.Timer. (clj->phaser game)))
  ([game auto-destroy]
   (js/Phaser.Timer. (clj->phaser game)
                     (clj->phaser auto-destroy))))

(defn const
  [k]
  (when-let [cn (get phzr.impl.accessors.timer/timer-constants k)]
    (aget js/Phaser.Timer cn)))

(defn add
  "Adds a new Event to this Timer.

  The event will fire after the given amount of `delay` in milliseconds has passed, once the Timer has started running.
  The delay is in relation to when the Timer starts, not the time it was added. If the Timer is already running the delay will be calculated based on the timers current time.

  Make sure to call {@link Phaser.Timer#start start} after adding all of the Events you require for this Timer.

  Parameters:
    * timer (Phaser.Timer) - Targeted instance for method
    * delay (number) - The number of milliseconds that should elapse before the callback is invoked.
    * callback (function) - The callback that will be called when the Timer event occurs.
    * callback-context (object) - The context in which the callback will be called.
    * args (*) - Additional arguments that will be supplied to the callback.

  Returns:  Phaser.TimerEvent - The Phaser.TimerEvent object that was created."
  ([timer delay callback callback-context args]
   (phaser->clj
    (.add timer
          (clj->phaser delay)
          (clj->phaser callback)
          (clj->phaser callback-context)
          (clj->phaser args)))))

(defn destroy
  "Destroys this Timer. Any pending Events are not dispatched.
  The onComplete callbacks won't be called."
  ([timer]
   (phaser->clj
    (.destroy timer))))

(defn loop
  "Adds a new looped Event to this Timer that will repeat forever or until the Timer is stopped.

  The event will fire after the given amount of `delay` in milliseconds has passed, once the Timer has started running.
  The delay is in relation to when the Timer starts, not the time it was added. If the Timer is already running the delay will be calculated based on the timers current time.

  Make sure to call {@link Phaser.Timer#start start} after adding all of the Events you require for this Timer.

  Parameters:
    * timer (Phaser.Timer) - Targeted instance for method
    * delay (number) - The number of milliseconds that should elapse before the Timer will call the given callback.
    * callback (function) - The callback that will be called when the Timer event occurs.
    * callback-context (object) - The context in which the callback will be called.
    * args (*) - Additional arguments that will be supplied to the callback.

  Returns:  Phaser.TimerEvent - The Phaser.TimerEvent object that was created."
  ([timer delay callback callback-context args]
   (phaser->clj
    (.loop timer
           (clj->phaser delay)
           (clj->phaser callback)
           (clj->phaser callback-context)
           (clj->phaser args)))))

(defn pause
  "Pauses the Timer and all events in the queue."
  ([timer]
   (phaser->clj
    (.pause timer))))

(defn remove
  "Removes a pending TimerEvent from the queue.

  Parameters:
    * timer (Phaser.Timer) - Targeted instance for method
    * event (Phaser.TimerEvent) - The event to remove from the queue."
  ([timer event]
   (phaser->clj
    (.remove timer
             (clj->phaser event)))))

(defn remove-all
  "Removes all Events from this Timer and all callbacks linked to onComplete, but leaves the Timer running.    
  The onComplete callbacks won't be called."
  ([timer]
   (phaser->clj
    (.removeAll timer))))

(defn repeat
  "Adds a new TimerEvent that will always play through once and then repeat for the given number of iterations.

  The event will fire after the given amount of `delay` in milliseconds has passed, once the Timer has started running.
  The delay is in relation to when the Timer starts, not the time it was added. If the Timer is already running the delay will be calculated based on the timers current time.

  Make sure to call {@link Phaser.Timer#start start} after adding all of the Events you require for this Timer.

  Parameters:
    * timer (Phaser.Timer) - Targeted instance for method
    * delay (number) - The number of milliseconds that should elapse before the Timer will call the given callback.
    * repeat-count (number) - The number of times the event will repeat once is has finished playback. A repeatCount of 1 means it will repeat itself once, playing the event twice in total.
    * callback (function) - The callback that will be called when the Timer event occurs.
    * callback-context (object) - The context in which the callback will be called.
    * args (*) - Additional arguments that will be supplied to the callback.

  Returns:  Phaser.TimerEvent - The Phaser.TimerEvent object that was created."
  ([timer delay repeat-count callback callback-context args]
   (phaser->clj
    (.repeat timer
             (clj->phaser delay)
             (clj->phaser repeat-count)
             (clj->phaser callback)
             (clj->phaser callback-context)
             (clj->phaser args)))))

(defn resume
  "Resumes the Timer and updates all pending events."
  ([timer]
   (phaser->clj
    (.resume timer))))

(defn start
  "Starts this Timer running.

  Parameters:
    * timer (Phaser.Timer) - Targeted instance for method
    * delay (number) {optional} - The number of milliseconds that should elapse before the Timer will start."
  ([timer]
   (phaser->clj
    (.start timer)))
  ([timer delay]
   (phaser->clj
    (.start timer
            (clj->phaser delay)))))

(defn stop
  "Stops this Timer from running. Does not cause it to be destroyed if autoDestroy is set to true.

  Parameters:
    * timer (Phaser.Timer) - Targeted instance for method
    * clear-events (boolean) {optional} - If true all the events in Timer will be cleared, otherwise they will remain."
  ([timer]
   (phaser->clj
    (.stop timer)))
  ([timer clear-events]
   (phaser->clj
    (.stop timer
           (clj->phaser clear-events)))))