(ns pier-sdk-clojure.api.ajuste-financeiro
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ajustar-conta-using-post-with-http-info
  "LanÃ§a um ajuste para a conta informada
  Este recurso insere um ajuste para a conta do id informado"
  ([id-tipo-ajuste data-ajuste valor-ajuste id-conta ] (ajustar-conta-using-post-with-http-info id-tipo-ajuste data-ajuste valor-ajuste id-conta nil))
  ([id-tipo-ajuste data-ajuste valor-ajuste id-conta {:keys [identificador-externo ]}]
   (call-api "/api/ajustes-financeiros" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idTipoAjuste" id-tipo-ajuste "dataAjuste" data-ajuste "valorAjuste" valor-ajuste "identificadorExterno" identificador-externo "idConta" id-conta }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn ajustar-conta-using-post
  "LanÃ§a um ajuste para a conta informada
  Este recurso insere um ajuste para a conta do id informado"
  ([id-tipo-ajuste data-ajuste valor-ajuste id-conta ] (ajustar-conta-using-post id-tipo-ajuste data-ajuste valor-ajuste id-conta nil))
  ([id-tipo-ajuste data-ajuste valor-ajuste id-conta optional-params]
   (:data (ajustar-conta-using-post-with-http-info id-tipo-ajuste data-ajuste valor-ajuste id-conta optional-params))))

(defn consultar-using-get1-with-http-info
  "Apresenta dados de um determinado ajuste financeiro
  Este mÃ©todo permite consultar dados de um determinado ajuste a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/ajustes-financeiros/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get1
  "Apresenta dados de um determinado ajuste financeiro
  Este mÃ©todo permite consultar dados de um determinado ajuste a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get1-with-http-info id)))

(defn listar-using-get1-with-http-info
  "Lista ajustes existentes na base de dados do Emissor
  Este recurso permite listar ajustes existentes na base de dados do Emissor."
  ([] (listar-using-get1-with-http-info nil))
  ([{:keys [sort page limit id-tipo-ajuste data-ajuste valor-ajuste identificador-externo id-conta ]}]
   (call-api "/api/ajustes-financeiros" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoAjuste" id-tipo-ajuste "dataAjuste" data-ajuste "valorAjuste" valor-ajuste "identificadorExterno" identificador-externo "idConta" id-conta }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get1
  "Lista ajustes existentes na base de dados do Emissor
  Este recurso permite listar ajustes existentes na base de dados do Emissor."
  ([] (listar-using-get1 nil))
  ([optional-params]
   (:data (listar-using-get1-with-http-info optional-params))))
