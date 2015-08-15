(ns phzr.impl.accessors.camera)

(def ^:private camera-constants
  {:follow-lockon "FOLLOW_LOCKON"
   :follow-platformer "FOLLOW_PLATFORMER"
   :follow-topdown "FOLLOW_TOPDOWN"
   :follow-topdown-tight "FOLLOW_TOPDOWN_TIGHT"})

(def camera-get-properties
  {:y "y"
   :deadzone "deadzone"
   :scale "scale"
   :game "game"
   :width "width"
   :total-in-view "totalInView"
   :display-object "displayObject"
   :bounds "bounds"
   :at-limit "atLimit"
   :world "world"
   :id "id"
   :position "position"
   :x "x"
   :target "target"
   :visible "visible"
   :round-px "roundPx"
   :view "view"
   :height "height"})

(def camera-set-properties
  {:y "y"
   :deadzone "deadzone"
   :scale "scale"
   :game "game"
   :width "width"
   :display-object "displayObject"
   :bounds "bounds"
   :at-limit "atLimit"
   :world "world"
   :id "id"
   :position "position"
   :x "x"
   :target "target"
   :visible "visible"
   :round-px "roundPx"
   :view "view"
   :height "height"})