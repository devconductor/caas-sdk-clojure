(ns pier-sdk-clojure.api.cartao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-limite-using-get-with-http-info
  "Apresenta os limites do Portador do CartÃ£o
  Este mÃ©todo permite consultar os Limites configurados para o Portador de um determinado CartÃ£o, seja ele o titular da conta ou um adicional, a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id-cartao ]
  (call-api "/api/cartoes/{id_cartao}/limites" :get
            {:path-params   {"id_cartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-limite-using-get
  "Apresenta os limites do Portador do CartÃ£o
  Este mÃ©todo permite consultar os Limites configurados para o Portador de um determinado CartÃ£o, seja ele o titular da conta ou um adicional, a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id-cartao ]
  (:data (consultar-limite-using-get-with-http-info id-cartao)))

(defn consultar-portador-using-get-with-http-info
  "Apresenta os dados do Portador do CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes do Portador de um determinado CartÃ£o a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id-cartao ]
  (call-api "/api/cartoes/{id_cartao}/portadores" :get
            {:path-params   {"id_cartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-portador-using-get
  "Apresenta os dados do Portador do CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes do Portador de um determinado CartÃ£o a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id-cartao ]
  (:data (consultar-portador-using-get-with-http-info id-cartao)))

(defn consultar-saldo-using-get-with-http-info
  "Apresenta os saldos disponÃ­veis para o Portador do CartÃ£o
  Este mÃ©todo permite consultar os saldos disponÃ­veis para uso pelo Portador de um determinado CartÃ£o, seja ele o titular da conta ou um adicional, a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id-cartao ]
  (call-api "/api/cartoes/{id_cartao}/saldos-disponiveis" :get
            {:path-params   {"id_cartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-saldo-using-get
  "Apresenta os saldos disponÃ­veis para o Portador do CartÃ£o
  Este mÃ©todo permite consultar os saldos disponÃ­veis para uso pelo Portador de um determinado CartÃ£o, seja ele o titular da conta ou um adicional, a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id-cartao ]
  (:data (consultar-saldo-using-get-with-http-info id-cartao)))

(defn consultar-using-get-with-http-info
  "Apresenta os dados de um determinado CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes bÃ¡sicas de um determinado CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-cartao ]
  (call-api "/api/cartoes/{id_cartao}" :get
            {:path-params   {"id_cartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get
  "Apresenta os dados de um determinado CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes bÃ¡sicas de um determinado CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-cartao ]
  (:data (consultar-using-get-with-http-info id-cartao)))

(defn debloquear-using-get-with-http-info
  "Realiza o desbloqueio de um determinado CartÃ£o
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-cartao ]
  (call-api "/api/cartoes/{id_cartao}/desbloqueio" :get
            {:path-params   {"id_cartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn debloquear-using-get
  "Realiza o desbloqueio de um determinado CartÃ£o
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-cartao ]
  (:data (debloquear-using-get-with-http-info id-cartao)))

(defn listar-using-get-with-http-info
  "Lista os CartÃµes gerados pelo Emissor
  Este mÃ©todo permite que sejam listados os cartÃµes existentes na base do emissor."
  ([] (listar-using-get-with-http-info nil))
  ([{:keys [id id-status-cartao id-estagio-cartao id-conta id-pessoa id-produto tipo-portador numero-cartao nome-impresso data-geracao data-status-cartao data-estagio-cartao data-validade data-impressao arquivo-impressao flag-impressao-origem-comercial flag-provisorio codigo-desbloqueio page limit ]}]
   (call-api "/api/cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idStatusCartao" id-status-cartao "idEstagioCartao" id-estagio-cartao "idConta" id-conta "idPessoa" id-pessoa "idProduto" id-produto "tipoPortador" tipo-portador "numeroCartao" numero-cartao "nomeImpresso" nome-impresso "dataGeracao" data-geracao "dataStatusCartao" data-status-cartao "dataEstagioCartao" data-estagio-cartao "dataValidade" data-validade "dataImpressao" data-impressao "arquivoImpressao" arquivo-impressao "flagImpressaoOrigemComercial" flag-impressao-origem-comercial "flagProvisorio" flag-provisorio "codigoDesbloqueio" codigo-desbloqueio "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get
  "Lista os CartÃµes gerados pelo Emissor
  Este mÃ©todo permite que sejam listados os cartÃµes existentes na base do emissor."
  ([] (listar-using-get nil))
  ([optional-params]
   (:data (listar-using-get-with-http-info optional-params))))
