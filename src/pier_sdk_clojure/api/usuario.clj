(ns pier-sdk-clojure.api.usuario
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-senha-login-using-post-with-http-info
  "Alterar senha do usuário.
  Este método realiza a alteração da senha do usuário."
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
  "Alterar senha do usuário.
  Este método realiza a alteração da senha do usuário."
  [login senha-nova ]
  (:data (alterar-senha-login-using-post-with-http-info login senha-nova)))

(defn alterar-senha-using-put-with-http-info
  "Alterar senha do usuário na base do PIER ou WS.
  Este método realiza a alteração da senha do usuário."
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
  "Alterar senha do usuário na base do PIER ou WS.
  Este método realiza a alteração da senha do usuário."
  [id senha-atual senha-nova ]
  (:data (alterar-senha-using-put-with-http-info id senha-atual senha-nova)))

(defn alterar-using-put21-with-http-info
  "Altera os usuários cadastrados na base.
  Este método realiza a alteração dos usuários."
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

(defn alterar-using-put21
  "Altera os usuários cadastrados na base.
  Este método realiza a alteração dos usuários."
  [id update ]
  (:data (alterar-using-put21-with-http-info id update)))

(defn ativar-usuario-using-post-with-http-info
  "Ativa os usuários cadastrados na base do PIER ou WS.
  Este método realiza a ativação dos usuários."
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
  "Ativa os usuários cadastrados na base do PIER ou WS.
  Este método realiza a ativação dos usuários."
  [id ]
  (:data (ativar-usuario-using-post-with-http-info id)))

(defn consultar-using-get43-with-http-info
  "Apresenta os dados de um determinado Usuário na base do PIER ou WS.
  Este método permite consultar as informações de um determinado Usuário a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/usuarios/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get43
  "Apresenta os dados de um determinado Usuário na base do PIER ou WS.
  Este método permite consultar as informações de um determinado Usuário a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get43-with-http-info id)))

(defn desativar-usuario-using-post-with-http-info
  "Desativa os usuários cadastrados na base do PIER ou WS.
  Este método realiza a desativação dos usuários."
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
  "Desativa os usuários cadastrados na base do PIER ou WS.
  Este método realiza a desativação dos usuários."
  [id ]
  (:data (desativar-usuario-using-post-with-http-info id)))

(defn listar-using-get51-with-http-info
  "Lista os Usuários cadastrados na base do PIER ou WS.
  Este método permite que sejam listados os usuários existentes na base do PIER."
  ([] (listar-using-get51-with-http-info nil))
  ([{:keys [sort page limit nome cpf email status ]}]
   (call-api "/api/usuarios" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "cpf" cpf "email" email "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get51
  "Lista os Usuários cadastrados na base do PIER ou WS.
  Este método permite que sejam listados os usuários existentes na base do PIER."
  ([] (listar-using-get51 nil))
  ([optional-params]
   (:data (listar-using-get51-with-http-info optional-params))))

(defn recuperar-senha-using-post-with-http-info
  "Recuperar senha do usuário na base do PIER ou WS.
  Esse recurso permite recuperar a senha do usuário."
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
  "Recuperar senha do usuário na base do PIER ou WS.
  Esse recurso permite recuperar a senha do usuário."
  [id ]
  (:data (recuperar-senha-using-post-with-http-info id)))

(defn salvar-using-post28-with-http-info
  "Cadastra Usuário na base.
  Esse recurso permite cadastrar usuários."
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

(defn salvar-using-post28
  "Cadastra Usuário na base.
  Esse recurso permite cadastrar usuários."
  [persist ]
  (:data (salvar-using-post28-with-http-info persist)))

(defn validar-senha-login-using-post-with-http-info
  "Realiza login com validação de senha dos usuários cadastrados na base do PIER ou WS.
  O recurso permite fazer login do usuário através da senha definida pelo emissor."
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
  "Realiza login com validação de senha dos usuários cadastrados na base do PIER ou WS.
  O recurso permite fazer login do usuário através da senha definida pelo emissor."
  [login senha ]
  (:data (validar-senha-login-using-post-with-http-info login senha)))

(defn validar-senha-using-get1-with-http-info
  "Validar a senha do usuário na base do PIER ou WS.
  Este método permite validar a senha do usuário)."
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
  "Validar a senha do usuário na base do PIER ou WS.
  Este método permite validar a senha do usuário)."
  [senha id ]
  (:data (validar-senha-using-get1-with-http-info senha id)))
