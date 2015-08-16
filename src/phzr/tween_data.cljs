(ns phzr.tween-data
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->TweenData
  "A Phaser.Tween contains at least one TweenData object. It contains all of the tween data values, such as the
  starting and ending values, the ease function, interpolation and duration. The Tween acts as a timeline manager for
  TweenData objects and can contain multiple TweenData objects.

  Parameters:
    * parent (Phaser.Tween) - The Tween that owns this TweenData object."
  ([parent]
   (js/Phaser.TweenData. (clj->phaser parent))))

(defn const
  [k]
  (when-let [cn (get phzr.impl.accessors.tween-data/tween-data-constants k)]
    (aget js/Phaser.TweenData cn)))

(defn from
  "Sets this tween to be a `from` tween on the properties given. A `from` tween sets the target to the destination value and tweens to its current value.
  For example a Sprite with an `x` coordinate of 100 tweened from `x` 500 would be set to `x` 500 and then tweened to `x` 100 by giving a properties object of `{ x: 500 }`.

  Parameters:
    * tween-data (Phaser.TweenData) - Targeted instance for method
    * properties (object) - The properties you want to tween, such as `Sprite.x` or `Sound.volume`. Given as a JavaScript object.
    * duration (number) {optional} - Duration of this tween in ms.
    * ease (function) {optional} - Easing function. If not set it will default to Phaser.Easing.Default, which is Phaser.Easing.Linear.None by default but can be over-ridden at will.
    * delay (number) {optional} - Delay before this tween will start, defaults to 0 (no delay). Value given is in ms.
    * repeat (number) {optional} - Should the tween automatically restart once complete? If you want it to run forever set as -1. This ignores any chained tweens.
    * yoyo (boolean) {optional} - A tween that yoyos will reverse itself and play backwards automatically. A yoyo'd tween doesn't fire the Tween.onComplete event, so listen for Tween.onLoop instead.

  Returns:  Phaser.TweenData - This Tween object."
  ([tween-data properties]
   (phaser->clj
    (.from tween-data
           (clj->phaser properties))))
  ([tween-data properties duration]
   (phaser->clj
    (.from tween-data
           (clj->phaser properties)
           (clj->phaser duration))))
  ([tween-data properties duration ease]
   (phaser->clj
    (.from tween-data
           (clj->phaser properties)
           (clj->phaser duration)
           (clj->phaser ease))))
  ([tween-data properties duration ease delay]
   (phaser->clj
    (.from tween-data
           (clj->phaser properties)
           (clj->phaser duration)
           (clj->phaser ease)
           (clj->phaser delay))))
  ([tween-data properties duration ease delay repeat]
   (phaser->clj
    (.from tween-data
           (clj->phaser properties)
           (clj->phaser duration)
           (clj->phaser ease)
           (clj->phaser delay)
           (clj->phaser repeat))))
  ([tween-data properties duration ease delay repeat yoyo]
   (phaser->clj
    (.from tween-data
           (clj->phaser properties)
           (clj->phaser duration)
           (clj->phaser ease)
           (clj->phaser delay)
           (clj->phaser repeat)
           (clj->phaser yoyo)))))

(defn generate-data
  "This will generate an array populated with the tweened object values from start to end.
  It works by running the tween simulation at the given frame rate based on the values set-up in Tween.to and Tween.from.
  Just one play through of the tween data is returned, including yoyo if set.

  Parameters:
    * tween-data (Phaser.TweenData) - Targeted instance for method
    * frame-rate (number) {optional} - The speed in frames per second that the data should be generated at. The higher the value, the larger the array it creates.

  Returns:  array - An array of tweened values."
  ([tween-data]
   (phaser->clj
    (.generateData tween-data)))
  ([tween-data frame-rate]
   (phaser->clj
    (.generateData tween-data
                   (clj->phaser frame-rate)))))

(defn start
  "Starts the Tween running.

  Returns:  Phaser.TweenData - This Tween object."
  ([tween-data]
   (phaser->clj
    (.start tween-data))))

(defn to
  "Sets this tween to be a `to` tween on the properties given. A `to` tween starts at the current value and tweens to the destination value given.
  For example a Sprite with an `x` coordinate of 100 could be tweened to `x` 200 by giving a properties object of `{ x: 200 }`.

  Parameters:
    * tween-data (Phaser.TweenData) - Targeted instance for method
    * properties (object) - The properties you want to tween, such as `Sprite.x` or `Sound.volume`. Given as a JavaScript object.
    * duration (number) {optional} - Duration of this tween in ms.
    * ease (function) {optional} - Easing function. If not set it will default to Phaser.Easing.Default, which is Phaser.Easing.Linear.None by default but can be over-ridden at will.
    * delay (number) {optional} - Delay before this tween will start, defaults to 0 (no delay). Value given is in ms.
    * repeat (number) {optional} - Should the tween automatically restart once complete? If you want it to run forever set as -1. This ignores any chained tweens.
    * yoyo (boolean) {optional} - A tween that yoyos will reverse itself and play backwards automatically. A yoyo'd tween doesn't fire the Tween.onComplete event, so listen for Tween.onLoop instead.

  Returns:  Phaser.TweenData - This Tween object."
  ([tween-data properties]
   (phaser->clj
    (.to tween-data
         (clj->phaser properties))))
  ([tween-data properties duration]
   (phaser->clj
    (.to tween-data
         (clj->phaser properties)
         (clj->phaser duration))))
  ([tween-data properties duration ease]
   (phaser->clj
    (.to tween-data
         (clj->phaser properties)
         (clj->phaser duration)
         (clj->phaser ease))))
  ([tween-data properties duration ease delay]
   (phaser->clj
    (.to tween-data
         (clj->phaser properties)
         (clj->phaser duration)
         (clj->phaser ease)
         (clj->phaser delay))))
  ([tween-data properties duration ease delay repeat]
   (phaser->clj
    (.to tween-data
         (clj->phaser properties)
         (clj->phaser duration)
         (clj->phaser ease)
         (clj->phaser delay)
         (clj->phaser repeat))))
  ([tween-data properties duration ease delay repeat yoyo]
   (phaser->clj
    (.to tween-data
         (clj->phaser properties)
         (clj->phaser duration)
         (clj->phaser ease)
         (clj->phaser delay)
         (clj->phaser repeat)
         (clj->phaser yoyo)))))