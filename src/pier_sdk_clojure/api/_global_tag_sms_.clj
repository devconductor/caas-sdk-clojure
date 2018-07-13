(ns pier-sdk-clojure.api.-global-tag-sms-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-sms-using-get1-with-http-info
  "{{{sms_resource_listar_sms}}}
  {{{sms_resource_listar_sms_notes}}}"
  ([id-conta ] (listar-sms-using-get1-with-http-info id-conta nil))
  ([id-conta {:keys [sort page limit data-inicio data-fim ]}]
   (call-api "/api/sms" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "dataInicio" data-inicio "dataFim" data-fim }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-sms-using-get1
  "{{{sms_resource_listar_sms}}}
  {{{sms_resource_listar_sms_notes}}}"
  ([id-conta ] (listar-sms-using-get1 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-sms-using-get1-with-http-info id-conta optional-params))))
