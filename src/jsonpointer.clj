(ns jsonpointer
  (:require [clojure.string :as string])
  (:require [ring.util.codec :as codec]))

(defn split "Split a jsonpointer string into an array of keys" [jsonpointer]
  (map codec/url-decode (string/split jsonpointer #"/")))