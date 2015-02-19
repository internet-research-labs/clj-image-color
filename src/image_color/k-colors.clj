(ns image-color.k-colors
  (:import [org.imgscalr Scalr]
           [org.imgscalr Scalr$Method Scalr$Mode]
           [java.io File]
           [javax.imageio ImageIO]
           [java.awt.image BufferedImage Color])

  (:require [clojure.math.numeric-tower :as math]
            [clojure.java.io :as io]))


(defn k-color [buffered-image k]
  "
  Return k-clusters of RGB values as Vectors
  @param buffered-image BufferedImage an image
  @param k integer number of dominant colors to return
  @return k-length vector of RGB hash-maps
  "
  [{:r 0 :g 0 :b 0}])
