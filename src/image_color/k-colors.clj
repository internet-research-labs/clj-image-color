(ns image-color.k-colors
  (:import [org.imgscalr Scalr]
           [org.imgscalr Scalr$Method Scalr$Mode]
           [java.io File]
           [javax.imageio ImageIO]
           [java.awt.image BufferedImage Color])

  (:require [clojure.math.numeric-tower :as math]
            [clojure.java.io :as io]))


;; k - c o l o r
;; k - c o l o r
;; k - c o l o r

(defn k-color [buffered-image k]
  "
  Return k-clusters of RGB values as Vectors
  @param buffered-image BufferedImage an image
  @param k integer number of dominant colors to return
  @return k-length vector of RGB hash-maps
  "
  [{:r 0 :g 0 :b 0}])

;; p i x e l - c o l o r
;; p i x e l - c o l o r
;; p i x e l - c o l o r

(defn pixel-color [buffered-image x y]
  "
  Return the RGB-value of a pixel at xy-coordinate
  @param buffered-image BufferedImage
  @param x integer
  @param y integer 
  "
  {:r 0 :g 0 :b 0})

;; r a n d o m - p o i n t
;; r a n d o m - p o i n t
;; r a n d o m - p o i n t

(defn random-point [buffered-image]
  [(rand-int 0 (.getWidth buffered-image))
   (rand-int 0 (.getHeight buffered-image))])

;; r a n d o m - s a m p l e - p i x e l s
;; r a n d o m - s a m p l e - p i x e l s
;; r a n d o m - s a m p l e - p i x e l s

(defn random-sample-pixels [buffered-image n]
  "
  Randomly Sample n-points for Their Color Value
  @param buffered-image
  @param n integer number of points to sample
  "
  (map (fn [x] (random-point buffered-image)) (range n)))

;; r a n d o m - s a m p l e - c o l o r s 
;; r a n d o m - s a m p l e - c o l o r s 
;; r a n d o m - s a m p l e - c o l o r s 

(defn random-sample-colors [buffered-image n]
  (map (fn [x] [1 2]) (random-sample-pixels buffered-image n)))
