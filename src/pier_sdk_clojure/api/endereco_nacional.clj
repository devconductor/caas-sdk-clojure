(ns pier-sdk-clojure.api.endereco-nacional
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-endereco-using-get-with-http-info
  "Consultar EndereÃ§o
  Este recurso permite consultar endereÃ§os atravÃ©s do CEP."
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
  "Consultar EndereÃ§o
  Este recurso permite consultar endereÃ§os atravÃ©s do CEP."
  [cep ]
  (:data (consultar-endereco-using-get-with-http-info cep)))