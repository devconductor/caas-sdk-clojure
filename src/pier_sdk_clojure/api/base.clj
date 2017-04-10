(ns pier-sdk-clojure.api.base
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn clear-using-post-with-http-info
  "Limpar mapa de bases"
  []
  (call-api "/api/bases/limpar" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn clear-using-post
  "Limpar mapa de bases"
  []
  (:data (clear-using-post-with-http-info)))
