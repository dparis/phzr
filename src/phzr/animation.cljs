(ns phzr.animation
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update next]))

(defn ->Animation
  "An Animation instance contains a single animation and the controls to play it.

  It is created by the AnimationManager, consists of Animation.Frame objects and belongs to a single Game Object such as a Sprite.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * parent (Phaser.Sprite) - A reference to the owner of this Animation.
    * name (string) - The unique name for this animation, used in playback commands.
    * frame-data (Phaser.FrameData) - The FrameData object that contains all frames used by this Animation.
    * frames (Array.<number> | Array.<string>) - An array of numbers or strings indicating which frames to play in which order.
    * frame-rate (number) {optional} - The speed at which the animation should play. The speed is given in frames per second.
    * loop (boolean) {optional} - Whether or not the animation is looped or just plays once.
    * loop (boolean) - Should this animation loop when it reaches the end or play through once."
  ([game parent name frame-data frames loop]
   (js/Phaser.Animation. (clj->phaser game)
                         (clj->phaser parent)
                         (clj->phaser name)
                         (clj->phaser frame-data)
                         (clj->phaser frames)
                         (clj->phaser loop)))
  ([game parent name frame-data frames loop frame-rate]
   (js/Phaser.Animation. (clj->phaser game)
                         (clj->phaser parent)
                         (clj->phaser name)
                         (clj->phaser frame-data)
                         (clj->phaser frames)
                         (clj->phaser loop)
                         (clj->phaser frame-rate)))
  ([game parent name frame-data frames loop frame-rate loop]
   (js/Phaser.Animation. (clj->phaser game)
                         (clj->phaser parent)
                         (clj->phaser name)
                         (clj->phaser frame-data)
                         (clj->phaser frames)
                         (clj->phaser loop)
                         (clj->phaser frame-rate)
                         (clj->phaser loop))))

(defn complete
  "Called internally when the animation finishes playback.
  Sets the isPlaying and isFinished states and dispatches the onAnimationComplete event if it exists on the parent and local onComplete event."
  ([animation]
   (phaser->clj
    (.complete animation))))

(defn destroy
  "Cleans up this animation ready for deletion. Nulls all values and references."
  ([animation]
   (phaser->clj
    (.destroy animation))))

(defn generate-frame-names-
  "Really handy function for when you are creating arrays of animation data but it's using frame names and not numbers.
  For example imagine you've got 30 frames named: 'explosion_0001-large' to 'explosion_0030-large'
  You could use this function to generate those by doing: Phaser.Animation.generateFrameNames('explosion_', 1, 30, '-large', 4);

  Parameters:
    * prefix (string) - The start of the filename. If the filename was 'explosion_0001-large' the prefix would be 'explosion_'.
    * start (number) - The number to start sequentially counting from. If your frames are named 'explosion_0001' to 'explosion_0034' the start is 1.
    * stop (number) - The number to count to. If your frames are named 'explosion_0001' to 'explosion_0034' the stop value is 34.
    * suffix (string) {optional} - The end of the filename. If the filename was 'explosion_0001-large' the prefix would be '-large'.
    * zero-pad (number) {optional} - The number of zeroes to pad the min and max values with. If your frames are named 'explosion_0001' to 'explosion_0034' then the zeroPad is 4.

  Returns:  Array.<string> - An array of framenames."
  ([prefix start stop]
   (phaser->clj
    (.generateFrameNames js/Phaser.Animation
                         (clj->phaser prefix)
                         (clj->phaser start)
                         (clj->phaser stop))))
  ([prefix start stop suffix]
   (phaser->clj
    (.generateFrameNames js/Phaser.Animation
                         (clj->phaser prefix)
                         (clj->phaser start)
                         (clj->phaser stop)
                         (clj->phaser suffix))))
  ([prefix start stop suffix zero-pad]
   (phaser->clj
    (.generateFrameNames js/Phaser.Animation
                         (clj->phaser prefix)
                         (clj->phaser start)
                         (clj->phaser stop)
                         (clj->phaser suffix)
                         (clj->phaser zero-pad)))))

(defn next
  "Advances by the given number of frames in the Animation, taking the loop value into consideration.

  Parameters:
    * animation (Phaser.Animation) - Targeted instance for method
    * quantity (number) {optional} - The number of frames to advance."
  ([animation]
   (phaser->clj
    (.next animation)))
  ([animation quantity]
   (phaser->clj
    (.next animation
           (clj->phaser quantity)))))

(defn on-pause
  "Called when the Game enters a paused state."
  ([animation]
   (phaser->clj
    (.onPause animation))))

(defn on-resume
  "Called when the Game resumes from a paused state."
  ([animation]
   (phaser->clj
    (.onResume animation))))

(defn play
  "Plays this animation.

  Parameters:
    * animation (Phaser.Animation) - Targeted instance for method
    * frame-rate (number) {optional} - The framerate to play the animation at. The speed is given in frames per second. If not provided the previously set frameRate of the Animation is used.
    * loop (boolean) {optional} - Should the animation be looped after playback. If not provided the previously set loop value of the Animation is used.
    * kill-on-complete (boolean) {optional} - If set to true when the animation completes (only happens if loop=false) the parent Sprite will be killed.

  Returns:  Phaser.Animation - - A reference to this Animation instance."
  ([animation]
   (phaser->clj
    (.play animation)))
  ([animation frame-rate]
   (phaser->clj
    (.play animation
           (clj->phaser frame-rate))))
  ([animation frame-rate loop]
   (phaser->clj
    (.play animation
           (clj->phaser frame-rate)
           (clj->phaser loop))))
  ([animation frame-rate loop kill-on-complete]
   (phaser->clj
    (.play animation
           (clj->phaser frame-rate)
           (clj->phaser loop)
           (clj->phaser kill-on-complete)))))

(defn previous
  "Moves backwards the given number of frames in the Animation, taking the loop value into consideration.

  Parameters:
    * animation (Phaser.Animation) - Targeted instance for method
    * quantity (number) {optional} - The number of frames to move back."
  ([animation]
   (phaser->clj
    (.previous animation)))
  ([animation quantity]
   (phaser->clj
    (.previous animation
               (clj->phaser quantity)))))

(defn restart
  "Sets this animation back to the first frame and restarts the animation."
  ([animation]
   (phaser->clj
    (.restart animation))))

(defn set-frame
  "Sets this animations playback to a given frame with the given ID.

  Parameters:
    * animation (Phaser.Animation) - Targeted instance for method
    * frame-id (string | number) {optional} - The identifier of the frame to set. Can be the name of the frame, the sprite index of the frame, or the animation-local frame index.
    * use-local-frame-index (boolean) {optional} - If you provide a number for frameId, should it use the numeric indexes of the frameData, or the 0-indexed frame index local to the animation."
  ([animation]
   (phaser->clj
    (.setFrame animation)))
  ([animation frame-id]
   (phaser->clj
    (.setFrame animation
               (clj->phaser frame-id))))
  ([animation frame-id use-local-frame-index]
   (phaser->clj
    (.setFrame animation
               (clj->phaser frame-id)
               (clj->phaser use-local-frame-index)))))

(defn stop
  "Stops playback of this animation and set it to a finished state. If a resetFrame is provided it will stop playback and set frame to the first in the animation.
  If `dispatchComplete` is true it will dispatch the complete events, otherwise they'll be ignored.

  Parameters:
    * animation (Phaser.Animation) - Targeted instance for method
    * reset-frame (boolean) {optional} - If true after the animation stops the currentFrame value will be set to the first frame in this animation.
    * dispatch-complete (boolean) {optional} - Dispatch the Animation.onComplete and parent.onAnimationComplete events?"
  ([animation]
   (phaser->clj
    (.stop animation)))
  ([animation reset-frame]
   (phaser->clj
    (.stop animation
           (clj->phaser reset-frame))))
  ([animation reset-frame dispatch-complete]
   (phaser->clj
    (.stop animation
           (clj->phaser reset-frame)
           (clj->phaser dispatch-complete)))))

(defn update
  "Updates this animation. Called automatically by the AnimationManager."
  ([animation]
   (phaser->clj
    (.update animation))))

(defn update-frame-data
  "Changes the FrameData object this Animation is using.

  Parameters:
    * animation (Phaser.Animation) - Targeted instance for method
    * frame-data (Phaser.FrameData) - The FrameData object that contains all frames used by this Animation."
  ([animation frame-data]
   (phaser->clj
    (.updateFrameData animation
                      (clj->phaser frame-data)))))