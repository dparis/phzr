(ns phzr.sound-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [remove]))

(defn ->SoundManager
  "The Sound Manager is responsible for playing back audio via either the Legacy HTML Audio tag or via Web Audio if the browser supports it.
  Note: On Firefox 25+ on Linux if you have media.gstreamer disabled in about:config then it cannot play back mp3 or m4a files.
  The audio file type and the encoding of those files are extremely important. Not all browsers can play all audio formats.
  There is a good guide to what's supported here: http://hpr.dogphilosophy.net/test/

  If you are reloading a Phaser Game on a page that never properly refreshes (such as in an AngularJS project) then you will quickly run out
  of AudioContext nodes. If this is the case create a global var called PhaserGlobal on the window object before creating the game. The active
  AudioContext will then be saved to window.PhaserGlobal.audioContext when the Phaser game is destroyed, and re-used when it starts again.

  Mobile warning: There are some mobile devices (certain iPad 2 and iPad Mini revisions) that cannot play 48000 Hz audio.
  When they try to play the audio becomes extremely distorted and buzzes, eventually crashing the sound system.
  The solution is to use a lower encoding rate such as 44100 Hz.

  Parameters:
    * game (Phaser.Game) - Reference to the current game instance."
  ([game]
   (js/Phaser.SoundManager. (clj->phaser game))))

(defn add
  "Adds a new Sound into the SoundManager.

  Parameters:
    * sound-manager (Phaser.SoundManager) - Targeted instance for method
    * key (string) - Asset key for the sound.
    * volume (number) {optional} - Default value for the volume.
    * loop (boolean) {optional} - Whether or not the sound will loop.
    * connect (boolean) {optional} - Controls if the created Sound object will connect to the master gainNode of the SoundManager when running under WebAudio.

  Returns:  Phaser.Sound - The new sound instance."
  ([sound-manager key]
   (phaser->clj
    (.add sound-manager
          (clj->phaser key))))
  ([sound-manager key volume]
   (phaser->clj
    (.add sound-manager
          (clj->phaser key)
          (clj->phaser volume))))
  ([sound-manager key volume loop]
   (phaser->clj
    (.add sound-manager
          (clj->phaser key)
          (clj->phaser volume)
          (clj->phaser loop))))
  ([sound-manager key volume loop connect]
   (phaser->clj
    (.add sound-manager
          (clj->phaser key)
          (clj->phaser volume)
          (clj->phaser loop)
          (clj->phaser connect)))))

(defn add-sprite
  "Adds a new AudioSprite into the SoundManager.

  Parameters:
    * sound-manager (Phaser.SoundManager) - Targeted instance for method
    * key (string) - Asset key for the sound.

  Returns:  Phaser.AudioSprite - The new AudioSprite instance."
  ([sound-manager key]
   (phaser->clj
    (.addSprite sound-manager
                (clj->phaser key)))))

(defn decode
  "Decode a sound by its asset key.

  Parameters:
    * sound-manager (Phaser.SoundManager) - Targeted instance for method
    * key (string) - Assets key of the sound to be decoded.
    * sound (Phaser.Sound) {optional} - Its buffer will be set to decoded data."
  ([sound-manager key]
   (phaser->clj
    (.decode sound-manager
             (clj->phaser key))))
  ([sound-manager key sound]
   (phaser->clj
    (.decode sound-manager
             (clj->phaser key)
             (clj->phaser sound)))))

(defn destroy
  "Stops all the sounds in the game, then destroys them and finally clears up any callbacks."
  ([sound-manager]
   (phaser->clj
    (.destroy sound-manager))))

(defn pause-all
  "Pauses all the sounds in the game."
  ([sound-manager]
   (phaser->clj
    (.pauseAll sound-manager))))

(defn play
  "Adds a new Sound into the SoundManager and starts it playing.

  Parameters:
    * sound-manager (Phaser.SoundManager) - Targeted instance for method
    * key (string) - Asset key for the sound.
    * volume (number) {optional} - Default value for the volume.
    * loop (boolean) {optional} - Whether or not the sound will loop.

  Returns:  Phaser.Sound - The new sound instance."
  ([sound-manager key]
   (phaser->clj
    (.play sound-manager
           (clj->phaser key))))
  ([sound-manager key volume]
   (phaser->clj
    (.play sound-manager
           (clj->phaser key)
           (clj->phaser volume))))
  ([sound-manager key volume loop]
   (phaser->clj
    (.play sound-manager
           (clj->phaser key)
           (clj->phaser volume)
           (clj->phaser loop)))))

(defn remove
  "Removes a Sound from the SoundManager. The removed Sound is destroyed before removal.

  Parameters:
    * sound-manager (Phaser.SoundManager) - Targeted instance for method
    * sound (Phaser.Sound) - The sound object to remove.

  Returns:  boolean - True if the sound was removed successfully, otherwise false."
  ([sound-manager sound]
   (phaser->clj
    (.remove sound-manager
             (clj->phaser sound)))))

(defn remove-by-key
  "Removes all Sounds from the SoundManager that have an asset key matching the given value.
  The removed Sounds are destroyed before removal.

  Parameters:
    * sound-manager (Phaser.SoundManager) - Targeted instance for method
    * key (string) - The key to match when removing sound objects.

  Returns:  number - The number of matching sound objects that were removed."
  ([sound-manager key]
   (phaser->clj
    (.removeByKey sound-manager
                  (clj->phaser key)))))

(defn resume-all
  "Resumes every sound in the game."
  ([sound-manager]
   (phaser->clj
    (.resumeAll sound-manager))))

(defn set-decoded-callback
  "This method allows you to give the SoundManager a list of Sound files, or keys, and a callback.
  Once all of the Sound files have finished decoding the callback will be invoked.
  The amount of time spent decoding depends on the codec used and file size.
  If all of the files given have already decoded the callback is triggered immediately.

  Parameters:
    * sound-manager (Phaser.SoundManager) - Targeted instance for method
    * files (string | array) - An array containing either Phaser.Sound objects or their key strings as found in the Phaser.Cache.
    * callback (function) - The callback which will be invoked once all files have finished decoding.
    * callback-context (Object) - The context in which the callback will run."
  ([sound-manager files callback callback-context]
   (phaser->clj
    (.setDecodedCallback sound-manager
                         (clj->phaser files)
                         (clj->phaser callback)
                         (clj->phaser callback-context)))))

(defn set-touch-lock
  "Sets the Input Manager touch callback to be SoundManager.unlock.
  Required for iOS audio device unlocking. Mostly just used internally."
  ([sound-manager]
   (phaser->clj
    (.setTouchLock sound-manager))))

(defn stop-all
  "Stops all the sounds in the game."
  ([sound-manager]
   (phaser->clj
    (.stopAll sound-manager))))

(defn unlock
  "Enables the audio, usually after the first touch.

  Returns:  boolean - True if the callback should be removed, otherwise false."
  ([sound-manager]
   (phaser->clj
    (.unlock sound-manager))))