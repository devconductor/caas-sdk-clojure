(ns pier-sdk-clojure.api.-global-tag-grupo-chageback-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-codigos-using-get-with-http-info
  "{{{codigo_chargeback_resource_listar}}}
  {{{codigo_chargeback_resource_listar_notes}}}"
  ([id ] (listar-codigos-using-get-with-http-info id nil))
  ([id {:keys [sort page limit flag-atm id-bandeira group-id ]}]
   (call-api "/api/grupos-chargeback/{id}/codigos" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "flagAtm" flag-atm "idBandeira" id-bandeira "groupId" group-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-codigos-using-get
  "{{{codigo_chargeback_resource_listar}}}
  {{{codigo_chargeback_resource_listar_notes}}}"
  ([id ] (listar-codigos-using-get id nil))
  ([id optional-params]
   (:data (listar-codigos-using-get-with-http-info id optional-params))))

(defn listar-using-get27-with-http-info
  "{{{grupo_chargeback_resource_listar}}}
  {{{grupo_chargeback_resource_listar_notes}}}"
  ([] (listar-using-get27-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/grupos-chargeback" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get27
  "{{{grupo_chargeback_resource_listar}}}
  {{{grupo_chargeback_resource_listar_notes}}}"
  ([] (listar-using-get27 nil))
  ([optional-params]
   (:data (listar-using-get27-with-http-info optional-params))))
