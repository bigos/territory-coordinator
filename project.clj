(defproject territory-coordinator "1.0.0-SNAPSHOT"
  :description "Demo Clojure web app"
  :url "http://territory-coordinator.herokuapp.com"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.0"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [environ "1.1.0"]
                 [camel-snake-kebab "0.2.4"]
                 [org.clojure/java.jdbc "0.7.6"]
                 [org.postgresql/postgresql "9.4-1212"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "territory-coordinator-standalone.jar"
  :profiles {:production {:env {:production true}}})
