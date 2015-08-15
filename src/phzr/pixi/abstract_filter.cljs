(ns phzr.pixi.abstract-filter
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->AbstractFilter
  "This is the base class for creating a PIXI filter. Currently only webGL supports filters.
  If you want to make a custom filter this should be your base class.

  Parameters:
    * fragment-src (Array) - The fragment source in an array of strings.
    * uniforms (Object) - An object containing the uniforms for this filter."
  ([fragment-src uniforms]
   (js/PIXI.AbstractFilter. (clj->phaser fragment-src)
                            (clj->phaser uniforms))))

(defn sync-uniforms
  "Syncs the uniforms between the class object and the shaders."
  ([abstract-filter]
   (phaser->clj
    (.syncUniforms abstract-filter))))