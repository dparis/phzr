(ns phzr.animation-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [next]))

(defn ->AnimationManager
  "The Animation Manager is used to add, play and update Phaser Animations.
  Any Game Object such as Phaser.Sprite that supports animation contains a single AnimationManager instance.

  Parameters:
    * sprite (Phaser.Sprite) - A reference to the Game Object that owns this AnimationManager."
  ([sprite]
   (js/Phaser.AnimationManager. (clj->phaser sprite))))

(defn add
  "Adds a new animation under the given key. Optionally set the frames, frame rate and loop.
  Animations added in this way are played back with the play function.

  Parameters:
    * animation-manager (Phaser.AnimationManager) - Targeted instance for method
    * name (string) - The unique (within this Sprite) name for the animation, i.e. 'run', 'fire', 'walk'.
    * frames (Array) {optional} - An array of numbers/strings that correspond to the frames to add to this animation and in which order. e.g. [1, 2, 3] or ['run0', 'run1', run2]). If null then all frames will be used.
    * frame-rate (number) {optional} - The speed at which the animation should play. The speed is given in frames per second.
    * loop (boolean) {optional} - Whether or not the animation is looped or just plays once.
    * use-numeric-index (boolean) {optional} - Are the given frames using numeric indexes (default) or strings?

  Returns:  Phaser.Animation - The Animation object that was created."
  ([animation-manager name]
   (phaser->clj
    (.add animation-manager
          (clj->phaser name))))
  ([animation-manager name frames]
   (phaser->clj
    (.add animation-manager
          (clj->phaser name)
          (clj->phaser frames))))
  ([animation-manager name frames frame-rate]
   (phaser->clj
    (.add animation-manager
          (clj->phaser name)
          (clj->phaser frames)
          (clj->phaser frame-rate))))
  ([animation-manager name frames frame-rate loop]
   (phaser->clj
    (.add animation-manager
          (clj->phaser name)
          (clj->phaser frames)
          (clj->phaser frame-rate)
          (clj->phaser loop))))
  ([animation-manager name frames frame-rate loop use-numeric-index]
   (phaser->clj
    (.add animation-manager
          (clj->phaser name)
          (clj->phaser frames)
          (clj->phaser frame-rate)
          (clj->phaser loop)
          (clj->phaser use-numeric-index)))))

(defn destroy
  "Destroys all references this AnimationManager contains.
  Iterates through the list of animations stored in this manager and calls destroy on each of them."
  ([animation-manager]
   (phaser->clj
    (.destroy animation-manager))))

(defn get-animation
  "Returns an animation that was previously added by name.

  Parameters:
    * animation-manager (Phaser.AnimationManager) - Targeted instance for method
    * name (string) - The name of the animation to be returned, e.g. 'fire'.

  Returns:  Phaser.Animation - The Animation instance, if found, otherwise null."
  ([animation-manager name]
   (phaser->clj
    (.getAnimation animation-manager
                   (clj->phaser name)))))

(defn next
  "Advances by the given number of frames in the current animation, taking the loop value into consideration.

  Parameters:
    * animation-manager (Phaser.AnimationManager) - Targeted instance for method
    * quantity (number) {optional} - The number of frames to advance."
  ([animation-manager]
   (phaser->clj
    (.next animation-manager)))
  ([animation-manager quantity]
   (phaser->clj
    (.next animation-manager
           (clj->phaser quantity)))))

(defn play
  "Play an animation based on the given key. The animation should previously have been added via `animations.add`

  If the requested animation is already playing this request will be ignored. 
  If you need to reset an already running animation do so directly on the Animation object itself.

  Parameters:
    * animation-manager (Phaser.AnimationManager) - Targeted instance for method
    * name (string) - The name of the animation to be played, e.g. 'fire', 'walk', 'jump'.
    * frame-rate (number) {optional} - The framerate to play the animation at. The speed is given in frames per second. If not provided the previously set frameRate of the Animation is used.
    * loop (boolean) {optional} - Should the animation be looped after playback. If not provided the previously set loop value of the Animation is used.
    * kill-on-complete (boolean) {optional} - If set to true when the animation completes (only happens if loop=false) the parent Sprite will be killed.

  Returns:  Phaser.Animation - A reference to playing Animation instance."
  ([animation-manager name]
   (phaser->clj
    (.play animation-manager
           (clj->phaser name))))
  ([animation-manager name frame-rate]
   (phaser->clj
    (.play animation-manager
           (clj->phaser name)
           (clj->phaser frame-rate))))
  ([animation-manager name frame-rate loop]
   (phaser->clj
    (.play animation-manager
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop))))
  ([animation-manager name frame-rate loop kill-on-complete]
   (phaser->clj
    (.play animation-manager
           (clj->phaser name)
           (clj->phaser frame-rate)
           (clj->phaser loop)
           (clj->phaser kill-on-complete)))))

(defn previous
  "Moves backwards the given number of frames in the current animation, taking the loop value into consideration.

  Parameters:
    * animation-manager (Phaser.AnimationManager) - Targeted instance for method
    * quantity (number) {optional} - The number of frames to move back."
  ([animation-manager]
   (phaser->clj
    (.previous animation-manager)))
  ([animation-manager quantity]
   (phaser->clj
    (.previous animation-manager
               (clj->phaser quantity)))))

(defn refresh-frame
  "Refreshes the current frame data back to the parent Sprite and also resets the texture data."
  ([animation-manager]
   (phaser->clj
    (.refreshFrame animation-manager))))

(defn stop
  "Stop playback of an animation. If a name is given that specific animation is stopped, otherwise the current animation is stopped.
  The currentAnim property of the AnimationManager is automatically set to the animation given.

  Parameters:
    * animation-manager (Phaser.AnimationManager) - Targeted instance for method
    * name (string) {optional} - The name of the animation to be stopped, e.g. 'fire'. If none is given the currently running animation is stopped.
    * reset-frame (boolean) {optional} - When the animation is stopped should the currentFrame be set to the first frame of the animation (true) or paused on the last frame displayed (false)"
  ([animation-manager]
   (phaser->clj
    (.stop animation-manager)))
  ([animation-manager name]
   (phaser->clj
    (.stop animation-manager
           (clj->phaser name))))
  ([animation-manager name reset-frame]
   (phaser->clj
    (.stop animation-manager
           (clj->phaser name)
           (clj->phaser reset-frame)))))

(defn validate-frames
  "Check whether the frames in the given array are valid and exist.

  Parameters:
    * animation-manager (Phaser.AnimationManager) - Targeted instance for method
    * frames (Array) - An array of frames to be validated.
    * use-numeric-index (boolean) {optional} - Validate the frames based on their numeric index (true) or string index (false)

  Returns:  boolean - True if all given Frames are valid, otherwise false."
  ([animation-manager frames]
   (phaser->clj
    (.validateFrames animation-manager
                     (clj->phaser frames))))
  ([animation-manager frames use-numeric-index]
   (phaser->clj
    (.validateFrames animation-manager
                     (clj->phaser frames)
                     (clj->phaser use-numeric-index)))))