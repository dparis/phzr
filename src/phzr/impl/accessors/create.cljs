(ns phzr.impl.accessors.create)

(def ^:private create-constants
  {:palette-arne "PALETTE_ARNE"
   :palette-jmp "PALETTE_JMP"
   :palette-cga "PALETTE_CGA"
   :palette-c64 "PALETTE_C64"
   :palette-japanese-machine "PALETTE_JAPANESE_MACHINE"})

(def create-get-properties
  {:game "game"
   :bmd "bmd"
   :canvas "canvas"
   :ctx "ctx"
   :palettes "palettes"})

(def create-set-properties
  {:game "game"
   :bmd "bmd"
   :canvas "canvas"
   :ctx "ctx"
   :palettes "palettes"})