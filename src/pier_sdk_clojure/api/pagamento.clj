(ns pier-sdk-clojure.api.pagamento
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-pagamentos-using-get1-with-http-info
  "Lista histÃ³rico de pagamentos
  Este recurso permite listar todos os Pagamentos realizados independente do seu Status de Processamento."
  ([] (listar-pagamentos-using-get1-with-http-info nil))
  ([{:keys [sort page limit id-conta id-pagamento id-estabelecimento id-banco id-cartao data-hora-pagamento status ]}]
   (call-api "/api/pagamentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "idPagamento" id-pagamento "idEstabelecimento" id-estabelecimento "idBanco" id-banco "idCartao" id-cartao "dataHoraPagamento" data-hora-pagamento "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-pagamentos-using-get1
  "Lista histÃ³rico de pagamentos
  Este recurso permite listar todos os Pagamentos realizados independente do seu Status de Processamento."
  ([] (listar-pagamentos-using-get1 nil))
  ([optional-params]
   (:data (listar-pagamentos-using-get1-with-http-info optional-params))))
