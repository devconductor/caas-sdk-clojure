(ns pier-sdk-clojure.api.-global-tag-tipo-resolucao-contestacao-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-status-contestacao-using-get-with-http-info
  "{{{status_contestacao_resource_listar_status_contestacao}}}
  {{{status_contestacao_resource_listar_status_contestacao_notes}}}"
  ([] (listar-status-contestacao-using-get-with-http-info nil))
  ([{:keys [sort page limit id-status-contestacao id-status-contestacao-origem descricao flag-permite-alteracao flag-sistema ]}]
   (call-api "/api/status-contestacoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idStatusContestacao" id-status-contestacao "idStatusContestacaoOrigem" id-status-contestacao-origem "descricao" descricao "flagPermiteAlteracao" flag-permite-alteracao "flagSistema" flag-sistema }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-status-contestacao-using-get
  "{{{status_contestacao_resource_listar_status_contestacao}}}
  {{{status_contestacao_resource_listar_status_contestacao_notes}}}"
  ([] (listar-status-contestacao-using-get nil))
  ([optional-params]
   (:data (listar-status-contestacao-using-get-with-http-info optional-params))))

(defn listar-tipo-resolucao-contestacao-using-get-with-http-info
  "{{{tipo_resolucao_contestacao_resource_listar_tipo_contestacao}}}
  {{{tipo_resolucao_contestacao_resource_listar_tipo_resolucao_contestacao_notes}}}"
  ([] (listar-tipo-resolucao-contestacao-using-get-with-http-info nil))
  ([{:keys [sort page limit id-tipo-resolucao-contestacao descricao ]}]
   (call-api "/api/tipos-resolucoes-contestacoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoResolucaoContestacao" id-tipo-resolucao-contestacao "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipo-resolucao-contestacao-using-get
  "{{{tipo_resolucao_contestacao_resource_listar_tipo_contestacao}}}
  {{{tipo_resolucao_contestacao_resource_listar_tipo_resolucao_contestacao_notes}}}"
  ([] (listar-tipo-resolucao-contestacao-using-get nil))
  ([optional-params]
   (:data (listar-tipo-resolucao-contestacao-using-get-with-http-info optional-params))))
