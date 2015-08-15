(ns phzr.state
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->State
  "This is a base State class which can be extended if you are creating your own game.
  It provides quick access to common functions such as the camera, cache, input, match, sound and more."
  ([]
   (js/Phaser.State.)))

(defn create
  "create is called once preload has completed, this includes the loading of any assets from the Loader.
  If you don't have a preload method then create is the first method called in your State."
  ([state]
   (phaser->clj
    (.create state))))

(defn init
  "init is the very first function called when your State starts up. It's called before preload, create or anything else.
  If you need to route the game away to another State you could do so here, or if you need to prepare a set of variables
  or objects before the preloading starts."
  ([state]
   (phaser->clj
    (.init state))))

(defn load-render
  "loadRender is called during the Loader process. This only happens if you've set one or more assets to load in the preload method.
  The difference between loadRender and render is that any objects you render in this method you must be sure their assets exist."
  ([state]
   (phaser->clj
    (.loadRender state))))

(defn load-update
  "loadUpdate is called during the Loader process. This only happens if you've set one or more assets to load in the preload method."
  ([state]
   (phaser->clj
    (.loadUpdate state))))

(defn pause-update
  "pauseUpdate is called while the game is paused instead of preUpdate, update and postUpdate."
  ([state]
   (phaser->clj
    (.pauseUpdate state))))

(defn paused
  "This method will be called if the core game loop is paused."
  ([state]
   (phaser->clj
    (.paused state))))

(defn pre-render
  "The preRender method is called after all Game Objects have been updated, but before any rendering takes place."
  ([state]
   (phaser->clj
    (.preRender state))))

(defn preload
  "preload is called first. Normally you'd use this to load your game assets (or those needed for the current State)
  You shouldn't create any objects in this method that require assets that you're also loading in this method, as
  they won't yet be available."
  ([state]
   (phaser->clj
    (.preload state))))

(defn render
  "Nearly all display objects in Phaser render automatically, you don't need to tell them to render.
  However the render method is called AFTER the game renderer and plugins have rendered, so you're able to do any
  final post-processing style effects here. Note that this happens before plugins postRender takes place."
  ([state]
   (phaser->clj
    (.render state))))

(defn resize
  "If your game is set to Scalemode RESIZE then each time the browser resizes it will call this function, passing in the new width and height."
  ([state]
   (phaser->clj
    (.resize state))))

(defn resumed
  "This method will be called when the core game loop resumes from a paused state."
  ([state]
   (phaser->clj
    (.resumed state))))

(defn shutdown
  "This method will be called when the State is shutdown (i.e. you switch to another state from this one)."
  ([state]
   (phaser->clj
    (.shutdown state))))

(defn update
  "The update method is left empty for your own use.
  It is called during the core game loop AFTER debug, physics, plugins and the Stage have had their preUpdate methods called.
  If is called BEFORE Stage, Tweens, Sounds, Input, Physics, Particles and Plugins have had their postUpdate methods called."
  ([state]
   (phaser->clj
    (.update state))))