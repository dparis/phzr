(ns phzr.canvas
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn add-to-dom-
  "Adds the given canvas element to the DOM. The canvas will be added as a child of the given parent.
  If no parent is given it will be added as a child of the document.body.

  Parameters:
    * canvas (HTMLCanvasElement) - The canvas to be added to the DOM.
    * parent (string | HTMLElement) - The DOM element to add the canvas to.
    * overflow-hidden (boolean) {optional} - If set to true it will add the overflow='hidden' style to the parent DOM element.

  Returns:  HTMLCanvasElement - Returns the source canvas."
  ([canvas parent]
   (phaser->clj
    (.addToDOM js/Phaser.Canvas
               (clj->phaser canvas)
               (clj->phaser parent))))
  ([canvas parent overflow-hidden]
   (phaser->clj
    (.addToDOM js/Phaser.Canvas
               (clj->phaser canvas)
               (clj->phaser parent)
               (clj->phaser overflow-hidden)))))

(defn create-
  "Creates a `canvas` DOM element. The element is not automatically added to the document.

  Parameters:
    * width (number) {optional} - The width of the canvas element.
    * height (number) {optional} - The height of the canvas element..
    * id (string) {optional} - If specified, and not the empty string, this will be set as the ID of the canvas element. Otherwise no ID will be set.

  Returns:  HTMLCanvasElement - The newly created canvas element."
  ([]
   (phaser->clj
    (.create js/Phaser.Canvas)))
  ([width]
   (phaser->clj
    (.create js/Phaser.Canvas
             (clj->phaser width))))
  ([width height]
   (phaser->clj
    (.create js/Phaser.Canvas
             (clj->phaser width)
             (clj->phaser height))))
  ([width height id]
   (phaser->clj
    (.create js/Phaser.Canvas
             (clj->phaser width)
             (clj->phaser height)
             (clj->phaser id)))))

(defn get-smoothing-enabled-
  "Returns `true` if the given context has image smoothing enabled, otherwise returns `false`.

  Parameters:
    * context (CanvasRenderingContext2D) - The context to check for smoothing on.

  Returns:  boolean - True if the given context has image smoothing enabled, otherwise false."
  ([context]
   (phaser->clj
    (.getSmoothingEnabled js/Phaser.Canvas
                          (clj->phaser context)))))

(defn remove-from-dom-
  "Removes the given canvas element from the DOM.

  Parameters:
    * canvas (HTMLCanvasElement) - The canvas to be removed from the DOM."
  ([canvas]
   (phaser->clj
    (.removeFromDOM js/Phaser.Canvas
                    (clj->phaser canvas)))))

(defn set-background-color-
  "Sets the background color behind the canvas. This changes the canvas style property.

  Parameters:
    * canvas (HTMLCanvasElement) - The canvas to set the background color on.
    * color (string) {optional} - The color to set. Can be in the format 'rgb(r,g,b)', or '#RRGGBB' or any valid CSS color.

  Returns:  HTMLCanvasElement - Returns the source canvas."
  ([canvas]
   (phaser->clj
    (.setBackgroundColor js/Phaser.Canvas
                         (clj->phaser canvas))))
  ([canvas color]
   (phaser->clj
    (.setBackgroundColor js/Phaser.Canvas
                         (clj->phaser canvas)
                         (clj->phaser color)))))

(defn set-image-rendering-bicubic-
  "Sets the CSS image-rendering property on the given canvas to be 'bicubic' (aka 'auto').
  Note that if this doesn't given the desired result then see the CanvasUtils.setSmoothingEnabled method.

  Parameters:
    * canvas (HTMLCanvasElement) - The canvas to set image-rendering bicubic on.

  Returns:  HTMLCanvasElement - Returns the source canvas."
  ([canvas]
   (phaser->clj
    (.setImageRenderingBicubic js/Phaser.Canvas
                               (clj->phaser canvas)))))

(defn set-image-rendering-crisp-
  "Sets the CSS image-rendering property on the given canvas to be 'crisp' (aka 'optimize contrast' on webkit).
  Note that if this doesn't given the desired result then see the setSmoothingEnabled.

  Parameters:
    * canvas (HTMLCanvasElement) - The canvas to set image-rendering crisp on.

  Returns:  HTMLCanvasElement - Returns the source canvas."
  ([canvas]
   (phaser->clj
    (.setImageRenderingCrisp js/Phaser.Canvas
                             (clj->phaser canvas)))))

(defn set-smoothing-enabled-
  "Sets the Image Smoothing property on the given context. Set to false to disable image smoothing.
  By default browsers have image smoothing enabled, which isn't always what you visually want, especially
  when using pixel art in a game. Note that this sets the property on the context itself, so that any image
  drawn to the context will be affected. This sets the property across all current browsers but support is
  patchy on earlier browsers, especially on mobile.

  Parameters:
    * context (CanvasRenderingContext2D) - The context to enable or disable the image smoothing on.
    * value (boolean) - If set to true it will enable image smoothing, false will disable it.

  Returns:  CanvasRenderingContext2D - Returns the source context."
  ([context value]
   (phaser->clj
    (.setSmoothingEnabled js/Phaser.Canvas
                          (clj->phaser context)
                          (clj->phaser value)))))

(defn set-touch-action-
  "Sets the touch-action property on the canvas style. Can be used to disable default browser touch actions.

  Parameters:
    * canvas (HTMLCanvasElement) - The canvas to set the touch action on.
    * value (string) {optional} - The touch action to set. Defaults to 'none'.

  Returns:  HTMLCanvasElement - The source canvas."
  ([canvas]
   (phaser->clj
    (.setTouchAction js/Phaser.Canvas
                     (clj->phaser canvas))))
  ([canvas value]
   (phaser->clj
    (.setTouchAction js/Phaser.Canvas
                     (clj->phaser canvas)
                     (clj->phaser value)))))

(defn set-transform-
  "Sets the transform of the given canvas to the matrix values provided.

  Parameters:
    * context (CanvasRenderingContext2D) - The context to set the transform on.
    * translate-x (number) - The value to translate horizontally by.
    * translate-y (number) - The value to translate vertically by.
    * scale-x (number) - The value to scale horizontally by.
    * scale-y (number) - The value to scale vertically by.
    * skew-x (number) - The value to skew horizontaly by.
    * skew-y (number) - The value to skew vertically by.

  Returns:  CanvasRenderingContext2D - Returns the source context."
  ([context translate-x translate-y scale-x scale-y skew-x skew-y]
   (phaser->clj
    (.setTransform js/Phaser.Canvas
                   (clj->phaser context)
                   (clj->phaser translate-x)
                   (clj->phaser translate-y)
                   (clj->phaser scale-x)
                   (clj->phaser scale-y)
                   (clj->phaser skew-x)
                   (clj->phaser skew-y)))))

(defn set-user-select-
  "Sets the user-select property on the canvas style. Can be used to disable default browser selection actions.

  Parameters:
    * canvas (HTMLCanvasElement) - The canvas to set the touch action on.
    * value (string) {optional} - The touch action to set. Defaults to 'none'.

  Returns:  HTMLCanvasElement - The source canvas."
  ([canvas]
   (phaser->clj
    (.setUserSelect js/Phaser.Canvas
                    (clj->phaser canvas))))
  ([canvas value]
   (phaser->clj
    (.setUserSelect js/Phaser.Canvas
                    (clj->phaser canvas)
                    (clj->phaser value)))))