(ns pier-sdk-clojure.api.telefone
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get6-with-http-info
  "Apresenta os dados de um determinado Telefone
  Este mÃ©todo permite consultar um determinado Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-telefone ]
  (call-api "/api/telefones/{id_telefone}" :get
            {:path-params   {"id_telefone" id-telefone }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get6
  "Apresenta os dados de um determinado Telefone
  Este mÃ©todo permite consultar um determinado Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-telefone ]
  (:data (consultar-using-get6-with-http-info id-telefone)))

(defn listar-using-get7-with-http-info
  "Lista os Telefones cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get7-with-http-info nil))
  ([{:keys [id id-tipo-telefone id-pessoa ddd telefone ramal status page limit ]}]
   (call-api "/api/telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal "status" status "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get7
  "Lista os Telefones cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get7 nil))
  ([optional-params]
   (:data (listar-using-get7-with-http-info optional-params))))

(defn salvar-using-post2-with-http-info
  "Realiza o cadastro de um novo Telefone
  Este mÃ©todo permite que seja cadastrado um novo Telefone na base de dados do Emissor."
  ([] (salvar-using-post2-with-http-info nil))
  ([{:keys [id-tipo-telefone id-pessoa ddd telefone ramal ]}]
   (call-api "/api/telefones" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn salvar-using-post2
  "Realiza o cadastro de um novo Telefone
  Este mÃ©todo permite que seja cadastrado um novo Telefone na base de dados do Emissor."
  ([] (salvar-using-post2 nil))
  ([optional-params]
   (:data (salvar-using-post2-with-http-info optional-params))))
