(ns phzr.physics.p2
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->P2
  "This is your main access to the P2 Physics World.
  From here you can create materials, listen for events and add bodies into the physics simulation.

  Parameters:
    * game (Phaser.Game) - Reference to the current game instance.
    * config (object) {optional} - Physics configuration object passed in from the game constructor."
  ([game]
   (js/Phaser.Physics.P2. (clj->phaser game)))
  ([game config]
   (js/Phaser.Physics.P2. (clj->phaser game)
                          (clj->phaser config))))

(defn add-body
  "Add a body to the world.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body (Phaser.Physics.P2.Body) - The Body to add to the World.

  Returns:  boolean - True if the Body was added successfully, otherwise false."
  ([p2 body]
   (phaser->clj
    (.addBody p2
              (clj->phaser body)))))

(defn add-constraint
  "Adds a Constraint to the world.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * constraint (Phaser.Physics.P2.Constraint) - The Constraint to add to the World.

  Returns:  Phaser.Physics.P2.Constraint - The Constraint that was added."
  ([p2 constraint]
   (phaser->clj
    (.addConstraint p2
                    (clj->phaser constraint)))))

(defn add-contact-material
  "Adds a Contact Material to the world.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * material (Phaser.Physics.P2.ContactMaterial) - The Contact Material to be added to the World.

  Returns:  Phaser.Physics.P2.ContactMaterial - The Contact Material that was added."
  ([p2 material]
   (phaser->clj
    (.addContactMaterial p2
                         (clj->phaser material)))))

(defn add-spring
  "Adds a Spring to the world.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * spring (Phaser.Physics.P2.Spring | p2.LinearSpring | p2.RotationalSpring) - The Spring to add to the World.

  Returns:  Phaser.Physics.P2.Spring - The Spring that was added."
  ([p2 spring]
   (phaser->clj
    (.addSpring p2
                (clj->phaser spring)))))

(defn begin-contact-handler
  "Handles a p2 begin contact event.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * event (object) - The event data."
  ([p2 event]
   (phaser->clj
    (.beginContactHandler p2
                          (clj->phaser event)))))

(defn clear
  "Clears all bodies from the simulation, resets callbacks and resets the collision bitmask.

  The P2 world is also cleared:

  * Removes all solver equations
  * Removes all constraints
  * Removes all bodies
  * Removes all springs
  * Removes all contact materials

  This is called automatically when you switch state."
  ([p2]
   (phaser->clj
    (.clear p2))))

(defn clear-tilemap-layer-bodies
  "Clears all physics bodies from the given TilemapLayer that were created with `World.convertTilemap`.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * map (Phaser.Tilemap) - The Tilemap to get the map data from.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on. If not given will default to map.currentLayer."
  ([p2 map]
   (phaser->clj
    (.clearTilemapLayerBodies p2
                              (clj->phaser map))))
  ([p2 map layer]
   (phaser->clj
    (.clearTilemapLayerBodies p2
                              (clj->phaser map)
                              (clj->phaser layer)))))

(defn convert-collision-objects
  "Converts all of the polylines objects inside a Tiled ObjectGroup into physics bodies that are added to the world.
  Note that the polylines must be created in such a way that they can withstand polygon decomposition.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * map (Phaser.Tilemap) - The Tilemap to get the map data from.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on. If not given will default to map.currentLayer.
    * add-to-world (boolean) {optional} - If true it will automatically add each body to the world.

  Returns:  array - An array of the Phaser.Physics.Body objects that have been created."
  ([p2 map]
   (phaser->clj
    (.convertCollisionObjects p2
                              (clj->phaser map))))
  ([p2 map layer]
   (phaser->clj
    (.convertCollisionObjects p2
                              (clj->phaser map)
                              (clj->phaser layer))))
  ([p2 map layer add-to-world]
   (phaser->clj
    (.convertCollisionObjects p2
                              (clj->phaser map)
                              (clj->phaser layer)
                              (clj->phaser add-to-world)))))

(defn convert-tilemap
  "Goes through all tiles in the given Tilemap and TilemapLayer and converts those set to collide into physics bodies.
  Only call this *after* you have specified all of the tiles you wish to collide with calls like Tilemap.setCollisionBetween, etc.
  Every time you call this method it will destroy any previously created bodies and remove them from the world.
  Therefore understand it's a very expensive operation and not to be done in a core game update loop.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * map (Phaser.Tilemap) - The Tilemap to get the map data from.
    * layer (number | string | Phaser.TilemapLayer) {optional} - The layer to operate on. If not given will default to map.currentLayer.
    * add-to-world (boolean) {optional} - If true it will automatically add each body to the world, otherwise it's up to you to do so.
    * optimize (boolean) {optional} - If true adjacent colliding tiles will be combined into a single body to save processing. However it means you cannot perform specific Tile to Body collision responses.

  Returns:  array - An array of the Phaser.Physics.P2.Body objects that were created."
  ([p2 map]
   (phaser->clj
    (.convertTilemap p2
                     (clj->phaser map))))
  ([p2 map layer]
   (phaser->clj
    (.convertTilemap p2
                     (clj->phaser map)
                     (clj->phaser layer))))
  ([p2 map layer add-to-world]
   (phaser->clj
    (.convertTilemap p2
                     (clj->phaser map)
                     (clj->phaser layer)
                     (clj->phaser add-to-world))))
  ([p2 map layer add-to-world optimize]
   (phaser->clj
    (.convertTilemap p2
                     (clj->phaser map)
                     (clj->phaser layer)
                     (clj->phaser add-to-world)
                     (clj->phaser optimize)))))

(defn create-body
  "Creates a new Body and adds it to the World.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * x (number) - The x coordinate of Body.
    * y (number) - The y coordinate of Body.
    * mass (number) - The mass of the Body. A mass of 0 means a 'static' Body is created.
    * add-to-world (boolean) {optional} - Automatically add this Body to the world? (usually false as it won't have any shapes on construction).
    * options (object) {optional} - An object containing the build options:
    * points (Array.<number> | number) {optional} - An array of 2d vectors that form the convex or concave polygon.
                                      Either [[0,0], [0,1],...] or a flat array of numbers that will be interpreted as [x,y, x,y, ...],
                                      or the arguments passed can be flat x,y values e.g. `setPolygon(options, x,y, x,y, x,y, ...)` where `x` and `y` are numbers.

  Returns:  Phaser.Physics.P2.Body - The body"
  ([p2 x y mass]
   (phaser->clj
    (.createBody p2
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser mass))))
  ([p2 x y mass add-to-world]
   (phaser->clj
    (.createBody p2
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser mass)
                 (clj->phaser add-to-world))))
  ([p2 x y mass add-to-world options]
   (phaser->clj
    (.createBody p2
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser mass)
                 (clj->phaser add-to-world)
                 (clj->phaser options))))
  ([p2 x y mass add-to-world options points]
   (phaser->clj
    (.createBody p2
                 (clj->phaser x)
                 (clj->phaser y)
                 (clj->phaser mass)
                 (clj->phaser add-to-world)
                 (clj->phaser options)
                 (clj->phaser points)))))

(defn create-collision-group
  "Creates a new Collision Group and optionally applies it to the given object.
  Collision Groups are handled using bitmasks, therefore you have a fixed limit you can create before you need to re-use older groups.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * object (Phaser.Group | Phaser.Sprite) {optional} - An optional Sprite or Group to apply the Collision Group to. If a Group is given it will be applied to all top-level children."
  ([p2]
   (phaser->clj
    (.createCollisionGroup p2)))
  ([p2 object]
   (phaser->clj
    (.createCollisionGroup p2
                           (clj->phaser object)))))

(defn create-contact-material
  "Creates a Contact Material from the two given Materials. You can then edit the properties of the Contact Material directly.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * material-a (Phaser.Physics.P2.Material) {optional} - The first Material to create the ContactMaterial from. If undefined it will create a new Material object first.
    * material-b (Phaser.Physics.P2.Material) {optional} - The second Material to create the ContactMaterial from. If undefined it will create a new Material object first.
    * options (object) {optional} - Material options object.

  Returns:  Phaser.Physics.P2.ContactMaterial - The Contact Material that was created."
  ([p2]
   (phaser->clj
    (.createContactMaterial p2)))
  ([p2 material-a]
   (phaser->clj
    (.createContactMaterial p2
                            (clj->phaser material-a))))
  ([p2 material-a material-b]
   (phaser->clj
    (.createContactMaterial p2
                            (clj->phaser material-a)
                            (clj->phaser material-b))))
  ([p2 material-a material-b options]
   (phaser->clj
    (.createContactMaterial p2
                            (clj->phaser material-a)
                            (clj->phaser material-b)
                            (clj->phaser options)))))

(defn create-distance-constraint
  "Creates a constraint that tries to keep the distance between two bodies constant.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body-a (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - First connected body.
    * body-b (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - Second connected body.
    * distance (number) - The distance to keep between the bodies.
    * local-anchor-a (Array) {optional} - The anchor point for bodyA, defined locally in bodyA frame. Defaults to [0,0].
    * local-anchor-b (Array) {optional} - The anchor point for bodyB, defined locally in bodyB frame. Defaults to [0,0].
    * max-force (number) {optional} - The maximum force that should be applied to constrain the bodies.

  Returns:  Phaser.Physics.P2.DistanceConstraint - The constraint"
  ([p2 body-a body-b distance]
   (phaser->clj
    (.createDistanceConstraint p2
                               (clj->phaser body-a)
                               (clj->phaser body-b)
                               (clj->phaser distance))))
  ([p2 body-a body-b distance local-anchor-a]
   (phaser->clj
    (.createDistanceConstraint p2
                               (clj->phaser body-a)
                               (clj->phaser body-b)
                               (clj->phaser distance)
                               (clj->phaser local-anchor-a))))
  ([p2 body-a body-b distance local-anchor-a local-anchor-b]
   (phaser->clj
    (.createDistanceConstraint p2
                               (clj->phaser body-a)
                               (clj->phaser body-b)
                               (clj->phaser distance)
                               (clj->phaser local-anchor-a)
                               (clj->phaser local-anchor-b))))
  ([p2 body-a body-b distance local-anchor-a local-anchor-b max-force]
   (phaser->clj
    (.createDistanceConstraint p2
                               (clj->phaser body-a)
                               (clj->phaser body-b)
                               (clj->phaser distance)
                               (clj->phaser local-anchor-a)
                               (clj->phaser local-anchor-b)
                               (clj->phaser max-force)))))

(defn create-gear-constraint
  "Creates a constraint that tries to keep the distance between two bodies constant.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body-a (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - First connected body.
    * body-b (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - Second connected body.
    * angle (number) {optional} - The relative angle
    * ratio (number) {optional} - The gear ratio.

  Returns:  Phaser.Physics.P2.GearConstraint - The constraint"
  ([p2 body-a body-b]
   (phaser->clj
    (.createGearConstraint p2
                           (clj->phaser body-a)
                           (clj->phaser body-b))))
  ([p2 body-a body-b angle]
   (phaser->clj
    (.createGearConstraint p2
                           (clj->phaser body-a)
                           (clj->phaser body-b)
                           (clj->phaser angle))))
  ([p2 body-a body-b angle ratio]
   (phaser->clj
    (.createGearConstraint p2
                           (clj->phaser body-a)
                           (clj->phaser body-b)
                           (clj->phaser angle)
                           (clj->phaser ratio)))))

(defn create-lock-constraint
  "Locks the relative position between two bodies.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body-a (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - First connected body.
    * body-b (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - Second connected body.
    * offset (Array) {optional} - The offset of bodyB in bodyA's frame. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * angle (number) {optional} - The angle of bodyB in bodyA's frame.
    * max-force (number) {optional} - The maximum force that should be applied to constrain the bodies.

  Returns:  Phaser.Physics.P2.LockConstraint - The constraint"
  ([p2 body-a body-b]
   (phaser->clj
    (.createLockConstraint p2
                           (clj->phaser body-a)
                           (clj->phaser body-b))))
  ([p2 body-a body-b offset]
   (phaser->clj
    (.createLockConstraint p2
                           (clj->phaser body-a)
                           (clj->phaser body-b)
                           (clj->phaser offset))))
  ([p2 body-a body-b offset angle]
   (phaser->clj
    (.createLockConstraint p2
                           (clj->phaser body-a)
                           (clj->phaser body-b)
                           (clj->phaser offset)
                           (clj->phaser angle))))
  ([p2 body-a body-b offset angle max-force]
   (phaser->clj
    (.createLockConstraint p2
                           (clj->phaser body-a)
                           (clj->phaser body-b)
                           (clj->phaser offset)
                           (clj->phaser angle)
                           (clj->phaser max-force)))))

(defn create-material
  "Creates a Material. Materials are applied to Shapes owned by a Body and can be set with Body.setMaterial().
  Materials are a way to control what happens when Shapes collide. Combine unique Materials together to create Contact Materials.
  Contact Materials have properties such as friction and restitution that allow for fine-grained collision control between different Materials.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * name (string) {optional} - Optional name of the Material. Each Material has a unique ID but string names are handy for debugging.
    * body (Phaser.Physics.P2.Body) {optional} - Optional Body. If given it will assign the newly created Material to the Body shapes.

  Returns:  Phaser.Physics.P2.Material - The Material that was created. This is also stored in Phaser.Physics.P2.materials."
  ([p2]
   (phaser->clj
    (.createMaterial p2)))
  ([p2 name]
   (phaser->clj
    (.createMaterial p2
                     (clj->phaser name))))
  ([p2 name body]
   (phaser->clj
    (.createMaterial p2
                     (clj->phaser name)
                     (clj->phaser body)))))

(defn create-particle
  "Creates a new Particle and adds it to the World.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * x (number) - The x coordinate of Body.
    * y (number) - The y coordinate of Body.
    * mass (number) - The mass of the Body. A mass of 0 means a 'static' Body is created.
    * add-to-world (boolean) {optional} - Automatically add this Body to the world? (usually false as it won't have any shapes on construction).
    * options (object) {optional} - An object containing the build options:
    * points (Array.<number> | number) {optional} - An array of 2d vectors that form the convex or concave polygon.
                                      Either [[0,0], [0,1],...] or a flat array of numbers that will be interpreted as [x,y, x,y, ...],
                                      or the arguments passed can be flat x,y values e.g. `setPolygon(options, x,y, x,y, x,y, ...)` where `x` and `y` are numbers."
  ([p2 x y mass]
   (phaser->clj
    (.createParticle p2
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser mass))))
  ([p2 x y mass add-to-world]
   (phaser->clj
    (.createParticle p2
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser mass)
                     (clj->phaser add-to-world))))
  ([p2 x y mass add-to-world options]
   (phaser->clj
    (.createParticle p2
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser mass)
                     (clj->phaser add-to-world)
                     (clj->phaser options))))
  ([p2 x y mass add-to-world options points]
   (phaser->clj
    (.createParticle p2
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser mass)
                     (clj->phaser add-to-world)
                     (clj->phaser options)
                     (clj->phaser points)))))

(defn create-prismatic-constraint
  "Constraint that only allows bodies to move along a line, relative to each other.
  See http://www.iforce2d.net/b2dtut/joints-prismatic

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body-a (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - First connected body.
    * body-b (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - Second connected body.
    * lock-rotation (boolean) {optional} - If set to false, bodyB will be free to rotate around its anchor point.
    * anchor-a (Array) {optional} - Body A's anchor point, defined in its own local frame. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * anchor-b (Array) {optional} - Body A's anchor point, defined in its own local frame. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * axis (Array) {optional} - An axis, defined in body A frame, that body B's anchor point may slide along. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * max-force (number) {optional} - The maximum force that should be applied to constrain the bodies.

  Returns:  Phaser.Physics.P2.PrismaticConstraint - The constraint"
  ([p2 body-a body-b]
   (phaser->clj
    (.createPrismaticConstraint p2
                                (clj->phaser body-a)
                                (clj->phaser body-b))))
  ([p2 body-a body-b lock-rotation]
   (phaser->clj
    (.createPrismaticConstraint p2
                                (clj->phaser body-a)
                                (clj->phaser body-b)
                                (clj->phaser lock-rotation))))
  ([p2 body-a body-b lock-rotation anchor-a]
   (phaser->clj
    (.createPrismaticConstraint p2
                                (clj->phaser body-a)
                                (clj->phaser body-b)
                                (clj->phaser lock-rotation)
                                (clj->phaser anchor-a))))
  ([p2 body-a body-b lock-rotation anchor-a anchor-b]
   (phaser->clj
    (.createPrismaticConstraint p2
                                (clj->phaser body-a)
                                (clj->phaser body-b)
                                (clj->phaser lock-rotation)
                                (clj->phaser anchor-a)
                                (clj->phaser anchor-b))))
  ([p2 body-a body-b lock-rotation anchor-a anchor-b axis]
   (phaser->clj
    (.createPrismaticConstraint p2
                                (clj->phaser body-a)
                                (clj->phaser body-b)
                                (clj->phaser lock-rotation)
                                (clj->phaser anchor-a)
                                (clj->phaser anchor-b)
                                (clj->phaser axis))))
  ([p2 body-a body-b lock-rotation anchor-a anchor-b axis max-force]
   (phaser->clj
    (.createPrismaticConstraint p2
                                (clj->phaser body-a)
                                (clj->phaser body-b)
                                (clj->phaser lock-rotation)
                                (clj->phaser anchor-a)
                                (clj->phaser anchor-b)
                                (clj->phaser axis)
                                (clj->phaser max-force)))))

(defn create-revolute-constraint
  "Connects two bodies at given offset points, letting them rotate relative to each other around this point.
  The pivot points are given in world (pixel) coordinates.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body-a (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - First connected body.
    * pivot-a (Array) - The point relative to the center of mass of bodyA which bodyA is constrained to. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * body-b (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - Second connected body.
    * pivot-b (Array) - The point relative to the center of mass of bodyB which bodyB is constrained to. The value is an array with 2 elements matching x and y, i.e: [32, 32].
    * max-force (number) {optional} - The maximum force that should be applied to constrain the bodies.
    * world-pivot (Float32Array) {optional} - A pivot point given in world coordinates. If specified, localPivotA and localPivotB are automatically computed from this value.

  Returns:  Phaser.Physics.P2.RevoluteConstraint - The constraint"
  ([p2 body-a pivot-a body-b pivot-b]
   (phaser->clj
    (.createRevoluteConstraint p2
                               (clj->phaser body-a)
                               (clj->phaser pivot-a)
                               (clj->phaser body-b)
                               (clj->phaser pivot-b))))
  ([p2 body-a pivot-a body-b pivot-b max-force]
   (phaser->clj
    (.createRevoluteConstraint p2
                               (clj->phaser body-a)
                               (clj->phaser pivot-a)
                               (clj->phaser body-b)
                               (clj->phaser pivot-b)
                               (clj->phaser max-force))))
  ([p2 body-a pivot-a body-b pivot-b max-force world-pivot]
   (phaser->clj
    (.createRevoluteConstraint p2
                               (clj->phaser body-a)
                               (clj->phaser pivot-a)
                               (clj->phaser body-b)
                               (clj->phaser pivot-b)
                               (clj->phaser max-force)
                               (clj->phaser world-pivot)))))

(defn create-rotational-spring
  "Creates a rotational spring, connecting two bodies. A spring can have a resting length, a stiffness and damping.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body-a (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - First connected body.
    * body-b (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - Second connected body.
    * rest-angle (number) {optional} - The relative angle of bodies at which the spring is at rest. If not given, it's set to the current relative angle between the bodies.
    * stiffness (number) {optional} - Stiffness of the spring. A number >= 0.
    * damping (number) {optional} - Damping of the spring. A number >= 0.

  Returns:  Phaser.Physics.P2.RotationalSpring - The spring"
  ([p2 body-a body-b]
   (phaser->clj
    (.createRotationalSpring p2
                             (clj->phaser body-a)
                             (clj->phaser body-b))))
  ([p2 body-a body-b rest-angle]
   (phaser->clj
    (.createRotationalSpring p2
                             (clj->phaser body-a)
                             (clj->phaser body-b)
                             (clj->phaser rest-angle))))
  ([p2 body-a body-b rest-angle stiffness]
   (phaser->clj
    (.createRotationalSpring p2
                             (clj->phaser body-a)
                             (clj->phaser body-b)
                             (clj->phaser rest-angle)
                             (clj->phaser stiffness))))
  ([p2 body-a body-b rest-angle stiffness damping]
   (phaser->clj
    (.createRotationalSpring p2
                             (clj->phaser body-a)
                             (clj->phaser body-b)
                             (clj->phaser rest-angle)
                             (clj->phaser stiffness)
                             (clj->phaser damping)))))

(defn create-spring
  "Creates a linear spring, connecting two bodies. A spring can have a resting length, a stiffness and damping.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body-a (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - First connected body.
    * body-b (Phaser.Sprite | Phaser.Physics.P2.Body | p2.Body) - Second connected body.
    * rest-length (number) {optional} - Rest length of the spring. A number > 0.
    * stiffness (number) {optional} - Stiffness of the spring. A number >= 0.
    * damping (number) {optional} - Damping of the spring. A number >= 0.
    * world-a (Array) {optional} - Where to hook the spring to body A in world coordinates. This value is an array by 2 elements, x and y, i.e: [32, 32].
    * world-b (Array) {optional} - Where to hook the spring to body B in world coordinates. This value is an array by 2 elements, x and y, i.e: [32, 32].
    * local-a (Array) {optional} - Where to hook the spring to body A in local body coordinates. This value is an array by 2 elements, x and y, i.e: [32, 32].
    * local-b (Array) {optional} - Where to hook the spring to body B in local body coordinates. This value is an array by 2 elements, x and y, i.e: [32, 32].

  Returns:  Phaser.Physics.P2.Spring - The spring"
  ([p2 body-a body-b]
   (phaser->clj
    (.createSpring p2
                   (clj->phaser body-a)
                   (clj->phaser body-b))))
  ([p2 body-a body-b rest-length]
   (phaser->clj
    (.createSpring p2
                   (clj->phaser body-a)
                   (clj->phaser body-b)
                   (clj->phaser rest-length))))
  ([p2 body-a body-b rest-length stiffness]
   (phaser->clj
    (.createSpring p2
                   (clj->phaser body-a)
                   (clj->phaser body-b)
                   (clj->phaser rest-length)
                   (clj->phaser stiffness))))
  ([p2 body-a body-b rest-length stiffness damping]
   (phaser->clj
    (.createSpring p2
                   (clj->phaser body-a)
                   (clj->phaser body-b)
                   (clj->phaser rest-length)
                   (clj->phaser stiffness)
                   (clj->phaser damping))))
  ([p2 body-a body-b rest-length stiffness damping world-a]
   (phaser->clj
    (.createSpring p2
                   (clj->phaser body-a)
                   (clj->phaser body-b)
                   (clj->phaser rest-length)
                   (clj->phaser stiffness)
                   (clj->phaser damping)
                   (clj->phaser world-a))))
  ([p2 body-a body-b rest-length stiffness damping world-a world-b]
   (phaser->clj
    (.createSpring p2
                   (clj->phaser body-a)
                   (clj->phaser body-b)
                   (clj->phaser rest-length)
                   (clj->phaser stiffness)
                   (clj->phaser damping)
                   (clj->phaser world-a)
                   (clj->phaser world-b))))
  ([p2 body-a body-b rest-length stiffness damping world-a world-b local-a]
   (phaser->clj
    (.createSpring p2
                   (clj->phaser body-a)
                   (clj->phaser body-b)
                   (clj->phaser rest-length)
                   (clj->phaser stiffness)
                   (clj->phaser damping)
                   (clj->phaser world-a)
                   (clj->phaser world-b)
                   (clj->phaser local-a))))
  ([p2 body-a body-b rest-length stiffness damping world-a world-b local-a local-b]
   (phaser->clj
    (.createSpring p2
                   (clj->phaser body-a)
                   (clj->phaser body-b)
                   (clj->phaser rest-length)
                   (clj->phaser stiffness)
                   (clj->phaser damping)
                   (clj->phaser world-a)
                   (clj->phaser world-b)
                   (clj->phaser local-a)
                   (clj->phaser local-b)))))

(defn destroy
  "Clears all bodies from the simulation and unlinks World from Game. Should only be called on game shutdown. Call `clear` on a State change."
  ([p2]
   (phaser->clj
    (.destroy p2))))

(defn enable
  "This will create a P2 Physics body on the given game object or array of game objects.
  A game object can only have 1 physics body active at any one time, and it can't be changed until the object is destroyed.
  Note: When the game object is enabled for P2 physics it has its anchor x/y set to 0.5 so it becomes centered.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * object (object | array | Phaser.Group) - The game object to create the physics body on. Can also be an array or Group of objects, a body will be created on every child that has a `body` property.
    * debug (boolean) {optional} - Create a debug object to go with this body?
    * children (boolean) {optional} - Should a body be created on all children of this object? If true it will recurse down the display list as far as it can go."
  ([p2 object]
   (phaser->clj
    (.enable p2
             (clj->phaser object))))
  ([p2 object debug]
   (phaser->clj
    (.enable p2
             (clj->phaser object)
             (clj->phaser debug))))
  ([p2 object debug children]
   (phaser->clj
    (.enable p2
             (clj->phaser object)
             (clj->phaser debug)
             (clj->phaser children)))))

(defn enable-body
  "Creates a P2 Physics body on the given game object.
  A game object can only have 1 physics body active at any one time, and it can't be changed until the body is nulled.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * object (object) - The game object to create the physics body on. A body will only be created if this object has a null `body` property.
    * debug (boolean) - Create a debug object to go with this body?"
  ([p2 object debug]
   (phaser->clj
    (.enableBody p2
                 (clj->phaser object)
                 (clj->phaser debug)))))

(defn end-contact-handler
  "Handles a p2 end contact event.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * event (object) - The event data."
  ([p2 event]
   (phaser->clj
    (.endContactHandler p2
                        (clj->phaser event)))))

(defn get-bodies
  "Populates and returns an array with references to of all current Bodies in the world.

  Returns:  array.<Phaser.Physics.P2.Body> - An array containing all current Bodies in the world."
  ([p2]
   (phaser->clj
    (.getBodies p2))))

(defn get-body
  "Checks the given object to see if it has a p2.Body and if so returns it.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * object (object) - The object to check for a p2.Body on.

  Returns:  p2.Body - The p2.Body, or null if not found."
  ([p2 object]
   (phaser->clj
    (.getBody p2
              (clj->phaser object)))))

(defn get-constraints
  "Populates and returns an array of all current Constraints in the world.
  You will get an array of p2 constraints back. This can be of mixed types, for example the array may contain
  PrismaticConstraints, RevoluteConstraints or any other valid p2 constraint type.

  Returns:  array.<Phaser.Physics.P2.Constraint> - An array containing all current Constraints in the world."
  ([p2]
   (phaser->clj
    (.getConstraints p2))))

(defn get-contact-material
  "Gets a Contact Material based on the two given Materials.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * material-a (Phaser.Physics.P2.Material) - The first Material to search for.
    * material-b (Phaser.Physics.P2.Material) - The second Material to search for.

  Returns:  [Phaser.Physics.P2.ContactMaterial | boolean] - The Contact Material or false if none was found matching the Materials given."
  ([p2 material-a material-b]
   (phaser->clj
    (.getContactMaterial p2
                         (clj->phaser material-a)
                         (clj->phaser material-b)))))

(defn get-springs
  "Populates and returns an array of all current Springs in the world.

  Returns:  array.<Phaser.Physics.P2.Spring> - An array containing all current Springs in the world."
  ([p2]
   (phaser->clj
    (.getSprings p2))))

(defn hit-test
  "Test if a world point overlaps bodies. You will get an array of actual P2 bodies back. You can find out which Sprite a Body belongs to
  (if any) by checking the Body.parent.sprite property. Body.parent is a Phaser.Physics.P2.Body property.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * world-point (Phaser.Point) - Point to use for intersection tests. The points values must be in world (pixel) coordinates.
    * bodies (Array.<(Phaser.Physics.P2.Body|Phaser.Sprite|p2.Body)>) {optional} - A list of objects to check for intersection. If not given it will check Phaser.Physics.P2.world.bodies (i.e. all world bodies)
    * precision (number) {optional} - Used for matching against particles and lines. Adds some margin to these infinitesimal objects.
    * filter-static (boolean) {optional} - If true all Static objects will be removed from the results array.

  Returns:  Array - Array of bodies that overlap the point."
  ([p2 world-point]
   (phaser->clj
    (.hitTest p2
              (clj->phaser world-point))))
  ([p2 world-point bodies]
   (phaser->clj
    (.hitTest p2
              (clj->phaser world-point)
              (clj->phaser bodies))))
  ([p2 world-point bodies precision]
   (phaser->clj
    (.hitTest p2
              (clj->phaser world-point)
              (clj->phaser bodies)
              (clj->phaser precision))))
  ([p2 world-point bodies precision filter-static]
   (phaser->clj
    (.hitTest p2
              (clj->phaser world-point)
              (clj->phaser bodies)
              (clj->phaser precision)
              (clj->phaser filter-static)))))

(defn mpx
  "Convert p2 physics value (meters) to pixel scale.
  By default Phaser uses a scale of 20px per meter.
  If you need to modify this you can over-ride these functions via the Physics Configuration object.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * v (number) - The value to convert.

  Returns:  number - The scaled value."
  ([p2 v]
   (phaser->clj
    (.mpx p2
          (clj->phaser v)))))

(defn mpxi
  "Convert p2 physics value (meters) to pixel scale and inverses it.
  By default Phaser uses a scale of 20px per meter.
  If you need to modify this you can over-ride these functions via the Physics Configuration object.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * v (number) - The value to convert.

  Returns:  number - The scaled value."
  ([p2 v]
   (phaser->clj
    (.mpxi p2
           (clj->phaser v)))))

(defn pause
  "Pauses the P2 World independent of the game pause state."
  ([p2]
   (phaser->clj
    (.pause p2))))

(defn pre-update
  "Called at the start of the core update loop. Purges flagged bodies from the world."
  ([p2]
   (phaser->clj
    (.preUpdate p2))))

(defn pxm
  "Convert pixel value to p2 physics scale (meters).
  By default Phaser uses a scale of 20px per meter.
  If you need to modify this you can over-ride these functions via the Physics Configuration object.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * v (number) - The value to convert.

  Returns:  number - The scaled value."
  ([p2 v]
   (phaser->clj
    (.pxm p2
          (clj->phaser v)))))

(defn pxmi
  "Convert pixel value to p2 physics scale (meters) and inverses it.
  By default Phaser uses a scale of 20px per meter.
  If you need to modify this you can over-ride these functions via the Physics Configuration object.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * v (number) - The value to convert.

  Returns:  number - The scaled value."
  ([p2 v]
   (phaser->clj
    (.pxmi p2
           (clj->phaser v)))))

(defn remove-body
  "Removes a body from the world. This will silently fail if the body wasn't part of the world to begin with.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body (Phaser.Physics.P2.Body) - The Body to remove from the World.

  Returns:  Phaser.Physics.P2.Body - The Body that was removed."
  ([p2 body]
   (phaser->clj
    (.removeBody p2
                 (clj->phaser body)))))

(defn remove-body-next-step
  "This will add a P2 Physics body into the removal list for the next step.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * body (Phaser.Physics.P2.Body) - The body to remove at the start of the next step."
  ([p2 body]
   (phaser->clj
    (.removeBodyNextStep p2
                         (clj->phaser body)))))

(defn remove-constraint
  "Removes a Constraint from the world.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * constraint (Phaser.Physics.P2.Constraint) - The Constraint to be removed from the World.

  Returns:  Phaser.Physics.P2.Constraint - The Constraint that was removed."
  ([p2 constraint]
   (phaser->clj
    (.removeConstraint p2
                       (clj->phaser constraint)))))

(defn remove-contact-material
  "Removes a Contact Material from the world.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * material (Phaser.Physics.P2.ContactMaterial) - The Contact Material to be removed from the World.

  Returns:  Phaser.Physics.P2.ContactMaterial - The Contact Material that was removed."
  ([p2 material]
   (phaser->clj
    (.removeContactMaterial p2
                            (clj->phaser material)))))

(defn remove-spring
  "Removes a Spring from the world.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * spring (Phaser.Physics.P2.Spring) - The Spring to remove from the World.

  Returns:  Phaser.Physics.P2.Spring - The Spring that was removed."
  ([p2 spring]
   (phaser->clj
    (.removeSpring p2
                   (clj->phaser spring)))))

(defn reset
  "Called by Phaser.Physics when a State swap occurs.
  Starts the begin and end Contact listeners again."
  ([p2]
   (phaser->clj
    (.reset p2))))

(defn resume
  "Resumes a paused P2 World."
  ([p2]
   (phaser->clj
    (.resume p2))))

(defn set-bounds
  "Sets the bounds of the Physics world to match the given world pixel dimensions.
  You can optionally set which 'walls' to create: left, right, top or bottom.
  If none of the walls are given it will default to use the walls settings it had previously.
  I.e. if you previously told it to not have the left or right walls, and you then adjust the world size
  the newly created bounds will also not have the left and right walls.
  Explicitly state them in the parameters to override this.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * x (number) - The x coordinate of the top-left corner of the bounds.
    * y (number) - The y coordinate of the top-left corner of the bounds.
    * width (number) - The width of the bounds.
    * height (number) - The height of the bounds.
    * left (boolean) {optional} - If true will create the left bounds wall.
    * right (boolean) {optional} - If true will create the right bounds wall.
    * top (boolean) {optional} - If true will create the top bounds wall.
    * bottom (boolean) {optional} - If true will create the bottom bounds wall.
    * set-collision-group (boolean) {optional} - If true the Bounds will be set to use its own Collision Group."
  ([p2 x y width height]
   (phaser->clj
    (.setBounds p2
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser width)
                (clj->phaser height))))
  ([p2 x y width height left]
   (phaser->clj
    (.setBounds p2
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser width)
                (clj->phaser height)
                (clj->phaser left))))
  ([p2 x y width height left right]
   (phaser->clj
    (.setBounds p2
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser width)
                (clj->phaser height)
                (clj->phaser left)
                (clj->phaser right))))
  ([p2 x y width height left right top]
   (phaser->clj
    (.setBounds p2
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser width)
                (clj->phaser height)
                (clj->phaser left)
                (clj->phaser right)
                (clj->phaser top))))
  ([p2 x y width height left right top bottom]
   (phaser->clj
    (.setBounds p2
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser width)
                (clj->phaser height)
                (clj->phaser left)
                (clj->phaser right)
                (clj->phaser top)
                (clj->phaser bottom))))
  ([p2 x y width height left right top bottom set-collision-group]
   (phaser->clj
    (.setBounds p2
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser width)
                (clj->phaser height)
                (clj->phaser left)
                (clj->phaser right)
                (clj->phaser top)
                (clj->phaser bottom)
                (clj->phaser set-collision-group)))))

(defn set-impact-events
  "Impact event handling is disabled by default. Enable it before any impact events will be dispatched.
  In a busy world hundreds of impact events can be generated every step, so only enable this if you cannot do what you need via beginContact or collision masks.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * state (boolean) - Set to true to enable impact events, or false to disable."
  ([p2 state]
   (phaser->clj
    (.setImpactEvents p2
                      (clj->phaser state)))))

(defn set-material
  "Sets the given Material against all Shapes owned by all the Bodies in the given array.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * material (Phaser.Physics.P2.Material) - The Material to be applied to the given Bodies.
    * bodies (array.<Phaser.Physics.P2.Body>) - An Array of Body objects that the given Material will be set on."
  ([p2 material bodies]
   (phaser->clj
    (.setMaterial p2
                  (clj->phaser material)
                  (clj->phaser bodies)))))

(defn set-post-broadphase-callback
  "Sets a callback to be fired after the Broadphase has collected collision pairs in the world.
  Just because a pair exists it doesn't mean they *will* collide, just that they potentially could do.
  If your calback returns `false` the pair will be removed from the narrowphase. This will stop them testing for collision this step.
  Returning `true` from the callback will ensure they are checked in the narrowphase.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * callback (function) - The callback that will receive the postBroadphase event data. It must return a boolean. Set to null to disable an existing callback.
    * context (object) - The context under which the callback will be fired."
  ([p2 callback context]
   (phaser->clj
    (.setPostBroadphaseCallback p2
                                (clj->phaser callback)
                                (clj->phaser context)))))

(defn to-json
  "Converts the current world into a JSON object.

  Returns:  object - A JSON representation of the world."
  ([p2]
   (phaser->clj
    (.toJSON p2))))

(defn update
  "Internal P2 update loop."
  ([p2]
   (phaser->clj
    (.update p2))))

(defn update-bounds-collision-group
  "By default the World will be set to collide everything with everything. The bounds of the world is a Body with 4 shapes, one for each face.
  If you start to use your own collision groups then your objects will no longer collide with the bounds.
  To fix this you need to adjust the bounds to use its own collision group first BEFORE changing your Sprites collision group.

  Parameters:
    * p2 (Phaser.Physics.P2) - Targeted instance for method
    * set-collision-group (boolean) {optional} - If true the Bounds will be set to use its own Collision Group."
  ([p2]
   (phaser->clj
    (.updateBoundsCollisionGroup p2)))
  ([p2 set-collision-group]
   (phaser->clj
    (.updateBoundsCollisionGroup p2
                                 (clj->phaser set-collision-group)))))