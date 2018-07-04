(ns pier-sdk-clojure.api.-global-tag-endereco-nacional-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-endereco-using-get-with-http-info
  "{{{c_e_p_endereco_resource_consultar_endereco}}}
  {{{c_e_p_endereco_resource_consultar_endereco_notes}}}"
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
  "{{{c_e_p_endereco_resource_consultar_endereco}}}
  {{{c_e_p_endereco_resource_consultar_endereco_notes}}}"
  [cep ]
  (:data (consultar-endereco-using-get-with-http-info cep)))
