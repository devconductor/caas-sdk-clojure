(ns pier-sdk-clojure.api.estabelecimentos
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get16-with-http-info
  "Apresenta os dados de um determinado Terminal
  Este mÃ©todo permite consultar um determinado Terminal a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/terminais/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get16
  "Apresenta os dados de um determinado Terminal
  Este mÃ©todo permite consultar um determinado Terminal a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get16-with-http-info id)))

(defn consultar-using-get6-with-http-info
  "Consultar estabelecimento por id
  Consulta os detalhes de um determinado estabelecimento"
  [id ]
  (call-api "/api/estabelecimentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get6
  "Consultar estabelecimento por id
  Consulta os detalhes de um determinado estabelecimento"
  [id ]
  (:data (consultar-using-get6-with-http-info id)))

(defn listar-using-get22-with-http-info
  "Lista os Terminais cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os terminais existentes na base de dados do Emissor."
  ([] (listar-using-get22-with-http-info nil))
  ([{:keys [page limit id terminal numero-estabelecimento id-estabelecimento ]}]
   (call-api "/api/terminais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "terminal" terminal "numeroEstabelecimento" numero-estabelecimento "idEstabelecimento" id-estabelecimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get22
  "Lista os Terminais cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os terminais existentes na base de dados do Emissor."
  ([] (listar-using-get22 nil))
  ([optional-params]
   (:data (listar-using-get22-with-http-info optional-params))))

(defn listar-using-get9-with-http-info
  "Lista Estabelecimentos
  Lista todas os Estabelecimentos"
  ([] (listar-using-get9-with-http-info nil))
  ([{:keys [page limit id numero-receita-federal nome descricao nome-fantasia cep nome-logradouro numero-endereco complemento bairro cidade uf pais data-cadastramento contato email flag-arquivo-secr-fazenda flag-cartao-digitado inativo ]}]
   (call-api "/api/estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "numeroReceitaFederal" numero-receita-federal "nome" nome "descricao" descricao "nomeFantasia" nome-fantasia "cep" cep "nomeLogradouro" nome-logradouro "numeroEndereco" numero-endereco "complemento" complemento "bairro" bairro "cidade" cidade "uf" uf "pais" pais "dataCadastramento" data-cadastramento "contato" contato "email" email "flagArquivoSecrFazenda" flag-arquivo-secr-fazenda "flagCartaoDigitado" flag-cartao-digitado "inativo" inativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get9
  "Lista Estabelecimentos
  Lista todas os Estabelecimentos"
  ([] (listar-using-get9 nil))
  ([optional-params]
   (:data (listar-using-get9-with-http-info optional-params))))
