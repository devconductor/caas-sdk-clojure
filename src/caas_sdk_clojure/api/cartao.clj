(ns caas-sdk-clojure.api.cartao
  (:require [caas-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-cartao-using-get-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}
  Consultar as informaÃ§Ãµes de um determinado cartÃ£o de uma conta"
  [id-emissor numero-cartao id-conta id-cartao ]
  (call-api "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}" :get
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {"idEmissor" id-emissor "numeroCartao" numero-cartao }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-cartao-using-get
  "/contas/{idConta}/cartoes/{idCartao}
  Consultar as informaÃ§Ãµes de um determinado cartÃ£o de uma conta"
  [id-emissor numero-cartao id-conta id-cartao ]
  (:data (consultar-cartao-using-get-with-http-info id-emissor numero-cartao id-conta id-cartao)))

(defn cancelar-cartao-using-post-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}/cancelar
  Cancelar um determinado cartÃ£o"
  [id-emissor id-conta id-cartao motivo observacao ]
  (call-api "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}/cancelar" :post
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {"idEmissor" id-emissor }
             :query-params  {"motivo" motivo "observacao" observacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn cancelar-cartao-using-post
  "/contas/{idConta}/cartoes/{idCartao}/cancelar
  Cancelar um determinado cartÃ£o"
  [id-emissor id-conta id-cartao motivo observacao ]
  (:data (cancelar-cartao-using-post-with-http-info id-emissor id-conta id-cartao motivo observacao)))

(defn desbloquear-cartao-using-post-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}/desbloquear
  Desbloquear cartÃ£o de uma determinada conta"
  [id-emissor id-conta id-cartao codigo-segurancao ]
  (call-api "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}/desbloquear" :post
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {"idEmissor" id-emissor "codigoSegurancao" codigo-segurancao }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn desbloquear-cartao-using-post
  "/contas/{idConta}/cartoes/{idCartao}/desbloquear
  Desbloquear cartÃ£o de uma determinada conta"
  [id-emissor id-conta id-cartao codigo-segurancao ]
  (:data (desbloquear-cartao-using-post-with-http-info id-emissor id-conta id-cartao codigo-segurancao)))

(defn consultar-extrato-faturas-using-get-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}/faturas
  Consulte os extratos/faturas do cartÃ£o de uma determinada conta"
  [id-emissor id-conta id-cartao data-vencimento ]
  (call-api "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}/faturas" :get
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {"idEmissor" id-emissor }
             :query-params  {"dataVencimento" data-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-extrato-faturas-using-get
  "/contas/{idConta}/cartoes/{idCartao}/faturas
  Consulte os extratos/faturas do cartÃ£o de uma determinada conta"
  [id-emissor id-conta id-cartao data-vencimento ]
  (:data (consultar-extrato-faturas-using-get-with-http-info id-emissor id-conta id-cartao data-vencimento)))

(defn consultar-saldos-limites-using-get-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}/saldos
  Consulte o saldo do cartÃ£o de uma determinada conta"
  [id-emissor id-conta id-cartao ]
  (call-api "/api/v1/contas/{idConta}/cartoes/cartoes/{idCartao}/saldos" :get
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {"idEmissor" id-emissor }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-saldos-limites-using-get
  "/contas/{idConta}/cartoes/{idCartao}/saldos
  Consulte o saldo do cartÃ£o de uma determinada conta"
  [id-emissor id-conta id-cartao ]
  (:data (consultar-saldos-limites-using-get-with-http-info id-emissor id-conta id-cartao)))

(defn consultar-conta-using-get-with-http-info
  "/contas/{idConta}
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-emissor id-conta ]
  (call-api "/api/v1/contas/{idConta}/cartoes/{idConta}" :get
            {:path-params   {"idConta" id-conta }
             :header-params {"idEmissor" id-emissor }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-conta-using-get
  "/contas/{idConta}
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-emissor id-conta ]
  (:data (consultar-conta-using-get-with-http-info id-emissor id-conta)))
