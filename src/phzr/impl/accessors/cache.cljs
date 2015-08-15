(ns phzr.impl.accessors.cache)

(def ^:private cache-constants
  {:binary "BINARY"
   :sound "SOUND"
   :video "VIDEO"
   :render-texture "RENDER_TEXTURE"
   :bitmapdata "BITMAPDATA"
   :canvas "CANVAS"
   :physics "PHYSICS"
   :tilemap "TILEMAP"
   :bitmapfont "BITMAPFONT"
   :image "IMAGE"
   :json "JSON"
   :xml "XML"
   :texture "TEXTURE"
   :shader "SHADER"
   :text "TEXT"})

(def cache-get-properties
  {:game "game"
   :auto-resolve-url "autoResolveURL"
   :on-sound-unlock "onSoundUnlock"})

(def cache-set-properties
  {:game "game"
   :auto-resolve-url "autoResolveURL"
   :on-sound-unlock "onSoundUnlock"})