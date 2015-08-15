(defproject phzr "0.1.0-SNAPSHOT"
  :description "A ClojureScript wrapper for the Phaser HTML5 game framework"
  :url "http://github.com/dparis/phzr"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [cljsjs/phaser "2.4.2-0"]
                 [camel-snake-kebab "0.3.2"]]

  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.2.1"]]
                   :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}})
