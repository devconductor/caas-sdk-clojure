(ns pier-sdk-clojure.api.cartao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn cancelar-cartao-using-post-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}/cancelar
  Cancelar um determinado cartÃ£o"
  [id-conta id-cartao motivo observacao ]
  (call-api "/v1/contas/{idConta}/cartoes/{idCartao}/cancelar" :post
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {}
             :query-params  {"motivo" motivo "observacao" observacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn cancelar-cartao-using-post
  "/contas/{idConta}/cartoes/{idCartao}/cancelar
  Cancelar um determinado cartÃ£o"
  [id-conta id-cartao motivo observacao ]
  (:data (cancelar-cartao-using-post-with-http-info id-conta id-cartao motivo observacao)))

(defn consultar-cartao-using-get-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}
  Consultar as informaÃ§Ãµes de um determinado cartÃ£o de uma conta"
  ([id-conta id-cartao ] (consultar-cartao-using-get-with-http-info id-conta id-cartao nil))
  ([id-conta id-cartao {:keys [numero-cartao ]}]
   (call-api "/v1/contas/{idConta}/cartoes/{idCartao}" :get
             {:path-params   {"idConta" id-conta "idCartao" id-cartao }
              :header-params {"numeroCartao" numero-cartao }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn consultar-cartao-using-get
  "/contas/{idConta}/cartoes/{idCartao}
  Consultar as informaÃ§Ãµes de um determinado cartÃ£o de uma conta"
  ([id-conta id-cartao ] (consultar-cartao-using-get id-conta id-cartao nil))
  ([id-conta id-cartao optional-params]
   (:data (consultar-cartao-using-get-with-http-info id-conta id-cartao optional-params))))

(defn consultar-cartoes-using-get-with-http-info
  "/contas/{idConta}/cartoes
  Consultar todos os cartÃµes de uma determinada conta"
  [id-conta ]
  (call-api "/v1/contas/{idConta}/cartoes" :get
            {:path-params   {"idConta" id-conta }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-cartoes-using-get
  "/contas/{idConta}/cartoes
  Consultar todos os cartÃµes de uma determinada conta"
  [id-conta ]
  (:data (consultar-cartoes-using-get-with-http-info id-conta)))

(defn consultar-extrato-faturas-using-get-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}/faturas
  Consulte os extratos/faturas do cartÃ£o de uma determinada conta"
  [id-conta id-cartao data-vencimento ]
  (call-api "/v1/contas/{idConta}/cartoes/{idCartao}/faturas" :get
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {}
             :query-params  {"dataVencimento" data-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-extrato-faturas-using-get
  "/contas/{idConta}/cartoes/{idCartao}/faturas
  Consulte os extratos/faturas do cartÃ£o de uma determinada conta"
  [id-conta id-cartao data-vencimento ]
  (:data (consultar-extrato-faturas-using-get-with-http-info id-conta id-cartao data-vencimento)))

(defn consultar-saldos-limites-using-get-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}/limites
  Consulte os limites de um determinado cartÃ£o"
  [id-conta id-cartao ]
  (call-api "/v1/contas/{idConta}/cartoes/{idCartao}/limites" :get
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-saldos-limites-using-get
  "/contas/{idConta}/cartoes/{idCartao}/limites
  Consulte os limites de um determinado cartÃ£o"
  [id-conta id-cartao ]
  (:data (consultar-saldos-limites-using-get-with-http-info id-conta id-cartao)))

(defn desbloquear-cartao-using-post-with-http-info
  "/contas/{idConta}/cartoes/{idCartao}/desbloquear
  Desbloquear cartÃ£o de uma determinada conta"
  [id-conta id-cartao codigo-segurancao ]
  (call-api "/v1/contas/{idConta}/cartoes/{idCartao}/desbloquear" :post
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {"codigoSegurancao" codigo-segurancao }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn desbloquear-cartao-using-post
  "/contas/{idConta}/cartoes/{idCartao}/desbloquear
  Desbloquear cartÃ£o de uma determinada conta"
  [id-conta id-cartao codigo-segurancao ]
  (:data (desbloquear-cartao-using-post-with-http-info id-conta id-cartao codigo-segurancao)))
