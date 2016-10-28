(ns pier-sdk-clojure.api.conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get1-with-http-info
  "Apresenta dados de uma determinada conta
  Este mÃ©todo permite consultar dados de uma determinada conta a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id-conta ]
  (call-api "/api/contas/{id_conta}" :get
            {:path-params   {"id_conta" id-conta }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get1
  "Apresenta dados de uma determinada conta
  Este mÃ©todo permite consultar dados de uma determinada conta a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id-conta ]
  (:data (consultar-using-get1-with-http-info id-conta)))

(defn listar-using-get1-with-http-info
  "Lista contas existentes na base de dados do Emissor.
  Este mÃ©todo permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get1-with-http-info nil))
  ([{:keys [id id-produto id-origem-comercial id-pessoa id-status-conta dia-vencimento melhor-dia-compra data-status-conta data-cadastro page limit ]}]
   (call-api "/api/contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idProduto" id-produto "idOrigemComercial" id-origem-comercial "idPessoa" id-pessoa "idStatusConta" id-status-conta "diaVencimento" dia-vencimento "melhorDiaCompra" melhor-dia-compra "dataStatusConta" data-status-conta "dataCadastro" data-cadastro "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get1
  "Lista contas existentes na base de dados do Emissor.
  Este mÃ©todo permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get1 nil))
  ([optional-params]
   (:data (listar-using-get1-with-http-info optional-params))))
