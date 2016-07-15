(ns pier-sdk-clojure.api.conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn buscar-conta-using-get-with-http-info
  "Buscar contas
  Consulte contas filtrando pelos campos id do emissor, nÃºmero do cartÃ£o, nome ou CPF/CNPJ"
  ([] (buscar-conta-using-get-with-http-info nil))
  ([{:keys [nome cpf numero-cartao id-conta ]}]
   (call-api "/v1.1/contas/buscar" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"nome" nome "cpf" cpf "numeroCartao" numero-cartao "idConta" id-conta }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn buscar-conta-using-get
  "Buscar contas
  Consulte contas filtrando pelos campos id do emissor, nÃºmero do cartÃ£o, nome ou CPF/CNPJ"
  ([] (buscar-conta-using-get nil))
  ([optional-params]
   (:data (buscar-conta-using-get-with-http-info optional-params))))

(defn consultar-conta-using-get-with-http-info
  "Retorna uma conta
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-conta ]
  (call-api "/v1.1/contas/{idConta}" :get
            {:path-params   {"idConta" id-conta }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-conta-using-get
  "Retorna uma conta
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-conta ]
  (:data (consultar-conta-using-get-with-http-info id-conta)))

(defn consultar-extrato-faturas-using-get-with-http-info
  "Retorna os extratos
  Consulte os extratos de uma determinada conta"
  [id-conta data-vencimento ]
  (call-api "/v1.1/contas/{idConta}/faturas" :get
            {:path-params   {"idConta" id-conta }
             :header-params {}
             :query-params  {"dataVencimento" data-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-extrato-faturas-using-get
  "Retorna os extratos
  Consulte os extratos de uma determinada conta"
  [id-conta data-vencimento ]
  (:data (consultar-extrato-faturas-using-get-with-http-info id-conta data-vencimento)))

(defn consultar-saldos-limites-using-get-with-http-info
  "Retorna o limite
  Consulte os limites de uma determinada conta"
  [id-conta ]
  (call-api "/v1.1/contas/{idConta}/limites" :get
            {:path-params   {"idConta" id-conta }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-saldos-limites-using-get
  "Retorna o limite
  Consulte os limites de uma determinada conta"
  [id-conta ]
  (:data (consultar-saldos-limites-using-get-with-http-info id-conta)))
