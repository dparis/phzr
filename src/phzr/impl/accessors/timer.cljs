(ns phzr.impl.accessors.timer)

(def timer-constants
  {:half "HALF"
   :minute "MINUTE"
   :quarter "QUARTER"
   :second "SECOND"})

(def timer-get-properties
  {:auto-destroy "autoDestroy"
   :duration "duration"
   :events "events"
   :expired "expired"
   :length "length"
   :ms "ms"
   :next "next"
   :on-complete "onComplete"
   :paused "paused"
   :running "running"
   :seconds "seconds"
   :time-cap "timeCap"})

(def timer-set-properties
  {:auto-destroy "autoDestroy"
   :events "events"
   :on-complete "onComplete"
   :time-cap "timeCap"})