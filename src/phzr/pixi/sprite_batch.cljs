(ns phzr.pixi.sprite-batch
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->SpriteBatch
  "The SpriteBatch class is a really fast version of the DisplayObjectContainer 
  built solely for speed, so use when you need a lot of sprites or particles.
  And it's extremely easy to use : 

     var container = new PIXI.SpriteBatch();

     stage.addChild(container);

     for(var i  = 0; i < 100; i++)
     {
         var sprite = new PIXI.Sprite.fromImage('myImage.png');
         container.addChild(sprite);
     }
  And here you have a hundred sprites that will be renderer at the speed of light

  Parameters:
    * texture (PIXI.Texture) - -"
  ([texture]
   (js/PIXI.SpriteBatch. (clj->phaser texture))))

