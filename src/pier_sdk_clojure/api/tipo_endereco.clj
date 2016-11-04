(ns pier-sdk-clojure.api.tipo-endereco
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get7-with-http-info
  "Apresenta os dados de um determinado Tipo de EndereÃ§o
  Este mÃ©todo permite consultar um determinado Tipo de EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-tipo-endereco ]
  (call-api "/api/tipos-endereco/{id_tipo_endereco}" :get
            {:path-params   {"id_tipo_endereco" id-tipo-endereco }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get7
  "Apresenta os dados de um determinado Tipo de EndereÃ§o
  Este mÃ©todo permite consultar um determinado Tipo de EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-tipo-endereco ]
  (:data (consultar-using-get7-with-http-info id-tipo-endereco)))

(defn listar-using-get8-with-http-info
  "Lista as opÃµes de Tipos de EndereÃ§os do Emissor
  Este mÃ©todo permite que sejam listados os Tipos de EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get8-with-http-info nil))
  ([{:keys [id nome page limit ]}]
   (call-api "/api/tipos-endereco" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get8
  "Lista as opÃµes de Tipos de EndereÃ§os do Emissor
  Este mÃ©todo permite que sejam listados os Tipos de EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get8 nil))
  ([optional-params]
   (:data (listar-using-get8-with-http-info optional-params))))
