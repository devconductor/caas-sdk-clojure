(ns pier-sdk-clojure.api.-global-taxas-refinanciamento-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-using-get51-with-http-info
  "{{{taxas_refinanciamento_listar}}}
  {{{taxas_refinanciamento_listar_notes}}}"
  ([] (listar-using-get51-with-http-info nil))
  ([{:keys [sort page limit id id-produto data-entrada vencimento ]}]
   (call-api "/api/taxas-refinanciamento" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idProduto" id-produto "dataEntrada" data-entrada "vencimento" vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get51
  "{{{taxas_refinanciamento_listar}}}
  {{{taxas_refinanciamento_listar_notes}}}"
  ([] (listar-using-get51 nil))
  ([optional-params]
   (:data (listar-using-get51-with-http-info optional-params))))
