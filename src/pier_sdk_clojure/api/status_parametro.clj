(ns pier-sdk-clojure.api.status-parametro
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-estagio-cartao-using-get-with-http-info
  "Apresenta os dados de um determinado Estagio CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado EstÃ¡gio de Entrega do CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
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
  "Apresenta os dados de um determinado Estagio CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado EstÃ¡gio de Entrega do CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-estagio-cartao-using-get-with-http-info id)))

(defn consultar-status-cartao-using-get-with-http-info
  "Apresenta os dados de um determinado Status CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
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
  "Apresenta os dados de um determinado Status CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-status-cartao-using-get-with-http-info id)))

(defn consultar-using-get23-with-http-info
  "Apresenta os dados de um determinado Status Conta
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status Conta a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/status-contas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get23
  "Apresenta os dados de um determinado Status Conta
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status Conta a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get23-with-http-info id)))

(defn consultar-using-get24-with-http-info
  "Apresenta os dados de um determinado Status ImpressÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de ImpressÃ£o do CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/status-impressoes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get24
  "Apresenta os dados de um determinado Status ImpressÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de ImpressÃ£o do CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get24-with-http-info id)))

(defn listar-estagios-cartoes-using-get-with-http-info
  "Lista as opÃ§Ãµes de EstÃ¡gios do CartÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de EstÃ¡gio de Entrega que podem ser atribuÃ­das aos CartÃµes."
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
  "Lista as opÃ§Ãµes de EstÃ¡gios do CartÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de EstÃ¡gio de Entrega que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-estagios-cartoes-using-get nil))
  ([optional-params]
   (:data (listar-estagios-cartoes-using-get-with-http-info optional-params))))

(defn listar-status-cartoes-using-get-with-http-info
  "Lista as opÃ§Ãµes de Status do CartÃ£o
  Este mÃ©todo permite que sejam listadas as possibilidades de Status que podem ser atribuÃ­das aos CartÃµes."
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
  "Lista as opÃ§Ãµes de Status do CartÃ£o
  Este mÃ©todo permite que sejam listadas as possibilidades de Status que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-status-cartoes-using-get nil))
  ([optional-params]
   (:data (listar-status-cartoes-using-get-with-http-info optional-params))))

(defn listar-tipos-eventos-transacoes-using-get-with-http-info
  "Lista os tipos de transaÃ§Ãµes
  Esse recurso permite listar os tipos de transaÃ§Ãµes disponÃ­veis."
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
  "Lista os tipos de transaÃ§Ãµes
  Esse recurso permite listar os tipos de transaÃ§Ãµes disponÃ­veis."
  []
  (:data (listar-tipos-eventos-transacoes-using-get-with-http-info)))

(defn listar-using-get30-with-http-info
  "Lista os Status Contas cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Status Contas existentes na base de dados do Emissor."
  ([] (listar-using-get30-with-http-info nil))
  ([{:keys [sort page limit id nome permite-alterar-vencimento permite-alterar-limite permite-emitir-nova-via-cartao permite-fazer-transferencia permite-receber-transferencia permite-criar-acordo-cobranca permite-atribuir-como-bloqueio permite-desbloquear permite-atribuir-como-cancelamento ]}]
   (call-api "/api/status-contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "permiteAlterarVencimento" permite-alterar-vencimento "permiteAlterarLimite" permite-alterar-limite "permiteEmitirNovaViaCartao" permite-emitir-nova-via-cartao "permiteFazerTransferencia" permite-fazer-transferencia "permiteReceberTransferencia" permite-receber-transferencia "permiteCriarAcordoCobranca" permite-criar-acordo-cobranca "permiteAtribuirComoBloqueio" permite-atribuir-como-bloqueio "permiteDesbloquear" permite-desbloquear "permiteAtribuirComoCancelamento" permite-atribuir-como-cancelamento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get30
  "Lista os Status Contas cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Status Contas existentes na base de dados do Emissor."
  ([] (listar-using-get30 nil))
  ([optional-params]
   (:data (listar-using-get30-with-http-info optional-params))))

(defn listar-using-get31-with-http-info
  "Lista as opÃ§Ãµes de Status ImpressÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de Status ImpressÃ£o que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-using-get31-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/status-impressoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get31
  "Lista as opÃ§Ãµes de Status ImpressÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de Status ImpressÃ£o que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-using-get31 nil))
  ([optional-params]
   (:data (listar-using-get31-with-http-info optional-params))))
