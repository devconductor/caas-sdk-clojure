(ns pier-sdk-clojure.api.aplicacoes-mobile
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-using-put-with-http-info
  "Atualiza Aplicacao Mobile
  Esse recurso permite atualizar aplicacao mobile."
  [id update ]
  (call-api "/api/aplicacoes-mobile/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put
  "Atualiza Aplicacao Mobile
  Esse recurso permite atualizar aplicacao mobile."
  [id update ]
  (:data (atualizar-using-put-with-http-info id update)))

(defn listar-using-get-with-http-info
  "Lista os aplicacoes mobile cadastradas
  Este mÃ©todo permite que sejam listadas as aplicacoes mobile existentes na base do PIER."
  ([] (listar-using-get-with-http-info nil))
  ([{:keys [page limit id id-plataforma-mobile id-emissor ]}]
   (call-api "/api/aplicacoes-mobile" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "idPlataformaMobile" id-plataforma-mobile "idEmissor" id-emissor }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get
  "Lista os aplicacoes mobile cadastradas
  Este mÃ©todo permite que sejam listadas as aplicacoes mobile existentes na base do PIER."
  ([] (listar-using-get nil))
  ([optional-params]
   (:data (listar-using-get-with-http-info optional-params))))

(defn salvar-using-post-with-http-info
  "Cadastra Aplicacao Mobile
  Esse recurso permite cadastrar aplicacoes mobile."
  [persist ]
  (call-api "/api/aplicacoes-mobile" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post
  "Cadastra Aplicacao Mobile
  Esse recurso permite cadastrar aplicacoes mobile."
  [persist ]
  (:data (salvar-using-post-with-http-info persist)))
