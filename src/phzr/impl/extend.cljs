(ns phzr.impl.extend
  (:require [cljsjs.phaser]
            [phzr.impl.extend.core :as ex]
            [phzr.impl.accessors.animation-manager]
            [phzr.impl.accessors.animation]
            [phzr.impl.accessors.array-set]
            [phzr.impl.accessors.audio-sprite]
            [phzr.impl.accessors.bitmap-data]
            [phzr.impl.accessors.bitmap-text]
            [phzr.impl.accessors.button]
            [phzr.impl.accessors.cache]
            [phzr.impl.accessors.camera]
            [phzr.impl.accessors.circle]
            [phzr.impl.accessors.component.angle]
            [phzr.impl.accessors.component.auto-cull]
            [phzr.impl.accessors.component.bounds]
            [phzr.impl.accessors.component.core]
            [phzr.impl.accessors.component.crop]
            [phzr.impl.accessors.component.delta]
            [phzr.impl.accessors.component.destroy]
            [phzr.impl.accessors.component.fixed-to-camera]
            [phzr.impl.accessors.component.health]
            [phzr.impl.accessors.component.in-camera]
            [phzr.impl.accessors.component.in-world]
            [phzr.impl.accessors.component.input-enabled]
            [phzr.impl.accessors.component.life-span]
            [phzr.impl.accessors.component.load-texture]
            [phzr.impl.accessors.component.physics-body]
            [phzr.impl.accessors.component.scale-min-max]
            [phzr.impl.accessors.component.smoothed]
            [phzr.impl.accessors.create]
            [phzr.impl.accessors.device-button]
            [phzr.impl.accessors.ellipse]
            [phzr.impl.accessors.events]
            [phzr.impl.accessors.filter]
            [phzr.impl.accessors.flex-grid]
            [phzr.impl.accessors.flex-layer]
            [phzr.impl.accessors.frame-data]
            [phzr.impl.accessors.frame]
            [phzr.impl.accessors.game]
            [phzr.impl.accessors.gamepad]
            [phzr.impl.accessors.graphics]
            [phzr.impl.accessors.group]
            [phzr.impl.accessors.image-collection]
            [phzr.impl.accessors.image]
            [phzr.impl.accessors.input-handler]
            [phzr.impl.accessors.input]
            [phzr.impl.accessors.key]
            [phzr.impl.accessors.keyboard]
            [phzr.impl.accessors.line]
            [phzr.impl.accessors.linked-list]
            [phzr.impl.accessors.loader]
            [phzr.impl.accessors.matrix]
            [phzr.impl.accessors.mouse]
            [phzr.impl.accessors.ms-pointer]
            [phzr.impl.accessors.particle]
            [phzr.impl.accessors.particles.arcade.emitter]
            [phzr.impl.accessors.particles]
            [phzr.impl.accessors.physics.arcade.body]
            [phzr.impl.accessors.physics.arcade.tilemap-collision]
            [phzr.impl.accessors.physics.arcade]
            [phzr.impl.accessors.physics.p2.body-debug]
            [phzr.impl.accessors.physics.p2.body]
            [phzr.impl.accessors.physics.p2.collision-group]
            [phzr.impl.accessors.physics.p2.distance-constraint]
            [phzr.impl.accessors.physics.p2.gear-constraint]
            [phzr.impl.accessors.physics.p2.inverse-point-proxy]
            [phzr.impl.accessors.physics.p2.lock-constraint]
            [phzr.impl.accessors.physics.p2.material]
            [phzr.impl.accessors.physics.p2.point-proxy]
            [phzr.impl.accessors.physics.p2.prismatic-constraint]
            [phzr.impl.accessors.physics.p2.revolute-constraint]
            [phzr.impl.accessors.physics.p2.rotational-spring]
            [phzr.impl.accessors.physics.p2.spring]
            [phzr.impl.accessors.physics.p2]
            [phzr.impl.accessors.physics]
            [phzr.impl.accessors.pixi.abstract-filter]
            [phzr.impl.accessors.pixi.base-texture]
            [phzr.impl.accessors.pixi.canvas-buffer]
            [phzr.impl.accessors.pixi.canvas-renderer]
            [phzr.impl.accessors.pixi.canvas-tinter]
            [phzr.impl.accessors.pixi.complex-primitive-shader]
            [phzr.impl.accessors.pixi.display-object-container]
            [phzr.impl.accessors.pixi.display-object]
            [phzr.impl.accessors.pixi.filter-texture]
            [phzr.impl.accessors.pixi.graphics]
            [phzr.impl.accessors.pixi.pixi-fast-shader]
            [phzr.impl.accessors.pixi.pixi-shader]
            [phzr.impl.accessors.pixi.primitive-shader]
            [phzr.impl.accessors.pixi.render-texture]
            [phzr.impl.accessors.pixi.rope]
            [phzr.impl.accessors.pixi.sprite]
            [phzr.impl.accessors.pixi.stage]
            [phzr.impl.accessors.pixi.strip-shader]
            [phzr.impl.accessors.pixi.strip]
            [phzr.impl.accessors.pixi.texture]
            [phzr.impl.accessors.pixi.tiling-sprite]
            [phzr.impl.accessors.pixi.webgl-blend-mode-manager]
            [phzr.impl.accessors.pixi.webgl-fast-sprite-batch]
            [phzr.impl.accessors.pixi.webgl-filter-manager]
            [phzr.impl.accessors.pixi.webgl-renderer]
            [phzr.impl.accessors.pixi.webgl-shader-manager]
            [phzr.impl.accessors.pixi.webgl-sprite-batch]
            [phzr.impl.accessors.plugin-manager]
            [phzr.impl.accessors.plugin]
            [phzr.impl.accessors.point]
            [phzr.impl.accessors.pointer]
            [phzr.impl.accessors.polygon]
            [phzr.impl.accessors.quad-tree]
            [phzr.impl.accessors.rectangle]
            [phzr.impl.accessors.render-texture]
            [phzr.impl.accessors.request-animation-frame]
            [phzr.impl.accessors.retro-font]
            [phzr.impl.accessors.rope]
            [phzr.impl.accessors.rounded-rectangle]
            [phzr.impl.accessors.scale-manager]
            [phzr.impl.accessors.signal-binding]
            [phzr.impl.accessors.signal]
            [phzr.impl.accessors.single-pad]
            [phzr.impl.accessors.sound-manager]
            [phzr.impl.accessors.sound]
            [phzr.impl.accessors.sprite-batch]
            [phzr.impl.accessors.sprite]
            [phzr.impl.accessors.stage]
            [phzr.impl.accessors.state-manager]
            [phzr.impl.accessors.state]
            [phzr.impl.accessors.text]
            [phzr.impl.accessors.tile-sprite]
            [phzr.impl.accessors.tile]
            [phzr.impl.accessors.tilemap-layer]
            [phzr.impl.accessors.tilemap]
            [phzr.impl.accessors.tileset]
            [phzr.impl.accessors.time]
            [phzr.impl.accessors.timer-event]
            [phzr.impl.accessors.timer]
            [phzr.impl.accessors.touch]
            [phzr.impl.accessors.tween-data]
            [phzr.impl.accessors.tween-manager]
            [phzr.impl.accessors.tween]
            [phzr.impl.accessors.utils.debug]
            [phzr.impl.accessors.video]
            [phzr.impl.accessors.world]))

(ex/extend-phaser-class
 js/PIXI.AbstractFilter
 phzr.impl.accessors.pixi.abstract-filter/abstract-filter-get-properties
 phzr.impl.accessors.pixi.abstract-filter/abstract-filter-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.BaseTexture
 phzr.impl.accessors.pixi.base-texture/base-texture-get-properties
 phzr.impl.accessors.pixi.base-texture/base-texture-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.CanvasBuffer
 phzr.impl.accessors.pixi.canvas-buffer/canvas-buffer-get-properties
 phzr.impl.accessors.pixi.canvas-buffer/canvas-buffer-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.CanvasGraphics
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/PIXI.CanvasMaskManager
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/PIXI.CanvasRenderer
 phzr.impl.accessors.pixi.canvas-renderer/canvas-renderer-get-properties
 phzr.impl.accessors.pixi.canvas-renderer/canvas-renderer-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.CanvasTinter
 phzr.impl.accessors.pixi.canvas-tinter/canvas-tinter-get-properties
 phzr.impl.accessors.pixi.canvas-tinter/canvas-tinter-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.ComplexPrimitiveShader
 phzr.impl.accessors.pixi.complex-primitive-shader/complex-primitive-shader-get-properties
 phzr.impl.accessors.pixi.complex-primitive-shader/complex-primitive-shader-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.DisplayObject
 phzr.impl.accessors.pixi.display-object/display-object-get-properties
 phzr.impl.accessors.pixi.display-object/display-object-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.DisplayObjectContainer
 phzr.impl.accessors.pixi.display-object-container/display-object-container-get-properties
 phzr.impl.accessors.pixi.display-object-container/display-object-container-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.FilterTexture
 phzr.impl.accessors.pixi.filter-texture/filter-texture-get-properties
 phzr.impl.accessors.pixi.filter-texture/filter-texture-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.Graphics
 phzr.impl.accessors.pixi.graphics/graphics-get-properties
 phzr.impl.accessors.pixi.graphics/graphics-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.GraphicsData
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/PIXI.PixiFastShader
 phzr.impl.accessors.pixi.pixi-fast-shader/pixi-fast-shader-get-properties
 phzr.impl.accessors.pixi.pixi-fast-shader/pixi-fast-shader-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.PixiShader
 phzr.impl.accessors.pixi.pixi-shader/pixi-shader-get-properties
 phzr.impl.accessors.pixi.pixi-shader/pixi-shader-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.PrimitiveShader
 phzr.impl.accessors.pixi.primitive-shader/primitive-shader-get-properties
 phzr.impl.accessors.pixi.primitive-shader/primitive-shader-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.RenderTexture
 phzr.impl.accessors.pixi.render-texture/render-texture-get-properties
 phzr.impl.accessors.pixi.render-texture/render-texture-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.Rope
 phzr.impl.accessors.pixi.rope/rope-get-properties
 phzr.impl.accessors.pixi.rope/rope-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.Sprite
 phzr.impl.accessors.pixi.sprite/sprite-get-properties
 phzr.impl.accessors.pixi.sprite/sprite-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.SpriteBatch
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/PIXI.Stage
 phzr.impl.accessors.pixi.stage/stage-get-properties
 phzr.impl.accessors.pixi.stage/stage-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.Strip
 phzr.impl.accessors.pixi.strip/strip-get-properties
 phzr.impl.accessors.pixi.strip/strip-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.StripShader
 phzr.impl.accessors.pixi.strip-shader/strip-shader-get-properties
 phzr.impl.accessors.pixi.strip-shader/strip-shader-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.Texture
 phzr.impl.accessors.pixi.texture/texture-get-properties
 phzr.impl.accessors.pixi.texture/texture-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.TilingSprite
 phzr.impl.accessors.pixi.tiling-sprite/tiling-sprite-get-properties
 phzr.impl.accessors.pixi.tiling-sprite/tiling-sprite-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLBlendModeManager
 phzr.impl.accessors.pixi.webgl-blend-mode-manager/webgl-blend-mode-manager-get-properties
 phzr.impl.accessors.pixi.webgl-blend-mode-manager/webgl-blend-mode-manager-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLFastSpriteBatch
 phzr.impl.accessors.pixi.webgl-fast-sprite-batch/webgl-fast-sprite-batch-get-properties
 phzr.impl.accessors.pixi.webgl-fast-sprite-batch/webgl-fast-sprite-batch-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLFilterManager
 phzr.impl.accessors.pixi.webgl-filter-manager/webgl-filter-manager-get-properties
 phzr.impl.accessors.pixi.webgl-filter-manager/webgl-filter-manager-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLGraphics
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLGraphicsData
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLMaskManager
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLRenderer
 phzr.impl.accessors.pixi.webgl-renderer/webgl-renderer-get-properties
 phzr.impl.accessors.pixi.webgl-renderer/webgl-renderer-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLShaderManager
 phzr.impl.accessors.pixi.webgl-shader-manager/webgl-shader-manager-get-properties
 phzr.impl.accessors.pixi.webgl-shader-manager/webgl-shader-manager-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLSpriteBatch
 phzr.impl.accessors.pixi.webgl-sprite-batch/webgl-sprite-batch-get-properties
 phzr.impl.accessors.pixi.webgl-sprite-batch/webgl-sprite-batch-set-properties
 nil)

(ex/extend-phaser-class
 js/PIXI.WebGLStencilManager
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Animation
 phzr.impl.accessors.animation/animation-get-properties
 phzr.impl.accessors.animation/animation-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.AnimationManager
 phzr.impl.accessors.animation-manager/animation-manager-get-properties
 phzr.impl.accessors.animation-manager/animation-manager-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.ArraySet
 phzr.impl.accessors.array-set/array-set-get-properties
 phzr.impl.accessors.array-set/array-set-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.AudioSprite
 phzr.impl.accessors.audio-sprite/audio-sprite-get-properties
 phzr.impl.accessors.audio-sprite/audio-sprite-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.BitmapData
 phzr.impl.accessors.bitmap-data/bitmap-data-get-properties
 phzr.impl.accessors.bitmap-data/bitmap-data-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.BitmapText
 phzr.impl.accessors.bitmap-text/bitmap-text-get-properties
 phzr.impl.accessors.bitmap-text/bitmap-text-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Button
 phzr.impl.accessors.button/button-get-properties
 phzr.impl.accessors.button/button-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Cache
 phzr.impl.accessors.cache/cache-get-properties
 phzr.impl.accessors.cache/cache-set-properties
 phzr.impl.accessors.cache/cache-constants)

(ex/extend-phaser-class
 js/Phaser.Camera
 phzr.impl.accessors.camera/camera-get-properties
 phzr.impl.accessors.camera/camera-set-properties
 phzr.impl.accessors.camera/camera-constants)

(ex/extend-phaser-class
 js/Phaser.Circle
 phzr.impl.accessors.circle/circle-get-properties
 phzr.impl.accessors.circle/circle-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Angle
 phzr.impl.accessors.component.angle/angle-get-properties
 phzr.impl.accessors.component.angle/angle-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Animation
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.AutoCull
 phzr.impl.accessors.component.auto-cull/auto-cull-get-properties
 phzr.impl.accessors.component.auto-cull/auto-cull-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Bounds
 phzr.impl.accessors.component.bounds/bounds-get-properties
 phzr.impl.accessors.component.bounds/bounds-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.BringToTop
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Core
 phzr.impl.accessors.component.core/core-get-properties
 phzr.impl.accessors.component.core/core-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Crop
 phzr.impl.accessors.component.crop/crop-get-properties
 phzr.impl.accessors.component.crop/crop-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Delta
 phzr.impl.accessors.component.delta/delta-get-properties
 phzr.impl.accessors.component.delta/delta-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Destroy
 phzr.impl.accessors.component.destroy/destroy-get-properties
 phzr.impl.accessors.component.destroy/destroy-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.FixedToCamera
 phzr.impl.accessors.component.fixed-to-camera/fixed-to-camera-get-properties
 phzr.impl.accessors.component.fixed-to-camera/fixed-to-camera-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Health
 phzr.impl.accessors.component.health/health-get-properties
 phzr.impl.accessors.component.health/health-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.InCamera
 phzr.impl.accessors.component.in-camera/in-camera-get-properties
 phzr.impl.accessors.component.in-camera/in-camera-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.InWorld
 phzr.impl.accessors.component.in-world/in-world-get-properties
 phzr.impl.accessors.component.in-world/in-world-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.InputEnabled
 phzr.impl.accessors.component.input-enabled/input-enabled-get-properties
 phzr.impl.accessors.component.input-enabled/input-enabled-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.LifeSpan
 phzr.impl.accessors.component.life-span/life-span-get-properties
 phzr.impl.accessors.component.life-span/life-span-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.LoadTexture
 phzr.impl.accessors.component.load-texture/load-texture-get-properties
 phzr.impl.accessors.component.load-texture/load-texture-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Overlap
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.PhysicsBody
 phzr.impl.accessors.component.physics-body/physics-body-get-properties
 phzr.impl.accessors.component.physics-body/physics-body-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Reset
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.ScaleMinMax
 phzr.impl.accessors.component.scale-min-max/scale-min-max-get-properties
 phzr.impl.accessors.component.scale-min-max/scale-min-max-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Component.Smoothed
 phzr.impl.accessors.component.smoothed/smoothed-get-properties
 phzr.impl.accessors.component.smoothed/smoothed-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Create
 phzr.impl.accessors.create/create-get-properties
 phzr.impl.accessors.create/create-set-properties
 phzr.impl.accessors.create/create-constants)

(ex/extend-phaser-class
 js/Phaser.DeviceButton
 phzr.impl.accessors.device-button/device-button-get-properties
 phzr.impl.accessors.device-button/device-button-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Ellipse
 phzr.impl.accessors.ellipse/ellipse-get-properties
 phzr.impl.accessors.ellipse/ellipse-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Events
 phzr.impl.accessors.events/events-get-properties
 phzr.impl.accessors.events/events-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Filter
 phzr.impl.accessors.filter/filter-get-properties
 phzr.impl.accessors.filter/filter-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.FlexGrid
 phzr.impl.accessors.flex-grid/flex-grid-get-properties
 phzr.impl.accessors.flex-grid/flex-grid-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.FlexLayer
 phzr.impl.accessors.flex-layer/flex-layer-get-properties
 phzr.impl.accessors.flex-layer/flex-layer-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Frame
 phzr.impl.accessors.frame/frame-get-properties
 phzr.impl.accessors.frame/frame-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.FrameData
 phzr.impl.accessors.frame-data/frame-data-get-properties
 phzr.impl.accessors.frame-data/frame-data-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Game
 phzr.impl.accessors.game/game-get-properties
 phzr.impl.accessors.game/game-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.GameObjectCreator
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.GameObjectFactory
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Gamepad
 phzr.impl.accessors.gamepad/gamepad-get-properties
 phzr.impl.accessors.gamepad/gamepad-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Graphics
 phzr.impl.accessors.graphics/graphics-get-properties
 phzr.impl.accessors.graphics/graphics-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Group
 phzr.impl.accessors.group/group-get-properties
 phzr.impl.accessors.group/group-set-properties
 phzr.impl.accessors.group/group-constants)

(ex/extend-phaser-class
 js/Phaser.Image
 phzr.impl.accessors.image/image-get-properties
 phzr.impl.accessors.image/image-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.ImageCollection
 phzr.impl.accessors.image-collection/image-collection-get-properties
 phzr.impl.accessors.image-collection/image-collection-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Input
 phzr.impl.accessors.input/input-get-properties
 phzr.impl.accessors.input/input-set-properties
 phzr.impl.accessors.input/input-constants)

(ex/extend-phaser-class
 js/Phaser.InputHandler
 phzr.impl.accessors.input-handler/input-handler-get-properties
 phzr.impl.accessors.input-handler/input-handler-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Key
 phzr.impl.accessors.key/key-get-properties
 phzr.impl.accessors.key/key-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Keyboard
 phzr.impl.accessors.keyboard/keyboard-get-properties
 phzr.impl.accessors.keyboard/keyboard-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Line
 phzr.impl.accessors.line/line-get-properties
 phzr.impl.accessors.line/line-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.LinkedList
 phzr.impl.accessors.linked-list/linked-list-get-properties
 phzr.impl.accessors.linked-list/linked-list-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Loader
 phzr.impl.accessors.loader/loader-get-properties
 phzr.impl.accessors.loader/loader-set-properties
 phzr.impl.accessors.loader/loader-constants)

(ex/extend-phaser-class
 js/Phaser.MSPointer
 phzr.impl.accessors.ms-pointer/ms-pointer-get-properties
 phzr.impl.accessors.ms-pointer/ms-pointer-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Matrix
 phzr.impl.accessors.matrix/matrix-get-properties
 phzr.impl.accessors.matrix/matrix-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Mouse
 phzr.impl.accessors.mouse/mouse-get-properties
 phzr.impl.accessors.mouse/mouse-set-properties
 phzr.impl.accessors.mouse/mouse-constants)

(ex/extend-phaser-class
 js/Phaser.Net
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Particle
 phzr.impl.accessors.particle/particle-get-properties
 phzr.impl.accessors.particle/particle-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Particles
 phzr.impl.accessors.particles/particles-get-properties
 phzr.impl.accessors.particles/particles-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Particles.Arcade.Emitter
 phzr.impl.accessors.particles.arcade.emitter/emitter-get-properties
 phzr.impl.accessors.particles.arcade.emitter/emitter-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics
 phzr.impl.accessors.physics/physics-get-properties
 phzr.impl.accessors.physics/physics-set-properties
 phzr.impl.accessors.physics/physics-constants)

(ex/extend-phaser-class
 js/Phaser.Physics.Arcade
 phzr.impl.accessors.physics.arcade/arcade-get-properties
 phzr.impl.accessors.physics.arcade/arcade-set-properties
 phzr.impl.accessors.physics.arcade/arcade-constants)

(ex/extend-phaser-class
 js/Phaser.Physics.Arcade.Body
 phzr.impl.accessors.physics.arcade.body/body-get-properties
 phzr.impl.accessors.physics.arcade.body/body-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.Arcade.TilemapCollision
 phzr.impl.accessors.physics.arcade.tilemap-collision/tilemap-collision-get-properties
 phzr.impl.accessors.physics.arcade.tilemap-collision/tilemap-collision-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2
 phzr.impl.accessors.physics.p2/p2-get-properties
 phzr.impl.accessors.physics.p2/p2-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.Body
 phzr.impl.accessors.physics.p2.body/body-get-properties
 phzr.impl.accessors.physics.p2.body/body-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.BodyDebug
 phzr.impl.accessors.physics.p2.body-debug/body-debug-get-properties
 phzr.impl.accessors.physics.p2.body-debug/body-debug-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.CollisionGroup
 phzr.impl.accessors.physics.p2.collision-group/collision-group-get-properties
 phzr.impl.accessors.physics.p2.collision-group/collision-group-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.ContactMaterial
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.DistanceConstraint
 phzr.impl.accessors.physics.p2.distance-constraint/distance-constraint-get-properties
 phzr.impl.accessors.physics.p2.distance-constraint/distance-constraint-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.FixtureList
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.GearConstraint
 phzr.impl.accessors.physics.p2.gear-constraint/gear-constraint-get-properties
 phzr.impl.accessors.physics.p2.gear-constraint/gear-constraint-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.InversePointProxy
 phzr.impl.accessors.physics.p2.inverse-point-proxy/inverse-point-proxy-get-properties
 phzr.impl.accessors.physics.p2.inverse-point-proxy/inverse-point-proxy-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.LockConstraint
 phzr.impl.accessors.physics.p2.lock-constraint/lock-constraint-get-properties
 phzr.impl.accessors.physics.p2.lock-constraint/lock-constraint-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.Material
 phzr.impl.accessors.physics.p2.material/material-get-properties
 phzr.impl.accessors.physics.p2.material/material-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.PointProxy
 phzr.impl.accessors.physics.p2.point-proxy/point-proxy-get-properties
 phzr.impl.accessors.physics.p2.point-proxy/point-proxy-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.PrismaticConstraint
 phzr.impl.accessors.physics.p2.prismatic-constraint/prismatic-constraint-get-properties
 phzr.impl.accessors.physics.p2.prismatic-constraint/prismatic-constraint-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.RevoluteConstraint
 phzr.impl.accessors.physics.p2.revolute-constraint/revolute-constraint-get-properties
 phzr.impl.accessors.physics.p2.revolute-constraint/revolute-constraint-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.RotationalSpring
 phzr.impl.accessors.physics.p2.rotational-spring/rotational-spring-get-properties
 phzr.impl.accessors.physics.p2.rotational-spring/rotational-spring-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Physics.P2.Spring
 phzr.impl.accessors.physics.p2.spring/spring-get-properties
 phzr.impl.accessors.physics.p2.spring/spring-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Plugin
 phzr.impl.accessors.plugin/plugin-get-properties
 phzr.impl.accessors.plugin/plugin-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.PluginManager
 phzr.impl.accessors.plugin-manager/plugin-manager-get-properties
 phzr.impl.accessors.plugin-manager/plugin-manager-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Point
 phzr.impl.accessors.point/point-get-properties
 phzr.impl.accessors.point/point-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Pointer
 phzr.impl.accessors.pointer/pointer-get-properties
 phzr.impl.accessors.pointer/pointer-set-properties
 phzr.impl.accessors.pointer/pointer-constants)

(ex/extend-phaser-class
 js/Phaser.Polygon
 phzr.impl.accessors.polygon/polygon-get-properties
 phzr.impl.accessors.polygon/polygon-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.QuadTree
 phzr.impl.accessors.quad-tree/quad-tree-get-properties
 phzr.impl.accessors.quad-tree/quad-tree-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.RandomDataGenerator
 nil
 nil
 nil)

(ex/extend-phaser-class
 js/Phaser.Rectangle
 phzr.impl.accessors.rectangle/rectangle-get-properties
 phzr.impl.accessors.rectangle/rectangle-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.RenderTexture
 phzr.impl.accessors.render-texture/render-texture-get-properties
 phzr.impl.accessors.render-texture/render-texture-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.RequestAnimationFrame
 phzr.impl.accessors.request-animation-frame/request-animation-frame-get-properties
 phzr.impl.accessors.request-animation-frame/request-animation-frame-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.RetroFont
 phzr.impl.accessors.retro-font/retro-font-get-properties
 phzr.impl.accessors.retro-font/retro-font-set-properties
 phzr.impl.accessors.retro-font/retro-font-constants)

(ex/extend-phaser-class
 js/Phaser.Rope
 phzr.impl.accessors.rope/rope-get-properties
 phzr.impl.accessors.rope/rope-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.RoundedRectangle
 phzr.impl.accessors.rounded-rectangle/rounded-rectangle-get-properties
 phzr.impl.accessors.rounded-rectangle/rounded-rectangle-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.ScaleManager
 phzr.impl.accessors.scale-manager/scale-manager-get-properties
 phzr.impl.accessors.scale-manager/scale-manager-set-properties
 phzr.impl.accessors.scale-manager/scale-manager-constants)

(ex/extend-phaser-class
 js/Phaser.Signal
 phzr.impl.accessors.signal/signal-get-properties
 phzr.impl.accessors.signal/signal-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.SignalBinding
 phzr.impl.accessors.signal-binding/signal-binding-get-properties
 phzr.impl.accessors.signal-binding/signal-binding-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.SinglePad
 phzr.impl.accessors.single-pad/single-pad-get-properties
 phzr.impl.accessors.single-pad/single-pad-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Sound
 phzr.impl.accessors.sound/sound-get-properties
 phzr.impl.accessors.sound/sound-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.SoundManager
 phzr.impl.accessors.sound-manager/sound-manager-get-properties
 phzr.impl.accessors.sound-manager/sound-manager-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Sprite
 phzr.impl.accessors.sprite/sprite-get-properties
 phzr.impl.accessors.sprite/sprite-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.SpriteBatch
 phzr.impl.accessors.sprite-batch/sprite-batch-get-properties
 phzr.impl.accessors.sprite-batch/sprite-batch-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Stage
 phzr.impl.accessors.stage/stage-get-properties
 phzr.impl.accessors.stage/stage-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.State
 phzr.impl.accessors.state/state-get-properties
 phzr.impl.accessors.state/state-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.StateManager
 phzr.impl.accessors.state-manager/state-manager-get-properties
 phzr.impl.accessors.state-manager/state-manager-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Text
 phzr.impl.accessors.text/text-get-properties
 phzr.impl.accessors.text/text-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Tile
 phzr.impl.accessors.tile/tile-get-properties
 phzr.impl.accessors.tile/tile-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.TileSprite
 phzr.impl.accessors.tile-sprite/tile-sprite-get-properties
 phzr.impl.accessors.tile-sprite/tile-sprite-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Tilemap
 phzr.impl.accessors.tilemap/tilemap-get-properties
 phzr.impl.accessors.tilemap/tilemap-set-properties
 phzr.impl.accessors.tilemap/tilemap-constants)

(ex/extend-phaser-class
 js/Phaser.TilemapLayer
 phzr.impl.accessors.tilemap-layer/tilemap-layer-get-properties
 phzr.impl.accessors.tilemap-layer/tilemap-layer-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Tileset
 phzr.impl.accessors.tileset/tileset-get-properties
 phzr.impl.accessors.tileset/tileset-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Time
 phzr.impl.accessors.time/time-get-properties
 phzr.impl.accessors.time/time-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Timer
 phzr.impl.accessors.timer/timer-get-properties
 phzr.impl.accessors.timer/timer-set-properties
 phzr.impl.accessors.timer/timer-constants)

(ex/extend-phaser-class
 js/Phaser.TimerEvent
 phzr.impl.accessors.timer-event/timer-event-get-properties
 phzr.impl.accessors.timer-event/timer-event-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Touch
 phzr.impl.accessors.touch/touch-get-properties
 phzr.impl.accessors.touch/touch-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Tween
 phzr.impl.accessors.tween/tween-get-properties
 phzr.impl.accessors.tween/tween-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.TweenData
 phzr.impl.accessors.tween-data/tween-data-get-properties
 phzr.impl.accessors.tween-data/tween-data-set-properties
 phzr.impl.accessors.tween-data/tween-data-constants)

(ex/extend-phaser-class
 js/Phaser.TweenManager
 phzr.impl.accessors.tween-manager/tween-manager-get-properties
 phzr.impl.accessors.tween-manager/tween-manager-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Utils.Debug
 phzr.impl.accessors.utils.debug/debug-get-properties
 phzr.impl.accessors.utils.debug/debug-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.Video
 phzr.impl.accessors.video/video-get-properties
 phzr.impl.accessors.video/video-set-properties
 nil)

(ex/extend-phaser-class
 js/Phaser.World
 phzr.impl.accessors.world/world-get-properties
 phzr.impl.accessors.world/world-set-properties
 nil)