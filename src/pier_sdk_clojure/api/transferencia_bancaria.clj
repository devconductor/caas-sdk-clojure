(ns pier-sdk-clojure.api.transferencia-bancaria
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-using-put1-with-http-info
  "Atualiza conta bancÃ¡ria portador
  Esse recurso permite atualizar uma conta bancÃ¡ria do portador."
  [id update ]
  (call-api "/api/contas-bancarias-portador/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put1
  "Atualiza conta bancÃ¡ria portador
  Esse recurso permite atualizar uma conta bancÃ¡ria do portador."
  [id update ]
  (:data (atualizar-using-put1-with-http-info id update)))

(defn consultar-using-get9-with-http-info
  "Consulta conta bancÃ¡ria portador
  Esse recurso permite consultar uma conta bancÃ¡ria do portador a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/contas-bancarias-portador/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get9
  "Consulta conta bancÃ¡ria portador
  Esse recurso permite consultar uma conta bancÃ¡ria do portador a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get9-with-http-info id)))

(defn listar-using-get11-with-http-info
  "Lista contas bancÃ¡rias portador
  Esse recurso permite listar contas bancÃ¡rias do portador."
  ([] (listar-using-get11-with-http-info nil))
  ([{:keys [id-conta nome-agencia numero-agencia numero-conta flag-conta-origem-doc id-pessoa-fisica favorecido numero-receira-federal sort page limit ]}]
   (call-api "/api/contas-bancarias-portador" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "nomeAgencia" nome-agencia "numeroAgencia" numero-agencia "numeroConta" numero-conta "flagContaOrigemDoc" flag-conta-origem-doc "idPessoaFisica" id-pessoa-fisica "favorecido" favorecido "numeroReceiraFederal" numero-receira-federal "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get11
  "Lista contas bancÃ¡rias portador
  Esse recurso permite listar contas bancÃ¡rias do portador."
  ([] (listar-using-get11 nil))
  ([optional-params]
   (:data (listar-using-get11-with-http-info optional-params))))

(defn salvar-using-post7-with-http-info
  "Cadastra uma conta bancÃ¡ria do portador
  Esse recurso permite cadastrar contas bancÃ¡rias do portador."
  [persist ]
  (call-api "/api/contas-bancarias-portador" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post7
  "Cadastra uma conta bancÃ¡ria do portador
  Esse recurso permite cadastrar contas bancÃ¡rias do portador."
  [persist ]
  (:data (salvar-using-post7-with-http-info persist)))
