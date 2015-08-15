(ns phzr.device
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn can-play-audio
  "Check whether the host environment can play audio.

  Parameters:
    * device (Phaser.Device) - Targeted instance for method
    * type (string) - One of 'mp3, 'ogg', 'm4a', 'wav', 'webm' or 'opus'.

  Returns:  boolean - True if the given file type is supported by the browser, otherwise false."
  ([device type]
   (phaser->clj
    (.canPlayAudio device
                   (clj->phaser type)))))

(defn can-play-video
  "Check whether the host environment can play video files.

  Parameters:
    * device (Phaser.Device) - Targeted instance for method
    * type (string) - One of 'mp4, 'ogg', 'webm' or 'mpeg'.

  Returns:  boolean - True if the given file type is supported by the browser, otherwise false."
  ([device type]
   (phaser->clj
    (.canPlayVideo device
                   (clj->phaser type)))))

(defn is-android-stock-browser
  "Detect if the host is a an Android Stock browser.
  This is available before the device 'ready' event.

  Authors might want to scale down on effects and switch to the CANVAS rendering method on those devices."
  ([device]
   (phaser->clj
    (.isAndroidStockBrowser device))))

(defn is-console-open
  "Check whether the console is open.
  Note that this only works in Firefox with Firebug and earlier versions of Chrome.
  It used to work in Chrome, but then they removed the ability: {@link http://src.chromium.org/viewvc/blink?view=revision&revision=151136}"
  ([device]
   (phaser->clj
    (.isConsoleOpen device))))

(defn when-ready-
  "Add a device-ready handler and ensure the device ready sequence is started.

  Phaser.Device will _not_ activate or initialize until at least one `whenReady` handler is added,
  which is normally done automatically be calling `new Phaser.Game(..)`.

  The handler is invoked when the device is considered 'ready', which may be immediately
  if the device is already 'ready'. See {@link Phaser.Device#deviceReadyAt deviceReadyAt}.

  Parameters:
    * handler (function) - Callback to invoke when the device is ready. It is invoked with the given context the Phaser.Device object is supplied as the first argument.
    * context (object) {optional} - Context in which to invoke the handler
    * non-primer (boolean) {optional} - If true the device ready check will not be started."
  ([handler]
   (phaser->clj
    (.whenReady js/Phaser.Device
                (clj->phaser handler))))
  ([handler context]
   (phaser->clj
    (.whenReady js/Phaser.Device
                (clj->phaser handler)
                (clj->phaser context))))
  ([handler context non-primer]
   (phaser->clj
    (.whenReady js/Phaser.Device
                (clj->phaser handler)
                (clj->phaser context)
                (clj->phaser non-primer)))))