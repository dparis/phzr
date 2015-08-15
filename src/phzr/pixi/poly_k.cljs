(ns phzr.pixi.poly-k
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn triangulate
  "Triangulates shapes for webGL graphic fills."
  ([poly-k]
   (phaser->clj
    (.Triangulate poly-k))))