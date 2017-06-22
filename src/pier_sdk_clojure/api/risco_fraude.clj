(ns pier-sdk-clojure.api.risco-fraude
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get12-with-http-info
  "Consultar uma transaÃ§Ã£o classificada com risco de fraude
  Consulta os detalhes de uma transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (call-api "/api/riscos-fraudes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get12
  "Consultar uma transaÃ§Ã£o classificada com risco de fraude
  Consulta os detalhes de uma transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (:data (consultar-using-get12-with-http-info id)))

(defn listar-using-get19-with-http-info
  "Listar as transaÃ§Ãµes com resoluÃ§Ã£o de risco fraude pendente
  Este recurso permite que sejam listados os riscos de fraudes existentes"
  ([id-conta confirmacao-fraude ] (listar-using-get19-with-http-info id-conta confirmacao-fraude nil))
  ([id-conta confirmacao-fraude {:keys [page limit ]}]
   (call-api "/api/riscos-fraudes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id_conta" id-conta "confirmacao_fraude" confirmacao-fraude "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get19
  "Listar as transaÃ§Ãµes com resoluÃ§Ã£o de risco fraude pendente
  Este recurso permite que sejam listados os riscos de fraudes existentes"
  ([id-conta confirmacao-fraude ] (listar-using-get19 id-conta confirmacao-fraude nil))
  ([id-conta confirmacao-fraude optional-params]
   (:data (listar-using-get19-with-http-info id-conta confirmacao-fraude optional-params))))

(defn negar-using-post-with-http-info
  "Negar autenticidade da transaÃ§Ã£o com risco de fraude
  Nega a realizaÃ§Ã£o da transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (call-api "/api/riscos-fraudes/{id}/negar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn negar-using-post
  "Negar autenticidade da transaÃ§Ã£o com risco de fraude
  Nega a realizaÃ§Ã£o da transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (:data (negar-using-post-with-http-info id)))

(defn reconhecer-using-post-with-http-info
  "Reconhecer a transaÃ§Ã£o com risco de fraude
  Confirma a autenticidade da transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (call-api "/api/riscos-fraudes/{id}/reconhecer" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn reconhecer-using-post
  "Reconhecer a transaÃ§Ã£o com risco de fraude
  Confirma a autenticidade da transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (:data (reconhecer-using-post-with-http-info id)))
