(ns phzr.signal-binding
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->SignalBinding
  "Object that represents a binding between a Signal and a listener function.
  This is an internal constructor and shouldn't be created directly.
  Inspired by Joa Ebert AS3 SignalBinding and Robert Penner's Slot classes.

  Parameters:
    * signal (Phaser.Signal) - Reference to Signal object that listener is currently bound to.
    * listener (function) - Handler function bound to the signal.
    * is-once (boolean) - If binding should be executed just once.
    * listener-context (object) {optional} - Context on which listener will be executed (object that should represent the `this` variable inside listener function).
    * priority (number) {optional} - The priority level of the event listener. (default = 0).
    * args (any) {optional} - Additional arguments to pass to the callback (listener) function. They will be appended after any arguments usually dispatched."
  ([signal listener is-once]
   (js/Phaser.SignalBinding. (clj->phaser signal)
                             (clj->phaser listener)
                             (clj->phaser is-once)))
  ([signal listener is-once listener-context]
   (js/Phaser.SignalBinding. (clj->phaser signal)
                             (clj->phaser listener)
                             (clj->phaser is-once)
                             (clj->phaser listener-context)))
  ([signal listener is-once listener-context priority]
   (js/Phaser.SignalBinding. (clj->phaser signal)
                             (clj->phaser listener)
                             (clj->phaser is-once)
                             (clj->phaser listener-context)
                             (clj->phaser priority)))
  ([signal listener is-once listener-context priority args]
   (js/Phaser.SignalBinding. (clj->phaser signal)
                             (clj->phaser listener)
                             (clj->phaser is-once)
                             (clj->phaser listener-context)
                             (clj->phaser priority)
                             (clj->phaser args))))

(defn detach
  "Detach binding from signal.
  alias to: @see mySignal.remove(myBinding.getListener());

  Returns:  [function | null] - Handler function bound to the signal or `null` if binding was previously detached."
  ([signal-binding]
   (phaser->clj
    (.detach signal-binding))))

(defn execute
  "Call listener passing arbitrary parameters.
  If binding was added using `Signal.addOnce()` it will be automatically removed from signal dispatch queue, this method is used internally for the signal dispatch.

  Parameters:
    * signal-binding (Phaser.SignalBinding) - Targeted instance for method
    * params-arr (Array.<any>) {optional} - Array of parameters that should be passed to the listener.

  Returns:  any - Value returned by the listener."
  ([signal-binding]
   (phaser->clj
    (.execute signal-binding)))
  ([signal-binding params-arr]
   (phaser->clj
    (.execute signal-binding
              (clj->phaser params-arr)))))

(defn get-listener
  "

  Returns:  function - Handler function bound to the signal."
  ([signal-binding]
   (phaser->clj
    (.getListener signal-binding))))

(defn get-signal
  "

  Returns:  Phaser.Signal - Signal that listener is currently bound to."
  ([signal-binding]
   (phaser->clj
    (.getSignal signal-binding))))

(defn is-bound
  "

  Returns:  boolean - True if binding is still bound to the signal and has a listener."
  ([signal-binding]
   (phaser->clj
    (.isBound signal-binding))))

(defn is-once
  "

  Returns:  boolean - If SignalBinding will only be executed once."
  ([signal-binding]
   (phaser->clj
    (.isOnce signal-binding))))

(defn to-string
  "

  Returns:  string - String representation of the object."
  ([signal-binding]
   (phaser->clj
    (.toString signal-binding))))