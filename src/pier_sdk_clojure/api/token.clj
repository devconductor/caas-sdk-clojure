(ns pier-sdk-clojure.api.token
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put5-with-http-info
  "Alterar token
  Este recurso permite que seja modificado um token jÃ¡ cadastrado"
  ([id ] (alterar-using-put5-with-http-info id nil))
  ([id {:keys [token base owner status criado-por alterado-por ]}]
   (call-api "/api/tokens" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "token" token "base" base "owner" owner "status" status "criadoPor" criado-por "alteradoPor" alterado-por }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn alterar-using-put5
  "Alterar token
  Este recurso permite que seja modificado um token jÃ¡ cadastrado"
  ([id ] (alterar-using-put5 id nil))
  ([id optional-params]
   (:data (alterar-using-put5-with-http-info id optional-params))))

(defn callback-using-post-with-http-info
  "/api/tokens/callback"
  [body-access-token ]
  (call-api "/api/tokens/callback" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body-access-token
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn callback-using-post
  "/api/tokens/callback"
  [body-access-token ]
  (:data (callback-using-post-with-http-info body-access-token)))

(defn consultar-using-get14-with-http-info
  "Consultar token
  Este recurso permite que seja consultado um token do emissor atravÃ©s de um id especifico"
  [id ]
  (call-api "/api/tokens/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get14
  "Consultar token
  Este recurso permite que seja consultado um token do emissor atravÃ©s de um id especifico"
  [id ]
  (:data (consultar-using-get14-with-http-info id)))

(defn listar-using-get14-with-http-info
  "Listar tokens
  Este recurso permite que sejam listados os tokens existentes"
  ([] (listar-using-get14-with-http-info nil))
  ([{:keys [page limit id token base owner status criado-por data-criacao alterado-por data-modificacao ]}]
   (call-api "/api/tokens" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "token" token "base" base "owner" owner "status" status "criadoPor" criado-por "dataCriacao" data-criacao "alteradoPor" alterado-por "dataModificacao" data-modificacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get14
  "Listar tokens
  Este recurso permite que sejam listados os tokens existentes"
  ([] (listar-using-get14 nil))
  ([optional-params]
   (:data (listar-using-get14-with-http-info optional-params))))

(defn salvar-using-post5-with-http-info
  "Salvar token
  Este recurso permite que seja adicionado um novo token"
  ([] (salvar-using-post5-with-http-info nil))
  ([{:keys [token base owner status criado-por alterado-por ]}]
   (call-api "/api/tokens" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"token" token "base" base "owner" owner "status" status "criadoPor" criado-por "alteradoPor" alterado-por }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn salvar-using-post5
  "Salvar token
  Este recurso permite que seja adicionado um novo token"
  ([] (salvar-using-post5 nil))
  ([optional-params]
   (:data (salvar-using-post5-with-http-info optional-params))))

(defn validar-using-post-with-http-info
  "/api/tokens/validar"
  [body-access-token ]
  (call-api "/api/tokens/validar" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body-access-token
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn validar-using-post
  "/api/tokens/validar"
  [body-access-token ]
  (:data (validar-using-post-with-http-info body-access-token)))
