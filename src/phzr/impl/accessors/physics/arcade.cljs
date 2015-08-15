(ns phzr.impl.accessors.physics.arcade)

(def ^:private arcade-constants
  {:bottom-top "BOTTOM_TOP"
   :left-right "LEFT_RIGHT"
   :right-left "RIGHT_LEFT"
   :sort-none "SORT_NONE"
   :top-bottom "TOP_BOTTOM"})

(def arcade-get-properties
  {:bounds "bounds"
   :check-collision "checkCollision"
   :force-x "forceX"
   :game "game"
   :gravity "gravity"
   :is-paused "isPaused"
   :max-levels "maxLevels"
   :max-objects "maxObjects"
   :overlap-bias "OVERLAP_BIAS"
   :quad-tree "quadTree"
   :skip-quad-tree "skipQuadTree"
   :sort-direction "sortDirection"})

(def arcade-set-properties
  {:bounds "bounds"
   :check-collision "checkCollision"
   :force-x "forceX"
   :game "game"
   :gravity "gravity"
   :is-paused "isPaused"
   :max-levels "maxLevels"
   :max-objects "maxObjects"
   :overlap-bias "OVERLAP_BIAS"
   :quad-tree "quadTree"
   :skip-quad-tree "skipQuadTree"
   :sort-direction "sortDirection"})