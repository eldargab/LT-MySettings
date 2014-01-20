(ns my
  (:require [lt.objs.app :as app])
  (:require-macros [lt.macros :refer [behavior]]))

(behavior ::focus-on-init
           :triggers #{:show}
           :reaction (fn [] (.focus app/win)))