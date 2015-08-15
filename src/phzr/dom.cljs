(ns phzr.dom
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn get-aspect-ratio-
  "Get the Visual viewport aspect ratio (or the aspect ratio of an object or element)

  Parameters:
    * object (DOMElement | Object) {optional} - The object to determine the aspect ratio for. Must have public `width` and `height` properties or methods.

  Returns:  number - The aspect ratio."
  ([]
   (phaser->clj
    (.getAspectRatio js/Phaser.DOM)))
  ([object]
   (phaser->clj
    (.getAspectRatio js/Phaser.DOM
                     (clj->phaser object)))))

(defn get-bounds-
  "A cross-browser element.getBoundingClientRect method with optional cushion.

  Returns a plain object containing the properties `top/bottom/left/right/width/height` with respect to the top-left corner of the current viewport.
  Its properties match the native rectangle.
  The cushion parameter is an amount of pixels (+/-) to cushion the element.
  It adjusts the measurements such that it is possible to detect when an element is near the viewport.

  Parameters:
    * element (DOMElement | Object) - The element or stack (uses first item) to get the bounds for.
    * cushion (number) {optional} - A +/- pixel adjustment amount.

  Returns:  [Object | boolean] - A plain object containing the properties `top/bottom/left/right/width/height` or `false` if a non-valid element is given."
  ([element]
   (phaser->clj
    (.getBounds js/Phaser.DOM
                (clj->phaser element))))
  ([element cushion]
   (phaser->clj
    (.getBounds js/Phaser.DOM
                (clj->phaser element)
                (clj->phaser cushion)))))

(defn get-offset-
  "Get the [absolute] position of the element relative to the Document.

  The value may vary slightly as the page is scrolled due to rounding errors.

  Parameters:
    * element (DOMElement) - The targeted element that we want to retrieve the offset.
    * point (Phaser.Point) {optional} - The point we want to take the x/y values of the offset.

  Returns:  Phaser.Point - - A point objet with the offsetX and Y as its properties."
  ([element]
   (phaser->clj
    (.getOffset js/Phaser.DOM
                (clj->phaser element))))
  ([element point]
   (phaser->clj
    (.getOffset js/Phaser.DOM
                (clj->phaser element)
                (clj->phaser point)))))

(defn in-layout-viewport-
  "Tests if the given DOM element is within the Layout viewport.

  The optional cushion parameter allows you to specify a distance.

  inLayoutViewport(element, 100) is `true` if the element is in the viewport or 100px near it.
  inLayoutViewport(element, -100) is `true` if the element is in the viewport or at least 100px near it.

  Parameters:
    * element (DOMElement | Object) - The DOM element to check. If no element is given it defaults to the Phaser game canvas.
    * cushion (number) {optional} - The cushion allows you to specify a distance within which the element must be within the viewport.

  Returns:  boolean - True if the element is within the viewport, or within `cushion` distance from it."
  ([element]
   (phaser->clj
    (.inLayoutViewport js/Phaser.DOM
                       (clj->phaser element))))
  ([element cushion]
   (phaser->clj
    (.inLayoutViewport js/Phaser.DOM
                       (clj->phaser element)
                       (clj->phaser cushion)))))