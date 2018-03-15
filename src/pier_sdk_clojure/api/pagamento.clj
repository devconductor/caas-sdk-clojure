(ns pier-sdk-clojure.api.pagamento
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get-with-http-info
  "Consulta os dados de um determinado acordo
  Este método permite consultar dados de um determinado acordo a partir de seu codigo de identificação (id)."
  [id ]
  (call-api "/api/acordos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get
  "Consulta os dados de um determinado acordo
  Este método permite consultar dados de um determinado acordo a partir de seu codigo de identificação (id)."
  [id ]
  (:data (consultar-using-get-with-http-info id)))

(defn listar-pagamentos-using-get1-with-http-info
  "Lista histórico de pagamentos
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
  "Lista histórico de pagamentos
  Este recurso permite listar todos os Pagamentos realizados independente do seu Status de Processamento."
  ([] (listar-pagamentos-using-get1 nil))
  ([optional-params]
   (:data (listar-pagamentos-using-get1-with-http-info optional-params))))

(defn listar-using-get-with-http-info
  "Lista os acordos existentes na base
  Este método permite que sejam listados todos os acordos existentes na base do emissor."
  ([] (listar-using-get-with-http-info nil))
  ([{:keys [sort page limit id-conta status-acordo data-acordo quantidade-parcelas ]}]
   (call-api "/api/acordos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "statusAcordo" status-acordo "dataAcordo" data-acordo "quantidadeParcelas" quantidade-parcelas }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get
  "Lista os acordos existentes na base
  Este método permite que sejam listados todos os acordos existentes na base do emissor."
  ([] (listar-using-get nil))
  ([optional-params]
   (:data (listar-using-get-with-http-info optional-params))))
