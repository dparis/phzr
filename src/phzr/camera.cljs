(ns phzr.camera
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Camera
  "A Camera is your view into the game world. It has a position and size and renders only those objects within its field of view.
  The game automatically creates a single Stage sized camera on boot. Move the camera around the world with Phaser.Camera.x/y

  Parameters:
    * game (Phaser.Game) - Game reference to the currently running game.
    * id (number) - Not being used at the moment, will be when Phaser supports multiple camera
    * x (number) - Position of the camera on the X axis
    * y (number) - Position of the camera on the Y axis
    * width (number) - The width of the view rectangle
    * height (number) - The height of the view rectangle"
  ([game id x y width height]
   (js/Phaser.Camera. (clj->phaser game)
                      (clj->phaser id)
                      (clj->phaser x)
                      (clj->phaser y)
                      (clj->phaser width)
                      (clj->phaser height))))

(defn check-bounds
  "Method called to ensure the camera doesn't venture outside of the game world."
  ([camera]
   (phaser->clj
    (.checkBounds camera))))

(defn focus-on
  "Move the camera focus on a display object instantly.

  Parameters:
    * camera (Phaser.Camera) - Targeted instance for method
    * display-object (any) - The display object to focus the camera on. Must have visible x/y properties."
  ([camera display-object]
   (phaser->clj
    (.focusOn camera
              (clj->phaser display-object)))))

(defn focus-on-xy
  "Move the camera focus on a location instantly.

  Parameters:
    * camera (Phaser.Camera) - Targeted instance for method
    * x (number) - X position.
    * y (number) - Y position."
  ([camera x y]
   (phaser->clj
    (.focusOnXY camera
                (clj->phaser x)
                (clj->phaser y)))))

(defn follow
  "Tell the camera which sprite to follow.

  If you find you're getting a slight 'jitter' effect when following a Sprite it's probably to do with sub-pixel rendering of the Sprite position.
  This can be disabled by setting `game.renderer.renderSession.roundPixels = true` to force full pixel rendering.

  Parameters:
    * camera (Phaser.Camera) - Targeted instance for method
    * target (Phaser.Sprite | Phaser.Image | Phaser.Text) - The object you want the camera to track. Set to null to not follow anything.
    * style (number) {optional} - Leverage one of the existing 'deadzone' presets. If you use a custom deadzone, ignore this parameter and manually specify the deadzone after calling follow()."
  ([camera target]
   (phaser->clj
    (.follow camera
             (clj->phaser target))))
  ([camera target style]
   (phaser->clj
    (.follow camera
             (clj->phaser target)
             (clj->phaser style)))))

(defn pre-update
  "Camera preUpdate. Sets the total view counter to zero."
  ([camera]
   (phaser->clj
    (.preUpdate camera))))

(defn reset
  "Resets the camera back to 0,0 and un-follows any object it may have been tracking."
  ([camera]
   (phaser->clj
    (.reset camera))))

(defn set-bounds-to-world
  "Update the Camera bounds to match the game world."
  ([camera]
   (phaser->clj
    (.setBoundsToWorld camera))))

(defn set-position
  "A helper function to set both the X and Y properties of the camera at once
  without having to use game.camera.x and game.camera.y.

  Parameters:
    * camera (Phaser.Camera) - Targeted instance for method
    * x (number) - X position.
    * y (number) - Y position."
  ([camera x y]
   (phaser->clj
    (.setPosition camera
                  (clj->phaser x)
                  (clj->phaser y)))))

(defn set-size
  "Sets the size of the view rectangle given the width and height in parameters.

  Parameters:
    * camera (Phaser.Camera) - Targeted instance for method
    * width (number) - The desired width.
    * height (number) - The desired height."
  ([camera width height]
   (phaser->clj
    (.setSize camera
              (clj->phaser width)
              (clj->phaser height)))))

(defn unfollow
  "Sets the Camera follow target to null, stopping it from following an object if it's doing so."
  ([camera]
   (phaser->clj
    (.unfollow camera))))

(defn update
  "Update focusing and scrolling."
  ([camera]
   (phaser->clj
    (.update camera))))