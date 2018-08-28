(ns pier-sdk-clojure.api.bin-chave-resource
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-bin-chave-using-put-with-http-info
  "alterarBinChave"
  [id request login ]
  (call-api "/api/bins-chaves/{id}" :put
            {:path-params   {"id" id }
             :header-params {"login" login }
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-bin-chave-using-put
  "alterarBinChave"
  [id request login ]
  (:data (alterar-bin-chave-using-put-with-http-info id request login)))

(defn consultar-using-get10-with-http-info
  "consultar"
  [id ]
  (call-api "/api/bins-chaves/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get10
  "consultar"
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn listar-bin-chave-using-get-with-http-info
  "listarBinChave"
  ([] (listar-bin-chave-using-get-with-http-info nil))
  ([{:keys [sort page limit id id-tipo-chave id-bin chave check-value validade flag-descriptografado label ]}]
   (call-api "/api/bins-chaves" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idTipoChave" id-tipo-chave "idBin" id-bin "chave" chave "checkValue" check-value "validade" validade "flagDescriptografado" flag-descriptografado "label" label }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-bin-chave-using-get
  "listarBinChave"
  ([] (listar-bin-chave-using-get nil))
  ([optional-params]
   (:data (listar-bin-chave-using-get-with-http-info optional-params))))

(defn salvar-using-post4-with-http-info
  "salvar"
  [bin-chave-persist login ]
  (call-api "/api/bins-chaves" :post
            {:path-params   {}
             :header-params {"login" login }
             :query-params  {}
             :form-params   {}
             :body-param    bin-chave-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post4
  "salvar"
  [bin-chave-persist login ]
  (:data (salvar-using-post4-with-http-info bin-chave-persist login)))
