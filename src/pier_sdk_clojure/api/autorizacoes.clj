(ns pier-sdk-clojure.api.autorizacoes
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn autorizar-using-post-with-http-info
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

(defn autorizar-using-post
  "Autoriza transaÃ§Ã£o financeira
  Este mÃ©todo faz uma autorizaÃ§Ã£o de transaÃ§Ã£o financeira."
  [autorizacao-on-us-request ]
  (:data (autorizar-using-post-with-http-info autorizacao-on-us-request)))

(defn cancelar-using-post-with-http-info
  "Cancela transaÃ§Ã£o financeira
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
  "Cancela transaÃ§Ã£o financeira
  Este mÃ©todo permite que seja cancelada uma transaÃ§Ã£o."
  [cancelamento-request ]
  (:data (cancelar-using-post-with-http-info cancelamento-request)))

(defn listar-codigos-processamento-autorizacao-using-get-with-http-info
  "Retorna cÃ³digos de processamento de autorizaÃ§Ã£o
  Este mÃ©todo retorna a lista dos cÃ³digos de processamento para autorizaÃ§Ã£o de transaÃ§Ãµes financeiras."
  []
  (call-api "/api/consultar-codigos-processamento-autorizacao" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-codigos-processamento-autorizacao-using-get
  "Retorna cÃ³digos de processamento de autorizaÃ§Ã£o
  Este mÃ©todo retorna a lista dos cÃ³digos de processamento para autorizaÃ§Ã£o de transaÃ§Ãµes financeiras."
  []
  (:data (listar-codigos-processamento-autorizacao-using-get-with-http-info)))

(defn simular-using-post-with-http-info
  "Simula planos de pagamento
  Este mÃ©todo permite que seja simulada um plano de pagamento."
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
  "Simula planos de pagamento
  Este mÃ©todo permite que seja simulada um plano de pagamento."
  [transacoes-request ]
  (:data (simular-using-post-with-http-info transacoes-request)))
