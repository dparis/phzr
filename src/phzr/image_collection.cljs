(ns phzr.image-collection
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->ImageCollection
  "An Image Collection is a special tileset containing mulitple images, with no slicing into each image.

  Image Collections are normally created automatically when Tiled data is loaded.

  Parameters:
    * name (string) - The name of the image collection in the map data.
    * firstgid (integer) - The first image index this image collection contains.
    * width (integer) {optional} - Width of widest image (in pixels).
    * height (integer) {optional} - Height of tallest image (in pixels).
    * margin (integer) {optional} - The margin around all images in the collection (in pixels).
    * spacing (integer) {optional} - The spacing between each image in the collection (in pixels).
    * properties (object) {optional} - Custom Image Collection properties."
  ([name firstgid]
   (js/Phaser.ImageCollection. (clj->phaser name)
                               (clj->phaser firstgid)))
  ([name firstgid width]
   (js/Phaser.ImageCollection. (clj->phaser name)
                               (clj->phaser firstgid)
                               (clj->phaser width)))
  ([name firstgid width height]
   (js/Phaser.ImageCollection. (clj->phaser name)
                               (clj->phaser firstgid)
                               (clj->phaser width)
                               (clj->phaser height)))
  ([name firstgid width height margin]
   (js/Phaser.ImageCollection. (clj->phaser name)
                               (clj->phaser firstgid)
                               (clj->phaser width)
                               (clj->phaser height)
                               (clj->phaser margin)))
  ([name firstgid width height margin spacing]
   (js/Phaser.ImageCollection. (clj->phaser name)
                               (clj->phaser firstgid)
                               (clj->phaser width)
                               (clj->phaser height)
                               (clj->phaser margin)
                               (clj->phaser spacing)))
  ([name firstgid width height margin spacing properties]
   (js/Phaser.ImageCollection. (clj->phaser name)
                               (clj->phaser firstgid)
                               (clj->phaser width)
                               (clj->phaser height)
                               (clj->phaser margin)
                               (clj->phaser spacing)
                               (clj->phaser properties))))

(defn add-image
  "Add an image to this Image Collection.

  Parameters:
    * image-collection (Phaser.ImageCollection) - Targeted instance for method
    * gid (integer) - The gid of the image in the Image Collection.
    * image (string) - The the key of the image in the Image Collection and in the cache."
  ([image-collection gid image]
   (phaser->clj
    (.addImage image-collection
               (clj->phaser gid)
               (clj->phaser image)))))

(defn contains-image-index
  "Returns true if and only if this image collection contains the given image index.

  Parameters:
    * image-collection (Phaser.ImageCollection) - Targeted instance for method
    * image-index (integer) - The image index to search for.

  Returns:  boolean - True if this Image Collection contains the given index."
  ([image-collection image-index]
   (phaser->clj
    (.containsImageIndex image-collection
                         (clj->phaser image-index)))))