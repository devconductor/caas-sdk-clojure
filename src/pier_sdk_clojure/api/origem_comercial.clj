(ns pier-sdk-clojure.api.origem-comercial
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-origem-comercial-using-get-with-http-info
  "OperaÃ§Ã£o utilizada para consultar uma determinada Origem Comercial
  Este mÃ©todo permite que sejam listados os registros de uma determinada Origem Comercial existente na base do emissor. Para isso, Ã© preciso informar o seu respectivo cÃ³digo de identificaÃ§Ã£o (id)."
  [id-origem-comercial ]
  (call-api "/api/origens-comerciais/{id_origem_comercial}" :get
            {:path-params   {"id_origem_comercial" id-origem-comercial }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-origem-comercial-using-get
  "OperaÃ§Ã£o utilizada para consultar uma determinada Origem Comercial
  Este mÃ©todo permite que sejam listados os registros de uma determinada Origem Comercial existente na base do emissor. Para isso, Ã© preciso informar o seu respectivo cÃ³digo de identificaÃ§Ã£o (id)."
  [id-origem-comercial ]
  (:data (consultar-origem-comercial-using-get-with-http-info id-origem-comercial)))

(defn listar-origens-comerciais-using-get-with-http-info
  "OperaÃ§Ã£o utilizada para listar Origens Comerciais
  Este mÃ©todo permite que sejam listadas as Origens Comerciais existentes na base do emissor."
  ([] (listar-origens-comerciais-using-get-with-http-info nil))
  ([{:keys [id-origem-comercial nome status page limit ]}]
   (call-api "/api/origens-comerciais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id_origem_comercial" id-origem-comercial "nome" nome "status" status "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-origens-comerciais-using-get
  "OperaÃ§Ã£o utilizada para listar Origens Comerciais
  Este mÃ©todo permite que sejam listadas as Origens Comerciais existentes na base do emissor."
  ([] (listar-origens-comerciais-using-get nil))
  ([optional-params]
   (:data (listar-origens-comerciais-using-get-with-http-info optional-params))))
