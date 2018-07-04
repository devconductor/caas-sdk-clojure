(ns pier-sdk-clojure.api.-global-tag-aviso-viagem-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get6-with-http-info
  "{{{aviso_viagem_resource_consultar}}}
  {{{aviso_viagem_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/avisos-viagens/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get6
  "{{{aviso_viagem_resource_consultar}}}
  {{{aviso_viagem_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get6-with-http-info id)))

(defn desabilitar-using-post-with-http-info
  "{{{aviso_viagem_resource_desabilitar}}}
  {{{aviso_viagem_resource_desabilitar_notes}}}"
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
  "{{{aviso_viagem_resource_desabilitar}}}
  {{{aviso_viagem_resource_desabilitar_notes}}}"
  [id ]
  (:data (desabilitar-using-post-with-http-info id)))

(defn habilitar-using-post-with-http-info
  "{{{aviso_viagem_resource_habilitar}}}
  {{{aviso_viagem_resource_habilitar_notes}}}"
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
  "{{{aviso_viagem_resource_habilitar}}}
  {{{aviso_viagem_resource_habilitar_notes}}}"
  [id ]
  (:data (habilitar-using-post-with-http-info id)))

(defn listar-using-get8-with-http-info
  "{{{aviso_viagem_resource_listar}}}
  {{{aviso_viagem_resource_listar_notes}}}"
  ([] (listar-using-get8-with-http-info nil))
  ([{:keys [sort page limit id-cartao codigo-pais data-inicio data-fim flag-ativo ]}]
   (call-api "/api/avisos-viagens" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idCartao" id-cartao "codigoPais" codigo-pais "dataInicio" data-inicio "dataFim" data-fim "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get8
  "{{{aviso_viagem_resource_listar}}}
  {{{aviso_viagem_resource_listar_notes}}}"
  ([] (listar-using-get8 nil))
  ([optional-params]
   (:data (listar-using-get8-with-http-info optional-params))))

(defn salvar-using-post3-with-http-info
  "{{{aviso_viagem_resource_salvar}}}
  {{{aviso_viagem_resource_salvar_notes}}}"
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
  "{{{aviso_viagem_resource_salvar}}}
  {{{aviso_viagem_resource_salvar_notes}}}"
  [id-cartao codigo-pais data-inicio data-fim ]
  (:data (salvar-using-post3-with-http-info id-cartao codigo-pais data-inicio data-fim)))
