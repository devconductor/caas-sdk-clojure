(ns pier-sdk-clojure.api.-global-tag-ajuste-financeiro-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ajustar-conta-using-post-with-http-info
  "{{{ajuste_financeiro_resource_ajustar_conta}}}
  {{{ajuste_financeiro_resource_ajustar_conta_notes}}}"
  ([id-tipo-ajuste data-ajuste valor-ajuste id-conta ] (ajustar-conta-using-post-with-http-info id-tipo-ajuste data-ajuste valor-ajuste id-conta nil))
  ([id-tipo-ajuste data-ajuste valor-ajuste id-conta {:keys [identificador-externo id-transacao-original ]}]
   (call-api "/api/ajustes-financeiros" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idTipoAjuste" id-tipo-ajuste "dataAjuste" data-ajuste "valorAjuste" valor-ajuste "identificadorExterno" identificador-externo "idConta" id-conta "idTransacaoOriginal" id-transacao-original }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn ajustar-conta-using-post
  "{{{ajuste_financeiro_resource_ajustar_conta}}}
  {{{ajuste_financeiro_resource_ajustar_conta_notes}}}"
  ([id-tipo-ajuste data-ajuste valor-ajuste id-conta ] (ajustar-conta-using-post id-tipo-ajuste data-ajuste valor-ajuste id-conta nil))
  ([id-tipo-ajuste data-ajuste valor-ajuste id-conta optional-params]
   (:data (ajustar-conta-using-post-with-http-info id-tipo-ajuste data-ajuste valor-ajuste id-conta optional-params))))

(defn consultar-using-get3-with-http-info
  "{{{ajuste_financeiro_resource_consultar}}}
  {{{ajuste_financeiro_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/ajustes-financeiros/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get3
  "{{{ajuste_financeiro_resource_consultar}}}
  {{{ajuste_financeiro_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get3-with-http-info id)))

(defn listar-using-get2-with-http-info
  "{{{ajuste_financeiro_resource_listar}}}
  {{{ajuste_financeiro_resource_listar_notes}}}"
  ([] (listar-using-get2-with-http-info nil))
  ([{:keys [sort page limit id-tipo-ajuste data-ajuste valor-ajuste identificador-externo id-conta ]}]
   (call-api "/api/ajustes-financeiros" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoAjuste" id-tipo-ajuste "dataAjuste" data-ajuste "valorAjuste" valor-ajuste "identificadorExterno" identificador-externo "idConta" id-conta }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get2
  "{{{ajuste_financeiro_resource_listar}}}
  {{{ajuste_financeiro_resource_listar_notes}}}"
  ([] (listar-using-get2 nil))
  ([optional-params]
   (:data (listar-using-get2-with-http-info optional-params))))
