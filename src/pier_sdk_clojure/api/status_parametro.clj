(ns pier-sdk-clojure.api.status-parametro
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-estagio-cartao-using-get-with-http-info
  "Apresenta os dados de um determinado Estagio Cartão
  Este método permite consultar os parâmetros de um determinado Estágio de Entrega do Cartão a partir do seu código de identificação (id)."
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
  "Apresenta os dados de um determinado Estagio Cartão
  Este método permite consultar os parâmetros de um determinado Estágio de Entrega do Cartão a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-estagio-cartao-using-get-with-http-info id)))

(defn consultar-status-cartao-using-get-with-http-info
  "Apresenta os dados de um determinado Status Cartão
  Este método permite consultar os parâmetros de um determinado Status de Cartão a partir do seu código de identificação (id)."
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
  "Apresenta os dados de um determinado Status Cartão
  Este método permite consultar os parâmetros de um determinado Status de Cartão a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-status-cartao-using-get-with-http-info id)))

(defn consultar-using-get28-with-http-info
  "Apresenta os dados de um determinado Status Conta
  Este método permite consultar os parâmetros de um determinado Status Conta a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/status-contas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get28
  "Apresenta os dados de um determinado Status Conta
  Este método permite consultar os parâmetros de um determinado Status Conta a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get28-with-http-info id)))

(defn consultar-using-get29-with-http-info
  "Apresenta os dados de um determinado Status Impressão
  Este método permite consultar os parâmetros de um determinado Status de Impressão do Cartão a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/status-impressoes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get29
  "Apresenta os dados de um determinado Status Impressão
  Este método permite consultar os parâmetros de um determinado Status de Impressão do Cartão a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get29-with-http-info id)))

(defn listar-estagios-cartoes-using-get-with-http-info
  "Lista as opções de Estágios do Cartão
  Este método permite que sejam listadas as opções de Estágio de Entrega que podem ser atribuídas aos Cartões."
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
  "Lista as opções de Estágios do Cartão
  Este método permite que sejam listadas as opções de Estágio de Entrega que podem ser atribuídas aos Cartões."
  ([] (listar-estagios-cartoes-using-get nil))
  ([optional-params]
   (:data (listar-estagios-cartoes-using-get-with-http-info optional-params))))

(defn listar-status-cartoes-using-get-with-http-info
  "Lista as opções de Status do Cartão
  Este método permite que sejam listadas as possibilidades de Status que podem ser atribuídas aos Cartões."
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
  "Lista as opções de Status do Cartão
  Este método permite que sejam listadas as possibilidades de Status que podem ser atribuídas aos Cartões."
  ([] (listar-status-cartoes-using-get nil))
  ([optional-params]
   (:data (listar-status-cartoes-using-get-with-http-info optional-params))))

(defn listar-tipos-eventos-transacoes-using-get-with-http-info
  "Lista os tipos de transações
  Esse recurso permite listar os tipos de transações disponíveis."
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
  "Lista os tipos de transações
  Esse recurso permite listar os tipos de transações disponíveis."
  []
  (:data (listar-tipos-eventos-transacoes-using-get-with-http-info)))

(defn listar-using-get38-with-http-info
  "Lista os Status Contas cadastrados para o Emissor
  Este método permite que sejam listados os Status Contas existentes na base de dados do Emissor."
  ([] (listar-using-get38-with-http-info nil))
  ([{:keys [sort page limit id nome permite-alterar-vencimento permite-alterar-limite permite-emitir-nova-via-cartao permite-fazer-transferencia permite-receber-transferencia permite-criar-acordo-cobranca permite-atribuir-como-bloqueio permite-desbloquear permite-atribuir-como-cancelamento ]}]
   (call-api "/api/status-contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "permiteAlterarVencimento" permite-alterar-vencimento "permiteAlterarLimite" permite-alterar-limite "permiteEmitirNovaViaCartao" permite-emitir-nova-via-cartao "permiteFazerTransferencia" permite-fazer-transferencia "permiteReceberTransferencia" permite-receber-transferencia "permiteCriarAcordoCobranca" permite-criar-acordo-cobranca "permiteAtribuirComoBloqueio" permite-atribuir-como-bloqueio "permiteDesbloquear" permite-desbloquear "permiteAtribuirComoCancelamento" permite-atribuir-como-cancelamento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get38
  "Lista os Status Contas cadastrados para o Emissor
  Este método permite que sejam listados os Status Contas existentes na base de dados do Emissor."
  ([] (listar-using-get38 nil))
  ([optional-params]
   (:data (listar-using-get38-with-http-info optional-params))))

(defn listar-using-get39-with-http-info
  "Lista as opções de Status Impressão
  Este método permite que sejam listadas as opções de Status Impressão que podem ser atribuídas aos Cartões."
  ([] (listar-using-get39-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/status-impressoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get39
  "Lista as opções de Status Impressão
  Este método permite que sejam listadas as opções de Status Impressão que podem ser atribuídas aos Cartões."
  ([] (listar-using-get39 nil))
  ([optional-params]
   (:data (listar-using-get39-with-http-info optional-params))))
