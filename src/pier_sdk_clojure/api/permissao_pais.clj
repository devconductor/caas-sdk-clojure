(ns pier-sdk-clojure.api.permissao-pais
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-continentes-using-get-with-http-info
  "Lista os continentes
  Este recurso permite listar os continentes utilizados no recurso de permissÃ£o de uso do cartÃ£o no exterior"
  []
  (call-api "/api/continentes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-continentes-using-get
  "Lista os continentes
  Este recurso permite listar os continentes utilizados no recurso de permissÃ£o de uso do cartÃ£o no exterior"
  []
  (:data (listar-continentes-using-get-with-http-info)))
