(ns pier-sdk-clojure.api.conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn buscar-conta-using-get-with-http-info
  "/contas/buscar
  Consulte contas filtrando pelos campos id do emissor, nÃºmero do cartÃ£o, nome ou CPF/CNPJ"
  ([id-emissor ] (buscar-conta-using-get-with-http-info id-emissor nil))
  ([id-emissor {:keys [nome cpf numero-cartao id-conta ]}]
   (call-api "/api/v1/contas/buscar" :get
             {:path-params   {}
              :header-params {"idEmissor" id-emissor }
              :query-params  {"nome" nome "cpf" cpf "numeroCartao" numero-cartao "idConta" id-conta }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn buscar-conta-using-get
  "/contas/buscar
  Consulte contas filtrando pelos campos id do emissor, nÃºmero do cartÃ£o, nome ou CPF/CNPJ"
  ([id-emissor ] (buscar-conta-using-get id-emissor nil))
  ([id-emissor optional-params]
   (:data (buscar-conta-using-get-with-http-info id-emissor optional-params))))

(defn consultar-conta-using-get-with-http-info
  "/contas/{idConta}
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-emissor id-conta ]
  (call-api "/api/v1/contas/{idConta}" :get
            {:path-params   {"idConta" id-conta }
             :header-params {"idEmissor" id-emissor }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-conta-using-get
  "/contas/{idConta}
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-emissor id-conta ]
  (:data (consultar-conta-using-get-with-http-info id-emissor id-conta)))
