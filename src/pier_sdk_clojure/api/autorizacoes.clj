(ns pier-sdk-clojure.api.autorizacoes
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn cancelar-using-post-with-http-info
  "Cancela TransaÃ§Ã£o financeira
  Este mÃ©todo permite que seja cancelada uma transaÃ§Ã£o."
  [cancelamento-request ]
  (call-api "/api/cancelar-transacao" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    cancelamento-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cancelar-using-post
  "Cancela TransaÃ§Ã£o financeira
  Este mÃ©todo permite que seja cancelada uma transaÃ§Ã£o."
  [cancelamento-request ]
  (:data (cancelar-using-post-with-http-info cancelamento-request)))

(defn desfazer-using-post-with-http-info
  "Autoriza transaÃ§Ã£o financeira
  Este mÃ©todo faz uma autorizaÃ§Ã£o de transaÃ§Ã£o financeira."
  [autorizacao-on-us-request ]
  (call-api "/api/autorizar-transacao" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    autorizacao-on-us-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desfazer-using-post
  "Autoriza transaÃ§Ã£o financeira
  Este mÃ©todo faz uma autorizaÃ§Ã£o de transaÃ§Ã£o financeira."
  [autorizacao-on-us-request ]
  (:data (desfazer-using-post-with-http-info autorizacao-on-us-request)))

(defn desfazer-using-post1-with-http-info
  "Desfazimento de TransaÃ§Ã£o
  Este mÃ©todo permite que seja desfeita uma transaÃ§Ã£o."
  [desfazimento-request ]
  (call-api "/api/desfazer-transacao" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    desfazimento-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desfazer-using-post1
  "Desfazimento de TransaÃ§Ã£o
  Este mÃ©todo permite que seja desfeita uma transaÃ§Ã£o."
  [desfazimento-request ]
  (:data (desfazer-using-post1-with-http-info desfazimento-request)))

(defn simular-using-post-with-http-info
  "Simula Compra Parcelada
  Este mÃ©todo permite que seja simulada uma compra parcelada."
  [transacoes-request ]
  (call-api "/api/simular-transacao" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    transacoes-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn simular-using-post
  "Simula Compra Parcelada
  Este mÃ©todo permite que seja simulada uma compra parcelada."
  [transacoes-request ]
  (:data (simular-using-post-with-http-info transacoes-request)))
