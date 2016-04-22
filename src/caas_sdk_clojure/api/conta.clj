(ns caas-sdk-clojure.api.conta
  (:require [caas-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-conta-using-get1-with-http-info
  "/contas/{idConta}
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-emissor id-conta ]
  (call-api "/api/v1/contas/{idConta}" :get
            {:path-params   {"idConta" id-conta }
             :header-params {"idEmissor" id-emissor }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-conta-using-get1
  "/contas/{idConta}
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-emissor id-conta ]
  (:data (consultar-conta-using-get1-with-http-info id-emissor id-conta)))
