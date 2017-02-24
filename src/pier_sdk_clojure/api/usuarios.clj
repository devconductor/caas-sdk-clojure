(ns pier-sdk-clojure.api.usuarios
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-senha-using-put-with-http-info
  "Alterar senha do usuÃ¡rio
  Este mÃ©todo realiza a alteraÃ§Ã£o da senha do usuÃ¡rio."
  [id senha-atual senha-nova ]
  (call-api "/api/usuarios/{id}/alterar-senha" :put
            {:path-params   {"id" id }
             :header-params {"senha_atual" senha-atual "senha_nova" senha-nova }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-senha-using-put
  "Alterar senha do usuÃ¡rio
  Este mÃ©todo realiza a alteraÃ§Ã£o da senha do usuÃ¡rio."
  [id senha-atual senha-nova ]
  (:data (alterar-senha-using-put-with-http-info id senha-atual senha-nova)))

(defn alterar-using-put6-with-http-info
  "Alterar os usuÃ¡rios cadastrados
  Este mÃ©todo realiza a alteraÃ§Ã£o dos usuÃ¡rios."
  [id update ]
  (call-api "/api/usuarios/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-using-put6
  "Alterar os usuÃ¡rios cadastrados
  Este mÃ©todo realiza a alteraÃ§Ã£o dos usuÃ¡rios."
  [id update ]
  (:data (alterar-using-put6-with-http-info id update)))

(defn consultar-using-get16-with-http-info
  "Apresenta os dados de um determinado UsuÃ¡rio
  Este mÃ©todo permite consultar as informaÃ§Ãµes de um determinado UsuÃ¡rio a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/usuarios/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get16
  "Apresenta os dados de um determinado UsuÃ¡rio
  Este mÃ©todo permite consultar as informaÃ§Ãµes de um determinado UsuÃ¡rio a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get16-with-http-info id)))

(defn listar-using-get16-with-http-info
  "Lista os UsuÃ¡rios cadastrados
  Este mÃ©todo permite que sejam listados os usuÃ¡rios existentes na base do PIER."
  ([] (listar-using-get16-with-http-info nil))
  ([{:keys [page limit id nome cpf email status ]}]
   (call-api "/api/usuarios" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome "cpf" cpf "email" email "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get16
  "Lista os UsuÃ¡rios cadastrados
  Este mÃ©todo permite que sejam listados os usuÃ¡rios existentes na base do PIER."
  ([] (listar-using-get16 nil))
  ([optional-params]
   (:data (listar-using-get16-with-http-info optional-params))))

(defn recuperar-senha-using-post-with-http-info
  "Recuperar senha do usuÃ¡rio
  Esse recurso permite recuperar a senha do usuÃ¡rio."
  [id ]
  (call-api "/api/usuarios/{id}/recuperar-senha" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn recuperar-senha-using-post
  "Recuperar senha do usuÃ¡rio
  Esse recurso permite recuperar a senha do usuÃ¡rio."
  [id ]
  (:data (recuperar-senha-using-post-with-http-info id)))

(defn salvar-using-post6-with-http-info
  "Cadastrar UsuÃ¡rio
  Esse recurso permite cadastrar usuÃ¡rios."
  [persist ]
  (call-api "/api/usuarios" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn salvar-using-post6
  "Cadastrar UsuÃ¡rio
  Esse recurso permite cadastrar usuÃ¡rios."
  [persist ]
  (:data (salvar-using-post6-with-http-info persist)))

(defn validar-senha-using-get1-with-http-info
  "Validar a senha do usuÃ¡rio
  Este mÃ©todo permite validar a senha do usuÃ¡rio)."
  [senha id ]
  (call-api "/api/usuarios/{id}/validar-senha" :get
            {:path-params   {"id" id }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn validar-senha-using-get1
  "Validar a senha do usuÃ¡rio
  Este mÃ©todo permite validar a senha do usuÃ¡rio)."
  [senha id ]
  (:data (validar-senha-using-get1-with-http-info senha id)))
