(ns ^:figwheel-no-load fooz.dev
  (:require
    [fooz.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
