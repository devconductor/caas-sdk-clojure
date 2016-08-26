(ns pier-sdk-clojure.api.cart-o
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

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

(defn listar-using-get-with-http-info
  "Lista os CartÃµes gerados pelo Emissor
  Este mÃ©todo permite que sejam listados os cartÃµes existentes na base do emissor."
  ([] (listar-using-get-with-http-info nil))
  ([{:keys [id-cartao id-status-cartao id-estagio-cartao id-conta id-pessoa portador numero-cartao data-geracao data-status-cartao data-estagio-cartao data-validade data-impressao arquivo-impressao flag-impressao-origem-comercial flag-provisorio codigo-desbloqueio page limit ]}]
   (call-api "/api/cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id_cartao" id-cartao "id_status_cartao" id-status-cartao "id_estagio_cartao" id-estagio-cartao "id_conta" id-conta "id_pessoa" id-pessoa "portador" portador "numero_cartao" numero-cartao "data_geracao" data-geracao "data_status_cartao" data-status-cartao "data_estagio_cartao" data-estagio-cartao "data_validade" data-validade "data_impressao" data-impressao "arquivo_impressao" arquivo-impressao "flag_impressao_origem_comercial" flag-impressao-origem-comercial "flag_provisorio" flag-provisorio "codigo_desbloqueio" codigo-desbloqueio "page" page "limit" limit }
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
