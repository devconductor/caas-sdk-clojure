(ns pier-sdk-clojure.api.base
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn limpar-using-post-with-http-info
  "Limpar mapa de bases"
  []
  (call-api "/api/bases/limpar" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn limpar-using-post
  "Limpar mapa de bases"
  []
  (:data (limpar-using-post-with-http-info)))
