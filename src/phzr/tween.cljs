(ns phzr.tween
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [delay repeat loop update]))

(defn ->Tween
  "A Tween allows you to alter one or more properties of a target object over a defined period of time.
  This can be used for things such as alpha fading Sprites, scaling them or motion.
  Use `Tween.to` or `Tween.from` to set-up the tween values. You can create multiple tweens on the same object
  by calling Tween.to multiple times on the same Tween. Additional tweens specified in this way become 'child' tweens and
  are played through in sequence. You can use Tween.timeScale and Tween.reverse to control the playback of this Tween and all of its children.

  Parameters:
    * target (object) - The target object, such as a Phaser.Sprite or Phaser.Sprite.scale.
    * game (Phaser.Game) - Current game instance.
    * manager (Phaser.TweenManager) - The TweenManager responsible for looking after this Tween."
  ([target game manager]
   (js/Phaser.Tween. (clj->phaser target)
                     (clj->phaser game)
                     (clj->phaser manager))))

(defn chain
  "This method allows you to chain tweens together. Any tween chained to this tween will have its `Tween.start` method called
  as soon as this tween completes. If this tween never completes (i.e. repeatAll or loop is set) then the chain will never progress.
  Note that `Tween.onComplete` will fire when *this* tween completes, not when the whole chain completes.
  For that you should listen to `onComplete` on the final tween in your chain.

  If you pass multiple tweens to this method they will be joined into a single long chain.
  For example if this is Tween A and you pass in B, C and D then B will be chained to A, C will be chained to B and D will be chained to C.
  Any previously chained tweens that may have been set will be overwritten.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * tweens (Phaser.Tween) - One or more tweens that will be chained to this one.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween tweens]
   (phaser->clj
    (.chain tween
            (clj->phaser tweens)))))

(defn delay
  "Sets the delay in milliseconds before this tween will start. If there are child tweens it sets the delay before the first child starts.
  The delay is invoked as soon as you call `Tween.start`. If the tween is already running this method doesn't do anything for the current active tween.
  If you have not yet called `Tween.to` or `Tween.from` at least once then this method will do nothing, as there are no tweens to delay.
  If you have child tweens and pass -1 as the index value it sets the delay across all of them.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * duration (number) - The amount of time in ms that the Tween should wait until it begins once started is called. Set to zero to remove any active delay.
    * index (number) {optional} - If this tween has more than one child this allows you to target a specific child. If set to -1 it will set the delay on all the children.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween duration]
   (phaser->clj
    (.delay tween
            (clj->phaser duration))))
  ([tween duration index]
   (phaser->clj
    (.delay tween
            (clj->phaser duration)
            (clj->phaser index)))))

(defn easing
  "Set easing function this tween will use, i.e. Phaser.Easing.Linear.None.
  The ease function allows you define the rate of change. You can pass either a function such as Phaser.Easing.Circular.Out or a string such as 'Circ'.
  '.easeIn', '.easeOut' and 'easeInOut' variants are all supported for all ease types.
  If you have child tweens and pass -1 as the index value it sets the easing function defined here across all of them.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * ease (function | string) - The easing function this tween will use, i.e. Phaser.Easing.Linear.None.
    * index (number) {optional} - If this tween has more than one child this allows you to target a specific child. If set to -1 it will set the easing function on all children.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween ease]
   (phaser->clj
    (.easing tween
             (clj->phaser ease))))
  ([tween ease index]
   (phaser->clj
    (.easing tween
             (clj->phaser ease)
             (clj->phaser index)))))

(defn from
  "Sets this tween to be a `from` tween on the properties given. A `from` tween sets the target to the destination value and tweens to its current value.
  For example a Sprite with an `x` coordinate of 100 tweened from `x` 500 would be set to `x` 500 and then tweened to `x` 100 by giving a properties object of `{ x: 500 }`.
  The ease function allows you define the rate of change. You can pass either a function such as Phaser.Easing.Circular.Out or a string such as 'Circ'.
  '.easeIn', '.easeOut' and 'easeInOut' variants are all supported for all ease types.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * properties (object) - An object containing the properties you want to tween., such as `Sprite.x` or `Sound.volume`. Given as a JavaScript object.
    * duration (number) {optional} - Duration of this tween in ms.
    * ease (function | string) {optional} - Easing function. If not set it will default to Phaser.Easing.Default, which is Phaser.Easing.Linear.None by default but can be over-ridden.
    * auto-start (boolean) {optional} - Set to `true` to allow this tween to start automatically. Otherwise call Tween.start().
    * delay (number) {optional} - Delay before this tween will start in milliseconds. Defaults to 0, no delay.
    * repeat (number) {optional} - Should the tween automatically restart once complete? If you want it to run forever set as -1. This only effects this induvidual tween, not any chained tweens.
    * yoyo (boolean) {optional} - A tween that yoyos will reverse itself and play backwards automatically. A yoyo'd tween doesn't fire the Tween.onComplete event, so listen for Tween.onLoop instead.

  Returns:  Phaser.Tween - This Tween object."
  ([tween properties]
   (phaser->clj
    (.from tween
           (clj->phaser properties))))
  ([tween properties duration]
   (phaser->clj
    (.from tween
           (clj->phaser properties)
           (clj->phaser duration))))
  ([tween properties duration ease]
   (phaser->clj
    (.from tween
           (clj->phaser properties)
           (clj->phaser duration)
           (clj->phaser ease))))
  ([tween properties duration ease auto-start]
   (phaser->clj
    (.from tween
           (clj->phaser properties)
           (clj->phaser duration)
           (clj->phaser ease)
           (clj->phaser auto-start))))
  ([tween properties duration ease auto-start delay]
   (phaser->clj
    (.from tween
           (clj->phaser properties)
           (clj->phaser duration)
           (clj->phaser ease)
           (clj->phaser auto-start)
           (clj->phaser delay))))
  ([tween properties duration ease auto-start delay repeat]
   (phaser->clj
    (.from tween
           (clj->phaser properties)
           (clj->phaser duration)
           (clj->phaser ease)
           (clj->phaser auto-start)
           (clj->phaser delay)
           (clj->phaser repeat))))
  ([tween properties duration ease auto-start delay repeat yoyo]
   (phaser->clj
    (.from tween
           (clj->phaser properties)
           (clj->phaser duration)
           (clj->phaser ease)
           (clj->phaser auto-start)
           (clj->phaser delay)
           (clj->phaser repeat)
           (clj->phaser yoyo)))))

(defn generate-data
  "This will generate an array populated with the tweened object values from start to end.
  It works by running the tween simulation at the given frame rate based on the values set-up in Tween.to and Tween.from.
  It ignores delay and repeat counts and any chained tweens, but does include child tweens.
  Just one play through of the tween data is returned, including yoyo if set.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * frame-rate (number) {optional} - The speed in frames per second that the data should be generated at. The higher the value, the larger the array it creates.
    * data (array) {optional} - If given the generated data will be appended to this array, otherwise a new array will be returned.

  Returns:  array - An array of tweened values."
  ([tween]
   (phaser->clj
    (.generateData tween)))
  ([tween frame-rate]
   (phaser->clj
    (.generateData tween
                   (clj->phaser frame-rate))))
  ([tween frame-rate data]
   (phaser->clj
    (.generateData tween
                   (clj->phaser frame-rate)
                   (clj->phaser data)))))

(defn interpolation
  "Sets the interpolation function the tween will use. By default it uses Phaser.Math.linearInterpolation.
  Also available: Phaser.Math.bezierInterpolation and Phaser.Math.catmullRomInterpolation.
  The interpolation function is only used if the target properties is an array.
  If you have child tweens and pass -1 as the index value and it will set the interpolation function across all of them.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * interpolation (function) - The interpolation function to use (Phaser.Math.linearInterpolation by default)
    * context (object) {optional} - The context under which the interpolation function will be run.
    * index (number) {optional} - If this tween has more than one child this allows you to target a specific child. If set to -1 it will set the interpolation function on all children.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween interpolation]
   (phaser->clj
    (.interpolation tween
                    (clj->phaser interpolation))))
  ([tween interpolation context]
   (phaser->clj
    (.interpolation tween
                    (clj->phaser interpolation)
                    (clj->phaser context))))
  ([tween interpolation context index]
   (phaser->clj
    (.interpolation tween
                    (clj->phaser interpolation)
                    (clj->phaser context)
                    (clj->phaser index)))))

(defn loop
  "Enables the looping of this tween and all child tweens. If this tween has no children this setting has no effect.
  If `value` is `true` then this is the same as setting `Tween.repeatAll(-1)`.
  If `value` is `false` it is the same as setting `Tween.repeatAll(0)` and will reset the `repeatCounter` to zero.

  Usage:
  game.add.tween(p).to({ x: 700 }, 1000, Phaser.Easing.Linear.None, true)
  .to({ y: 300 }, 1000, Phaser.Easing.Linear.None)
  .to({ x: 0 }, 1000, Phaser.Easing.Linear.None)
  .to({ y: 0 }, 1000, Phaser.Easing.Linear.None)
  .loop();

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * value (boolean) {optional} - If `true` this tween and any child tweens will loop once they reach the end. Set to `false` to remove an active loop.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween]
   (phaser->clj
    (.loop tween)))
  ([tween value]
   (phaser->clj
    (.loop tween
           (clj->phaser value)))))

(defn on-update-callback
  "Sets a callback to be fired each time this tween updates.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * callback (function) - The callback to invoke each time this tween is updated. Set to `null` to remove an already active callback.
    * callback-context (object) - The context in which to call the onUpdate callback.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween callback callback-context]
   (phaser->clj
    (.onUpdateCallback tween
                       (clj->phaser callback)
                       (clj->phaser callback-context)))))

(defn pause
  "Pauses the tween. Resume playback with Tween.resume."
  ([tween]
   (phaser->clj
    (.pause tween))))

(defn repeat
  "Sets the number of times this tween will repeat.
  If you have not yet called `Tween.to` or `Tween.from` at least once then this method will do nothing, as there are no tweens to repeat.
  If you have child tweens and pass -1 as the index value it sets the number of times they'll repeat across all of them.
  If you wish to define how many times this Tween and all children will repeat see Tween.repeatAll.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * total (number) - How many times a tween should repeat before completing. Set to zero to remove an active repeat. Set to -1 to repeat forever.
    * repeat (number) {optional} - This is the amount of time to pause (in ms) before the repeat will start.
    * index (number) {optional} - If this tween has more than one child this allows you to target a specific child. If set to -1 it will set the repeat value on all the children.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween total]
   (phaser->clj
    (.repeat tween
             (clj->phaser total))))
  ([tween total repeat]
   (phaser->clj
    (.repeat tween
             (clj->phaser total)
             (clj->phaser repeat))))
  ([tween total repeat index]
   (phaser->clj
    (.repeat tween
             (clj->phaser total)
             (clj->phaser repeat)
             (clj->phaser index)))))

(defn repeat-all
  "Set how many times this tween and all of its children will repeat.
  A tween (A) with 3 children (B,C,D) with a `repeatAll` value of 2 would play as: ABCDABCD before completing.
  When all child tweens have completed Tween.onLoop will be dispatched.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * total (number) - How many times this tween and all children should repeat before completing. Set to zero to remove an active repeat. Set to -1 to repeat forever.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween total]
   (phaser->clj
    (.repeatAll tween
                (clj->phaser total)))))

(defn repeat-delay
  "Sets the delay in milliseconds before this tween will repeat itself.
  The repeatDelay is invoked as soon as you call `Tween.start`. If the tween is already running this method doesn't do anything for the current active tween.
  If you have not yet called `Tween.to` or `Tween.from` at least once then this method will do nothing, as there are no tweens to set repeatDelay on.
  If you have child tweens and pass -1 as the index value it sets the repeatDelay across all of them.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * duration (number) - The amount of time in ms that the Tween should wait until it repeats or yoyos once start is called. Set to zero to remove any active repeatDelay.
    * index (number) {optional} - If this tween has more than one child this allows you to target a specific child. If set to -1 it will set the repeatDelay on all the children.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween duration]
   (phaser->clj
    (.repeatDelay tween
                  (clj->phaser duration))))
  ([tween duration index]
   (phaser->clj
    (.repeatDelay tween
                  (clj->phaser duration)
                  (clj->phaser index)))))

(defn resume
  "Resumes a paused tween."
  ([tween]
   (phaser->clj
    (.resume tween))))

(defn start
  "Starts the tween running. Can also be called by the autoStart parameter of `Tween.to` or `Tween.from`.
  This sets the `Tween.isRunning` property to `true` and dispatches a `Tween.onStart` signal.
  If the Tween has a delay set then nothing will start tweening until the delay has expired.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * index (number) {optional} - If this Tween contains child tweens you can specify which one to start from. The default is zero, i.e. the first tween created.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween]
   (phaser->clj
    (.start tween)))
  ([tween index]
   (phaser->clj
    (.start tween
            (clj->phaser index)))))

(defn stop
  "Stops the tween if running and flags it for deletion from the TweenManager.
  If called directly the `Tween.onComplete` signal is not dispatched and no chained tweens are started unless the complete parameter is set to `true`.
  If you just wish to pause a tween then use Tween.pause instead.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * complete (boolean) {optional} - Set to `true` to dispatch the Tween.onComplete signal.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween]
   (phaser->clj
    (.stop tween)))
  ([tween complete]
   (phaser->clj
    (.stop tween
           (clj->phaser complete)))))

(defn to
  "Sets this tween to be a `to` tween on the properties given. A `to` tween starts at the current value and tweens to the destination value given.
  For example a Sprite with an `x` coordinate of 100 could be tweened to `x` 200 by giving a properties object of `{ x: 200 }`.
  The ease function allows you define the rate of change. You can pass either a function such as Phaser.Easing.Circular.Out or a string such as 'Circ'.
  '.easeIn', '.easeOut' and 'easeInOut' variants are all supported for all ease types.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * properties (object) - An object containing the properties you want to tween, such as `Sprite.x` or `Sound.volume`. Given as a JavaScript object.
    * duration (number) {optional} - Duration of this tween in ms.
    * ease (function | string) {optional} - Easing function. If not set it will default to Phaser.Easing.Default, which is Phaser.Easing.Linear.None by default but can be over-ridden.
    * auto-start (boolean) {optional} - Set to `true` to allow this tween to start automatically. Otherwise call Tween.start().
    * delay (number) {optional} - Delay before this tween will start in milliseconds. Defaults to 0, no delay.
    * repeat (number) {optional} - Should the tween automatically restart once complete? If you want it to run forever set as -1. This only effects this induvidual tween, not any chained tweens.
    * yoyo (boolean) {optional} - A tween that yoyos will reverse itself and play backwards automatically. A yoyo'd tween doesn't fire the Tween.onComplete event, so listen for Tween.onLoop instead.

  Returns:  Phaser.Tween - This Tween object."
  ([tween properties]
   (phaser->clj
    (.to tween
         (clj->phaser properties))))
  ([tween properties duration]
   (phaser->clj
    (.to tween
         (clj->phaser properties)
         (clj->phaser duration))))
  ([tween properties duration ease]
   (phaser->clj
    (.to tween
         (clj->phaser properties)
         (clj->phaser duration)
         (clj->phaser ease))))
  ([tween properties duration ease auto-start]
   (phaser->clj
    (.to tween
         (clj->phaser properties)
         (clj->phaser duration)
         (clj->phaser ease)
         (clj->phaser auto-start))))
  ([tween properties duration ease auto-start delay]
   (phaser->clj
    (.to tween
         (clj->phaser properties)
         (clj->phaser duration)
         (clj->phaser ease)
         (clj->phaser auto-start)
         (clj->phaser delay))))
  ([tween properties duration ease auto-start delay repeat]
   (phaser->clj
    (.to tween
         (clj->phaser properties)
         (clj->phaser duration)
         (clj->phaser ease)
         (clj->phaser auto-start)
         (clj->phaser delay)
         (clj->phaser repeat))))
  ([tween properties duration ease auto-start delay repeat yoyo]
   (phaser->clj
    (.to tween
         (clj->phaser properties)
         (clj->phaser duration)
         (clj->phaser ease)
         (clj->phaser auto-start)
         (clj->phaser delay)
         (clj->phaser repeat)
         (clj->phaser yoyo)))))

(defn update
  "Core tween update function called by the TweenManager. Does not need to be invoked directly.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * time (number) - A timestamp passed in by the TweenManager.

  Returns:  boolean - false if the tween and all child tweens have completed and should be deleted from the manager, otherwise true (still active)."
  ([tween time]
   (phaser->clj
    (.update tween
             (clj->phaser time)))))

(defn update-tween-data
  "Updates either a single TweenData or all TweenData objects properties to the given value.
  Used internally by methods like Tween.delay, Tween.yoyo, etc. but can also be called directly if you know which property you want to tweak.
  The property is not checked, so if you pass an invalid one you'll generate a run-time error.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * property (string) - The property to update.
    * value (number | function) - The value to set the property to.
    * index (number) {optional} - If this tween has more than one child this allows you to target a specific child. If set to -1 it will set the delay on all the children.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween property value]
   (phaser->clj
    (.updateTweenData tween
                      (clj->phaser property)
                      (clj->phaser value))))
  ([tween property value index]
   (phaser->clj
    (.updateTweenData tween
                      (clj->phaser property)
                      (clj->phaser value)
                      (clj->phaser index)))))

(defn yoyo
  "A Tween that has yoyo set to true will run through from its starting values to its end values and then play back in reverse from end to start.
  Used in combination with repeat you can create endless loops.
  If you have not yet called `Tween.to` or `Tween.from` at least once then this method will do nothing, as there are no tweens to yoyo.
  If you have child tweens and pass -1 as the index value it sets the yoyo property across all of them.
  If you wish to yoyo this Tween and all of its children then see Tween.yoyoAll.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * enable (boolean) - Set to true to yoyo this tween, or false to disable an already active yoyo.
    * yoyo-delay (number) {optional} - This is the amount of time to pause (in ms) before the yoyo will start.
    * index (number) {optional} - If this tween has more than one child this allows you to target a specific child. If set to -1 it will set yoyo on all the children.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween enable]
   (phaser->clj
    (.yoyo tween
           (clj->phaser enable))))
  ([tween enable yoyo-delay]
   (phaser->clj
    (.yoyo tween
           (clj->phaser enable)
           (clj->phaser yoyo-delay))))
  ([tween enable yoyo-delay index]
   (phaser->clj
    (.yoyo tween
           (clj->phaser enable)
           (clj->phaser yoyo-delay)
           (clj->phaser index)))))

(defn yoyo-delay
  "Sets the delay in milliseconds before this tween will run a yoyo (only applies if yoyo is enabled).
  The repeatDelay is invoked as soon as you call `Tween.start`. If the tween is already running this method doesn't do anything for the current active tween.
  If you have not yet called `Tween.to` or `Tween.from` at least once then this method will do nothing, as there are no tweens to set repeatDelay on.
  If you have child tweens and pass -1 as the index value it sets the repeatDelay across all of them.

  Parameters:
    * tween (Phaser.Tween) - Targeted instance for method
    * duration (number) - The amount of time in ms that the Tween should wait until it repeats or yoyos once start is called. Set to zero to remove any active yoyoDelay.
    * index (number) {optional} - If this tween has more than one child this allows you to target a specific child. If set to -1 it will set the yoyoDelay on all the children.

  Returns:  Phaser.Tween - This tween. Useful for method chaining."
  ([tween duration]
   (phaser->clj
    (.yoyoDelay tween
                (clj->phaser duration))))
  ([tween duration index]
   (phaser->clj
    (.yoyoDelay tween
                (clj->phaser duration)
                (clj->phaser index)))))