(ns pier-sdk-clojure.api.servicos-conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ativar-anuidade-using-post-with-http-info
  "Atribuir Anuidade
  Esse recurso permite configurar qual a regra de Anuidade que serÃ¡ atribuÃ­da a uma determinada Conta."
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
  "Atribuir Anuidade
  Esse recurso permite configurar qual a regra de Anuidade que serÃ¡ atribuÃ­da a uma determinada Conta."
  ([id id-anuidade ] (ativar-anuidade-using-post id id-anuidade nil))
  ([id id-anuidade optional-params]
   (:data (ativar-anuidade-using-post-with-http-info id id-anuidade optional-params))))

(defn ativar-envio-fatura-email-using-post-with-http-info
  "Ativa o serviÃ§o de envio de fatura por email
  Este recurso ativa o serviÃ§o de envio de fatura por email"
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
  "Ativa o serviÃ§o de envio de fatura por email
  Este recurso ativa o serviÃ§o de envio de fatura por email"
  [id ]
  (:data (ativar-envio-fatura-email-using-post-with-http-info id)))

(defn desativar-envio-fatura-email-using-post-with-http-info
  "Desativa o serviÃ§o de envio de fatura por email
  Este recurso desativa o serviÃ§o de envio de fatura por email"
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
  "Desativa o serviÃ§o de envio de fatura por email
  Este recurso desativa o serviÃ§o de envio de fatura por email"
  [id ]
  (:data (desativar-envio-fatura-email-using-post-with-http-info id)))

(defn listar-anuidades-using-get-with-http-info
  "Listar Anuidades
  Lista as anuidades"
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
  "Listar Anuidades
  Lista as anuidades"
  ([] (listar-anuidades-using-get nil))
  ([optional-params]
   (:data (listar-anuidades-using-get-with-http-info optional-params))))

(defn listar-operadoras-telefonicas-using-get-with-http-info
  "Listar Operadoras
  Lista as operadoras."
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
  "Listar Operadoras
  Lista as operadoras."
  ([] (listar-operadoras-telefonicas-using-get nil))
  ([optional-params]
   (:data (listar-operadoras-telefonicas-using-get-with-http-info optional-params))))
