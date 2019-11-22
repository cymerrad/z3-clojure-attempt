(ns z3-clojure-attempt.core
  (:import [com.microsoft.z3 Context])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!" (new Context )))
