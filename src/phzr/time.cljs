(ns phzr.time
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Time
  "This is the core internal game clock.

  It manages the elapsed time and calculation of elapsed values, used for game object motion and tweens,
  and also handles the standard Timer pool.

  To create a general timed event, use the master {@link Phaser.Timer} accessible through {@link Phaser.Time.events events}.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Time. (clj->phaser game))))

(defn add
  "Adds an existing Phaser.Timer object to the Timer pool.

  Parameters:
    * time (Phaser.Time) - Targeted instance for method
    * timer (Phaser.Timer) - An existing Phaser.Timer object.

  Returns:  Phaser.Timer - The given Phaser.Timer object."
  ([time timer]
   (phaser->clj
    (.add time
          (clj->phaser timer)))))

(defn create
  "Creates a new stand-alone Phaser.Timer object.

  Parameters:
    * time (Phaser.Time) - Targeted instance for method
    * auto-destroy (boolean) {optional} - A Timer that is set to automatically destroy itself will do so after all of its events have been dispatched (assuming no looping events).

  Returns:  Phaser.Timer - The Timer object that was created."
  ([time]
   (phaser->clj
    (.create time)))
  ([time auto-destroy]
   (phaser->clj
    (.create time
             (clj->phaser auto-destroy)))))

(defn elapsed-seconds-since
  "How long has passed since the given time (in seconds).

  Parameters:
    * time (Phaser.Time) - Targeted instance for method
    * since (number) - The time you want to measure (in seconds).

  Returns:  number - Duration between given time and now (in seconds)."
  ([time since]
   (phaser->clj
    (.elapsedSecondsSince time
                          (clj->phaser since)))))

(defn elapsed-since
  "How long has passed since the given time.

  Parameters:
    * time (Phaser.Time) - Targeted instance for method
    * since (number) - The time you want to measure against.

  Returns:  number - The difference between the given time and now."
  ([time since]
   (phaser->clj
    (.elapsedSince time
                   (clj->phaser since)))))

(defn remove-all
  "Remove all Timer objects, regardless of their state and clears all Timers from the {@link Phaser.Time#events events} timer."
  ([time]
   (phaser->clj
    (.removeAll time))))

(defn reset
  "Resets the private _started value to now and removes all currently running Timers."
  ([time]
   (phaser->clj
    (.reset time))))

(defn total-elapsed-seconds
  "The number of seconds that have elapsed since the game was started.

  Returns:  number - The number of seconds that have elapsed since the game was started."
  ([time]
   (phaser->clj
    (.totalElapsedSeconds time))))