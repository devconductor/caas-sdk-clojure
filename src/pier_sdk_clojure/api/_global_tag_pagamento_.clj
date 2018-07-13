(ns pier-sdk-clojure.api.-global-tag-pagamento-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get-with-http-info
  "{{{acordo_resource_consultar}}}
  {{{acordo_resource_consultar_notes}}}"
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
  "{{{acordo_resource_consultar}}}
  {{{acordo_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get-with-http-info id)))

(defn listar-pagamentos-using-get1-with-http-info
  "{{{pagamento_resource_listar_pagamentos}}}
  {{{pagamento_resource_listar_pagamentos_notes}}}"
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
  "{{{pagamento_resource_listar_pagamentos}}}
  {{{pagamento_resource_listar_pagamentos_notes}}}"
  ([] (listar-pagamentos-using-get1 nil))
  ([optional-params]
   (:data (listar-pagamentos-using-get1-with-http-info optional-params))))

(defn listar-using-get-with-http-info
  "{{{acordo_resource_listar}}}
  {{{acordo_resource_listar_notes}}}"
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
  "{{{acordo_resource_listar}}}
  {{{acordo_resource_listar_notes}}}"
  ([] (listar-using-get nil))
  ([optional-params]
   (:data (listar-using-get-with-http-info optional-params))))
