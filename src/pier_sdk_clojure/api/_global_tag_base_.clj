(ns pier-sdk-clojure.api.-global-tag-base-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn limpar-using-post-with-http-info
  "{{{base_resource_limpar}}}
  {{{base_resource_limpar_notes}}}"
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
  "{{{base_resource_limpar}}}
  {{{base_resource_limpar_notes}}}"
  []
  (:data (limpar-using-post-with-http-info)))
