(ns phzr.plugin
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Plugin
  "This is a base Plugin template to use for any Phaser plugin development.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * parent (any) - The object that owns this plugin, usually Phaser.PluginManager."
  ([game parent]
   (js/Phaser.Plugin. (clj->phaser game)
                      (clj->phaser parent))))

(defn a-star-is-walkable-
  "Tells if a tile is walkable from its tilemap coordinates

  Parameters:
    * x (number) - The x coordiante of the tile in tilemap's coordinate.
    * y (number) - The y coordinate of the tile in tilemap's coordinate.

  Returns:  boolean - The distance between nodeA and nodeB"
  ([x y]
   (phaser->clj
    (.AStar-isWalkable js/Phaser.Plugin
                       (clj->phaser x)
                       (clj->phaser y)))))

(defn destroy
  "Clear down this Plugin and null out references"
  ([plugin]
   (phaser->clj
    (.destroy plugin))))

(defn post-render
  "Post-render is called after the Game Renderer and State.render have run.
  It is only called if visible is set to true."
  ([plugin]
   (phaser->clj
    (.postRender plugin))))

(defn pre-update
  "Pre-update is called at the very start of the update cycle, before any other subsystems have been updated (including Physics).
  It is only called if active is set to true."
  ([plugin]
   (phaser->clj
    (.preUpdate plugin))))

(defn render
  "Render is called right after the Game Renderer completes, but before the State.render.
  It is only called if visible is set to true."
  ([plugin]
   (phaser->clj
    (.render plugin))))

(defn sample-plugin-
  "A Sample Plugin demonstrating how to hook into the Phaser plugin system."
  ([]
   (phaser->clj
    (.SamplePlugin js/Phaser.Plugin))))

(defn update
  "Update is called after all the core subsystems (Input, Tweens, Sound, etc) and the State have updated, but before the render.
  It is only called if active is set to true."
  ([plugin]
   (phaser->clj
    (.update plugin))))

(defn virtual-joystick-
  "A Virtual Joystick"
  ([]
   (phaser->clj
    (.VirtualJoystick js/Phaser.Plugin))))

(defn webcam-
  "Provides access to the Webcam (if available)"
  ([]
   (phaser->clj
    (.Webcam js/Phaser.Plugin))))