(ns pier-sdk-clojure.api.dispositivos
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ativar-using-post-with-http-info
  "Ativa Dispositivo
  Esse recurso permite ativar dispositivo."
  [id ]
  (call-api "/api/dispositivos/{id}/ativar-dispositivo" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-using-post
  "Ativa Dispositivo
  Esse recurso permite ativar dispositivo."
  [id ]
  (:data (ativar-using-post-with-http-info id)))

(defn desativar-using-post-with-http-info
  "Desativa Dispositivo
  Esse recurso permite desativar dispositivo."
  [id ]
  (call-api "/api/dispositivos/{id}/desativar-dispositivo" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-using-post
  "Desativa Dispositivo
  Esse recurso permite desativar dispositivo."
  [id ]
  (:data (desativar-using-post-with-http-info id)))

(defn listar-using-get8-with-http-info
  "Lista os dispositivos cadastrados
  Este mÃ©todo permite que sejam listados os dispositivos existentes na base do PIER."
  ([] (listar-using-get8-with-http-info nil))
  ([{:keys [page limit token id-usuario id-aplicacao-mobile data-criacao data-desativacao ]}]
   (call-api "/api/dispositivos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "token" token "idUsuario" id-usuario "idAplicacaoMobile" id-aplicacao-mobile "dataCriacao" data-criacao "dataDesativacao" data-desativacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get8
  "Lista os dispositivos cadastrados
  Este mÃ©todo permite que sejam listados os dispositivos existentes na base do PIER."
  ([] (listar-using-get8 nil))
  ([optional-params]
   (:data (listar-using-get8-with-http-info optional-params))))

(defn salvar-using-post4-with-http-info
  "Cadastra Dispositivo
  Esse recurso permite cadastrar dispositivos."
  [persist ]
  (call-api "/api/dispositivos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post4
  "Cadastra Dispositivo
  Esse recurso permite cadastrar dispositivos."
  [persist ]
  (:data (salvar-using-post4-with-http-info persist)))
