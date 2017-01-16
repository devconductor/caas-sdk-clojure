(ns pier-sdk-clojure.api.status-parametros
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
             :auth-names    ["access_token"]}))

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
             :auth-names    ["access_token"]}))

(defn consultar-status-cartao-using-get
  "Apresenta os dados de um determinado Status CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-status-cartao-using-get-with-http-info id)))

(defn consultar-using-get4-with-http-info
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
             :auth-names    ["access_token"]}))

(defn consultar-using-get4
  "Apresenta os dados de um determinado Status Conta
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status Conta a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get4-with-http-info id)))

(defn consultar-using-get5-with-http-info
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
             :auth-names    ["access_token"]}))

(defn consultar-using-get5
  "Apresenta os dados de um determinado Status ImpressÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de ImpressÃ£o do CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get5-with-http-info id)))

(defn listar-estagios-cartoes-using-get-with-http-info
  "Lista as opÃ§Ãµes de EstÃ¡gios do CartÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de EstÃ¡gio de Entrega que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-estagios-cartoes-using-get-with-http-info nil))
  ([{:keys [page limit id nome ]}]
   (call-api "/api/estagios-cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

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
  ([{:keys [page limit id nome flag-cancela-cartao flag-cancela-no-desbloqueio id-status-destino-desbloqueio id-status-destino-conta flag-cobra-tarifa ]}]
   (call-api "/api/status-cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome "flagCancelaCartao" flag-cancela-cartao "flagCancelaNoDesbloqueio" flag-cancela-no-desbloqueio "idStatusDestinoDesbloqueio" id-status-destino-desbloqueio "idStatusDestinoConta" id-status-destino-conta "flagCobraTarifa" flag-cobra-tarifa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-status-cartoes-using-get
  "Lista as opÃ§Ãµes de Status do CartÃ£o
  Este mÃ©todo permite que sejam listadas as possibilidades de Status que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-status-cartoes-using-get nil))
  ([optional-params]
   (:data (listar-status-cartoes-using-get-with-http-info optional-params))))

(defn listar-using-get5-with-http-info
  "Lista os Status Contas cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Status Contas existentes na base de dados do Emissor."
  ([] (listar-using-get5-with-http-info nil))
  ([{:keys [page limit id nome flag-altera-limite mensagem-consulta-negada ]}]
   (call-api "/api/status-contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome "flagAlteraLimite" flag-altera-limite "mensagemConsultaNegada" mensagem-consulta-negada }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get5
  "Lista os Status Contas cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Status Contas existentes na base de dados do Emissor."
  ([] (listar-using-get5 nil))
  ([optional-params]
   (:data (listar-using-get5-with-http-info optional-params))))

(defn listar-using-get6-with-http-info
  "Lista as opÃ§Ãµes de Status ImpressÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de Status ImpressÃ£o que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-using-get6-with-http-info nil))
  ([{:keys [page limit id nome ]}]
   (call-api "/api/status-impressoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get6
  "Lista as opÃ§Ãµes de Status ImpressÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de Status ImpressÃ£o que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-using-get6 nil))
  ([optional-params]
   (:data (listar-using-get6-with-http-info optional-params))))
