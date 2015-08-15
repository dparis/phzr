(ns phzr.particles
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [remove]))

(defn ->Particles
  "Phaser.Particles is the Particle Manager for the game. It is called during the game update loop and in turn updates any Emitters attached to it.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Particles. (clj->phaser game))))

(defn add
  "Adds a new Particle Emitter to the Particle Manager.

  Parameters:
    * particles (Phaser.Particles) - Targeted instance for method
    * emitter (Phaser.Emitter) - The emitter to be added to the particle manager.

  Returns:  Phaser.Emitter - The emitter that was added."
  ([particles emitter]
   (phaser->clj
    (.add particles
          (clj->phaser emitter)))))

(defn remove
  "Removes an existing Particle Emitter from the Particle Manager.

  Parameters:
    * particles (Phaser.Particles) - Targeted instance for method
    * emitter (Phaser.Emitter) - The emitter to remove."
  ([particles emitter]
   (phaser->clj
    (.remove particles
             (clj->phaser emitter)))))