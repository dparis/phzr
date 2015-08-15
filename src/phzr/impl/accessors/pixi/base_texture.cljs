(ns phzr.impl.accessors.pixi.base-texture)

(def base-texture-get-properties
  {:image-url "imageUrl"
   :has-loaded "hasLoaded"
   :scale-mode "scaleMode"
   :width "width"
   :mipmap "mipmap"
   :premultiplied-alpha "premultipliedAlpha"
   :source "source"
   :resolution "resolution"
   :height "height"})

(def base-texture-set-properties
  {:resolution "resolution"
   :scale-mode "scaleMode"
   :source "source"
   :premultiplied-alpha "premultipliedAlpha"
   :mipmap "mipmap"
   :image-url "imageUrl"})