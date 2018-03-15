(ns pier-sdk-clojure.api.endereco-nacional
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-endereco-using-get-with-http-info
  "Consultar Endereço
  Este recurso permite consultar endereços através do CEP."
  [cep ]
  (call-api "/api/ceps" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"CEP" cep }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-endereco-using-get
  "Consultar Endereço
  Este recurso permite consultar endereços através do CEP."
  [cep ]
  (:data (consultar-endereco-using-get-with-http-info cep)))
