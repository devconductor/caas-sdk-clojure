(ns pier-sdk-clojure.api.-global-tag-proposta-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-post-with-http-info
  "{{{proposta_resource_alterar_status}}}
  {{{proposta_resource_alterar_status_notes}}}"
  [id update ]
  (call-api "/api/propostas/{id}/alterar-status" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-post
  "{{{proposta_resource_alterar_status}}}
  {{{proposta_resource_alterar_status_notes}}}"
  [id update ]
  (:data (alterar-using-post-with-http-info id update)))

(defn consultar-using-get33-with-http-info
  "{{{proposta_resource_consultar}}}
  {{{proposta_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/propostas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get33
  "{{{proposta_resource_consultar}}}
  {{{proposta_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get33-with-http-info id)))

(defn listar-status-proposta-using-get-with-http-info
  "{{{proposta_resource_listar_status}}}
  {{{proposta_resource_listar_status_notes}}}"
  ([] (listar-status-proposta-using-get-with-http-info nil))
  ([{:keys [sort page limit status flag-permite-alteracao ]}]
   (call-api "/api/status-propostas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "status" status "flagPermiteAlteracao" flag-permite-alteracao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-status-proposta-using-get
  "{{{proposta_resource_listar_status}}}
  {{{proposta_resource_listar_status_notes}}}"
  ([] (listar-status-proposta-using-get nil))
  ([optional-params]
   (:data (listar-status-proposta-using-get-with-http-info optional-params))))

(defn listar-using-get44-with-http-info
  "{{{proposta_resource_listar}}}
  {{{proposta_resource_listar_notes}}}"
  ([] (listar-using-get44-with-http-info nil))
  ([{:keys [sort page limit status ]}]
   (call-api "/api/propostas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get44
  "{{{proposta_resource_listar}}}
  {{{proposta_resource_listar_notes}}}"
  ([] (listar-using-get44 nil))
  ([optional-params]
   (:data (listar-using-get44-with-http-info optional-params))))
