(ns phzr.component.health
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Health
  "The Health component provides the ability for Game Objects to have a `health` property 
  that can be damaged and reset through game code.
  Requires the LifeSpan component."
  ([]
   (js/Phaser.Component.Health.)))

