(ns proyecto.core
  (:require [proyecto.data :as data]
            [clojure.pprint :refer [pprint]])
  (:gen-class))

(defonce all-data (-> (data/load-data)
                      (data/train-validation-split 0.75)))
(print all-data)
