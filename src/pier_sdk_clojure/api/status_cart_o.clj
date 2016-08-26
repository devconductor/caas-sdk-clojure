(ns pier-sdk-clojure.api.status-cart-o
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-status-cartao-using-get-with-http-info
  "Apresenta os dados de um determinado Status CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-status-cartao ]
  (call-api "/api/status-cartoes/{id_status_cartao}" :get
            {:path-params   {"id_status_cartao" id-status-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-status-cartao-using-get
  "Apresenta os dados de um determinado Status CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-status-cartao ]
  (:data (consultar-status-cartao-using-get-with-http-info id-status-cartao)))

(defn listar-status-cartoes-using-get-with-http-info
  "Lista as opÃ§Ãµes de Status do CartÃ£o
  Este mÃ©todo permite que sejam listadas as possibilidades de Status que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-status-cartoes-using-get-with-http-info nil))
  ([{:keys [id-status-cartao nome flag-altera-status flag-desbloqueio flag-reversao-desbloqueio id-status-destino-desbloqueio flag-cancela-cartao flag-reversao-cancelamento flag-emite-provisorio flag-cancela-conta id-status-destino-conta flag-reemite-cartao flag-cobra-tarifa flag-origem-transferencia flag-destino-transferencia flag-cadastro-senha flag-cadastro-nova-senha flag-excecao-bandeira page limit ]}]
   (call-api "/api/status-cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id_status_cartao" id-status-cartao "nome" nome "flag_altera_status" flag-altera-status "flag_desbloqueio" flag-desbloqueio "flag_reversao_desbloqueio" flag-reversao-desbloqueio "id_status_destino_desbloqueio" id-status-destino-desbloqueio "flag_cancela_cartao" flag-cancela-cartao "flag_reversao_cancelamento" flag-reversao-cancelamento "flag_emite_provisorio" flag-emite-provisorio "flag_cancela_conta" flag-cancela-conta "id_status_destino_conta" id-status-destino-conta "flag_reemite_cartao" flag-reemite-cartao "flag_cobra_tarifa" flag-cobra-tarifa "flag_origem_transferencia" flag-origem-transferencia "flag_destino_transferencia" flag-destino-transferencia "flag_cadastro_senha" flag-cadastro-senha "flag_cadastro_nova_senha" flag-cadastro-nova-senha "flag_excecao_bandeira" flag-excecao-bandeira "page" page "limit" limit }
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
