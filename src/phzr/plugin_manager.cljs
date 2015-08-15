(ns phzr.plugin-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [remove update]))

(defn ->PluginManager
  "The Plugin Manager is responsible for the loading, running and unloading of Phaser Plugins.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.PluginManager. (clj->phaser game))))

(defn add
  "Add a new Plugin into the PluginManager.
  The Plugin must have 2 properties: game and parent. Plugin.game is set to the game reference the PluginManager uses, and parent is set to the PluginManager.

  Parameters:
    * plugin-manager (Phaser.PluginManager) - Targeted instance for method
    * plugin (object | Phaser.Plugin) - The Plugin to add into the PluginManager. This can be a function or an existing object.
    * parameter (*) - Additional arguments that will be passed to the Plugin.init method.

  Returns:  Phaser.Plugin - The Plugin that was added to the manager."
  ([plugin-manager plugin parameter]
   (phaser->clj
    (.add plugin-manager
          (clj->phaser plugin)
          (clj->phaser parameter)))))

(defn destroy
  "Clear down this PluginManager, calls destroy on every plugin and nulls out references."
  ([plugin-manager]
   (phaser->clj
    (.destroy plugin-manager))))

(defn post-render
  "Post-render is called after the Game Renderer and State.render have run.
  It only calls plugins who have visible=true."
  ([plugin-manager]
   (phaser->clj
    (.postRender plugin-manager))))

(defn post-update
  "PostUpdate is the last thing to be called before the world render.
  In particular, it is called after the world postUpdate, which means the camera has been adjusted.
  It only calls plugins who have active=true."
  ([plugin-manager]
   (phaser->clj
    (.postUpdate plugin-manager))))

(defn pre-update
  "Pre-update is called at the very start of the update cycle, before any other subsystems have been updated (including Physics).
  It only calls plugins who have active=true."
  ([plugin-manager]
   (phaser->clj
    (.preUpdate plugin-manager))))

(defn remove
  "Remove a Plugin from the PluginManager. It calls Plugin.destroy on the plugin before removing it from the manager.

  Parameters:
    * plugin-manager (Phaser.PluginManager) - Targeted instance for method
    * plugin (Phaser.Plugin) - The plugin to be removed."
  ([plugin-manager plugin]
   (phaser->clj
    (.remove plugin-manager
             (clj->phaser plugin)))))

(defn remove-all
  "Remove all Plugins from the PluginManager. It calls Plugin.destroy on every plugin before removing it from the manager."
  ([plugin-manager]
   (phaser->clj
    (.removeAll plugin-manager))))

(defn render
  "Render is called right after the Game Renderer completes, but before the State.render.
  It only calls plugins who have visible=true."
  ([plugin-manager]
   (phaser->clj
    (.render plugin-manager))))

(defn update
  "Update is called after all the core subsystems (Input, Tweens, Sound, etc) and the State have updated, but before the render.
  It only calls plugins who have active=true."
  ([plugin-manager]
   (phaser->clj
    (.update plugin-manager))))