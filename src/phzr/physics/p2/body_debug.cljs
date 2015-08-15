(ns phzr.physics.p2.body-debug
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [next reverse replace set filter sort iterate remove]))

(defn ->BodyDebug
  "Draws a P2 Body to a Graphics instance for visual debugging.
  Needless to say, for every body you enable debug drawing on, you are adding processor and graphical overhead.
  So use sparingly and rarely (if ever) in production code.

  Also be aware that the Debug body is only updated when the Sprite it is connected to changes position. If you
  manipulate the sprite in any other way (such as moving it to another Group or bringToTop, etc) then you will
  need to manually adjust its BodyDebug as well.

  Parameters:
    * game (Phaser.Game) - Game reference to the currently running game.
    * body (Phaser.Physics.P2.Body) - The P2 Body to display debug data for.
    * settings (object) - Settings object."
  ([game body settings]
   (js/Phaser.Physics.P2.BodyDebug. (clj->phaser game)
                                    (clj->phaser body)
                                    (clj->phaser settings))))

(defn add
  "Adds an existing object as the top child in this group.

  The child is automatically added to the top of the group and is displayed on top of every previous child.

  If Group.enableBody is set then a physics body will be created on the object, so long as one does not already exist.

  Use {@link Phaser.Group#addAt addAt} to control where a child is added. Use {@link Phaser.Group#create create} to create and add a new child.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (DisplayObject) - The display object to add as a child.
    * silent (boolean) {optional} - If true the child will not dispatch the `onAddedToGroup` event.

  Returns:  DisplayObject - The child that was added to the group."
  ([body-debug child]
   (phaser->clj
    (.add body-debug
          (clj->phaser child))))
  ([body-debug child silent]
   (phaser->clj
    (.add body-debug
          (clj->phaser child)
          (clj->phaser silent)))))

(defn add-all
  "Adds the amount to the given property on all children in this group.

  `Group.addAll('x', 10)` will add 10 to the child.x value for each child.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * property (string) - The property to increment, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to increment the property by. If child.x = 10 then addAll('x', 40) would make child.x = 50.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([body-debug property amount check-alive check-visible]
   (phaser->clj
    (.addAll body-debug
             (clj->phaser property)
             (clj->phaser amount)
             (clj->phaser check-alive)
             (clj->phaser check-visible)))))

(defn add-at
  "Adds an existing object to this group.

  The child is added to the group at the location specified by the index value, this allows you to control child ordering.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (DisplayObject) - The display object to add as a child.
    * index (integer) {optional} - The index within the group to insert the child to.
    * silent (boolean) {optional} - If true the child will not dispatch the `onAddedToGroup` event.

  Returns:  DisplayObject - The child that was added to the group."
  ([body-debug child]
   (phaser->clj
    (.addAt body-debug
            (clj->phaser child))))
  ([body-debug child index]
   (phaser->clj
    (.addAt body-debug
            (clj->phaser child)
            (clj->phaser index))))
  ([body-debug child index silent]
   (phaser->clj
    (.addAt body-debug
            (clj->phaser child)
            (clj->phaser index)
            (clj->phaser silent)))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([body-debug child]
   (phaser->clj
    (.addChild body-debug
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([body-debug child index]
   (phaser->clj
    (.addChildAt body-debug
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn add-multiple
  "Adds an array of existing Display Objects to this Group.

  The Display Objects are automatically added to the top of this Group, and will render on-top of everything already in this Group.

  As well as an array you can also pass another Group as the first argument. In this case all of the children from that
  Group will be removed from it and added into this Group.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * children (Array.<DisplayObject> | Phaser.Group) - An array of display objects or a Phaser.Group. If a Group is given then *all* children will be moved from it.
    * silent (boolean) {optional} - If true the children will not dispatch the `onAddedToGroup` event.

  Returns:  [Array.<DisplayObject> | Phaser.Group] - The array of children or Group of children that were added to this Group."
  ([body-debug children]
   (phaser->clj
    (.addMultiple body-debug
                  (clj->phaser children))))
  ([body-debug children silent]
   (phaser->clj
    (.addMultiple body-debug
                  (clj->phaser children)
                  (clj->phaser silent)))))

(defn add-to-hash
  "Adds a child of this Group into the hash array.
  This call will return false if the child is not a child of this Group, or is already in the hash.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (DisplayObject) - The display object to add to this Groups hash. Must be a member of this Group already and not present in the hash.

  Returns:  boolean - True if the child was successfully added to the hash, otherwise false."
  ([body-debug child]
   (phaser->clj
    (.addToHash body-debug
                (clj->phaser child)))))

(defn bring-to-top
  "Brings the given child to the top of this group so it renders above all other children.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (any) - The child to bring to the top of this group.

  Returns:  any - The child that was moved."
  ([body-debug child]
   (phaser->clj
    (.bringToTop body-debug
                 (clj->phaser child)))))

(defn call-all
  "Calls a function, specified by name, on all on children.

  The function is called for all children regardless if they are dead or alive (see callAllExists for different options).
  After the method parameter and context you can add as many extra parameters as you like, which will all be passed to the child.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * method (string) - Name of the function on the child to call. Deep property lookup is supported.
    * context (string) {optional} - A string containing the context under which the method will be executed. Set to null to default to the child.
    * args (any) - Additional parameters that will be passed to the method."
  ([body-debug method args]
   (phaser->clj
    (.callAll body-debug
              (clj->phaser method)
              (clj->phaser args))))
  ([body-debug method args context]
   (phaser->clj
    (.callAll body-debug
              (clj->phaser method)
              (clj->phaser args)
              (clj->phaser context)))))

(defn call-all-exists
  "Calls a function, specified by name, on all children in the group who exist (or do not exist).

  After the existsValue parameter you can add as many parameters as you like, which will all be passed to the child callback.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * callback (string) - Name of the function on the children to call.
    * exists-value (boolean) - Only children with exists=existsValue will be called.
    * parameter (any) - Additional parameters that will be passed to the callback."
  ([body-debug callback exists-value parameter]
   (phaser->clj
    (.callAllExists body-debug
                    (clj->phaser callback)
                    (clj->phaser exists-value)
                    (clj->phaser parameter)))))

(defn check-all
  "Quickly check that the same property across all children of this group is equal to the given value.

  This call doesn't descend down children, so if you have a Group inside of this group, the property will be checked on the group but not its children.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be checked.
    * check-alive (boolean) {optional} - If set then only children with alive=true will be checked. This includes any Groups that are children.
    * check-visible (boolean) {optional} - If set then only children with visible=true will be checked. This includes any Groups that are children.
    * force (boolean) {optional} - If `force` is true then the property will be checked on the child regardless if it already exists or not. If true and the property doesn't exist, false will be returned."
  ([body-debug key value]
   (phaser->clj
    (.checkAll body-debug
               (clj->phaser key)
               (clj->phaser value))))
  ([body-debug key value check-alive]
   (phaser->clj
    (.checkAll body-debug
               (clj->phaser key)
               (clj->phaser value)
               (clj->phaser check-alive))))
  ([body-debug key value check-alive check-visible]
   (phaser->clj
    (.checkAll body-debug
               (clj->phaser key)
               (clj->phaser value)
               (clj->phaser check-alive)
               (clj->phaser check-visible))))
  ([body-debug key value check-alive check-visible force]
   (phaser->clj
    (.checkAll body-debug
               (clj->phaser key)
               (clj->phaser value)
               (clj->phaser check-alive)
               (clj->phaser check-visible)
               (clj->phaser force)))))

(defn check-property
  "Checks a property for the given value on the child.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (any) - The child to check the property value on.
    * key (array) - An array of strings that make up the property that will be set.
    * value (any) - The value that will be checked.
    * force (boolean) {optional} - If `force` is true then the property will be checked on the child regardless if it already exists or not. If true and the property doesn't exist, false will be returned.

  Returns:  boolean - True if the property was was equal to value, false if not."
  ([body-debug child key value]
   (phaser->clj
    (.checkProperty body-debug
                    (clj->phaser child)
                    (clj->phaser key)
                    (clj->phaser value))))
  ([body-debug child key value force]
   (phaser->clj
    (.checkProperty body-debug
                    (clj->phaser child)
                    (clj->phaser key)
                    (clj->phaser value)
                    (clj->phaser force)))))

(defn count-dead
  "Get the number of dead children in this group.

  Returns:  integer - The number of children flagged as dead."
  ([body-debug]
   (phaser->clj
    (.countDead body-debug))))

(defn count-living
  "Get the number of living children in this group.

  Returns:  integer - The number of children flagged as alive."
  ([body-debug]
   (phaser->clj
    (.countLiving body-debug))))

(defn create
  "Creates a new Phaser.Sprite object and adds it to the top of this group.

  Use {@link Phaser.Group#classType classType} to change the type of object creaded.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * x (number) - The x coordinate to display the newly created Sprite at. The value is in relation to the group.x point.
    * y (number) - The y coordinate to display the newly created Sprite at. The value is in relation to the group.y point.
    * key (string) - The Game.cache key of the image that this Sprite will use.
    * frame (integer | string) {optional} - If the Sprite image contains multiple frames you can specify which one to use here.
    * exists (boolean) {optional} - The default exists state of the Sprite.

  Returns:  DisplayObject - The child that was created: will be a {@link Phaser.Sprite} unless {@link #classType} has been changed."
  ([body-debug x y key]
   (phaser->clj
    (.create body-debug
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key))))
  ([body-debug x y key frame]
   (phaser->clj
    (.create body-debug
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser frame))))
  ([body-debug x y key frame exists]
   (phaser->clj
    (.create body-debug
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
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * quantity (integer) - The number of Sprites to create.
    * key (string) - The Game.cache key of the image that this Sprite will use.
    * frame (integer | string) {optional} - If the Sprite image contains multiple frames you can specify which one to use here.
    * exists (boolean) {optional} - The default exists state of the Sprite."
  ([body-debug quantity key]
   (phaser->clj
    (.createMultiple body-debug
                     (clj->phaser quantity)
                     (clj->phaser key))))
  ([body-debug quantity key frame]
   (phaser->clj
    (.createMultiple body-debug
                     (clj->phaser quantity)
                     (clj->phaser key)
                     (clj->phaser frame))))
  ([body-debug quantity key frame exists]
   (phaser->clj
    (.createMultiple body-debug
                     (clj->phaser quantity)
                     (clj->phaser key)
                     (clj->phaser frame)
                     (clj->phaser exists)))))

(defn custom-sort
  "Sort the children in the group according to custom sort function.

  The `sortHandler` is provided the two parameters: the two children involved in the comparison (a and b).
  It should return -1 if `a > b`, 1 if `a < b` or 0 if `a === b`.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * sort-handler (function) - The custom sort function.
    * context (object) {optional} - The context in which the sortHandler is called."
  ([body-debug sort-handler]
   (phaser->clj
    (.customSort body-debug
                 (clj->phaser sort-handler))))
  ([body-debug sort-handler context]
   (phaser->clj
    (.customSort body-debug
                 (clj->phaser sort-handler)
                 (clj->phaser context)))))

(defn destroy
  "Destroys this group.

  Removes all children, then removes this group from its parent and nulls references.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * destroy-children (boolean) {optional} - If true `destroy` will be invoked on each removed child.
    * soft (boolean) {optional} - A 'soft destroy' (set to true) doesn't remove this group from its parent or null the game reference. Set to false and it does."
  ([body-debug]
   (phaser->clj
    (.destroy body-debug)))
  ([body-debug destroy-children]
   (phaser->clj
    (.destroy body-debug
              (clj->phaser destroy-children))))
  ([body-debug destroy-children soft]
   (phaser->clj
    (.destroy body-debug
              (clj->phaser destroy-children)
              (clj->phaser soft)))))

(defn divide-all
  "Divides the given property by the amount on all children in this group.

  `Group.divideAll('x', 2)` will half the child.x value for each child.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * property (string) - The property to divide, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to divide the property by. If child.x = 100 then divideAll('x', 2) would make child.x = 50.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([body-debug property amount check-alive check-visible]
   (phaser->clj
    (.divideAll body-debug
                (clj->phaser property)
                (clj->phaser amount)
                (clj->phaser check-alive)
                (clj->phaser check-visible)))))

(defn draw
  "Draws the P2 shapes to the Graphics object."
  ([body-debug]
   (phaser->clj
    (.draw body-debug))))

(defn filter
  "Find children matching a certain predicate.

  For example:

      var healthyList = Group.filter(function(child, index, children) {
          return child.health > 10 ? true : false;
      }, true);
      healthyList.callAll('attack');

  Note: Currently this will skip any children which are Groups themselves.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * predicate (function) - The function that each child will be evaluated against. Each child of the group will be passed to it as its first parameter, the index as the second, and the entire child array as the third
    * check-exists (boolean) {optional} - If true, only existing can be selected; otherwise all children can be selected and will be passed to the predicate.

  Returns:  Phaser.ArraySet - Returns an array list containing all the children that the predicate returned true for"
  ([body-debug predicate]
   (phaser->clj
    (.filter body-debug
             (clj->phaser predicate))))
  ([body-debug predicate check-exists]
   (phaser->clj
    (.filter body-debug
             (clj->phaser predicate)
             (clj->phaser check-exists)))))

(defn for-each
  "Call a function on each child in this group.

  Additional arguments for the callback can be specified after the `checkExists` parameter. For example,

      Group.forEach(awardBonusGold, this, true, 100, 500)

  would invoke `awardBonusGold` function with the parameters `(child, 100, 500)`.

  Note: This check will skip any children which are Groups themselves.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * check-exists (boolean) {optional} - If set only children matching for which `exists` is true will be passed to the callback, otherwise all children will be passed.
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([body-debug callback callback-context]
   (phaser->clj
    (.forEach body-debug
              (clj->phaser callback)
              (clj->phaser callback-context))))
  ([body-debug callback callback-context check-exists]
   (phaser->clj
    (.forEach body-debug
              (clj->phaser callback)
              (clj->phaser callback-context)
              (clj->phaser check-exists))))
  ([body-debug callback callback-context check-exists args]
   (phaser->clj
    (.forEach body-debug
              (clj->phaser callback)
              (clj->phaser callback-context)
              (clj->phaser check-exists)
              (clj->phaser args)))))

(defn for-each-alive
  "Call a function on each alive child in this group.

  See {@link Phaser.Group#forEach forEach} for details.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([body-debug callback callback-context]
   (phaser->clj
    (.forEachAlive body-debug
                   (clj->phaser callback)
                   (clj->phaser callback-context))))
  ([body-debug callback callback-context args]
   (phaser->clj
    (.forEachAlive body-debug
                   (clj->phaser callback)
                   (clj->phaser callback-context)
                   (clj->phaser args)))))

(defn for-each-dead
  "Call a function on each dead child in this group.

  See {@link Phaser.Group#forEach forEach} for details.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([body-debug callback callback-context]
   (phaser->clj
    (.forEachDead body-debug
                  (clj->phaser callback)
                  (clj->phaser callback-context))))
  ([body-debug callback callback-context args]
   (phaser->clj
    (.forEachDead body-debug
                  (clj->phaser callback)
                  (clj->phaser callback-context)
                  (clj->phaser args)))))

(defn for-each-exists
  "Call a function on each existing child in this group.

  See {@link Phaser.Group#forEach forEach} for details.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([body-debug callback callback-context]
   (phaser->clj
    (.forEachExists body-debug
                    (clj->phaser callback)
                    (clj->phaser callback-context))))
  ([body-debug callback callback-context args]
   (phaser->clj
    (.forEachExists body-debug
                    (clj->phaser callback)
                    (clj->phaser callback-context)
                    (clj->phaser args)))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([body-debug resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture body-debug
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-at
  "Returns the child found at the given index within this group.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * index (integer) - The index to return the child from.

  Returns:  [DisplayObject | integer] - The child that was found at the given index, or -1 for an invalid index."
  ([body-debug index]
   (phaser->clj
    (.getAt body-debug
            (clj->phaser index)))))

(defn get-bottom
  "Returns the child at the bottom of this group.

  The bottom child the child being displayed (rendered) below every other child.

  Returns:  any - The child at the bottom of the Group."
  ([body-debug]
   (phaser->clj
    (.getBottom body-debug))))

(defn get-bounds
  "Retrieves the bounds of the displayObjectContainer as a rectangle. The bounds calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([body-debug]
   (phaser->clj
    (.getBounds body-debug))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([body-debug index]
   (phaser->clj
    (.getChildAt body-debug
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([body-debug child]
   (phaser->clj
    (.getChildIndex body-debug
                    (clj->phaser child)))))

(defn get-first-alive
  "Get the first child that is alive (`child.alive === true`).

  This is handy for checking if everything has been wiped out, or choosing a squad leader, etc.

  Returns:  any - The first alive child, or null if none found."
  ([body-debug]
   (phaser->clj
    (.getFirstAlive body-debug))))

(defn get-first-dead
  "Get the first child that is dead (`child.alive === false`).

  This is handy for checking if everything has been wiped out, or choosing a squad leader, etc.

  Returns:  any - The first dead child, or null if none found."
  ([body-debug]
   (phaser->clj
    (.getFirstDead body-debug))))

(defn get-first-exists
  "Get the first display object that exists, or doesn't exist.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * exists (boolean) {optional} - If true, find the first existing child; otherwise find the first non-existing child.

  Returns:  any - The first child, or null if none found."
  ([body-debug]
   (phaser->clj
    (.getFirstExists body-debug)))
  ([body-debug exists]
   (phaser->clj
    (.getFirstExists body-debug
                     (clj->phaser exists)))))

(defn get-index
  "Get the index position of the given child in this group, which should match the child's `z` property.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (any) - The child to get the index for.

  Returns:  integer - The index of the child or -1 if it's not a member of this group."
  ([body-debug child]
   (phaser->clj
    (.getIndex body-debug
               (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([body-debug]
   (phaser->clj
    (.getLocalBounds body-debug))))

(defn get-random
  "Returns a random child from the group.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * start-index (integer) {optional} - Offset from the front of the front of the group (lowest child).
    * length (integer) {optional} - Restriction on the number of values you want to randomly select from.

  Returns:  any - A random child of this Group."
  ([body-debug]
   (phaser->clj
    (.getRandom body-debug)))
  ([body-debug start-index]
   (phaser->clj
    (.getRandom body-debug
                (clj->phaser start-index))))
  ([body-debug start-index length]
   (phaser->clj
    (.getRandom body-debug
                (clj->phaser start-index)
                (clj->phaser length)))))

(defn get-top
  "Return the child at the top of this group.

  The top child is the child displayed (rendered) above every other child.

  Returns:  any - The child at the top of the Group."
  ([body-debug]
   (phaser->clj
    (.getTop body-debug))))

(defn has-property
  "Checks if the child has the given property.

  Will scan up to 4 levels deep only.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (any) - The child to check for the existance of the property on.
    * key (Array.<string>) - An array of strings that make up the property.

  Returns:  boolean - True if the child has the property, otherwise false."
  ([body-debug child key]
   (phaser->clj
    (.hasProperty body-debug
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
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * key (string) - The child property to check, i.e. 'exists', 'alive', 'health'
    * value (any) - A child matches if `child[key] === value` is true.
    * return-type (integer) - How to iterate the children and what to return.
    * callback (function) {optional} - Optional function that will be called on each matching child. The matched child is supplied as the first argument.
    * callback-context (object) {optional} - The context in which the function should be called (usually 'this').
    * args (Array.<any>) {optional} - The arguments supplied to to the callback; the first array index (argument) will be replaced with the matched child.

  Returns:  any - Returns either an integer (for RETURN_TOTAL), the first matched child (for RETURN_CHILD), or null."
  ([body-debug key value return-type]
   (phaser->clj
    (.iterate body-debug
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type))))
  ([body-debug key value return-type callback]
   (phaser->clj
    (.iterate body-debug
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type)
              (clj->phaser callback))))
  ([body-debug key value return-type callback callback-context]
   (phaser->clj
    (.iterate body-debug
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type)
              (clj->phaser callback)
              (clj->phaser callback-context))))
  ([body-debug key value return-type callback callback-context args]
   (phaser->clj
    (.iterate body-debug
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type)
              (clj->phaser callback)
              (clj->phaser callback-context)
              (clj->phaser args)))))

(defn move-all
  "Moves all children from this Group to the Group given.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * group (Phaser.Group) - The new Group to which the children will be moved to.
    * silent (boolean) {optional} - If true the children will not dispatch the `onAddedToGroup` event for the new Group.

  Returns:  Phaser.Group - The Group to which all the children were moved."
  ([body-debug group]
   (phaser->clj
    (.moveAll body-debug
              (clj->phaser group))))
  ([body-debug group silent]
   (phaser->clj
    (.moveAll body-debug
              (clj->phaser group)
              (clj->phaser silent)))))

(defn move-down
  "Moves the given child down one place in this group unless it's already at the bottom.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (any) - The child to move down in the group.

  Returns:  any - The child that was moved."
  ([body-debug child]
   (phaser->clj
    (.moveDown body-debug
               (clj->phaser child)))))

(defn move-up
  "Moves the given child up one place in this group unless it's already at the top.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (any) - The child to move up in the group.

  Returns:  any - The child that was moved."
  ([body-debug child]
   (phaser->clj
    (.moveUp body-debug
             (clj->phaser child)))))

(defn multiply-all
  "Multiplies the given property by the amount on all children in this group.

  `Group.multiplyAll('x', 2)` will x2 the child.x value for each child.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * property (string) - The property to multiply, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to multiply the property by. If child.x = 10 then multiplyAll('x', 2) would make child.x = 20.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([body-debug property amount check-alive check-visible]
   (phaser->clj
    (.multiplyAll body-debug
                  (clj->phaser property)
                  (clj->phaser amount)
                  (clj->phaser check-alive)
                  (clj->phaser check-visible)))))

(defn next
  "Advances the group cursor to the next (higher) object in the group.

  If the cursor is at the end of the group (top child) it is moved the start of the group (bottom child).

  Returns:  any - The child the cursor now points to."
  ([body-debug]
   (phaser->clj
    (.next body-debug))))

(defn previous
  "Moves the group cursor to the previous (lower) child in the group.

  If the cursor is at the start of the group (bottom child) it is moved to the end (top child).

  Returns:  any - The child the cursor now points to."
  ([body-debug]
   (phaser->clj
    (.previous body-debug))))

(defn remove
  "Removes the given child from this group.

  This will dispatch an `onRemovedFromGroup` event from the child (if it has one), and optionally destroy the child.

  If the group cursor was referring to the removed child it is updated to refer to the next child.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (any) - The child to remove.
    * destroy (boolean) {optional} - If true `destroy` will be invoked on the removed child.
    * silent (boolean) {optional} - If true the the child will not dispatch the `onRemovedFromGroup` event.

  Returns:  boolean - true if the child was removed from this group, otherwise false."
  ([body-debug child]
   (phaser->clj
    (.remove body-debug
             (clj->phaser child))))
  ([body-debug child destroy]
   (phaser->clj
    (.remove body-debug
             (clj->phaser child)
             (clj->phaser destroy))))
  ([body-debug child destroy silent]
   (phaser->clj
    (.remove body-debug
             (clj->phaser child)
             (clj->phaser destroy)
             (clj->phaser silent)))))

(defn remove-all
  "Removes all children from this group, but does not remove the group from its parent.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * destroy (boolean) {optional} - If true `destroy` will be invoked on each removed child.
    * silent (boolean) {optional} - If true the children will not dispatch their `onRemovedFromGroup` events."
  ([body-debug]
   (phaser->clj
    (.removeAll body-debug)))
  ([body-debug destroy]
   (phaser->clj
    (.removeAll body-debug
                (clj->phaser destroy))))
  ([body-debug destroy silent]
   (phaser->clj
    (.removeAll body-debug
                (clj->phaser destroy)
                (clj->phaser silent)))))

(defn remove-between
  "Removes all children from this group whose index falls beteen the given startIndex and endIndex values.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * start-index (integer) - The index to start removing children from.
    * end-index (integer) {optional} - The index to stop removing children at. Must be higher than startIndex. If undefined this method will remove all children between startIndex and the end of the group.
    * destroy (boolean) {optional} - If true `destroy` will be invoked on each removed child.
    * silent (boolean) {optional} - If true the children will not dispatch their `onRemovedFromGroup` events."
  ([body-debug start-index]
   (phaser->clj
    (.removeBetween body-debug
                    (clj->phaser start-index))))
  ([body-debug start-index end-index]
   (phaser->clj
    (.removeBetween body-debug
                    (clj->phaser start-index)
                    (clj->phaser end-index))))
  ([body-debug start-index end-index destroy]
   (phaser->clj
    (.removeBetween body-debug
                    (clj->phaser start-index)
                    (clj->phaser end-index)
                    (clj->phaser destroy))))
  ([body-debug start-index end-index destroy silent]
   (phaser->clj
    (.removeBetween body-debug
                    (clj->phaser start-index)
                    (clj->phaser end-index)
                    (clj->phaser destroy)
                    (clj->phaser silent)))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([body-debug child]
   (phaser->clj
    (.removeChild body-debug
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([body-debug index]
   (phaser->clj
    (.removeChildAt body-debug
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([body-debug begin-index end-index]
   (phaser->clj
    (.removeChildren body-debug
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-from-hash
  "Removes a child of this Group from the hash array.
  This call will return false if the child is not in the hash.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (DisplayObject) - The display object to remove from this Groups hash. Must be a member of this Group and in the hash.

  Returns:  boolean - True if the child was successfully removed from the hash, otherwise false."
  ([body-debug child]
   (phaser->clj
    (.removeFromHash body-debug
                     (clj->phaser child)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([body-debug]
   (phaser->clj
    (.removeStageReference body-debug))))

(defn replace
  "Replaces a child of this group with the given newChild. The newChild cannot be a member of this group.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * old-child (any) - The child in this group that will be replaced.
    * new-child (any) - The child to be inserted into this group.

  Returns:  any - Returns the oldChild that was replaced within this group."
  ([body-debug old-child new-child]
   (phaser->clj
    (.replace body-debug
              (clj->phaser old-child)
              (clj->phaser new-child)))))

(defn reset-cursor
  "Sets the group cursor to the first child in the group.

  If the optional index parameter is given it sets the cursor to the object at that index instead.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * index (integer) {optional} - Set the cursor to point to a specific index.

  Returns:  any - The child the cursor now points to."
  ([body-debug]
   (phaser->clj
    (.resetCursor body-debug)))
  ([body-debug index]
   (phaser->clj
    (.resetCursor body-debug
                  (clj->phaser index)))))

(defn reverse
  "Reverses all children in this group.

  This operaation applies only to immediate children and does not propagate to subgroups."
  ([body-debug]
   (phaser->clj
    (.reverse body-debug))))

(defn send-to-back
  "Sends the given child to the bottom of this group so it renders below all other children.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (any) - The child to send to the bottom of this group.

  Returns:  any - The child that was moved."
  ([body-debug child]
   (phaser->clj
    (.sendToBack body-debug
                 (clj->phaser child)))))

(defn set
  "Quickly set a property on a single child of this group to a new value.

  The operation parameter controls how the new value is assigned to the property, from simple replacement to addition and multiplication.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (Phaser.Sprite) - The child to set the property on.
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be set.
    * check-alive (boolean) {optional} - If set then the child will only be updated if alive=true.
    * check-visible (boolean) {optional} - If set then the child will only be updated if visible=true.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set.

  Returns:  boolean - True if the property was set, false if not."
  ([body-debug child key value]
   (phaser->clj
    (.set body-debug
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value))))
  ([body-debug child key value check-alive]
   (phaser->clj
    (.set body-debug
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive))))
  ([body-debug child key value check-alive check-visible]
   (phaser->clj
    (.set body-debug
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive)
          (clj->phaser check-visible))))
  ([body-debug child key value check-alive check-visible operation]
   (phaser->clj
    (.set body-debug
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive)
          (clj->phaser check-visible)
          (clj->phaser operation))))
  ([body-debug child key value check-alive check-visible operation force]
   (phaser->clj
    (.set body-debug
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
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be set.
    * check-alive (boolean) {optional} - If set then only children with alive=true will be updated. This includes any Groups that are children.
    * check-visible (boolean) {optional} - If set then only children with visible=true will be updated. This includes any Groups that are children.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set."
  ([body-debug key value]
   (phaser->clj
    (.setAll body-debug
             (clj->phaser key)
             (clj->phaser value))))
  ([body-debug key value check-alive]
   (phaser->clj
    (.setAll body-debug
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive))))
  ([body-debug key value check-alive check-visible]
   (phaser->clj
    (.setAll body-debug
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive)
             (clj->phaser check-visible))))
  ([body-debug key value check-alive check-visible operation]
   (phaser->clj
    (.setAll body-debug
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive)
             (clj->phaser check-visible)
             (clj->phaser operation))))
  ([body-debug key value check-alive check-visible operation force]
   (phaser->clj
    (.setAll body-debug
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
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be set.
    * check-alive (boolean) {optional} - If set then only children with alive=true will be updated. This includes any Groups that are children.
    * check-visible (boolean) {optional} - If set then only children with visible=true will be updated. This includes any Groups that are children.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set."
  ([body-debug key value]
   (phaser->clj
    (.setAllChildren body-debug
                     (clj->phaser key)
                     (clj->phaser value))))
  ([body-debug key value check-alive]
   (phaser->clj
    (.setAllChildren body-debug
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive))))
  ([body-debug key value check-alive check-visible]
   (phaser->clj
    (.setAllChildren body-debug
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive)
                     (clj->phaser check-visible))))
  ([body-debug key value check-alive check-visible operation]
   (phaser->clj
    (.setAllChildren body-debug
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive)
                     (clj->phaser check-visible)
                     (clj->phaser operation))))
  ([body-debug key value check-alive check-visible operation force]
   (phaser->clj
    (.setAllChildren body-debug
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive)
                     (clj->phaser check-visible)
                     (clj->phaser operation)
                     (clj->phaser force)))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([body-debug child index]
   (phaser->clj
    (.setChildIndex body-debug
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
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (any) - The child to set the property value on.
    * key (array) - An array of strings that make up the property that will be set.
    * value (any) - The value that will be set.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set.

  Returns:  boolean - True if the property was set, false if not."
  ([body-debug child key value]
   (phaser->clj
    (.setProperty body-debug
                  (clj->phaser child)
                  (clj->phaser key)
                  (clj->phaser value))))
  ([body-debug child key value operation]
   (phaser->clj
    (.setProperty body-debug
                  (clj->phaser child)
                  (clj->phaser key)
                  (clj->phaser value)
                  (clj->phaser operation))))
  ([body-debug child key value operation force]
   (phaser->clj
    (.setProperty body-debug
                  (clj->phaser child)
                  (clj->phaser key)
                  (clj->phaser value)
                  (clj->phaser operation)
                  (clj->phaser force)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([body-debug stage]
   (phaser->clj
    (.setStageReference body-debug
                        (clj->phaser stage)))))

(defn sort
  "Sort the children in the group according to a particular key and ordering.

  Call this function to sort the group according to a particular key value and order.
  For example to depth sort Sprites for Zelda-style game you might call `group.sort('y', Phaser.Group.SORT_ASCENDING)` at the bottom of your `State.update()`.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * key (string) {optional} - The name of the property to sort on. Defaults to the objects z-depth value.
    * order (integer) {optional} - Order ascending ({@link Phaser.Group.SORT_ASCENDING SORT_ASCENDING}) or descending ({@link Phaser.Group.SORT_DESCENDING SORT_DESCENDING})."
  ([body-debug]
   (phaser->clj
    (.sort body-debug)))
  ([body-debug key]
   (phaser->clj
    (.sort body-debug
           (clj->phaser key))))
  ([body-debug key order]
   (phaser->clj
    (.sort body-debug
           (clj->phaser key)
           (clj->phaser order)))))

(defn sub-all
  "Subtracts the amount from the given property on all children in this group.

  `Group.subAll('x', 10)` will minus 10 from the child.x value for each child.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * property (string) - The property to decrement, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to subtract from the property. If child.x = 50 then subAll('x', 40) would make child.x = 10.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([body-debug property amount check-alive check-visible]
   (phaser->clj
    (.subAll body-debug
             (clj->phaser property)
             (clj->phaser amount)
             (clj->phaser check-alive)
             (clj->phaser check-visible)))))

(defn swap
  "Swaps the position of two children in this group.

  Both children must be in this group, a child cannot be swapped with itself, and unparented children cannot be swapped.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child-1 (any) - The first child to swap.
    * child-2 (any) - The second child to swap."
  ([body-debug child-1 child-2]
   (phaser->clj
    (.swap body-debug
           (clj->phaser child-1)
           (clj->phaser child-2)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([body-debug child child-2]
   (phaser->clj
    (.swapChildren body-debug
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([body-debug position]
   (phaser->clj
    (.toGlobal body-debug
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([body-debug position]
   (phaser->clj
    (.toLocal body-debug
              (clj->phaser position))))
  ([body-debug position from]
   (phaser->clj
    (.toLocal body-debug
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([body-debug]
   (phaser->clj
    (.updateCache body-debug))))

(defn update-sprite-transform
  "Core update."
  ([body-debug]
   (phaser->clj
    (.updateSpriteTransform body-debug))))

(defn xy
  "Positions the child found at the given index within this group to the given x and y coordinates.

  Parameters:
    * body-debug (Phaser.Physics.P2.BodyDebug) - Targeted instance for method
    * index (integer) - The index of the child in the group to set the position of.
    * x (number) - The new x position of the child.
    * y (number) - The new y position of the child."
  ([body-debug index x y]
   (phaser->clj
    (.xy body-debug
         (clj->phaser index)
         (clj->phaser x)
         (clj->phaser y)))))