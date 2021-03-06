(defproject conman "0.2.6"
  :description "a database connection management library"
  :url "https://github.com/luminus-framework/conman"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-dbcp "0.8.1"]
                 [com.zaxxer/HikariCP "2.4.2"]
                 [yesql "0.5.1"]
                 [instaparse "1.4.1"]
                 [com.carouselapps/to-jdbc-uri "0.4.1"]
                 [org.clojure/java.jdbc "0.4.2"]]
  :profiles
  {:dev
   {:dependencies [[com.h2database/h2 "1.4.190"]]}})
