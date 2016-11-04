(ns pier-sdk-clojure.api.portador
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-using-get4-with-http-info
  "Lista os Portadores existentes
  Este mÃ©todo permite que sejam listados os portadores cadastrados na base do emissor."
  ([] (listar-using-get4-with-http-info nil))
  ([{:keys [id-conta id-produto id-pessoa id-parentesco tipo-portador nome-impresso flag-ativo data-cadastro-portador data-cancelamento-portador page limit ]}]
   (call-api "/api/portadores" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "idProduto" id-produto "idPessoa" id-pessoa "idParentesco" id-parentesco "tipoPortador" tipo-portador "nomeImpresso" nome-impresso "flagAtivo" flag-ativo "dataCadastroPortador" data-cadastro-portador "dataCancelamentoPortador" data-cancelamento-portador "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get4
  "Lista os Portadores existentes
  Este mÃ©todo permite que sejam listados os portadores cadastrados na base do emissor."
  ([] (listar-using-get4 nil))
  ([optional-params]
   (:data (listar-using-get4-with-http-info optional-params))))
