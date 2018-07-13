(ns pier-sdk-clojure.api.-global-tag-limite-disponibilidade-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put9-with-http-info
  "{{{limite_disponibilidade_resource_alterar}}}
  {{{limite_disponibilidade_resource_alterar_notes}}}"
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
  "{{{limite_disponibilidade_resource_alterar}}}
  {{{limite_disponibilidade_resource_alterar_notes}}}"
  ([id-conta ] (alterar-using-put9 id-conta nil))
  ([id-conta optional-params]
   (:data (alterar-using-put9-with-http-info id-conta optional-params))))

(defn consultar-using-get23-with-http-info
  "{{{limite_disponibilidade_resource_consultar}}}
  {{{limite_disponibilidade_resource_consultar_notes}}}"
  [id-conta ]
  (call-api "/api/limites-disponibilidades" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"idConta" id-conta }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get23
  "{{{limite_disponibilidade_resource_consultar}}}
  {{{limite_disponibilidade_resource_consultar_notes}}}"
  [id-conta ]
  (:data (consultar-using-get23-with-http-info id-conta)))
