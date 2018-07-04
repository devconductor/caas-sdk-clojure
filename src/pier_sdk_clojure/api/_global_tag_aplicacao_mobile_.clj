(ns pier-sdk-clojure.api.-global-tag-aplicacao-mobile-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-using-put-with-http-info
  "{{{aplicacao_mobile_resource_atualizar}}}
  {{{aplicacao_mobile_resource_atualizar_notes}}}"
  [id update ]
  (call-api "/api/aplicacoes-mobile/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put
  "{{{aplicacao_mobile_resource_atualizar}}}
  {{{aplicacao_mobile_resource_atualizar_notes}}}"
  [id update ]
  (:data (atualizar-using-put-with-http-info id update)))

(defn listar-using-get3-with-http-info
  "{{{aplicacao_mobile_resource_listar}}}
  {{{aplicacao_mobile_resource_listar_notes}}}"
  ([] (listar-using-get3-with-http-info nil))
  ([{:keys [sort page limit id id-plataforma-mobile ]}]
   (call-api "/api/aplicacoes-mobile" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idPlataformaMobile" id-plataforma-mobile }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get3
  "{{{aplicacao_mobile_resource_listar}}}
  {{{aplicacao_mobile_resource_listar_notes}}}"
  ([] (listar-using-get3 nil))
  ([optional-params]
   (:data (listar-using-get3-with-http-info optional-params))))

(defn salvar-using-post-with-http-info
  "{{{aplicacao_mobile_resource_salvar}}}
  {{{aplicacao_mobile_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/aplicacoes-mobile" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post
  "{{{aplicacao_mobile_resource_salvar}}}
  {{{aplicacao_mobile_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post-with-http-info persist)))
