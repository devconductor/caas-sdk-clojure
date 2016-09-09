(ns pier-sdk-clojure.api.pessoa
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get1-with-http-info
  "Apresenta os dados de uma determinada Pessoa.
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

(defn consultar-using-get1
  "Apresenta os dados de uma determinada Pessoa.
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  [id-pessoa ]
  (:data (consultar-using-get1-with-http-info id-pessoa)))

(defn listar-using-get1-with-http-info
  "Lista as Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get1-with-http-info nil))
  ([{:keys [id nome tipo cpf cnpj data-nascimento sexo page limit ]}]
   (call-api "/api/pessoas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get1
  "Lista as Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get1 nil))
  ([optional-params]
   (:data (listar-using-get1-with-http-info optional-params))))
