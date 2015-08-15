(ns phzr.component.input-enabled
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->InputEnabled
  "The InputEnabled component allows a Game Object to have its own InputHandler and process input related events."
  ([]
   (js/Phaser.Component.InputEnabled.)))

