(ns pier-sdk-clojure.api.cartao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-status-impressao-using-put-with-http-info
  "Realiza a alteraÃ§Ã£o do Status de ImpressÃ£o do CartÃ£o
  Este mÃ©todo permite que uma AplicaÃ§Ã£o que realize a impressÃ£o de cartÃµes possa indicar que um determinado idCartao fora impresso ou estÃ¡ em processo de impressÃ£o. Para isso, basta informar o respectivo cÃ³digo de identificaÃ§Ã£o do cartÃ£o (id) que deseja ter seu um determinado id_status_impressao atribuÃ­do a ele. Por padrÃ£o, cartÃµes provisÃ³rios ou que jÃ¡ tenham sido incluÃ­dos em um arquivo para impressÃ£o via grÃ¡fica terÃ£o esta requisiÃ§Ã£o negada, se utilizada."
  [id-cartao id-status-impressao ]
  (call-api "/api/cartoes/{id_cartao}/impressao/{id_status_impressao} " :put
            {:path-params   {"id_cartao" id-cartao "id_status_impressao" id-status-impressao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-status-impressao-using-put
  "Realiza a alteraÃ§Ã£o do Status de ImpressÃ£o do CartÃ£o
  Este mÃ©todo permite que uma AplicaÃ§Ã£o que realize a impressÃ£o de cartÃµes possa indicar que um determinado idCartao fora impresso ou estÃ¡ em processo de impressÃ£o. Para isso, basta informar o respectivo cÃ³digo de identificaÃ§Ã£o do cartÃ£o (id) que deseja ter seu um determinado id_status_impressao atribuÃ­do a ele. Por padrÃ£o, cartÃµes provisÃ³rios ou que jÃ¡ tenham sido incluÃ­dos em um arquivo para impressÃ£o via grÃ¡fica terÃ£o esta requisiÃ§Ã£o negada, se utilizada."
  [id-cartao id-status-impressao ]
  (:data (alterar-status-impressao-using-put-with-http-info id-cartao id-status-impressao)))

(defn bloquear-using-put-with-http-info
  "Realiza o bloqueio de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o do bloqueio (temporÃ¡rio) ou do cancelamento (definitivo) de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id). Para isso, Ã© preciso informar qual o motivo deste bloqueio que nada mais Ã© do que atribuir um novo StatusCartao para ele dentre as opÃ§Ãµes praticadas pelo emissor."
  [id-cartao id-status observacao ]
  (call-api "/api/cartoes/{id_cartao}/bloqueio" :put
            {:path-params   {"id_cartao" id-cartao }
             :header-params {}
             :query-params  {"id_status" id-status "observacao" observacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn bloquear-using-put
  "Realiza o bloqueio de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o do bloqueio (temporÃ¡rio) ou do cancelamento (definitivo) de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id). Para isso, Ã© preciso informar qual o motivo deste bloqueio que nada mais Ã© do que atribuir um novo StatusCartao para ele dentre as opÃ§Ãµes praticadas pelo emissor."
  [id-cartao id-status observacao ]
  (:data (bloquear-using-put-with-http-info id-cartao id-status observacao)))

(defn consultar-limite-disponibilidade-using-get-with-http-info
  "Apresenta os limites do Portador do CartÃ£o
  Este mÃ©todo permite consultar os Limites configurados para o Portador de um determinado CartÃ£o, seja ele o titular da conta ou um adicional, a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id-cartao ]
  (call-api "/api/cartoes/{id_cartao}/limites-disponibilidades" :get
            {:path-params   {"id_cartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-limite-disponibilidade-using-get
  "Apresenta os limites do Portador do CartÃ£o
  Este mÃ©todo permite consultar os Limites configurados para o Portador de um determinado CartÃ£o, seja ele o titular da conta ou um adicional, a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id-cartao ]
  (:data (consultar-limite-disponibilidade-using-get-with-http-info id-cartao)))

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

(defn desbloquear-using-put-with-http-info
  "Realiza o desbloqueio de um determinado CartÃ£o
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-cartao ]
  (call-api "/api/cartoes/{id_cartao}/desbloqueio" :put
            {:path-params   {"id_cartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn desbloquear-using-put
  "Realiza o desbloqueio de um determinado CartÃ£o
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-cartao ]
  (:data (desbloquear-using-put-with-http-info id-cartao)))

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