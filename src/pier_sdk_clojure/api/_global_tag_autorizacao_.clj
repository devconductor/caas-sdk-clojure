(ns pier-sdk-clojure.api.-global-tag-autorizacao-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn autorizar-por-conta-using-post-with-http-info
  "{{{transacao_on_us_resource_autorizar_por_conta}}}
  {{{transacao_on_us_resource_autorizar_por_conta_notes}}}"
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
  "{{{transacao_on_us_resource_autorizar_por_conta}}}
  {{{transacao_on_us_resource_autorizar_por_conta_notes}}}"
  [id transacao-on-us-por-id-cartao-request ]
  (:data (autorizar-por-conta-using-post-with-http-info id transacao-on-us-por-id-cartao-request)))

(defn autorizar-using-post-with-http-info
  "{{{transacao_on_us_resource_autorizar}}}
  {{{transacao_on_us_resource_autorizar_notes}}}"
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
  "{{{transacao_on_us_resource_autorizar}}}
  {{{transacao_on_us_resource_autorizar_notes}}}"
  [autorizacao-on-us-request ]
  (:data (autorizar-using-post-with-http-info autorizacao-on-us-request)))

(defn autorizar-using-post1-with-http-info
  "{{{transacao_on_us_resource_autorizar}}}
  {{{transacao_on_us_resource_autorizar_notes}}}"
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
  "{{{transacao_on_us_resource_autorizar}}}
  {{{transacao_on_us_resource_autorizar_notes}}}"
  [id transacao-on-us-por-id-cartao-request ]
  (:data (autorizar-using-post1-with-http-info id transacao-on-us-por-id-cartao-request)))

(defn cancelar-por-id-conta-using-post-with-http-info
  "{{{transacao_on_us_resource_cancelar_por_id_conta}}}
  {{{transacao_on_us_resource_cancelar_por_id_conta_notes}}}"
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
  "{{{transacao_on_us_resource_cancelar_por_id_conta}}}
  {{{transacao_on_us_resource_cancelar_por_id_conta_notes}}}"
  [id cancelamento-request ]
  (:data (cancelar-por-id-conta-using-post-with-http-info id cancelamento-request)))

(defn cancelar-using-post2-with-http-info
  "{{{transacao_on_us_resource_cancelar}}}
  {{{transacao_on_us_resource_cancelar_notes}}}"
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
  "{{{transacao_on_us_resource_cancelar}}}
  {{{transacao_on_us_resource_cancelar_notes}}}"
  [cancelamento-request ]
  (:data (cancelar-using-post2-with-http-info cancelamento-request)))

(defn cancelar-using-post3-with-http-info
  "{{{transacao_on_us_resource_cancelar}}}
  {{{transacao_on_us_resource_cancelar_notes}}}"
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
  "{{{transacao_on_us_resource_cancelar}}}
  {{{transacao_on_us_resource_cancelar_notes}}}"
  [id cancelamento-request ]
  (:data (cancelar-using-post3-with-http-info id cancelamento-request)))

(defn listar-codigos-processamento-autorizacao-using-get-with-http-info
  "{{{enum_resource_listar_codigos_processamento_autorizacao}}}
  {{{enum_resource_listar_codigos_processamento_autorizacao_notes}}}"
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
  "{{{enum_resource_listar_codigos_processamento_autorizacao}}}
  {{{enum_resource_listar_codigos_processamento_autorizacao_notes}}}"
  []
  (:data (listar-codigos-processamento-autorizacao-using-get-with-http-info)))

(defn simular-using-post-with-http-info
  "{{{transacao_on_us_resource_simular}}}
  {{{transacao_on_us_resource_simular_notes}}}"
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
  "{{{transacao_on_us_resource_simular}}}
  {{{transacao_on_us_resource_simular_notes}}}"
  [transacoes-request ]
  (:data (simular-using-post-with-http-info transacoes-request)))
