(ns pier-sdk-clojure.api.tipo-telefone
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get8-with-http-info
  "Apresenta os dados de um determinado Tipo de Telefone
  Este mÃ©todo permite consultar um determinado Tipo de Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-tipo-telefone ]
  (call-api "/api/tipos-telefones/{id_tipo_telefone}" :get
            {:path-params   {"id_tipo_telefone" id-tipo-telefone }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get8
  "Apresenta os dados de um determinado Tipo de Telefone
  Este mÃ©todo permite consultar um determinado Tipo de Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-tipo-telefone ]
  (:data (consultar-using-get8-with-http-info id-tipo-telefone)))

(defn listar-using-get9-with-http-info
  "Lista os Tipos de Telefones
  Este mÃ©todo permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get9-with-http-info nil))
  ([{:keys [id nome page limit ]}]
   (call-api "/api/tipos-telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get9
  "Lista os Tipos de Telefones
  Este mÃ©todo permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get9 nil))
  ([optional-params]
   (:data (listar-using-get9-with-http-info optional-params))))
