(ns phzr.component.fixed-to-camera
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->FixedToCamera
  "The FixedToCamera component enables a Game Object to be rendered relative to the game camera coordinates, regardless 
  of where in the world the camera is. This is used for things like sticking game UI to the camera that scrolls as it moves around the world."
  ([]
   (js/Phaser.Component.FixedToCamera.)))

(defn post-update-
  "The FixedToCamera component postUpdate handler.
  Called automatically by the Game Object."
  ([]
   (phaser->clj
    (.postUpdate js/Phaser.Component.FixedToCamera))))