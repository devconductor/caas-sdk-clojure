(ns pier-sdk-clojure.api.plataforma-mobile
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-using-put1-with-http-info
  "Atualiza Plataforma Mobile
  Esse recurso permite atualizar plataforma mobile."
  [id update ]
  (call-api "/api/plataformas-mobile/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put1
  "Atualiza Plataforma Mobile
  Esse recurso permite atualizar plataforma mobile."
  [id update ]
  (:data (atualizar-using-put1-with-http-info id update)))

(defn listar-using-get33-with-http-info
  "Lista as plataformas mobile cadastradas
  Este método permite que sejam listadas as plataformas mobile existentes na base do PIER."
  ([] (listar-using-get33-with-http-info nil))
  ([{:keys [sort page limit nome ]}]
   (call-api "/api/plataformas-mobile" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get33
  "Lista as plataformas mobile cadastradas
  Este método permite que sejam listadas as plataformas mobile existentes na base do PIER."
  ([] (listar-using-get33 nil))
  ([optional-params]
   (:data (listar-using-get33-with-http-info optional-params))))

(defn salvar-using-post21-with-http-info
  "Cadastra Plataforma Mobile
  Esse recurso permite cadastrar plataformas mobile."
  [persist ]
  (call-api "/api/plataformas-mobile" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post21
  "Cadastra Plataforma Mobile
  Esse recurso permite cadastrar plataformas mobile."
  [persist ]
  (:data (salvar-using-post21-with-http-info persist)))
