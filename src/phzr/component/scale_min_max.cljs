(ns phzr.component.scale-min-max
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->ScaleMinMax
  "The ScaleMinMax component allows a Game Object to limit how far it can be scaled by its parent."
  ([]
   (js/Phaser.Component.ScaleMinMax.)))

(defn set-scale-min-max
  "Sets the scaleMin and scaleMax values. These values are used to limit how far this Game Object will scale based on its parent.

  For example if this Game Object has a `minScale` value of 1 and its parent has a `scale` value of 0.5, the 0.5 will be ignored 
  and the scale value of 1 will be used, as the parents scale is lower than the minimum scale this Game Object should adhere to.

  By setting these values you can carefully control how Game Objects deal with responsive scaling.

  If only one parameter is given then that value will be used for both scaleMin and scaleMax:
  `setScaleMinMax(1)` = scaleMin.x, scaleMin.y, scaleMax.x and scaleMax.y all = 1

  If only two parameters are given the first is set as scaleMin.x and y and the second as scaleMax.x and y:
  `setScaleMinMax(0.5, 2)` = scaleMin.x and y = 0.5 and scaleMax.x and y = 2

  If you wish to set `scaleMin` with different values for x and y then either modify Game Object.scaleMin directly, 
  or pass `null` for the `maxX` and `maxY` parameters.

  Call `setScaleMinMax(null)` to clear all previously set values.

  Parameters:
    * scale-min-max (Phaser.Component.ScaleMinMax) - Targeted instance for method
    * min-x (number | null) - The minimum horizontal scale value this Game Object can scale down to.
    * min-y (number | null) - The minimum vertical scale value this Game Object can scale down to.
    * max-x (number | null) - The maximum horizontal scale value this Game Object can scale up to.
    * max-y (number | null) - The maximum vertical scale value this Game Object can scale up to."
  ([scale-min-max min-x min-y max-x max-y]
   (phaser->clj
    (.setScaleMinMax scale-min-max
                     (clj->phaser min-x)
                     (clj->phaser min-y)
                     (clj->phaser max-x)
                     (clj->phaser max-y)))))