(ns pier-sdk-clojure.api.endereco
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put-with-http-info
  "Atualiza os dados de um determinado EndereÃ§o
  Este mÃ©todo permite que seja alterado na base do emissor um ou mais registros ligados a um determinado EndereÃ§o."
  ([id ] (alterar-using-put-with-http-info id nil))
  ([id {:keys [id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais ]}]
   (call-api "/api/enderecos" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn alterar-using-put
  "Atualiza os dados de um determinado EndereÃ§o
  Este mÃ©todo permite que seja alterado na base do emissor um ou mais registros ligados a um determinado EndereÃ§o."
  ([id ] (alterar-using-put id nil))
  ([id optional-params]
   (:data (alterar-using-put-with-http-info id optional-params))))

(defn consultar-using-get2-with-http-info
  "Apresenta os dados de um determinado EndereÃ§o
  Este mÃ©todo permite consultar um determinado EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-endereco ]
  (call-api "/api/enderecos/{id_endereco}" :get
            {:path-params   {"id_endereco" id-endereco }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get2
  "Apresenta os dados de um determinado EndereÃ§o
  Este mÃ©todo permite consultar um determinado EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-endereco ]
  (:data (consultar-using-get2-with-http-info id-endereco)))

(defn listar-using-get2-with-http-info
  "Lista os EndereÃ§os cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get2-with-http-info nil))
  ([{:keys [id id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais data-inclusao data-ultima-atualizacao page limit ]}]
   (call-api "/api/enderecos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais "dataInclusao" data-inclusao "dataUltimaAtualizacao" data-ultima-atualizacao "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get2
  "Lista os EndereÃ§os cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get2 nil))
  ([optional-params]
   (:data (listar-using-get2-with-http-info optional-params))))

(defn salvar-using-post-with-http-info
  "Realiza o cadastro de um novo EndereÃ§o
  Este mÃ©todo permite que seja cadastrado um novo EndereÃ§o na base de dados do Emissor."
  ([] (salvar-using-post-with-http-info nil))
  ([{:keys [id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais ]}]
   (call-api "/api/enderecos" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn salvar-using-post
  "Realiza o cadastro de um novo EndereÃ§o
  Este mÃ©todo permite que seja cadastrado um novo EndereÃ§o na base de dados do Emissor."
  ([] (salvar-using-post nil))
  ([optional-params]
   (:data (salvar-using-post-with-http-info optional-params))))
