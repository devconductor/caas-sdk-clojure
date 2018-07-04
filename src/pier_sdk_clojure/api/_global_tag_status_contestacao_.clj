(ns pier-sdk-clojure.api.-global-tag-status-contestacao-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-status-contestacao-using-get-with-http-info
  "{{{status_contestacao_resource_listar_status_contestacao}}}
  {{{status_contestacao_resource_listar_status_contestacao_notes}}}"
  ([] (listar-status-contestacao-using-get-with-http-info nil))
  ([{:keys [sort page limit id-status-contestacao id-status-contestacao-origem descricao flag-permite-alteracao flag-sistema flag-ativo ]}]
   (call-api "/api/status-contestacoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idStatusContestacao" id-status-contestacao "idStatusContestacaoOrigem" id-status-contestacao-origem "descricao" descricao "flagPermiteAlteracao" flag-permite-alteracao "flagSistema" flag-sistema "flagAtivo" flag-ativo }
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
