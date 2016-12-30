(ns pier-sdk-clojure.api.webhooks
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put2-with-http-info
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

(defn alterar-using-put2
  "Alterar Webhook
  Este mÃ©todo permite que seja modificado um webhooks jÃ¡ cadastrado"
  [id evento metodo url ]
  (:data (alterar-using-put2-with-http-info id evento metodo url)))

(defn consultar-using-get9-with-http-info
  "Consultar Webhook
  Este mÃ©todo permite que sejam consultado um webhook do emissor atravÃ©s de um id especifico"
  [id-webhook ]
  (call-api "/api/webhooks/{id_webhook}" :get
            {:path-params   {"id_webhook" id-webhook }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get9
  "Consultar Webhook
  Este mÃ©todo permite que sejam consultado um webhook do emissor atravÃ©s de um id especifico"
  [id-webhook ]
  (:data (consultar-using-get9-with-http-info id-webhook)))

(defn listar-using-get10-with-http-info
  "Lista os Webhooks
  Este mÃ©todo permite que sejam listados os webhooks existentes"
  ([] (listar-using-get10-with-http-info nil))
  ([{:keys [id evento metodo url page limit ]}]
   (call-api "/api/webhooks" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "evento" evento "metodo" metodo "url" url "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get10
  "Lista os Webhooks
  Este mÃ©todo permite que sejam listados os webhooks existentes"
  ([] (listar-using-get10 nil))
  ([optional-params]
   (:data (listar-using-get10-with-http-info optional-params))))

(defn salvar-using-post3-with-http-info
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

(defn salvar-using-post3
  "Salvar Webhook
  Este mÃ©todo permite que seja adicionado um novo webhook"
  [evento metodo url ]
  (:data (salvar-using-post3-with-http-info evento metodo url)))
