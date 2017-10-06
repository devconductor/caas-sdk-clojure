(ns pier-sdk-clojure.api.usuario
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-senha-login-using-post-with-http-info
  "Alterar senha do usuÃ¡rio.
  Este mÃ©todo realiza a alteraÃ§Ã£o da senha do usuÃ¡rio."
  [login senha-nova ]
  (call-api "/api/usuarios/{login}/alterar-senha" :post
            {:path-params   {"login" login }
             :header-params {"senhaNova" senha-nova }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-senha-login-using-post
  "Alterar senha do usuÃ¡rio.
  Este mÃ©todo realiza a alteraÃ§Ã£o da senha do usuÃ¡rio."
  [login senha-nova ]
  (:data (alterar-senha-login-using-post-with-http-info login senha-nova)))

(defn alterar-senha-using-put-with-http-info
  "Alterar senha do usuÃ¡rio na base do PIER ou WS.
  Este mÃ©todo realiza a alteraÃ§Ã£o da senha do usuÃ¡rio."
  [id senha-atual senha-nova ]
  (call-api "/api/usuarios/{id}/alterar-senha" :put
            {:path-params   {"id" id }
             :header-params {"senha_atual" senha-atual "senha_nova" senha-nova }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-senha-using-put
  "Alterar senha do usuÃ¡rio na base do PIER ou WS.
  Este mÃ©todo realiza a alteraÃ§Ã£o da senha do usuÃ¡rio."
  [id senha-atual senha-nova ]
  (:data (alterar-senha-using-put-with-http-info id senha-atual senha-nova)))

(defn alterar-using-put11-with-http-info
  "Altera os usuÃ¡rios cadastrados na base.
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
             :auth-names    []}))

(defn alterar-using-put11
  "Altera os usuÃ¡rios cadastrados na base.
  Este mÃ©todo realiza a alteraÃ§Ã£o dos usuÃ¡rios."
  [id update ]
  (:data (alterar-using-put11-with-http-info id update)))

(defn ativar-usuario-using-post-with-http-info
  "Ativa os usuÃ¡rios cadastrados na base do PIER ou WS.
  Este mÃ©todo realiza a ativaÃ§Ã£o dos usuÃ¡rios."
  [id ]
  (call-api "/api/usuarios/{id}/ativar-usuario" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-usuario-using-post
  "Ativa os usuÃ¡rios cadastrados na base do PIER ou WS.
  Este mÃ©todo realiza a ativaÃ§Ã£o dos usuÃ¡rios."
  [id ]
  (:data (ativar-usuario-using-post-with-http-info id)))

(defn consultar-using-get32-with-http-info
  "Apresenta os dados de um determinado UsuÃ¡rio na base do PIER ou WS.
  Este mÃ©todo permite consultar as informaÃ§Ãµes de um determinado UsuÃ¡rio a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/usuarios/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get32
  "Apresenta os dados de um determinado UsuÃ¡rio na base do PIER ou WS.
  Este mÃ©todo permite consultar as informaÃ§Ãµes de um determinado UsuÃ¡rio a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get32-with-http-info id)))

(defn desativar-usuario-using-post-with-http-info
  "Desativa os usuÃ¡rios cadastrados na base do PIER ou WS.
  Este mÃ©todo realiza a desativaÃ§Ã£o dos usuÃ¡rios."
  [id ]
  (call-api "/api/usuarios/{id}/desativar-usuario" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-usuario-using-post
  "Desativa os usuÃ¡rios cadastrados na base do PIER ou WS.
  Este mÃ©todo realiza a desativaÃ§Ã£o dos usuÃ¡rios."
  [id ]
  (:data (desativar-usuario-using-post-with-http-info id)))

(defn listar-using-get36-with-http-info
  "Lista os UsuÃ¡rios cadastrados na base do PIER ou WS.
  Este mÃ©todo permite que sejam listados os usuÃ¡rios existentes na base do PIER."
  ([] (listar-using-get36-with-http-info nil))
  ([{:keys [sort page limit nome cpf email status ]}]
   (call-api "/api/usuarios" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "cpf" cpf "email" email "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get36
  "Lista os UsuÃ¡rios cadastrados na base do PIER ou WS.
  Este mÃ©todo permite que sejam listados os usuÃ¡rios existentes na base do PIER."
  ([] (listar-using-get36 nil))
  ([optional-params]
   (:data (listar-using-get36-with-http-info optional-params))))

(defn recuperar-senha-using-post-with-http-info
  "Recuperar senha do usuÃ¡rio na base do PIER ou WS.
  Esse recurso permite recuperar a senha do usuÃ¡rio."
  [id ]
  (call-api "/api/usuarios/{id}/recuperar-senha" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn recuperar-senha-using-post
  "Recuperar senha do usuÃ¡rio na base do PIER ou WS.
  Esse recurso permite recuperar a senha do usuÃ¡rio."
  [id ]
  (:data (recuperar-senha-using-post-with-http-info id)))

(defn salvar-using-post20-with-http-info
  "Cadastra UsuÃ¡rio na base.
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
             :auth-names    []}))

(defn salvar-using-post20
  "Cadastra UsuÃ¡rio na base.
  Esse recurso permite cadastrar usuÃ¡rios."
  [persist ]
  (:data (salvar-using-post20-with-http-info persist)))

(defn validar-senha-login-using-post-with-http-info
  "Realiza login com validaÃ§Ã£o de senha dos usuÃ¡rios cadastrados na base do PIER ou WS.
  O recurso permite fazer login do usuÃ¡rio atravÃ©s da senha definida pelo emissor."
  [login senha ]
  (call-api "/api/usuarios/{login}/validar-senha" :post
            {:path-params   {"login" login }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-senha-login-using-post
  "Realiza login com validaÃ§Ã£o de senha dos usuÃ¡rios cadastrados na base do PIER ou WS.
  O recurso permite fazer login do usuÃ¡rio atravÃ©s da senha definida pelo emissor."
  [login senha ]
  (:data (validar-senha-login-using-post-with-http-info login senha)))

(defn validar-senha-using-get1-with-http-info
  "Validar a senha do usuÃ¡rio na base do PIER ou WS.
  Este mÃ©todo permite validar a senha do usuÃ¡rio)."
  [senha id ]
  (call-api "/api/usuarios/{id}/validar-senha" :get
            {:path-params   {"id" id }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-senha-using-get1
  "Validar a senha do usuÃ¡rio na base do PIER ou WS.
  Este mÃ©todo permite validar a senha do usuÃ¡rio)."
  [senha id ]
  (:data (validar-senha-using-get1-with-http-info senha id)))
