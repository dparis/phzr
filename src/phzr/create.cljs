(ns phzr.create
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Create
  "The Phaser.Create class is a collection of smaller helper methods that allow you to generate game content
  quickly and easily, without the need for any external files. You can create textures for sprites and in
  coming releases we'll add dynamic sound effect generation support as well (like sfxr).

  Access this via `State.create` (or `this.create` from within a State object)

  Parameters:
    * game (Phaser.Game) - Game reference to the currently running game."
  ([game]
   (js/Phaser.Create. (clj->phaser game))))

(defn const
  [k]
  (when-let [cn (get phzr.impl.accessors.create/create-constants k)]
    (aget js/Phaser.Create cn)))

(defn grid
  "Creates a grid texture based on the given dimensions.

  Parameters:
    * create (Phaser.Create) - Targeted instance for method
    * key (string) - The key used to store this texture in the Phaser Cache.
    * width (integer) - The width of the grid in pixels.
    * height (integer) - The height of the grid in pixels.
    * cell-width (integer) - The width of the grid cells in pixels.
    * cell-height (integer) - The height of the grid cells in pixels.
    * color (string) - The color to draw the grid lines in. Should be a Canvas supported color string like `#ff5500` or `rgba(200,50,3,0.5)`.

  Returns:  PIXI.Texture - The newly generated texture."
  ([create key width height cell-width cell-height color]
   (phaser->clj
    (.grid create
           (clj->phaser key)
           (clj->phaser width)
           (clj->phaser height)
           (clj->phaser cell-width)
           (clj->phaser cell-height)
           (clj->phaser color)))))

(defn texture
  "Generates a new PIXI.Texture from the given data, which can be applied to a Sprite.

  This allows you to create game graphics quickly and easily, with no external files but that use actual proper images
  rather than Phaser.Graphics objects, which are expensive to render and limited in scope.

  Each element of the array is a string holding the pixel color values, as mapped to one of the Phaser.Create PALETTE consts.

  For example:

  `var data = [
    ' 333 ',
    ' 777 ',
    'E333E',
    ' 333 ',
    ' 3 3 '
  ];`

  `game.create.texture('bob', data);`

  The above will create a new texture called `bob`, which will look like a little man wearing a hat. You can then use it
  for sprites the same way you use any other texture: `game.add.sprite(0, 0, 'bob');`

  Parameters:
    * create (Phaser.Create) - Targeted instance for method
    * key (string) - The key used to store this texture in the Phaser Cache.
    * data (array) - An array of pixel data.
    * pixel-width (integer) {optional} - The width of each pixel.
    * pixel-height (integer) {optional} - The height of each pixel.
    * palette (integer) {optional} - The palette to use when rendering the texture. One of the Phaser.Create.PALETTE consts.

  Returns:  PIXI.Texture - The newly generated texture."
  ([create key data]
   (phaser->clj
    (.texture create
              (clj->phaser key)
              (clj->phaser data))))
  ([create key data pixel-width]
   (phaser->clj
    (.texture create
              (clj->phaser key)
              (clj->phaser data)
              (clj->phaser pixel-width))))
  ([create key data pixel-width pixel-height]
   (phaser->clj
    (.texture create
              (clj->phaser key)
              (clj->phaser data)
              (clj->phaser pixel-width)
              (clj->phaser pixel-height))))
  ([create key data pixel-width pixel-height palette]
   (phaser->clj
    (.texture create
              (clj->phaser key)
              (clj->phaser data)
              (clj->phaser pixel-width)
              (clj->phaser pixel-height)
              (clj->phaser palette)))))