(ns pier-sdk-clojure.api.-global-tag-debitorecorrente-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn aderir-debito-recorrente-using-post-with-http-info
  "{{{conta_debito_recorrente_resource_aderir}}}
  {{{conta_debito_recorrente_resource_aderir_notes}}}"
  [conta-debito-recorrente-persist ]
  (call-api "/api/debitos-recorrentes" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    conta-debito-recorrente-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn aderir-debito-recorrente-using-post
  "{{{conta_debito_recorrente_resource_aderir}}}
  {{{conta_debito_recorrente_resource_aderir_notes}}}"
  [conta-debito-recorrente-persist ]
  (:data (aderir-debito-recorrente-using-post-with-http-info conta-debito-recorrente-persist)))

(defn cancelar-debito-recorrente-using-post-with-http-info
  "{{{conta_debito_recorrente_resource_cancelar}}}
  {{{conta_debito_recorrente_resource_cancelar_notes}}}"
  [id conta-debito-recorrente-persist ]
  (call-api "/api/debitos-recorrentes/{id}/cancelar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    conta-debito-recorrente-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cancelar-debito-recorrente-using-post
  "{{{conta_debito_recorrente_resource_cancelar}}}
  {{{conta_debito_recorrente_resource_cancelar_notes}}}"
  [id conta-debito-recorrente-persist ]
  (:data (cancelar-debito-recorrente-using-post-with-http-info id conta-debito-recorrente-persist)))

(defn listar-using-get17-with-http-info
  "{{{conta_debito_recorrente_resource_listar}}}
  {{{conta_debito_recorrente_resource_listar_notes}}}"
  ([id-conta ] (listar-using-get17-with-http-info id-conta nil))
  ([id-conta {:keys [id-tipo-debito-recorrente sort page limit data-hora-inicio data-hora-fim ativo data-hora-ultimo-pagamento ]}]
   (call-api "/api/debitos-recorrentes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "idTipoDebitoRecorrente" id-tipo-debito-recorrente "sort" (with-collection-format sort :multi) "page" page "limit" limit "dataHoraInicio" data-hora-inicio "dataHoraFim" data-hora-fim "ativo" ativo "dataHoraUltimoPagamento" data-hora-ultimo-pagamento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get17
  "{{{conta_debito_recorrente_resource_listar}}}
  {{{conta_debito_recorrente_resource_listar_notes}}}"
  ([id-conta ] (listar-using-get17 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-using-get17-with-http-info id-conta optional-params))))

(defn listar-using-get53-with-http-info
  "{{{tipo_debito_recorrente_resource_listar}}}
  {{{tipo_debito_recorrente_resource_listar_notes}}}"
  ([] (listar-using-get53-with-http-info nil))
  ([{:keys [sort page limit id descricao valor flag-ativo ]}]
   (call-api "/api/tipos-debitos-recorrentes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao "valor" valor "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get53
  "{{{tipo_debito_recorrente_resource_listar}}}
  {{{tipo_debito_recorrente_resource_listar_notes}}}"
  ([] (listar-using-get53 nil))
  ([optional-params]
   (:data (listar-using-get53-with-http-info optional-params))))
