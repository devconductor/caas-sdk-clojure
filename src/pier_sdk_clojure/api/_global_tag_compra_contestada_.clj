(ns pier-sdk-clojure.api.-global-tag-compra-contestada-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn detalhe-cartao-using-get-with-http-info
  "{{{compra_contestada_detalhe_cartao_resource_listar}}}
  {{{compra_contestada_detalhe_cartao_resource_listar_notes}}}"
  [id-cartao ]
  (call-api "/api/cartoes-com-contestacoes/{idCartao}" :get
            {:path-params   {"idCartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn detalhe-cartao-using-get
  "{{{compra_contestada_detalhe_cartao_resource_listar}}}
  {{{compra_contestada_detalhe_cartao_resource_listar_notes}}}"
  [id-cartao ]
  (:data (detalhe-cartao-using-get-with-http-info id-cartao)))

(defn listar-using-get12-with-http-info
  "{{{cartao_com_compra_contestada_resource_listar}}}
  {{{cartao_com_compra_contestada_resource_listar_notes}}}"
  ([] (listar-using-get12-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/cartoes-com-contestacoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get12
  "{{{cartao_com_compra_contestada_resource_listar}}}
  {{{cartao_com_compra_contestada_resource_listar_notes}}}"
  ([] (listar-using-get12 nil))
  ([optional-params]
   (:data (listar-using-get12-with-http-info optional-params))))

(defn transacao-using-get-with-http-info
  "{{{compra_contestada_transacoes_resource_listar}}}
  {{{compra_contestada_transacoes_resource_listar_notes}}}"
  ([id-cartao ] (transacao-using-get-with-http-info id-cartao nil))
  ([id-cartao {:keys [sort page limit ]}]
   (call-api "/api/cartoes-com-contestacoes/{idCartao}/transacoes" :get
             {:path-params   {"idCartao" id-cartao }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn transacao-using-get
  "{{{compra_contestada_transacoes_resource_listar}}}
  {{{compra_contestada_transacoes_resource_listar_notes}}}"
  ([id-cartao ] (transacao-using-get id-cartao nil))
  ([id-cartao optional-params]
   (:data (transacao-using-get-with-http-info id-cartao optional-params))))
