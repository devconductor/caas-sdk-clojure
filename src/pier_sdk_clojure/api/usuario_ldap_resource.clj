(ns pier-sdk-clojure.api.usuario-ldap-resource
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put22-with-http-info
  "alterar"
  [id update ]
  (call-api "/api/usuarios-ldap/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put22
  "alterar"
  [id update ]
  (:data (alterar-using-put22-with-http-info id update)))

(defn ativar-usuario-using-post-with-http-info
  "ativarUsuario"
  [id ]
  (call-api "/api/usuarios-ldap/{id}/ativar-usuario" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-usuario-using-post
  "ativarUsuario"
  [id ]
  (:data (ativar-usuario-using-post-with-http-info id)))

(defn consultar-using-get52-with-http-info
  "consultar"
  [id ]
  (call-api "/api/usuarios-ldap/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get52
  "consultar"
  [id ]
  (:data (consultar-using-get52-with-http-info id)))

(defn desativar-usuario-using-post-with-http-info
  "desativarUsuario"
  [id ]
  (call-api "/api/usuarios-ldap/{id}/desativar-usuario" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-usuario-using-post
  "desativarUsuario"
  [id ]
  (:data (desativar-usuario-using-post-with-http-info id)))

(defn listar-using-get64-with-http-info
  "listar"
  ([] (listar-using-get64-with-http-info nil))
  ([{:keys [sort page limit nome cpf email status id-emissor ]}]
   (call-api "/api/usuarios-ldap" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "cpf" cpf "email" email "status" status "idEmissor" id-emissor }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get64
  "listar"
  ([] (listar-using-get64 nil))
  ([optional-params]
   (:data (listar-using-get64-with-http-info optional-params))))

(defn perfis-using-get-with-http-info
  "perfis"
  [id ]
  (call-api "/api/usuarios-ldap/{id}/perfis" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn perfis-using-get
  "perfis"
  [id ]
  (:data (perfis-using-get-with-http-info id)))

(defn salvar-using-post33-with-http-info
  "salvar"
  [persist ]
  (call-api "/api/usuarios-ldap" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post33
  "salvar"
  [persist ]
  (:data (salvar-using-post33-with-http-info persist)))
