(ns image-color.resize-test
  (:require [clojure.test :refer :all]
            [clojure.java.io :as io]
            [image-color.resize :refer :all]))

;; t e s t e m p t y i m a g e
;; t e s t e m p t y i m a g e
;; t e s t e m p t y i m a g e

(deftest trivial-image-size
  (testing "image size of empty image"
    (let [image-size (get-image-size nil)]
      (is (= (:height image-size) nil))
      (is (= (:width image-size) nil)))))

;; t e s t s a m p l e i m a g e
;; t e s t s a m p l e i m a g e
;; t e s t s a m p l e i m a g e

(deftest flex-image-size
  (testing "image size of a resource"
    (let [buffered-image (javax.imageio.ImageIO/read (io/resource "flex-.jpg"))]
      (let [image-size (get-image-size buffered-image)]
        (is (= (:height image-size) 480))
        (is (= (:width image-size) 372))))))

;; t e s t r e s i z e
;; t e s t r e s i z e
;; t e s t r e s i z e

(deftest flex-image-scale
  (testing "resize image resource and check size"
    (let [buffered-image (javax.imageio.ImageIO/read (io/resource "flex-.jpg"))]
      (let [scaled-image (resize-image buffered-image 100 100)]
        (let [image-size (get-image-size scaled-image)]
          (is (= (:height image-size) 100))
          (is (= (:width image-size) 100)))))))
