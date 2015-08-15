(ns phzr.pixi.render-texture
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->RenderTexture
  "A RenderTexture is a special texture that allows any Pixi display object to be rendered to it.

  __Hint__: All DisplayObjects (i.e. Sprites) that render to a RenderTexture should be preloaded otherwise black rectangles will be drawn instead.

  A RenderTexture takes a snapshot of any Display Object given to its render method. The position and rotation of the given Display Objects is ignored. For example:

     var renderTexture = new PIXI.RenderTexture(800, 600);
     var sprite = PIXI.Sprite.fromImage('spinObj_01.png');
     sprite.position.x = 800/2;
     sprite.position.y = 600/2;
     sprite.anchor.x = 0.5;
     sprite.anchor.y = 0.5;
     renderTexture.render(sprite);

  The Sprite in this case will be rendered to a position of 0,0. To render this sprite at its actual position a DisplayObjectContainer should be used:

     var doc = new PIXI.DisplayObjectContainer();
     doc.addChild(sprite);
     renderTexture.render(doc);  // Renders to center of renderTexture

  Parameters:
    * width (Number) - The width of the render texture
    * height (Number) - The height of the render texture
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used for this RenderTexture
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * resolution (Number) - The resolution of the texture being generated"
  ([width height renderer scale-mode resolution]
   (js/PIXI.RenderTexture. (clj->phaser width)
                           (clj->phaser height)
                           (clj->phaser renderer)
                           (clj->phaser scale-mode)
                           (clj->phaser resolution))))

(defn clear
  "Clears the RenderTexture."
  ([render-texture]
   (phaser->clj
    (.clear render-texture))))

(defn destroy
  "Destroys this texture

  Parameters:
    * render-texture (PIXI.RenderTexture) - Targeted instance for method
    * destroy-base (Boolean) - Whether to destroy the base texture as well"
  ([render-texture destroy-base]
   (phaser->clj
    (.destroy render-texture
              (clj->phaser destroy-base)))))

(defn get-base-64
  "Will return a base64 encoded string of this texture. It works by calling RenderTexture.getCanvas and then running toDataURL on that.

  Returns:  String - A base64 encoded string of the texture."
  ([render-texture]
   (phaser->clj
    (.getBase64 render-texture))))

(defn get-canvas
  "Creates a Canvas element, renders this RenderTexture to it and then returns it.

  Returns:  HTMLCanvasElement - A Canvas element with the texture rendered on."
  ([render-texture]
   (phaser->clj
    (.getCanvas render-texture))))

(defn get-image
  "Will return a HTML Image of the texture

  Returns:  Image - "
  ([render-texture]
   (phaser->clj
    (.getImage render-texture))))

(defn resize
  "Resizes the RenderTexture.

  Parameters:
    * render-texture (PIXI.RenderTexture) - Targeted instance for method
    * width (Number) - The width to resize to.
    * height (Number) - The height to resize to.
    * update-base (Boolean) - Should the baseTexture.width and height values be resized as well?"
  ([render-texture width height update-base]
   (phaser->clj
    (.resize render-texture
             (clj->phaser width)
             (clj->phaser height)
             (clj->phaser update-base)))))

(defn set-frame
  "Specifies the region of the baseTexture that this texture will use.

  Parameters:
    * render-texture (PIXI.RenderTexture) - Targeted instance for method
    * frame (Rectangle) - The frame of the texture to set it to"
  ([render-texture frame]
   (phaser->clj
    (.setFrame render-texture
               (clj->phaser frame)))))