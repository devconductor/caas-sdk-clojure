(ns pier-sdk-clojure.api.-global-tag-documento-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put21-with-http-info
  "{{{tipo_template_resource_alterar}}}
  {{{tipo_template_resource_alterar_notes}}}"
  [id persist ]
  (call-api "/api/tipos-templates/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put21
  "{{{tipo_template_resource_alterar}}}
  {{{tipo_template_resource_alterar_notes}}}"
  [id persist ]
  (:data (alterar-using-put21-with-http-info id persist)))

(defn atualizar-using-put4-with-http-info
  "{{{documento_template_resource_atualizar}}}
  {{{documento_template_resource_atualizar_notes}}}"
  [id persist ]
  (call-api "/api/templates-documentos/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put4
  "{{{documento_template_resource_atualizar}}}
  {{{documento_template_resource_atualizar_notes}}}"
  [id persist ]
  (:data (atualizar-using-put4-with-http-info id persist)))

(defn consultar-using-get19-with-http-info
  "{{{documento_resource_consultar}}}
  {{{documento_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/documentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get19
  "{{{documento_resource_consultar}}}
  {{{documento_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get19-with-http-info id)))

(defn consultar-using-get20-with-http-info
  "{{{documento_template_resource_consultar}}}
  {{{documento_template_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/templates-documentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get20
  "{{{documento_template_resource_consultar}}}
  {{{documento_template_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get20-with-http-info id)))

(defn consultar-using-get49-with-http-info
  "{{{tipo_template_resource_consultar}}}
  {{{tipo_template_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/tipos-templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get49
  "{{{tipo_template_resource_consultar}}}
  {{{tipo_template_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get49-with-http-info id)))

(defn integrar-using-post1-with-http-info
  "{{{documento_resource_integrar}}}
  {{{documento_resource_integrar_notes}}}"
  [integrar-documento-request ]
  (call-api "/api/documentos/integrar" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    integrar-documento-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn integrar-using-post1
  "{{{documento_resource_integrar}}}
  {{{documento_resource_integrar_notes}}}"
  [integrar-documento-request ]
  (:data (integrar-using-post1-with-http-info integrar-documento-request)))

(defn listar-using-get22-with-http-info
  "{{{documento_resource_listar}}}
  {{{documento_resource_listar_notes}}}"
  ([] (listar-using-get22-with-http-info nil))
  ([{:keys [sort page limit id-template-documento nome extensao ]}]
   (call-api "/api/documentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTemplateDocumento" id-template-documento "nome" nome "extensao" extensao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get22
  "{{{documento_resource_listar}}}
  {{{documento_resource_listar_notes}}}"
  ([] (listar-using-get22 nil))
  ([optional-params]
   (:data (listar-using-get22-with-http-info optional-params))))

(defn listar-using-get23-with-http-info
  "{{{documento_template_resource_listar}}}
  {{{documento_template_resource_listar_notes}}}"
  ([] (listar-using-get23-with-http-info nil))
  ([{:keys [sort page limit id-tipo-template ]}]
   (call-api "/api/templates-documentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoTemplate" id-tipo-template }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get23
  "{{{documento_template_resource_listar}}}
  {{{documento_template_resource_listar_notes}}}"
  ([] (listar-using-get23 nil))
  ([optional-params]
   (:data (listar-using-get23-with-http-info optional-params))))

(defn listar-using-get60-with-http-info
  "{{{tipo_template_resource_listar}}}
  {{{tipo_template_resource_listar_notes}}}"
  ([] (listar-using-get60-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/tipos-templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get60
  "{{{tipo_template_resource_listar}}}
  {{{tipo_template_resource_listar_notes}}}"
  ([] (listar-using-get60 nil))
  ([optional-params]
   (:data (listar-using-get60-with-http-info optional-params))))

(defn salvar-using-post12-with-http-info
  "{{{documento_resource_salvar}}}
  {{{documento_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/documentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post12
  "{{{documento_resource_salvar}}}
  {{{documento_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post12-with-http-info persist)))

(defn salvar-using-post13-with-http-info
  "{{{documento_template_resource_salvar}}}
  {{{documento_template_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/templates-documentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post13
  "{{{documento_template_resource_salvar}}}
  {{{documento_template_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post13-with-http-info persist)))

(defn salvar-using-post32-with-http-info
  "{{{tipo_template_resource_salvar}}}
  {{{tipo_template_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/tipos-templates" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post32
  "{{{tipo_template_resource_salvar}}}
  {{{tipo_template_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post32-with-http-info persist)))
