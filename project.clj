(defproject org.writequit/elasticsearch-lang-clojure "0.1.0-SNAPSHOT"
  :description "Clojure language plugin for Elasticsearch"
  :url "https://github.com/dakrone/elasticsearch-lang-clojure.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.elasticsearch/elasticsearch "2.0.0"]
                 [org.clojure/tools.logging "0.2.6"]]
  :profiles {:dev {:dependencies [[log4j/log4j "1.2.16"]]}}
  :aot [org.writequit.es.lang.clojure.engine
        org.writequit.es.lang.clojure.plugin])
