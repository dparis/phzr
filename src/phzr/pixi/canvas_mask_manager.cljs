(ns phzr.pixi.canvas-mask-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->CanvasMaskManager
  "A set of functions used to handle masking."
  ([]
   (js/PIXI.CanvasMaskManager.)))

(defn pop-mask
  "Restores the current drawing context to the state it was before the mask was applied.

  Parameters:
    * canvas-mask-manager (PIXI.CanvasMaskManager) - Targeted instance for method
    * render-session (Object) - The renderSession whose context will be used for this mask manager."
  ([canvas-mask-manager render-session]
   (phaser->clj
    (.popMask canvas-mask-manager
              (clj->phaser render-session)))))

(defn push-mask
  "This method adds it to the current stack of masks.

  Parameters:
    * canvas-mask-manager (PIXI.CanvasMaskManager) - Targeted instance for method
    * mask-data (Object) - the maskData that will be pushed
    * render-session (Object) - The renderSession whose context will be used for this mask manager."
  ([canvas-mask-manager mask-data render-session]
   (phaser->clj
    (.pushMask canvas-mask-manager
               (clj->phaser mask-data)
               (clj->phaser render-session)))))