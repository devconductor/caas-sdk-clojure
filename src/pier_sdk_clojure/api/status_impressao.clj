(ns pier-sdk-clojure.api.status-impressao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get3-with-http-info
  "Apresenta os dados de um determinado Status ImpressÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de ImpressÃ£o do CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-status-impressao ]
  (call-api "/api/status-impressoes/{id_status_impressao}" :get
            {:path-params   {"id_status_impressao" id-status-impressao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get3
  "Apresenta os dados de um determinado Status ImpressÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de ImpressÃ£o do CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-status-impressao ]
  (:data (consultar-using-get3-with-http-info id-status-impressao)))

(defn listar-using-get4-with-http-info
  "Lista as opÃ§Ãµes de Status ImpressÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de Status ImpressÃ£o que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-using-get4-with-http-info nil))
  ([{:keys [id nome page limit ]}]
   (call-api "/api/status-impressoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get4
  "Lista as opÃ§Ãµes de Status ImpressÃ£o
  Este mÃ©todo permite que sejam listadas as opÃ§Ãµes de Status ImpressÃ£o que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-using-get4 nil))
  ([optional-params]
   (:data (listar-using-get4-with-http-info optional-params))))
