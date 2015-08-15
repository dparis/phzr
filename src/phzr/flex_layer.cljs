(ns phzr.flex-layer
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [next reverse replace set filter sort iterate remove]))

(defn ->FlexLayer
  "WARNING: This is an EXPERIMENTAL class. The API will change significantly in the coming versions and is incomplete.
  Please try to avoid using in production games with a long time to build.
  This is also why the documentation is incomplete.

  A responsive grid layer.

  Parameters:
    * manager (Phaser.FlexGrid) - The FlexGrid that owns this FlexLayer.
    * position (Phaser.Point) - A reference to the Point object used for positioning.
    * bounds (Phaser.Rectangle) - A reference to the Rectangle used for the layer bounds.
    * scale (Phaser.Point) - A reference to the Point object used for layer scaling."
  ([manager position bounds scale]
   (js/Phaser.FlexLayer. (clj->phaser manager)
                         (clj->phaser position)
                         (clj->phaser bounds)
                         (clj->phaser scale))))

(defn add
  "Adds an existing object as the top child in this group.

  The child is automatically added to the top of the group and is displayed on top of every previous child.

  If Group.enableBody is set then a physics body will be created on the object, so long as one does not already exist.

  Use {@link Phaser.Group#addAt addAt} to control where a child is added. Use {@link Phaser.Group#create create} to create and add a new child.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (DisplayObject) - The display object to add as a child.
    * silent (boolean) {optional} - If true the child will not dispatch the `onAddedToGroup` event.

  Returns:  DisplayObject - The child that was added to the group."
  ([flex-layer child]
   (phaser->clj
    (.add flex-layer
          (clj->phaser child))))
  ([flex-layer child silent]
   (phaser->clj
    (.add flex-layer
          (clj->phaser child)
          (clj->phaser silent)))))

(defn add-all
  "Adds the amount to the given property on all children in this group.

  `Group.addAll('x', 10)` will add 10 to the child.x value for each child.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * property (string) - The property to increment, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to increment the property by. If child.x = 10 then addAll('x', 40) would make child.x = 50.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([flex-layer property amount check-alive check-visible]
   (phaser->clj
    (.addAll flex-layer
             (clj->phaser property)
             (clj->phaser amount)
             (clj->phaser check-alive)
             (clj->phaser check-visible)))))

(defn add-at
  "Adds an existing object to this group.

  The child is added to the group at the location specified by the index value, this allows you to control child ordering.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (DisplayObject) - The display object to add as a child.
    * index (integer) {optional} - The index within the group to insert the child to.
    * silent (boolean) {optional} - If true the child will not dispatch the `onAddedToGroup` event.

  Returns:  DisplayObject - The child that was added to the group."
  ([flex-layer child]
   (phaser->clj
    (.addAt flex-layer
            (clj->phaser child))))
  ([flex-layer child index]
   (phaser->clj
    (.addAt flex-layer
            (clj->phaser child)
            (clj->phaser index))))
  ([flex-layer child index silent]
   (phaser->clj
    (.addAt flex-layer
            (clj->phaser child)
            (clj->phaser index)
            (clj->phaser silent)))))

(defn add-child
  "Adds a child to the container.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to add to the container

  Returns:  PIXI.DisplayObject - The child that was added."
  ([flex-layer child]
   (phaser->clj
    (.addChild flex-layer
               (clj->phaser child)))))

(defn add-child-at
  "Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child to add
    * index (Number) - The index to place the child in

  Returns:  PIXI.DisplayObject - The child that was added."
  ([flex-layer child index]
   (phaser->clj
    (.addChildAt flex-layer
                 (clj->phaser child)
                 (clj->phaser index)))))

(defn add-multiple
  "Adds an array of existing Display Objects to this Group.

  The Display Objects are automatically added to the top of this Group, and will render on-top of everything already in this Group.

  As well as an array you can also pass another Group as the first argument. In this case all of the children from that
  Group will be removed from it and added into this Group.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * children (Array.<DisplayObject> | Phaser.Group) - An array of display objects or a Phaser.Group. If a Group is given then *all* children will be moved from it.
    * silent (boolean) {optional} - If true the children will not dispatch the `onAddedToGroup` event.

  Returns:  [Array.<DisplayObject> | Phaser.Group] - The array of children or Group of children that were added to this Group."
  ([flex-layer children]
   (phaser->clj
    (.addMultiple flex-layer
                  (clj->phaser children))))
  ([flex-layer children silent]
   (phaser->clj
    (.addMultiple flex-layer
                  (clj->phaser children)
                  (clj->phaser silent)))))

(defn add-to-hash
  "Adds a child of this Group into the hash array.
  This call will return false if the child is not a child of this Group, or is already in the hash.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (DisplayObject) - The display object to add to this Groups hash. Must be a member of this Group already and not present in the hash.

  Returns:  boolean - True if the child was successfully added to the hash, otherwise false."
  ([flex-layer child]
   (phaser->clj
    (.addToHash flex-layer
                (clj->phaser child)))))

(defn bring-to-top
  "Brings the given child to the top of this group so it renders above all other children.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (any) - The child to bring to the top of this group.

  Returns:  any - The child that was moved."
  ([flex-layer child]
   (phaser->clj
    (.bringToTop flex-layer
                 (clj->phaser child)))))

(defn call-all
  "Calls a function, specified by name, on all on children.

  The function is called for all children regardless if they are dead or alive (see callAllExists for different options).
  After the method parameter and context you can add as many extra parameters as you like, which will all be passed to the child.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * method (string) - Name of the function on the child to call. Deep property lookup is supported.
    * context (string) {optional} - A string containing the context under which the method will be executed. Set to null to default to the child.
    * args (any) - Additional parameters that will be passed to the method."
  ([flex-layer method args]
   (phaser->clj
    (.callAll flex-layer
              (clj->phaser method)
              (clj->phaser args))))
  ([flex-layer method args context]
   (phaser->clj
    (.callAll flex-layer
              (clj->phaser method)
              (clj->phaser args)
              (clj->phaser context)))))

(defn call-all-exists
  "Calls a function, specified by name, on all children in the group who exist (or do not exist).

  After the existsValue parameter you can add as many parameters as you like, which will all be passed to the child callback.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * callback (string) - Name of the function on the children to call.
    * exists-value (boolean) - Only children with exists=existsValue will be called.
    * parameter (any) - Additional parameters that will be passed to the callback."
  ([flex-layer callback exists-value parameter]
   (phaser->clj
    (.callAllExists flex-layer
                    (clj->phaser callback)
                    (clj->phaser exists-value)
                    (clj->phaser parameter)))))

(defn check-all
  "Quickly check that the same property across all children of this group is equal to the given value.

  This call doesn't descend down children, so if you have a Group inside of this group, the property will be checked on the group but not its children.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be checked.
    * check-alive (boolean) {optional} - If set then only children with alive=true will be checked. This includes any Groups that are children.
    * check-visible (boolean) {optional} - If set then only children with visible=true will be checked. This includes any Groups that are children.
    * force (boolean) {optional} - If `force` is true then the property will be checked on the child regardless if it already exists or not. If true and the property doesn't exist, false will be returned."
  ([flex-layer key value]
   (phaser->clj
    (.checkAll flex-layer
               (clj->phaser key)
               (clj->phaser value))))
  ([flex-layer key value check-alive]
   (phaser->clj
    (.checkAll flex-layer
               (clj->phaser key)
               (clj->phaser value)
               (clj->phaser check-alive))))
  ([flex-layer key value check-alive check-visible]
   (phaser->clj
    (.checkAll flex-layer
               (clj->phaser key)
               (clj->phaser value)
               (clj->phaser check-alive)
               (clj->phaser check-visible))))
  ([flex-layer key value check-alive check-visible force]
   (phaser->clj
    (.checkAll flex-layer
               (clj->phaser key)
               (clj->phaser value)
               (clj->phaser check-alive)
               (clj->phaser check-visible)
               (clj->phaser force)))))

(defn check-property
  "Checks a property for the given value on the child.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (any) - The child to check the property value on.
    * key (array) - An array of strings that make up the property that will be set.
    * value (any) - The value that will be checked.
    * force (boolean) {optional} - If `force` is true then the property will be checked on the child regardless if it already exists or not. If true and the property doesn't exist, false will be returned.

  Returns:  boolean - True if the property was was equal to value, false if not."
  ([flex-layer child key value]
   (phaser->clj
    (.checkProperty flex-layer
                    (clj->phaser child)
                    (clj->phaser key)
                    (clj->phaser value))))
  ([flex-layer child key value force]
   (phaser->clj
    (.checkProperty flex-layer
                    (clj->phaser child)
                    (clj->phaser key)
                    (clj->phaser value)
                    (clj->phaser force)))))

(defn count-dead
  "Get the number of dead children in this group.

  Returns:  integer - The number of children flagged as dead."
  ([flex-layer]
   (phaser->clj
    (.countDead flex-layer))))

(defn count-living
  "Get the number of living children in this group.

  Returns:  integer - The number of children flagged as alive."
  ([flex-layer]
   (phaser->clj
    (.countLiving flex-layer))))

(defn create
  "Creates a new Phaser.Sprite object and adds it to the top of this group.

  Use {@link Phaser.Group#classType classType} to change the type of object creaded.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * x (number) - The x coordinate to display the newly created Sprite at. The value is in relation to the group.x point.
    * y (number) - The y coordinate to display the newly created Sprite at. The value is in relation to the group.y point.
    * key (string) - The Game.cache key of the image that this Sprite will use.
    * frame (integer | string) {optional} - If the Sprite image contains multiple frames you can specify which one to use here.
    * exists (boolean) {optional} - The default exists state of the Sprite.

  Returns:  DisplayObject - The child that was created: will be a {@link Phaser.Sprite} unless {@link #classType} has been changed."
  ([flex-layer x y key]
   (phaser->clj
    (.create flex-layer
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key))))
  ([flex-layer x y key frame]
   (phaser->clj
    (.create flex-layer
             (clj->phaser x)
             (clj->phaser y)
             (clj->phaser key)
             (clj->phaser frame))))
  ([flex-layer x y key frame exists]
   (phaser->clj
    (.create flex-layer
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
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * quantity (integer) - The number of Sprites to create.
    * key (string) - The Game.cache key of the image that this Sprite will use.
    * frame (integer | string) {optional} - If the Sprite image contains multiple frames you can specify which one to use here.
    * exists (boolean) {optional} - The default exists state of the Sprite."
  ([flex-layer quantity key]
   (phaser->clj
    (.createMultiple flex-layer
                     (clj->phaser quantity)
                     (clj->phaser key))))
  ([flex-layer quantity key frame]
   (phaser->clj
    (.createMultiple flex-layer
                     (clj->phaser quantity)
                     (clj->phaser key)
                     (clj->phaser frame))))
  ([flex-layer quantity key frame exists]
   (phaser->clj
    (.createMultiple flex-layer
                     (clj->phaser quantity)
                     (clj->phaser key)
                     (clj->phaser frame)
                     (clj->phaser exists)))))

(defn custom-sort
  "Sort the children in the group according to custom sort function.

  The `sortHandler` is provided the two parameters: the two children involved in the comparison (a and b).
  It should return -1 if `a > b`, 1 if `a < b` or 0 if `a === b`.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * sort-handler (function) - The custom sort function.
    * context (object) {optional} - The context in which the sortHandler is called."
  ([flex-layer sort-handler]
   (phaser->clj
    (.customSort flex-layer
                 (clj->phaser sort-handler))))
  ([flex-layer sort-handler context]
   (phaser->clj
    (.customSort flex-layer
                 (clj->phaser sort-handler)
                 (clj->phaser context)))))

(defn debug
  "Debug."
  ([flex-layer]
   (phaser->clj
    (.debug flex-layer))))

(defn destroy
  "Destroys this group.

  Removes all children, then removes this group from its parent and nulls references.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * destroy-children (boolean) {optional} - If true `destroy` will be invoked on each removed child.
    * soft (boolean) {optional} - A 'soft destroy' (set to true) doesn't remove this group from its parent or null the game reference. Set to false and it does."
  ([flex-layer]
   (phaser->clj
    (.destroy flex-layer)))
  ([flex-layer destroy-children]
   (phaser->clj
    (.destroy flex-layer
              (clj->phaser destroy-children))))
  ([flex-layer destroy-children soft]
   (phaser->clj
    (.destroy flex-layer
              (clj->phaser destroy-children)
              (clj->phaser soft)))))

(defn divide-all
  "Divides the given property by the amount on all children in this group.

  `Group.divideAll('x', 2)` will half the child.x value for each child.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * property (string) - The property to divide, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to divide the property by. If child.x = 100 then divideAll('x', 2) would make child.x = 50.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([flex-layer property amount check-alive check-visible]
   (phaser->clj
    (.divideAll flex-layer
                (clj->phaser property)
                (clj->phaser amount)
                (clj->phaser check-alive)
                (clj->phaser check-visible)))))

(defn filter
  "Find children matching a certain predicate.

  For example:

      var healthyList = Group.filter(function(child, index, children) {
          return child.health > 10 ? true : false;
      }, true);
      healthyList.callAll('attack');

  Note: Currently this will skip any children which are Groups themselves.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * predicate (function) - The function that each child will be evaluated against. Each child of the group will be passed to it as its first parameter, the index as the second, and the entire child array as the third
    * check-exists (boolean) {optional} - If true, only existing can be selected; otherwise all children can be selected and will be passed to the predicate.

  Returns:  Phaser.ArraySet - Returns an array list containing all the children that the predicate returned true for"
  ([flex-layer predicate]
   (phaser->clj
    (.filter flex-layer
             (clj->phaser predicate))))
  ([flex-layer predicate check-exists]
   (phaser->clj
    (.filter flex-layer
             (clj->phaser predicate)
             (clj->phaser check-exists)))))

(defn for-each
  "Call a function on each child in this group.

  Additional arguments for the callback can be specified after the `checkExists` parameter. For example,

      Group.forEach(awardBonusGold, this, true, 100, 500)

  would invoke `awardBonusGold` function with the parameters `(child, 100, 500)`.

  Note: This check will skip any children which are Groups themselves.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * check-exists (boolean) {optional} - If set only children matching for which `exists` is true will be passed to the callback, otherwise all children will be passed.
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([flex-layer callback callback-context]
   (phaser->clj
    (.forEach flex-layer
              (clj->phaser callback)
              (clj->phaser callback-context))))
  ([flex-layer callback callback-context check-exists]
   (phaser->clj
    (.forEach flex-layer
              (clj->phaser callback)
              (clj->phaser callback-context)
              (clj->phaser check-exists))))
  ([flex-layer callback callback-context check-exists args]
   (phaser->clj
    (.forEach flex-layer
              (clj->phaser callback)
              (clj->phaser callback-context)
              (clj->phaser check-exists)
              (clj->phaser args)))))

(defn for-each-alive
  "Call a function on each alive child in this group.

  See {@link Phaser.Group#forEach forEach} for details.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([flex-layer callback callback-context]
   (phaser->clj
    (.forEachAlive flex-layer
                   (clj->phaser callback)
                   (clj->phaser callback-context))))
  ([flex-layer callback callback-context args]
   (phaser->clj
    (.forEachAlive flex-layer
                   (clj->phaser callback)
                   (clj->phaser callback-context)
                   (clj->phaser args)))))

(defn for-each-dead
  "Call a function on each dead child in this group.

  See {@link Phaser.Group#forEach forEach} for details.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([flex-layer callback callback-context]
   (phaser->clj
    (.forEachDead flex-layer
                  (clj->phaser callback)
                  (clj->phaser callback-context))))
  ([flex-layer callback callback-context args]
   (phaser->clj
    (.forEachDead flex-layer
                  (clj->phaser callback)
                  (clj->phaser callback-context)
                  (clj->phaser args)))))

(defn for-each-exists
  "Call a function on each existing child in this group.

  See {@link Phaser.Group#forEach forEach} for details.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * callback (function) - The function that will be called for each applicable child. The child will be passed as the first argument.
    * callback-context (object) - The context in which the function should be called (usually 'this').
    * args (any) {optional} - Additional arguments to pass to the callback function, after the child item."
  ([flex-layer callback callback-context]
   (phaser->clj
    (.forEachExists flex-layer
                    (clj->phaser callback)
                    (clj->phaser callback-context))))
  ([flex-layer callback callback-context args]
   (phaser->clj
    (.forEachExists flex-layer
                    (clj->phaser callback)
                    (clj->phaser callback-context)
                    (clj->phaser args)))))

(defn generate-texture
  "Useful function that returns a texture of the displayObject object that can then be used to create sprites
  This can be quite useful if your displayObject is static / complicated and needs to be reused multiple times.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * resolution (Number) - The resolution of the texture being generated
    * scale-mode (Number) - See PIXI.scaleModes for possible values
    * renderer (PIXI.CanvasRenderer | PIXI.WebGLRenderer) - The renderer used to generate the texture.

  Returns:  PIXI.Texture - a texture of the graphics object"
  ([flex-layer resolution scale-mode renderer]
   (phaser->clj
    (.generateTexture flex-layer
                      (clj->phaser resolution)
                      (clj->phaser scale-mode)
                      (clj->phaser renderer)))))

(defn get-at
  "Returns the child found at the given index within this group.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * index (integer) - The index to return the child from.

  Returns:  [DisplayObject | integer] - The child that was found at the given index, or -1 for an invalid index."
  ([flex-layer index]
   (phaser->clj
    (.getAt flex-layer
            (clj->phaser index)))))

(defn get-bottom
  "Returns the child at the bottom of this group.

  The bottom child the child being displayed (rendered) below every other child.

  Returns:  any - The child at the bottom of the Group."
  ([flex-layer]
   (phaser->clj
    (.getBottom flex-layer))))

(defn get-bounds
  "Retrieves the bounds of the displayObjectContainer as a rectangle. The bounds calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([flex-layer]
   (phaser->clj
    (.getBounds flex-layer))))

(defn get-child-at
  "Returns the child at the specified index

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child at the given index, if any."
  ([flex-layer index]
   (phaser->clj
    (.getChildAt flex-layer
                 (clj->phaser index)))))

(defn get-child-index
  "Returns the index position of a child DisplayObject instance

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject instance to identify

  Returns:  Number - The index position of the child display object to identify"
  ([flex-layer child]
   (phaser->clj
    (.getChildIndex flex-layer
                    (clj->phaser child)))))

(defn get-first-alive
  "Get the first child that is alive (`child.alive === true`).

  This is handy for checking if everything has been wiped out, or choosing a squad leader, etc.

  Returns:  any - The first alive child, or null if none found."
  ([flex-layer]
   (phaser->clj
    (.getFirstAlive flex-layer))))

(defn get-first-dead
  "Get the first child that is dead (`child.alive === false`).

  This is handy for checking if everything has been wiped out, or choosing a squad leader, etc.

  Returns:  any - The first dead child, or null if none found."
  ([flex-layer]
   (phaser->clj
    (.getFirstDead flex-layer))))

(defn get-first-exists
  "Get the first display object that exists, or doesn't exist.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * exists (boolean) {optional} - If true, find the first existing child; otherwise find the first non-existing child.

  Returns:  any - The first child, or null if none found."
  ([flex-layer]
   (phaser->clj
    (.getFirstExists flex-layer)))
  ([flex-layer exists]
   (phaser->clj
    (.getFirstExists flex-layer
                     (clj->phaser exists)))))

(defn get-index
  "Get the index position of the given child in this group, which should match the child's `z` property.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (any) - The child to get the index for.

  Returns:  integer - The index of the child or -1 if it's not a member of this group."
  ([flex-layer child]
   (phaser->clj
    (.getIndex flex-layer
               (clj->phaser child)))))

(defn get-local-bounds
  "Retrieves the non-global local bounds of the displayObjectContainer as a rectangle. The calculation takes all visible children into consideration.

  Returns:  Rectangle - The rectangular bounding area"
  ([flex-layer]
   (phaser->clj
    (.getLocalBounds flex-layer))))

(defn get-random
  "Returns a random child from the group.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * start-index (integer) {optional} - Offset from the front of the front of the group (lowest child).
    * length (integer) {optional} - Restriction on the number of values you want to randomly select from.

  Returns:  any - A random child of this Group."
  ([flex-layer]
   (phaser->clj
    (.getRandom flex-layer)))
  ([flex-layer start-index]
   (phaser->clj
    (.getRandom flex-layer
                (clj->phaser start-index))))
  ([flex-layer start-index length]
   (phaser->clj
    (.getRandom flex-layer
                (clj->phaser start-index)
                (clj->phaser length)))))

(defn get-top
  "Return the child at the top of this group.

  The top child is the child displayed (rendered) above every other child.

  Returns:  any - The child at the top of the Group."
  ([flex-layer]
   (phaser->clj
    (.getTop flex-layer))))

(defn has-property
  "Checks if the child has the given property.

  Will scan up to 4 levels deep only.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (any) - The child to check for the existance of the property on.
    * key (Array.<string>) - An array of strings that make up the property.

  Returns:  boolean - True if the child has the property, otherwise false."
  ([flex-layer child key]
   (phaser->clj
    (.hasProperty flex-layer
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
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * key (string) - The child property to check, i.e. 'exists', 'alive', 'health'
    * value (any) - A child matches if `child[key] === value` is true.
    * return-type (integer) - How to iterate the children and what to return.
    * callback (function) {optional} - Optional function that will be called on each matching child. The matched child is supplied as the first argument.
    * callback-context (object) {optional} - The context in which the function should be called (usually 'this').
    * args (Array.<any>) {optional} - The arguments supplied to to the callback; the first array index (argument) will be replaced with the matched child.

  Returns:  any - Returns either an integer (for RETURN_TOTAL), the first matched child (for RETURN_CHILD), or null."
  ([flex-layer key value return-type]
   (phaser->clj
    (.iterate flex-layer
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type))))
  ([flex-layer key value return-type callback]
   (phaser->clj
    (.iterate flex-layer
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type)
              (clj->phaser callback))))
  ([flex-layer key value return-type callback callback-context]
   (phaser->clj
    (.iterate flex-layer
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type)
              (clj->phaser callback)
              (clj->phaser callback-context))))
  ([flex-layer key value return-type callback callback-context args]
   (phaser->clj
    (.iterate flex-layer
              (clj->phaser key)
              (clj->phaser value)
              (clj->phaser return-type)
              (clj->phaser callback)
              (clj->phaser callback-context)
              (clj->phaser args)))))

(defn move-all
  "Moves all children from this Group to the Group given.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * group (Phaser.Group) - The new Group to which the children will be moved to.
    * silent (boolean) {optional} - If true the children will not dispatch the `onAddedToGroup` event for the new Group.

  Returns:  Phaser.Group - The Group to which all the children were moved."
  ([flex-layer group]
   (phaser->clj
    (.moveAll flex-layer
              (clj->phaser group))))
  ([flex-layer group silent]
   (phaser->clj
    (.moveAll flex-layer
              (clj->phaser group)
              (clj->phaser silent)))))

(defn move-down
  "Moves the given child down one place in this group unless it's already at the bottom.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (any) - The child to move down in the group.

  Returns:  any - The child that was moved."
  ([flex-layer child]
   (phaser->clj
    (.moveDown flex-layer
               (clj->phaser child)))))

(defn move-up
  "Moves the given child up one place in this group unless it's already at the top.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (any) - The child to move up in the group.

  Returns:  any - The child that was moved."
  ([flex-layer child]
   (phaser->clj
    (.moveUp flex-layer
             (clj->phaser child)))))

(defn multiply-all
  "Multiplies the given property by the amount on all children in this group.

  `Group.multiplyAll('x', 2)` will x2 the child.x value for each child.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * property (string) - The property to multiply, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to multiply the property by. If child.x = 10 then multiplyAll('x', 2) would make child.x = 20.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([flex-layer property amount check-alive check-visible]
   (phaser->clj
    (.multiplyAll flex-layer
                  (clj->phaser property)
                  (clj->phaser amount)
                  (clj->phaser check-alive)
                  (clj->phaser check-visible)))))

(defn next
  "Advances the group cursor to the next (higher) object in the group.

  If the cursor is at the end of the group (top child) it is moved the start of the group (bottom child).

  Returns:  any - The child the cursor now points to."
  ([flex-layer]
   (phaser->clj
    (.next flex-layer))))

(defn previous
  "Moves the group cursor to the previous (lower) child in the group.

  If the cursor is at the start of the group (bottom child) it is moved to the end (top child).

  Returns:  any - The child the cursor now points to."
  ([flex-layer]
   (phaser->clj
    (.previous flex-layer))))

(defn remove
  "Removes the given child from this group.

  This will dispatch an `onRemovedFromGroup` event from the child (if it has one), and optionally destroy the child.

  If the group cursor was referring to the removed child it is updated to refer to the next child.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (any) - The child to remove.
    * destroy (boolean) {optional} - If true `destroy` will be invoked on the removed child.
    * silent (boolean) {optional} - If true the the child will not dispatch the `onRemovedFromGroup` event.

  Returns:  boolean - true if the child was removed from this group, otherwise false."
  ([flex-layer child]
   (phaser->clj
    (.remove flex-layer
             (clj->phaser child))))
  ([flex-layer child destroy]
   (phaser->clj
    (.remove flex-layer
             (clj->phaser child)
             (clj->phaser destroy))))
  ([flex-layer child destroy silent]
   (phaser->clj
    (.remove flex-layer
             (clj->phaser child)
             (clj->phaser destroy)
             (clj->phaser silent)))))

(defn remove-all
  "Removes all children from this group, but does not remove the group from its parent.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * destroy (boolean) {optional} - If true `destroy` will be invoked on each removed child.
    * silent (boolean) {optional} - If true the children will not dispatch their `onRemovedFromGroup` events."
  ([flex-layer]
   (phaser->clj
    (.removeAll flex-layer)))
  ([flex-layer destroy]
   (phaser->clj
    (.removeAll flex-layer
                (clj->phaser destroy))))
  ([flex-layer destroy silent]
   (phaser->clj
    (.removeAll flex-layer
                (clj->phaser destroy)
                (clj->phaser silent)))))

(defn remove-between
  "Removes all children from this group whose index falls beteen the given startIndex and endIndex values.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * start-index (integer) - The index to start removing children from.
    * end-index (integer) {optional} - The index to stop removing children at. Must be higher than startIndex. If undefined this method will remove all children between startIndex and the end of the group.
    * destroy (boolean) {optional} - If true `destroy` will be invoked on each removed child.
    * silent (boolean) {optional} - If true the children will not dispatch their `onRemovedFromGroup` events."
  ([flex-layer start-index]
   (phaser->clj
    (.removeBetween flex-layer
                    (clj->phaser start-index))))
  ([flex-layer start-index end-index]
   (phaser->clj
    (.removeBetween flex-layer
                    (clj->phaser start-index)
                    (clj->phaser end-index))))
  ([flex-layer start-index end-index destroy]
   (phaser->clj
    (.removeBetween flex-layer
                    (clj->phaser start-index)
                    (clj->phaser end-index)
                    (clj->phaser destroy))))
  ([flex-layer start-index end-index destroy silent]
   (phaser->clj
    (.removeBetween flex-layer
                    (clj->phaser start-index)
                    (clj->phaser end-index)
                    (clj->phaser destroy)
                    (clj->phaser silent)))))

(defn remove-child
  "Removes a child from the container.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The DisplayObject to remove

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([flex-layer child]
   (phaser->clj
    (.removeChild flex-layer
                  (clj->phaser child)))))

(defn remove-child-at
  "Removes a child from the specified index position.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * index (Number) - The index to get the child from

  Returns:  PIXI.DisplayObject - The child that was removed."
  ([flex-layer index]
   (phaser->clj
    (.removeChildAt flex-layer
                    (clj->phaser index)))))

(defn remove-children
  "Removes all children from this container that are within the begin and end indexes.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * begin-index (Number) - The beginning position. Default value is 0.
    * end-index (Number) - The ending position. Default value is size of the container."
  ([flex-layer begin-index end-index]
   (phaser->clj
    (.removeChildren flex-layer
                     (clj->phaser begin-index)
                     (clj->phaser end-index)))))

(defn remove-from-hash
  "Removes a child of this Group from the hash array.
  This call will return false if the child is not in the hash.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (DisplayObject) - The display object to remove from this Groups hash. Must be a member of this Group and in the hash.

  Returns:  boolean - True if the child was successfully removed from the hash, otherwise false."
  ([flex-layer child]
   (phaser->clj
    (.removeFromHash flex-layer
                     (clj->phaser child)))))

(defn remove-stage-reference
  "Removes the current stage reference from the container and all of its children."
  ([flex-layer]
   (phaser->clj
    (.removeStageReference flex-layer))))

(defn replace
  "Replaces a child of this group with the given newChild. The newChild cannot be a member of this group.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * old-child (any) - The child in this group that will be replaced.
    * new-child (any) - The child to be inserted into this group.

  Returns:  any - Returns the oldChild that was replaced within this group."
  ([flex-layer old-child new-child]
   (phaser->clj
    (.replace flex-layer
              (clj->phaser old-child)
              (clj->phaser new-child)))))

(defn reset-cursor
  "Sets the group cursor to the first child in the group.

  If the optional index parameter is given it sets the cursor to the object at that index instead.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * index (integer) {optional} - Set the cursor to point to a specific index.

  Returns:  any - The child the cursor now points to."
  ([flex-layer]
   (phaser->clj
    (.resetCursor flex-layer)))
  ([flex-layer index]
   (phaser->clj
    (.resetCursor flex-layer
                  (clj->phaser index)))))

(defn resize
  "Resize."
  ([flex-layer]
   (phaser->clj
    (.resize flex-layer))))

(defn reverse
  "Reverses all children in this group.

  This operaation applies only to immediate children and does not propagate to subgroups."
  ([flex-layer]
   (phaser->clj
    (.reverse flex-layer))))

(defn send-to-back
  "Sends the given child to the bottom of this group so it renders below all other children.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (any) - The child to send to the bottom of this group.

  Returns:  any - The child that was moved."
  ([flex-layer child]
   (phaser->clj
    (.sendToBack flex-layer
                 (clj->phaser child)))))

(defn set
  "Quickly set a property on a single child of this group to a new value.

  The operation parameter controls how the new value is assigned to the property, from simple replacement to addition and multiplication.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (Phaser.Sprite) - The child to set the property on.
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be set.
    * check-alive (boolean) {optional} - If set then the child will only be updated if alive=true.
    * check-visible (boolean) {optional} - If set then the child will only be updated if visible=true.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set.

  Returns:  boolean - True if the property was set, false if not."
  ([flex-layer child key value]
   (phaser->clj
    (.set flex-layer
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value))))
  ([flex-layer child key value check-alive]
   (phaser->clj
    (.set flex-layer
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive))))
  ([flex-layer child key value check-alive check-visible]
   (phaser->clj
    (.set flex-layer
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive)
          (clj->phaser check-visible))))
  ([flex-layer child key value check-alive check-visible operation]
   (phaser->clj
    (.set flex-layer
          (clj->phaser child)
          (clj->phaser key)
          (clj->phaser value)
          (clj->phaser check-alive)
          (clj->phaser check-visible)
          (clj->phaser operation))))
  ([flex-layer child key value check-alive check-visible operation force]
   (phaser->clj
    (.set flex-layer
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
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be set.
    * check-alive (boolean) {optional} - If set then only children with alive=true will be updated. This includes any Groups that are children.
    * check-visible (boolean) {optional} - If set then only children with visible=true will be updated. This includes any Groups that are children.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set."
  ([flex-layer key value]
   (phaser->clj
    (.setAll flex-layer
             (clj->phaser key)
             (clj->phaser value))))
  ([flex-layer key value check-alive]
   (phaser->clj
    (.setAll flex-layer
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive))))
  ([flex-layer key value check-alive check-visible]
   (phaser->clj
    (.setAll flex-layer
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive)
             (clj->phaser check-visible))))
  ([flex-layer key value check-alive check-visible operation]
   (phaser->clj
    (.setAll flex-layer
             (clj->phaser key)
             (clj->phaser value)
             (clj->phaser check-alive)
             (clj->phaser check-visible)
             (clj->phaser operation))))
  ([flex-layer key value check-alive check-visible operation force]
   (phaser->clj
    (.setAll flex-layer
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
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * key (string) - The property, as a string, to be set. For example: 'body.velocity.x'
    * value (any) - The value that will be set.
    * check-alive (boolean) {optional} - If set then only children with alive=true will be updated. This includes any Groups that are children.
    * check-visible (boolean) {optional} - If set then only children with visible=true will be updated. This includes any Groups that are children.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set."
  ([flex-layer key value]
   (phaser->clj
    (.setAllChildren flex-layer
                     (clj->phaser key)
                     (clj->phaser value))))
  ([flex-layer key value check-alive]
   (phaser->clj
    (.setAllChildren flex-layer
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive))))
  ([flex-layer key value check-alive check-visible]
   (phaser->clj
    (.setAllChildren flex-layer
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive)
                     (clj->phaser check-visible))))
  ([flex-layer key value check-alive check-visible operation]
   (phaser->clj
    (.setAllChildren flex-layer
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive)
                     (clj->phaser check-visible)
                     (clj->phaser operation))))
  ([flex-layer key value check-alive check-visible operation force]
   (phaser->clj
    (.setAllChildren flex-layer
                     (clj->phaser key)
                     (clj->phaser value)
                     (clj->phaser check-alive)
                     (clj->phaser check-visible)
                     (clj->phaser operation)
                     (clj->phaser force)))))

(defn set-child-index
  "Changes the position of an existing child in the display object container

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - The child DisplayObject instance for which you want to change the index number
    * index (Number) - The resulting index number for the child display object"
  ([flex-layer child index]
   (phaser->clj
    (.setChildIndex flex-layer
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
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (any) - The child to set the property value on.
    * key (array) - An array of strings that make up the property that will be set.
    * value (any) - The value that will be set.
    * operation (integer) {optional} - Controls how the value is assigned. A value of 0 replaces the value with the new one. A value of 1 adds it, 2 subtracts it, 3 multiplies it and 4 divides it.
    * force (boolean) {optional} - If `force` is true then the property will be set on the child regardless if it already exists or not. If false and the property doesn't exist, nothing will be set.

  Returns:  boolean - True if the property was set, false if not."
  ([flex-layer child key value]
   (phaser->clj
    (.setProperty flex-layer
                  (clj->phaser child)
                  (clj->phaser key)
                  (clj->phaser value))))
  ([flex-layer child key value operation]
   (phaser->clj
    (.setProperty flex-layer
                  (clj->phaser child)
                  (clj->phaser key)
                  (clj->phaser value)
                  (clj->phaser operation))))
  ([flex-layer child key value operation force]
   (phaser->clj
    (.setProperty flex-layer
                  (clj->phaser child)
                  (clj->phaser key)
                  (clj->phaser value)
                  (clj->phaser operation)
                  (clj->phaser force)))))

(defn set-stage-reference
  "Sets the containers Stage reference. This is the Stage that this object, and all of its children, is connected to.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * stage (PIXI.Stage) - the stage that the container will have as its current stage reference"
  ([flex-layer stage]
   (phaser->clj
    (.setStageReference flex-layer
                        (clj->phaser stage)))))

(defn sort
  "Sort the children in the group according to a particular key and ordering.

  Call this function to sort the group according to a particular key value and order.
  For example to depth sort Sprites for Zelda-style game you might call `group.sort('y', Phaser.Group.SORT_ASCENDING)` at the bottom of your `State.update()`.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * key (string) {optional} - The name of the property to sort on. Defaults to the objects z-depth value.
    * order (integer) {optional} - Order ascending ({@link Phaser.Group.SORT_ASCENDING SORT_ASCENDING}) or descending ({@link Phaser.Group.SORT_DESCENDING SORT_DESCENDING})."
  ([flex-layer]
   (phaser->clj
    (.sort flex-layer)))
  ([flex-layer key]
   (phaser->clj
    (.sort flex-layer
           (clj->phaser key))))
  ([flex-layer key order]
   (phaser->clj
    (.sort flex-layer
           (clj->phaser key)
           (clj->phaser order)))))

(defn sub-all
  "Subtracts the amount from the given property on all children in this group.

  `Group.subAll('x', 10)` will minus 10 from the child.x value for each child.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * property (string) - The property to decrement, for example 'body.velocity.x' or 'angle'.
    * amount (number) - The amount to subtract from the property. If child.x = 50 then subAll('x', 40) would make child.x = 10.
    * check-alive (boolean) - If true the property will only be changed if the child is alive.
    * check-visible (boolean) - If true the property will only be changed if the child is visible."
  ([flex-layer property amount check-alive check-visible]
   (phaser->clj
    (.subAll flex-layer
             (clj->phaser property)
             (clj->phaser amount)
             (clj->phaser check-alive)
             (clj->phaser check-visible)))))

(defn swap
  "Swaps the position of two children in this group.

  Both children must be in this group, a child cannot be swapped with itself, and unparented children cannot be swapped.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child-1 (any) - The first child to swap.
    * child-2 (any) - The second child to swap."
  ([flex-layer child-1 child-2]
   (phaser->clj
    (.swap flex-layer
           (clj->phaser child-1)
           (clj->phaser child-2)))))

(defn swap-children
  "Swaps the position of 2 Display Objects within this container.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * child (PIXI.DisplayObject) - -
    * child-2 (PIXI.DisplayObject) - -"
  ([flex-layer child child-2]
   (phaser->clj
    (.swapChildren flex-layer
                   (clj->phaser child)
                   (clj->phaser child-2)))))

(defn to-global
  "Calculates the global position of the display object

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * position (Point) - The world origin to calculate from

  Returns:  Point - A point object representing the position of this object"
  ([flex-layer position]
   (phaser->clj
    (.toGlobal flex-layer
               (clj->phaser position)))))

(defn to-local
  "Calculates the local position of the display object relative to another point

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * position (Point) - The world origin to calculate from
    * from (PIXI.DisplayObject) {optional} - The DisplayObject to calculate the global position from

  Returns:  Point - A point object representing the position of this object"
  ([flex-layer position]
   (phaser->clj
    (.toLocal flex-layer
              (clj->phaser position))))
  ([flex-layer position from]
   (phaser->clj
    (.toLocal flex-layer
              (clj->phaser position)
              (clj->phaser from)))))

(defn update-cache
  "Generates and updates the cached sprite for this object."
  ([flex-layer]
   (phaser->clj
    (.updateCache flex-layer))))

(defn xy
  "Positions the child found at the given index within this group to the given x and y coordinates.

  Parameters:
    * flex-layer (Phaser.FlexLayer) - Targeted instance for method
    * index (integer) - The index of the child in the group to set the position of.
    * x (number) - The new x position of the child.
    * y (number) - The new y position of the child."
  ([flex-layer index x y]
   (phaser->clj
    (.xy flex-layer
         (clj->phaser index)
         (clj->phaser x)
         (clj->phaser y)))))