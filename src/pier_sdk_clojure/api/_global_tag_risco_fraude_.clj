(ns pier-sdk-clojure.api.-global-tag-risco-fraude-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get35-with-http-info
  "{{{risco_fraude_resource_consultar}}}
  {{{risco_fraude_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/riscos-fraudes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get35
  "{{{risco_fraude_resource_consultar}}}
  {{{risco_fraude_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get35-with-http-info id)))

(defn listar-tipos-resolucao-using-get-with-http-info
  "{{{risco_fraude_resource_listar_tipos_resolucao}}}
  {{{risco_fraude_resource_listar_tipos_resolucao_notes}}}"
  ([] (listar-tipos-resolucao-using-get-with-http-info nil))
  ([{:keys [page limit ]}]
   (call-api "/api/tipos-resolucao" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-resolucao-using-get
  "{{{risco_fraude_resource_listar_tipos_resolucao}}}
  {{{risco_fraude_resource_listar_tipos_resolucao_notes}}}"
  ([] (listar-tipos-resolucao-using-get nil))
  ([optional-params]
   (:data (listar-tipos-resolucao-using-get-with-http-info optional-params))))

(defn negar-using-post-with-http-info
  "{{{risco_fraude_resource_negar}}}
  {{{risco_fraude_resource_negar_notes}}}"
  [id ]
  (call-api "/api/riscos-fraudes/{id}/negar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn negar-using-post
  "{{{risco_fraude_resource_negar}}}
  {{{risco_fraude_resource_negar_notes}}}"
  [id ]
  (:data (negar-using-post-with-http-info id)))

(defn reconhecer-using-post-with-http-info
  "{{{risco_fraude_resource_reconhecer}}}
  {{{risco_fraude_resource_reconhecer_notes}}}"
  [id ]
  (call-api "/api/riscos-fraudes/{id}/reconhecer" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn reconhecer-using-post
  "{{{risco_fraude_resource_reconhecer}}}
  {{{risco_fraude_resource_reconhecer_notes}}}"
  [id ]
  (:data (reconhecer-using-post-with-http-info id)))

(defn validar-dados-portador-using-post-with-http-info
  "{{{risco_fraude_resource_validar_dados_portador}}}
  {{{risco_fraude_resource_validar_dados_portador_notes}}}"
  [request ]
  (call-api "/api/riscos-fraudes/validar-dados-portador" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-dados-portador-using-post
  "{{{risco_fraude_resource_validar_dados_portador}}}
  {{{risco_fraude_resource_validar_dados_portador_notes}}}"
  [request ]
  (:data (validar-dados-portador-using-post-with-http-info request)))
