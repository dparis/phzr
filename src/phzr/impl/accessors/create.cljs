(ns phzr.impl.accessors.create)

(def ^:private create-constants
  {:palette-arne "PALETTE_ARNE"
   :palette-c64 "PALETTE_C64"
   :palette-cga "PALETTE_CGA"
   :palette-japanese-machine "PALETTE_JAPANESE_MACHINE"
   :palette-jmp "PALETTE_JMP"})

(def create-get-properties
  {:bmd "bmd"
   :canvas "canvas"
   :ctx "ctx"
   :game "game"
   :palettes "palettes"})

(def create-set-properties
  {:bmd "bmd"
   :canvas "canvas"
   :ctx "ctx"
   :game "game"
   :palettes "palettes"})