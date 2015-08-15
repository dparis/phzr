(ns phzr.physics.p2.fixture-list
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [flatten]))

(defn ->FixtureList
  "Allow to access a list of created fixture (coming from Body#addPhaserPolygon)
  which itself parse the input from PhysicsEditor with the custom phaser exporter.
  You can access fixtures of a Body by a group index or even by providing a fixture Key.
  You can set the fixture key and also the group index for a fixture in PhysicsEditor.
  This gives you the power to create a complex body built of many fixtures and modify them
  during runtime (to remove parts, set masks, categories & sensor properties)

  Parameters:
    * list (Array) - A list of fixtures (from Phaser.Physics.P2.Body#addPhaserPolygon)"
  ([list]
   (js/Phaser.Physics.P2.FixtureList. (clj->phaser list))))

(defn flatten
  "A helper to flatten arrays. This is very useful as the fixtures are nested from time to time due to the way P2 creates and splits polygons.

  Parameters:
    * fixture-list (Phaser.Physics.P2.FixtureList) - Targeted instance for method
    * array (array) - The array to flatten. Notice: This will happen recursive not shallow."
  ([fixture-list array]
   (phaser->clj
    (.flatten fixture-list
              (clj->phaser array)))))

(defn get-fixture-by-key
  "Accessor to get either a single fixture by its key.

  Parameters:
    * fixture-list (Phaser.Physics.P2.FixtureList) - Targeted instance for method
    * key (string) - The key of the fixture."
  ([fixture-list key]
   (phaser->clj
    (.getFixtureByKey fixture-list
                      (clj->phaser key)))))

(defn get-fixtures
  "Accessor to get either a list of specified fixtures by key or the whole fixture list

  Parameters:
    * fixture-list (Phaser.Physics.P2.FixtureList) - Targeted instance for method
    * keys (array) - A list of fixture keys"
  ([fixture-list keys]
   (phaser->clj
    (.getFixtures fixture-list
                  (clj->phaser keys)))))

(defn get-group
  "Accessor to get a group of fixtures by its group index.

  Parameters:
    * fixture-list (Phaser.Physics.P2.FixtureList) - Targeted instance for method
    * group-id (number) - The group index."
  ([fixture-list group-id]
   (phaser->clj
    (.getGroup fixture-list
               (clj->phaser group-id)))))

(defn init
  ""
  ([fixture-list]
   (phaser->clj
    (.init fixture-list))))

(defn parse
  "Parser for the output of Phaser.Physics.P2.Body#addPhaserPolygon"
  ([fixture-list]
   (phaser->clj
    (.parse fixture-list))))

(defn set-category
  "

  Parameters:
    * fixture-list (Phaser.Physics.P2.FixtureList) - Targeted instance for method
    * bit (number) - The bit to set as the collision group.
    * fixture-key (string) - Only apply to the fixture with the given key."
  ([fixture-list bit fixture-key]
   (phaser->clj
    (.setCategory fixture-list
                  (clj->phaser bit)
                  (clj->phaser fixture-key)))))

(defn set-mask
  "

  Parameters:
    * fixture-list (Phaser.Physics.P2.FixtureList) - Targeted instance for method
    * bit (number) - The bit to set as the collision mask
    * fixture-key (string) - Only apply to the fixture with the given key"
  ([fixture-list bit fixture-key]
   (phaser->clj
    (.setMask fixture-list
              (clj->phaser bit)
              (clj->phaser fixture-key)))))

(defn set-material
  "

  Parameters:
    * fixture-list (Phaser.Physics.P2.FixtureList) - Targeted instance for method
    * material (Object) - The contact material for a fixture
    * fixture-key (string) - Only apply to the fixture with the given key"
  ([fixture-list material fixture-key]
   (phaser->clj
    (.setMaterial fixture-list
                  (clj->phaser material)
                  (clj->phaser fixture-key)))))

(defn set-sensor
  "

  Parameters:
    * fixture-list (Phaser.Physics.P2.FixtureList) - Targeted instance for method
    * value (boolean) - sensor true or false
    * fixture-key (string) - Only apply to the fixture with the given key"
  ([fixture-list value fixture-key]
   (phaser->clj
    (.setSensor fixture-list
                (clj->phaser value)
                (clj->phaser fixture-key)))))