(ns pier-sdk-clojure.api.conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-limite-using-put-with-http-info
  "Alterar limite
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  [id limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo ]
  (call-api "/api/contas/{id}/alterar-limites" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"limiteGlobal" limite-global "limiteCompra" limite-compra "limiteParcelado" limite-parcelado "limiteParcelas" limite-parcelas "limiteSaqueGlobal" limite-saque-global "limiteSaquePeriodo" limite-saque-periodo "limiteConsignado" limite-consignado "limiteInternacionalCompra" limite-internacional-compra "limiteInternacionalParcelado" limite-internacional-parcelado "limiteInternacionalParcelas" limite-internacional-parcelas "limiteInternacionalSaqueGlobal" limite-internacional-saque-global "limiteInternacionalSaquePeriodo" limite-internacional-saque-periodo }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-limite-using-put
  "Alterar limite
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  [id limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo ]
  (:data (alterar-limite-using-put-with-http-info id limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo)))

(defn alterar-vencimento-using-put-with-http-info
  "Alterar vencimento
  Esse recurso permite alterar o vencimento de uma conta especifica."
  [id novo-dia-vencimento ]
  (call-api "/api/contas/{id}/alterar-vencimento" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"novo_dia_vencimento" novo-dia-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-vencimento-using-put
  "Alterar vencimento
  Esse recurso permite alterar o vencimento de uma conta especifica."
  [id novo-dia-vencimento ]
  (:data (alterar-vencimento-using-put-with-http-info id novo-dia-vencimento)))

(defn consultar-limite-disponibilidade-using-get1-with-http-info
  "Apresenta os limites da conta
  Este mÃ©todo permite consultar os Limites configurados para uma determinada Conta, a partir do cÃ³digo de identificaÃ§Ã£o da conta (id)."
  [id ]
  (call-api "/api/contas/{id}/limites-disponibilidades" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-limite-disponibilidade-using-get1
  "Apresenta os limites da conta
  Este mÃ©todo permite consultar os Limites configurados para uma determinada Conta, a partir do cÃ³digo de identificaÃ§Ã£o da conta (id)."
  [id ]
  (:data (consultar-limite-disponibilidade-using-get1-with-http-info id)))

(defn consultar-using-get1-with-http-info
  "Apresenta dados de uma determinada conta
  Este mÃ©todo permite consultar dados de uma determinada conta a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/contas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get1
  "Apresenta dados de uma determinada conta
  Este mÃ©todo permite consultar dados de uma determinada conta a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get1-with-http-info id)))

(defn gerar-cartao-using-post-with-http-info
  "Realiza a geraÃ§Ã£o de um novo cartÃ£o para impressÃ£o avulsa"
  [id id-pessoa ]
  (call-api "/api/contas/{id}/pessoas/{id_pessoa}/gerar-cartao" :post
            {:path-params   {"id" id "id_pessoa" id-pessoa }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn gerar-cartao-using-post
  "Realiza a geraÃ§Ã£o de um novo cartÃ£o para impressÃ£o avulsa"
  [id id-pessoa ]
  (:data (gerar-cartao-using-post-with-http-info id id-pessoa)))

(defn listar-faturas-using-get-with-http-info
  "AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar todo o HistÃ³rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas."
  ([] (listar-faturas-using-get-with-http-info nil))
  ([{:keys [page limit id data-vencimento ]}]
   (call-api "/api/contas/{id_conta}/faturas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-faturas-using-get
  "AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar todo o HistÃ³rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas."
  ([] (listar-faturas-using-get nil))
  ([optional-params]
   (:data (listar-faturas-using-get-with-http-info optional-params))))

(defn listar-using-get1-with-http-info
  "Lista contas existentes na base de dados do Emissor
  Este recurso permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get1-with-http-info nil))
  ([{:keys [page limit id id-produto id-origem-comercial id-pessoa id-status-conta dia-vencimento melhor-dia-compra data-status-conta data-cadastro data-ultima-alteracao-vencimento ]}]
   (call-api "/api/contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "idProduto" id-produto "idOrigemComercial" id-origem-comercial "idPessoa" id-pessoa "idStatusConta" id-status-conta "diaVencimento" dia-vencimento "melhorDiaCompra" melhor-dia-compra "dataStatusConta" data-status-conta "dataCadastro" data-cadastro "dataUltimaAlteracaoVencimento" data-ultima-alteracao-vencimento }
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

(defn transacoes-using-post-with-http-info
  "Permite listar todas as transaÃ§Ãµes da Conta"
  ([] (transacoes-using-post-with-http-info nil))
  ([{:keys [page limit id-conta ]}]
   (call-api "/api/contas/{id_conta}/transacoes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idConta" id-conta }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn transacoes-using-post
  "Permite listar todas as transaÃ§Ãµes da Conta"
  ([] (transacoes-using-post nil))
  ([optional-params]
   (:data (transacoes-using-post-with-http-info optional-params))))
