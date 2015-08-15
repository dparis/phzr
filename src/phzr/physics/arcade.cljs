(ns phzr.physics.arcade
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [sort]))

(defn ->Arcade
  "The Arcade Physics world. Contains Arcade Physics related collision, overlap and motion methods.

  Parameters:
    * game (Phaser.Game) - reference to the current game instance."
  ([game]
   (js/Phaser.Physics.Arcade. (clj->phaser game))))

(defn accelerate-to-object
  "Sets the acceleration.x/y property on the display object so it will move towards the target at the given speed (in pixels per second sq.)
  You must give a maximum speed value, beyond which the display object won't go any faster.
  Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
  Note: The display object doesn't stop moving once it reaches the destination coordinates.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The display object to move.
    * destination (any) - The display object to move towards. Can be any object but must have visible x/y properties.
    * speed (number) {optional} - The speed it will accelerate in pixels per second.
    * x-speed-max (number) {optional} - The maximum x velocity the display object can reach.
    * y-speed-max (number) {optional} - The maximum y velocity the display object can reach.

  Returns:  number - The angle (in radians) that the object should be visually set to in order to match its new trajectory."
  ([arcade display-object destination]
   (phaser->clj
    (.accelerateToObject arcade
                         (clj->phaser display-object)
                         (clj->phaser destination))))
  ([arcade display-object destination speed]
   (phaser->clj
    (.accelerateToObject arcade
                         (clj->phaser display-object)
                         (clj->phaser destination)
                         (clj->phaser speed))))
  ([arcade display-object destination speed x-speed-max]
   (phaser->clj
    (.accelerateToObject arcade
                         (clj->phaser display-object)
                         (clj->phaser destination)
                         (clj->phaser speed)
                         (clj->phaser x-speed-max))))
  ([arcade display-object destination speed x-speed-max y-speed-max]
   (phaser->clj
    (.accelerateToObject arcade
                         (clj->phaser display-object)
                         (clj->phaser destination)
                         (clj->phaser speed)
                         (clj->phaser x-speed-max)
                         (clj->phaser y-speed-max)))))

(defn accelerate-to-pointer
  "Sets the acceleration.x/y property on the display object so it will move towards the target at the given speed (in pixels per second sq.)
  You must give a maximum speed value, beyond which the display object won't go any faster.
  Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
  Note: The display object doesn't stop moving once it reaches the destination coordinates.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The display object to move.
    * pointer (Phaser.Pointer) {optional} - The pointer to move towards. Defaults to Phaser.Input.activePointer.
    * speed (number) {optional} - The speed it will accelerate in pixels per second.
    * x-speed-max (number) {optional} - The maximum x velocity the display object can reach.
    * y-speed-max (number) {optional} - The maximum y velocity the display object can reach.

  Returns:  number - The angle (in radians) that the object should be visually set to in order to match its new trajectory."
  ([arcade display-object]
   (phaser->clj
    (.accelerateToPointer arcade
                          (clj->phaser display-object))))
  ([arcade display-object pointer]
   (phaser->clj
    (.accelerateToPointer arcade
                          (clj->phaser display-object)
                          (clj->phaser pointer))))
  ([arcade display-object pointer speed]
   (phaser->clj
    (.accelerateToPointer arcade
                          (clj->phaser display-object)
                          (clj->phaser pointer)
                          (clj->phaser speed))))
  ([arcade display-object pointer speed x-speed-max]
   (phaser->clj
    (.accelerateToPointer arcade
                          (clj->phaser display-object)
                          (clj->phaser pointer)
                          (clj->phaser speed)
                          (clj->phaser x-speed-max))))
  ([arcade display-object pointer speed x-speed-max y-speed-max]
   (phaser->clj
    (.accelerateToPointer arcade
                          (clj->phaser display-object)
                          (clj->phaser pointer)
                          (clj->phaser speed)
                          (clj->phaser x-speed-max)
                          (clj->phaser y-speed-max)))))

(defn accelerate-to-xy
  "Sets the acceleration.x/y property on the display object so it will move towards the x/y coordinates at the given speed (in pixels per second sq.)
  You must give a maximum speed value, beyond which the display object won't go any faster.
  Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
  Note: The display object doesn't stop moving once it reaches the destination coordinates.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The display object to move.
    * x (number) - The x coordinate to accelerate towards.
    * y (number) - The y coordinate to accelerate towards.
    * speed (number) {optional} - The speed it will accelerate in pixels per second.
    * x-speed-max (number) {optional} - The maximum x velocity the display object can reach.
    * y-speed-max (number) {optional} - The maximum y velocity the display object can reach.

  Returns:  number - The angle (in radians) that the object should be visually set to in order to match its new trajectory."
  ([arcade display-object x y]
   (phaser->clj
    (.accelerateToXY arcade
                     (clj->phaser display-object)
                     (clj->phaser x)
                     (clj->phaser y))))
  ([arcade display-object x y speed]
   (phaser->clj
    (.accelerateToXY arcade
                     (clj->phaser display-object)
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser speed))))
  ([arcade display-object x y speed x-speed-max]
   (phaser->clj
    (.accelerateToXY arcade
                     (clj->phaser display-object)
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser speed)
                     (clj->phaser x-speed-max))))
  ([arcade display-object x y speed x-speed-max y-speed-max]
   (phaser->clj
    (.accelerateToXY arcade
                     (clj->phaser display-object)
                     (clj->phaser x)
                     (clj->phaser y)
                     (clj->phaser speed)
                     (clj->phaser x-speed-max)
                     (clj->phaser y-speed-max)))))

(defn acceleration-from-rotation
  "Given the rotation (in radians) and speed calculate the acceleration and return it as a Point object, or set it to the given point object.
  One way to use this is: accelerationFromRotation(rotation, 200, sprite.acceleration) which will set the values directly to the sprites acceleration and not create a new Point object.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * rotation (number) - The angle in radians.
    * speed (number) {optional} - The speed it will move, in pixels per second sq.
    * point (Phaser.Point | object) {optional} - The Point object in which the x and y properties will be set to the calculated acceleration.

  Returns:  Phaser.Point - - A Point where point.x contains the acceleration x value and point.y contains the acceleration y value."
  ([arcade rotation]
   (phaser->clj
    (.accelerationFromRotation arcade
                               (clj->phaser rotation))))
  ([arcade rotation speed]
   (phaser->clj
    (.accelerationFromRotation arcade
                               (clj->phaser rotation)
                               (clj->phaser speed))))
  ([arcade rotation speed point]
   (phaser->clj
    (.accelerationFromRotation arcade
                               (clj->phaser rotation)
                               (clj->phaser speed)
                               (clj->phaser point)))))

(defn angle-between
  "Find the angle in radians between two display objects (like Sprites).

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * source (any) - The Display Object to test from.
    * target (any) - The Display Object to test to.

  Returns:  number - The angle in radians between the source and target display objects."
  ([arcade source target]
   (phaser->clj
    (.angleBetween arcade
                   (clj->phaser source)
                   (clj->phaser target)))))

(defn angle-to-pointer
  "Find the angle in radians between a display object (like a Sprite) and a Pointer, taking their x/y and center into account.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The Display Object to test from.
    * pointer (Phaser.Pointer) {optional} - The Phaser.Pointer to test to. If none is given then Input.activePointer is used.

  Returns:  number - The angle in radians between displayObject.x/y to Pointer.x/y"
  ([arcade display-object]
   (phaser->clj
    (.angleToPointer arcade
                     (clj->phaser display-object))))
  ([arcade display-object pointer]
   (phaser->clj
    (.angleToPointer arcade
                     (clj->phaser display-object)
                     (clj->phaser pointer)))))

(defn angle-to-xy
  "Find the angle in radians between a display object (like a Sprite) and the given x/y coordinate.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The Display Object to test from.
    * x (number) - The x coordinate to get the angle to.
    * y (number) - The y coordinate to get the angle to.

  Returns:  number - The angle in radians between displayObject.x/y to Pointer.x/y"
  ([arcade display-object x y]
   (phaser->clj
    (.angleToXY arcade
                (clj->phaser display-object)
                (clj->phaser x)
                (clj->phaser y)))))

(defn collide
  "Checks for collision between two game objects. You can perform Sprite vs. Sprite, Sprite vs. Group, Group vs. Group, Sprite vs. Tilemap Layer or Group vs. Tilemap Layer collisions.
  Both the first and second parameter can be arrays of objects, of differing types.
  If two arrays are passed, the contents of the first parameter will be tested against all contents of the 2nd parameter.
  The objects are also automatically separated. If you don't require separation then use ArcadePhysics.overlap instead.
  An optional processCallback can be provided. If given this function will be called when two sprites are found to be colliding. It is called before any separation takes place,
  giving you the chance to perform additional checks. If the function returns true then the collision and separation is carried out. If it returns false it is skipped.
  The collideCallback is an optional function that is only called if two sprites collide. If a processCallback has been set then it needs to return true for collideCallback to be called.
  NOTE: This function is not recursive, and will not test against children of objects passed (i.e. Groups or Tilemaps within other Groups).

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * object-1 (Phaser.Sprite | Phaser.Group | Phaser.Particles.Emitter | Phaser.TilemapLayer | array) - The first object or array of objects to check. Can be Phaser.Sprite, Phaser.Group, Phaser.Particles.Emitter, or Phaser.TilemapLayer.
    * object-2 (Phaser.Sprite | Phaser.Group | Phaser.Particles.Emitter | Phaser.TilemapLayer | array) - The second object or array of objects to check. Can be Phaser.Sprite, Phaser.Group, Phaser.Particles.Emitter or Phaser.TilemapLayer.
    * collide-callback (function) {optional} - An optional callback function that is called if the objects collide. The two objects will be passed to this function in the same order in which you specified them, unless you are colliding Group vs. Sprite, in which case Sprite will always be the first parameter.
    * process-callback (function) {optional} - A callback function that lets you perform additional checks against the two objects if they overlap. If this is set then collision will only happen if processCallback returns true. The two objects will be passed to this function in the same order in which you specified them.
    * callback-context (object) {optional} - The context in which to run the callbacks.

  Returns:  boolean - True if a collision occurred otherwise false."
  ([arcade object-1 object-2]
   (phaser->clj
    (.collide arcade
              (clj->phaser object-1)
              (clj->phaser object-2))))
  ([arcade object-1 object-2 collide-callback]
   (phaser->clj
    (.collide arcade
              (clj->phaser object-1)
              (clj->phaser object-2)
              (clj->phaser collide-callback))))
  ([arcade object-1 object-2 collide-callback process-callback]
   (phaser->clj
    (.collide arcade
              (clj->phaser object-1)
              (clj->phaser object-2)
              (clj->phaser collide-callback)
              (clj->phaser process-callback))))
  ([arcade object-1 object-2 collide-callback process-callback callback-context]
   (phaser->clj
    (.collide arcade
              (clj->phaser object-1)
              (clj->phaser object-2)
              (clj->phaser collide-callback)
              (clj->phaser process-callback)
              (clj->phaser callback-context)))))

(defn compute-velocity
  "A tween-like function that takes a starting velocity and some other factors and returns an altered velocity.
  Based on a function in Flixel by @ADAMATOMIC

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * axis (number) - 0 for nothing, 1 for horizontal, 2 for vertical.
    * body (Phaser.Physics.Arcade.Body) - The Body object to be updated.
    * velocity (number) - Any component of velocity (e.g. 20).
    * acceleration (number) - Rate at which the velocity is changing.
    * drag (number) - Really kind of a deceleration, this is how much the velocity changes if Acceleration is not set.
    * max (number) {optional} - An absolute value cap for the velocity.

  Returns:  number - The altered Velocity value."
  ([arcade axis body velocity acceleration drag]
   (phaser->clj
    (.computeVelocity arcade
                      (clj->phaser axis)
                      (clj->phaser body)
                      (clj->phaser velocity)
                      (clj->phaser acceleration)
                      (clj->phaser drag))))
  ([arcade axis body velocity acceleration drag max]
   (phaser->clj
    (.computeVelocity arcade
                      (clj->phaser axis)
                      (clj->phaser body)
                      (clj->phaser velocity)
                      (clj->phaser acceleration)
                      (clj->phaser drag)
                      (clj->phaser max)))))

(defn distance-between
  "Find the distance between two display objects (like Sprites).

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * source (any) - The Display Object to test from.
    * target (any) - The Display Object to test to.

  Returns:  number - The distance between the source and target objects."
  ([arcade source target]
   (phaser->clj
    (.distanceBetween arcade
                      (clj->phaser source)
                      (clj->phaser target)))))

(defn distance-to-pointer
  "Find the distance between a display object (like a Sprite) and a Pointer. If no Pointer is given the Input.activePointer is used.
  The calculation is made from the display objects x/y coordinate. This may be the top-left if its anchor hasn't been changed.
  If you need to calculate from the center of a display object instead use the method distanceBetweenCenters()
  The distance to the Pointer is returned in screen space, not world space.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The Display Object to test from.
    * pointer (Phaser.Pointer) {optional} - The Phaser.Pointer to test to. If none is given then Input.activePointer is used.

  Returns:  number - The distance between the object and the Pointer."
  ([arcade display-object]
   (phaser->clj
    (.distanceToPointer arcade
                        (clj->phaser display-object))))
  ([arcade display-object pointer]
   (phaser->clj
    (.distanceToPointer arcade
                        (clj->phaser display-object)
                        (clj->phaser pointer)))))

(defn distance-to-xy
  "Find the distance between a display object (like a Sprite) and the given x/y coordinates.
  The calculation is made from the display objects x/y coordinate. This may be the top-left if its anchor hasn't been changed.
  If you need to calculate from the center of a display object instead use the method distanceBetweenCenters()

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The Display Object to test from.
    * x (number) - The x coordinate to move towards.
    * y (number) - The y coordinate to move towards.

  Returns:  number - The distance between the object and the x/y coordinates."
  ([arcade display-object x y]
   (phaser->clj
    (.distanceToXY arcade
                   (clj->phaser display-object)
                   (clj->phaser x)
                   (clj->phaser y)))))

(defn enable
  "This will create an Arcade Physics body on the given game object or array of game objects.
  A game object can only have 1 physics body active at any one time, and it can't be changed until the object is destroyed.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * object (object | array | Phaser.Group) - The game object to create the physics body on. Can also be an array or Group of objects, a body will be created on every child that has a `body` property.
    * children (boolean) {optional} - Should a body be created on all children of this object? If true it will recurse down the display list as far as it can go."
  ([arcade object]
   (phaser->clj
    (.enable arcade
             (clj->phaser object))))
  ([arcade object children]
   (phaser->clj
    (.enable arcade
             (clj->phaser object)
             (clj->phaser children)))))

(defn enable-body
  "Creates an Arcade Physics body on the given game object.

  A game object can only have 1 physics body active at any one time, and it can't be changed until the body is nulled.

  When you add an Arcade Physics body to an object it will automatically add the object into its parent Groups hash array.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * object (object) - The game object to create the physics body on. A body will only be created if this object has a null `body` property."
  ([arcade object]
   (phaser->clj
    (.enableBody arcade
                 (clj->phaser object)))))

(defn get-objects-at-location
  "Given a Group and a location this will check to see which Group children overlap with the coordinates.
  Each child will be sent to the given callback for further processing.
  Note that the children are not checked for depth order, but simply if they overlap the coordinate or not.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * x (number) - The x coordinate to check.
    * y (number) - The y coordinate to check.
    * group (Phaser.Group) - The Group to check.
    * callback (function) {optional} - A callback function that is called if the object overlaps the coordinates. The callback will be sent two parameters: the callbackArg and the Object that overlapped the location.
    * callback-context (object) {optional} - The context in which to run the callback.
    * callback-arg (object) {optional} - An argument to pass to the callback.

  Returns:  Array.<PIXI.DisplayObject> - An array of the Sprites from the Group that overlapped the coordinates."
  ([arcade x y group]
   (phaser->clj
    (.getObjectsAtLocation arcade
                           (clj->phaser x)
                           (clj->phaser y)
                           (clj->phaser group))))
  ([arcade x y group callback]
   (phaser->clj
    (.getObjectsAtLocation arcade
                           (clj->phaser x)
                           (clj->phaser y)
                           (clj->phaser group)
                           (clj->phaser callback))))
  ([arcade x y group callback callback-context]
   (phaser->clj
    (.getObjectsAtLocation arcade
                           (clj->phaser x)
                           (clj->phaser y)
                           (clj->phaser group)
                           (clj->phaser callback)
                           (clj->phaser callback-context))))
  ([arcade x y group callback callback-context callback-arg]
   (phaser->clj
    (.getObjectsAtLocation arcade
                           (clj->phaser x)
                           (clj->phaser y)
                           (clj->phaser group)
                           (clj->phaser callback)
                           (clj->phaser callback-context)
                           (clj->phaser callback-arg)))))

(defn get-objects-under-pointer
  "Given a Group and a Pointer this will check to see which Group children overlap with the Pointer coordinates.
  Each child will be sent to the given callback for further processing.
  Note that the children are not checked for depth order, but simply if they overlap the Pointer or not.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * pointer (Phaser.Pointer) - The Pointer to check.
    * group (Phaser.Group) - The Group to check.
    * callback (function) {optional} - A callback function that is called if the object overlaps with the Pointer. The callback will be sent two parameters: the Pointer and the Object that overlapped with it.
    * callback-context (object) {optional} - The context in which to run the callback.

  Returns:  Array.<PIXI.DisplayObject> - An array of the Sprites from the Group that overlapped the Pointer coordinates."
  ([arcade pointer group]
   (phaser->clj
    (.getObjectsUnderPointer arcade
                             (clj->phaser pointer)
                             (clj->phaser group))))
  ([arcade pointer group callback]
   (phaser->clj
    (.getObjectsUnderPointer arcade
                             (clj->phaser pointer)
                             (clj->phaser group)
                             (clj->phaser callback))))
  ([arcade pointer group callback callback-context]
   (phaser->clj
    (.getObjectsUnderPointer arcade
                             (clj->phaser pointer)
                             (clj->phaser group)
                             (clj->phaser callback)
                             (clj->phaser callback-context)))))

(defn intersects
  "Check for intersection against two bodies.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * body-1 (Phaser.Physics.Arcade.Body) - The Body object to check.
    * body-2 (Phaser.Physics.Arcade.Body) - The Body object to check.

  Returns:  boolean - True if they intersect, otherwise false."
  ([arcade body-1 body-2]
   (phaser->clj
    (.intersects arcade
                 (clj->phaser body-1)
                 (clj->phaser body-2)))))

(defn move-to-object
  "Move the given display object towards the destination object at a steady velocity.
  If you specify a maxTime then it will adjust the speed (overwriting what you set) so it arrives at the destination in that number of seconds.
  Timings are approximate due to the way browser timers work. Allow for a variance of +- 50ms.
  Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
  Note: The display object doesn't stop moving once it reaches the destination coordinates.
  Note: Doesn't take into account acceleration, maxVelocity or drag (if you've set drag or acceleration too high this object may not move at all)

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The display object to move.
    * destination (any) - The display object to move towards. Can be any object but must have visible x/y properties.
    * speed (number) {optional} - The speed it will move, in pixels per second (default is 60 pixels/sec)
    * max-time (number) {optional} - Time given in milliseconds (1000 = 1 sec). If set the speed is adjusted so the object will arrive at destination in the given number of ms.

  Returns:  number - The angle (in radians) that the object should be visually set to in order to match its new velocity."
  ([arcade display-object destination]
   (phaser->clj
    (.moveToObject arcade
                   (clj->phaser display-object)
                   (clj->phaser destination))))
  ([arcade display-object destination speed]
   (phaser->clj
    (.moveToObject arcade
                   (clj->phaser display-object)
                   (clj->phaser destination)
                   (clj->phaser speed))))
  ([arcade display-object destination speed max-time]
   (phaser->clj
    (.moveToObject arcade
                   (clj->phaser display-object)
                   (clj->phaser destination)
                   (clj->phaser speed)
                   (clj->phaser max-time)))))

(defn move-to-pointer
  "Move the given display object towards the pointer at a steady velocity. If no pointer is given it will use Phaser.Input.activePointer.
  If you specify a maxTime then it will adjust the speed (over-writing what you set) so it arrives at the destination in that number of seconds.
  Timings are approximate due to the way browser timers work. Allow for a variance of +- 50ms.
  Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
  Note: The display object doesn't stop moving once it reaches the destination coordinates.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The display object to move.
    * speed (number) {optional} - The speed it will move, in pixels per second (default is 60 pixels/sec)
    * pointer (Phaser.Pointer) {optional} - The pointer to move towards. Defaults to Phaser.Input.activePointer.
    * max-time (number) {optional} - Time given in milliseconds (1000 = 1 sec). If set the speed is adjusted so the object will arrive at destination in the given number of ms.

  Returns:  number - The angle (in radians) that the object should be visually set to in order to match its new velocity."
  ([arcade display-object]
   (phaser->clj
    (.moveToPointer arcade
                    (clj->phaser display-object))))
  ([arcade display-object speed]
   (phaser->clj
    (.moveToPointer arcade
                    (clj->phaser display-object)
                    (clj->phaser speed))))
  ([arcade display-object speed pointer]
   (phaser->clj
    (.moveToPointer arcade
                    (clj->phaser display-object)
                    (clj->phaser speed)
                    (clj->phaser pointer))))
  ([arcade display-object speed pointer max-time]
   (phaser->clj
    (.moveToPointer arcade
                    (clj->phaser display-object)
                    (clj->phaser speed)
                    (clj->phaser pointer)
                    (clj->phaser max-time)))))

(defn move-to-xy
  "Move the given display object towards the x/y coordinates at a steady velocity.
  If you specify a maxTime then it will adjust the speed (over-writing what you set) so it arrives at the destination in that number of seconds.
  Timings are approximate due to the way browser timers work. Allow for a variance of +- 50ms.
  Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
  Note: The display object doesn't stop moving once it reaches the destination coordinates.
  Note: Doesn't take into account acceleration, maxVelocity or drag (if you've set drag or acceleration too high this object may not move at all)

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * display-object (any) - The display object to move.
    * x (number) - The x coordinate to move towards.
    * y (number) - The y coordinate to move towards.
    * speed (number) {optional} - The speed it will move, in pixels per second (default is 60 pixels/sec)
    * max-time (number) {optional} - Time given in milliseconds (1000 = 1 sec). If set the speed is adjusted so the object will arrive at destination in the given number of ms.

  Returns:  number - The angle (in radians) that the object should be visually set to in order to match its new velocity."
  ([arcade display-object x y]
   (phaser->clj
    (.moveToXY arcade
               (clj->phaser display-object)
               (clj->phaser x)
               (clj->phaser y))))
  ([arcade display-object x y speed]
   (phaser->clj
    (.moveToXY arcade
               (clj->phaser display-object)
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser speed))))
  ([arcade display-object x y speed max-time]
   (phaser->clj
    (.moveToXY arcade
               (clj->phaser display-object)
               (clj->phaser x)
               (clj->phaser y)
               (clj->phaser speed)
               (clj->phaser max-time)))))

(defn overlap
  "Checks for overlaps between two game objects. The objects can be Sprites, Groups or Emitters.
  You can perform Sprite vs. Sprite, Sprite vs. Group and Group vs. Group overlap checks.
  Unlike collide the objects are NOT automatically separated or have any physics applied, they merely test for overlap results.
  Both the first and second parameter can be arrays of objects, of differing types.
  If two arrays are passed, the contents of the first parameter will be tested against all contents of the 2nd parameter.
  NOTE: This function is not recursive, and will not test against children of objects passed (i.e. Groups within Groups).

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * object-1 (Phaser.Sprite | Phaser.Group | Phaser.Particles.Emitter | array) - The first object or array of objects to check. Can be Phaser.Sprite, Phaser.Group or Phaser.Particles.Emitter.
    * object-2 (Phaser.Sprite | Phaser.Group | Phaser.Particles.Emitter | array) - The second object or array of objects to check. Can be Phaser.Sprite, Phaser.Group or Phaser.Particles.Emitter.
    * overlap-callback (function) {optional} - An optional callback function that is called if the objects overlap. The two objects will be passed to this function in the same order in which you specified them.  The two objects will be passed to this function in the same order in which you specified them, unless you are checking Group vs. Sprite, in which case Sprite will always be the first parameter.
    * process-callback (function) {optional} - A callback function that lets you perform additional checks against the two objects if they overlap. If this is set then overlapCallback will only be called if processCallback returns true.
    * callback-context (object) {optional} - The context in which to run the callbacks.

  Returns:  boolean - True if an overlap occurred otherwise false."
  ([arcade object-1 object-2]
   (phaser->clj
    (.overlap arcade
              (clj->phaser object-1)
              (clj->phaser object-2))))
  ([arcade object-1 object-2 overlap-callback]
   (phaser->clj
    (.overlap arcade
              (clj->phaser object-1)
              (clj->phaser object-2)
              (clj->phaser overlap-callback))))
  ([arcade object-1 object-2 overlap-callback process-callback]
   (phaser->clj
    (.overlap arcade
              (clj->phaser object-1)
              (clj->phaser object-2)
              (clj->phaser overlap-callback)
              (clj->phaser process-callback))))
  ([arcade object-1 object-2 overlap-callback process-callback callback-context]
   (phaser->clj
    (.overlap arcade
              (clj->phaser object-1)
              (clj->phaser object-2)
              (clj->phaser overlap-callback)
              (clj->phaser process-callback)
              (clj->phaser callback-context)))))

(defn set-bounds
  "Updates the size of this physics world.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * x (number) - Top left most corner of the world.
    * y (number) - Top left most corner of the world.
    * width (number) - New width of the world. Can never be smaller than the Game.width.
    * height (number) - New height of the world. Can never be smaller than the Game.height."
  ([arcade x y width height]
   (phaser->clj
    (.setBounds arcade
                (clj->phaser x)
                (clj->phaser y)
                (clj->phaser width)
                (clj->phaser height)))))

(defn set-bounds-to-world
  "Updates the size of this physics world to match the size of the game world."
  ([arcade]
   (phaser->clj
    (.setBoundsToWorld arcade))))

(defn sort
  "This method will sort a Groups hash array.

  If the Group has `physicsSortDirection` set it will use the sort direction defined.

  Otherwise if the sortDirection parameter is undefined, or Group.physicsSortDirection is null, it will use Phaser.Physics.Arcade.sortDirection.

  By changing Group.physicsSortDirection you can customise each Group to sort in a different order.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * group (Phaser.Group) - The Group to sort.
    * sort-direction (integer) {optional} - The sort direction used to sort this Group."
  ([arcade group]
   (phaser->clj
    (.sort arcade
           (clj->phaser group))))
  ([arcade group sort-direction]
   (phaser->clj
    (.sort arcade
           (clj->phaser group)
           (clj->phaser sort-direction)))))

(defn sort-bottom-top
  "A Sort function for sorting two bodies based on a BOTTOM to TOP sort direction.

  This is called automatically by World.sort

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * a (Phaser.Sprite) - The first Sprite to test. The Sprite must have an Arcade Physics Body.
    * b (Phaser.Sprite) - The second Sprite to test. The Sprite must have an Arcade Physics Body.

  Returns:  integer - A negative value if `a > b`, a positive value if `a < b` or 0 if `a === b` or the bodies are invalid."
  ([arcade a b]
   (phaser->clj
    (.sortBottomTop arcade
                    (clj->phaser a)
                    (clj->phaser b)))))

(defn sort-left-right
  "A Sort function for sorting two bodies based on a LEFT to RIGHT sort direction.

  This is called automatically by World.sort

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * a (Phaser.Sprite) - The first Sprite to test. The Sprite must have an Arcade Physics Body.
    * b (Phaser.Sprite) - The second Sprite to test. The Sprite must have an Arcade Physics Body.

  Returns:  integer - A negative value if `a > b`, a positive value if `a < b` or 0 if `a === b` or the bodies are invalid."
  ([arcade a b]
   (phaser->clj
    (.sortLeftRight arcade
                    (clj->phaser a)
                    (clj->phaser b)))))

(defn sort-right-left
  "A Sort function for sorting two bodies based on a RIGHT to LEFT sort direction.

  This is called automatically by World.sort

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * a (Phaser.Sprite) - The first Sprite to test. The Sprite must have an Arcade Physics Body.
    * b (Phaser.Sprite) - The second Sprite to test. The Sprite must have an Arcade Physics Body.

  Returns:  integer - A negative value if `a > b`, a positive value if `a < b` or 0 if `a === b` or the bodies are invalid."
  ([arcade a b]
   (phaser->clj
    (.sortRightLeft arcade
                    (clj->phaser a)
                    (clj->phaser b)))))

(defn sort-top-bottom
  "A Sort function for sorting two bodies based on a TOP to BOTTOM sort direction.

  This is called automatically by World.sort

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * a (Phaser.Sprite) - The first Sprite to test. The Sprite must have an Arcade Physics Body.
    * b (Phaser.Sprite) - The second Sprite to test. The Sprite must have an Arcade Physics Body.

  Returns:  integer - A negative value if `a > b`, a positive value if `a < b` or 0 if `a === b` or the bodies are invalid."
  ([arcade a b]
   (phaser->clj
    (.sortTopBottom arcade
                    (clj->phaser a)
                    (clj->phaser b)))))

(defn update-motion
  "Called automatically by a Physics body, it updates all motion related values on the Body unless `World.isPaused` is `true`.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * the (Phaser.Physics.Arcade.Body) - Body object to be updated."
  ([arcade the]
   (phaser->clj
    (.updateMotion arcade
                   (clj->phaser the)))))

(defn velocity-from-angle
  "Given the angle (in degrees) and speed calculate the velocity and return it as a Point object, or set it to the given point object.
  One way to use this is: velocityFromAngle(angle, 200, sprite.velocity) which will set the values directly to the sprites velocity and not create a new Point object.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * angle (number) - The angle in degrees calculated in clockwise positive direction (down = 90 degrees positive, right = 0 degrees positive, up = 90 degrees negative)
    * speed (number) {optional} - The speed it will move, in pixels per second sq.
    * point (Phaser.Point | object) {optional} - The Point object in which the x and y properties will be set to the calculated velocity.

  Returns:  Phaser.Point - - A Point where point.x contains the velocity x value and point.y contains the velocity y value."
  ([arcade angle]
   (phaser->clj
    (.velocityFromAngle arcade
                        (clj->phaser angle))))
  ([arcade angle speed]
   (phaser->clj
    (.velocityFromAngle arcade
                        (clj->phaser angle)
                        (clj->phaser speed))))
  ([arcade angle speed point]
   (phaser->clj
    (.velocityFromAngle arcade
                        (clj->phaser angle)
                        (clj->phaser speed)
                        (clj->phaser point)))))

(defn velocity-from-rotation
  "Given the rotation (in radians) and speed calculate the velocity and return it as a Point object, or set it to the given point object.
  One way to use this is: velocityFromRotation(rotation, 200, sprite.velocity) which will set the values directly to the sprites velocity and not create a new Point object.

  Parameters:
    * arcade (Phaser.Physics.Arcade) - Targeted instance for method
    * rotation (number) - The angle in radians.
    * speed (number) {optional} - The speed it will move, in pixels per second sq.
    * point (Phaser.Point | object) {optional} - The Point object in which the x and y properties will be set to the calculated velocity.

  Returns:  Phaser.Point - - A Point where point.x contains the velocity x value and point.y contains the velocity y value."
  ([arcade rotation]
   (phaser->clj
    (.velocityFromRotation arcade
                           (clj->phaser rotation))))
  ([arcade rotation speed]
   (phaser->clj
    (.velocityFromRotation arcade
                           (clj->phaser rotation)
                           (clj->phaser speed))))
  ([arcade rotation speed point]
   (phaser->clj
    (.velocityFromRotation arcade
                           (clj->phaser rotation)
                           (clj->phaser speed)
                           (clj->phaser point)))))