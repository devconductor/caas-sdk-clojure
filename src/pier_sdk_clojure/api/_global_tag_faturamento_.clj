(ns pier-sdk-clojure.api.-global-tag-faturamento-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-tipo-faturamento-using-put-with-http-info
  "{{{faturamento_resource_alterar_tipo_faturamento}}}
  {{{faturamento_resource_alterar_tipo_faturamento_notes}}}"
  [id tipo-faturamento-persist ]
  (call-api "/api/tipos-faturamento/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    tipo-faturamento-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-tipo-faturamento-using-put
  "{{{faturamento_resource_alterar_tipo_faturamento}}}
  {{{faturamento_resource_alterar_tipo_faturamento_notes}}}"
  [id tipo-faturamento-persist ]
  (:data (alterar-tipo-faturamento-using-put-with-http-info id tipo-faturamento-persist)))

(defn cadastrar-faturamento-por-conta-using-post-with-http-info
  "{{{faturamento_resource_cadastrar_faturamento_por_conta}}}
  {{{faturamento_resource_cadastrar_faturamento_por_conta_notes}}}"
  [tipo-faturamento-por-conta-persist ]
  (call-api "/api/tipos-faturamento-conta" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    tipo-faturamento-por-conta-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-faturamento-por-conta-using-post
  "{{{faturamento_resource_cadastrar_faturamento_por_conta}}}
  {{{faturamento_resource_cadastrar_faturamento_por_conta_notes}}}"
  [tipo-faturamento-por-conta-persist ]
  (:data (cadastrar-faturamento-por-conta-using-post-with-http-info tipo-faturamento-por-conta-persist)))

(defn cadastrar-tipo-faturamento-using-post-with-http-info
  "{{{faturamento_resource_cadastrar_tipo_faturamento}}}
  {{{faturamento_resource_cadastrar_tipo_faturamento_notes}}}"
  [tipo-faturamento-persist ]
  (call-api "/api/tipos-faturamento" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    tipo-faturamento-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-tipo-faturamento-using-post
  "{{{faturamento_resource_cadastrar_tipo_faturamento}}}
  {{{faturamento_resource_cadastrar_tipo_faturamento_notes}}}"
  [tipo-faturamento-persist ]
  (:data (cadastrar-tipo-faturamento-using-post-with-http-info tipo-faturamento-persist)))

(defn consultar-tipo-faturamento-using-get-with-http-info
  "{{{faturamento_resource_consultar_tipo_faturamento}}}
  {{{faturamento_resource_consultar_tipo_faturamento_notes}}}"
  [id ]
  (call-api "/api/tipos-faturamento/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-tipo-faturamento-using-get
  "{{{faturamento_resource_consultar_tipo_faturamento}}}
  {{{faturamento_resource_consultar_tipo_faturamento_notes}}}"
  [id ]
  (:data (consultar-tipo-faturamento-using-get-with-http-info id)))

(defn desativar-faturamento-por-conta-using-post-with-http-info
  "{{{faturamento_resource_desativar_faturamento_por_conta}}}
  {{{faturamento_resource_desativar_faturamento_por_conta_notes}}}"
  [id ]
  (call-api "/api/tipos-faturamento-conta/{id}/desativar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-faturamento-por-conta-using-post
  "{{{faturamento_resource_desativar_faturamento_por_conta}}}
  {{{faturamento_resource_desativar_faturamento_por_conta_notes}}}"
  [id ]
  (:data (desativar-faturamento-por-conta-using-post-with-http-info id)))

(defn desativar-tipo-faturamento-using-post-with-http-info
  "{{{faturamento_resource_desativar_tipo_faturamento}}}
  {{{faturamento_resource_desativar_tipo_faturamento_notes}}}"
  [id ]
  (call-api "/api/tipos-faturamento/{id}/desativar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-tipo-faturamento-using-post
  "{{{faturamento_resource_desativar_tipo_faturamento}}}
  {{{faturamento_resource_desativar_tipo_faturamento_notes}}}"
  [id ]
  (:data (desativar-tipo-faturamento-using-post-with-http-info id)))

(defn listar-faturamento-por-conta-using-get-with-http-info
  "{{{faturamento_resource_listar_faturamento_por_conta}}}
  {{{faturamento_resource_listar_faturamento_por_conta_notes}}}"
  ([] (listar-faturamento-por-conta-using-get-with-http-info nil))
  ([{:keys [sort page limit id-tipo-faturamento-por-conta ativo id-conta id-tipo-faturamento data-hora-inclusao data-hora-cancelamento modificado-por ]}]
   (call-api "/api/tipos-faturamento-conta" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoFaturamentoPorConta" id-tipo-faturamento-por-conta "ativo" ativo "idConta" id-conta "idTipoFaturamento" id-tipo-faturamento "dataHoraInclusao" data-hora-inclusao "dataHoraCancelamento" data-hora-cancelamento "modificadoPor" modificado-por }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-faturamento-por-conta-using-get
  "{{{faturamento_resource_listar_faturamento_por_conta}}}
  {{{faturamento_resource_listar_faturamento_por_conta_notes}}}"
  ([] (listar-faturamento-por-conta-using-get nil))
  ([optional-params]
   (:data (listar-faturamento-por-conta-using-get-with-http-info optional-params))))

(defn listar-tipo-faturamento-using-get-with-http-info
  "{{{faturamento_resource_listar_tipo_faturamento}}}
  {{{faturamento_resource_listar_tipo_faturamento_notes}}}"
  ([] (listar-tipo-faturamento-using-get-with-http-info nil))
  ([{:keys [sort page limit id-tipo-faturamento descricao flag-apenas-demonstrativo id-convenio ]}]
   (call-api "/api/tipos-faturamento" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoFaturamento" id-tipo-faturamento "descricao" descricao "flagApenasDemonstrativo" flag-apenas-demonstrativo "idConvenio" id-convenio }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipo-faturamento-using-get
  "{{{faturamento_resource_listar_tipo_faturamento}}}
  {{{faturamento_resource_listar_tipo_faturamento_notes}}}"
  ([] (listar-tipo-faturamento-using-get nil))
  ([optional-params]
   (:data (listar-tipo-faturamento-using-get-with-http-info optional-params))))
