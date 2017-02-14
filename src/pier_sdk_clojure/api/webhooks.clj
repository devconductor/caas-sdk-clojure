(ns pier-sdk-clojure.api.webhooks
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put3-with-http-info
  "Alterar Webhook
  Este mÃ©todo permite que seja modificado um webhooks jÃ¡ cadastrado"
  [id evento metodo url ]
  (call-api "/api/webhooks" :put
            {:path-params   {}
             :header-params {}
             :query-params  {"id" id "evento" evento "metodo" metodo "url" url }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-using-put3
  "Alterar Webhook
  Este mÃ©todo permite que seja modificado um webhooks jÃ¡ cadastrado"
  [id evento metodo url ]
  (:data (alterar-using-put3-with-http-info id evento metodo url)))

(defn consultar-using-get10-with-http-info
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
             :auth-names    ["access_token"]}))

(defn consultar-using-get10
  "Consultar Webhook
  Este mÃ©todo permite que sejam consultado um webhook do emissor atravÃ©s de um id especifico"
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn listar-using-get11-with-http-info
  "Lista os Webhooks
  Este mÃ©todo permite que sejam listados os webhooks existentes"
  ([] (listar-using-get11-with-http-info nil))
  ([{:keys [page limit id evento metodo url ]}]
   (call-api "/api/webhooks" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "evento" evento "metodo" metodo "url" url }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get11
  "Lista os Webhooks
  Este mÃ©todo permite que sejam listados os webhooks existentes"
  ([] (listar-using-get11 nil))
  ([optional-params]
   (:data (listar-using-get11-with-http-info optional-params))))

(defn salvar-using-post4-with-http-info
  "Salvar Webhook
  Este mÃ©todo permite que seja adicionado um novo webhook"
  [evento metodo url ]
  (call-api "/api/webhooks" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"evento" evento "metodo" metodo "url" url }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn salvar-using-post4
  "Salvar Webhook
  Este mÃ©todo permite que seja adicionado um novo webhook"
  [evento metodo url ]
  (:data (salvar-using-post4-with-http-info evento metodo url)))
