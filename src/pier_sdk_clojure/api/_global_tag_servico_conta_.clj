(ns pier-sdk-clojure.api.-global-tag-servico-conta-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ativar-anuidade-using-post-with-http-info
  "{{{conta_resource_ativar_anuidade}}}
  {{{conta_resource_ativar_anuidade_notes}}}"
  ([id id-anuidade ] (ativar-anuidade-using-post-with-http-info id id-anuidade nil))
  ([id id-anuidade {:keys [sort page limit ddd celular id-operadora id-origem-comercial ]}]
   (call-api "/api/contas/{id}/atribuir-anuidade" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idAnuidade" id-anuidade "DDD" ddd "celular" celular "idOperadora" id-operadora "idOrigemComercial" id-origem-comercial }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn ativar-anuidade-using-post
  "{{{conta_resource_ativar_anuidade}}}
  {{{conta_resource_ativar_anuidade_notes}}}"
  ([id id-anuidade ] (ativar-anuidade-using-post id id-anuidade nil))
  ([id id-anuidade optional-params]
   (:data (ativar-anuidade-using-post-with-http-info id id-anuidade optional-params))))

(defn ativar-envio-fatura-email-using-post-with-http-info
  "{{{conta_resource_ativar_envio_fatura_email}}}
  {{{conta_resource_ativar_envio_fatura_email_notes}}}"
  [id ]
  (call-api "/api/contas/{id}/ativar-fatura-email" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-envio-fatura-email-using-post
  "{{{conta_resource_ativar_envio_fatura_email}}}
  {{{conta_resource_ativar_envio_fatura_email_notes}}}"
  [id ]
  (:data (ativar-envio-fatura-email-using-post-with-http-info id)))

(defn desativar-envio-fatura-email-using-post-with-http-info
  "{{{conta_resource_desativar_envio_fatura_email}}}
  {{{conta_resource_desativar_envio_fatura_email_notes}}}"
  [id ]
  (call-api "/api/contas/{id}/desativar-fatura-email" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-envio-fatura-email-using-post
  "{{{conta_resource_desativar_envio_fatura_email}}}
  {{{conta_resource_desativar_envio_fatura_email_notes}}}"
  [id ]
  (:data (desativar-envio-fatura-email-using-post-with-http-info id)))

(defn listar-anuidades-using-get-with-http-info
  "{{{anuidade_resource_listar_anuidades}}}
  {{{anuidade_resource_listar_anuidades_notes}}}"
  ([] (listar-anuidades-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/anuidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-anuidades-using-get
  "{{{anuidade_resource_listar_anuidades}}}
  {{{anuidade_resource_listar_anuidades_notes}}}"
  ([] (listar-anuidades-using-get nil))
  ([optional-params]
   (:data (listar-anuidades-using-get-with-http-info optional-params))))

(defn listar-operadoras-telefonicas-using-get-with-http-info
  "{{{operadora_resource_listar_operadoras_telefonicas}}}
  {{{operadora_resource_listar_operadoras_telefonicas_notes}}}"
  ([] (listar-operadoras-telefonicas-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/operadoras-telefonicas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-operadoras-telefonicas-using-get
  "{{{operadora_resource_listar_operadoras_telefonicas}}}
  {{{operadora_resource_listar_operadoras_telefonicas_notes}}}"
  ([] (listar-operadoras-telefonicas-using-get nil))
  ([optional-params]
   (:data (listar-operadoras-telefonicas-using-get-with-http-info optional-params))))
