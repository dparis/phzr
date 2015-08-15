(ns phzr.impl.utils.js
  (:require [camel-snake-kebab.core :as csk]
            [clojure.string :as st]
            [goog.array :as garr]
            [goog.object :as gobj]))


(defn js-type
  [o]
  (let [ty (type o)
        ty (if (and ty (.-cljs$lang$type ty))
             (.-cljs$lang$ctorStr ty)
             (js/goog.typeOf o))]
    ty))

(defn js-obj?
  [o]
  (identical? (type o) js/Object))

(defn obj-only
  [o method]
  (when-not (js-obj? o)
    (throw (js/TypeError.
            (str (js-type o) " does not implement '" (name method) "'")))))

(defn ^:private name-kebab-touchup
  [s]
  (-> s
      (st/replace #"web\-gl" "webgl")
      (st/replace #"p\-2js" "p2-js")
      (st/replace #"p\-2" "p2")
      (st/replace #"palette\-c\-64" "palette-c64")
      (st/replace #"box\-2\-d" "box-2d")))

(def name->kebab
  (memoize
   (fn [s]
     (-> s
         (csk/->kebab-case-string)
         (st/lower-case)
         (name-kebab-touchup)))))

(defn ^:private camel-name-touchup
  [s]
  s)

(def kebab->name
  (memoize
   (fn [s]
     (-> s
         (csk/->camelCaseString)
         (camel-name-touchup)))))

(defn js-strkey [x]
  (cond
    (string? x) (kebab->name x)
    (keyword? x) (kebab->name (name x))
    :else (str x)))

(defn js-lookup
  ([o k]
   (aget o (js-strkey k)))
  ([o k not-found]
   (let [s (js-strkey k)]
     (if-let [res (aget o s)]
       res
       not-found))))

(defn js-assoc
  ([o k v]
   (do (aset o (js-strkey k) v)
       o))
  ([o k v & more]
   (js-assoc o k v)
   (if more
     (recur o (first more) (second more) (nnext more))
     o)))

(defn js-dissoc
  [o k & more]
  (js-delete o (js-strkey k))
  (if more
    (recur o (first more) (next more))
    o))

(defn js-copy
  [o]
  (let [t (js/goog.typeOf o)]
    (cond (= t "array")  (garr/clone o)
          :else (gobj/clone o))))

(defn js-conj-object
  [parent [k v]]
  (let [o (gobj/clone parent)]
    (js-assoc o k v)))
