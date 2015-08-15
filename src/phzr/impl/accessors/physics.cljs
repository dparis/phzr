(ns phzr.impl.accessors.physics)

(def ^:private physics-constants
  {:arcade "ARCADE"
   :p2-js "P2JS"
   :ninja "NINJA"
   :box-2d "BOX2D"
   :chipmunk "CHIPMUNK"
   :matterjs "MATTERJS"})

(def physics-get-properties
  {:game "game"
   :config "config"
   :arcade "arcade"
   :p2 "p2"
   :ninja "ninja"
   :box-2d "box2d"
   :chipmunk "chipmunk"
   :matter "matter"})

(def physics-set-properties
  {:game "game"
   :config "config"
   :arcade "arcade"
   :p2 "p2"
   :ninja "ninja"
   :box-2d "box2d"
   :chipmunk "chipmunk"
   :matter "matter"})