(ns pier-sdk-clojure.api.status-conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get4-with-http-info
  "Apresenta os dados de um determinado Status Conta
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status Conta a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-status-conta ]
  (call-api "/api/status-contas/{id_status_conta}" :get
            {:path-params   {"id_status_conta" id-status-conta }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get4
  "Apresenta os dados de um determinado Status Conta
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status Conta a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-status-conta ]
  (:data (consultar-using-get4-with-http-info id-status-conta)))

(defn listar-using-get5-with-http-info
  "Lista os Status Contas cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Status Contas existentes na base de dados do Emissor."
  ([] (listar-using-get5-with-http-info nil))
  ([{:keys [id nome flag-altera-limite mensagem-consulta-negada page limit ]}]
   (call-api "/api/status-contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "flagAlteraLimite" flag-altera-limite "mensagemConsultaNegada" mensagem-consulta-negada "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get5
  "Lista os Status Contas cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Status Contas existentes na base de dados do Emissor."
  ([] (listar-using-get5 nil))
  ([optional-params]
   (:data (listar-using-get5-with-http-info optional-params))))
