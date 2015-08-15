(ns phzr.physics.p2.body
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [reverse]))

(defn ->Body
  "The Physics Body is typically linked to a single Sprite and defines properties that determine how the physics body is simulated.
  These properties affect how the body reacts to forces, what forces it generates on itself (to simulate friction), and how it reacts to collisions in the scene.
  In most cases, the properties are used to simulate physical effects. Each body also has its own property values that determine exactly how it reacts to forces and collisions in the scene.
  By default a single Rectangle shape is added to the Body that matches the dimensions of the parent Sprite. See addShape, removeShape, clearShapes to add extra shapes around the Body.
  Note: When bound to a Sprite to avoid single-pixel jitters on mobile devices we strongly recommend using Sprite sizes that are even on both axis, i.e. 128x128 not 127x127.
  Note: When a game object is given a P2 body it has its anchor x/y set to 0.5, so it becomes centered.

  Parameters:
    * game (Phaser.Game) - Game reference to the currently running game.
    * sprite (Phaser.Sprite) {optional} - The Sprite object this physics body belongs to.
    * x (number) {optional} - The x coordinate of this Body.
    * y (number) {optional} - The y coordinate of this Body.
    * mass (number) {optional} - The default mass of this Body (0 = static)."
  ([game]
   (js/Phaser.Physics.P2.Body. (clj->phaser game)))
  ([game sprite]
   (js/Phaser.Physics.P2.Body. (clj->phaser game)
                               (clj->phaser sprite)))
  ([game sprite x]
   (js/Phaser.Physics.P2.Body. (clj->phaser game)
                               (clj->phaser sprite)
                               (clj->phaser x)))
  ([game sprite x y]
   (js/Phaser.Physics.P2.Body. (clj->phaser game)
                               (clj->phaser sprite)
                               (clj->phaser x)
                               (clj->phaser y)))
  ([game sprite x y mass]
   (js/Phaser.Physics.P2.Body. (clj->phaser game)
                               (clj->phaser sprite)
                               (clj->phaser x)
                               (clj->phaser y)
                               (clj->phaser mass))))

(defn add-capsule
  "Adds a Capsule shape to this Body.
  You can control the offset from the center of the body and the rotation.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * length (number) - The distance between the end points in pixels.
    * radius (number) - Radius of the capsule in pixels.
    * offset-x (number) {optional} - Local horizontal offset of the shape relative to the body center of mass.
    * offset-y (number) {optional} - Local vertical offset of the shape relative to the body center of mass.
    * rotation (number) {optional} - Local rotation of the shape relative to the body center of mass, specified in radians.

  Returns:  p2.Capsule - The Capsule shape that was added to the Body."
  ([body length radius]
   (phaser->clj
    (.addCapsule body
                 (clj->phaser length)
                 (clj->phaser radius))))
  ([body length radius offset-x]
   (phaser->clj
    (.addCapsule body
                 (clj->phaser length)
                 (clj->phaser radius)
                 (clj->phaser offset-x))))
  ([body length radius offset-x offset-y]
   (phaser->clj
    (.addCapsule body
                 (clj->phaser length)
                 (clj->phaser radius)
                 (clj->phaser offset-x)
                 (clj->phaser offset-y))))
  ([body length radius offset-x offset-y rotation]
   (phaser->clj
    (.addCapsule body
                 (clj->phaser length)
                 (clj->phaser radius)
                 (clj->phaser offset-x)
                 (clj->phaser offset-y)
                 (clj->phaser rotation)))))

(defn add-circle
  "Adds a Circle shape to this Body. You can control the offset from the center of the body and the rotation.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * radius (number) - The radius of this circle (in pixels)
    * offset-x (number) {optional} - Local horizontal offset of the shape relative to the body center of mass.
    * offset-y (number) {optional} - Local vertical offset of the shape relative to the body center of mass.
    * rotation (number) {optional} - Local rotation of the shape relative to the body center of mass, specified in radians.

  Returns:  p2.Circle - The Circle shape that was added to the Body."
  ([body radius]
   (phaser->clj
    (.addCircle body
                (clj->phaser radius))))
  ([body radius offset-x]
   (phaser->clj
    (.addCircle body
                (clj->phaser radius)
                (clj->phaser offset-x))))
  ([body radius offset-x offset-y]
   (phaser->clj
    (.addCircle body
                (clj->phaser radius)
                (clj->phaser offset-x)
                (clj->phaser offset-y))))
  ([body radius offset-x offset-y rotation]
   (phaser->clj
    (.addCircle body
                (clj->phaser radius)
                (clj->phaser offset-x)
                (clj->phaser offset-y)
                (clj->phaser rotation)))))

(defn add-fixture
  "Add a polygon fixture. This is used during #loadPolygon.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * fixture-data (string) - The data for the fixture. It contains: isSensor, filter (collision) and the actual polygon shapes.

  Returns:  array - An array containing the generated shapes for the given polygon."
  ([body fixture-data]
   (phaser->clj
    (.addFixture body
                 (clj->phaser fixture-data)))))

(defn add-line
  "Adds a Line shape to this Body.
  The line shape is along the x direction, and stretches from [-length/2, 0] to [length/2,0].
  You can control the offset from the center of the body and the rotation.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * length (number) - The length of this line (in pixels)
    * offset-x (number) {optional} - Local horizontal offset of the shape relative to the body center of mass.
    * offset-y (number) {optional} - Local vertical offset of the shape relative to the body center of mass.
    * rotation (number) {optional} - Local rotation of the shape relative to the body center of mass, specified in radians.

  Returns:  p2.Line - The Line shape that was added to the Body."
  ([body length]
   (phaser->clj
    (.addLine body
              (clj->phaser length))))
  ([body length offset-x]
   (phaser->clj
    (.addLine body
              (clj->phaser length)
              (clj->phaser offset-x))))
  ([body length offset-x offset-y]
   (phaser->clj
    (.addLine body
              (clj->phaser length)
              (clj->phaser offset-x)
              (clj->phaser offset-y))))
  ([body length offset-x offset-y rotation]
   (phaser->clj
    (.addLine body
              (clj->phaser length)
              (clj->phaser offset-x)
              (clj->phaser offset-y)
              (clj->phaser rotation)))))

(defn add-particle
  "Adds a Particle shape to this Body. You can control the offset from the center of the body and the rotation.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * offset-x (number) {optional} - Local horizontal offset of the shape relative to the body center of mass.
    * offset-y (number) {optional} - Local vertical offset of the shape relative to the body center of mass.
    * rotation (number) {optional} - Local rotation of the shape relative to the body center of mass, specified in radians.

  Returns:  p2.Particle - The Particle shape that was added to the Body."
  ([body]
   (phaser->clj
    (.addParticle body)))
  ([body offset-x]
   (phaser->clj
    (.addParticle body
                  (clj->phaser offset-x))))
  ([body offset-x offset-y]
   (phaser->clj
    (.addParticle body
                  (clj->phaser offset-x)
                  (clj->phaser offset-y))))
  ([body offset-x offset-y rotation]
   (phaser->clj
    (.addParticle body
                  (clj->phaser offset-x)
                  (clj->phaser offset-y)
                  (clj->phaser rotation)))))

(defn add-phaser-polygon
  "Reads the shape data from a physics data file stored in the Game.Cache and adds it as a polygon to this Body.
  The shape data format is based on the custom phaser export in.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * key (string) - The key of the Physics Data file as stored in Game.Cache.
    * object (string) - The key of the object within the Physics data file that you wish to load the shape data from."
  ([body key object]
   (phaser->clj
    (.addPhaserPolygon body
                       (clj->phaser key)
                       (clj->phaser object)))))

(defn add-plane
  "Adds a Plane shape to this Body. The plane is facing in the Y direction. You can control the offset from the center of the body and the rotation.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * offset-x (number) {optional} - Local horizontal offset of the shape relative to the body center of mass.
    * offset-y (number) {optional} - Local vertical offset of the shape relative to the body center of mass.
    * rotation (number) {optional} - Local rotation of the shape relative to the body center of mass, specified in radians.

  Returns:  p2.Plane - The Plane shape that was added to the Body."
  ([body]
   (phaser->clj
    (.addPlane body)))
  ([body offset-x]
   (phaser->clj
    (.addPlane body
               (clj->phaser offset-x))))
  ([body offset-x offset-y]
   (phaser->clj
    (.addPlane body
               (clj->phaser offset-x)
               (clj->phaser offset-y))))
  ([body offset-x offset-y rotation]
   (phaser->clj
    (.addPlane body
               (clj->phaser offset-x)
               (clj->phaser offset-y)
               (clj->phaser rotation)))))

(defn add-polygon
  "Reads a polygon shape path, and assembles convex shapes from that and puts them at proper offset points. The shape must be simple and without holes.
  This function expects the x.y values to be given in pixels. If you want to provide them at p2 world scales then call Body.data.fromPolygon directly.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * options (object) {optional} - An object containing the build options:
    * points (Array.<number> | number) {optional} - An array of 2d vectors that form the convex or concave polygon.
                                      Either [[0,0], [0,1],...] or a flat array of numbers that will be interpreted as [x,y, x,y, ...],
                                      or the arguments passed can be flat x,y values e.g. `setPolygon(options, x,y, x,y, x,y, ...)` where `x` and `y` are numbers.

  Returns:  boolean - True on success, else false."
  ([body]
   (phaser->clj
    (.addPolygon body)))
  ([body options]
   (phaser->clj
    (.addPolygon body
                 (clj->phaser options))))
  ([body options points]
   (phaser->clj
    (.addPolygon body
                 (clj->phaser options)
                 (clj->phaser points)))))

(defn add-rectangle
  "Adds a Rectangle shape to this Body. You can control the offset from the center of the body and the rotation.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * width (number) - The width of the rectangle in pixels.
    * height (number) - The height of the rectangle in pixels.
    * offset-x (number) {optional} - Local horizontal offset of the shape relative to the body center of mass.
    * offset-y (number) {optional} - Local vertical offset of the shape relative to the body center of mass.
    * rotation (number) {optional} - Local rotation of the shape relative to the body center of mass, specified in radians.

  Returns:  p2.Box - The shape that was added to the Body."
  ([body width height]
   (phaser->clj
    (.addRectangle body
                   (clj->phaser width)
                   (clj->phaser height))))
  ([body width height offset-x]
   (phaser->clj
    (.addRectangle body
                   (clj->phaser width)
                   (clj->phaser height)
                   (clj->phaser offset-x))))
  ([body width height offset-x offset-y]
   (phaser->clj
    (.addRectangle body
                   (clj->phaser width)
                   (clj->phaser height)
                   (clj->phaser offset-x)
                   (clj->phaser offset-y))))
  ([body width height offset-x offset-y rotation]
   (phaser->clj
    (.addRectangle body
                   (clj->phaser width)
                   (clj->phaser height)
                   (clj->phaser offset-x)
                   (clj->phaser offset-y)
                   (clj->phaser rotation)))))

(defn add-shape
  "Add a shape to the body. You can pass a local transform when adding a shape, so that the shape gets an offset and an angle relative to the body center of mass.
  Will automatically update the mass properties and bounding radius.
  If this Body had a previously set Collision Group you will need to re-apply it to the new Shape this creates.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * shape (p2.Shape) - The shape to add to the body.
    * offset-x (number) {optional} - Local horizontal offset of the shape relative to the body center of mass.
    * offset-y (number) {optional} - Local vertical offset of the shape relative to the body center of mass.
    * rotation (number) {optional} - Local rotation of the shape relative to the body center of mass, specified in radians.

  Returns:  p2.Shape - The shape that was added to the body."
  ([body shape]
   (phaser->clj
    (.addShape body
               (clj->phaser shape))))
  ([body shape offset-x]
   (phaser->clj
    (.addShape body
               (clj->phaser shape)
               (clj->phaser offset-x))))
  ([body shape offset-x offset-y]
   (phaser->clj
    (.addShape body
               (clj->phaser shape)
               (clj->phaser offset-x)
               (clj->phaser offset-y))))
  ([body shape offset-x offset-y rotation]
   (phaser->clj
    (.addShape body
               (clj->phaser shape)
               (clj->phaser offset-x)
               (clj->phaser offset-y)
               (clj->phaser rotation)))))

(defn add-to-world
  "Adds this physics body to the world."
  ([body]
   (phaser->clj
    (.addToWorld body))))

(defn adjust-center-of-mass
  "Moves the shape offsets so their center of mass becomes the body center of mass."
  ([body]
   (phaser->clj
    (.adjustCenterOfMass body))))

(defn apply-damping
  "Apply damping, see http://code.google.com/p/bullet/issues/detail?id=74 for details.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * dt (number) - Current time step."
  ([body dt]
   (phaser->clj
    (.applyDamping body
                   (clj->phaser dt)))))

(defn apply-force
  "Apply force to a world point. This could for example be a point on the RigidBody surface. Applying force this way will add to Body.force and Body.angularForce.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * force (Float32Array | Array) - The force vector to add.
    * world-x (number) - The world x point to apply the force on.
    * world-y (number) - The world y point to apply the force on."
  ([body force world-x world-y]
   (phaser->clj
    (.applyForce body
                 (clj->phaser force)
                 (clj->phaser world-x)
                 (clj->phaser world-y)))))

(defn apply-impulse
  "Apply impulse to a point relative to the body.
  This could for example be a point on the Body surface. An impulse is a force added to a body during a short 
  period of time (impulse = force * time). Impulses will be added to Body.velocity and Body.angularVelocity.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * impulse (Float32Array | Array) - The impulse vector to add, oriented in world space.
    * world-x (number) - A point relative to the body in world space. If not given, it is set to zero and all of the impulse will be exerted on the center of mass.
    * world-y (number) - A point relative to the body in world space. If not given, it is set to zero and all of the impulse will be exerted on the center of mass."
  ([body impulse world-x world-y]
   (phaser->clj
    (.applyImpulse body
                   (clj->phaser impulse)
                   (clj->phaser world-x)
                   (clj->phaser world-y)))))

(defn apply-impulse-local
  "Apply impulse to a point local to the body.
  This could for example be a point on the Body surface. An impulse is a force added to a body during a short 
  period of time (impulse = force * time). Impulses will be added to Body.velocity and Body.angularVelocity.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * impulse (Float32Array | Array) - The impulse vector to add, oriented in world space.
    * local-x (number) - A local point on the body.
    * local-y (number) - A local point on the body."
  ([body impulse local-x local-y]
   (phaser->clj
    (.applyImpulseLocal body
                        (clj->phaser impulse)
                        (clj->phaser local-x)
                        (clj->phaser local-y)))))

(defn clear-collision
  "Clears the collision data from the shapes in this Body. Optionally clears Group and/or Mask.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * clear-group (boolean) {optional} - Clear the collisionGroup value from the shape/s?
    * clear-mask (boolean) {optional} - Clear the collisionMask value from the shape/s?
    * shape (p2.Shape) {optional} - An optional Shape. If not provided the collision data will be cleared from all Shapes in this Body."
  ([body]
   (phaser->clj
    (.clearCollision body)))
  ([body clear-group]
   (phaser->clj
    (.clearCollision body
                     (clj->phaser clear-group))))
  ([body clear-group clear-mask]
   (phaser->clj
    (.clearCollision body
                     (clj->phaser clear-group)
                     (clj->phaser clear-mask))))
  ([body clear-group clear-mask shape]
   (phaser->clj
    (.clearCollision body
                     (clj->phaser clear-group)
                     (clj->phaser clear-mask)
                     (clj->phaser shape)))))

(defn clear-shapes
  "Removes all Shapes from this Body."
  ([body]
   (phaser->clj
    (.clearShapes body))))

(defn collides
  "Adds the given CollisionGroup, or array of CollisionGroups, to the list of groups that this body will collide with and updates the collision masks.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * group (Phaser.Physics.CollisionGroup | array) - The Collision Group or Array of Collision Groups that this Bodies shapes will collide with.
    * callback (function) {optional} - Optional callback that will be triggered when this Body impacts with the given Group.
    * callback-context (object) {optional} - The context under which the callback will be called.
    * shape (p2.Shape) {optional} - An optional Shape. If not provided the collision mask will be added to all Shapes in this Body."
  ([body group]
   (phaser->clj
    (.collides body
               (clj->phaser group))))
  ([body group callback]
   (phaser->clj
    (.collides body
               (clj->phaser group)
               (clj->phaser callback))))
  ([body group callback callback-context]
   (phaser->clj
    (.collides body
               (clj->phaser group)
               (clj->phaser callback)
               (clj->phaser callback-context))))
  ([body group callback callback-context shape]
   (phaser->clj
    (.collides body
               (clj->phaser group)
               (clj->phaser callback)
               (clj->phaser callback-context)
               (clj->phaser shape)))))

(defn create-body-callback
  "Sets a callback to be fired any time a shape in this Body impacts with a shape in the given Body. The impact test is performed against body.id values.
  The callback will be sent 4 parameters: This body, the body that impacted, the Shape in this body and the shape in the impacting body.
  Note that the impact event happens after collision resolution, so it cannot be used to prevent a collision from happening.
  It also happens mid-step. So do not destroy a Body during this callback, instead set safeDestroy to true so it will be killed on the next preUpdate.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * object (Phaser.Sprite | Phaser.TileSprite | Phaser.Physics.P2.Body | p2.Body) - The object to send impact events for.
    * callback (function) - The callback to fire on impact. Set to null to clear a previously set callback.
    * callback-context (object) - The context under which the callback will fire."
  ([body object callback callback-context]
   (phaser->clj
    (.createBodyCallback body
                         (clj->phaser object)
                         (clj->phaser callback)
                         (clj->phaser callback-context)))))

(defn create-group-callback
  "Sets a callback to be fired any time this Body impacts with the given Group. The impact test is performed against shape.collisionGroup values.
  The callback will be sent 4 parameters: This body, the body that impacted, the Shape in this body and the shape in the impacting body.
  This callback will only fire if this Body has been assigned a collision group.
  Note that the impact event happens after collision resolution, so it cannot be used to prevent a collision from happening.
  It also happens mid-step. So do not destroy a Body during this callback, instead set safeDestroy to true so it will be killed on the next preUpdate.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * group (Phaser.Physics.CollisionGroup) - The Group to send impact events for.
    * callback (function) - The callback to fire on impact. Set to null to clear a previously set callback.
    * callback-context (object) - The context under which the callback will fire."
  ([body group callback callback-context]
   (phaser->clj
    (.createGroupCallback body
                          (clj->phaser group)
                          (clj->phaser callback)
                          (clj->phaser callback-context)))))

(defn destroy
  "Destroys this Body and all references it holds to other objects."
  ([body]
   (phaser->clj
    (.destroy body))))

(defn get-collision-mask
  "Gets the collision bitmask from the groups this body collides with.

  Returns:  number - The bitmask."
  ([body]
   (phaser->clj
    (.getCollisionMask body))))

(defn get-velocity-at-point
  "Gets the velocity of a point in the body.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * result (Array) - A vector to store the result in.
    * relative-point (Array) - A world oriented vector, indicating the position of the point to get the velocity from.

  Returns:  Array - The result vector."
  ([body result relative-point]
   (phaser->clj
    (.getVelocityAtPoint body
                         (clj->phaser result)
                         (clj->phaser relative-point)))))

(defn load-polygon
  "Reads the shape data from a physics data file stored in the Game.Cache and adds it as a polygon to this Body.

  As well as reading the data from the Cache you can also pass `null` as the first argument and a
  physics data object as the second. When doing this you must ensure the structure of the object is correct in advance.

  For more details see the format of the Lime / Corona Physics Editor export.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * key (string) - The key of the Physics Data file as stored in Game.Cache. Alternatively set to `null` and pass the 
    data as the 2nd argument.
    * object (string | object) - The key of the object within the Physics data file that you wish to load the shape data from, 
    or if key is null pass the actual physics data object itself as this parameter.

  Returns:  boolean - True on success, else false."
  ([body key object]
   (phaser->clj
    (.loadPolygon body
                  (clj->phaser key)
                  (clj->phaser object)))))

(defn move-backward
  "Moves the Body backwards based on its current angle and the given speed.
  The speed is represented in pixels per second. So a value of 100 would move 100 pixels in 1 second (1000ms).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should move backwards."
  ([body speed]
   (phaser->clj
    (.moveBackward body
                   (clj->phaser speed)))))

(defn move-down
  "If this Body is dynamic then this will move it down by setting its y velocity to the given speed.
  The speed is represented in pixels per second. So a value of 100 would move 100 pixels in 1 second (1000ms).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should move down, in pixels per second."
  ([body speed]
   (phaser->clj
    (.moveDown body
               (clj->phaser speed)))))

(defn move-forward
  "Moves the Body forwards based on its current angle and the given speed.
  The speed is represented in pixels per second. So a value of 100 would move 100 pixels in 1 second (1000ms).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should move forwards."
  ([body speed]
   (phaser->clj
    (.moveForward body
                  (clj->phaser speed)))))

(defn move-left
  "If this Body is dynamic then this will move it to the left by setting its x velocity to the given speed.
  The speed is represented in pixels per second. So a value of 100 would move 100 pixels in 1 second (1000ms).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should move to the left, in pixels per second."
  ([body speed]
   (phaser->clj
    (.moveLeft body
               (clj->phaser speed)))))

(defn move-right
  "If this Body is dynamic then this will move it to the right by setting its x velocity to the given speed.
  The speed is represented in pixels per second. So a value of 100 would move 100 pixels in 1 second (1000ms).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should move to the right, in pixels per second."
  ([body speed]
   (phaser->clj
    (.moveRight body
                (clj->phaser speed)))))

(defn move-up
  "If this Body is dynamic then this will move it up by setting its y velocity to the given speed.
  The speed is represented in pixels per second. So a value of 100 would move 100 pixels in 1 second (1000ms).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should move up, in pixels per second."
  ([body speed]
   (phaser->clj
    (.moveUp body
             (clj->phaser speed)))))

(defn remove-from-world
  "Removes this physics body from the world."
  ([body]
   (phaser->clj
    (.removeFromWorld body))))

(defn remove-shape
  "Remove a shape from the body. Will automatically update the mass properties and bounding radius.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * shape (p2.Circle | p2.Rectangle | p2.Plane | p2.Line | p2.Particle) - The shape to remove from the body.

  Returns:  boolean - True if the shape was found and removed, else false."
  ([body shape]
   (phaser->clj
    (.removeShape body
                  (clj->phaser shape)))))

(defn reset
  "Resets the Body force, velocity (linear and angular) and rotation. Optionally resets damping and mass.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * x (number) - The new x position of the Body.
    * y (number) - The new x position of the Body.
    * reset-damping (boolean) {optional} - Resets the linear and angular damping.
    * reset-mass (boolean) {optional} - Sets the Body mass back to 1."
  ([body x y]
   (phaser->clj
    (.reset body
            (clj->phaser x)
            (clj->phaser y))))
  ([body x y reset-damping]
   (phaser->clj
    (.reset body
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser reset-damping))))
  ([body x y reset-damping reset-mass]
   (phaser->clj
    (.reset body
            (clj->phaser x)
            (clj->phaser y)
            (clj->phaser reset-damping)
            (clj->phaser reset-mass)))))

(defn reverse
  "Applies a force to the Body that causes it to 'thrust' backwards (in reverse), based on its current angle and the given speed.
  The speed is represented in pixels per second. So a value of 100 would move 100 pixels in 1 second (1000ms).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should reverse."
  ([body speed]
   (phaser->clj
    (.reverse body
              (clj->phaser speed)))))

(defn rotate-left
  "This will rotate the Body by the given speed to the left (counter-clockwise).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should rotate."
  ([body speed]
   (phaser->clj
    (.rotateLeft body
                 (clj->phaser speed)))))

(defn rotate-right
  "This will rotate the Body by the given speed to the left (clockwise).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should rotate."
  ([body speed]
   (phaser->clj
    (.rotateRight body
                  (clj->phaser speed)))))

(defn set-circle
  "Clears any previously set shapes. Then creates a new Circle shape and adds it to this Body.
  If this Body had a previously set Collision Group you will need to re-apply it to the new Shape this creates.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * radius (number) - The radius of this circle (in pixels)
    * offset-x (number) {optional} - Local horizontal offset of the shape relative to the body center of mass.
    * offset-y (number) {optional} - Local vertical offset of the shape relative to the body center of mass.
    * rotation (number) {optional} - Local rotation of the shape relative to the body center of mass, specified in radians."
  ([body radius]
   (phaser->clj
    (.setCircle body
                (clj->phaser radius))))
  ([body radius offset-x]
   (phaser->clj
    (.setCircle body
                (clj->phaser radius)
                (clj->phaser offset-x))))
  ([body radius offset-x offset-y]
   (phaser->clj
    (.setCircle body
                (clj->phaser radius)
                (clj->phaser offset-x)
                (clj->phaser offset-y))))
  ([body radius offset-x offset-y rotation]
   (phaser->clj
    (.setCircle body
                (clj->phaser radius)
                (clj->phaser offset-x)
                (clj->phaser offset-y)
                (clj->phaser rotation)))))

(defn set-collision-group
  "Sets the given CollisionGroup to be the collision group for all shapes in this Body, unless a shape is specified.
  This also resets the collisionMask.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * group (Phaser.Physics.CollisionGroup) - The Collision Group that this Bodies shapes will use.
    * shape (p2.Shape) {optional} - An optional Shape. If not provided the collision group will be added to all Shapes in this Body."
  ([body group]
   (phaser->clj
    (.setCollisionGroup body
                        (clj->phaser group))))
  ([body group shape]
   (phaser->clj
    (.setCollisionGroup body
                        (clj->phaser group)
                        (clj->phaser shape)))))

(defn set-material
  "Adds the given Material to all Shapes that belong to this Body.
  If you only wish to apply it to a specific Shape in this Body then provide that as the 2nd parameter.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * material (Phaser.Physics.P2.Material) - The Material that will be applied.
    * shape (p2.Shape) {optional} - An optional Shape. If not provided the Material will be added to all Shapes in this Body."
  ([body material]
   (phaser->clj
    (.setMaterial body
                  (clj->phaser material))))
  ([body material shape]
   (phaser->clj
    (.setMaterial body
                  (clj->phaser material)
                  (clj->phaser shape)))))

(defn set-rectangle
  "Clears any previously set shapes. The creates a new Rectangle shape at the given size and offset, and adds it to this Body.
  If you wish to create a Rectangle to match the size of a Sprite or Image see Body.setRectangleFromSprite.
  If this Body had a previously set Collision Group you will need to re-apply it to the new Shape this creates.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * width (number) {optional} - The width of the rectangle in pixels.
    * height (number) {optional} - The height of the rectangle in pixels.
    * offset-x (number) {optional} - Local horizontal offset of the shape relative to the body center of mass.
    * offset-y (number) {optional} - Local vertical offset of the shape relative to the body center of mass.
    * rotation (number) {optional} - Local rotation of the shape relative to the body center of mass, specified in radians.

  Returns:  p2.Rectangle - The Rectangle shape that was added to the Body."
  ([body]
   (phaser->clj
    (.setRectangle body)))
  ([body width]
   (phaser->clj
    (.setRectangle body
                   (clj->phaser width))))
  ([body width height]
   (phaser->clj
    (.setRectangle body
                   (clj->phaser width)
                   (clj->phaser height))))
  ([body width height offset-x]
   (phaser->clj
    (.setRectangle body
                   (clj->phaser width)
                   (clj->phaser height)
                   (clj->phaser offset-x))))
  ([body width height offset-x offset-y]
   (phaser->clj
    (.setRectangle body
                   (clj->phaser width)
                   (clj->phaser height)
                   (clj->phaser offset-x)
                   (clj->phaser offset-y))))
  ([body width height offset-x offset-y rotation]
   (phaser->clj
    (.setRectangle body
                   (clj->phaser width)
                   (clj->phaser height)
                   (clj->phaser offset-x)
                   (clj->phaser offset-y)
                   (clj->phaser rotation)))))

(defn set-rectangle-from-sprite
  "Clears any previously set shapes.
  Then creates a Rectangle shape sized to match the dimensions and orientation of the Sprite given.
  If no Sprite is given it defaults to using the parent of this Body.
  If this Body had a previously set Collision Group you will need to re-apply it to the new Shape this creates.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * sprite (Phaser.Sprite | Phaser.Image) {optional} - The Sprite on which the Rectangle will get its dimensions.

  Returns:  p2.Rectangle - The Rectangle shape that was added to the Body."
  ([body]
   (phaser->clj
    (.setRectangleFromSprite body)))
  ([body sprite]
   (phaser->clj
    (.setRectangleFromSprite body
                             (clj->phaser sprite)))))

(defn set-zero-damping
  "Sets the Body damping and angularDamping to zero."
  ([body]
   (phaser->clj
    (.setZeroDamping body))))

(defn set-zero-force
  "Sets the force on the body to zero."
  ([body]
   (phaser->clj
    (.setZeroForce body))))

(defn set-zero-rotation
  "If this Body is dynamic then this will zero its angular velocity."
  ([body]
   (phaser->clj
    (.setZeroRotation body))))

(defn set-zero-velocity
  "If this Body is dynamic then this will zero its velocity on both axis."
  ([body]
   (phaser->clj
    (.setZeroVelocity body))))

(defn shape-changed
  "Updates the debug draw if any body shapes change."
  ([body]
   (phaser->clj
    (.shapeChanged body))))

(defn thrust
  "Applies a force to the Body that causes it to 'thrust' forwards, based on its current angle and the given speed.
  The speed is represented in pixels per second. So a value of 100 would move 100 pixels in 1 second (1000ms).

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * speed (number) - The speed at which it should thrust."
  ([body speed]
   (phaser->clj
    (.thrust body
             (clj->phaser speed)))))

(defn to-local-frame
  "Transform a world point to local body frame.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * out (Float32Array | Array) - The vector to store the result in.
    * world-point (Float32Array | Array) - The input world vector."
  ([body out world-point]
   (phaser->clj
    (.toLocalFrame body
                   (clj->phaser out)
                   (clj->phaser world-point)))))

(defn to-world-frame
  "Transform a local point to world frame.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * out (Array) - The vector to store the result in.
    * local-point (Array) - The input local vector."
  ([body out local-point]
   (phaser->clj
    (.toWorldFrame body
                   (clj->phaser out)
                   (clj->phaser local-point)))))

(defn update-collision-mask
  "Updates the collisionMask.

  Parameters:
    * body (Phaser.Physics.P2.Body) - Targeted instance for method
    * shape (p2.Shape) {optional} - An optional Shape. If not provided the collision group will be added to all Shapes in this Body."
  ([body]
   (phaser->clj
    (.updateCollisionMask body)))
  ([body shape]
   (phaser->clj
    (.updateCollisionMask body
                          (clj->phaser shape)))))