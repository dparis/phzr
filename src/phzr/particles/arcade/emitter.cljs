(ns phzr.particles.arcade.emitter
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update next reverse replace set filter sort iterate remove]))

(defn ->Emitter
  "Emitter is a lightweight particle emitter that uses Arcade Physics.
  It can be used for one-time explosions or for continuous effects like rain and fire.
  All it really does is launch Particle objects out at set intervals, and fixes their positions and velocities accordingly.

  Parameters:
    * game (Phaser.Game) - Current game instance.
    * x (number) {optional} - The x coordinate within the Emitter that the particles are emitted from.
    * y (number) {optional} - The y coordinate within the Emitter that the particles are emitted from.
    * max-particles (number) {optional} - The total number of particles in this emitter."
  ([game]
   (js/Phaser.Particles.Arcade.Emitter. (clj->phaser game)))
  ([game x]
   (js/Phaser.Particles.Arcade.Emitter. (clj->phaser game)
                                        (clj->phaser x)))
  ([game x y]
   (js/Phaser.Particles.Arcade.Emitter. (clj->phaser game)
                                        (clj->phaser x)
                                        (clj->phaser y)))
  ([game x y max-particles]
   (js/Phaser.Particles.Arcade.Emitter. (clj->phaser game)
                                        (clj->phaser x)
                                        (clj->phaser y)
                                        (clj->phaser max-particles))))

(defn add
  "Adds an existing object as the top child in this group.

  The child is automatically added to the top of the group and is displayed on top of every previous child.

  If Group.enableBody is set then a physics body will be created on the object, so long as one does not already exist.

  Use {@link Phaser.Group#addAt addAt} to control where a child is added. Use {@link Phaser.Group#create create} to create and add a new child.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (DisplayObject) - The display object to add as a child.
    * silent (boolean) {optional} - If true the child will not dispatch the `onAddedToGroup` event.

  Returns:  DisplayObject - The child that was added to the group."
  ([emitter child]
   (phaser->clj
    (.add emitter
          (clj->phaser child))))
  ([emitter child silent]
   (phaser->clj
    (.add emitter
          (clj->phaser child)
          (clj->phaser silent)))))

(defn add-all
  "Adds the amount to the given property on all children in this group.

  `Group.addAll('x', 10)` will add 10 to the child.x value for each child.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * property (string) - The property to increment, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to increment the property by. If child.x = 10 then addAll('x', 40) would make child.x = 50.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([emitter property amount check-alive check-visible]
   (phaser->clj
    (.addAll emitter
             (clj->phaser property)
             (clj->phaser amount)
             (clj->phaser check-alive)
             (clj->phaser check-visible)))))

(defn add-at
  "Adds an existing object to this group.

  The child is added to the group at the location specified by the index value, this allows you to control child ordering.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (DisplayObject) - The display object to add as a child.
    * index (integer) {optional} - The index within the group to insert the child to.
    * silent (boolean) {optional} - If true the child will not dispatch the `onAddedToGroup` event.

  Returns:  DisplayObject - The child that was added to the group."
  ([emitter child]
   (phaser->clj
    (.addAt emitter
            (clj->phaser child))))
  ([emitter child index]
   (phaser->clj
    (.addAt emitter
            (clj->phaser child)
            (clj->phaser index))))
  ([emitter child index silent]
   (phaser->clj
    (.addAt emitter
            (clj->phaser child)
            (clj->phaser index)
            (clj->phaser silent)))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([emitter child]
   (phaser->clj
    (.addChild emitter
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([emitter child index]
   (phaser->clj
    (.addChildAt emitter
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn add-multiple
  "Adds an array of existing Display Objects to this Group.

  The Display Objects are automatically added to the top of this Group, and will render on-top of everything already in this Group.

  As well as an array you can also pass another Group as the first argument. In this case all of the children from that
  Group will be removed from it and added into this Group.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * children (Array.<DisplayObject> | Phaser.Group) - An array of display objects or a Phaser.Group. If a Group is given then *all* children will be moved from it.
    * silent (boolean) {optional} - If true the children will not dispatch the `onAddedToGroup` event.

  Returns:  [Array.<DisplayObject> | Phaser.Group] - The array of children or Group of children that were added to this Group."
  ([emitter children]
   (phaser->clj
    (.addMultiple emitter
                  (clj->phaser children))))
  ([emitter children silent]
   (phaser->clj
    (.addMultiple emitter
                  (clj->phaser children)
                  (clj->phaser silent)))))

(defn add-to-hash
  "Adds a child of this Group into the hash array.
  This call will return false if the child is not a child of this Group, or is already in the hash.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (DisplayObject) - The display object to add to this Groups hash. Must be a member of this Group already and not present in the hash.

  Returns:  boolean - True if the child was successfully added to the hash, otherwise false."
  ([emitter child]
   (phaser->clj
    (.addToHash emitter
                (clj->phaser child)))))

(defn at
  "Change the emitters center to match the center of any object with a `center` property, such as a Sprite.
  If the object doesn't have a center property it will be set to object.x + object.width / 2

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * object (object | Phaser.Sprite | Phaser.Image | Phaser.TileSprite | Phaser.Text | PIXI.DisplayObject) - The object that you wish to match the center with."
  ([emitter object]
   (phaser->clj
    (.at emitter
         (clj->phaser object)))))

(defn bring-to-top
  "Brings the given child to the top of this group so it renders above all other children.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (any) - The child to bring to the top of this group.

  Returns:  any - The child that was moved."
  ([emitter child]
   (phaser->clj
    (.bringToTop emitter
                 (clj->phaser child)))))

(defn call-all
  "Calls a function, specified by name, on all on children.

  The function is called for all children regardless if they are dead or alive (see callAllExists for different options).
  After the method parameter and context you can add as many extra parameters as you like, which will all be passed to the child.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * method (string) - Name of the function on the child to call. Deep property lookup is supported.
    * context (string) {optional} - A string containing the context under which the method will be executed. Set to null to default to the child.
    * args (any) - Additional parameters that will be passed to the method."
  ([emitter method args]
   (phaser->clj
    (.callAll emitter
              (clj->phaser method)
              (clj->phaser args))))
  ([emitter method args context]
   (phaser->clj
    (.callAll emitter
              (clj->phaser method)
              (clj->phaser args)
              (clj->phaser context)))))

(defn call-all-exists
  "Calls a function, specified by name, on all children in the group who exist (or do not exist).

  After the existsValue parameter you can add as many parameters as you like, which will all be passed to the child callback.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * callback (string) - Name of the function on the children to call.
    * exists-value (boolean) - Only children with exists=existsValue will be called.
    * parameter (any) - Additional parameters that will be passed to the callback."
  ([emitter callback exists-value parameter]
   (phaser->clj
    (.callAllExists emitter
                    (clj->phaser callback)
                    (clj->phaser exists-value)
                    (clj->phaser parameter)))))

(defn check-all
  "Quickly check that the same property across all children of this group is equal to the given value.

  This call doesn't descend down children, so if you have a Group inside of this group, the property will be checked on the group but not its children.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be checked.
    * check-alive (boolean) {optional} - If set then only children with alive=true will be checked. This includes any Groups that are children.
    * check-visible (boolean) {optional} - If set then only children with visible=true will be checked. This includes any Groups that are children.
    * force (boolean) {optional} - If `force` is true then the property will be checked on the child regardless if it already exists or not. If true and the property doesn't exist, false will be returned."
  ([emitter key value]
   (phaser->clj
    (.checkAll emitter
               (clj->phaser key)
               (clj->phaser value))))
  ([emitter key value check-alive]
   (phaser->clj
    (.checkAll emitter
               (clj->phaser key)
               (clj->phaser value)
               (clj->phaser check-alive))))
  ([emitter key value check-alive check-visible]
   (phaser->clj
    (.checkAll emitter
               (clj->phaser key)
               (clj->phaser value)
               (clj->phaser check-alive)
               (clj->phaser check-visible))))
  ([emitter key value check-alive check-visible force]
   (phaser->clj
    (.checkAll emitter
               (clj->phaser key)
               (clj->phaser value)
               (clj->phaser check-alive)
               (clj->phaser check-visible)
               (clj->phaser force)))))

(defn check-property
  "Checks a property for the given value on the child.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (any) - The child to check the property value on.
    * key (array) - An array of strings that make up the property that will be set.
    * value (any) - The value that will be checked.
    * force (boolean) {optional} - If `force` is true then the property will be checked on the child regardless if it already exists or not. If true and the property doesn't exist, false will be returned.

  Returns:  boolean - True if the property was was equal to value, false if not."
  ([emitter child key value]
   (phaser->clj
    (.checkProperty emitter
                    (clj->phaser child)
                    (clj->phaser key)
                    (clj->phaser value))))
  ([emitter child key value force]
   (phaser->clj
    (.checkProperty emitter
                    (clj->phaser child)
                    (clj->phaser key)
                    (clj->phaser value)
                    (clj->phaser force)))))

(defn count-dead
  "Get the number of dead children in this group.

  Returns:  integer - The number of children flagged as dead."
  ([emitter]
   (phaser->clj
    (.countDead emitter))))

(defn count-living
  "Get the number of living children in this group.

  Returns:  integer - The number of children flagged as alive."
  ([emitter]
   (phaser->clj
    (.countLiving emitter))))

(defn create
  "Creates a new Phaser.Sprite object and adds it to the top of this group.

  Use {@link Phaser.Group#classType classType} to change the type of object creaded.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * x (number) - The x coordinate to display the newly created Sprite at. The value is in relation to the group.x point.
    * y (number) - The y coordinate to display the newly created Sprite at. The value is in relation to the group.y point.
    * key (string) - The Game.cache key of the image that this Sprite will use.
    * frame (integer | string) {optional} - If the Sprite image contains multiple frames you can specify which one to use here.
    * exists (boolean) {optional} - The default exists state of the Sprite.

  Returns:  DisplayObject - The child that was created: will be a {@link Phaser.Sprite} unless {@link #classType} has been changed."
  ([emitter x y key]
   (phaser->clj
    (.create emitter
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key))))
  ([emitter x y key frame]
   (phaser->clj
    (.create emitter
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser frame))))
  ([emitter x y key frame exists]
   (phaser->clj
    (.create emitter
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser frame)
             (clj->phaser exists)))))

(defn create-multiple
  "Creates multiple Phaser.Sprite objects and adds them to the top of this group.

  Useful if you need to quickly generate a pool of identical sprites, such as bullets.

  By default the sprites will be set to not exist and will be positioned at 0, 0 (relative to the group.x/y).
  Use {@link Phaser.Group#classType classType} to change the type of object created.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * quantity (integer) - The number of Sprites to create.
    * key (string) - The Game.cache key of the image that this Sprite will use.
    * frame (integer | string) {optional} - If the Sprite image contains multiple frames you can specify which one to use here.
    * exists (boolean) {optional} - The default exists state of the Sprite."
  ([emitter quantity key]
   (phaser->clj
    (.createMultiple emitter
                     (clj->phaser quantity)
                     (clj->phaser key))))
  ([emitter quantity key frame]
   (phaser->clj
    (.createMultiple emitter
                     (clj->phaser quantity)
                     (clj->phaser key)
                     (clj->phaser frame))))
  ([emitter quantity key frame exists]
   (phaser->clj
    (.createMultiple emitter
                     (clj->phaser quantity)
                     (clj->phaser key)
                     (clj->phaser frame)
                     (clj->phaser exists)))))

(defn custom-sort
  "Sort the children in the group according to custom sort function.

  The `sortHandler` is provided the two parameters: the two children involved in the comparison (a and b).
  It should return -1 if `a > b`, 1 if `a < b` or 0 if `a === b`.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * sort-handler (function) - The custom sort function.
    * context (object) {optional} - The context in which the sortHandler is called."
  ([emitter sort-handler]
   (phaser->clj
    (.customSort emitter
                 (clj->phaser sort-handler))))
  ([emitter sort-handler context]
   (phaser->clj
    (.customSort emitter
                 (clj->phaser sort-handler)
                 (clj->phaser context)))))

(defn destroy
  "Destroys this Emitter, all associated child Particles and then removes itself from the Particle Manager."
  ([emitter]
   (phaser->clj
    (.destroy emitter))))

(defn divide-all
  "Divides the given property by the amount on all children in this group.

  `Group.divideAll('x', 2)` will half the child.x value for each child.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * property (string) - The property to divide, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to divide the property by. If child.x = 100 then divideAll('x', 2) would make child.x = 50.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([emitter property amount check-alive check-visible]
   (phaser->clj
    (.divideAll emitter
                (clj->phaser property)
                (clj->phaser amount)
                (clj->phaser check-alive)
                (clj->phaser check-visible)))))

(defn emit-particle
  "This function can be used both internally and externally to emit the next particle in the queue.

  Returns:  boolean - True if a particle was emitted, otherwise false."
  ([emitter]
   (phaser->clj
    (.emitParticle emitter))))

(defn explode
  "Call this function to emit the given quantity of particles at all once (an explosion)

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * lifespan (number) {optional} - How long each particle lives once emitted in ms. 0 = forever.
    * quantity (number) {optional} - How many particles to launch."
  ([emitter]
   (phaser->clj
    (.explode emitter)))
  ([emitter lifespan]
   (phaser->clj
    (.explode emitter
              (clj->phaser lifespan))))
  ([emitter lifespan quantity]
   (phaser->clj
    (.explode emitter
              (clj->phaser lifespan)
              (clj->phaser quantity)))))

(defn filter
  "Find children matching a certain predicate.

  For example:

      var healthyList = Group.filter(function(child, index, children) {
          return child.health > 10 ? true : false;
      }, true);
      healthyList.callAll('attack');

  Note: Currently this will skip any children which are Groups themselves.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * predicate (function) - The function that each child will be evaluated against. Each child of the group will be passed to it as its first parameter, the index as the second, and the entire child array as the third
    * check-exists (boolean) {optional} - If true, only existing can be selected; otherwise all children can be selected and will be passed to the predicate.

  Returns:  Phaser.ArraySet - Returns an array list containing all the children that the predicate returned true for"
  ([emitter predicate]
   (phaser->clj
    (.filter emitter
             (clj->phaser predicate))))
  ([emitter predicate check-exists]
   (phaser->clj
    (.filter emitter
             (clj->phaser predicate)
             (clj->phaser check-exists)))))

(defn flow
  "Call this function to start emitting a flow of particles at the given frequency.
  It will carry on going until the total given is reached.
  Each time the flow is run the quantity number of particles will be emitted together.
  If you set the total to be 20 and quantity to be 5 then flow will emit 4 times in total (4 x 5 = 20 total)
  If you set the total to be -1 then no quantity cap is used and it will keep emitting.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * lifespan (number) {optional} - How long each particle lives once emitted in ms. 0 = forever.
    * frequency (number) {optional} - Frequency is how often to emit the particles, given in ms.
    * quantity (number) {optional} - How many particles to launch each time the frequency is met. Can never be > Emitter.maxParticles.
    * total (number) {optional} - How many particles to launch in total. If -1 it will carry on indefinitely.
    * immediate (boolean) {optional} - Should the flow start immediately (true) or wait until the first frequency event? (false)"
  ([emitter]
   (phaser->clj
    (.flow emitter)))
  ([emitter lifespan]
   (phaser->clj
    (.flow emitter
           (clj->phaser lifespan))))
  ([emitter lifespan frequency]
   (phaser->clj
    (.flow emitter
           (clj->phaser lifespan)
           (clj->phaser frequency))))
  ([emitter lifespan frequency quantity]
   (phaser->clj
    (.flow emitter
           (clj->phaser lifespan)
           (clj->phaser frequency)
           (clj->phaser quantity))))
  ([emitter lifespan frequency quantity total]
   (phaser->clj
    (.flow emitter
           (clj->phaser lifespan)
           (clj->phaser frequency)
           (clj->phaser quantity)
           (clj->phaser total))))
  ([emitter lifespan frequency quantity total immediate]
   (phaser->clj
    (.flow emitter
           (clj->phaser lifespan)
           (clj->phaser frequency)
           (clj->phaser quantity)
           (clj->phaser total)
           (clj->phaser immediate)))))

(defn for-each
  "Call a function on each child in this group.

  Additional arguments for the callback can be specified after the `checkExists` parameter. For example,

      Group.forEach(awardBonusGold, this, true, 100, 500)

  would invoke `awardBonusGold` function with the parameters `(child, 100, 500)`.

  Note: This check will skip any children which are Groups themselves.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * check-exists (boolean) {optional} - If set only children matching for which `exists` is true will be passed to the callback, otherwise all children will be passed.
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([emitter callback callback-context]
   (phaser->clj
    (.forEach emitter
              (clj->phaser callback)
              (clj->phaser callback-context))))
  ([emitter callback callback-context check-exists]
   (phaser->clj
    (.forEach emitter
              (clj->phaser callback)
              (clj->phaser callback-context)
              (clj->phaser check-exists))))
  ([emitter callback callback-context check-exists args]
   (phaser->clj
    (.forEach emitter
              (clj->phaser callback)
              (clj->phaser callback-context)
              (clj->phaser check-exists)
              (clj->phaser args)))))

(defn for-each-alive
  "Call a function on each alive child in this group.

  See {@link Phaser.Group#forEach forEach} for details.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([emitter callback callback-context]
   (phaser->clj
    (.forEachAlive emitter
                   (clj->phaser callback)
                   (clj->phaser callback-context))))
  ([emitter callback callback-context args]
   (phaser->clj
    (.forEachAlive emitter
                   (clj->phaser callback)
                   (clj->phaser callback-context)
                   (clj->phaser args)))))

(defn for-each-dead
  "Call a function on each dead child in this group.

  See {@link Phaser.Group#forEach forEach} for details.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([emitter callback callback-context]
   (phaser->clj
    (.forEachDead emitter
                  (clj->phaser callback)
                  (clj->phaser callback-context))))
  ([emitter callback callback-context args]
   (phaser->clj
    (.forEachDead emitter
                  (clj->phaser callback)
                  (clj->phaser callback-context)
                  (clj->phaser args)))))

(defn for-each-exists
  "Call a function on each existing child in this group.

  See {@link Phaser.Group#forEach forEach} for details.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([emitter callback callback-context]
   (phaser->clj
    (.forEachExists emitter
                    (clj->phaser callback)
                    (clj->phaser callback-context))))
  ([emitter callback callback-context args]
   (phaser->clj
    (.forEachExists emitter
                    (clj->phaser callback)
                    (clj->phaser callback-context)
                    (clj->phaser args)))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([emitter resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture emitter
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-at
  "Returns the child found at the given index within this group.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * index (integer) - The index to return the child from.

  Returns:  [DisplayObject | integer] - The child that was found at the given index, or -1 for an invalid index."
  ([emitter index]
   (phaser->clj
    (.getAt emitter
            (clj->phaser index)))))

(defn get-bottom
  "Returns the child at the bottom of this group.

  The bottom child the child being displayed (rendered) below every other child.

  Returns:  any - The child at the bottom of the Group."
  ([emitter]
   (phaser->clj
    (.getBottom emitter))))

(defn get-bounds
  "Retrieves the bounds of the displayObjectContainer as a rectangle. The bounds calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([emitter]
   (phaser->clj
    (.getBounds emitter))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([emitter index]
   (phaser->clj
    (.getChildAt emitter
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([emitter child]
   (phaser->clj
    (.getChildIndex emitter
                    (clj->phaser child)))))

(defn get-first-alive
  "Get the first child that is alive (`child.alive === true`).

  This is handy for checking if everything has been wiped out, or choosing a squad leader, etc.

  Returns:  any - The first alive child, or null if none found."
  ([emitter]
   (phaser->clj
    (.getFirstAlive emitter))))

(defn get-first-dead
  "Get the first child that is dead (`child.alive === false`).

  This is handy for checking if everything has been wiped out, or choosing a squad leader, etc.

  Returns:  any - The first dead child, or null if none found."
  ([emitter]
   (phaser->clj
    (.getFirstDead emitter))))

(defn get-first-exists
  "Get the first display object that exists, or doesn't exist.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * exists (boolean) {optional} - If true, find the first existing child; otherwise find the first non-existing child.

  Returns:  any - The first child, or null if none found."
  ([emitter]
   (phaser->clj
    (.getFirstExists emitter)))
  ([emitter exists]
   (phaser->clj
    (.getFirstExists emitter
                     (clj->phaser exists)))))

(defn get-index
  "Get the index position of the given child in this group, which should match the child's `z` property.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (any) - The child to get the index for.

  Returns:  integer - The index of the child or -1 if it's not a member of this group."
  ([emitter child]
   (phaser->clj
    (.getIndex emitter
               (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([emitter]
   (phaser->clj
    (.getLocalBounds emitter))))

(defn get-random
  "Returns a random child from the group.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * start-index (integer) {optional} - Offset from the front of the front of the group (lowest child).
    * length (integer) {optional} - Restriction on the number of values you want to randomly select from.

  Returns:  any - A random child of this Group."
  ([emitter]
   (phaser->clj
    (.getRandom emitter)))
  ([emitter start-index]
   (phaser->clj
    (.getRandom emitter
                (clj->phaser start-index))))
  ([emitter start-index length]
   (phaser->clj
    (.getRandom emitter
                (clj->phaser start-index)
                (clj->phaser length)))))

(defn get-top
  "Return the child at the top of this group.

  The top child is the child displayed (rendered) above every other child.

  Returns:  any - The child at the top of the Group."
  ([emitter]
   (phaser->clj
    (.getTop emitter))))

(defn has-property
  "Checks if the child has the given property.

  Will scan up to 4 levels deep only.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (any) - The child to check for the existance of the property on.
    * key (Array.<string>) - An array of strings that make up the property.

  Returns:  boolean - True if the child has the property, otherwise false."
  ([emitter child key]
   (phaser->clj
    (.hasProperty emitter
                  (clj->phaser child)
                  (clj->phaser key)))))

(defn iterate
  "Iterates over the children of the group performing one of several actions for matched children.

  A child is considered a match when it has a property, named `key`, whose value is equal to `value`
  according to a strict equality comparison.

  The result depends on the `returnType`:

  - {@link Phaser.Group.RETURN_TOTAL RETURN_TOTAL}:
      The callback, if any, is applied to all matching children. The number of matched children is returned.
  - {@link Phaser.Group.RETURN_NONE RETURN_NONE}:
      The callback, if any, is applied to all matching children. No value is returned.
  - {@link Phaser.Group.RETURN_CHILD RETURN_CHILD}:
      The callback, if any, is applied to the *first* matching child and the *first* matched child is returned.
      If there is no matching child then null is returned.

  If `args` is specified it must be an array. The matched child will be assigned to the first
  element and the entire array will be applied to the callback function.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * key (string) - The child property to check, i.e. 'exists', 'alive', 'health'
    * value (any) - A child matches if `child[key] === value` is true.
    * return-type (integer) - How to iterate the children and what to return.
    * callback (function) {optional} - Optional function that will be called on each matching child. The matched child is supplied as the first argument.
    * callback-context (object) {optional} - The context in which the function should be called (usually 'this').
    * args (Array.<any>) {optional} - The arguments supplied to to the callback; the first array index (argument) will be replaced with the matched child.

  Returns:  any - Returns either an integer (for RETURN_TOTAL), the first matched child (for RETURN_CHILD), or null."
  ([emitter key value return-type]
   (phaser->clj
    (.iterate emitter
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type))))
  ([emitter key value return-type callback]
   (phaser->clj
    (.iterate emitter
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type)
              (clj->phaser callback))))
  ([emitter key value return-type callback callback-context]
   (phaser->clj
    (.iterate emitter
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type)
              (clj->phaser callback)
              (clj->phaser callback-context))))
  ([emitter key value return-type callback callback-context args]
   (phaser->clj
    (.iterate emitter
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type)
              (clj->phaser callback)
              (clj->phaser callback-context)
              (clj->phaser args)))))

(defn kill
  "Call this function to turn off all the particles and the emitter."
  ([emitter]
   (phaser->clj
    (.kill emitter))))

(defn make-particles
  "This function generates a new set of particles for use by this emitter.
  The particles are stored internally waiting to be emitted via Emitter.start.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * keys (array | string) - A string or an array of strings that the particle sprites will use as their texture. If an array one is picked at random.
    * frames (array | number) {optional} - A frame number, or array of frames that the sprite will use. If an array one is picked at random.
    * quantity (number) {optional} - The number of particles to generate. If not given it will use the value of Emitter.maxParticles. If the value is greater than Emitter.maxParticles it will use Emitter.maxParticles as the quantity.
    * collide (boolean) {optional} - If you want the particles to be able to collide with other Arcade Physics bodies then set this to true.
    * collide-world-bounds (boolean) {optional} - A particle can be set to collide against the World bounds automatically and rebound back into the World if this is set to true. Otherwise it will leave the World.

  Returns:  Phaser.Particles.Arcade.Emitter - This Emitter instance."
  ([emitter keys]
   (phaser->clj
    (.makeParticles emitter
                    (clj->phaser keys))))
  ([emitter keys frames]
   (phaser->clj
    (.makeParticles emitter
                    (clj->phaser keys)
                    (clj->phaser frames))))
  ([emitter keys frames quantity]
   (phaser->clj
    (.makeParticles emitter
                    (clj->phaser keys)
                    (clj->phaser frames)
                    (clj->phaser quantity))))
  ([emitter keys frames quantity collide]
   (phaser->clj
    (.makeParticles emitter
                    (clj->phaser keys)
                    (clj->phaser frames)
                    (clj->phaser quantity)
                    (clj->phaser collide))))
  ([emitter keys frames quantity collide collide-world-bounds]
   (phaser->clj
    (.makeParticles emitter
                    (clj->phaser keys)
                    (clj->phaser frames)
                    (clj->phaser quantity)
                    (clj->phaser collide)
                    (clj->phaser collide-world-bounds)))))

(defn move-all
  "Moves all children from this Group to the Group given.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * group (Phaser.Group) - The new Group to which the children will be moved to.
    * silent (boolean) {optional} - If true the children will not dispatch the `onAddedToGroup` event for the new Group.

  Returns:  Phaser.Group - The Group to which all the children were moved."
  ([emitter group]
   (phaser->clj
    (.moveAll emitter
              (clj->phaser group))))
  ([emitter group silent]
   (phaser->clj
    (.moveAll emitter
              (clj->phaser group)
              (clj->phaser silent)))))

(defn move-down
  "Moves the given child down one place in this group unless it's already at the bottom.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (any) - The child to move down in the group.

  Returns:  any - The child that was moved."
  ([emitter child]
   (phaser->clj
    (.moveDown emitter
               (clj->phaser child)))))

(defn move-up
  "Moves the given child up one place in this group unless it's already at the top.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (any) - The child to move up in the group.

  Returns:  any - The child that was moved."
  ([emitter child]
   (phaser->clj
    (.moveUp emitter
             (clj->phaser child)))))

(defn multiply-all
  "Multiplies the given property by the amount on all children in this group.

  `Group.multiplyAll('x', 2)` will x2 the child.x value for each child.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * property (string) - The property to multiply, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to multiply the property by. If child.x = 10 then multiplyAll('x', 2) would make child.x = 20.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([emitter property amount check-alive check-visible]
   (phaser->clj
    (.multiplyAll emitter
                  (clj->phaser property)
                  (clj->phaser amount)
                  (clj->phaser check-alive)
                  (clj->phaser check-visible)))))

(defn next
  "Advances the group cursor to the next (higher) object in the group.

  If the cursor is at the end of the group (top child) it is moved the start of the group (bottom child).

  Returns:  any - The child the cursor now points to."
  ([emitter]
   (phaser->clj
    (.next emitter))))

(defn previous
  "Moves the group cursor to the previous (lower) child in the group.

  If the cursor is at the start of the group (bottom child) it is moved to the end (top child).

  Returns:  any - The child the cursor now points to."
  ([emitter]
   (phaser->clj
    (.previous emitter))))

(defn remove
  "Removes the given child from this group.

  This will dispatch an `onRemovedFromGroup` event from the child (if it has one), and optionally destroy the child.

  If the group cursor was referring to the removed child it is updated to refer to the next child.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (any) - The child to remove.
    * destroy (boolean) {optional} - If true `destroy` will be invoked on the removed child.
    * silent (boolean) {optional} - If true the the child will not dispatch the `onRemovedFromGroup` event.

  Returns:  boolean - true if the child was removed from this group, otherwise false."
  ([emitter child]
   (phaser->clj
    (.remove emitter
             (clj->phaser child))))
  ([emitter child destroy]
   (phaser->clj
    (.remove emitter
             (clj->phaser child)
             (clj->phaser destroy))))
  ([emitter child destroy silent]
   (phaser->clj
    (.remove emitter
             (clj->phaser child)
             (clj->phaser destroy)
             (clj->phaser silent)))))

(defn remove-all
  "Removes all children from this group, but does not remove the group from its parent.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * destroy (boolean) {optional} - If true `destroy` will be invoked on each removed child.
    * silent (boolean) {optional} - If true the children will not dispatch their `onRemovedFromGroup` events."
  ([emitter]
   (phaser->clj
    (.removeAll emitter)))
  ([emitter destroy]
   (phaser->clj
    (.removeAll emitter
                (clj->phaser destroy))))
  ([emitter destroy silent]
   (phaser->clj
    (.removeAll emitter
                (clj->phaser destroy)
                (clj->phaser silent)))))

(defn remove-between
  "Removes all children from this group whose index falls beteen the given startIndex and endIndex values.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * start-index (integer) - The index to start removing children from.
    * end-index (integer) {optional} - The index to stop removing children at. Must be higher than startIndex. If undefined this method will remove all children between startIndex and the end of the group.
    * destroy (boolean) {optional} - If true `destroy` will be invoked on each removed child.
    * silent (boolean) {optional} - If true the children will not dispatch their `onRemovedFromGroup` events."
  ([emitter start-index]
   (phaser->clj
    (.removeBetween emitter
                    (clj->phaser start-index))))
  ([emitter start-index end-index]
   (phaser->clj
    (.removeBetween emitter
                    (clj->phaser start-index)
                    (clj->phaser end-index))))
  ([emitter start-index end-index destroy]
   (phaser->clj
    (.removeBetween emitter
                    (clj->phaser start-index)
                    (clj->phaser end-index)
                    (clj->phaser destroy))))
  ([emitter start-index end-index destroy silent]
   (phaser->clj
    (.removeBetween emitter
                    (clj->phaser start-index)
                    (clj->phaser end-index)
                    (clj->phaser destroy)
                    (clj->phaser silent)))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([emitter child]
   (phaser->clj
    (.removeChild emitter
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([emitter index]
   (phaser->clj
    (.removeChildAt emitter
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([emitter begin-index end-index]
   (phaser->clj
    (.removeChildren emitter
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-from-hash
  "Removes a child of this Group from the hash array.
  This call will return false if the child is not in the hash.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (DisplayObject) - The display object to remove from this Groups hash. Must be a member of this Group and in the hash.

  Returns:  boolean - True if the child was successfully removed from the hash, otherwise false."
  ([emitter child]
   (phaser->clj
    (.removeFromHash emitter
                     (clj->phaser child)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([emitter]
   (phaser->clj
    (.removeStageReference emitter))))

(defn replace
  "Replaces a child of this group with the given newChild. The newChild cannot be a member of this group.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * old-child (any) - The child in this group that will be replaced.
    * new-child (any) - The child to be inserted into this group.

  Returns:  any - Returns the oldChild that was replaced within this group."
  ([emitter old-child new-child]
   (phaser->clj
    (.replace emitter
              (clj->phaser old-child)
              (clj->phaser new-child)))))

(defn reset-cursor
  "Sets the group cursor to the first child in the group.

  If the optional index parameter is given it sets the cursor to the object at that index instead.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * index (integer) {optional} - Set the cursor to point to a specific index.

  Returns:  any - The child the cursor now points to."
  ([emitter]
   (phaser->clj
    (.resetCursor emitter)))
  ([emitter index]
   (phaser->clj
    (.resetCursor emitter
                  (clj->phaser index)))))

(defn reverse
  "Reverses all children in this group.

  This operaation applies only to immediate children and does not propagate to subgroups."
  ([emitter]
   (phaser->clj
    (.reverse emitter))))

(defn revive
  "Handy for bringing game objects 'back to life'. Just sets alive and exists back to true."
  ([emitter]
   (phaser->clj
    (.revive emitter))))

(defn send-to-back
  "Sends the given child to the bottom of this group so it renders below all other children.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (any) - The child to send to the bottom of this group.

  Returns:  any - The child that was moved."
  ([emitter child]
   (phaser->clj
    (.sendToBack emitter
                 (clj->phaser child)))))

(defn set
  "Quickly set a property on a single child of this group to a new value.

  The operation parameter controls how the new value is assigned to the property, from simple replacement to addition and multiplication.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (Phaser.Sprite) - The child to set the property on.
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be set.
    * check-alive (boolean) {optional} - If set then the child will only be updated if alive=true.
    * check-visible (boolean) {optional} - If set then the child will only be updated if visible=true.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set.

  Returns:  boolean - True if the property was set, false if not."
  ([emitter child key value]
   (phaser->clj
    (.set emitter
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value))))
  ([emitter child key value check-alive]
   (phaser->clj
    (.set emitter
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive))))
  ([emitter child key value check-alive check-visible]
   (phaser->clj
    (.set emitter
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive)
          (clj->phaser check-visible))))
  ([emitter child key value check-alive check-visible operation]
   (phaser->clj
    (.set emitter
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive)
          (clj->phaser check-visible)
          (clj->phaser operation))))
  ([emitter child key value check-alive check-visible operation force]
   (phaser->clj
    (.set emitter
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive)
          (clj->phaser check-visible)
          (clj->phaser operation)
          (clj->phaser force)))))

(defn set-all
  "Quickly set the same property across all children of this group to a new value.

  This call doesn't descend down children, so if you have a Group inside of this group, the property will be set on the group but not its children.
  If you need that ability please see `Group.setAllChildren`.

  The operation parameter controls how the new value is assigned to the property, from simple replacement to addition and multiplication.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be set.
    * check-alive (boolean) {optional} - If set then only children with alive=true will be updated. This includes any Groups that are children.
    * check-visible (boolean) {optional} - If set then only children with visible=true will be updated. This includes any Groups that are children.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set."
  ([emitter key value]
   (phaser->clj
    (.setAll emitter
             (clj->phaser key)
             (clj->phaser value))))
  ([emitter key value check-alive]
   (phaser->clj
    (.setAll emitter
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive))))
  ([emitter key value check-alive check-visible]
   (phaser->clj
    (.setAll emitter
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive)
             (clj->phaser check-visible))))
  ([emitter key value check-alive check-visible operation]
   (phaser->clj
    (.setAll emitter
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive)
             (clj->phaser check-visible)
             (clj->phaser operation))))
  ([emitter key value check-alive check-visible operation force]
   (phaser->clj
    (.setAll emitter
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive)
             (clj->phaser check-visible)
             (clj->phaser operation)
             (clj->phaser force)))))

(defn set-all-children
  "Quickly set the same property across all children of this group, and any child Groups, to a new value.

  If this group contains other Groups then the same property is set across their children as well, iterating down until it reaches the bottom.
  Unlike with `setAll` the property is NOT set on child Groups itself.

  The operation parameter controls how the new value is assigned to the property, from simple replacement to addition and multiplication.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be set.
    * check-alive (boolean) {optional} - If set then only children with alive=true will be updated. This includes any Groups that are children.
    * check-visible (boolean) {optional} - If set then only children with visible=true will be updated. This includes any Groups that are children.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set."
  ([emitter key value]
   (phaser->clj
    (.setAllChildren emitter
                     (clj->phaser key)
                     (clj->phaser value))))
  ([emitter key value check-alive]
   (phaser->clj
    (.setAllChildren emitter
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive))))
  ([emitter key value check-alive check-visible]
   (phaser->clj
    (.setAllChildren emitter
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive)
                     (clj->phaser check-visible))))
  ([emitter key value check-alive check-visible operation]
   (phaser->clj
    (.setAllChildren emitter
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive)
                     (clj->phaser check-visible)
                     (clj->phaser operation))))
  ([emitter key value check-alive check-visible operation force]
   (phaser->clj
    (.setAllChildren emitter
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive)
                     (clj->phaser check-visible)
                     (clj->phaser operation)
                     (clj->phaser force)))))

(defn set-alpha
  "A more compact way of setting the alpha constraints of the particles.
  The rate parameter, if set to a value above zero, lets you set the speed at which the Particle change in alpha from min to max.
  If rate is zero, which is the default, the particle won't change alpha - instead it will pick a random alpha between min and max on emit.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * min (number) {optional} - The minimum value for this range.
    * max (number) {optional} - The maximum value for this range.
    * rate (number) {optional} - The rate (in ms) at which the particles will change in alpha from min to max, or set to zero to pick a random alpha between the two.
    * ease (function) {optional} - If you've set a rate > 0 this is the easing formula applied between the min and max values.
    * yoyo (boolean) {optional} - If you've set a rate > 0 you can set if the ease will yoyo or not (i.e. ease back to its original values)"
  ([emitter]
   (phaser->clj
    (.setAlpha emitter)))
  ([emitter min]
   (phaser->clj
    (.setAlpha emitter
               (clj->phaser min))))
  ([emitter min max]
   (phaser->clj
    (.setAlpha emitter
               (clj->phaser min)
               (clj->phaser max))))
  ([emitter min max rate]
   (phaser->clj
    (.setAlpha emitter
               (clj->phaser min)
               (clj->phaser max)
               (clj->phaser rate))))
  ([emitter min max rate ease]
   (phaser->clj
    (.setAlpha emitter
               (clj->phaser min)
               (clj->phaser max)
               (clj->phaser rate)
               (clj->phaser ease))))
  ([emitter min max rate ease yoyo]
   (phaser->clj
    (.setAlpha emitter
               (clj->phaser min)
               (clj->phaser max)
               (clj->phaser rate)
               (clj->phaser ease)
               (clj->phaser yoyo)))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([emitter child index]
   (phaser->clj
    (.setChildIndex emitter
                    (clj->phaser child)
                    (clj->phaser index)))))

(defn set-property
  "Sets a property to the given value on the child. The operation parameter controls how the value is set.

  The operations are:
  - 0: set the existing value to the given value; if force is `true` a new property will be created if needed
  - 1: will add the given value to the value already present.
  - 2: will subtract the given value from the value already present.
  - 3: will multiply the value already present by the given value.
  - 4: will divide the value already present by the given value.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (any) - The child to set the property value on.
    * key (array) - An array of strings that make up the property that will be set.
    * value (any) - The value that will be set.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set.

  Returns:  boolean - True if the property was set, false if not."
  ([emitter child key value]
   (phaser->clj
    (.setProperty emitter
                  (clj->phaser child)
                  (clj->phaser key)
                  (clj->phaser value))))
  ([emitter child key value operation]
   (phaser->clj
    (.setProperty emitter
                  (clj->phaser child)
                  (clj->phaser key)
                  (clj->phaser value)
                  (clj->phaser operation))))
  ([emitter child key value operation force]
   (phaser->clj
    (.setProperty emitter
                  (clj->phaser child)
                  (clj->phaser key)
                  (clj->phaser value)
                  (clj->phaser operation)
                  (clj->phaser force)))))

(defn set-rotation
  "A more compact way of setting the angular velocity constraints of the particles.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * min (number) {optional} - The minimum value for this range.
    * max (number) {optional} - The maximum value for this range."
  ([emitter]
   (phaser->clj
    (.setRotation emitter)))
  ([emitter min]
   (phaser->clj
    (.setRotation emitter
                  (clj->phaser min))))
  ([emitter min max]
   (phaser->clj
    (.setRotation emitter
                  (clj->phaser min)
                  (clj->phaser max)))))

(defn set-scale
  "A more compact way of setting the scale constraints of the particles.
  The rate parameter, if set to a value above zero, lets you set the speed and ease which the Particle uses to change in scale from min to max across both axis.
  If rate is zero, which is the default, the particle won't change scale during update, instead it will pick a random scale between min and max on emit.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * min-x (number) {optional} - The minimum value of Particle.scale.x.
    * max-x (number) {optional} - The maximum value of Particle.scale.x.
    * min-y (number) {optional} - The minimum value of Particle.scale.y.
    * max-y (number) {optional} - The maximum value of Particle.scale.y.
    * rate (number) {optional} - The rate (in ms) at which the particles will change in scale from min to max, or set to zero to pick a random size between the two.
    * ease (function) {optional} - If you've set a rate > 0 this is the easing formula applied between the min and max values.
    * yoyo (boolean) {optional} - If you've set a rate > 0 you can set if the ease will yoyo or not (i.e. ease back to its original values)"
  ([emitter]
   (phaser->clj
    (.setScale emitter)))
  ([emitter min-x]
   (phaser->clj
    (.setScale emitter
               (clj->phaser min-x))))
  ([emitter min-x max-x]
   (phaser->clj
    (.setScale emitter
               (clj->phaser min-x)
               (clj->phaser max-x))))
  ([emitter min-x max-x min-y]
   (phaser->clj
    (.setScale emitter
               (clj->phaser min-x)
               (clj->phaser max-x)
               (clj->phaser min-y))))
  ([emitter min-x max-x min-y max-y]
   (phaser->clj
    (.setScale emitter
               (clj->phaser min-x)
               (clj->phaser max-x)
               (clj->phaser min-y)
               (clj->phaser max-y))))
  ([emitter min-x max-x min-y max-y rate]
   (phaser->clj
    (.setScale emitter
               (clj->phaser min-x)
               (clj->phaser max-x)
               (clj->phaser min-y)
               (clj->phaser max-y)
               (clj->phaser rate))))
  ([emitter min-x max-x min-y max-y rate ease]
   (phaser->clj
    (.setScale emitter
               (clj->phaser min-x)
               (clj->phaser max-x)
               (clj->phaser min-y)
               (clj->phaser max-y)
               (clj->phaser rate)
               (clj->phaser ease))))
  ([emitter min-x max-x min-y max-y rate ease yoyo]
   (phaser->clj
    (.setScale emitter
               (clj->phaser min-x)
               (clj->phaser max-x)
               (clj->phaser min-y)
               (clj->phaser max-y)
               (clj->phaser rate)
               (clj->phaser ease)
               (clj->phaser yoyo)))))

(defn set-size
  "A more compact way of setting the width and height of the emitter.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * width (number) - The desired width of the emitter (particles are spawned randomly within these dimensions).
    * height (number) - The desired height of the emitter."
  ([emitter width height]
   (phaser->clj
    (.setSize emitter
              (clj->phaser width)
              (clj->phaser height)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([emitter stage]
   (phaser->clj
    (.setStageReference emitter
                        (clj->phaser stage)))))

(defn set-x-speed
  "A more compact way of setting the X velocity range of the emitter.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * min (number) {optional} - The minimum value for this range.
    * max (number) {optional} - The maximum value for this range."
  ([emitter]
   (phaser->clj
    (.setXSpeed emitter)))
  ([emitter min]
   (phaser->clj
    (.setXSpeed emitter
                (clj->phaser min))))
  ([emitter min max]
   (phaser->clj
    (.setXSpeed emitter
                (clj->phaser min)
                (clj->phaser max)))))

(defn set-y-speed
  "A more compact way of setting the Y velocity range of the emitter.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * min (number) {optional} - The minimum value for this range.
    * max (number) {optional} - The maximum value for this range."
  ([emitter]
   (phaser->clj
    (.setYSpeed emitter)))
  ([emitter min]
   (phaser->clj
    (.setYSpeed emitter
                (clj->phaser min))))
  ([emitter min max]
   (phaser->clj
    (.setYSpeed emitter
                (clj->phaser min)
                (clj->phaser max)))))

(defn sort
  "Sort the children in the group according to a particular key and ordering.

  Call this function to sort the group according to a particular key value and order.
  For example to depth sort Sprites for Zelda-style game you might call `group.sort('y', Phaser.Group.SORT_ASCENDING)` at the bottom of your `State.update()`.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * key (string) {optional} - The name of the property to sort on. Defaults to the objects z-depth value.
    * order (integer) {optional} - Order ascending ({@link Phaser.Group.SORT_ASCENDING SORT_ASCENDING}) or descending ({@link Phaser.Group.SORT_DESCENDING SORT_DESCENDING})."
  ([emitter]
   (phaser->clj
    (.sort emitter)))
  ([emitter key]
   (phaser->clj
    (.sort emitter
           (clj->phaser key))))
  ([emitter key order]
   (phaser->clj
    (.sort emitter
           (clj->phaser key)
           (clj->phaser order)))))

(defn start
  "Call this function to start emitting particles.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * explode (boolean) {optional} - Whether the particles should all burst out at once (true) or at the frequency given (false).
    * lifespan (number) {optional} - How long each particle lives once emitted in ms. 0 = forever.
    * frequency (number) {optional} - Ignored if Explode is set to true. Frequency is how often to emit 1 particle. Value given in ms.
    * quantity (number) {optional} - How many particles to launch. 0 = 'all of the particles' which will keep emitting until Emitter.maxParticles is reached.
    * force-quantity (number) {optional} - If `true` and creating a particle flow, the quantity emitted will be forced to the be quantity given in this call. This can never exceed Emitter.maxParticles."
  ([emitter]
   (phaser->clj
    (.start emitter)))
  ([emitter explode]
   (phaser->clj
    (.start emitter
            (clj->phaser explode))))
  ([emitter explode lifespan]
   (phaser->clj
    (.start emitter
            (clj->phaser explode)
            (clj->phaser lifespan))))
  ([emitter explode lifespan frequency]
   (phaser->clj
    (.start emitter
            (clj->phaser explode)
            (clj->phaser lifespan)
            (clj->phaser frequency))))
  ([emitter explode lifespan frequency quantity]
   (phaser->clj
    (.start emitter
            (clj->phaser explode)
            (clj->phaser lifespan)
            (clj->phaser frequency)
            (clj->phaser quantity))))
  ([emitter explode lifespan frequency quantity force-quantity]
   (phaser->clj
    (.start emitter
            (clj->phaser explode)
            (clj->phaser lifespan)
            (clj->phaser frequency)
            (clj->phaser quantity)
            (clj->phaser force-quantity)))))

(defn sub-all
  "Subtracts the amount from the given property on all children in this group.

  `Group.subAll('x', 10)` will minus 10 from the child.x value for each child.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * property (string) - The property to decrement, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to subtract from the property. If child.x = 50 then subAll('x', 40) would make child.x = 10.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([emitter property amount check-alive check-visible]
   (phaser->clj
    (.subAll emitter
             (clj->phaser property)
             (clj->phaser amount)
             (clj->phaser check-alive)
             (clj->phaser check-visible)))))

(defn swap
  "Swaps the position of two children in this group.

  Both children must be in this group, a child cannot be swapped with itself, and unparented children cannot be swapped.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child-1 (any) - The first child to swap.
    * child-2 (any) - The second child to swap."
  ([emitter child-1 child-2]
   (phaser->clj
    (.swap emitter
           (clj->phaser child-1)
           (clj->phaser child-2)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([emitter child child-2]
   (phaser->clj
    (.swapChildren emitter
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([emitter position]
   (phaser->clj
    (.toGlobal emitter
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([emitter position]
   (phaser->clj
    (.toLocal emitter
              (clj->phaser position))))
  ([emitter position from]
   (phaser->clj
    (.toLocal emitter
              (clj->phaser position)
              (clj->phaser from)))))

(defn update
  "Called automatically by the game loop, decides when to launch particles and when to 'die'."
  ([emitter]
   (phaser->clj
    (.update emitter))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([emitter]
   (phaser->clj
    (.updateCache emitter))))

(defn xy
  "Positions the child found at the given index within this group to the given x and y coordinates.

  Parameters:
    * emitter (Phaser.Particles.Arcade.Emitter) - Targeted instance for method
    * index (integer) - The index of the child in the group to set the position of.
    * x (number) - The new x position of the child.
    * y (number) - The new y position of the child."
  ([emitter index x y]
   (phaser->clj
    (.xy emitter
         (clj->phaser index)
         (clj->phaser x)
         (clj->phaser y)))))