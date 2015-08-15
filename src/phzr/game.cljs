(ns phzr.game
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Game
  "This is where the magic happens. The Game object is the heart of your game,
  providing quick access to common functions and handling the boot process.

  'Hell, there are no rules here - we're trying to accomplish something.'
                                                        Thomas A. Edison

  Parameters:
    * width (number | string) {optional} - The width of your game in game pixels. If given as a string the value must be between 0 and 100 and will be used as the percentage width of the parent container, or the browser window if no parent is given.
    * height (number | string) {optional} - The height of your game in game pixels. If given as a string the value must be between 0 and 100 and will be used as the percentage height of the parent container, or the browser window if no parent is given.
    * renderer (number) {optional} - Which renderer to use: Phaser.AUTO will auto-detect, Phaser.WEBGL, Phaser.CANVAS or Phaser.HEADLESS (no rendering at all).
    * parent (string | HTMLElement) {optional} - The DOM element into which this games canvas will be injected. Either a DOM ID (string) or the element itself.
    * state (object) {optional} - The default state object. A object consisting of Phaser.State functions (preload, create, update, render) or null.
    * transparent (boolean) {optional} - Use a transparent canvas background or not.
    * antialias (boolean) {optional} - Draw all image textures anti-aliased or not. The default is for smooth textures, but disable if your game features pixel art.
    * physics-config (object) {optional} - A physics configuration object to pass to the Physics world on creation."
  ([]
   (js/Phaser.Game.))
  ([width]
   (js/Phaser.Game. (clj->phaser width)))
  ([width height]
   (js/Phaser.Game. (clj->phaser width)
                    (clj->phaser height)))
  ([width height renderer]
   (js/Phaser.Game. (clj->phaser width)
                    (clj->phaser height)
                    (clj->phaser renderer)))
  ([width height renderer parent]
   (js/Phaser.Game. (clj->phaser width)
                    (clj->phaser height)
                    (clj->phaser renderer)
                    (clj->phaser parent)))
  ([width height renderer parent state]
   (js/Phaser.Game. (clj->phaser width)
                    (clj->phaser height)
                    (clj->phaser renderer)
                    (clj->phaser parent)
                    (clj->phaser state)))
  ([width height renderer parent state transparent]
   (js/Phaser.Game. (clj->phaser width)
                    (clj->phaser height)
                    (clj->phaser renderer)
                    (clj->phaser parent)
                    (clj->phaser state)
                    (clj->phaser transparent)))
  ([width height renderer parent state transparent antialias]
   (js/Phaser.Game. (clj->phaser width)
                    (clj->phaser height)
                    (clj->phaser renderer)
                    (clj->phaser parent)
                    (clj->phaser state)
                    (clj->phaser transparent)
                    (clj->phaser antialias)))
  ([width height renderer parent state transparent antialias physics-config]
   (js/Phaser.Game. (clj->phaser width)
                    (clj->phaser height)
                    (clj->phaser renderer)
                    (clj->phaser parent)
                    (clj->phaser state)
                    (clj->phaser transparent)
                    (clj->phaser antialias)
                    (clj->phaser physics-config))))

(defn destroy
  "Nukes the entire game from orbit."
  ([game]
   (phaser->clj
    (.destroy game))))

(defn disable-step
  "Disables core game loop stepping."
  ([game]
   (phaser->clj
    (.disableStep game))))

(defn enable-step
  "Enable core game loop stepping. When enabled you must call game.step() directly (perhaps via a DOM button?)
  Calling step will advance the game loop by one frame. This is extremely useful for hard to track down errors!"
  ([game]
   (phaser->clj
    (.enableStep game))))

(defn step
  "When stepping is enabled you must call this function directly (perhaps via a DOM button?) to advance the game loop by one frame.
  This is extremely useful to hard to track down errors! Use the internal stepCount property to monitor progress."
  ([game]
   (phaser->clj
    (.step game))))