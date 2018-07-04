(ns pier-sdk-clojure.api.-global-tag-webhook-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put24-with-http-info
  "{{{web_hook_resource_alterar}}}
  {{{web_hook_resource_alterar_notes}}}"
  ([id webhook ] (alterar-using-put24-with-http-info id webhook nil))
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

(defn alterar-using-put24
  "{{{web_hook_resource_alterar}}}
  {{{web_hook_resource_alterar_notes}}}"
  ([id webhook ] (alterar-using-put24 id webhook nil))
  ([id webhook optional-params]
   (:data (alterar-using-put24-with-http-info id webhook optional-params))))

(defn consultar-using-get52-with-http-info
  "{{{web_hook_resource_consultar}}}
  {{{web_hook_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/webhooks/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get52
  "{{{web_hook_resource_consultar}}}
  {{{web_hook_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get52-with-http-info id)))

(defn listar-using-get66-with-http-info
  "{{{web_hook_resource_listar}}}
  {{{web_hook_resource_listar_notes}}}"
  ([] (listar-using-get66-with-http-info nil))
  ([{:keys [sort page limit id tipo-evento metodo url ]}]
   (call-api "/api/webhooks" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "tipoEvento" tipo-evento "metodo" metodo "url" url }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get66
  "{{{web_hook_resource_listar}}}
  {{{web_hook_resource_listar_notes}}}"
  ([] (listar-using-get66 nil))
  ([optional-params]
   (:data (listar-using-get66-with-http-info optional-params))))

(defn salvar-using-post35-with-http-info
  "{{{web_hook_resource_salvar}}}
  {{{web_hook_resource_salvar_notes}}}"
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

(defn salvar-using-post35
  "{{{web_hook_resource_salvar}}}
  {{{web_hook_resource_salvar_notes}}}"
  [webhook ]
  (:data (salvar-using-post35-with-http-info webhook)))
