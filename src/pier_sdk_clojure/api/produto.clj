(ns pier-sdk-clojure.api.produto
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-produto-using-get-with-http-info
  "Apresenta os dados de um determinado Produto
  Este mÃ©todo permite consultar um determinado Produto a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-produto ]
  (call-api "/api/produtos/{id_produto}" :get
            {:path-params   {"id_produto" id-produto }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-produto-using-get
  "Apresenta os dados de um determinado Produto
  Este mÃ©todo permite consultar um determinado Produto a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-produto ]
  (:data (consultar-produto-using-get-with-http-info id-produto)))

(defn listar-produtos-using-get-with-http-info
  "Lista os Produtos do Emissor
  Este mÃ©todo permite que sejam listados os Produtos existentes na base de dados do Emissor."
  ([] (listar-produtos-using-get-with-http-info nil))
  ([{:keys [id nome status page limit ]}]
   (call-api "/api/produtos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "status" status "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-produtos-using-get
  "Lista os Produtos do Emissor
  Este mÃ©todo permite que sejam listados os Produtos existentes na base de dados do Emissor."
  ([] (listar-produtos-using-get nil))
  ([optional-params]
   (:data (listar-produtos-using-get-with-http-info optional-params))))
