(ns pier-sdk-clojure.api.-global-tag-grupo-chageback-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-codigos-using-get-with-http-info
  "{{{codigo_chargeback_resource_listar}}}
  {{{codigo_chargeback_resource_listar_notes}}}"
  ([grupo-chargeback-id ] (listar-codigos-using-get-with-http-info grupo-chargeback-id nil))
  ([grupo-chargeback-id {:keys [sort page limit id descricao flag-atm grupo-chargeback-id2 ]}]
   (call-api "/api/grupos-chargeback/{grupoChargebackId}/codigos" :get
             {:path-params   {"grupoChargebackId" grupo-chargeback-id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao "flagAtm" flag-atm "grupoChargebackId" grupo-chargeback-id2 }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-codigos-using-get
  "{{{codigo_chargeback_resource_listar}}}
  {{{codigo_chargeback_resource_listar_notes}}}"
  ([grupo-chargeback-id ] (listar-codigos-using-get grupo-chargeback-id nil))
  ([grupo-chargeback-id optional-params]
   (:data (listar-codigos-using-get-with-http-info grupo-chargeback-id optional-params))))

(defn listar-using-get28-with-http-info
  "{{{grupo_chargeback_resource_listar}}}
  {{{grupo_chargeback_resource_listar_notes}}}"
  ([] (listar-using-get28-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/grupos-chargeback" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get28
  "{{{grupo_chargeback_resource_listar}}}
  {{{grupo_chargeback_resource_listar_notes}}}"
  ([] (listar-using-get28 nil))
  ([optional-params]
   (:data (listar-using-get28-with-http-info optional-params))))
