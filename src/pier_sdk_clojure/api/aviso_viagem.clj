(ns pier-sdk-clojure.api.aviso-viagem
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get4-with-http-info
  "Consultar um aviso viagem de acordo com o id passado
  Este mÃ©todo permite que seja consultado um aviso viagen existente na base do emissor."
  [id ]
  (call-api "/api/avisos-viagens/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get4
  "Consultar um aviso viagem de acordo com o id passado
  Este mÃ©todo permite que seja consultado um aviso viagen existente na base do emissor."
  [id ]
  (:data (consultar-using-get4-with-http-info id)))

(defn desabilitar-using-post-with-http-info
  "Desabilitar um aviso viagem de acordo com o id passado
  Este mÃ©todo permite que seja desabilitado um aviso viagen existente na base do emissor."
  [id ]
  (call-api "/api/avisos-viagens/{id}/desabilitar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desabilitar-using-post
  "Desabilitar um aviso viagem de acordo com o id passado
  Este mÃ©todo permite que seja desabilitado um aviso viagen existente na base do emissor."
  [id ]
  (:data (desabilitar-using-post-with-http-info id)))

(defn habilitar-using-post-with-http-info
  "Habilitar um aviso viagem de acordo com o id passado
  Este mÃ©todo permite que seja habilitado um aviso viagen existente na base do emissor."
  [id ]
  (call-api "/api/avisos-viagens/{id}/habilitar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn habilitar-using-post
  "Habilitar um aviso viagem de acordo com o id passado
  Este mÃ©todo permite que seja habilitado um aviso viagen existente na base do emissor."
  [id ]
  (:data (habilitar-using-post-with-http-info id)))

(defn listar-using-get6-with-http-info
  "Lista os avisos viagens gerados pelo Emissor
  Este mÃ©todo permite que sejam listados os avisos viagens existentes na base do emissor."
  ([] (listar-using-get6-with-http-info nil))
  ([{:keys [sort page limit id-cartao codigo-pais data-inicio data-fim flag-ativo ]}]
   (call-api "/api/avisos-viagens" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idCartao" id-cartao "codigoPais" codigo-pais "dataInicio" data-inicio "dataFim" data-fim "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get6
  "Lista os avisos viagens gerados pelo Emissor
  Este mÃ©todo permite que sejam listados os avisos viagens existentes na base do emissor."
  ([] (listar-using-get6 nil))
  ([optional-params]
   (:data (listar-using-get6-with-http-info optional-params))))

(defn salvar-using-post3-with-http-info
  "Realiza o cadastro de um novo Aviso Viagem
  Este mÃ©todo permite que seja cadastrado um novo Aviso Viagem na base de dados do Emissor."
  [id-cartao codigo-pais data-inicio data-fim ]
  (call-api "/api/avisos-viagens" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"idCartao" id-cartao "codigoPais" codigo-pais "dataInicio" data-inicio "dataFim" data-fim }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post3
  "Realiza o cadastro de um novo Aviso Viagem
  Este mÃ©todo permite que seja cadastrado um novo Aviso Viagem na base de dados do Emissor."
  [id-cartao codigo-pais data-inicio data-fim ]
  (:data (salvar-using-post3-with-http-info id-cartao codigo-pais data-inicio data-fim)))
