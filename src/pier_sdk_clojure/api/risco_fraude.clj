(ns pier-sdk-clojure.api.risco-fraude
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get22-with-http-info
  "Consultar uma transaÃ§Ã£o classificada com risco de fraude
  Consulta os detalhes de uma transaÃ§Ã£o classificada como risco de fraude."
  [id ]
  (call-api "/api/riscos-fraudes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get22
  "Consultar uma transaÃ§Ã£o classificada com risco de fraude
  Consulta os detalhes de uma transaÃ§Ã£o classificada como risco de fraude."
  [id ]
  (:data (consultar-using-get22-with-http-info id)))

(defn listar-tipos-resolucao-using-get-with-http-info
  "Listar os tipos de resoluÃ§Ã£o de fraude
  Este recurso permite que sejam listados os tipos de resoluÃ§Ã£o de fraude, cadastrados para um emissor."
  ([] (listar-tipos-resolucao-using-get-with-http-info nil))
  ([{:keys [page limit ]}]
   (call-api "/api/tipos-resolucao" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-resolucao-using-get
  "Listar os tipos de resoluÃ§Ã£o de fraude
  Este recurso permite que sejam listados os tipos de resoluÃ§Ã£o de fraude, cadastrados para um emissor."
  ([] (listar-tipos-resolucao-using-get nil))
  ([optional-params]
   (:data (listar-tipos-resolucao-using-get-with-http-info optional-params))))

(defn negar-using-post-with-http-info
  "Negar autenticidade de uma transaÃ§Ã£o classificada como risco de fraude
  Nega a realizaÃ§Ã£o de uma transaÃ§Ã£o classificada como risco de fraude."
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
  "Negar autenticidade de uma transaÃ§Ã£o classificada como risco de fraude
  Nega a realizaÃ§Ã£o de uma transaÃ§Ã£o classificada como risco de fraude."
  [id ]
  (:data (negar-using-post-with-http-info id)))

(defn reconhecer-using-post-with-http-info
  "Reconhecer autenticidade de uma transaÃ§Ã£o classificada como risco de fraude
  Confirma a autenticidade de uma transaÃ§Ã£o classificada como risco de fraude."
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
  "Reconhecer autenticidade de uma transaÃ§Ã£o classificada como risco de fraude
  Confirma a autenticidade de uma transaÃ§Ã£o classificada como risco de fraude."
  [id ]
  (:data (reconhecer-using-post-with-http-info id)))
