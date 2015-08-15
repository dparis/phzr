(ns phzr.net
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser]))

(defn ->Net
  "Phaser.Net handles browser URL related tasks such as checking host names, domain names and query string manipulation.

  Parameters:
    * game (Phaser.Game) - A reference to the currently running game."
  ([game]
   (js/Phaser.Net. (clj->phaser game))))

(defn check-domain-name
  "Compares the given domain name against the hostname of the browser containing the game.
  If the domain name is found it returns true.
  You can specify a part of a domain, for example 'google' would match 'google.com', 'google.co.uk', etc.
  Do not include 'http://' at the start.

  Parameters:
    * net (Phaser.Net) - Targeted instance for method
    * domain (string) - No description

  Returns:  boolean - true if the given domain fragment can be found in the window.location.hostname"
  ([net domain]
   (phaser->clj
    (.checkDomainName net
                      (clj->phaser domain)))))

(defn decode-uri
  "Returns the Query String as an object.
  If you specify a parameter it will return just the value of that parameter, should it exist.

  Parameters:
    * net (Phaser.Net) - Targeted instance for method
    * value (string) - The URI component to be decoded.

  Returns:  string - The decoded value."
  ([net value]
   (phaser->clj
    (.decodeURI net
                (clj->phaser value)))))

(defn get-host-name
  "Returns the hostname given by the browser.

  Returns:  string - "
  ([net]
   (phaser->clj
    (.getHostName net))))

(defn get-query-string
  "Returns the Query String as an object.
  If you specify a parameter it will return just the value of that parameter, should it exist.

  Parameters:
    * net (Phaser.Net) - Targeted instance for method
    * parameter (string) {optional} - If specified this will return just the value for that key.

  Returns:  [string | object] - An object containing the key value pairs found in the query string or just the value if a parameter was given."
  ([net]
   (phaser->clj
    (.getQueryString net)))
  ([net parameter]
   (phaser->clj
    (.getQueryString net
                     (clj->phaser parameter)))))

(defn update-query-string
  "Updates a value on the Query String and returns it in full.
  If the value doesn't already exist it is set.
  If the value exists it is replaced with the new value given. If you don't provide a new value it is removed from the query string.
  Optionally you can redirect to the new url, or just return it as a string.

  Parameters:
    * net (Phaser.Net) - Targeted instance for method
    * key (string) - The querystring key to update.
    * value (string) - The new value to be set. If it already exists it will be replaced.
    * redirect (boolean) - If true the browser will issue a redirect to the url with the new querystring.
    * url (string) - The URL to modify. If none is given it uses window.location.href.

  Returns:  string - If redirect is false then the modified url and query string is returned."
  ([net key value redirect url]
   (phaser->clj
    (.updateQueryString net
                        (clj->phaser key)
                        (clj->phaser value)
                        (clj->phaser redirect)
                        (clj->phaser url)))))