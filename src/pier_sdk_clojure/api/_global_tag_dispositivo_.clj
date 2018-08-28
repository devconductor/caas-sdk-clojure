(ns pier-sdk-clojure.api.-global-tag-dispositivo-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ativar-using-post-with-http-info
  "{{{dispositivo_resource_ativar}}}
  {{{dispositivo_resource_ativar_notes}}}"
  [id ]
  (call-api "/api/dispositivos/{id}/ativar-dispositivo" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-using-post
  "{{{dispositivo_resource_ativar}}}
  {{{dispositivo_resource_ativar_notes}}}"
  [id ]
  (:data (ativar-using-post-with-http-info id)))

(defn desativar-using-post-with-http-info
  "{{{dispositivo_resource_desativar}}}
  {{{dispositivo_resource_desativar_notes}}}"
  [id ]
  (call-api "/api/dispositivos/{id}/desativar-dispositivo" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-using-post
  "{{{dispositivo_resource_desativar}}}
  {{{dispositivo_resource_desativar_notes}}}"
  [id ]
  (:data (desativar-using-post-with-http-info id)))

(defn listar-using-get21-with-http-info
  "{{{dispositivo_resource_listar}}}
  {{{dispositivo_resource_listar_notes}}}"
  ([] (listar-using-get21-with-http-info nil))
  ([{:keys [sort page limit token id-usuario id-aplicacao-mobile data-criacao data-desativacao ]}]
   (call-api "/api/dispositivos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "token" token "idUsuario" id-usuario "idAplicacaoMobile" id-aplicacao-mobile "dataCriacao" data-criacao "dataDesativacao" data-desativacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get21
  "{{{dispositivo_resource_listar}}}
  {{{dispositivo_resource_listar_notes}}}"
  ([] (listar-using-get21 nil))
  ([optional-params]
   (:data (listar-using-get21-with-http-info optional-params))))

(defn salvar-using-post11-with-http-info
  "{{{dispositivo_resource_salvar}}}
  {{{dispositivo_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/dispositivos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post11
  "{{{dispositivo_resource_salvar}}}
  {{{dispositivo_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post11-with-http-info persist)))
