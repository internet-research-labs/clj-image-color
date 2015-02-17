(ns image-color.resize
  (:import [org.imgscalr Scalr]
           [org.imgscalr Scalr$Method Scalr$Mode]
           [java.io File]
           [javax.imageio ImageIO]
           [java.awt.image BufferedImage])
  (:require [clojure.math.numeric-tower :as math]
            [clojure.java.io :as io]))


;; b u f f e r e d i m a g e
;; b u f f e r e d i m a g e
;; b u f f e r e d i m a g e
(defn buffered-image [image]
  (if (instance? BufferedImage image)
    image
    (ImageIO/read image)))

;; r e s i z e i m a g e w i d t h
;; r e s i z e i m a g e w i d t h
;; r e s i z e i m a g e w i d t h
(defn resize-image-width [image width]
  (Scalr/resize (buffered-image image) Scalr$Mode/FIT_TO_WIDTH width nil))

;; r e s i z e i m a g e h e i g h t
;; r e s i z e i m a g e h e i g h t
;; r e s i z e i m a g e h e i g h t
(defn resize-image-height [image height]
  (Scalr/resize (buffered-image image) Scalr$Mode/FIT_TO_HEIGHT height nil))

;; r e s i z e i m a g e
;; r e s i z e i m a g e
;; r e s i z e i m a g e
(defn resize-image [image width height]
  "
  Resize a Buffered Image
  @param buffered-image BufferedImage a buffered image to shrink
  @return BufferedImage a new buffered with dimensions width height
  "
  (Scalr/resize (buffered-image image) Scalr$Mode/FIT_EXACT width height nil))

;; g e t i m a g e s i z e
;; g e t i m a g e s i z e
;; g e t i m a g e s i z e
(defn get-image-size [buffered-image]
  "
  Return the Size of an Image
  @param buffered-image BufferedImage a buffered image to find out the size of
  @return Map a map with two fields ":height" and ":width"
  "
  (if (nil? buffered-image)
    ;; BufferedImage is crappy, return crappy values
    {:width nil :height nil}
    ;; BufferedImage seems okay, return actual values
    {:width (.getWidth buffered-image) :height (.getHeight buffered-image)}))
