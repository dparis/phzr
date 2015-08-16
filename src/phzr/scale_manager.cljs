(ns phzr.scale-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->ScaleManager
  "Create a new ScaleManager object - this is done automatically by {@link Phaser.Game}

  The `width` and `height` constructor parameters can either be a number which represents pixels or a string that represents a percentage: e.g. `800` (for 800 pixels) or `'80%'` for 80%.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * width (number | string) - The width of the game. See above.
    * height (number | string) - The height of the game. See above."
  ([game width height]
   (js/Phaser.ScaleManager. (clj->phaser game)
                            (clj->phaser width)
                            (clj->phaser height))))

(defn const
  [k]
  (when-let [cn (get phzr.impl.accessors.scale-manager/scale-manager-constants k)]
    (aget js/Phaser.ScaleManager cn)))

(defn force-orientation
  "Force the game to run in only one orientation.

  This enables generation of incorrect orientation signals and affects resizing but does not otherwise rotate or lock the orientation.

  Orientation checks are performed via the Screen Orientation API, if available in browser. This means it will check your monitor
  orientation on desktop, or your device orientation on mobile, rather than comparing actual game dimensions. If you need to check the 
  viewport dimensions instead and bypass the Screen Orientation API then set: `ScaleManager.compatibility.orientationFallback = 'viewport'`

  Parameters:
    * scale-manager (Phaser.ScaleManager) - Targeted instance for method
    * force-landscape (boolean) - true if the game should run in landscape mode only.
    * force-portrait (boolean) {optional} - true if the game should run in portrait mode only."
  ([scale-manager force-landscape]
   (phaser->clj
    (.forceOrientation scale-manager
                       (clj->phaser force-landscape))))
  ([scale-manager force-landscape force-portrait]
   (phaser->clj
    (.forceOrientation scale-manager
                       (clj->phaser force-landscape)
                       (clj->phaser force-portrait)))))

(defn refresh
  "The 'refresh' methods informs the ScaleManager that a layout refresh is required.

  The ScaleManager automatically queues a layout refresh (eg. updates the Game size or Display canvas layout)
  when the browser is resized, the orientation changes, or when there is a detected change
  of the Parent size. Refreshing is also done automatically when public properties,
  such as {@link Phaser.ScaleManager#scaleMode scaleMode}, are updated or state-changing methods are invoked.

  The 'refresh' method _may_ need to be used in a few (rare) situtations when

  - a device change event is not correctly detected; or
  - the Parent size changes (and an immediate reflow is desired); or
  - the ScaleManager state is updated by non-standard means; or
  - certain {@link Phaser.ScaleManager#compatibility compatibility} properties are manually changed.

  The queued layout refresh is not immediate but will run promptly in an upcoming `preRender`."
  ([scale-manager]
   (phaser->clj
    (.refresh scale-manager))))

(defn set-game-size
  "Set the actual Game size.
  Use this instead of directly changing `game.width` or `game.height`.

  The actual physical display (Canvas element size) depends on various settings including
  - Scale mode
  - Scaling factor
  - Size of Canvas's parent element or CSS rules such as min-height/max-height;
  - The size of the Window

  Parameters:
    * scale-manager (Phaser.ScaleManager) - Targeted instance for method
    * width (integer) - _Game width_, in pixels.
    * height (integer) - _Game height_, in pixels."
  ([scale-manager width height]
   (phaser->clj
    (.setGameSize scale-manager
                  (clj->phaser width)
                  (clj->phaser height)))))

(defn set-min-max
  "Set the min and max dimensions for the Display canvas.

  _Note:_ The min/max dimensions are only applied in some cases
  - When the device is not in an incorrect orientation; or
  - The scale mode is EXACT_FIT when not in fullscreen

  Parameters:
    * scale-manager (Phaser.ScaleManager) - Targeted instance for method
    * min-width (number) - The minimum width the game is allowed to scale down to.
    * min-height (number) - The minimum height the game is allowed to scale down to.
    * max-width (number) {optional} - The maximum width the game is allowed to scale up to; only changed if specified.
    * max-height (number) {optional} - The maximum height the game is allowed to scale up to; only changed if specified."
  ([scale-manager min-width min-height]
   (phaser->clj
    (.setMinMax scale-manager
                (clj->phaser min-width)
                (clj->phaser min-height))))
  ([scale-manager min-width min-height max-width]
   (phaser->clj
    (.setMinMax scale-manager
                (clj->phaser min-width)
                (clj->phaser min-height)
                (clj->phaser max-width))))
  ([scale-manager min-width min-height max-width max-height]
   (phaser->clj
    (.setMinMax scale-manager
                (clj->phaser min-width)
                (clj->phaser min-height)
                (clj->phaser max-width)
                (clj->phaser max-height)))))

(defn set-resize-callback
  "Sets the callback that will be invoked before sizing calculations.

  This is the appropriate place to call {@link Phaser.ScaleManager#setUserScale setUserScale} if needing custom dynamic scaling.

  The callback is supplied with two arguments `scale` and `parentBounds` where `scale` is the ScaleManager
  and `parentBounds`, a Phaser.Rectangle, is the size of the Parent element.

  This callback
  - May be invoked even though the parent container or canvas sizes have not changed
  - Unlike {@link Phaser.ScaleManager#onSizeChange onSizeChange}, it runs _before_ the canvas is guaranteed to be updated
  - Will be invoked from `preUpdate`, _even when_ the game is paused    

  See {@link Phaser.ScaleManager#onSizeChange onSizeChange} for a better way of reacting to layout updates.

  Parameters:
    * scale-manager (Phaser.ScaleManager) - Targeted instance for method
    * callback (function) - The callback that will be called each time a window.resize event happens or if set, the parent container resizes.
    * context (object) - The context in which the callback will be called."
  ([scale-manager callback context]
   (phaser->clj
    (.setResizeCallback scale-manager
                        (clj->phaser callback)
                        (clj->phaser context)))))

(defn set-user-scale
  "Set a User scaling factor used in the USER_SCALE scaling mode.

  The target canvas size is computed by:

      canvas.width = (game.width * hScale) - hTrim
      canvas.height = (game.height * vScale) - vTrim

  This method can be used in the {@link Phaser.ScaleManager#setResizeCallback resize callback}.

  Parameters:
    * scale-manager (Phaser.ScaleManager) - Targeted instance for method
    * h-scale (number) - Horizontal scaling factor.
    * v-scale (numer) - Vertical scaling factor.
    * h-trim (integer) {optional} - Horizontal trim, applied after scaling.
    * v-trim (integer) {optional} - Vertical trim, applied after scaling."
  ([scale-manager h-scale v-scale]
   (phaser->clj
    (.setUserScale scale-manager
                   (clj->phaser h-scale)
                   (clj->phaser v-scale))))
  ([scale-manager h-scale v-scale h-trim]
   (phaser->clj
    (.setUserScale scale-manager
                   (clj->phaser h-scale)
                   (clj->phaser v-scale)
                   (clj->phaser h-trim))))
  ([scale-manager h-scale v-scale h-trim v-trim]
   (phaser->clj
    (.setUserScale scale-manager
                   (clj->phaser h-scale)
                   (clj->phaser v-scale)
                   (clj->phaser h-trim)
                   (clj->phaser v-trim)))))

(defn start-full-screen
  "Start the browsers fullscreen mode - this _must_ be called from a user input Pointer or Mouse event.

  The Fullscreen API must be supported by the browser for this to work - it is not the same as setting
  the game size to fill the browser window. See {@link Phaser.ScaleManager#compatibility compatibility.supportsFullScreen} to check if the current
  device is reported to support fullscreen mode.

  The {@link Phaser.ScaleManager#fullScreenFailed fullScreenFailed} signal will be dispatched if the fullscreen change request failed or the game does not support the Fullscreen API.

  Parameters:
    * scale-manager (Phaser.ScaleManager) - Targeted instance for method
    * antialias (boolean) {optional} - Changes the anti-alias feature of the canvas before jumping in to fullscreen (false = retain pixel art, true = smooth art). If not specified then no change is made. Only works in CANVAS mode.
    * allow-trampoline (boolean) {optional} - Internal argument. If `false` click trampolining is suppressed.

  Returns:  boolean - Returns true if the device supports fullscreen mode and fullscreen mode was attempted to be started. (It might not actually start, wait for the signals.)"
  ([scale-manager]
   (phaser->clj
    (.startFullScreen scale-manager)))
  ([scale-manager antialias]
   (phaser->clj
    (.startFullScreen scale-manager
                      (clj->phaser antialias))))
  ([scale-manager antialias allow-trampoline]
   (phaser->clj
    (.startFullScreen scale-manager
                      (clj->phaser antialias)
                      (clj->phaser allow-trampoline)))))

(defn stop-full-screen
  "Stops / exits fullscreen mode, if active.

  Returns:  boolean - Returns true if the browser supports fullscreen mode and fullscreen mode will be exited."
  ([scale-manager]
   (phaser->clj
    (.stopFullScreen scale-manager))))