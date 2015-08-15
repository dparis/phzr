(ns phzr.physics
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Physics
  "The Physics Manager is responsible for looking after all of the running physics systems.
  Phaser supports 4 physics systems: Arcade Physics, P2, Ninja Physics and Box2D via a commercial plugin.

  Game Objects (such as Sprites) can only belong to 1 physics system, but you can have multiple systems active in a single game.

  For example you could have P2 managing a polygon-built terrain landscape that an vehicle drives over, while it could be firing bullets that use the
  faster (due to being much simpler) Arcade Physics system.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game.
    * physics-config (object) {optional} - A physics configuration object to pass to the Physics world on creation."
  ([game]
   (js/Phaser.Physics. (clj->phaser game)))
  ([game physics-config]
   (js/Phaser.Physics. (clj->phaser game)
                       (clj->phaser physics-config))))

(defn destroy
  "Destroys all active physics systems. Usually only called on a Game Shutdown, not on a State swap."
  ([physics]
   (phaser->clj
    (.destroy physics))))

(defn enable
  "This will create a default physics body on the given game object or array of objects.
  A game object can only have 1 physics body active at any one time, and it can't be changed until the object is destroyed.
  It can be for any of the physics systems that have been started:

  Phaser.Physics.Arcade - A light weight AABB based collision system with basic separation.
  Phaser.Physics.P2JS - A full-body advanced physics system supporting multiple object shapes, polygon loading, contact materials, springs and constraints.
  Phaser.Physics.NINJA - A port of Metanet Softwares N+ physics system. Advanced AABB and Circle vs. Tile collision.
  Phaser.Physics.BOX2D - A port of https://code.google.com/p/box2d-html5
  Phaser.Physics.MATTER - A full-body and light-weight advanced physics system (still in development)
  Phaser.Physics.CHIPMUNK is still in development.

  If you require more control over what type of body is created, for example to create a Ninja Physics Circle instead of the default AABB, then see the
  individual physics systems `enable` methods instead of using this generic one.

  Parameters:
    * physics (Phaser.Physics) - Targeted instance for method
    * object (object | array) - The game object to create the physics body on. Can also be an array of objects, a body will be created on every object in the array.
    * system (number) {optional} - The physics system that will be used to create the body. Defaults to Arcade Physics.
    * debug (boolean) {optional} - Enable the debug drawing for this body. Defaults to false."
  ([physics object]
   (phaser->clj
    (.enable physics
             (clj->phaser object))))
  ([physics object system]
   (phaser->clj
    (.enable physics
             (clj->phaser object)
             (clj->phaser system))))
  ([physics object system debug]
   (phaser->clj
    (.enable physics
             (clj->phaser object)
             (clj->phaser system)
             (clj->phaser debug)))))

(defn parse-config
  "Parses the Physics Configuration object passed to the Game constructor and starts any physics systems specified within."
  ([physics]
   (phaser->clj
    (.parseConfig physics))))

(defn set-bounds-to-world
  "Sets the bounds of the Physics world to match the Game.World dimensions.
  You can optionally set which 'walls' to create: left, right, top or bottom.

  Parameters:
    * physics (Phaser.Physics) - Targeted instance for method
    * left (boolean) {optional} - If true will create the left bounds wall.
    * right (boolean) {optional} - If true will create the right bounds wall.
    * top (boolean) {optional} - If true will create the top bounds wall.
    * bottom (boolean) {optional} - If true will create the bottom bounds wall.
    * set-collision-group (boolean) {optional} - If true the Bounds will be set to use its own Collision Group."
  ([physics]
   (phaser->clj
    (.setBoundsToWorld physics)))
  ([physics left]
   (phaser->clj
    (.setBoundsToWorld physics
                       (clj->phaser left))))
  ([physics left right]
   (phaser->clj
    (.setBoundsToWorld physics
                       (clj->phaser left)
                       (clj->phaser right))))
  ([physics left right top]
   (phaser->clj
    (.setBoundsToWorld physics
                       (clj->phaser left)
                       (clj->phaser right)
                       (clj->phaser top))))
  ([physics left right top bottom]
   (phaser->clj
    (.setBoundsToWorld physics
                       (clj->phaser left)
                       (clj->phaser right)
                       (clj->phaser top)
                       (clj->phaser bottom))))
  ([physics left right top bottom set-collision-group]
   (phaser->clj
    (.setBoundsToWorld physics
                       (clj->phaser left)
                       (clj->phaser right)
                       (clj->phaser top)
                       (clj->phaser bottom)
                       (clj->phaser set-collision-group)))))

(defn set-world-material
  "Sets the given material against the 4 bounds of this World.

  Parameters:
    * physics (Phaser.Physics) - Targeted instance for method
    * material (Phaser.Physics.P2.Material) - The material to set.
    * left (boolean) {optional} - If true will set the material on the left bounds wall.
    * right (boolean) {optional} - If true will set the material on the right bounds wall.
    * top (boolean) {optional} - If true will set the material on the top bounds wall.
    * bottom (boolean) {optional} - If true will set the material on the bottom bounds wall."
  ([physics material]
   (phaser->clj
    (.setWorldMaterial physics
                       (clj->phaser material))))
  ([physics material left]
   (phaser->clj
    (.setWorldMaterial physics
                       (clj->phaser material)
                       (clj->phaser left))))
  ([physics material left right]
   (phaser->clj
    (.setWorldMaterial physics
                       (clj->phaser material)
                       (clj->phaser left)
                       (clj->phaser right))))
  ([physics material left right top]
   (phaser->clj
    (.setWorldMaterial physics
                       (clj->phaser material)
                       (clj->phaser left)
                       (clj->phaser right)
                       (clj->phaser top))))
  ([physics material left right top bottom]
   (phaser->clj
    (.setWorldMaterial physics
                       (clj->phaser material)
                       (clj->phaser left)
                       (clj->phaser right)
                       (clj->phaser top)
                       (clj->phaser bottom)))))

(defn start-system
  "This will create an instance of the requested physics simulation.
  Phaser.Physics.Arcade is running by default, but all others need activating directly.

  You can start the following physics systems:

  Phaser.Physics.P2JS - A full-body advanced physics system by Stefan Hedman.
  Phaser.Physics.NINJA - A port of Metanet Softwares N+ physics system.
  Phaser.Physics.BOX2D - A commercial Phaser Plugin (see http://phaser.io)

  Both Ninja Physics and Box2D require their respective plugins to be loaded before you can start them.
  They are not bundled into the core Phaser library.

  If the physics world has already been created (i.e. in another state in your game) then 
  calling startSystem will reset the physics world, not re-create it. If you need to start them again from their constructors 
  then set Phaser.Physics.p2 (or whichever system you want to recreate) to `null` before calling `startSystem`.

  Parameters:
    * physics (Phaser.Physics) - Targeted instance for method
    * system (number) - The physics system to start: Phaser.Physics.ARCADE, Phaser.Physics.P2JS, Phaser.Physics.NINJA or Phaser.Physics.BOX2D."
  ([physics system]
   (phaser->clj
    (.startSystem physics
                  (clj->phaser system)))))