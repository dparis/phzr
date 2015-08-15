(ns phzr.signal
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [remove]))

(defn ->Signal
  "A Signal is an event dispatch mechansim that supports broadcasting to multiple listeners.

  Event listeners are uniquely identified by the listener/callback function and the context."
  ([]
   (js/Phaser.Signal.)))

(defn add
  "Add an event listener for this signal.

  An event listener is a callback with a related context and priority.

  You can optionally provide extra arguments which will be passed to the callback after any internal parameters.

  For example: `Phaser.Key.onDown` when dispatched will send the Phaser.Key object that caused the signal as the first parameter.
  Any arguments you've specified after `priority` will be sent as well:

  `fireButton.onDown.add(shoot, this, 0, 'lazer', 100);`

  When onDown dispatches it will call the `shoot` callback passing it: `Phaser.Key, 'lazer', 100`.

  Where the first parameter is the one that Key.onDown dispatches internally and 'lazer', 
  and the value 100 were the custom arguments given in the call to 'add'.

  Parameters:
    * signal (Phaser.Signal) - Targeted instance for method
    * listener (function) - The function to call when this Signal is dispatched.
    * listener-context (object) {optional} - The context under which the listener will be executed (i.e. the object that should represent the `this` variable).
    * priority (number) {optional} - The priority level of the event listener. Listeners with higher priority will be executed before listeners with lower priority. Listeners with same priority level will be executed at the same order as they were added (default = 0)
    * args (any) {optional} - Additional arguments to pass to the callback (listener) function. They will be appended after any arguments usually dispatched.

  Returns:  Phaser.SignalBinding - An Object representing the binding between the Signal and listener."
  ([signal listener]
   (phaser->clj
    (.add signal
          (clj->phaser listener))))
  ([signal listener listener-context]
   (phaser->clj
    (.add signal
          (clj->phaser listener)
          (clj->phaser listener-context))))
  ([signal listener listener-context priority]
   (phaser->clj
    (.add signal
          (clj->phaser listener)
          (clj->phaser listener-context)
          (clj->phaser priority))))
  ([signal listener listener-context priority args]
   (phaser->clj
    (.add signal
          (clj->phaser listener)
          (clj->phaser listener-context)
          (clj->phaser priority)
          (clj->phaser args)))))

(defn add-once
  "Add a one-time listener - the listener is automatically removed after the first execution.

  If there is as {@link Phaser.Signal#memorize memorized} event then it will be dispatched and
  the listener will be removed immediately.

  Parameters:
    * signal (Phaser.Signal) - Targeted instance for method
    * listener (function) - The function to call when this Signal is dispatched.
    * listener-context (object) {optional} - The context under which the listener will be executed (i.e. the object that should represent the `this` variable).
    * priority (number) {optional} - The priority level of the event listener. Listeners with higher priority will be executed before listeners with lower priority. Listeners with same priority level will be executed at the same order as they were added (default = 0)
    * args (any) {optional} - Additional arguments to pass to the callback (listener) function. They will be appended after any arguments usually dispatched.

  Returns:  Phaser.SignalBinding - An Object representing the binding between the Signal and listener."
  ([signal listener]
   (phaser->clj
    (.addOnce signal
              (clj->phaser listener))))
  ([signal listener listener-context]
   (phaser->clj
    (.addOnce signal
              (clj->phaser listener)
              (clj->phaser listener-context))))
  ([signal listener listener-context priority]
   (phaser->clj
    (.addOnce signal
              (clj->phaser listener)
              (clj->phaser listener-context)
              (clj->phaser priority))))
  ([signal listener listener-context priority args]
   (phaser->clj
    (.addOnce signal
              (clj->phaser listener)
              (clj->phaser listener-context)
              (clj->phaser priority)
              (clj->phaser args)))))

(defn dispatch
  "Dispatch / broadcast the event to all listeners.

  To create an instance-bound dispatch for this Signal, use {@link Phaser.Signal#boundDispatch boundDispatch}.

  Parameters:
    * signal (Phaser.Signal) - Targeted instance for method
    * params (any) {optional} - Parameters that should be passed to each handler."
  ([signal]
   (phaser->clj
    (.dispatch signal)))
  ([signal params]
   (phaser->clj
    (.dispatch signal
               (clj->phaser params)))))

(defn dispose
  "Dispose the signal - no more events can be dispatched.

  This removes all event listeners and clears references to external objects.
  Calling methods on a disposed objects results in undefined behavior."
  ([signal]
   (phaser->clj
    (.dispose signal))))

(defn forget
  "Forget the currently {@link Phaser.Signal#memorize memorized} event, if any."
  ([signal]
   (phaser->clj
    (.forget signal))))

(defn get-num-listeners
  "Gets the total number of listeners attached to this Signal.

  Returns:  integer - Number of listeners attached to the Signal."
  ([signal]
   (phaser->clj
    (.getNumListeners signal))))

(defn halt
  "Stop propagation of the event, blocking the dispatch to next listener on the queue.

  This should be called only during event dispatch as calling it before/after dispatch won't affect another broadcast.
  See {@link Phaser.Signal#active active} to enable/disable the signal entirely."
  ([signal]
   (phaser->clj
    (.halt signal))))

(defn has
  "Check if a specific listener is attached.

  Parameters:
    * signal (Phaser.Signal) - Targeted instance for method
    * listener (function) - Signal handler function.
    * context (object) {optional} - Context on which listener will be executed (object that should represent the `this` variable inside listener function).

  Returns:  boolean - If Signal has the specified listener."
  ([signal listener]
   (phaser->clj
    (.has signal
          (clj->phaser listener))))
  ([signal listener context]
   (phaser->clj
    (.has signal
          (clj->phaser listener)
          (clj->phaser context)))))

(defn remove
  "Remove a single event listener.

  Parameters:
    * signal (Phaser.Signal) - Targeted instance for method
    * listener (function) - Handler function that should be removed.
    * context (object) {optional} - Execution context (since you can add the same handler multiple times if executing in a different context).

  Returns:  function - Listener handler function."
  ([signal listener]
   (phaser->clj
    (.remove signal
             (clj->phaser listener))))
  ([signal listener context]
   (phaser->clj
    (.remove signal
             (clj->phaser listener)
             (clj->phaser context)))))

(defn remove-all
  "Remove all event listeners.

  Parameters:
    * signal (Phaser.Signal) - Targeted instance for method
    * context (object) {optional} - If specified only listeners for the given context will be removed."
  ([signal]
   (phaser->clj
    (.removeAll signal)))
  ([signal context]
   (phaser->clj
    (.removeAll signal
                (clj->phaser context)))))

(defn to-string
  "A string representation of the object.

  Returns:  string - String representation of the object."
  ([signal]
   (phaser->clj
    (.toString signal))))