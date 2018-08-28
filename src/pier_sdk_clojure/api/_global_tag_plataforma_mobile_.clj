(ns pier-sdk-clojure.api.-global-tag-plataforma-mobile-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-using-put1-with-http-info
  "{{{plataforma_mobile_resource_atualizar}}}
  {{{plataforma_mobile_resource_atualizar_notes}}}"
  [id update ]
  (call-api "/api/plataformas-mobile/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put1
  "{{{plataforma_mobile_resource_atualizar}}}
  {{{plataforma_mobile_resource_atualizar_notes}}}"
  [id update ]
  (:data (atualizar-using-put1-with-http-info id update)))

(defn listar-using-get42-with-http-info
  "{{{plataforma_mobile_resource_listar}}}
  {{{plataforma_mobile_resource_listar_notes}}}"
  ([] (listar-using-get42-with-http-info nil))
  ([{:keys [sort page limit nome ]}]
   (call-api "/api/plataformas-mobile" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get42
  "{{{plataforma_mobile_resource_listar}}}
  {{{plataforma_mobile_resource_listar_notes}}}"
  ([] (listar-using-get42 nil))
  ([optional-params]
   (:data (listar-using-get42-with-http-info optional-params))))

(defn salvar-using-post27-with-http-info
  "{{{plataforma_mobile_resource_salvar}}}
  {{{plataforma_mobile_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/plataformas-mobile" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post27
  "{{{plataforma_mobile_resource_salvar}}}
  {{{plataforma_mobile_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post27-with-http-info persist)))
