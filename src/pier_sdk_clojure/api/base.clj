(ns pier-sdk-clojure.api.base
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put-with-http-info
  "Alterar base
  Este recurso permite que seja modificado uma base jÃ¡ cadastrada"
  ([id servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso ] (alterar-using-put-with-http-info id servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso nil))
  ([id servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso {:keys [id-emissor ]}]
   (call-api "/api/bases" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "servidor" servidor "usuario" usuario "senha" senha "nomeBase" nome-base "senhaCriptografada" senha-criptografada "domain" domain "nomeBaseControleAcesso" nome-base-controle-acesso "idEmissor" id-emissor "servidorControleAcesso" servidor-controle-acesso }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn alterar-using-put
  "Alterar base
  Este recurso permite que seja modificado uma base jÃ¡ cadastrada"
  ([id servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso ] (alterar-using-put id servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso nil))
  ([id servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso optional-params]
   (:data (alterar-using-put-with-http-info id servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso optional-params))))

(defn clear-using-get-with-http-info
  "Limpar mapa de bases"
  []
  (call-api "/api/bases/clear" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn clear-using-get
  "Limpar mapa de bases"
  []
  (:data (clear-using-get-with-http-info)))

(defn consultar-using-get1-with-http-info
  "Consultar base
  Este recurso permite que seja consultada uma base do emissor atravÃ©s de um id especifico"
  [id ]
  (call-api "/api/bases/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get1
  "Consultar base
  Este recurso permite que seja consultada uma base do emissor atravÃ©s de um id especifico"
  [id ]
  (:data (consultar-using-get1-with-http-info id)))

(defn listar-using-get1-with-http-info
  "Listar bases
  Este recurso permite que sejam listadas as bases existentes"
  ([] (listar-using-get1-with-http-info nil))
  ([{:keys [page limit id servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso id-emissor servidor-controle-acesso ]}]
   (call-api "/api/bases" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "servidor" servidor "usuario" usuario "senha" senha "nomeBase" nome-base "senhaCriptografada" senha-criptografada "domain" domain "nomeBaseControleAcesso" nome-base-controle-acesso "idEmissor" id-emissor "servidorControleAcesso" servidor-controle-acesso }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get1
  "Listar bases
  Este recurso permite que sejam listadas as bases existentes"
  ([] (listar-using-get1 nil))
  ([optional-params]
   (:data (listar-using-get1-with-http-info optional-params))))

(defn salvar-using-post1-with-http-info
  "Salvar base
  Este recurso permite que seja adicionado uma nova base"
  ([servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso ] (salvar-using-post1-with-http-info servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso nil))
  ([servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso {:keys [id-emissor ]}]
   (call-api "/api/bases" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"servidor" servidor "usuario" usuario "senha" senha "nomeBase" nome-base "senhaCriptografada" senha-criptografada "domain" domain "nomeBaseControleAcesso" nome-base-controle-acesso "idEmissor" id-emissor "servidorControleAcesso" servidor-controle-acesso }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn salvar-using-post1
  "Salvar base
  Este recurso permite que seja adicionado uma nova base"
  ([servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso ] (salvar-using-post1 servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso nil))
  ([servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso optional-params]
   (:data (salvar-using-post1-with-http-info servidor usuario senha nome-base senha-criptografada domain nome-base-controle-acesso servidor-controle-acesso optional-params))))
