(ns pier-sdk-clojure.api.boleto
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn registrar-boleto-using-post-with-http-info
  "Registra uma cobranca na entidade banco relacionada a cobranca informado.
  Este recurso registra uma cobranca emitido."
  [id ]
  (call-api "/api/boletos/{id}/registrar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn registrar-boleto-using-post
  "Registra uma cobranca na entidade banco relacionada a cobranca informado.
  Este recurso registra uma cobranca emitido."
  [id ]
  (:data (registrar-boleto-using-post-with-http-info id)))
