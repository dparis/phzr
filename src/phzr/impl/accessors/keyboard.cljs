(ns phzr.impl.accessors.keyboard)

(def keyboard-get-properties
  {:game "game"
   :on-press-callback "onPressCallback"
   :on-down-callback "onDownCallback"
   :last-char "lastChar"
   :event "event"
   :callback-context "callbackContext"
   :last-key "lastKey"
   :press-event "pressEvent"
   :enabled "enabled"
   :on-up-callback "onUpCallback"})

(def keyboard-set-properties
  {:game "game"
   :enabled "enabled"
   :event "event"
   :press-event "pressEvent"
   :callback-context "callbackContext"
   :on-down-callback "onDownCallback"
   :on-press-callback "onPressCallback"
   :on-up-callback "onUpCallback"})