(ns phzr.impl.accessors.cache)

(def cache-constants
  {:binary "BINARY"
   :bitmapdata "BITMAPDATA"
   :bitmapfont "BITMAPFONT"
   :canvas "CANVAS"
   :image "IMAGE"
   :json "JSON"
   :physics "PHYSICS"
   :render-texture "RENDER_TEXTURE"
   :shader "SHADER"
   :sound "SOUND"
   :text "TEXT"
   :texture "TEXTURE"
   :tilemap "TILEMAP"
   :video "VIDEO"
   :xml "XML"})

(def cache-get-properties
  {:auto-resolve-url "autoResolveURL"
   :game "game"
   :on-sound-unlock "onSoundUnlock"})

(def cache-set-properties
  {:auto-resolve-url "autoResolveURL"
   :game "game"
   :on-sound-unlock "onSoundUnlock"})