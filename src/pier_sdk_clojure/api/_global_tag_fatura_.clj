(ns pier-sdk-clojure.api.-global-tag-fatura-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-fatura-using-get1-with-http-info
  "{{{fatura_resource_consultar_fatura}}}
  {{{fatura_resource_consultar_fatura_notes}}}"
  [data-vencimento id-conta ]
  (call-api "/api/faturas/{dataVencimento}" :get
            {:path-params   {"dataVencimento" data-vencimento }
             :header-params {}
             :query-params  {"idConta" id-conta }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-fatura-using-get1
  "{{{fatura_resource_consultar_fatura}}}
  {{{fatura_resource_consultar_fatura_notes}}}"
  [data-vencimento id-conta ]
  (:data (consultar-fatura-using-get1-with-http-info data-vencimento id-conta)))

(defn consultar-lancamentos-futuros-fatura-using-get1-with-http-info
  "{{{fatura_conta_resource_consultar_lancamentos_futuros_fatura}}}
  {{{fatura_conta_resource_consultar_lancamentos_futuros_fatura_notes}}}"
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
  "{{{fatura_conta_resource_consultar_lancamentos_futuros_fatura}}}
  {{{fatura_conta_resource_consultar_lancamentos_futuros_fatura_notes}}}"
  ([id data-vencimento-padrao ] (consultar-lancamentos-futuros-fatura-using-get1 id data-vencimento-padrao nil))
  ([id data-vencimento-padrao optional-params]
   (:data (consultar-lancamentos-futuros-fatura-using-get1-with-http-info id data-vencimento-padrao optional-params))))

(defn enviar-fatura-email-using-post-with-http-info
  "{{{fatura_conta_resource_enviar_fatura_email}}}
  {{{fatura_conta_resource_enviar_fatura_email_notes}}}"
  ([id data-vencimento ] (enviar-fatura-email-using-post-with-http-info id data-vencimento nil))
  ([id data-vencimento {:keys [email ]}]
   (call-api "/api/contas/{id}/faturas/{dataVencimento}/enviar-email" :post
             {:path-params   {"id" id "dataVencimento" data-vencimento }
              :header-params {}
              :query-params  {"email" email }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn enviar-fatura-email-using-post
  "{{{fatura_conta_resource_enviar_fatura_email}}}
  {{{fatura_conta_resource_enviar_fatura_email_notes}}}"
  ([id data-vencimento ] (enviar-fatura-email-using-post id data-vencimento nil))
  ([id data-vencimento optional-params]
   (:data (enviar-fatura-email-using-post-with-http-info id data-vencimento optional-params))))

(defn listar-faturas-using-get1-with-http-info
  "{{{fatura_resource_listar_faturas}}}
  {{{fatura_resource_listar_faturas_notes}}}"
  ([id-conta ] (listar-faturas-using-get1-with-http-info id-conta nil))
  ([id-conta {:keys [situacao-processamento sort page limit ]}]
   (call-api "/api/faturas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "situacaoProcessamento" situacao-processamento "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-faturas-using-get1
  "{{{fatura_resource_listar_faturas}}}
  {{{fatura_resource_listar_faturas_notes}}}"
  ([id-conta ] (listar-faturas-using-get1 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-faturas-using-get1-with-http-info id-conta optional-params))))

(defn visualizar-documento-using-get-with-http-info
  "{{{fatura_conta_resource_visualizar_documento}}}
  {{{fatura_conta_resource_visualizar_documento_notes}}}"
  ([id data-vencimento ] (visualizar-documento-using-get-with-http-info id data-vencimento nil))
  ([id data-vencimento {:keys [flag-apenas-demostrativo flag-registra-boleto ]}]
   (call-api "/api/contas/{id}/faturas/{dataVencimento}/arquivo.pdf" :get
             {:path-params   {"id" id "dataVencimento" data-vencimento }
              :header-params {}
              :query-params  {"flagApenasDemostrativo" flag-apenas-demostrativo "flagRegistraBoleto" flag-registra-boleto }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/pdf"]
              :auth-names    []})))

(defn visualizar-documento-using-get
  "{{{fatura_conta_resource_visualizar_documento}}}
  {{{fatura_conta_resource_visualizar_documento_notes}}}"
  ([id data-vencimento ] (visualizar-documento-using-get id data-vencimento nil))
  ([id data-vencimento optional-params]
   (:data (visualizar-documento-using-get-with-http-info id data-vencimento optional-params))))
