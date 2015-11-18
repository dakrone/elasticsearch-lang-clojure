;; compilation environment for clojure es scripts
(ns org.writequit.es.lang.clojure.core)

(defprotocol Value
  (value [_]))

(extend-protocol Value
  org.elasticsearch.index.fielddata.ScriptDocValues
  (value [x]
    (.getValue x))
  Object
  (value [x]
    x))
