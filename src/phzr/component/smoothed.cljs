(ns phzr.component.smoothed
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Smoothed
  "The Smoothed component allows a Game Object to control anti-aliasing of an image based texture."
  ([]
   (js/Phaser.Component.Smoothed.)))

