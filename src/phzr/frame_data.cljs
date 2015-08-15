(ns phzr.frame-data
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [clone]))

(defn ->FrameData
  "FrameData is a container for Frame objects, which are the internal representation of animation data in Phaser."
  ([]
   (js/Phaser.FrameData.)))

(defn add-frame
  "Adds a new Frame to this FrameData collection. Typically called by the Animation.Parser and not directly.

  Parameters:
    * frame-data (Phaser.FrameData) - Targeted instance for method
    * frame (Phaser.Frame) - The frame to add to this FrameData set.

  Returns:  Phaser.Frame - The frame that was just added."
  ([frame-data frame]
   (phaser->clj
    (.addFrame frame-data
               (clj->phaser frame)))))

(defn check-frame-name
  "Check if there is a Frame with the given name.

  Parameters:
    * frame-data (Phaser.FrameData) - Targeted instance for method
    * name (string) - The name of the frame you want to check.

  Returns:  boolean - True if the frame is found, otherwise false."
  ([frame-data name]
   (phaser->clj
    (.checkFrameName frame-data
                     (clj->phaser name)))))

(defn clone
  "Makes a copy of this FrameData including copies (not references) to all of the Frames it contains.

  Returns:  Phaser.FrameData - A clone of this object, including clones of the Frame objects it contains."
  ([frame-data]
   (phaser->clj
    (.clone frame-data))))

(defn get-frame
  "Get a Frame by its numerical index.

  Parameters:
    * frame-data (Phaser.FrameData) - Targeted instance for method
    * index (number) - The index of the frame you want to get.

  Returns:  Phaser.Frame - The frame, if found."
  ([frame-data index]
   (phaser->clj
    (.getFrame frame-data
               (clj->phaser index)))))

(defn get-frame-by-name
  "Get a Frame by its frame name.

  Parameters:
    * frame-data (Phaser.FrameData) - Targeted instance for method
    * name (string) - The name of the frame you want to get.

  Returns:  Phaser.Frame - The frame, if found."
  ([frame-data name]
   (phaser->clj
    (.getFrameByName frame-data
                     (clj->phaser name)))))

(defn get-frame-indexes
  "Returns all of the Frame indexes in this FrameData set.
  The frames indexes are returned in the output array, or if none is provided in a new Array object.

  Parameters:
    * frame-data (Phaser.FrameData) - Targeted instance for method
    * frames (Array) {optional} - An Array containing the indexes of the frames to retrieve. If undefined or the array is empty then all frames in the FrameData are returned.
    * use-numeric-index (boolean) {optional} - Are the given frames using numeric indexes (default) or strings? (false)
    * output (Array) {optional} - If given the results will be appended to the end of this array otherwise a new array will be created.

  Returns:  Array - An array of all Frame indexes matching the given names or IDs."
  ([frame-data]
   (phaser->clj
    (.getFrameIndexes frame-data)))
  ([frame-data frames]
   (phaser->clj
    (.getFrameIndexes frame-data
                      (clj->phaser frames))))
  ([frame-data frames use-numeric-index]
   (phaser->clj
    (.getFrameIndexes frame-data
                      (clj->phaser frames)
                      (clj->phaser use-numeric-index))))
  ([frame-data frames use-numeric-index output]
   (phaser->clj
    (.getFrameIndexes frame-data
                      (clj->phaser frames)
                      (clj->phaser use-numeric-index)
                      (clj->phaser output)))))

(defn get-frame-range
  "Returns a range of frames based on the given start and end frame indexes and returns them in an Array.

  Parameters:
    * frame-data (Phaser.FrameData) - Targeted instance for method
    * start (number) - The starting frame index.
    * end (number) - The ending frame index.
    * output (Array) {optional} - If given the results will be appended to the end of this array otherwise a new array will be created.

  Returns:  Array - An array of Frames between the start and end index values, or an empty array if none were found."
  ([frame-data start end]
   (phaser->clj
    (.getFrameRange frame-data
                    (clj->phaser start)
                    (clj->phaser end))))
  ([frame-data start end output]
   (phaser->clj
    (.getFrameRange frame-data
                    (clj->phaser start)
                    (clj->phaser end)
                    (clj->phaser output)))))

(defn get-frames
  "Returns all of the Frames in this FrameData set where the frame index is found in the input array.
  The frames are returned in the output array, or if none is provided in a new Array object.

  Parameters:
    * frame-data (Phaser.FrameData) - Targeted instance for method
    * frames (Array) {optional} - An Array containing the indexes of the frames to retrieve. If the array is empty or undefined then all frames in the FrameData are returned.
    * use-numeric-index (boolean) {optional} - Are the given frames using numeric indexes (default) or strings? (false)
    * output (Array) {optional} - If given the results will be appended to the end of this array otherwise a new array will be created.

  Returns:  Array - An array of all Frames in this FrameData set matching the given names or IDs."
  ([frame-data]
   (phaser->clj
    (.getFrames frame-data)))
  ([frame-data frames]
   (phaser->clj
    (.getFrames frame-data
                (clj->phaser frames))))
  ([frame-data frames use-numeric-index]
   (phaser->clj
    (.getFrames frame-data
                (clj->phaser frames)
                (clj->phaser use-numeric-index))))
  ([frame-data frames use-numeric-index output]
   (phaser->clj
    (.getFrames frame-data
                (clj->phaser frames)
                (clj->phaser use-numeric-index)
                (clj->phaser output)))))