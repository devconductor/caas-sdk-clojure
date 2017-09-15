(ns pier-sdk-clojure.api.fatura
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-lancamentos-futuros-fatura-using-get1-with-http-info
  "Listar planos de parcelamento
  Lista os planos de parcelamento da fatura de uma conta."
  ([id data-vencimento-padrao ] (consultar-lancamentos-futuros-fatura-using-get1-with-http-info id data-vencimento-padrao nil))
  ([id data-vencimento-padrao {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/faturas/planos-parcelamento" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimentoPadrao" data-vencimento-padrao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-lancamentos-futuros-fatura-using-get1
  "Listar planos de parcelamento
  Lista os planos de parcelamento da fatura de uma conta."
  ([id data-vencimento-padrao ] (consultar-lancamentos-futuros-fatura-using-get1 id data-vencimento-padrao nil))
  ([id data-vencimento-padrao optional-params]
   (:data (consultar-lancamentos-futuros-fatura-using-get1-with-http-info id data-vencimento-padrao optional-params))))
