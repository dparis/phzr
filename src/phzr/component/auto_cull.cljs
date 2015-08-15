(ns phzr.component.auto-cull
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->AutoCull
  "The AutoCull Component is responsible for providing methods that check if a Game Object is within the bounds of the World Camera.
  It is used by the InWorld component."
  ([]
   (js/Phaser.Component.AutoCull.)))

