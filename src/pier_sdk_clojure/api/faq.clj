(ns pier-sdk-clojure.api.faq
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn adicionar-using-post-with-http-info
  "Adiciona uma nova FAQ para um determinado Emissor."
  ([pergunta resposta ] (adicionar-using-post-with-http-info pergunta resposta nil))
  ([pergunta resposta {:keys [relevancia plataforma categoria status ]}]
   (call-api "/api/faqs" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pergunta" pergunta "resposta" resposta "relevancia" relevancia "plataforma" plataforma "categoria" categoria "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn adicionar-using-post
  "Adiciona uma nova FAQ para um determinado Emissor."
  ([pergunta resposta ] (adicionar-using-post pergunta resposta nil))
  ([pergunta resposta optional-params]
   (:data (adicionar-using-post-with-http-info pergunta resposta optional-params))))

(defn alterar-using-put2-with-http-info
  "Altera os parÃ¢metros de uma FAQ existente."
  ([id pergunta resposta ] (alterar-using-put2-with-http-info id pergunta resposta nil))
  ([id pergunta resposta {:keys [relevancia plataforma categoria status ]}]
   (call-api "/api/faqs/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"pergunta" pergunta "resposta" resposta "relevancia" relevancia "plataforma" plataforma "categoria" categoria "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn alterar-using-put2
  "Altera os parÃ¢metros de uma FAQ existente."
  ([id pergunta resposta ] (alterar-using-put2 id pergunta resposta nil))
  ([id pergunta resposta optional-params]
   (:data (alterar-using-put2-with-http-info id pergunta resposta optional-params))))

(defn consultar-using-get5-with-http-info
  "Consulta os detalhes de uma determinada FAQ relacionada a um Emissor."
  [id ]
  (call-api "/api/faqs/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get5
  "Consulta os detalhes de uma determinada FAQ relacionada a um Emissor."
  [id ]
  (:data (consultar-using-get5-with-http-info id)))

(defn listar-using-get5-with-http-info
  "Lista todas as FAQs de um determinado emissor."
  ([] (listar-using-get5-with-http-info nil))
  ([{:keys [page limit id-faq pergunta resposta relevancia plataforma categoria status ]}]
   (call-api "/api/faqs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idFaq" id-faq "pergunta" pergunta "resposta" resposta "relevancia" relevancia "plataforma" plataforma "categoria" categoria "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get5
  "Lista todas as FAQs de um determinado emissor."
  ([] (listar-using-get5 nil))
  ([optional-params]
   (:data (listar-using-get5-with-http-info optional-params))))
