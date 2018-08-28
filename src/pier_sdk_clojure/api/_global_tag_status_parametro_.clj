(ns pier-sdk-clojure.api.-global-tag-status-parametro-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-estagio-cartao-using-get-with-http-info
  "{{{estagio_cartao_resource_consultar_estagio_cartao}}}
  {{{estagio_cartao_resource_consultar_estagio_cartao_notes}}}"
  [id ]
  (call-api "/api/estagios-cartoes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-estagio-cartao-using-get
  "{{{estagio_cartao_resource_consultar_estagio_cartao}}}
  {{{estagio_cartao_resource_consultar_estagio_cartao_notes}}}"
  [id ]
  (:data (consultar-estagio-cartao-using-get-with-http-info id)))

(defn consultar-status-cartao-using-get-with-http-info
  "{{{status_cartao_resource_consultar_status_cartao}}}
  {{{status_cartao_resource_consultar_status_cartao_notes}}}"
  [id ]
  (call-api "/api/status-cartoes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-status-cartao-using-get
  "{{{status_cartao_resource_consultar_status_cartao}}}
  {{{status_cartao_resource_consultar_status_cartao_notes}}}"
  [id ]
  (:data (consultar-status-cartao-using-get-with-http-info id)))

(defn consultar-using-get38-with-http-info
  "{{{status_conta_resource_consultar}}}
  {{{status_conta_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/status-contas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get38
  "{{{status_conta_resource_consultar}}}
  {{{status_conta_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get38-with-http-info id)))

(defn consultar-using-get39-with-http-info
  "{{{status_impressao_resource_consultar}}}
  {{{status_impressao_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/status-impressoes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get39
  "{{{status_impressao_resource_consultar}}}
  {{{status_impressao_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get39-with-http-info id)))

(defn listar-estagios-cartoes-using-get-with-http-info
  "{{{estagio_cartao_resource_listar_estagios_cartoes}}}
  {{{estagio_cartao_resource_listar_estagios_cartoes_notes}}}"
  ([] (listar-estagios-cartoes-using-get-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/estagios-cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-estagios-cartoes-using-get
  "{{{estagio_cartao_resource_listar_estagios_cartoes}}}
  {{{estagio_cartao_resource_listar_estagios_cartoes_notes}}}"
  ([] (listar-estagios-cartoes-using-get nil))
  ([optional-params]
   (:data (listar-estagios-cartoes-using-get-with-http-info optional-params))))

(defn listar-status-cartoes-using-get-with-http-info
  "{{{status_cartao_resource_listar_status_cartoes}}}
  {{{status_cartao_resource_listar_status_cartoes_notes}}}"
  ([] (listar-status-cartoes-using-get-with-http-info nil))
  ([{:keys [sort page limit id nome permite-desbloquear permite-atribuir-como-bloqueio permite-atribuir-como-cancelamento cobrar-tarifa-ao-emitir-nova-via ]}]
   (call-api "/api/status-cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "permiteDesbloquear" permite-desbloquear "permiteAtribuirComoBloqueio" permite-atribuir-como-bloqueio "permiteAtribuirComoCancelamento" permite-atribuir-como-cancelamento "cobrarTarifaAoEmitirNovaVia" cobrar-tarifa-ao-emitir-nova-via }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-status-cartoes-using-get
  "{{{status_cartao_resource_listar_status_cartoes}}}
  {{{status_cartao_resource_listar_status_cartoes_notes}}}"
  ([] (listar-status-cartoes-using-get nil))
  ([optional-params]
   (:data (listar-status-cartoes-using-get-with-http-info optional-params))))

(defn listar-tipos-eventos-transacoes-using-get-with-http-info
  "{{{enum_resource_listar_tipos_eventos_transacoes}}}
  {{{enum_resource_listar_tipos_eventos_transacoes_notes}}}"
  []
  (call-api "/api/tipos-eventos-transacoes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-tipos-eventos-transacoes-using-get
  "{{{enum_resource_listar_tipos_eventos_transacoes}}}
  {{{enum_resource_listar_tipos_eventos_transacoes_notes}}}"
  []
  (:data (listar-tipos-eventos-transacoes-using-get-with-http-info)))

(defn listar-using-get49-with-http-info
  "{{{status_conta_resource_listar}}}
  {{{status_conta_resource_listar_notes}}}"
  ([] (listar-using-get49-with-http-info nil))
  ([{:keys [sort page limit id nome permite-alterar-vencimento permite-alterar-limite permite-emitir-nova-via-cartao permite-fazer-transferencia permite-receber-transferencia permite-criar-acordo-cobranca permite-atribuir-como-bloqueio permite-desbloquear permite-atribuir-como-cancelamento ]}]
   (call-api "/api/status-contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "permiteAlterarVencimento" permite-alterar-vencimento "permiteAlterarLimite" permite-alterar-limite "permiteEmitirNovaViaCartao" permite-emitir-nova-via-cartao "permiteFazerTransferencia" permite-fazer-transferencia "permiteReceberTransferencia" permite-receber-transferencia "permiteCriarAcordoCobranca" permite-criar-acordo-cobranca "permiteAtribuirComoBloqueio" permite-atribuir-como-bloqueio "permiteDesbloquear" permite-desbloquear "permiteAtribuirComoCancelamento" permite-atribuir-como-cancelamento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get49
  "{{{status_conta_resource_listar}}}
  {{{status_conta_resource_listar_notes}}}"
  ([] (listar-using-get49 nil))
  ([optional-params]
   (:data (listar-using-get49-with-http-info optional-params))))

(defn listar-using-get50-with-http-info
  "{{{status_impressao_resource_listar}}}
  {{{status_impressao_resource_listar_notes}}}"
  ([] (listar-using-get50-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/status-impressoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get50
  "{{{status_impressao_resource_listar}}}
  {{{status_impressao_resource_listar_notes}}}"
  ([] (listar-using-get50 nil))
  ([optional-params]
   (:data (listar-using-get50-with-http-info optional-params))))
