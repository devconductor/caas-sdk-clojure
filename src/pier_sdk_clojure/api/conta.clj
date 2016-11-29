(ns pier-sdk-clojure.api.conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-limite-using-put-with-http-info
  "Alterar limite
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  [id-conta limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo ]
  (call-api "/api/contas/{id_conta}/alterar-limites" :put
            {:path-params   {"id_conta" id-conta }
             :header-params {}
             :query-params  {"limiteGlobal" limite-global "limiteCompra" limite-compra "limiteParcelado" limite-parcelado "limiteParcelas" limite-parcelas "limiteSaqueGlobal" limite-saque-global "limiteSaquePeriodo" limite-saque-periodo "limiteConsignado" limite-consignado "limiteInternacionalCompra" limite-internacional-compra "limiteInternacionalParcelado" limite-internacional-parcelado "limiteInternacionalParcelas" limite-internacional-parcelas "limiteInternacionalSaqueGlobal" limite-internacional-saque-global "limiteInternacionalSaquePeriodo" limite-internacional-saque-periodo }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-limite-using-put
  "Alterar limite
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  [id-conta limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo ]
  (:data (alterar-limite-using-put-with-http-info id-conta limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo)))

(defn alterar-vencimento-using-put-with-http-info
  "Alterar vencimento
  Esse recurso permite alterar o vencimento de uma conta especifica."
  [id-conta novo-dia-vencimento ]
  (call-api "/api/contas/{id_conta}/alterar-vencimento" :put
            {:path-params   {"id_conta" id-conta }
             :header-params {}
             :query-params  {"novo_dia_vencimento" novo-dia-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-vencimento-using-put
  "Alterar vencimento
  Esse recurso permite alterar o vencimento de uma conta especifica."
  [id-conta novo-dia-vencimento ]
  (:data (alterar-vencimento-using-put-with-http-info id-conta novo-dia-vencimento)))

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

(defn gerar-cartao-using-post-with-http-info
  "Realiza a geraÃ§Ã£o de um novo cartÃ£o para impressÃ£o avulsa"
  [id-conta id-pessoa ]
  (call-api "/api/contas/{id_conta}/pessoas/{id_pessoa}/gerar-cartao" :post
            {:path-params   {"id_conta" id-conta "id_pessoa" id-pessoa }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn gerar-cartao-using-post
  "Realiza a geraÃ§Ã£o de um novo cartÃ£o para impressÃ£o avulsa"
  [id-conta id-pessoa ]
  (:data (gerar-cartao-using-post-with-http-info id-conta id-pessoa)))

(defn listar-using-get1-with-http-info
  "Lista contas existentes na base de dados do Emissor
  Este recurso permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get1-with-http-info nil))
  ([{:keys [id id-produto id-origem-comercial id-pessoa id-status-conta dia-vencimento melhor-dia-compra data-status-conta data-cadastro data-ultima-alteracao-vencimento page limit ]}]
   (call-api "/api/contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idProduto" id-produto "idOrigemComercial" id-origem-comercial "idPessoa" id-pessoa "idStatusConta" id-status-conta "diaVencimento" dia-vencimento "melhorDiaCompra" melhor-dia-compra "dataStatusConta" data-status-conta "dataCadastro" data-cadastro "dataUltimaAlteracaoVencimento" data-ultima-alteracao-vencimento "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get1
  "Lista contas existentes na base de dados do Emissor
  Este recurso permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get1 nil))
  ([optional-params]
   (:data (listar-using-get1-with-http-info optional-params))))
