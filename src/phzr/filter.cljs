(ns phzr.filter
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->Filter
  "This is a base Filter class to use for any Phaser filter development.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * uniforms (object) - Uniform mappings object
    * fragment-src (Array | string) - The fragment shader code. Either an array, one element per line of code, or a string."
  ([game uniforms fragment-src]
   (js/Phaser.Filter. (clj->phaser game)
                      (clj->phaser uniforms)
                      (clj->phaser fragment-src))))

(defn destroy
  "Clear down this Filter and null out references"
  ([filter]
   (phaser->clj
    (.destroy filter))))

(defn init
  "Should be over-ridden."
  ([filter]
   (phaser->clj
    (.init filter))))

(defn set-resolution
  "Set the resolution uniforms on the filter.

  Parameters:
    * filter (Phaser.Filter) - Targeted instance for method
    * width (number) - The width of the display.
    * height (number) - The height of the display."
  ([filter width height]
   (phaser->clj
    (.setResolution filter
                    (clj->phaser width)
                    (clj->phaser height)))))

(defn update
  "Updates the filter.

  Parameters:
    * filter (Phaser.Filter) - Targeted instance for method
    * pointer (Phaser.Pointer) {optional} - A Pointer object to use for the filter. The coordinates are mapped to the mouse uniform."
  ([filter]
   (phaser->clj
    (.update filter)))
  ([filter pointer]
   (phaser->clj
    (.update filter
             (clj->phaser pointer)))))