(ns pier-sdk-clojure.api.-global-tag-pay-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-chave-using-post-with-http-info
  "{{{cartao_pay_resource_atualizar_chave}}}
  {{{cartao_pay_resource_atualizar_chave_notes}}}"
  [device-id id ]
  (call-api "/api/cartoes-tokenizados/{id}/atualizar-chave" :post
            {:path-params   {"id" id }
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-chave-using-post
  "{{{cartao_pay_resource_atualizar_chave}}}
  {{{cartao_pay_resource_atualizar_chave_notes}}}"
  [device-id id ]
  (:data (atualizar-chave-using-post-with-http-info device-id id)))

(defn atualizar-using-put-with-http-info
  "{{{cartao_pay_resource_atualizar}}}
  {{{cartao_pay_resource_atualizar_notes}}}"
  [device-id id update ]
  (call-api "/api/cartoes-tokenizados/{id}" :put
            {:path-params   {"id" id }
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put
  "{{{cartao_pay_resource_atualizar}}}
  {{{cartao_pay_resource_atualizar_notes}}}"
  [device-id id update ]
  (:data (atualizar-using-put-with-http-info device-id id update)))

(defn confirma-atualizacao-chave-using-post-with-http-info
  "{{{cartao_pay_resource_confirma_atualizacao_chave}}}
  {{{cartao_pay_resource_confirma_atualizacao_chave_notes}}}"
  [device-id id update ]
  (call-api "/api/cartoes-tokenizados/{id}/confirmar-chave" :post
            {:path-params   {"id" id }
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn confirma-atualizacao-chave-using-post
  "{{{cartao_pay_resource_confirma_atualizacao_chave}}}
  {{{cartao_pay_resource_confirma_atualizacao_chave_notes}}}"
  [device-id id update ]
  (:data (confirma-atualizacao-chave-using-post-with-http-info device-id id update)))

(defn consultar-using-get9-with-http-info
  "{{{cartao_pay_resource_consultar}}}
  {{{cartao_pay_resource_consultar_notes}}}"
  [device-id id ]
  (call-api "/api/cartoes-tokenizados/{id}" :get
            {:path-params   {"id" id }
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get9
  "{{{cartao_pay_resource_consultar}}}
  {{{cartao_pay_resource_consultar_notes}}}"
  [device-id id ]
  (:data (consultar-using-get9-with-http-info device-id id)))

(defn listar-codigos-resposta-using-get-with-http-info
  "{{{enum_pay_resource_listar_codigos_resposta}}}
  {{{enum_pay_resource_listar_codigos_resposta_notes}}}"
  []
  (call-api "/api/codigos-resposta" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-codigos-resposta-using-get
  "{{{enum_pay_resource_listar_codigos_resposta}}}
  {{{enum_pay_resource_listar_codigos_resposta_notes}}}"
  []
  (:data (listar-codigos-resposta-using-get-with-http-info)))

(defn listar-modos-entrada-using-get-with-http-info
  "{{{enum_pay_resource_listar_modos_entrada}}}
  {{{enum_pay_resource_listar_modos_entrada_notes}}}"
  []
  (call-api "/api/modos-entrada" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-modos-entrada-using-get
  "{{{enum_pay_resource_listar_modos_entrada}}}
  {{{enum_pay_resource_listar_modos_entrada_notes}}}"
  []
  (:data (listar-modos-entrada-using-get-with-http-info)))

(defn listar-operacoes-using-get-with-http-info
  "{{{enum_pay_resource_listar_operacoes}}}
  {{{enum_pay_resource_listar_operacoes_notes}}}"
  []
  (call-api "/api/operacoes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-operacoes-using-get
  "{{{enum_pay_resource_listar_operacoes}}}
  {{{enum_pay_resource_listar_operacoes_notes}}}"
  []
  (:data (listar-operacoes-using-get-with-http-info)))

(defn listar-tipos-terminais-using-get-with-http-info
  "{{{enum_pay_resource_listar_tipos_terminais}}}
  {{{enum_pay_resource_listar_tipos_terminais_notes}}}"
  []
  (call-api "/api/tipos-terminais" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-tipos-terminais-using-get
  "{{{enum_pay_resource_listar_tipos_terminais}}}
  {{{enum_pay_resource_listar_tipos_terminais_notes}}}"
  []
  (:data (listar-tipos-terminais-using-get-with-http-info)))

(defn listar-tipos-transacoes-using-get-with-http-info
  "{{{enum_pay_resource_listar_tipos_transacoes}}}
  {{{enum_pay_resource_listar_tipos_transacoes_notes}}}"
  []
  (call-api "/api/tipos-transacoes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-tipos-transacoes-using-get
  "{{{enum_pay_resource_listar_tipos_transacoes}}}
  {{{enum_pay_resource_listar_tipos_transacoes_notes}}}"
  []
  (:data (listar-tipos-transacoes-using-get-with-http-info)))

(defn listar-using-get10-with-http-info
  "{{{cartao_pay_resource_listar}}}
  {{{cartao_pay_resource_listar_notes}}}"
  ([] (listar-using-get10-with-http-info nil))
  ([{:keys [device-id sort page limit status numero-cartao ]}]
   (call-api "/api/cartoes-tokenizados" :get
             {:path-params   {}
              :header-params {"device_id" device-id }
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "status" status "numeroCartao" numero-cartao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get10
  "{{{cartao_pay_resource_listar}}}
  {{{cartao_pay_resource_listar_notes}}}"
  ([] (listar-using-get10 nil))
  ([optional-params]
   (:data (listar-using-get10-with-http-info optional-params))))

(defn salvar-using-post5-with-http-info
  "{{{cartao_pay_resource_salvar}}}
  {{{cartao_pay_resource_salvar_notes}}}"
  [device-id persist ]
  (call-api "/api/cartoes-tokenizados" :post
            {:path-params   {}
             :header-params {"device_id" device-id }
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post5
  "{{{cartao_pay_resource_salvar}}}
  {{{cartao_pay_resource_salvar_notes}}}"
  [device-id persist ]
  (:data (salvar-using-post5-with-http-info device-id persist)))
