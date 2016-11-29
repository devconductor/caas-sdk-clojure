(ns pier-sdk-clojure.api.pessoa
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put1-with-http-info
  "Atualiza os dados de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor um registro de determinada Pessoa."
  ([id nome tipo ] (alterar-using-put1-with-http-info id nome tipo nil))
  ([id nome tipo {:keys [cpf cnpj data-nascimento sexo ]}]
   (call-api "/api/pessoas" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn alterar-using-put1
  "Atualiza os dados de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor um registro de determinada Pessoa."
  ([id nome tipo ] (alterar-using-put1 id nome tipo nil))
  ([id nome tipo optional-params]
   (:data (alterar-using-put1-with-http-info id nome tipo optional-params))))

(defn consultar-using-get3-with-http-info
  "Apresenta os dados de uma determinada Pessoa
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  [id-pessoa ]
  (call-api "/api/pessoas/{id_pessoa}" :get
            {:path-params   {"id_pessoa" id-pessoa }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get3
  "Apresenta os dados de uma determinada Pessoa
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  [id-pessoa ]
  (:data (consultar-using-get3-with-http-info id-pessoa)))

(defn listar-using-get3-with-http-info
  "Lista as Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get3-with-http-info nil))
  ([{:keys [id nome tipo cpf cnpj data-nascimento sexo page limit ]}]
   (call-api "/api/pessoas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get3
  "Lista as Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get3 nil))
  ([optional-params]
   (:data (listar-using-get3-with-http-info optional-params))))

(defn salvar-using-post1-with-http-info
  "Realiza o cadastro de um nova Pessoa
  Este mÃ©todo permite que seja cadastrado uma nova Pessoa na base de dados do Emissor."
  ([nome tipo ] (salvar-using-post1-with-http-info nome tipo nil))
  ([nome tipo {:keys [cpf cnpj data-nascimento sexo ]}]
   (call-api "/api/pessoas" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn salvar-using-post1
  "Realiza o cadastro de um nova Pessoa
  Este mÃ©todo permite que seja cadastrado uma nova Pessoa na base de dados do Emissor."
  ([nome tipo ] (salvar-using-post1 nome tipo nil))
  ([nome tipo optional-params]
   (:data (salvar-using-post1-with-http-info nome tipo optional-params))))
