(defproject mapping-store "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler mapping-store.handler/app
         :nrepl {:start? true
                 :port 9998}}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [compojure "1.5.0"]]
  :main ^:skip-aot mapping-store.core
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]
                                  [ring/ring-mock "0.3.0"]]}
             :uberjar {:aot :all}})
