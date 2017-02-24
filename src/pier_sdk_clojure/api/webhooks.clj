(ns pier-sdk-clojure.api.webhooks
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put7-with-http-info
  "Alterar Webhook
  Este mÃ©todo permite que seja modificado um webhooks jÃ¡ cadastrado"
  [id tipo-evento url ]
  (call-api "/api/webhooks/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"tipoEvento" tipo-evento "url" url }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-using-put7
  "Alterar Webhook
  Este mÃ©todo permite que seja modificado um webhooks jÃ¡ cadastrado"
  [id tipo-evento url ]
  (:data (alterar-using-put7-with-http-info id tipo-evento url)))

(defn consultar-using-get17-with-http-info
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

(defn consultar-using-get17
  "Consultar Webhook
  Este mÃ©todo permite que sejam consultado um webhook do emissor atravÃ©s de um id especifico"
  [id ]
  (:data (consultar-using-get17-with-http-info id)))

(defn listar-using-get17-with-http-info
  "Lista os Webhooks
  Este mÃ©todo permite que sejam listados os webhooks existentes"
  ([] (listar-using-get17-with-http-info nil))
  ([{:keys [page limit id tipo-evento metodo url ]}]
   (call-api "/api/webhooks" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "tipoEvento" tipo-evento "metodo" metodo "url" url }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get17
  "Lista os Webhooks
  Este mÃ©todo permite que sejam listados os webhooks existentes"
  ([] (listar-using-get17 nil))
  ([optional-params]
   (:data (listar-using-get17-with-http-info optional-params))))

(defn salvar-using-post7-with-http-info
  "Salvar Webhook
  Este mÃ©todo permite que seja adicionado um novo webhook"
  [tipo-evento url ]
  (call-api "/api/webhooks" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"tipoEvento" tipo-evento "url" url }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn salvar-using-post7
  "Salvar Webhook
  Este mÃ©todo permite que seja adicionado um novo webhook"
  [tipo-evento url ]
  (:data (salvar-using-post7-with-http-info tipo-evento url)))
