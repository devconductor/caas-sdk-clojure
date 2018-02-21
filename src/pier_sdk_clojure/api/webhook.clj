(ns pier-sdk-clojure.api.webhook
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put22-with-http-info
  "Alterar Webhook
  Este mÃ©todo permite que seja modificado um webhooks jÃ¡ cadastrado"
  ([id webhook ] (alterar-using-put22-with-http-info id webhook nil))
  ([id webhook {:keys [status ]}]
   (call-api "/api/webhooks/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"status" status }
              :form-params   {}
              :body-param    webhook
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put22
  "Alterar Webhook
  Este mÃ©todo permite que seja modificado um webhooks jÃ¡ cadastrado"
  ([id webhook ] (alterar-using-put22 id webhook nil))
  ([id webhook optional-params]
   (:data (alterar-using-put22-with-http-info id webhook optional-params))))

(defn consultar-using-get44-with-http-info
  "Consultar Webhook
  Este mÃ©todo permite que sejam consultado um webhook do emissor atravÃ©s de um id especifico"
  [id ]
  (call-api "/api/webhooks/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get44
  "Consultar Webhook
  Este mÃ©todo permite que sejam consultado um webhook do emissor atravÃ©s de um id especifico"
  [id ]
  (:data (consultar-using-get44-with-http-info id)))

(defn listar-using-get53-with-http-info
  "Lista os Webhooks
  Este mÃ©todo permite que sejam listados os webhooks existentes"
  ([] (listar-using-get53-with-http-info nil))
  ([{:keys [sort page limit id tipo-evento metodo url ]}]
   (call-api "/api/webhooks" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "tipoEvento" tipo-evento "metodo" metodo "url" url }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get53
  "Lista os Webhooks
  Este mÃ©todo permite que sejam listados os webhooks existentes"
  ([] (listar-using-get53 nil))
  ([optional-params]
   (:data (listar-using-get53-with-http-info optional-params))))

(defn salvar-using-post30-with-http-info
  "Salvar Webhook
  Este mÃ©todo permite que seja adicionado um novo webhook"
  [webhook ]
  (call-api "/api/webhooks" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    webhook
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post30
  "Salvar Webhook
  Este mÃ©todo permite que seja adicionado um novo webhook"
  [webhook ]
  (:data (salvar-using-post30-with-http-info webhook)))
