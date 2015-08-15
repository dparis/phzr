(ns phzr.component.delta
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Delta
  "The Delta component provides access to delta values between the Game Objects current and previous position."
  ([]
   (js/Phaser.Component.Delta.)))

