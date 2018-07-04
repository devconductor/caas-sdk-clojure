(ns pier-sdk-clojure.api.-global-tag-faq-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn adicionar-using-post-with-http-info
  "{{{faq_resource_adicionar}}}
  {{{faq_resource_adicionar_notes}}}"
  ([pergunta resposta ] (adicionar-using-post-with-http-info pergunta resposta nil))
  ([pergunta resposta {:keys [relevancia plataforma categoria status ]}]
   (call-api "/api/faqs" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pergunta" pergunta "resposta" resposta "relevancia" relevancia "plataforma" plataforma "categoria" categoria "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn adicionar-using-post
  "{{{faq_resource_adicionar}}}
  {{{faq_resource_adicionar_notes}}}"
  ([pergunta resposta ] (adicionar-using-post pergunta resposta nil))
  ([pergunta resposta optional-params]
   (:data (adicionar-using-post-with-http-info pergunta resposta optional-params))))

(defn alterar-using-put7-with-http-info
  "{{{faq_resource_alterar}}}
  {{{faq_resource_alterar_notes}}}"
  ([id pergunta resposta ] (alterar-using-put7-with-http-info id pergunta resposta nil))
  ([id pergunta resposta {:keys [relevancia plataforma categoria status ]}]
   (call-api "/api/faqs/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"pergunta" pergunta "resposta" resposta "relevancia" relevancia "plataforma" plataforma "categoria" categoria "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put7
  "{{{faq_resource_alterar}}}
  {{{faq_resource_alterar_notes}}}"
  ([id pergunta resposta ] (alterar-using-put7 id pergunta resposta nil))
  ([id pergunta resposta optional-params]
   (:data (alterar-using-put7-with-http-info id pergunta resposta optional-params))))

(defn consultar-using-get20-with-http-info
  "{{{faq_resource_consultar}}}
  {{{faq_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/faqs/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get20
  "{{{faq_resource_consultar}}}
  {{{faq_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get20-with-http-info id)))

(defn listar-using-get26-with-http-info
  "{{{faq_resource_listar}}}
  {{{faq_resource_listar_notes}}}"
  ([] (listar-using-get26-with-http-info nil))
  ([{:keys [sort page limit id-faq pergunta resposta relevancia plataforma categoria status ]}]
   (call-api "/api/faqs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idFaq" id-faq "pergunta" pergunta "resposta" resposta "relevancia" relevancia "plataforma" plataforma "categoria" categoria "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get26
  "{{{faq_resource_listar}}}
  {{{faq_resource_listar_notes}}}"
  ([] (listar-using-get26 nil))
  ([optional-params]
   (:data (listar-using-get26-with-http-info optional-params))))
