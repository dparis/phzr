(ns phzr.impl.accessors.timer)

(def ^:private timer-constants
  {:minute "MINUTE"
   :second "SECOND"
   :half "HALF"
   :quarter "QUARTER"})

(def timer-get-properties
  {:paused "paused"
   :events "events"
   :time-cap "timeCap"
   :duration "duration"
   :seconds "seconds"
   :running "running"
   :next "next"
   :auto-destroy "autoDestroy"
   :length "length"
   :expired "expired"
   :ms "ms"
   :on-complete "onComplete"})

(def timer-set-properties
  {:auto-destroy "autoDestroy"
   :events "events"
   :on-complete "onComplete"
   :time-cap "timeCap"})