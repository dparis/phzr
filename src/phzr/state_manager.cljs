(ns phzr.state-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [remove]))

(defn ->StateManager
  "The State Manager is responsible for loading, setting up and switching game states.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * pending-state (Phaser.State | Object) {optional} - A State object to seed the manager with."
  ([game]
   (js/Phaser.StateManager. (clj->phaser game)))
  ([game pending-state]
   (js/Phaser.StateManager. (clj->phaser game)
                            (clj->phaser pending-state))))

(defn add
  "Adds a new State into the StateManager. You must give each State a unique key by which you'll identify it.
  The State can be either a Phaser.State object (or an object that extends it), a plain JavaScript object or a function.
  If a function is given a new state object will be created by calling it.

  Parameters:
    * state-manager (Phaser.StateManager) - Targeted instance for method
    * key (string) - A unique key you use to reference this state, i.e. 'MainMenu', 'Level1'.
    * state (Phaser.State | object | function) - The state you want to switch to.
    * auto-start (boolean) {optional} - If true the State will be started immediately after adding it."
  ([state-manager key state]
   (phaser->clj
    (.add state-manager
          (clj->phaser key)
          (clj->phaser state))))
  ([state-manager key state auto-start]
   (phaser->clj
    (.add state-manager
          (clj->phaser key)
          (clj->phaser state)
          (clj->phaser auto-start)))))

(defn check-state
  "Checks if a given phaser state is valid. A State is considered valid if it has at least one of the core functions: preload, create, update or render.

  Parameters:
    * state-manager (Phaser.StateManager) - Targeted instance for method
    * key (string) - The key of the state you want to check.

  Returns:  boolean - true if the State has the required functions, otherwise false."
  ([state-manager key]
   (phaser->clj
    (.checkState state-manager
                 (clj->phaser key)))))

(defn clear-current-state
  "This method clears the current State, calling its shutdown callback. The process also removes any active tweens,
  resets the camera, resets input, clears physics, removes timers and if set clears the world and cache too."
  ([state-manager]
   (phaser->clj
    (.clearCurrentState state-manager))))

(defn destroy
  "Removes all StateManager callback references to the State object, nulls the game reference and clears the States object.
  You don't recover from this without rebuilding the Phaser instance again."
  ([state-manager]
   (phaser->clj
    (.destroy state-manager))))

(defn get-current-state
  "Gets the current State.

  Returns:   - Phaser.State"
  ([state-manager]
   (phaser->clj
    (.getCurrentState state-manager))))

(defn pre-update
  "preUpdate is called right at the start of the game loop. It is responsible for changing to a new state that was requested previously."
  ([state-manager]
   (phaser->clj
    (.preUpdate state-manager))))

(defn remove
  "Delete the given state.

  Parameters:
    * state-manager (Phaser.StateManager) - Targeted instance for method
    * key (string) - A unique key you use to reference this state, i.e. 'MainMenu', 'Level1'."
  ([state-manager key]
   (phaser->clj
    (.remove state-manager
             (clj->phaser key)))))

(defn restart
  "Restarts the current State. State.shutDown will be called (if it exists) before the State is restarted.

  Parameters:
    * state-manager (Phaser.StateManager) - Targeted instance for method
    * clear-world (boolean) {optional} - Clear everything in the world? This clears the World display list fully (but not the Stage, so if you've added your own objects to the Stage they will need managing directly)
    * clear-cache (boolean) {optional} - Clear the Game.Cache? This purges out all loaded assets. The default is false and you must have clearWorld=true if you want to clearCache as well.
    * parameter (*) - Additional parameters that will be passed to the State.init function if it has one."
  ([state-manager parameter]
   (phaser->clj
    (.restart state-manager
              (clj->phaser parameter))))
  ([state-manager parameter clear-world]
   (phaser->clj
    (.restart state-manager
              (clj->phaser parameter)
              (clj->phaser clear-world))))
  ([state-manager parameter clear-world clear-cache]
   (phaser->clj
    (.restart state-manager
              (clj->phaser parameter)
              (clj->phaser clear-world)
              (clj->phaser clear-cache)))))

(defn start
  "Start the given State. If a State is already running then State.shutDown will be called (if it exists) before switching to the new State.

  Parameters:
    * state-manager (Phaser.StateManager) - Targeted instance for method
    * key (string) - The key of the state you want to start.
    * clear-world (boolean) {optional} - Clear everything in the world? This clears the World display list fully (but not the Stage, so if you've added your own objects to the Stage they will need managing directly)
    * clear-cache (boolean) {optional} - Clear the Game.Cache? This purges out all loaded assets. The default is false and you must have clearWorld=true if you want to clearCache as well.
    * parameter (*) - Additional parameters that will be passed to the State.init function (if it has one)."
  ([state-manager key parameter]
   (phaser->clj
    (.start state-manager
            (clj->phaser key)
            (clj->phaser parameter))))
  ([state-manager key parameter clear-world]
   (phaser->clj
    (.start state-manager
            (clj->phaser key)
            (clj->phaser parameter)
            (clj->phaser clear-world))))
  ([state-manager key parameter clear-world clear-cache]
   (phaser->clj
    (.start state-manager
            (clj->phaser key)
            (clj->phaser parameter)
            (clj->phaser clear-world)
            (clj->phaser clear-cache)))))