(ns jsonpointer-test
  (:use [jsonpointer] :reload)
  (:use [midje.sweet] [clojure.test]))

(deftest split-simple-jsonpointer
  (fact (split "/") => [])
  (fact (split "a/b") => ["a" "b"]))

(deftest split-jsonpointer-with-slash
  (fact (split "lib%2Fhello.txt/size") => ["lib/hello.txt" "size"]))