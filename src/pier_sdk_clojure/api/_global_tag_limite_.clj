(ns pier-sdk-clojure.api.-global-tag-limite-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-historico-alteracoes-limites-using-get-with-http-info
  "{{{conta_resource_listar_historico_alteracoes_limites}}}
  {{{conta_resource_listar_historico_alteracoes_limites_notes}}}"
  ([id ] (listar-historico-alteracoes-limites-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/historicos-alteracoes-limites" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-historico-alteracoes-limites-using-get
  "{{{conta_resource_listar_historico_alteracoes_limites}}}
  {{{conta_resource_listar_historico_alteracoes_limites_notes}}}"
  ([id ] (listar-historico-alteracoes-limites-using-get id nil))
  ([id optional-params]
   (:data (listar-historico-alteracoes-limites-using-get-with-http-info id optional-params))))
