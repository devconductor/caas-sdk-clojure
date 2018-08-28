(ns pier-sdk-clojure.api.-global-tag-compra-contestada-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn contestar-using-post-with-http-info
  "{{{compra_contestada_transacoes_resource_contestar}}}
  {{{compra_contestada_transacoes_resource_contestar_notes}}}"
  ([id-cartao request ] (contestar-using-post-with-http-info id-cartao request nil))
  ([id-cartao request {:keys [login ]}]
   (call-api "/api/cartoes-com-contestacoes/{idCartao}/contestar" :post
             {:path-params   {"idCartao" id-cartao }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    login
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn contestar-using-post
  "{{{compra_contestada_transacoes_resource_contestar}}}
  {{{compra_contestada_transacoes_resource_contestar_notes}}}"
  ([id-cartao request ] (contestar-using-post id-cartao request nil))
  ([id-cartao request optional-params]
   (:data (contestar-using-post-with-http-info id-cartao request optional-params))))

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

(defn listar-using-get13-with-http-info
  "{{{cartao_com_compra_contestada_resource_listar}}}
  {{{cartao_com_compra_contestada_resource_listar_notes}}}"
  ([] (listar-using-get13-with-http-info nil))
  ([{:keys [sort page limit aging-contestacao nome bandeira cartao cpf conta status-cartao status-contestacao data-contestacao data-alteracao data-reapresentacao dias-contestacao dias-compra modo-entrada motivo valor-compra ]}]
   (call-api "/api/cartoes-com-contestacoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "agingContestacao" aging-contestacao "nome" nome "bandeira" bandeira "cartao" cartao "cpf" cpf "conta" conta "statusCartao" status-cartao "statusContestacao" status-contestacao "dataContestacao" data-contestacao "dataAlteracao" data-alteracao "dataReapresentacao" data-reapresentacao "diasContestacao" dias-contestacao "diasCompra" dias-compra "modoEntrada" modo-entrada "motivo" motivo "valorCompra" valor-compra }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get13
  "{{{cartao_com_compra_contestada_resource_listar}}}
  {{{cartao_com_compra_contestada_resource_listar_notes}}}"
  ([] (listar-using-get13 nil))
  ([optional-params]
   (:data (listar-using-get13-with-http-info optional-params))))

(defn transacao-using-get-with-http-info
  "{{{compra_contestada_transacoes_resource_listar}}}
  {{{compra_contestada_transacoes_resource_listar_notes}}}"
  ([id-cartao ] (transacao-using-get-with-http-info id-cartao nil))
  ([id-cartao {:keys [sort page limit aging-contestacao nome bandeira cartao cpf conta status-cartao status-contestacao data-contestacao data-alteracao data-reapresentacao dias-contestacao dias-compra modo-entrada motivo valor-compra ]}]
   (call-api "/api/cartoes-com-contestacoes/{idCartao}/transacoes" :get
             {:path-params   {"idCartao" id-cartao }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "agingContestacao" aging-contestacao "nome" nome "bandeira" bandeira "cartao" cartao "cpf" cpf "conta" conta "statusCartao" status-cartao "statusContestacao" status-contestacao "dataContestacao" data-contestacao "dataAlteracao" data-alteracao "dataReapresentacao" data-reapresentacao "diasContestacao" dias-contestacao "diasCompra" dias-compra "modoEntrada" modo-entrada "motivo" motivo "valorCompra" valor-compra }
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
