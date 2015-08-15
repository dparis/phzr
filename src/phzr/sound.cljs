(ns phzr.sound
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Sound
  "The Sound class constructor.

  Parameters:
    * game (Phaser.Game) - Reference to the current game instance.
    * key (string) - Asset key for the sound.
    * volume (number) {optional} - Default value for the volume, between 0 and 1.
    * loop (boolean) {optional} - Whether or not the sound will loop."
  ([game key]
   (js/Phaser.Sound. (clj->phaser game)
                     (clj->phaser key)))
  ([game key volume]
   (js/Phaser.Sound. (clj->phaser game)
                     (clj->phaser key)
                     (clj->phaser volume)))
  ([game key volume loop]
   (js/Phaser.Sound. (clj->phaser game)
                     (clj->phaser key)
                     (clj->phaser volume)
                     (clj->phaser loop))))

(defn add-marker
  "Adds a marker into the current Sound. A marker is represented by a unique key and a start time and duration.
  This allows you to bundle multiple sounds together into a single audio file and use markers to jump between them for playback.

  Parameters:
    * sound (Phaser.Sound) - Targeted instance for method
    * name (string) - A unique name for this marker, i.e. 'explosion', 'gunshot', etc.
    * start (number) - The start point of this marker in the audio file, given in seconds. 2.5 = 2500ms, 0.5 = 500ms, etc.
    * duration (number) - The duration of the marker in seconds. 2.5 = 2500ms, 0.5 = 500ms, etc.
    * volume (number) {optional} - The volume the sound will play back at, between 0 (silent) and 1 (full volume).
    * loop (boolean) {optional} - Sets if the sound will loop or not."
  ([sound name start duration]
   (phaser->clj
    (.addMarker sound
                (clj->phaser name)
                (clj->phaser start)
                (clj->phaser duration))))
  ([sound name start duration volume]
   (phaser->clj
    (.addMarker sound
                (clj->phaser name)
                (clj->phaser start)
                (clj->phaser duration)
                (clj->phaser volume))))
  ([sound name start duration volume loop]
   (phaser->clj
    (.addMarker sound
                (clj->phaser name)
                (clj->phaser start)
                (clj->phaser duration)
                (clj->phaser volume)
                (clj->phaser loop)))))

(defn destroy
  "Destroys this sound and all associated events and removes it from the SoundManager.

  Parameters:
    * sound (Phaser.Sound) - Targeted instance for method
    * remove (boolean) {optional} - If true this Sound is automatically removed from the SoundManager."
  ([sound]
   (phaser->clj
    (.destroy sound)))
  ([sound remove]
   (phaser->clj
    (.destroy sound
              (clj->phaser remove)))))

(defn fade-in
  "Starts this sound playing (or restarts it if already doing so) and sets the volume to zero.
  Then increases the volume from 0 to 1 over the duration specified.

  At the end of the fade Sound.onFadeComplete is dispatched with this Sound object as the first parameter,
  and the final volume (1) as the second parameter.

  Parameters:
    * sound (Phaser.Sound) - Targeted instance for method
    * duration (number) {optional} - The time in milliseconds over which the Sound should fade in.
    * loop (boolean) {optional} - Should the Sound be set to loop? Note that this doesn't cause the fade to repeat.
    * marker (string) {optional} - The marker to start at; defaults to the current (last played) marker. To start playing from the beginning specify specify a marker of `''`."
  ([sound]
   (phaser->clj
    (.fadeIn sound)))
  ([sound duration]
   (phaser->clj
    (.fadeIn sound
             (clj->phaser duration))))
  ([sound duration loop]
   (phaser->clj
    (.fadeIn sound
             (clj->phaser duration)
             (clj->phaser loop))))
  ([sound duration loop marker]
   (phaser->clj
    (.fadeIn sound
             (clj->phaser duration)
             (clj->phaser loop)
             (clj->phaser marker)))))

(defn fade-out
  "Decreases the volume of this Sound from its current value to 0 over the duration specified.
  At the end of the fade Sound.onFadeComplete is dispatched with this Sound object as the first parameter,
  and the final volume (0) as the second parameter.

  Parameters:
    * sound (Phaser.Sound) - Targeted instance for method
    * duration (number) {optional} - The time in milliseconds over which the Sound should fade out."
  ([sound]
   (phaser->clj
    (.fadeOut sound)))
  ([sound duration]
   (phaser->clj
    (.fadeOut sound
              (clj->phaser duration)))))

(defn fade-to
  "Fades the volume of this Sound from its current value to the given volume over the duration specified.
  At the end of the fade Sound.onFadeComplete is dispatched with this Sound object as the first parameter, 
  and the final volume (volume) as the second parameter.

  Parameters:
    * sound (Phaser.Sound) - Targeted instance for method
    * duration (number) {optional} - The time in milliseconds during which the Sound should fade out.
    * volume (number) {optional} - The volume which the Sound should fade to. This is a value between 0 and 1."
  ([sound]
   (phaser->clj
    (.fadeTo sound)))
  ([sound duration]
   (phaser->clj
    (.fadeTo sound
             (clj->phaser duration))))
  ([sound duration volume]
   (phaser->clj
    (.fadeTo sound
             (clj->phaser duration)
             (clj->phaser volume)))))

(defn loop-full
  "Loops this entire sound. If you need to loop a section of it then use Sound.play and the marker and loop parameters.

  Parameters:
    * sound (Phaser.Sound) - Targeted instance for method
    * volume (number) {optional} - Volume of the sound you want to play. If none is given it will use the volume given to the Sound when it was created (which defaults to 1 if none was specified).

  Returns:  Phaser.Sound - This sound instance."
  ([sound]
   (phaser->clj
    (.loopFull sound)))
  ([sound volume]
   (phaser->clj
    (.loopFull sound
               (clj->phaser volume)))))

(defn pause
  "Pauses the sound."
  ([sound]
   (phaser->clj
    (.pause sound))))

(defn play
  "Play this sound, or a marked section of it.

  Parameters:
    * sound (Phaser.Sound) - Targeted instance for method
    * marker (string) {optional} - If you want to play a marker then give the key here, otherwise leave blank to play the full sound.
    * position (number) {optional} - The starting position to play the sound from - this is ignored if you provide a marker.
    * volume (number) {optional} - Volume of the sound you want to play. If none is given it will use the volume given to the Sound when it was created (which defaults to 1 if none was specified).
    * loop (boolean) {optional} - Loop when finished playing? If not using a marker / audio sprite the looping will be done via the WebAudio loop property, otherwise it's time based.
    * force-restart (boolean) {optional} - If the sound is already playing you can set forceRestart to restart it from the beginning.

  Returns:  Phaser.Sound - This sound instance."
  ([sound]
   (phaser->clj
    (.play sound)))
  ([sound marker]
   (phaser->clj
    (.play sound
           (clj->phaser marker))))
  ([sound marker position]
   (phaser->clj
    (.play sound
           (clj->phaser marker)
           (clj->phaser position))))
  ([sound marker position volume]
   (phaser->clj
    (.play sound
           (clj->phaser marker)
           (clj->phaser position)
           (clj->phaser volume))))
  ([sound marker position volume loop]
   (phaser->clj
    (.play sound
           (clj->phaser marker)
           (clj->phaser position)
           (clj->phaser volume)
           (clj->phaser loop))))
  ([sound marker position volume loop force-restart]
   (phaser->clj
    (.play sound
           (clj->phaser marker)
           (clj->phaser position)
           (clj->phaser volume)
           (clj->phaser loop)
           (clj->phaser force-restart)))))

(defn remove-marker
  "Removes a marker from the sound.

  Parameters:
    * sound (Phaser.Sound) - Targeted instance for method
    * name (string) - The key of the marker to remove."
  ([sound name]
   (phaser->clj
    (.removeMarker sound
                   (clj->phaser name)))))

(defn restart
  "Restart the sound, or a marked section of it.

  Parameters:
    * sound (Phaser.Sound) - Targeted instance for method
    * marker (string) {optional} - If you want to play a marker then give the key here, otherwise leave blank to play the full sound.
    * position (number) {optional} - The starting position to play the sound from - this is ignored if you provide a marker.
    * volume (number) {optional} - Volume of the sound you want to play.
    * loop (boolean) {optional} - Loop when it finished playing?"
  ([sound]
   (phaser->clj
    (.restart sound)))
  ([sound marker]
   (phaser->clj
    (.restart sound
              (clj->phaser marker))))
  ([sound marker position]
   (phaser->clj
    (.restart sound
              (clj->phaser marker)
              (clj->phaser position))))
  ([sound marker position volume]
   (phaser->clj
    (.restart sound
              (clj->phaser marker)
              (clj->phaser position)
              (clj->phaser volume))))
  ([sound marker position volume loop]
   (phaser->clj
    (.restart sound
              (clj->phaser marker)
              (clj->phaser position)
              (clj->phaser volume)
              (clj->phaser loop)))))

(defn resume
  "Resumes the sound."
  ([sound]
   (phaser->clj
    (.resume sound))))

(defn stop
  "Stop playing this sound."
  ([sound]
   (phaser->clj
    (.stop sound))))