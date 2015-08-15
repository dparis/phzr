(ns phzr.request-animation-frame
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->RequestAnimationFrame
  "Abstracts away the use of RAF or setTimeOut for the core game update loop.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * force-set-time-out (boolean) {optional} - Tell Phaser to use setTimeOut even if raf is available."
  ([game]
   (js/Phaser.RequestAnimationFrame. (clj->phaser game)))
  ([game force-set-time-out]
   (js/Phaser.RequestAnimationFrame. (clj->phaser game)
                                     (clj->phaser force-set-time-out))))

(defn is-raf
  "Is the browser using requestAnimationFrame?

  Returns:  boolean - "
  ([request-animation-frame]
   (phaser->clj
    (.isRAF request-animation-frame))))

(defn is-set-time-out
  "Is the browser using setTimeout?

  Returns:  boolean - "
  ([request-animation-frame]
   (phaser->clj
    (.isSetTimeOut request-animation-frame))))

(defn start
  "Starts the requestAnimationFrame running or setTimeout if unavailable in browser"
  ([request-animation-frame]
   (phaser->clj
    (.start request-animation-frame))))

(defn stop
  "Stops the requestAnimationFrame from running."
  ([request-animation-frame]
   (phaser->clj
    (.stop request-animation-frame))))

(defn update-raf
  "The update method for the requestAnimationFrame"
  ([request-animation-frame]
   (phaser->clj
    (.updateRAF request-animation-frame))))

(defn update-set-timeout
  "The update method for the setTimeout."
  ([request-animation-frame]
   (phaser->clj
    (.updateSetTimeout request-animation-frame))))