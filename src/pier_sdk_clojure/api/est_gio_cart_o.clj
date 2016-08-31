(ns pier-sdk-clojure.api.est-gio-cart-o
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-estagio-cartao-using-get-with-http-info
  "Apresenta os dados de um determinado Estagio CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado EstÃ¡gio de Entrega do CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-estagio-cartao ]
  (call-api "/api/estagios-cartoes/{id_estagio_cartao}" :get
            {:path-params   {"id_estagio_cartao" id-estagio-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-estagio-cartao-using-get
  "Apresenta os dados de um determinado Estagio CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado EstÃ¡gio de Entrega do CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-estagio-cartao ]
  (:data (consultar-estagio-cartao-using-get-with-http-info id-estagio-cartao)))

(defn listar-estagios-cartoes-using-get-with-http-info
  "Lista as opÃ§Ãµes de EstÃ¡gios do CartÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de EstÃ¡gio de Entrega que podem ser atribuÃ­das aos CartÃµes."
  ([id nome ] (listar-estagios-cartoes-using-get-with-http-info id nome nil))
  ([id nome {:keys [page limit ]}]
   (call-api "/api/estagios-cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-estagios-cartoes-using-get
  "Lista as opÃ§Ãµes de EstÃ¡gios do CartÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de EstÃ¡gio de Entrega que podem ser atribuÃ­das aos CartÃµes."
  ([id nome ] (listar-estagios-cartoes-using-get id nome nil))
  ([id nome optional-params]
   (:data (listar-estagios-cartoes-using-get-with-http-info id nome optional-params))))
