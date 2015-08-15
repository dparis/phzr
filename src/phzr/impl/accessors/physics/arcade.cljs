(ns phzr.impl.accessors.physics.arcade)

(def ^:private arcade-constants
  {:sort-none "SORT_NONE"
   :left-right "LEFT_RIGHT"
   :right-left "RIGHT_LEFT"
   :top-bottom "TOP_BOTTOM"
   :bottom-top "BOTTOM_TOP"})

(def arcade-get-properties
  {:sort-direction "sortDirection"
   :game "game"
   :is-paused "isPaused"
   :skip-quad-tree "skipQuadTree"
   :bounds "bounds"
   :gravity "gravity"
   :force-x "forceX"
   :max-objects "maxObjects"
   :max-levels "maxLevels"
   :quad-tree "quadTree"
   :check-collision "checkCollision"
   :overlap-bias "OVERLAP_BIAS"})

(def arcade-set-properties
  {:sort-direction "sortDirection"
   :game "game"
   :is-paused "isPaused"
   :skip-quad-tree "skipQuadTree"
   :bounds "bounds"
   :gravity "gravity"
   :force-x "forceX"
   :max-objects "maxObjects"
   :max-levels "maxLevels"
   :quad-tree "quadTree"
   :check-collision "checkCollision"
   :overlap-bias "OVERLAP_BIAS"})