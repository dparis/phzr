(ns phzr.array-utils
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [shuffle]))

(defn find-closest-
  "Snaps a value to the nearest value in an array.
  The result will always be in the range `[first_value, last_value]`.

  Parameters:
    * value (number) - The search value
    * arr (Array.<number>) - The input array which _must_ be sorted.

  Returns:  number - The nearest value found."
  ([value arr]
   (phaser->clj
    (.findClosest js/Phaser.ArrayUtils
                  (clj->phaser value)
                  (clj->phaser arr)))))

(defn get-random-item-
  "Fetch a random entry from the given array.

  Will return null if there are no array items that fall within the specified range
  or if there is no item for the randomly choosen index.

  Parameters:
    * objects (Array.<any>) - An array of objects.
    * start-index (integer) - Optional offset off the front of the array. Default value is 0, or the beginning of the array.
    * length (integer) - Optional restriction on the number of values you want to randomly select from.

  Returns:  object - The random object that was selected."
  ([objects start-index length]
   (phaser->clj
    (.getRandomItem js/Phaser.ArrayUtils
                    (clj->phaser objects)
                    (clj->phaser start-index)
                    (clj->phaser length)))))

(defn number-array-
  "Create an array representing the inclusive range of numbers (usually integers) in `[start, end]`.
  This is equivalent to `numberArrayStep(start, end, 1)`.

  Parameters:
    * start (number) - The minimum value the array starts with.
    * end (number) - The maximum value the array contains.

  Returns:  Array.<number> - The array of number values."
  ([start end]
   (phaser->clj
    (.numberArray js/Phaser.ArrayUtils
                  (clj->phaser start)
                  (clj->phaser end)))))

(defn number-array-step-
  "Create an array of numbers (positive and/or negative) progressing from `start`
  up to but not including `end` by advancing by `step`.

  If `start` is less than `stop` a zero-length range is created unless a negative `step` is specified.

  Certain values for `start` and `end` (eg. NaN/undefined/null) are currently coerced to 0;
  for forward compatibility make sure to pass in actual numbers.

  Parameters:
    * start (number) - The start of the range.
    * end (number) - The end of the range.
    * step (number) {optional} - The value to increment or decrement by.

  Returns:  Array - Returns the new array of numbers."
  ([start end]
   (phaser->clj
    (.numberArrayStep js/Phaser.ArrayUtils
                      (clj->phaser start)
                      (clj->phaser end))))
  ([start end step]
   (phaser->clj
    (.numberArrayStep js/Phaser.ArrayUtils
                      (clj->phaser start)
                      (clj->phaser end)
                      (clj->phaser step)))))

(defn remove-random-item-
  "Removes a random object from the given array and returns it.

  Will return null if there are no array items that fall within the specified range
  or if there is no item for the randomly choosen index.

  Parameters:
    * objects (Array.<any>) - An array of objects.
    * start-index (integer) - Optional offset off the front of the array. Default value is 0, or the beginning of the array.
    * length (integer) - Optional restriction on the number of values you want to randomly select from.

  Returns:  object - The random object that was removed."
  ([objects start-index length]
   (phaser->clj
    (.removeRandomItem js/Phaser.ArrayUtils
                       (clj->phaser objects)
                       (clj->phaser start-index)
                       (clj->phaser length)))))

(defn rotate-
  "Moves the element from the start of the array to the end, shifting all items in the process.
  The 'rotation' happens to the left.

  Parameters:
    * array (Array.<any>) - The array to shift/rotate. The array is modified.

  Returns:  any - The shifted value."
  ([array]
   (phaser->clj
    (.rotate js/Phaser.ArrayUtils
             (clj->phaser array)))))

(defn rotate-matrix-
  "Rotates the given matrix (array of arrays).

  Based on the routine from {@link http://jsfiddle.net/MrPolywhirl/NH42z/}.

  Parameters:
    * matrix (Array.<Array.<any>>) - The array to rotate; this matrix _may_ be altered.
    * direction (number | string) - The amount to rotate: the roation in degrees (90, -90, 270, -270, 180) or a string command ('rotateLeft', 'rotateRight' or 'rotate180').

  Returns:  Array.<Array.<any>> - The rotated matrix. The source matrix should be discarded for the returned matrix."
  ([matrix direction]
   (phaser->clj
    (.rotateMatrix js/Phaser.ArrayUtils
                   (clj->phaser matrix)
                   (clj->phaser direction)))))

(defn shuffle-
  "A standard Fisher-Yates Array shuffle implementation which modifies the array in place.

  Parameters:
    * array (Array.<any>) - The array to shuffle.

  Returns:  Array.<any> - The original array, now shuffled."
  ([array]
   (phaser->clj
    (.shuffle js/Phaser.ArrayUtils
              (clj->phaser array)))))

(defn transpose-matrix-
  "Transposes the elements of the given matrix (array of arrays).

  Parameters:
    * array (Array.<Array.<any>>) - The matrix to transpose.

  Returns:  Array.<Array.<any>> - A new transposed matrix"
  ([array]
   (phaser->clj
    (.transposeMatrix js/Phaser.ArrayUtils
                      (clj->phaser array)))))