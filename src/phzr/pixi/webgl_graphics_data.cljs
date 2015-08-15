(ns phzr.pixi.webgl-graphics-data
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->WebGLGraphicsData
  ""
  ([]
   (js/PIXI.WebGLGraphicsData.)))

(defn reset
  ""
  ([webgl-graphics-data]
   (phaser->clj
    (.reset webgl-graphics-data))))

(defn upload
  ""
  ([webgl-graphics-data]
   (phaser->clj
    (.upload webgl-graphics-data))))