(defproject dating.irl/image-color "0.1.0-SNAPSHOT"
  :description "determine dominant colors in an image"
  :url "http://irl.dating"
  :license {:name "UNLICENSE" :url "http://unlicense.org"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.imgscalr/imgscalr-lib "4.2"]]
  :resource-paths ["resources"]
  :main image-color.core
  :aot :all)
