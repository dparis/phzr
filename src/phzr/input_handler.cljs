(ns phzr.input-handler
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->InputHandler
  "The Input Handler is bound to a specific Sprite and is responsible for managing all Input events on that Sprite.

  Parameters:
    * sprite (Phaser.Sprite) - The Sprite object to which this Input Handler belongs."
  ([sprite]
   (js/Phaser.InputHandler. (clj->phaser sprite))))

(defn check-bounds-rect
  "Bounds Rect check for the sprite drag"
  ([input-handler]
   (phaser->clj
    (.checkBoundsRect input-handler))))

(defn check-bounds-sprite
  "Parent Sprite Bounds check for the sprite drag."
  ([input-handler]
   (phaser->clj
    (.checkBoundsSprite input-handler))))

(defn check-pixel
  "Runs a pixel perfect check against the given x/y coordinates of the Sprite this InputHandler is bound to.
  It compares the alpha value of the pixel and if >= InputHandler.pixelPerfectAlpha it returns true.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * x (number) - The x coordinate to check.
    * y (number) - The y coordinate to check.
    * pointer (Phaser.Pointer) {optional} - The pointer to get the x/y coordinate from if not passed as the first two parameters.

  Returns:  boolean - true if there is the alpha of the pixel is >= InputHandler.pixelPerfectAlpha"
  ([input-handler x y]
   (phaser->clj
    (.checkPixel input-handler
                 (clj->phaser x)
                 (clj->phaser y))))
  ([input-handler x y pointer]
   (phaser->clj
    (.checkPixel input-handler
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser pointer)))))

(defn check-pointer-down
  "Checks if the given pointer is both down and over the Sprite this InputHandler belongs to.
  Use the `fastTest` flag is to quickly check just the bounding hit area even if `InputHandler.pixelPerfectOver` is `true`.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description
    * fast-test (boolean) {optional} - Force a simple hit area check even if `pixelPerfectOver` is true for this object?

  Returns:  boolean - True if the pointer is down, otherwise false."
  ([input-handler pointer]
   (phaser->clj
    (.checkPointerDown input-handler
                       (clj->phaser pointer))))
  ([input-handler pointer fast-test]
   (phaser->clj
    (.checkPointerDown input-handler
                       (clj->phaser pointer)
                       (clj->phaser fast-test)))))

(defn check-pointer-over
  "Checks if the given pointer is over the Sprite this InputHandler belongs to.
  Use the `fastTest` flag is to quickly check just the bounding hit area even if `InputHandler.pixelPerfectOver` is `true`.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description
    * fast-test (boolean) {optional} - Force a simple hit area check even if `pixelPerfectOver` is true for this object?

  Returns:  boolean - "
  ([input-handler pointer]
   (phaser->clj
    (.checkPointerOver input-handler
                       (clj->phaser pointer))))
  ([input-handler pointer fast-test]
   (phaser->clj
    (.checkPointerOver input-handler
                       (clj->phaser pointer)
                       (clj->phaser fast-test)))))

(defn destroy
  "Clean up memory."
  ([input-handler]
   (phaser->clj
    (.destroy input-handler))))

(defn disable-drag
  "Stops this sprite from being able to be dragged. If it is currently the target of an active drag it will be stopped immediately. Also disables any set callbacks."
  ([input-handler]
   (phaser->clj
    (.disableDrag input-handler))))

(defn disable-snap
  "Stops the sprite from snapping to a grid during drag or release."
  ([input-handler]
   (phaser->clj
    (.disableSnap input-handler))))

(defn down-duration
  "If the pointer is currently over this Sprite this returns how long it has been there for in milliseconds.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description

  Returns:  number - The number of milliseconds the pointer has been pressed down on the Sprite, or -1 if not over."
  ([input-handler pointer]
   (phaser->clj
    (.downDuration input-handler
                   (clj->phaser pointer)))))

(defn enable-drag
  "Allow this Sprite to be dragged by any valid pointer.

  When the drag begins the Sprite.events.onDragStart event will be dispatched.

  When the drag completes by way of the user letting go of the pointer that was dragging the sprite, the Sprite.events.onDragStop event is dispatched.

  For the duration of the drag the Sprite.events.onDragUpdate event is dispatched. This event is only dispatched when the pointer actually
  changes position and moves. The event sends 5 parameters: `sprite`, `pointer`, `dragX`, `dragY` and `snapPoint`.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * lock-center (boolean) {optional} - If false the Sprite will drag from where you click it minus the dragOffset. If true it will center itself to the tip of the mouse pointer.
    * bring-to-top (boolean) {optional} - If true the Sprite will be bought to the top of the rendering list in its current Group.
    * pixel-perfect (boolean) {optional} - If true it will use a pixel perfect test to see if you clicked the Sprite. False uses the bounding box.
    * alpha-threshold (boolean) {optional} - If using pixel perfect collision this specifies the alpha level from 0 to 255 above which a collision is processed.
    * bounds-rect (Phaser.Rectangle) {optional} - If you want to restrict the drag of this sprite to a specific Rectangle, pass the Phaser.Rectangle here, otherwise it's free to drag anywhere.
    * bounds-sprite (Phaser.Sprite) {optional} - If you want to restrict the drag of this sprite to within the bounding box of another sprite, pass it here."
  ([input-handler]
   (phaser->clj
    (.enableDrag input-handler)))
  ([input-handler lock-center]
   (phaser->clj
    (.enableDrag input-handler
                 (clj->phaser lock-center))))
  ([input-handler lock-center bring-to-top]
   (phaser->clj
    (.enableDrag input-handler
                 (clj->phaser lock-center)
                 (clj->phaser bring-to-top))))
  ([input-handler lock-center bring-to-top pixel-perfect]
   (phaser->clj
    (.enableDrag input-handler
                 (clj->phaser lock-center)
                 (clj->phaser bring-to-top)
                 (clj->phaser pixel-perfect))))
  ([input-handler lock-center bring-to-top pixel-perfect alpha-threshold]
   (phaser->clj
    (.enableDrag input-handler
                 (clj->phaser lock-center)
                 (clj->phaser bring-to-top)
                 (clj->phaser pixel-perfect)
                 (clj->phaser alpha-threshold))))
  ([input-handler lock-center bring-to-top pixel-perfect alpha-threshold bounds-rect]
   (phaser->clj
    (.enableDrag input-handler
                 (clj->phaser lock-center)
                 (clj->phaser bring-to-top)
                 (clj->phaser pixel-perfect)
                 (clj->phaser alpha-threshold)
                 (clj->phaser bounds-rect))))
  ([input-handler lock-center bring-to-top pixel-perfect alpha-threshold bounds-rect bounds-sprite]
   (phaser->clj
    (.enableDrag input-handler
                 (clj->phaser lock-center)
                 (clj->phaser bring-to-top)
                 (clj->phaser pixel-perfect)
                 (clj->phaser alpha-threshold)
                 (clj->phaser bounds-rect)
                 (clj->phaser bounds-sprite)))))

(defn enable-snap
  "Make this Sprite snap to the given grid either during drag or when it's released.
  For example 16x16 as the snapX and snapY would make the sprite snap to every 16 pixels.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * snap-x (number) - The width of the grid cell to snap to.
    * snap-y (number) - The height of the grid cell to snap to.
    * on-drag (boolean) {optional} - If true the sprite will snap to the grid while being dragged.
    * on-release (boolean) {optional} - If true the sprite will snap to the grid when released.
    * snap-offset-x (number) {optional} - Used to offset the top-left starting point of the snap grid.
    * snap-offset-y (number) {optional} - Used to offset the top-left starting point of the snap grid."
  ([input-handler snap-x snap-y]
   (phaser->clj
    (.enableSnap input-handler
                 (clj->phaser snap-x)
                 (clj->phaser snap-y))))
  ([input-handler snap-x snap-y on-drag]
   (phaser->clj
    (.enableSnap input-handler
                 (clj->phaser snap-x)
                 (clj->phaser snap-y)
                 (clj->phaser on-drag))))
  ([input-handler snap-x snap-y on-drag on-release]
   (phaser->clj
    (.enableSnap input-handler
                 (clj->phaser snap-x)
                 (clj->phaser snap-y)
                 (clj->phaser on-drag)
                 (clj->phaser on-release))))
  ([input-handler snap-x snap-y on-drag on-release snap-offset-x]
   (phaser->clj
    (.enableSnap input-handler
                 (clj->phaser snap-x)
                 (clj->phaser snap-y)
                 (clj->phaser on-drag)
                 (clj->phaser on-release)
                 (clj->phaser snap-offset-x))))
  ([input-handler snap-x snap-y on-drag on-release snap-offset-x snap-offset-y]
   (phaser->clj
    (.enableSnap input-handler
                 (clj->phaser snap-x)
                 (clj->phaser snap-y)
                 (clj->phaser on-drag)
                 (clj->phaser on-release)
                 (clj->phaser snap-offset-x)
                 (clj->phaser snap-offset-y)))))

(defn global-to-local-x
  "Warning: EXPERIMENTAL

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * x (number) - No description"
  ([input-handler x]
   (phaser->clj
    (.globalToLocalX input-handler
                     (clj->phaser x)))))

(defn global-to-local-y
  "Warning: EXPERIMENTAL

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * y (number) - No description"
  ([input-handler y]
   (phaser->clj
    (.globalToLocalY input-handler
                     (clj->phaser y)))))

(defn is-pixel-perfect
  "Is this object using pixel perfect checking?

  Returns:  boolean - True if the this InputHandler has either `pixelPerfectClick` or `pixelPerfectOver` set to `true`."
  ([input-handler]
   (phaser->clj
    (.isPixelPerfect input-handler))))

(defn just-out
  "Returns true if the pointer has left the Sprite within the specified delay time (defaults to 500ms, half a second)

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description
    * delay (number) - The time below which the pointer is considered as just out.

  Returns:  boolean - "
  ([input-handler pointer delay]
   (phaser->clj
    (.justOut input-handler
              (clj->phaser pointer)
              (clj->phaser delay)))))

(defn just-over
  "Returns true if the pointer has entered the Sprite within the specified delay time (defaults to 500ms, half a second)

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description
    * delay (number) - The time below which the pointer is considered as just over.

  Returns:  boolean - "
  ([input-handler pointer delay]
   (phaser->clj
    (.justOver input-handler
               (clj->phaser pointer)
               (clj->phaser delay)))))

(defn just-pressed
  "Returns true if the pointer has touched or clicked on the Sprite within the specified delay time (defaults to 500ms, half a second)

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description
    * delay (number) - The time below which the pointer is considered as just over.

  Returns:  boolean - "
  ([input-handler pointer delay]
   (phaser->clj
    (.justPressed input-handler
                  (clj->phaser pointer)
                  (clj->phaser delay)))))

(defn just-released
  "Returns true if the pointer was touching this Sprite, but has been released within the specified delay time (defaults to 500ms, half a second)

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description
    * delay (number) - The time below which the pointer is considered as just out.

  Returns:  boolean - "
  ([input-handler pointer delay]
   (phaser->clj
    (.justReleased input-handler
                   (clj->phaser pointer)
                   (clj->phaser delay)))))

(defn over-duration
  "If the pointer is currently over this Sprite this returns how long it has been there for in milliseconds.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description

  Returns:  number - The number of milliseconds the pointer has been over the Sprite, or -1 if not over."
  ([input-handler pointer]
   (phaser->clj
    (.overDuration input-handler
                   (clj->phaser pointer)))))

(defn pointer-down
  "If the Pointer is down this returns true. Please note that it only checks if the Pointer is down, not if it's down over any specific Sprite.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (number) - The index of the pointer to check. You can get this from Phaser.Pointer.id.

  Returns:  boolean - - True if the given pointer is down, otherwise false."
  ([input-handler pointer]
   (phaser->clj
    (.pointerDown input-handler
                  (clj->phaser pointer)))))

(defn pointer-dragged
  "Is this sprite being dragged by the mouse or not?

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description

  Returns:  boolean - True if the pointer is dragging an object, otherwise false."
  ([input-handler pointer]
   (phaser->clj
    (.pointerDragged input-handler
                     (clj->phaser pointer)))))

(defn pointer-out
  "Is the Pointer outside of this Sprite?

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * index (number) {optional} - The ID number of a Pointer to check. If you don't provide a number it will check all Pointers.

  Returns:  boolean - True if the given pointer (if a index was given, or any pointer if not) is out of this object."
  ([input-handler]
   (phaser->clj
    (.pointerOut input-handler)))
  ([input-handler index]
   (phaser->clj
    (.pointerOut input-handler
                 (clj->phaser index)))))

(defn pointer-over
  "Is the Pointer over this Sprite?

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * index (number) {optional} - The ID number of a Pointer to check. If you don't provide a number it will check all Pointers.

  Returns:  boolean - - True if the given pointer (if a index was given, or any pointer if not) is over this object."
  ([input-handler]
   (phaser->clj
    (.pointerOver input-handler)))
  ([input-handler index]
   (phaser->clj
    (.pointerOver input-handler
                  (clj->phaser index)))))

(defn pointer-time-down
  "A timestamp representing when the Pointer first touched the touchscreen.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (number) - The index of the pointer to check. You can get this from Phaser.Pointer.id.

  Returns:  number - "
  ([input-handler pointer]
   (phaser->clj
    (.pointerTimeDown input-handler
                      (clj->phaser pointer)))))

(defn pointer-time-out
  "A timestamp representing when the Pointer left the touchscreen.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description

  Returns:  number - "
  ([input-handler pointer]
   (phaser->clj
    (.pointerTimeOut input-handler
                     (clj->phaser pointer)))))

(defn pointer-time-over
  "A timestamp representing when the Pointer first touched the touchscreen.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description

  Returns:  number - "
  ([input-handler pointer]
   (phaser->clj
    (.pointerTimeOver input-handler
                      (clj->phaser pointer)))))

(defn pointer-time-up
  "A timestamp representing when the Pointer left the touchscreen.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description

  Returns:  number - "
  ([input-handler pointer]
   (phaser->clj
    (.pointerTimeUp input-handler
                    (clj->phaser pointer)))))

(defn pointer-up
  "If the Pointer is up this returns true. Please note that it only checks if the Pointer is up, not if it's up over any specific Sprite.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (number) - The index of the pointer to check. You can get this from Phaser.Pointer.id.

  Returns:  boolean - - True if the given pointer is up, otherwise false."
  ([input-handler pointer]
   (phaser->clj
    (.pointerUp input-handler
                (clj->phaser pointer)))))

(defn pointer-x
  "The x coordinate of the Input pointer, relative to the top-left of the parent Sprite.
  This value is only set when the pointer is over this Sprite.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (number) - The index of the pointer to check. You can get this from Phaser.Pointer.id.

  Returns:  number - The x coordinate of the Input pointer."
  ([input-handler pointer]
   (phaser->clj
    (.pointerX input-handler
               (clj->phaser pointer)))))

(defn pointer-y
  "The y coordinate of the Input pointer, relative to the top-left of the parent Sprite
  This value is only set when the pointer is over this Sprite.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (number) - The index of the pointer to check. You can get this from Phaser.Pointer.id.

  Returns:  number - The y coordinate of the Input pointer."
  ([input-handler pointer]
   (phaser->clj
    (.pointerY input-handler
               (clj->phaser pointer)))))

(defn reset
  "Resets the Input Handler and disables it."
  ([input-handler]
   (phaser->clj
    (.reset input-handler))))

(defn set-drag-lock
  "Restricts this sprite to drag movement only on the given axis. Note: If both are set to false the sprite will never move!

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * allow-horizontal (boolean) {optional} - To enable the sprite to be dragged horizontally set to true, otherwise false.
    * allow-vertical (boolean) {optional} - To enable the sprite to be dragged vertically set to true, otherwise false."
  ([input-handler]
   (phaser->clj
    (.setDragLock input-handler)))
  ([input-handler allow-horizontal]
   (phaser->clj
    (.setDragLock input-handler
                  (clj->phaser allow-horizontal))))
  ([input-handler allow-horizontal allow-vertical]
   (phaser->clj
    (.setDragLock input-handler
                  (clj->phaser allow-horizontal)
                  (clj->phaser allow-vertical)))))

(defn start
  "Starts the Input Handler running. This is called automatically when you enable input on a Sprite, or can be called directly if you need to set a specific priority.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * priority (number) - Higher priority sprites take click priority over low-priority sprites when they are stacked on-top of each other.
    * use-hand-cursor (boolean) - If true the Sprite will show the hand cursor on mouse-over (doesn't apply to mobile browsers)

  Returns:  Phaser.Sprite - The Sprite object to which the Input Handler is bound."
  ([input-handler priority use-hand-cursor]
   (phaser->clj
    (.start input-handler
            (clj->phaser priority)
            (clj->phaser use-hand-cursor)))))

(defn start-drag
  "Called by Pointer when drag starts on this Sprite. Should not usually be called directly.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description"
  ([input-handler pointer]
   (phaser->clj
    (.startDrag input-handler
                (clj->phaser pointer)))))

(defn stop
  "Stops the Input Handler from running."
  ([input-handler]
   (phaser->clj
    (.stop input-handler))))

(defn stop-drag
  "Called by Pointer when drag is stopped on this Sprite. Should not usually be called directly.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description"
  ([input-handler pointer]
   (phaser->clj
    (.stopDrag input-handler
               (clj->phaser pointer)))))

(defn update-drag
  "Updates the Pointer drag on this Sprite.

  Parameters:
    * input-handler (Phaser.InputHandler) - Targeted instance for method
    * pointer (Phaser.Pointer) - No description

  Returns:  boolean - "
  ([input-handler pointer]
   (phaser->clj
    (.updateDrag input-handler
                 (clj->phaser pointer)))))