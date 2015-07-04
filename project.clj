(defproject jarohen/chord "0.7.0-SNAPSHOT"
  :description "A library to bridge the gap between CLJ/CLJS, web-sockets and core.async"
  :url "https://github.com/james-henderson/chord.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [http-kit "2.1.18"]
                 [org.clojure/tools.reader "0.9.2"]

                 [com.cemerick/url "0.1.1"]
                 [cheshire "5.3.1"]

                 [com.cognitect/transit-clj "0.8.259"]
                 [com.cognitect/transit-cljs "0.8.192"]

                 [org.clojure/data.fressian "0.2.0"]
                 [net.unit8/fressian-cljs "0.1.0"]])
