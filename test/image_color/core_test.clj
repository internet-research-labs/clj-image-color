(ns image-color.core-test
  (:require [clojure.test :refer :all]
            [image-color.core :refer :all]))

(deftest l2-test-1
  (testing "FIXME, I fail."
    (is (=
         (distance-l2 '(0 0 0 0) '(0 0 0 0))
         0))))

(deftest l2-test-2
  (testing "FIXME, I fail."
    (is (=
         (distance-l2 '(3 0 0 0) '(0 4 0 0))
         5))))

(deftest l2-test-3
  (testing "FIXME, I fail."
    (is (=
         (distance-l2 '(1 0 0 0) '(0 0 0 0))
         1))))

(deftest l2-test-4
  (testing "FIXME, I fail."
    (is (=
         (distance-l2 '(0 0 0 0) '(0 0 0 0))
         0))))
