(ns pier-sdk-clojure.api.arquivo
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get1-with-http-info
  "Consulta de arquivo no PIER Cloud
  Este recurso permite consultar um determinado arquivo armazenado no PIER Cloud."
  [id ]
  (call-api "/api/arquivos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get1
  "Consulta de arquivo no PIER Cloud
  Este recurso permite consultar um determinado arquivo armazenado no PIER Cloud."
  [id ]
  (:data (consultar-using-get1-with-http-info id)))

(defn salvar-using-post1-with-http-info
  "Permite armazenar arquivos no PIER Cloud
  Este recurso permite o armazenamento de arquivos no PIER Cloud."
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
  "Permite armazenar arquivos no PIER Cloud
  Este recurso permite o armazenamento de arquivos no PIER Cloud."
  [arquivo-persist ]
  (:data (salvar-using-post1-with-http-info arquivo-persist)))
