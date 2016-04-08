(ns hellowebapp.core)

(defn app [req]
  { :status 200
  	:headers {"Content-Type" "text/html"}
  	:body "Hello World! Clojure looks easier than I thought"})
