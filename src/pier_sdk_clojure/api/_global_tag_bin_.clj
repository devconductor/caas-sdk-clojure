(ns pier-sdk-clojure.api.-global-tag-bin-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-bin-using-get-with-http-info
  "{{{Bin_resource_listar_bins}}}
  {{{Bin_resource_listar_Bin_notes}}}"
  ([] (listar-bin-using-get-with-http-info nil))
  ([{:keys [sort page limit id proxima-conta flag-cartao-virtual flag-provisorio service-code ]}]
   (call-api "/api/bins" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "proximaConta" proxima-conta "flagCartaoVirtual" flag-cartao-virtual "flagProvisorio" flag-provisorio "serviceCode" service-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-bin-using-get
  "{{{Bin_resource_listar_bins}}}
  {{{Bin_resource_listar_Bin_notes}}}"
  ([] (listar-bin-using-get nil))
  ([optional-params]
   (:data (listar-bin-using-get-with-http-info optional-params))))
