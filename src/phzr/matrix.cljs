(ns phzr.matrix
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [clone to-array apply identity]))

(defn ->Matrix
  "The Matrix is a 3x3 matrix mostly used for display transforms within the renderer.

  It is represented like so:

  | a | b | tx |
  | c | d | ty |
  | 0 | 0 | 1 |

  Parameters:
    * a (number) {optional} - No description
    * b (number) {optional} - No description
    * c (number) {optional} - No description
    * d (number) {optional} - No description
    * tx (number) {optional} - No description
    * ty (number) {optional} - No description"
  ([]
   (js/Phaser.Matrix.))
  ([a]
   (js/Phaser.Matrix. (clj->phaser a)))
  ([a b]
   (js/Phaser.Matrix. (clj->phaser a)
                      (clj->phaser b)))
  ([a b c]
   (js/Phaser.Matrix. (clj->phaser a)
                      (clj->phaser b)
                      (clj->phaser c)))
  ([a b c d]
   (js/Phaser.Matrix. (clj->phaser a)
                      (clj->phaser b)
                      (clj->phaser c)
                      (clj->phaser d)))
  ([a b c d tx]
   (js/Phaser.Matrix. (clj->phaser a)
                      (clj->phaser b)
                      (clj->phaser c)
                      (clj->phaser d)
                      (clj->phaser tx)))
  ([a b c d tx ty]
   (js/Phaser.Matrix. (clj->phaser a)
                      (clj->phaser b)
                      (clj->phaser c)
                      (clj->phaser d)
                      (clj->phaser tx)
                      (clj->phaser ty))))

(defn append
  "Appends the given Matrix to this Matrix.

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * matrix (Phaser.Matrix) - The matrix to append to this one.

  Returns:  Phaser.Matrix - This Matrix object."
  ([matrix matrix]
   (phaser->clj
    (.append matrix
             (clj->phaser matrix)))))

(defn apply
  "Get a new position with the current transformation applied.

  Can be used to go from a childs coordinate space to the world coordinate space (e.g. rendering)

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * pos (Phaser.Point) - The origin Point.
    * new-pos (Phaser.Point) {optional} - The point that the new position is assigned to. This can be same as input point.

  Returns:  Phaser.Point - The new point, transformed through this matrix."
  ([matrix pos]
   (phaser->clj
    (.apply matrix
            (clj->phaser pos))))
  ([matrix pos new-pos]
   (phaser->clj
    (.apply matrix
            (clj->phaser pos)
            (clj->phaser new-pos)))))

(defn apply-inverse
  "Get a new position with the inverse of the current transformation applied.

  Can be used to go from the world coordinate space to a childs coordinate space. (e.g. input)

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * pos (Phaser.Point) - The origin Point.
    * new-pos (Phaser.Point) {optional} - The point that the new position is assigned to. This can be same as input point.

  Returns:  Phaser.Point - The new point, inverse transformed through this matrix."
  ([matrix pos]
   (phaser->clj
    (.applyInverse matrix
                   (clj->phaser pos))))
  ([matrix pos new-pos]
   (phaser->clj
    (.applyInverse matrix
                   (clj->phaser pos)
                   (clj->phaser new-pos)))))

(defn clone
  "Creates a new Matrix object based on the values of this Matrix.
  If you provide the output parameter the values of this Matrix will be copied over to it.
  If the output parameter is blank a new Matrix object will be created.

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * output (Phaser.Matrix) {optional} - If provided the values of this Matrix will be copied to it, otherwise a new Matrix object is created.

  Returns:  Phaser.Matrix - A clone of this Matrix."
  ([matrix]
   (phaser->clj
    (.clone matrix)))
  ([matrix output]
   (phaser->clj
    (.clone matrix
            (clj->phaser output)))))

(defn copy-from
  "Copies the properties from the given Matrix into this Matrix.

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * matrix (Phaser.Matrix) - The Matrix to copy from.

  Returns:  Phaser.Matrix - This Matrix object."
  ([matrix matrix]
   (phaser->clj
    (.copyFrom matrix
               (clj->phaser matrix)))))

(defn copy-to
  "Copies the properties from this Matrix to the given Matrix.

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * matrix (Phaser.Matrix) - The Matrix to copy from.

  Returns:  Phaser.Matrix - The destination Matrix object."
  ([matrix matrix]
   (phaser->clj
    (.copyTo matrix
             (clj->phaser matrix)))))

(defn from-array
  "Sets the values of this Matrix to the values in the given array.

  The Array elements should be set as follows:

  a = array[0]
  b = array[1]
  c = array[3]
  d = array[4]
  tx = array[2]
  ty = array[5]

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * array (Array) - The array to copy from.

  Returns:  Phaser.Matrix - This Matrix object."
  ([matrix array]
   (phaser->clj
    (.fromArray matrix
                (clj->phaser array)))))

(defn identity
  "Resets this Matrix to an identity (default) matrix.

  Returns:  Phaser.Matrix - This Matrix object."
  ([matrix]
   (phaser->clj
    (.identity matrix))))

(defn rotate
  "Applies a rotation transformation to this matrix.

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * angle (number) - The angle to rotate by, given in radians.

  Returns:  Phaser.Matrix - This Matrix object."
  ([matrix angle]
   (phaser->clj
    (.rotate matrix
             (clj->phaser angle)))))

(defn scale
  "Applies a scale transformation to this matrix.

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * x (number) - The amount to scale horizontally.
    * y (number) - The amount to scale vertically.

  Returns:  Phaser.Matrix - This Matrix object."
  ([matrix x y]
   (phaser->clj
    (.scale matrix
            (clj->phaser x)
            (clj->phaser y)))))

(defn set-to
  "Sets the values of this Matrix to the given values.

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * a (number) - No description
    * b (number) - No description
    * c (number) - No description
    * d (number) - No description
    * tx (number) - No description
    * ty (number) - No description

  Returns:  Phaser.Matrix - This Matrix object."
  ([matrix a b c d tx ty]
   (phaser->clj
    (.setTo matrix
            (clj->phaser a)
            (clj->phaser b)
            (clj->phaser c)
            (clj->phaser d)
            (clj->phaser tx)
            (clj->phaser ty)))))

(defn to-array
  "Creates a Float32 Array with values populated from this Matrix object.

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * transpose (boolean) {optional} - Whether the values in the array are transposed or not.
    * array (PIXI.Float32Array) {optional} - If provided the values will be set into this array, otherwise a new Float32Array is created.

  Returns:  PIXI.Float32Array - The newly created array which contains the matrix."
  ([matrix]
   (phaser->clj
    (.toArray matrix)))
  ([matrix transpose]
   (phaser->clj
    (.toArray matrix
              (clj->phaser transpose))))
  ([matrix transpose array]
   (phaser->clj
    (.toArray matrix
              (clj->phaser transpose)
              (clj->phaser array)))))

(defn translate
  "Translates the matrix on the x and y.
  This is the same as Matrix.tx += x.

  Parameters:
    * matrix (Phaser.Matrix) - Targeted instance for method
    * x (number) - The x value to translate on.
    * y (number) - The y value to translate on.

  Returns:  Phaser.Matrix - This Matrix object."
  ([matrix x y]
   (phaser->clj
    (.translate matrix
                (clj->phaser x)
                (clj->phaser y)))))