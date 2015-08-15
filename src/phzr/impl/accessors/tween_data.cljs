(ns phzr.impl.accessors.tween-data)

(def ^:private tween-data-constants
  {:pending "PENDING"
   :running "RUNNING"
   :looped "LOOPED"
   :complete "COMPLETE"})

(def tween-data-get-properties
  {:in-reverse "inReverse"
   :repeat-delay "repeatDelay"
   :easing-function "easingFunction"
   :parent "parent"
   :game "game"
   :is-from "isFrom"
   :interpolation-context "interpolationContext"
   :dt "dt"
   :value "value"
   :start-time "startTime"
   :duration "duration"
   :interpolate "interpolate"
   :is-running "isRunning"
   :yoyo-delay "yoyoDelay"
   :percent "percent"
   :repeat-counter "repeatCounter"
   :delay "delay"
   :interpolation-function "interpolationFunction"
   :yoyo "yoyo"})

(def tween-data-set-properties
  {:in-reverse "inReverse"
   :repeat-delay "repeatDelay"
   :easing-function "easingFunction"
   :parent "parent"
   :game "game"
   :is-from "isFrom"
   :interpolation-context "interpolationContext"
   :dt "dt"
   :start-time "startTime"
   :duration "duration"
   :interpolate "interpolate"
   :is-running "isRunning"
   :yoyo-delay "yoyoDelay"
   :repeat-counter "repeatCounter"
   :delay "delay"
   :interpolation-function "interpolationFunction"
   :yoyo "yoyo"})