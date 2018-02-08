(ns pier-sdk-clojure.api.permissao-pais
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-pais-using-get-with-http-info
  "Apresenta dados de um determinado paÃ­s
  Este mÃ©todo permite consultar dados de um determinado paÃ­s a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/paises/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-pais-using-get
  "Apresenta dados de um determinado paÃ­s
  Este mÃ©todo permite consultar dados de um determinado paÃ­s a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-pais-using-get-with-http-info id)))

(defn listar-continentes-using-get-with-http-info
  "Lista os continentes
  Este recurso permite listar os continentes utilizados no recurso de permissÃ£o de uso do cartÃ£o no exterior"
  []
  (call-api "/api/continentes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-continentes-using-get
  "Lista os continentes
  Este recurso permite listar os continentes utilizados no recurso de permissÃ£o de uso do cartÃ£o no exterior"
  []
  (:data (listar-continentes-using-get-with-http-info)))

(defn listar-paises-using-get-with-http-info
  "Lista os paÃ­ses
  Este recurso permite listar os paÃ­ses."
  ([] (listar-paises-using-get-with-http-info nil))
  ([{:keys [sort page limit codigo sigla descricao continente flag-ativo ]}]
   (call-api "/api/paises" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "codigo" codigo "sigla" sigla "descricao" descricao "continente" continente "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-paises-using-get
  "Lista os paÃ­ses
  Este recurso permite listar os paÃ­ses."
  ([] (listar-paises-using-get nil))
  ([optional-params]
   (:data (listar-paises-using-get-with-http-info optional-params))))
