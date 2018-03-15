(ns pier-sdk-clojure.api.autorizacao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn autorizar-por-conta-using-post-with-http-info
  "Autoriza transação financeira por idConta
  Este método faz uma autorização de transação financeira com o idConta."
  [id transacao-on-us-por-id-cartao-request ]
  (call-api "/api/contas/{id}/autorizar-transacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    transacao-on-us-por-id-cartao-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn autorizar-por-conta-using-post
  "Autoriza transação financeira por idConta
  Este método faz uma autorização de transação financeira com o idConta."
  [id transacao-on-us-por-id-cartao-request ]
  (:data (autorizar-por-conta-using-post-with-http-info id transacao-on-us-por-id-cartao-request)))

(defn autorizar-using-post-with-http-info
  "Autoriza transação financeira
  Este método faz uma autorização de transação financeira."
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
  "Autoriza transação financeira
  Este método faz uma autorização de transação financeira."
  [autorizacao-on-us-request ]
  (:data (autorizar-using-post-with-http-info autorizacao-on-us-request)))

(defn autorizar-using-post1-with-http-info
  "Autoriza transação financeira por idCartao
  Este método faz uma autorização de transação financeira com o idCartao."
  [id transacao-on-us-por-id-cartao-request ]
  (call-api "/api/cartoes/{id}/autorizar-transacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    transacao-on-us-por-id-cartao-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn autorizar-using-post1
  "Autoriza transação financeira por idCartao
  Este método faz uma autorização de transação financeira com o idCartao."
  [id transacao-on-us-por-id-cartao-request ]
  (:data (autorizar-using-post1-with-http-info id transacao-on-us-por-id-cartao-request)))

(defn cancelar-por-id-conta-using-post-with-http-info
  "Cancela transação financeira por idConta
  Este método permite que seja cancelada uma transação a partir do idConta."
  [id cancelamento-request ]
  (call-api "/api/contas/{id}/cancelar-transacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    cancelamento-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cancelar-por-id-conta-using-post
  "Cancela transação financeira por idConta
  Este método permite que seja cancelada uma transação a partir do idConta."
  [id cancelamento-request ]
  (:data (cancelar-por-id-conta-using-post-with-http-info id cancelamento-request)))

(defn cancelar-using-post2-with-http-info
  "Cancela transação financeira
  Este método permite que seja cancelada uma transação."
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

(defn cancelar-using-post2
  "Cancela transação financeira
  Este método permite que seja cancelada uma transação."
  [cancelamento-request ]
  (:data (cancelar-using-post2-with-http-info cancelamento-request)))

(defn cancelar-using-post3-with-http-info
  "Cancela transação financeira por idCartao
  Este método permite que seja cancelada uma transação a partir do idCartao."
  [id cancelamento-request ]
  (call-api "/api/cartoes/{id}/cancelar-transacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    cancelamento-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cancelar-using-post3
  "Cancela transação financeira por idCartao
  Este método permite que seja cancelada uma transação a partir do idCartao."
  [id cancelamento-request ]
  (:data (cancelar-using-post3-with-http-info id cancelamento-request)))

(defn listar-codigos-processamento-autorizacao-using-get-with-http-info
  "Retorna códigos de processamento de autorização
  Este método retorna a lista dos códigos de processamento para autorização de transações financeiras."
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
  "Retorna códigos de processamento de autorização
  Este método retorna a lista dos códigos de processamento para autorização de transações financeiras."
  []
  (:data (listar-codigos-processamento-autorizacao-using-get-with-http-info)))

(defn simular-using-post-with-http-info
  "Simula planos de transações
  Este método permite que seja simulada um plano de transações."
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
  "Simula planos de transações
  Este método permite que seja simulada um plano de transações."
  [transacoes-request ]
  (:data (simular-using-post-with-http-info transacoes-request)))
