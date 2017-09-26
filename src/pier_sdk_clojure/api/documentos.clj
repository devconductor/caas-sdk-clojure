(ns pier-sdk-clojure.api.documentos
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

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
