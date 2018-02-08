(ns pier-sdk-clojure.api.limite-disponibilidade
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put9-with-http-info
  "Realiza a alteraÃ§Ã£o dos limites da conta
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  ([id-conta ] (alterar-using-put9-with-http-info id-conta nil))
  ([id-conta {:keys [limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo limite-maximo ]}]
   (call-api "/api/limites-disponibilidades" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"limiteGlobal" limite-global "limiteCompra" limite-compra "limiteParcelado" limite-parcelado "limiteParcelas" limite-parcelas "limiteSaqueGlobal" limite-saque-global "limiteSaquePeriodo" limite-saque-periodo "limiteConsignado" limite-consignado "limiteInternacionalCompra" limite-internacional-compra "limiteInternacionalParcelado" limite-internacional-parcelado "limiteInternacionalParcelas" limite-internacional-parcelas "limiteInternacionalSaqueGlobal" limite-internacional-saque-global "limiteInternacionalSaquePeriodo" limite-internacional-saque-periodo "limiteMaximo" limite-maximo "idConta" id-conta }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put9
  "Realiza a alteraÃ§Ã£o dos limites da conta
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  ([id-conta ] (alterar-using-put9 id-conta nil))
  ([id-conta optional-params]
   (:data (alterar-using-put9-with-http-info id-conta optional-params))))

(defn consultar-using-get19-with-http-info
  "Apresenta os limites da conta
  Este mÃ©todo permite consultar os Limites configurados para uma determinada Conta, a partir do cÃ³digo de identificaÃ§Ã£o da conta (id)."
  [id-conta ]
  (call-api "/api/limites-disponibilidades" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"idConta" id-conta }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get19
  "Apresenta os limites da conta
  Este mÃ©todo permite consultar os Limites configurados para uma determinada Conta, a partir do cÃ³digo de identificaÃ§Ã£o da conta (id)."
  [id-conta ]
  (:data (consultar-using-get19-with-http-info id-conta)))
