(ns pier-sdk-clojure.api.-global-tag-boleto-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get36-with-http-info
  "{{{boleto_resource_consultar}}}
  {{{boleto_resource_consultar_notes}}}"
  ([id ] (consultar-using-get36-with-http-info id nil))
  ([id {:keys [zera-valor-codigo-barras ]}]
   (call-api "/api/boletos/{id}" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"zeraValorCodigoBarras" zera-valor-codigo-barras }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get36
  "{{{boleto_resource_consultar}}}
  {{{boleto_resource_consultar_notes}}}"
  ([id ] (consultar-using-get36 id nil))
  ([id optional-params]
   (:data (consultar-using-get36-with-http-info id optional-params))))

(defn enviar-boleto-email-using-post-with-http-info
  "{{{boleto_resource_enviar_boleto_email}}}
  {{{boleto_resource_enviar_boleto_email_notes}}}"
  [id request ]
  (call-api "/api/boletos/{id}/enviar-email" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn enviar-boleto-email-using-post
  "{{{boleto_resource_enviar_boleto_email}}}
  {{{boleto_resource_enviar_boleto_email_notes}}}"
  [id request ]
  (:data (enviar-boleto-email-using-post-with-http-info id request)))

(defn gerar-boleto-using-post-with-http-info
  "{{{boleto_resource_gerar_boleto}}}
  {{{boleto_resource_gerar_boleto_notes}}}"
  [boleto-request ]
  (call-api "/api/boletos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    boleto-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-boleto-using-post
  "{{{boleto_resource_gerar_boleto}}}
  {{{boleto_resource_gerar_boleto_notes}}}"
  [boleto-request ]
  (:data (gerar-boleto-using-post-with-http-info boleto-request)))

(defn listar-using-get47-with-http-info
  "{{{boleto_resource_listar}}}
  {{{boleto_resource_listar_notes}}}"
  ([] (listar-using-get47-with-http-info nil))
  ([{:keys [sort page limit id-conta data-vencimento valor-boleto id-tipo-boleto ]}]
   (call-api "/api/boletos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "dataVencimento" data-vencimento "valorBoleto" valor-boleto "idTipoBoleto" id-tipo-boleto }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get47
  "{{{boleto_resource_listar}}}
  {{{boleto_resource_listar_notes}}}"
  ([] (listar-using-get47 nil))
  ([optional-params]
   (:data (listar-using-get47-with-http-info optional-params))))

(defn registrar-boleto-using-post-with-http-info
  "{{{registro_cobranca_resource_registrar_boleto}}}
  {{{registro_cobranca_resource_registrar_boleto_notes}}}"
  [id ]
  (call-api "/api/boletos/{id}/registrar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn registrar-boleto-using-post
  "{{{registro_cobranca_resource_registrar_boleto}}}
  {{{registro_cobranca_resource_registrar_boleto_notes}}}"
  [id ]
  (:data (registrar-boleto-using-post-with-http-info id)))

(defn visualizar-boleto-using-get-with-http-info
  "{{{boleto_resource_visualizar_boleto}}}
  {{{boleto_resource_visualizar_boleto_notes}}}"
  [id ]
  (call-api "/api/boletos/{id}/arquivo.pdf" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/pdf"]
             :auth-names    []}))

(defn visualizar-boleto-using-get
  "{{{boleto_resource_visualizar_boleto}}}
  {{{boleto_resource_visualizar_boleto_notes}}}"
  [id ]
  (:data (visualizar-boleto-using-get-with-http-info id)))
