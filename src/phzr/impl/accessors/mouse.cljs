(ns phzr.impl.accessors.mouse)

(def ^:private mouse-constants
  {:no-button "NO_BUTTON"
   :left-button "LEFT_BUTTON"
   :middle-button "MIDDLE_BUTTON"
   :right-button "RIGHT_BUTTON"
   :back-button "BACK_BUTTON"
   :forward-button "FORWARD_BUTTON"
   :wheel-up "WHEEL_UP"
   :wheel-down "WHEEL_DOWN"})

(def mouse-get-properties
  {:mouse-out-callback "mouseOutCallback"
   :mouse-wheel-callback "mouseWheelCallback"
   :stop-on-game-out "stopOnGameOut"
   :button "button"
   :game "game"
   :mouse-up-callback "mouseUpCallback"
   :mouse-down-callback "mouseDownCallback"
   :event "event"
   :pointer-lock "pointerLock"
   :locked "locked"
   :mouse-over-callback "mouseOverCallback"
   :callback-context "callbackContext"
   :capture "capture"
   :enabled "enabled"
   :wheel-delta "wheelDelta"})

(def mouse-set-properties
  {:mouse-out-callback "mouseOutCallback"
   :mouse-wheel-callback "mouseWheelCallback"
   :stop-on-game-out "stopOnGameOut"
   :button "button"
   :game "game"
   :mouse-up-callback "mouseUpCallback"
   :mouse-down-callback "mouseDownCallback"
   :event "event"
   :pointer-lock "pointerLock"
   :locked "locked"
   :mouse-over-callback "mouseOverCallback"
   :callback-context "callbackContext"
   :capture "capture"
   :enabled "enabled"
   :wheel-delta "wheelDelta"})