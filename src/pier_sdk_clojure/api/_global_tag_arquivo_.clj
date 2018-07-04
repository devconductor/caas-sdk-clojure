(ns pier-sdk-clojure.api.-global-tag-arquivo-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get4-with-http-info
  "{{{arquivo_resource_consultar}}}
  {{{arquivo_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/arquivos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get4
  "{{{arquivo_resource_consultar}}}
  {{{arquivo_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get4-with-http-info id)))

(defn integrar-using-post-with-http-info
  "{{{arquivo_resource_integrar}}}
  {{{arquivo_resource_integrar_notes}}}"
  [integrar-arquivo-request ]
  (call-api "/api/arquivos/integrar" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    integrar-arquivo-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn integrar-using-post
  "{{{arquivo_resource_integrar}}}
  {{{arquivo_resource_integrar_notes}}}"
  [integrar-arquivo-request ]
  (:data (integrar-using-post-with-http-info integrar-arquivo-request)))

(defn listar-por-numero-receita-federal-using-get-with-http-info
  "{{{arquivo_a_u_d_resource_listar_por_numero_receita_federal}}}
  {{{arquivo_a_u_d_resource_listar_por_numero_receita_federal_notes}}}"
  ([numero-receita-federal ] (listar-por-numero-receita-federal-using-get-with-http-info numero-receita-federal nil))
  ([numero-receita-federal {:keys [page limit ]}]
   (call-api "/api/arquivos-auditorias" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"numeroReceitaFederal" numero-receita-federal "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-por-numero-receita-federal-using-get
  "{{{arquivo_a_u_d_resource_listar_por_numero_receita_federal}}}
  {{{arquivo_a_u_d_resource_listar_por_numero_receita_federal_notes}}}"
  ([numero-receita-federal ] (listar-por-numero-receita-federal-using-get numero-receita-federal nil))
  ([numero-receita-federal optional-params]
   (:data (listar-por-numero-receita-federal-using-get-with-http-info numero-receita-federal optional-params))))

(defn listar-status-arquivos-using-get-with-http-info
  "{{{arquivo_resource_listar_status_arquivos}}}
  {{{arquivo_resource_listar_status_arquivos_notes}}}"
  ([] (listar-status-arquivos-using-get-with-http-info nil))
  ([{:keys [sort page limit nome descricao ]}]
   (call-api "/api/status-arquivos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-status-arquivos-using-get
  "{{{arquivo_resource_listar_status_arquivos}}}
  {{{arquivo_resource_listar_status_arquivos_notes}}}"
  ([] (listar-status-arquivos-using-get nil))
  ([optional-params]
   (:data (listar-status-arquivos-using-get-with-http-info optional-params))))

(defn listar-tipos-arquivos-using-get-with-http-info
  "{{{arquivo_resource_listar_tipos_arquivos}}}
  {{{arquivo_resource_listar_tipos_arquivos_notes}}}"
  ([] (listar-tipos-arquivos-using-get-with-http-info nil))
  ([{:keys [sort page limit nome descricao ]}]
   (call-api "/api/tipos-arquivos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-arquivos-using-get
  "{{{arquivo_resource_listar_tipos_arquivos}}}
  {{{arquivo_resource_listar_tipos_arquivos_notes}}}"
  ([] (listar-tipos-arquivos-using-get nil))
  ([optional-params]
   (:data (listar-tipos-arquivos-using-get-with-http-info optional-params))))

(defn listar-using-get5-with-http-info
  "{{{arquivo_a_u_d_resource_listar}}}
  {{{arquivo_a_u_d_resource_listar_notes}}}"
  ([id ] (listar-using-get5-with-http-info id nil))
  ([id {:keys [page limit ]}]
   (call-api "/api/arquivos/{id}/auditorias" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get5
  "{{{arquivo_a_u_d_resource_listar}}}
  {{{arquivo_a_u_d_resource_listar_notes}}}"
  ([id ] (listar-using-get5 id nil))
  ([id optional-params]
   (:data (listar-using-get5-with-http-info id optional-params))))

(defn listar-using-get6-with-http-info
  "{{{arquivo_resource_listar}}}
  {{{arquivo_resource_listar_notes}}}"
  ([] (listar-using-get6-with-http-info nil))
  ([{:keys [sort page limit nome id-tipo-arquivo id-status-arquivo extensao ]}]
   (call-api "/api/arquivos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "idTipoArquivo" id-tipo-arquivo "idStatusArquivo" id-status-arquivo "extensao" extensao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get6
  "{{{arquivo_resource_listar}}}
  {{{arquivo_resource_listar_notes}}}"
  ([] (listar-using-get6 nil))
  ([optional-params]
   (:data (listar-using-get6-with-http-info optional-params))))

(defn salvar-using-post1-with-http-info
  "{{{arquivo_resource_salvar}}}
  {{{arquivo_resource_salvar_notes}}}"
  [arquivo-persist ]
  (call-api "/api/arquivos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    arquivo-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post1
  "{{{arquivo_resource_salvar}}}
  {{{arquivo_resource_salvar_notes}}}"
  [arquivo-persist ]
  (:data (salvar-using-post1-with-http-info arquivo-persist)))
