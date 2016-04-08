(defproject hellowebapp "0.1.0-SNAPSHOT"
  :description "Hello world webapp"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.7"]]
  :dependencies [[org.clojure/clojure "1.6.0"]
  				 [ring "1.4.0"]]
  :ring {:handler hellowebapp.core/app})
