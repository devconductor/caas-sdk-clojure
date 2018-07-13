(ns pier-sdk-clojure.api.-global-tag-oportunidade-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-status-using-put-with-http-info
  "{{{tipo_oportunidade_resource_alterar_status}}}
  {{{tipo_oportunidade_resource_alterar_status_notes}}}"
  [id id-status persist ]
  (call-api "/api/tipos-oportunidades/{id}/status/{idStatus}" :put
            {:path-params   {"id" id "idStatus" id-status }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-status-using-put
  "{{{tipo_oportunidade_resource_alterar_status}}}
  {{{tipo_oportunidade_resource_alterar_status_notes}}}"
  [id id-status persist ]
  (:data (alterar-status-using-put-with-http-info id id-status persist)))

(defn alterar-using-put12-with-http-info
  "{{{oportunidade_resource_alterar}}}
  {{{oportunidade_resource_alterar_notes}}}"
  [id update ]
  (call-api "/api/oportunidades/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put12
  "{{{oportunidade_resource_alterar}}}
  {{{oportunidade_resource_alterar_notes}}}"
  [id update ]
  (:data (alterar-using-put12-with-http-info id update)))

(defn alterar-using-put20-with-http-info
  "{{{tipo_oportunidade_resource_alterar}}}
  {{{tipo_oportunidade_resource_alterar_notes}}}"
  [id persist ]
  (call-api "/api/tipos-oportunidades/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put20
  "{{{tipo_oportunidade_resource_alterar}}}
  {{{tipo_oportunidade_resource_alterar_notes}}}"
  [id persist ]
  (:data (alterar-using-put20-with-http-info id persist)))

(defn consultar-status-using-get-with-http-info
  "{{{tipo_oportunidade_resource_consultar_status}}}
  {{{tipo_oportunidade_resource_consultar_status_notes}}}"
  [id id-status ]
  (call-api "/api/tipos-oportunidades/{id}/status/{idStatus}" :get
            {:path-params   {"id" id "idStatus" id-status }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-status-using-get
  "{{{tipo_oportunidade_resource_consultar_status}}}
  {{{tipo_oportunidade_resource_consultar_status_notes}}}"
  [id id-status ]
  (:data (consultar-status-using-get-with-http-info id id-status)))

(defn consultar-using-get26-with-http-info
  "{{{oportunidade_resource_consultar}}}
  {{{oportunidade_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/oportunidades/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get26
  "{{{oportunidade_resource_consultar}}}
  {{{oportunidade_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get26-with-http-info id)))

(defn consultar-using-get45-with-http-info
  "{{{tipo_oportunidade_resource_consultar}}}
  {{{tipo_oportunidade_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/tipos-oportunidades/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get45
  "{{{tipo_oportunidade_resource_consultar}}}
  {{{tipo_oportunidade_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get45-with-http-info id)))

(defn listar-auditorias-status-using-get-with-http-info
  "{{{tipo_oportunidade_resource_listar_auditorias_status}}}
  {{{tipo_oportunidade_resource_listar_auditorias_status_notes}}}"
  ([] (listar-auditorias-status-using-get-with-http-info nil))
  ([{:keys [sort page limit rev-type rev-date id id-tipo-oportunidade nome descricao flag-ativo rev-user ]}]
   (call-api "/api/auditorias-status-oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "revType" rev-type "revDate" rev-date "id" id "idTipoOportunidade" id-tipo-oportunidade "nome" nome "descricao" descricao "flagAtivo" flag-ativo "revUser" rev-user }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-auditorias-status-using-get
  "{{{tipo_oportunidade_resource_listar_auditorias_status}}}
  {{{tipo_oportunidade_resource_listar_auditorias_status_notes}}}"
  ([] (listar-auditorias-status-using-get nil))
  ([optional-params]
   (:data (listar-auditorias-status-using-get-with-http-info optional-params))))

(defn listar-auditorias-using-get-with-http-info
  "{{{oportunidade_resource_listar_auditorias}}}
  {{{oportunidade_resource_listar_auditorias_notes}}}"
  ([] (listar-auditorias-using-get-with-http-info nil))
  ([{:keys [sort page limit id-status-oportunidade data-cadastro data-atualizacao numero-receita-federal data-inicio-vigencia datat-fim-vigencia flag-ativo rev-date rev-type rev-user ]}]
   (call-api "/api/auditorias-oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idStatusOportunidade" id-status-oportunidade "dataCadastro" data-cadastro "dataAtualizacao" data-atualizacao "numeroReceitaFederal" numero-receita-federal "dataInicioVigencia" data-inicio-vigencia "datatFimVigencia" datat-fim-vigencia "flagAtivo" flag-ativo "revDate" rev-date "revType" rev-type "revUser" rev-user }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-auditorias-using-get
  "{{{oportunidade_resource_listar_auditorias}}}
  {{{oportunidade_resource_listar_auditorias_notes}}}"
  ([] (listar-auditorias-using-get nil))
  ([optional-params]
   (:data (listar-auditorias-using-get-with-http-info optional-params))))

(defn listar-auditorias-using-get1-with-http-info
  "{{{tipo_oportunidade_resource_listar_auditorias}}}
  {{{tipo_oportunidade_resource_listar_auditorias_notes}}}"
  ([] (listar-auditorias-using-get1-with-http-info nil))
  ([{:keys [sort page limit rev-type rev-date id descricao flag-ativo rev-user ]}]
   (call-api "/api/auditorias-tipos-oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "revType" rev-type "revDate" rev-date "id" id "descricao" descricao "flagAtivo" flag-ativo "revUser" rev-user }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-auditorias-using-get1
  "{{{tipo_oportunidade_resource_listar_auditorias}}}
  {{{tipo_oportunidade_resource_listar_auditorias_notes}}}"
  ([] (listar-auditorias-using-get1 nil))
  ([optional-params]
   (:data (listar-auditorias-using-get1-with-http-info optional-params))))

(defn listar-status-using-get-with-http-info
  "{{{tipo_oportunidade_resource_listar_status}}}
  {{{tipo_oportunidade_resource_listar_status_notes}}}"
  ([id ] (listar-status-using-get-with-http-info id nil))
  ([id {:keys [sort page limit nome descricao flag-ativo ]}]
   (call-api "/api/tipos-oportunidades/{id}/status" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "descricao" descricao "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-status-using-get
  "{{{tipo_oportunidade_resource_listar_status}}}
  {{{tipo_oportunidade_resource_listar_status_notes}}}"
  ([id ] (listar-status-using-get id nil))
  ([id optional-params]
   (:data (listar-status-using-get-with-http-info id optional-params))))

(defn listar-using-get35-with-http-info
  "{{{oportunidade_resource_listar}}}
  {{{oportunidade_resource_listar_notes}}}"
  ([] (listar-using-get35-with-http-info nil))
  ([{:keys [sort page limit id-status-oportunidade data-cadastro data-atualizacao numero-receita-federal data-inicio-vigencia data-fim-vigencia flag-ativo ]}]
   (call-api "/api/oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idStatusOportunidade" id-status-oportunidade "dataCadastro" data-cadastro "dataAtualizacao" data-atualizacao "numeroReceitaFederal" numero-receita-federal "dataInicioVigencia" data-inicio-vigencia "dataFimVigencia" data-fim-vigencia "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get35
  "{{{oportunidade_resource_listar}}}
  {{{oportunidade_resource_listar_notes}}}"
  ([] (listar-using-get35 nil))
  ([optional-params]
   (:data (listar-using-get35-with-http-info optional-params))))

(defn listar-using-get55-with-http-info
  "{{{tipo_oportunidade_resource_listar}}}
  {{{tipo_oportunidade_resource_listar_notes}}}"
  ([] (listar-using-get55-with-http-info nil))
  ([{:keys [sort page limit descricao flag-ativo ]}]
   (call-api "/api/tipos-oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "descricao" descricao "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get55
  "{{{tipo_oportunidade_resource_listar}}}
  {{{tipo_oportunidade_resource_listar_notes}}}"
  ([] (listar-using-get55 nil))
  ([optional-params]
   (:data (listar-using-get55-with-http-info optional-params))))

(defn salvar-status-using-post-with-http-info
  "{{{tipo_oportunidade_resource_salvar_status}}}
  {{{tipo_oportunidade_resource_salvar_status_notes}}}"
  [id persist ]
  (call-api "/api/tipos-oportunidades/{id}/status" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-status-using-post
  "{{{tipo_oportunidade_resource_salvar_status}}}
  {{{tipo_oportunidade_resource_salvar_status_notes}}}"
  [id persist ]
  (:data (salvar-status-using-post-with-http-info id persist)))

(defn salvar-using-post21-with-http-info
  "{{{oportunidade_resource_salvar}}}
  {{{oportunidade_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/oportunidades" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post21
  "{{{oportunidade_resource_salvar}}}
  {{{oportunidade_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post21-with-http-info persist)))

(defn salvar-using-post30-with-http-info
  "{{{tipo_oportunidade_resource_salvar}}}
  {{{tipo_oportunidade_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/tipos-oportunidades" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post30
  "{{{tipo_oportunidade_resource_salvar}}}
  {{{tipo_oportunidade_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post30-with-http-info persist)))
