(ns pier-sdk-clojure.api.base
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn clear-using-get-with-http-info
  "/bases/clear"
  []
  (call-api "/api/bases/clear" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn clear-using-get
  "/bases/clear"
  []
  (:data (clear-using-get-with-http-info)))
