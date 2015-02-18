(ns image-color.core
  (:import org.imgscalr.Scalr)
  (:require [clojure.math.numeric-tower :as math]
            [clojure.java.io :as io]))


; process-file-name
(defn process-file-name [file-name]
  "
  Open a Reader and process
  @param file-name a string representing a file
  "
  (clojure.java.io/reader "file-name"))

; process-reader
(defn get-reader-from-resource [resource-name]
  "
  Open a Reader from an Input Stream
  @param in-stream an input stream
  "
  (io/reader (io/resource resource-name)))

; E u c l i d e a n D i s t a n c e
; E u c l i d e a n D i s t a n c e
; E u c l i d e a n D i s t a n c e
(defn distance-l2 [p q]
  "
  Return the L2 distance between two vectors
  @param p vector
  @param q vector
  @return double > 0
  "
  (->> (mapv - p q)
       (map (fn [x] (* x x)))
       (reduce +)
       (math/sqrt)))

; K - m e a n s
; K - m e a n s
; K - m e a n s
(defn k-means [image num-clusters]
  "
  Run K-Means clustering
  @param image
  @param num-clusters
  @return vector of clusters
  "
  nil)


; M a i n
; M a i n
; M a i n
(defn -main []
  (println (get-reader-from-resource "flex-.jpg"))
  (println (javax.imageio.ImageIO/read (io/resource "flex-.jpg"))))
