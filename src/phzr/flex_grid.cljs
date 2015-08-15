(ns phzr.flex-grid
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->FlexGrid
  "WARNING: This is an EXPERIMENTAL class. The API will change significantly in the coming versions and is incomplete.
  Please try to avoid using in production games with a long time to build.
  This is also why the documentation is incomplete.

  FlexGrid is a a responsive grid manager that works in conjunction with the ScaleManager RESIZE scaling mode and FlexLayers
  to provide for game object positioning in a responsive manner.

  Parameters:
    * manager (Phaser.ScaleManager) - The ScaleManager.
    * width (number) - The width of the game.
    * height (number) - The height of the game."
  ([manager width height]
   (js/Phaser.FlexGrid. (clj->phaser manager)
                        (clj->phaser width)
                        (clj->phaser height))))

(defn create-custom-layer
  "A custom layer is centered on the game and maintains its aspect ratio as it scales up and down.

  Parameters:
    * flex-grid (Phaser.FlexGrid) - Targeted instance for method
    * width (number) - Width of this layer in pixels.
    * height (number) - Height of this layer in pixels.
    * children (Array.<PIXI.DisplayObject>) {optional} - An array of children that are used to populate the FlexLayer.

  Returns:  Phaser.FlexLayer - The Layer object."
  ([flex-grid width height]
   (phaser->clj
    (.createCustomLayer flex-grid
                        (clj->phaser width)
                        (clj->phaser height))))
  ([flex-grid width height children]
   (phaser->clj
    (.createCustomLayer flex-grid
                        (clj->phaser width)
                        (clj->phaser height)
                        (clj->phaser children)))))

(defn create-fixed-layer
  "A fixed layer is centered on the game and is the size of the required dimensions and is never scaled.

  Parameters:
    * flex-grid (Phaser.FlexGrid) - Targeted instance for method
    * children (Array.<PIXI.DisplayObject>) {optional} - An array of children that are used to populate the FlexLayer.

  Returns:  Phaser.FlexLayer - The Layer object."
  ([flex-grid]
   (phaser->clj
    (.createFixedLayer flex-grid)))
  ([flex-grid children]
   (phaser->clj
    (.createFixedLayer flex-grid
                       (clj->phaser children)))))

(defn create-fluid-layer
  "A fluid layer is centered on the game and maintains its aspect ratio as it scales up and down.

  Parameters:
    * flex-grid (Phaser.FlexGrid) - Targeted instance for method
    * children (array) {optional} - An array of children that are used to populate the FlexLayer.

  Returns:  Phaser.FlexLayer - The Layer object."
  ([flex-grid]
   (phaser->clj
    (.createFluidLayer flex-grid)))
  ([flex-grid children]
   (phaser->clj
    (.createFluidLayer flex-grid
                       (clj->phaser children)))))

(defn create-full-layer
  "A full layer is placed at 0,0 and extends to the full size of the game. Children are scaled according to the fluid ratios.

  Parameters:
    * flex-grid (Phaser.FlexGrid) - Targeted instance for method
    * children (array) {optional} - An array of children that are used to populate the FlexLayer.

  Returns:  Phaser.FlexLayer - The Layer object."
  ([flex-grid]
   (phaser->clj
    (.createFullLayer flex-grid)))
  ([flex-grid children]
   (phaser->clj
    (.createFullLayer flex-grid
                      (clj->phaser children)))))

(defn debug
  "Call in the render function to output the bounds rects."
  ([flex-grid]
   (phaser->clj
    (.debug flex-grid))))

(defn fit-sprite
  "Fits a sprites width to the bounds.

  Parameters:
    * flex-grid (Phaser.FlexGrid) - Targeted instance for method
    * sprite (Phaser.Sprite) - The Sprite to fit."
  ([flex-grid sprite]
   (phaser->clj
    (.fitSprite flex-grid
                (clj->phaser sprite)))))

(defn on-resize
  "Called when the game container changes dimensions.

  Parameters:
    * flex-grid (Phaser.FlexGrid) - Targeted instance for method
    * width (number) - The new width of the game container.
    * height (number) - The new height of the game container."
  ([flex-grid width height]
   (phaser->clj
    (.onResize flex-grid
               (clj->phaser width)
               (clj->phaser height)))))

(defn refresh
  "Updates all internal vars such as the bounds and scale values."
  ([flex-grid]
   (phaser->clj
    (.refresh flex-grid))))

(defn reset
  "Resets the layer children references"
  ([flex-grid]
   (phaser->clj
    (.reset flex-grid))))

(defn set-size
  "Sets the core game size. This resets the w/h parameters and bounds.

  Parameters:
    * flex-grid (Phaser.FlexGrid) - Targeted instance for method
    * width (number) - The new dimensions.
    * height (number) - The new dimensions."
  ([flex-grid width height]
   (phaser->clj
    (.setSize flex-grid
              (clj->phaser width)
              (clj->phaser height)))))