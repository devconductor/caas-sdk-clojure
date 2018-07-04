(ns pier-sdk-clojure.api.-global-tag-permissao-pais-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-pais-using-get-with-http-info
  "{{{permissao_pais_resource_consultar_pais}}}
  {{{permissao_pais_resource_consultar_pais_notes}}}"
  [id ]
  (call-api "/api/paises/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-pais-using-get
  "{{{permissao_pais_resource_consultar_pais}}}
  {{{permissao_pais_resource_consultar_pais_notes}}}"
  [id ]
  (:data (consultar-pais-using-get-with-http-info id)))

(defn listar-continentes-using-get-with-http-info
  "{{{enum_resource_listar_continentes}}}
  {{{enum_resource_listar_continentes_notes}}}"
  []
  (call-api "/api/continentes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-continentes-using-get
  "{{{enum_resource_listar_continentes}}}
  {{{enum_resource_listar_continentes_notes}}}"
  []
  (:data (listar-continentes-using-get-with-http-info)))

(defn listar-paises-using-get-with-http-info
  "{{{permissao_pais_resource_listar_paises}}}
  {{{permissao_pais_resource_listar_paises_notes}}}"
  ([] (listar-paises-using-get-with-http-info nil))
  ([{:keys [sort page limit codigo sigla descricao continente flag-ativo ]}]
   (call-api "/api/paises" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "codigo" codigo "sigla" sigla "descricao" descricao "continente" continente "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-paises-using-get
  "{{{permissao_pais_resource_listar_paises}}}
  {{{permissao_pais_resource_listar_paises_notes}}}"
  ([] (listar-paises-using-get nil))
  ([optional-params]
   (:data (listar-paises-using-get-with-http-info optional-params))))
