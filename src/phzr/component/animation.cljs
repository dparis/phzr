(ns phzr.component.animation
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Animation
  "The Animation Component provides a `play` method, which is a proxy to the `AnimationManager.play` method."
  ([]
   (js/Phaser.Component.Animation.)))

(defn play
  "Plays an Animation.

  The animation should have previously been created via `animations.add`.

  If the animation is already playing calling this again won't do anything.
  If you need to reset an already running animation do so directly on the Animation object itself or via `AnimationManager.stop`.

  Parameters:
    * animation (Phaser.Component.Animation) - Targeted instance for method
    * name (string) - The name of the animation to be played, e.g. 'fire', 'walk', 'jump'. Must have been previously created via 'AnimationManager.add'.
    * frame-rate (number) {optional} - The framerate to play the animation at. The speed is given in frames per second. If not provided the previously set frameRate of the Animation is used.
    * loop (boolean) {optional} - Should the animation be looped after playback. If not provided the previously set loop value of the Animation is used.
    * kill-on-complete (boolean) {optional} - If set to true when the animation completes (only happens if loop=false) the parent Sprite will be killed.

  Returns:  Phaser.Animation - A reference to playing Animation."
  ([animation name]
   (phaser->clj
    (.play animation
           (clj->phaser name))))
  ([animation name frame-rate]
   (phaser->clj
    (.play animation
           (clj->phaser name)
           (clj->phaser frame-rate))))
  ([animation name frame-rate loop]
   (phaser->clj
    (.play animation
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop))))
  ([animation name frame-rate loop kill-on-complete]
   (phaser->clj
    (.play animation
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop)
           (clj->phaser kill-on-complete)))))