(ns my-test
  (:require [clojure.test :refer :all])
  (:require [clojure.term.colors :as colors])

  )

(def x1
  [(colors/red "bar")]
  )

(def x2
  ["bar"]
  )


(deftest compare-x1
  (is (= "X"
         x1
         ) "should fail as it is not X"))

(deftest compare-x2
  (is (= "X"
         x2
         ) "should fail as it is not X"))


