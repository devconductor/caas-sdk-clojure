(ns pier-sdk-clojure.api.documento
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-using-put-with-http-info
  "Atualizar templates dos documentos
  Esse recurso permite atualizar templates dos documentos."
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

(defn atualizar-using-put
  "Atualizar templates dos documentos
  Esse recurso permite atualizar templates dos documentos."
  [id persist ]
  (:data (atualizar-using-put-with-http-info id persist)))

(defn consultar-using-get7-with-http-info
  "Consultar templates dos documentos
  Esse recurso permite consultar templates dos documentos."
  [id ]
  (call-api "/api/templates-documentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get7
  "Consultar templates dos documentos
  Esse recurso permite consultar templates dos documentos."
  [id ]
  (:data (consultar-using-get7-with-http-info id)))

(defn listar-using-get10-with-http-info
  "Lista os templates dos documentos
  Esse recurso permite listar os templates dos documentos."
  ([] (listar-using-get10-with-http-info nil))
  ([{:keys [sort page limit id-tipo-documento ]}]
   (call-api "/api/templates-documentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoDocumento" id-tipo-documento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get10
  "Lista os templates dos documentos
  Esse recurso permite listar os templates dos documentos."
  ([] (listar-using-get10 nil))
  ([optional-params]
   (:data (listar-using-get10-with-http-info optional-params))))

(defn salvar-using-post5-with-http-info
  "Cadastra documentos
  Esse recurso permite cadastrar documentos."
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

(defn salvar-using-post5
  "Cadastra documentos
  Esse recurso permite cadastrar documentos."
  [persist ]
  (:data (salvar-using-post5-with-http-info persist)))

(defn salvar-using-post6-with-http-info
  "Cadastra os templates dos documentos
  Esse recurso permite cadastrar templates dos documentos."
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

(defn salvar-using-post6
  "Cadastra os templates dos documentos
  Esse recurso permite cadastrar templates dos documentos."
  [persist ]
  (:data (salvar-using-post6-with-http-info persist)))

(defn salvar-using-post7-with-http-info
  "Cadastra os tipos de documentos
  Esse recurso permite cadastrar tipos de documentos."
  [persist ]
  (call-api "/api/tipos-documentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post7
  "Cadastra os tipos de documentos
  Esse recurso permite cadastrar tipos de documentos."
  [persist ]
  (:data (salvar-using-post7-with-http-info persist)))
