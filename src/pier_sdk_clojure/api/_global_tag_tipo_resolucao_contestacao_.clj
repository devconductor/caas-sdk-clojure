(ns pier-sdk-clojure.api.-global-tag-tipo-resolucao-contestacao-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

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
