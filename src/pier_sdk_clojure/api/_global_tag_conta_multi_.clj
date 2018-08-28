(ns pier-sdk-clojure.api.-global-tag-conta-multi-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn criar-cartoes-multi-app-using-post-with-http-info
  "{{{conta_resource_cadastrar_cartao_multiapp}}}
  {{{conta_resource_cadastrar_cartao_multiapp_notes}}}"
  [cartao-multi-app-persist ]
  (call-api "/api/cartoes/gerar-cartoes-multiapp" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    cartao-multi-app-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn criar-cartoes-multi-app-using-post
  "{{{conta_resource_cadastrar_cartao_multiapp}}}
  {{{conta_resource_cadastrar_cartao_multiapp_notes}}}"
  [cartao-multi-app-persist ]
  (:data (criar-cartoes-multi-app-using-post-with-http-info cartao-multi-app-persist)))

(defn criar-contas-multi-app-using-post-with-http-info
  "{{{conta_resource_cadastrar_conta_multiapp}}}
  {{{conta_resource_cadastrar_conta_multiapp_notes}}}"
  [conta-multi-app-persist ]
  (call-api "/api/contas/cadastrar-conta-multiapp" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    conta-multi-app-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn criar-contas-multi-app-using-post
  "{{{conta_resource_cadastrar_conta_multiapp}}}
  {{{conta_resource_cadastrar_conta_multiapp_notes}}}"
  [conta-multi-app-persist ]
  (:data (criar-contas-multi-app-using-post-with-http-info conta-multi-app-persist)))
