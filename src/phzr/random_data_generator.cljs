(ns phzr.random-data-generator
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [uuid]))

(defn ->RandomDataGenerator
  "An extremely useful repeatable random data generator.

  Based on Nonsense by Josh Faul https://github.com/jocafa/Nonsense.

  The random number genererator is based on the Alea PRNG, but is modified.
   - https://github.com/coverslide/node-alea
   - https://github.com/nquinlan/better-random-numbers-for-javascript-mirror
   - http://baagoe.org/en/wiki/Better_random_numbers_for_javascript (original, perm. 404)

  Parameters:
    * seeds (Array.<any>) {optional} - An array of values to use as the seed."
  ([]
   (js/Phaser.RandomDataGenerator.))
  ([seeds]
   (js/Phaser.RandomDataGenerator. (clj->phaser seeds))))

(defn angle
  "Returns a random angle between -180 and 180.

  Returns:  number - A random number between -180 and 180."
  ([random-data-generator]
   (phaser->clj
    (.angle random-data-generator))))

(defn between
  "Returns a random integer between and including min and max.
  This method is an alias for RandomDataGenerator.integerInRange.

  Parameters:
    * random-data-generator (Phaser.RandomDataGenerator) - Targeted instance for method
    * min (number) - The minimum value in the range.
    * max (number) - The maximum value in the range.

  Returns:  number - A random number between min and max."
  ([random-data-generator min max]
   (phaser->clj
    (.between random-data-generator
              (clj->phaser min)
              (clj->phaser max)))))

(defn frac
  "Returns a random real number between 0 and 1.

  Returns:  number - A random real number between 0 and 1."
  ([random-data-generator]
   (phaser->clj
    (.frac random-data-generator))))

(defn integer
  "Returns a random integer between 0 and 2^32.

  Returns:  number - A random integer between 0 and 2^32."
  ([random-data-generator]
   (phaser->clj
    (.integer random-data-generator))))

(defn integer-in-range
  "Returns a random integer between and including min and max.

  Parameters:
    * random-data-generator (Phaser.RandomDataGenerator) - Targeted instance for method
    * min (number) - The minimum value in the range.
    * max (number) - The maximum value in the range.

  Returns:  number - A random number between min and max."
  ([random-data-generator min max]
   (phaser->clj
    (.integerInRange random-data-generator
                     (clj->phaser min)
                     (clj->phaser max)))))

(defn normal
  "Returns a random real number between -1 and 1.

  Returns:  number - A random real number between -1 and 1."
  ([random-data-generator]
   (phaser->clj
    (.normal random-data-generator))))

(defn pick
  "Returns a random member of `array`.

  Parameters:
    * random-data-generator (Phaser.RandomDataGenerator) - Targeted instance for method
    * ary (Array) - An Array to pick a random member of.

  Returns:  any - A random member of the array."
  ([random-data-generator ary]
   (phaser->clj
    (.pick random-data-generator
           (clj->phaser ary)))))

(defn real
  "Returns a random real number between 0 and 2^32.

  Returns:  number - A random real number between 0 and 2^32."
  ([random-data-generator]
   (phaser->clj
    (.real random-data-generator))))

(defn real-in-range
  "Returns a random real number between min and max.

  Parameters:
    * random-data-generator (Phaser.RandomDataGenerator) - Targeted instance for method
    * min (number) - The minimum value in the range.
    * max (number) - The maximum value in the range.

  Returns:  number - A random number between min and max."
  ([random-data-generator min max]
   (phaser->clj
    (.realInRange random-data-generator
                  (clj->phaser min)
                  (clj->phaser max)))))

(defn sow
  "Reset the seed of the random data generator.

  _Note_: the seed array is only processed up to the first `undefined` (or `null`) value, should such be present.

  Parameters:
    * random-data-generator (Phaser.RandomDataGenerator) - Targeted instance for method
    * seeds (Array.<any>) - The array of seeds: the `toString()` of each value is used."
  ([random-data-generator seeds]
   (phaser->clj
    (.sow random-data-generator
          (clj->phaser seeds)))))

(defn timestamp
  "Returns a random timestamp between min and max, or between the beginning of 2000 and the end of 2020 if min and max aren't specified.

  Parameters:
    * random-data-generator (Phaser.RandomDataGenerator) - Targeted instance for method
    * min (number) - The minimum value in the range.
    * max (number) - The maximum value in the range.

  Returns:  number - A random timestamp between min and max."
  ([random-data-generator min max]
   (phaser->clj
    (.timestamp random-data-generator
                (clj->phaser min)
                (clj->phaser max)))))

(defn uuid
  "Returns a valid RFC4122 version4 ID hex string from https://gist.github.com/1308368

  Returns:  string - A valid RFC4122 version4 ID hex string"
  ([random-data-generator]
   (phaser->clj
    (.uuid random-data-generator))))

(defn weighted-pick
  "Returns a random member of `array`, favoring the earlier entries.

  Parameters:
    * random-data-generator (Phaser.RandomDataGenerator) - Targeted instance for method
    * ary (Array) - An Array to pick a random member of.

  Returns:  any - A random member of the array."
  ([random-data-generator ary]
   (phaser->clj
    (.weightedPick random-data-generator
                   (clj->phaser ary)))))