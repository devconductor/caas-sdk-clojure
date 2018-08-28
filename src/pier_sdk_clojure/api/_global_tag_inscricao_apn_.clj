(ns pier-sdk-clojure.api.-global-tag-inscricao-apn-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn desativar-using-put-with-http-info
  "{{{inscricao_apn_recurso_desativar}}}
  {{{inscricao_apn_recurso_desativar_notas}}}"
  [id ]
  (call-api "/api/inscricoes-apn/{id}/desativar" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-using-put
  "{{{inscricao_apn_recurso_desativar}}}
  {{{inscricao_apn_recurso_desativar_notas}}}"
  [id ]
  (:data (desativar-using-put-with-http-info id)))

(defn listar-using-get31-with-http-info
  "{{{inscricao_apn_recurso_listar}}}
  {{{inscricao_apn_recurso_listar_notas}}}"
  ([] (listar-using-get31-with-http-info nil))
  ([{:keys [sort id-cartoes page limit device-token data-criacao data-desativacao ativo id-aplicacao-mobile ]}]
   (call-api "/api/inscricoes-apn" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "idCartoes" (with-collection-format id-cartoes :multi) "page" page "limit" limit "deviceToken" device-token "dataCriacao" data-criacao "dataDesativacao" data-desativacao "ativo" ativo "idAplicacaoMobile" id-aplicacao-mobile }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get31
  "{{{inscricao_apn_recurso_listar}}}
  {{{inscricao_apn_recurso_listar_notas}}}"
  ([] (listar-using-get31 nil))
  ([optional-params]
   (:data (listar-using-get31-with-http-info optional-params))))

(defn salvar-using-post15-with-http-info
  "{{{inscricao_apn_recurso_salvar}}}
  {{{inscricao_apn_recurso_salvar_notas}}}"
  [inscricao-persist ]
  (call-api "/api/inscricoes-apn" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    inscricao-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post15
  "{{{inscricao_apn_recurso_salvar}}}
  {{{inscricao_apn_recurso_salvar_notas}}}"
  [inscricao-persist ]
  (:data (salvar-using-post15-with-http-info inscricao-persist)))
