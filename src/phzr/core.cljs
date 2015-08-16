(ns phzr.core)


(defprotocol IPhaserObj
  (pset! [this k v]))


(def ^:private blend-modes
  {:normal      0
   :add         1
   :multiply    2
   :screen      3
   :overlay     4
   :darken      5
   :lighten     6
   :color_dodge 7
   :color_burn  8
   :hard_light  9
   :soft_light  10
   :difference  11
   :exclusion   12
   :hue         13
   :saturation  14
   :color       15
   :luminosity  16})

(def ^:private scale-modes
  {:default 0
   :linear  0
   :nearest 1})

(def ^:private phaser-constants
  {:version          "2.4.2"
   :auto             0
   :canvas           1
   :webgl            2
   :headless         3
   :none             0
   :left             1
   :right            2
   :up               3
   :down             4
   :sprite           0
   :button           1
   :image            2
   :graphics         3
   :text             4
   :tilesprite       5
   :bitmaptext       6
   :group            7
   :rendertexture    8
   :tilemap          9
   :tilemaplayer     10
   :emitter          11
   :polygon          12
   :bitmapdata       13
   :canvas-filter    14
   :webgl-filter     15
   :ellipse          16
   :spritebatch      17
   :retrofont        18
   :pointer          19
   :rope             20
   :circle           21
   :rectangle        22
   :line             23
   :matrix           24
   :point            25
   :roundedrectangle 26
   :creature         27
   :video            28
   :blend-modes      blend-modes
   :scale-modes      scale-modes})

(defn ^:private games
  []
  js/Phaser.GAMES)

(defn const
  [k]
  (if (= k :games)
    (games)
    (get phaser-constants k)))
