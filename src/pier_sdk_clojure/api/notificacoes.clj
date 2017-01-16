(ns pier-sdk-clojure.api.notificacoes
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-sms-using-put-with-http-info
  "Atualizar SMS
  Esse recurso permite atualizar o status do SMS do emissor"
  [seu-num status data texto-status operadora ]
  (call-api "/api/notificacoes/sms/atualizar-status" :put
            {:path-params   {}
             :header-params {}
             :query-params  {"SeuNum" seu-num "Status" status "Data" data "TextoStatus" texto-status "Operadora" operadora }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn atualizar-sms-using-put
  "Atualizar SMS
  Esse recurso permite atualizar o status do SMS do emissor"
  [seu-num status data texto-status operadora ]
  (:data (atualizar-sms-using-put-with-http-info seu-num status data texto-status operadora)))

(defn responder-sms-using-put-with-http-info
  "Responder SMS
  Esse recurso permite atualizar a resposta do SMS, fornecida pedo usuÃ¡rio"
  [seunum data texto-sms-mo ]
  (call-api "/api/notificacoes/sms/responder" :put
            {:path-params   {}
             :header-params {}
             :query-params  {"Seunum" seunum "Data" data "TextoSmsMo" texto-sms-mo }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn responder-sms-using-put
  "Responder SMS
  Esse recurso permite atualizar a resposta do SMS, fornecida pedo usuÃ¡rio"
  [seunum data texto-sms-mo ]
  (:data (responder-sms-using-put-with-http-info seunum data texto-sms-mo)))
