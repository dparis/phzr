(ns phzr.math
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [min max]))

(defn fuzzy-equal-
  "Two number are fuzzyEqual if their difference is less than epsilon.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * a (number) - No description
    * b (number) - No description
    * epsilon (number) {optional}  - No description

  Returns:  boolean - True if |a-b|<epsilon"
  ([a b]
   (phaser->clj
    (.fuzzyEqual js/Phaser.Math
                 (clj->phaser a)
                 (clj->phaser b))))
  ([a b epsilon]
   (phaser->clj
    (.fuzzyEqual js/Phaser.Math
                 (clj->phaser a)
                 (clj->phaser b)
                 (clj->phaser epsilon)))))

(defn fuzzy-less-than-
  "`a` is fuzzyLessThan `b` if it is less than b + epsilon.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * a (number) - No description
    * b (number) - No description
    * epsilon (number) {optional}  - No description

  Returns:  boolean - True if a<b+epsilon"
  ([a b]
   (phaser->clj
    (.fuzzyLessThan js/Phaser.Math
                    (clj->phaser a)
                    (clj->phaser b))))
  ([a b epsilon]
   (phaser->clj
    (.fuzzyLessThan js/Phaser.Math
                    (clj->phaser a)
                    (clj->phaser b)
                    (clj->phaser epsilon)))))

(defn fuzzy-greater-than-
  "`a` is fuzzyGreaterThan `b` if it is more than b - epsilon.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * a (number) - No description
    * b (number) - No description
    * epsilon (number) {optional}  - No description

  Returns:  boolean - True if a>b+epsilon"
  ([a b]
   (phaser->clj
    (.fuzzyGreaterThan js/Phaser.Math
                       (clj->phaser a)
                       (clj->phaser b))))
  ([a b epsilon]
   (phaser->clj
    (.fuzzyGreaterThan js/Phaser.Math
                       (clj->phaser a)
                       (clj->phaser b)
                       (clj->phaser epsilon)))))

(defn fuzzy-ceil-
  "

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * val (number) - No description
    * epsilon (number) {optional}  - No description

  Returns:  boolean - ceiling(val-epsilon)"
  ([val]
   (phaser->clj
    (.fuzzyCeil js/Phaser.Math
                (clj->phaser val))))
  ([val epsilon]
   (phaser->clj
    (.fuzzyCeil js/Phaser.Math
                (clj->phaser val)
                (clj->phaser epsilon)))))

(defn fuzzy-floor-
  "

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * val (number) - No description
    * epsilon (number) {optional}  - No description

  Returns:  boolean - floor(val-epsilon)"
  ([val]
   (phaser->clj
    (.fuzzyFloor js/Phaser.Math
                 (clj->phaser val))))
  ([val epsilon]
   (phaser->clj
    (.fuzzyFloor js/Phaser.Math
                 (clj->phaser val)
                 (clj->phaser epsilon)))))

(defn average-
  "Averages all values passed to the function and returns the result.

  Returns:  number - The average of all given values."
  ([]
   (phaser->clj
    (.average js/Phaser.Math))))

(defn shear-
  "

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * n (number) - No description

  Returns:  number - n mod 1"
  ([n]
   (phaser->clj
    (.shear js/Phaser.Math
            (clj->phaser n)))))

(defn snap-to-
  "Snap a value to nearest grid slice, using rounding.
  
  Example: if you have an interval gap of 5 and a position of 12... you will snap to 10 whereas 14 will snap to 15.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * input (number) - The value to snap.
    * gap (number) - The interval gap of the grid.
    * start (number) {optional}  - Optional starting offset for gap.

  Returns:  number - "
  ([input gap]
   (phaser->clj
    (.snapTo js/Phaser.Math
             (clj->phaser input)
             (clj->phaser gap))))
  ([input gap start]
   (phaser->clj
    (.snapTo js/Phaser.Math
             (clj->phaser input)
             (clj->phaser gap)
             (clj->phaser start)))))

(defn snap-to-floor-
  "Snap a value to nearest grid slice, using floor.
  
  Example: if you have an interval gap of 5 and a position of 12... you will snap to 10. 
  As will 14 snap to 10... but 16 will snap to 15.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * input (number) - The value to snap.
    * gap (number) - The interval gap of the grid.
    * start (number) {optional}  - Optional starting offset for gap.

  Returns:  number - "
  ([input gap]
   (phaser->clj
    (.snapToFloor js/Phaser.Math
                  (clj->phaser input)
                  (clj->phaser gap))))
  ([input gap start]
   (phaser->clj
    (.snapToFloor js/Phaser.Math
                  (clj->phaser input)
                  (clj->phaser gap)
                  (clj->phaser start)))))

(defn snap-to-ceil-
  "Snap a value to nearest grid slice, using ceil.
  
  Example: if you have an interval gap of 5 and a position of 12... you will snap to 15.
  As will 14 will snap to 15... but 16 will snap to 20.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * input (number) - The value to snap.
    * gap (number) - The interval gap of the grid.
    * start (number) {optional}  - Optional starting offset for gap.

  Returns:  number - "
  ([input gap]
   (phaser->clj
    (.snapToCeil js/Phaser.Math
                 (clj->phaser input)
                 (clj->phaser gap))))
  ([input gap start]
   (phaser->clj
    (.snapToCeil js/Phaser.Math
                 (clj->phaser input)
                 (clj->phaser gap)
                 (clj->phaser start)))))

(defn round-to-
  "Round to some place comparative to a `base`, default is 10 for decimal place.
  The `place` is represented by the power applied to `base` to get that place.
  
      e.g. 2000/7 ~= 285.714285714285714285714 ~= (bin)100011101.1011011011011011
  
      roundTo(2000/7,3) === 0
      roundTo(2000/7,2) == 300
      roundTo(2000/7,1) == 290
      roundTo(2000/7,0) == 286
      roundTo(2000/7,-1) == 285.7
      roundTo(2000/7,-2) == 285.71
      roundTo(2000/7,-3) == 285.714
      roundTo(2000/7,-4) == 285.7143
      roundTo(2000/7,-5) == 285.71429
  
      roundTo(2000/7,3,2)  == 288       -- 100100000
      roundTo(2000/7,2,2)  == 284       -- 100011100
      roundTo(2000/7,1,2)  == 286       -- 100011110
      roundTo(2000/7,0,2)  == 286       -- 100011110
      roundTo(2000/7,-1,2) == 285.5     -- 100011101.1
      roundTo(2000/7,-2,2) == 285.75    -- 100011101.11
      roundTo(2000/7,-3,2) == 285.75    -- 100011101.11
      roundTo(2000/7,-4,2) == 285.6875  -- 100011101.1011
      roundTo(2000/7,-5,2) == 285.71875 -- 100011101.10111
  
  Note what occurs when we round to the 3rd space (8ths place), 100100000, this is to be assumed
  because we are rounding 100011.1011011011011011 which rounds up.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * value (number) - The value to round.
    * place (number) - The place to round to.
    * base (number) - The base to round in... default is 10 for decimal.

  Returns:  number - "
  ([value place base]
   (phaser->clj
    (.roundTo js/Phaser.Math
              (clj->phaser value)
              (clj->phaser place)
              (clj->phaser base)))))

(defn floor-to-
  "

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * value (number) - The value to round.
    * place (number) - The place to round to.
    * base (number) - The base to round in... default is 10 for decimal.

  Returns:  number - "
  ([value place base]
   (phaser->clj
    (.floorTo js/Phaser.Math
              (clj->phaser value)
              (clj->phaser place)
              (clj->phaser base)))))

(defn ceil-to-
  "

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * value (number) - The value to round.
    * place (number) - The place to round to.
    * base (number) - The base to round in... default is 10 for decimal.

  Returns:  number - "
  ([value place base]
   (phaser->clj
    (.ceilTo js/Phaser.Math
             (clj->phaser value)
             (clj->phaser place)
             (clj->phaser base)))))

(defn angle-between-
  "Find the angle of a segment from (x1, y1) -> (x2, y2).

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x-1 (number) - No description
    * y-1 (number) - No description
    * x-2 (number) - No description
    * y-2 (number) - No description

  Returns:  number - The angle, in radians."
  ([x-1 y-1 x-2 y-2]
   (phaser->clj
    (.angleBetween js/Phaser.Math
                   (clj->phaser x-1)
                   (clj->phaser y-1)
                   (clj->phaser x-2)
                   (clj->phaser y-2)))))

(defn angle-between-y-
  "Find the angle of a segment from (x1, y1) -> (x2, y2).
  Note that the difference between this method and Math.angleBetween is that this assumes the y coordinate travels
  down the screen.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x-1 (number) - No description
    * y-1 (number) - No description
    * x-2 (number) - No description
    * y-2 (number) - No description

  Returns:  number - The angle, in radians."
  ([x-1 y-1 x-2 y-2]
   (phaser->clj
    (.angleBetweenY js/Phaser.Math
                    (clj->phaser x-1)
                    (clj->phaser y-1)
                    (clj->phaser x-2)
                    (clj->phaser y-2)))))

(defn angle-between-points-
  "Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * point-1 (Phaser.Point) - No description
    * point-2 (Phaser.Point) - No description

  Returns:  number - The angle, in radians."
  ([point-1 point-2]
   (phaser->clj
    (.angleBetweenPoints js/Phaser.Math
                         (clj->phaser point-1)
                         (clj->phaser point-2)))))

(defn angle-between-points-y-
  "Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * point-1 (Phaser.Point) - No description
    * point-2 (Phaser.Point) - No description

  Returns:  number - The angle, in radians."
  ([point-1 point-2]
   (phaser->clj
    (.angleBetweenPointsY js/Phaser.Math
                          (clj->phaser point-1)
                          (clj->phaser point-2)))))

(defn reverse-angle-
  "Reverses an angle.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * angle-rad (number) - The angle to reverse, in radians.

  Returns:  number - Returns the reverse angle, in radians."
  ([angle-rad]
   (phaser->clj
    (.reverseAngle js/Phaser.Math
                   (clj->phaser angle-rad)))))

(defn normalize-angle-
  "Normalizes an angle to the [0,2pi) range.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * angle-rad (number) - The angle to normalize, in radians.

  Returns:  number - Returns the angle, fit within the [0,2pi] range, in radians."
  ([angle-rad]
   (phaser->clj
    (.normalizeAngle js/Phaser.Math
                     (clj->phaser angle-rad)))))

(defn max-add-
  "Adds the given amount to the value, but never lets the value go over the specified maximum.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * value (number) - The value to add the amount to.
    * amount (number) - The amount to add to the value.
    * max (number) - The maximum the value is allowed to be.

  Returns:  number - "
  ([value amount max]
   (phaser->clj
    (.maxAdd js/Phaser.Math
             (clj->phaser value)
             (clj->phaser amount)
             (clj->phaser max)))))

(defn min-sub-
  "Subtracts the given amount from the value, but never lets the value go below the specified minimum.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * value (number) - The base value.
    * amount (number) - The amount to subtract from the base value.
    * min (number) - The minimum the value is allowed to be.

  Returns:  number - The new value."
  ([value amount min]
   (phaser->clj
    (.minSub js/Phaser.Math
             (clj->phaser value)
             (clj->phaser amount)
             (clj->phaser min)))))

(defn wrap-
  "Ensures that the value always stays between min and max, by wrapping the value around.
  
  If `max` is not larger than `min` the result is 0.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * value (number) - The value to wrap.
    * min (number) - The minimum the value is allowed to be.
    * max (number) - The maximum the value is allowed to be, should be larger than `min`.

  Returns:  number - The wrapped value."
  ([value min max]
   (phaser->clj
    (.wrap js/Phaser.Math
           (clj->phaser value)
           (clj->phaser min)
           (clj->phaser max)))))

(defn wrap-value-
  "Adds value to amount and ensures that the result always stays between 0 and max, by wrapping the value around.
  
  Values _must_ be positive integers, and are passed through Math.abs. See {@link Phaser.Math#wrap} for an alternative.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * value (number) - The value to add the amount to.
    * amount (number) - The amount to add to the value.
    * max (number) - The maximum the value is allowed to be.

  Returns:  number - The wrapped value."
  ([value amount max]
   (phaser->clj
    (.wrapValue js/Phaser.Math
                (clj->phaser value)
                (clj->phaser amount)
                (clj->phaser max)))))

(defn is-odd-
  "Returns true if the number given is odd.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * n (integer) - The number to check.

  Returns:  boolean - True if the given number is odd. False if the given number is even."
  ([n]
   (phaser->clj
    (.isOdd js/Phaser.Math
            (clj->phaser n)))))

(defn is-even-
  "Returns true if the number given is even.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * n (integer) - The number to check.

  Returns:  boolean - True if the given number is even. False if the given number is odd."
  ([n]
   (phaser->clj
    (.isEven js/Phaser.Math
             (clj->phaser n)))))

(defn min-
  "Variation of Math.min that can be passed either an array of numbers or the numbers as parameters.
  
  Prefer the standard `Math.min` function when appropriate.

  Returns:  number - The lowest value from those given."
  ([]
   (phaser->clj
    (.min js/Phaser.Math))))

(defn max-
  "Variation of Math.max that can be passed either an array of numbers or the numbers as parameters.
  
  Prefer the standard `Math.max` function when appropriate.

  Returns:  number - The largest value from those given."
  ([]
   (phaser->clj
    (.max js/Phaser.Math))))

(defn min-property-
  "Variation of Math.min that can be passed a property and either an array of objects or the objects as parameters.
  It will find the lowest matching property value from the given objects.

  Returns:  number - The lowest value from those given."
  ([]
   (phaser->clj
    (.minProperty js/Phaser.Math))))

(defn max-property-
  "Variation of Math.max that can be passed a property and either an array of objects or the objects as parameters.
  It will find the largest matching property value from the given objects.

  Returns:  number - The largest value from those given."
  ([]
   (phaser->clj
    (.maxProperty js/Phaser.Math))))

(defn wrap-angle-
  "Keeps an angle value between -180 and +180; or -PI and PI if radians.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * angle (number) - The angle value to wrap
    * radians (boolean) {optional}  - Set to `true` if the angle is given in radians, otherwise degrees is expected.

  Returns:  number - The new angle value; will be the same as the input angle if it was within bounds."
  ([angle]
   (phaser->clj
    (.wrapAngle js/Phaser.Math
                (clj->phaser angle))))
  ([angle radians]
   (phaser->clj
    (.wrapAngle js/Phaser.Math
                (clj->phaser angle)
                (clj->phaser radians)))))

(defn linear-interpolation-
  "A Linear Interpolation Method, mostly used by Phaser.Tween.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * v (Array) - The input array of values to interpolate between.
    * k (number) - The percentage of interpolation, between 0 and 1.

  Returns:  number - The interpolated value"
  ([v k]
   (phaser->clj
    (.linearInterpolation js/Phaser.Math
                          (clj->phaser v)
                          (clj->phaser k)))))

(defn bezier-interpolation-
  "A Bezier Interpolation Method, mostly used by Phaser.Tween.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * v (Array) - The input array of values to interpolate between.
    * k (number) - The percentage of interpolation, between 0 and 1.

  Returns:  number - The interpolated value"
  ([v k]
   (phaser->clj
    (.bezierInterpolation js/Phaser.Math
                          (clj->phaser v)
                          (clj->phaser k)))))

(defn catmull-rom-interpolation-
  "A Catmull Rom Interpolation Method, mostly used by Phaser.Tween.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * v (Array) - The input array of values to interpolate between.
    * k (number) - The percentage of interpolation, between 0 and 1.

  Returns:  number - The interpolated value"
  ([v k]
   (phaser->clj
    (.catmullRomInterpolation js/Phaser.Math
                              (clj->phaser v)
                              (clj->phaser k)))))

(defn linear-
  "Calculates a linear (interpolation) value over t.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * p-0 (number) - No description
    * p-1 (number) - No description
    * t (number) - No description

  Returns:  number - "
  ([p-0 p-1 t]
   (phaser->clj
    (.linear js/Phaser.Math
             (clj->phaser p-0)
             (clj->phaser p-1)
             (clj->phaser t)))))

(defn factorial-
  "

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * value (number) - the number you want to evaluate

  Returns:  number - "
  ([value]
   (phaser->clj
    (.factorial js/Phaser.Math
                (clj->phaser value)))))

(defn difference-
  "The (absolute) difference between two values.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * a (number) - No description
    * b (number) - No description

  Returns:  number - "
  ([a b]
   (phaser->clj
    (.difference js/Phaser.Math
                 (clj->phaser a)
                 (clj->phaser b)))))

(defn round-away-from-zero-
  "Round to the next whole number _away_ from zero.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * value (number) - Any number.

  Returns:  integer - The rounded value of that number."
  ([value]
   (phaser->clj
    (.roundAwayFromZero js/Phaser.Math
                        (clj->phaser value)))))

(defn sin-cos-generator-
  "Generate a sine and cosine table simultaneously and extremely quickly.
  The parameters allow you to specify the length, amplitude and frequency of the wave.
  This generator is fast enough to be used in real-time.
  Code based on research by Franky of scene.at

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * length (number) - The length of the wave
    * sin-amplitude (number) - The amplitude to apply to the sine table (default 1.0) if you need values between say -+ 125 then give 125 as the value
    * cos-amplitude (number) - The amplitude to apply to the cosine table (default 1.0) if you need values between say -+ 125 then give 125 as the value
    * frequency (number) - The frequency of the sine and cosine table data

  Returns:  Object - Returns the table data."
  ([length sin-amplitude cos-amplitude frequency]
   (phaser->clj
    (.sinCosGenerator js/Phaser.Math
                      (clj->phaser length)
                      (clj->phaser sin-amplitude)
                      (clj->phaser cos-amplitude)
                      (clj->phaser frequency)))))

(defn distance-
  "Returns the euclidian distance between the two given set of coordinates.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x-1 (number) - No description
    * y-1 (number) - No description
    * x-2 (number) - No description
    * y-2 (number) - No description

  Returns:  number - The distance between the two sets of coordinates."
  ([x-1 y-1 x-2 y-2]
   (phaser->clj
    (.distance js/Phaser.Math
               (clj->phaser x-1)
               (clj->phaser y-1)
               (clj->phaser x-2)
               (clj->phaser y-2)))))

(defn distance-sq-
  "Returns the euclidean distance squared between the two given set of
  coordinates (cuts out a square root operation before returning).

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x-1 (number) - No description
    * y-1 (number) - No description
    * x-2 (number) - No description
    * y-2 (number) - No description

  Returns:  number - The distance squared between the two sets of coordinates."
  ([x-1 y-1 x-2 y-2]
   (phaser->clj
    (.distanceSq js/Phaser.Math
                 (clj->phaser x-1)
                 (clj->phaser y-1)
                 (clj->phaser x-2)
                 (clj->phaser y-2)))))

(defn distance-pow-
  "Returns the distance between the two given set of coordinates at the power given.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x-1 (number) - No description
    * y-1 (number) - No description
    * x-2 (number) - No description
    * y-2 (number) - No description
    * pow (number) {optional}  - No description

  Returns:  number - The distance between the two sets of coordinates."
  ([x-1 y-1 x-2 y-2]
   (phaser->clj
    (.distancePow js/Phaser.Math
                  (clj->phaser x-1)
                  (clj->phaser y-1)
                  (clj->phaser x-2)
                  (clj->phaser y-2))))
  ([x-1 y-1 x-2 y-2 pow]
   (phaser->clj
    (.distancePow js/Phaser.Math
                  (clj->phaser x-1)
                  (clj->phaser y-1)
                  (clj->phaser x-2)
                  (clj->phaser y-2)
                  (clj->phaser pow)))))

(defn clamp-
  "Force a value within the boundaries by clamping `x` to the range `[a, b]`.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x (number) - No description
    * a (number) - No description
    * b (number) - No description

  Returns:  number - "
  ([x a b]
   (phaser->clj
    (.clamp js/Phaser.Math
            (clj->phaser x)
            (clj->phaser a)
            (clj->phaser b)))))

(defn clamp-bottom-
  "Clamp `x` to the range `[a, Infinity)`.
  Roughly the same as `Math.max(x, a)`, except for NaN handling.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x (number) - No description
    * a (number) - No description

  Returns:  number - "
  ([x a]
   (phaser->clj
    (.clampBottom js/Phaser.Math
                  (clj->phaser x)
                  (clj->phaser a)))))

(defn within-
  "Checks if two values are within the given tolerance of each other.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * a (number) - The first number to check
    * b (number) - The second number to check
    * tolerance (number) - The tolerance. Anything equal to or less than this is considered within the range.

  Returns:  boolean - True if a is <= tolerance of b."
  ([a b tolerance]
   (phaser->clj
    (.within js/Phaser.Math
             (clj->phaser a)
             (clj->phaser b)
             (clj->phaser tolerance)))))

(defn map-linear-
  "Linear mapping from range <a1, a2> to range <b1, b2>

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x (number) - the value to map
    * a-1 (number) - first endpoint of the range <a1, a2>
    * a-2 (number) - final endpoint of the range <a1, a2>
    * b-1 (number) - first endpoint of the range <b1, b2>
    * b-2 (number) - final endpoint of the range  <b1, b2>

  Returns:  number - "
  ([x a-1 a-2 b-1 b-2]
   (phaser->clj
    (.mapLinear js/Phaser.Math
                (clj->phaser x)
                (clj->phaser a-1)
                (clj->phaser a-2)
                (clj->phaser b-1)
                (clj->phaser b-2)))))

(defn smoothstep-
  "Smoothstep function as detailed at http://en.wikipedia.org/wiki/Smoothstep

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x (number) - No description
    * min (number) - No description
    * max (number) - No description

  Returns:  number - "
  ([x min max]
   (phaser->clj
    (.smoothstep js/Phaser.Math
                 (clj->phaser x)
                 (clj->phaser min)
                 (clj->phaser max)))))

(defn smootherstep-
  "Smootherstep function as detailed at http://en.wikipedia.org/wiki/Smoothstep

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x (number) - No description
    * min (number) - No description
    * max (number) - No description

  Returns:  number - "
  ([x min max]
   (phaser->clj
    (.smootherstep js/Phaser.Math
                   (clj->phaser x)
                   (clj->phaser min)
                   (clj->phaser max)))))

(defn sign-
  "A value representing the sign of the value: -1 for negative, +1 for positive, 0 if value is 0.
  
  This works differently from `Math.sign` for values of NaN and -0, etc.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * x (number) - No description

  Returns:  integer - An integer in {-1, 0, 1}"
  ([x]
   (phaser->clj
    (.sign js/Phaser.Math
           (clj->phaser x)))))

(defn percent-
  "Work out what percentage value `a` is of value `b` using the given base.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * a (number) - The value to work out the percentage for.
    * b (number) - The value you wish to get the percentage of.
    * base (number) {optional}  - The base value.

  Returns:  number - The percentage a is of b, between 0 and 1."
  ([a b]
   (phaser->clj
    (.percent js/Phaser.Math
              (clj->phaser a)
              (clj->phaser b))))
  ([a b base]
   (phaser->clj
    (.percent js/Phaser.Math
              (clj->phaser a)
              (clj->phaser b)
              (clj->phaser base)))))

(defn deg-to-rad-
  "Convert degrees to radians.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * degrees (number) - Angle in degrees.

  Returns:  number - Angle in radians."
  ([degrees]
   (phaser->clj
    (.degToRad js/Phaser.Math
               (clj->phaser degrees)))))

(defn rad-to-deg-
  "Convert degrees to radians.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * radians (number) - Angle in radians.

  Returns:  number - Angle in degrees"
  ([radians]
   (phaser->clj
    (.radToDeg js/Phaser.Math
               (clj->phaser radians)))))

(defn chance-roll-
  "Generate a random bool result based on the chance value.
  
  Returns true or false based on the chance value (default 50%). For example if you wanted a player to have a 30% chance
  of getting a bonus, call chanceRoll(30) - true means the chance passed, false means it failed.

  Parameters:
    * math (Phaser.Math) - Targeted instance for method
    * chance (number) - The chance of receiving the value. A number between 0 and 100 (effectively 0% to 100%).

  Returns:  boolean - True if the roll passed, or false otherwise."
  ([chance]
   (phaser->clj
    (.chanceRoll js/Phaser.Math
                 (clj->phaser chance)))))