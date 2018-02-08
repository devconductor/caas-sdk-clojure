(ns pier-sdk-clojure.api.documento
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put19-with-http-info
  "Altera o tipo de template
  Esse recurso permite alterar os dados do tipo de template."
  [id persist ]
  (call-api "/api/tipos-templates/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put19
  "Altera o tipo de template
  Esse recurso permite alterar os dados do tipo de template."
  [id persist ]
  (:data (alterar-using-put19-with-http-info id persist)))

(defn atualizar-using-put2-with-http-info
  "Atualizar templates dos documentos
  Esse recurso permite atualizar templates dos documentos."
  [id persist ]
  (call-api "/api/templates-documentos/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put2
  "Atualizar templates dos documentos
  Esse recurso permite atualizar templates dos documentos."
  [id persist ]
  (:data (atualizar-using-put2-with-http-info id persist)))

(defn consultar-using-get13-with-http-info
  "Consulta documentos
  Esse recurso permite consultar um documento especÃ­fico a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/documentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get13
  "Consulta documentos
  Esse recurso permite consultar um documento especÃ­fico a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get13-with-http-info id)))

(defn consultar-using-get14-with-http-info
  "Consultar templates dos documentos
  Esse recurso permite consultar templates dos documentos."
  [id ]
  (call-api "/api/templates-documentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get14
  "Consultar templates dos documentos
  Esse recurso permite consultar templates dos documentos."
  [id ]
  (:data (consultar-using-get14-with-http-info id)))

(defn consultar-using-get38-with-http-info
  "Consultar tipo de template
  Esse recurso permite consultar um determinado tipo de template a partir do id recebido e do id do emissor."
  [id ]
  (call-api "/api/tipos-templates/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get38
  "Consultar tipo de template
  Esse recurso permite consultar um determinado tipo de template a partir do id recebido e do id do emissor."
  [id ]
  (:data (consultar-using-get38-with-http-info id)))

(defn integrar-using-post1-with-http-info
  "Integra um arquivo a repositÃ³rios remotos.
  Este recurso permite integrar um documento ao repositÃ³rio pre-configurado."
  [integrar-documento-request ]
  (call-api "/api/documentos/integrar" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    integrar-documento-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn integrar-using-post1
  "Integra um arquivo a repositÃ³rios remotos.
  Este recurso permite integrar um documento ao repositÃ³rio pre-configurado."
  [integrar-documento-request ]
  (:data (integrar-using-post1-with-http-info integrar-documento-request)))

(defn listar-using-get18-with-http-info
  "Lista documentos
  Esse recurso permite listar documentos."
  ([] (listar-using-get18-with-http-info nil))
  ([{:keys [sort page limit id-template-documento nome extensao ]}]
   (call-api "/api/documentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTemplateDocumento" id-template-documento "nome" nome "extensao" extensao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get18
  "Lista documentos
  Esse recurso permite listar documentos."
  ([] (listar-using-get18 nil))
  ([optional-params]
   (:data (listar-using-get18-with-http-info optional-params))))

(defn listar-using-get19-with-http-info
  "Lista os templates dos documentos
  Esse recurso permite listar os templates dos documentos."
  ([] (listar-using-get19-with-http-info nil))
  ([{:keys [sort page limit id-tipo-template ]}]
   (call-api "/api/templates-documentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoTemplate" id-tipo-template }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get19
  "Lista os templates dos documentos
  Esse recurso permite listar os templates dos documentos."
  ([] (listar-using-get19 nil))
  ([optional-params]
   (:data (listar-using-get19-with-http-info optional-params))))

(defn listar-using-get45-with-http-info
  "Lista os tipos de templates
  Esse recurso permite listar os tipos de templates associados ao emissor."
  ([] (listar-using-get45-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/tipos-templates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get45
  "Lista os tipos de templates
  Esse recurso permite listar os tipos de templates associados ao emissor."
  ([] (listar-using-get45 nil))
  ([optional-params]
   (:data (listar-using-get45-with-http-info optional-params))))

(defn salvar-using-post10-with-http-info
  "Cadastra documentos
  Esse recurso permite cadastrar documentos."
  [persist ]
  (call-api "/api/documentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post10
  "Cadastra documentos
  Esse recurso permite cadastrar documentos."
  [persist ]
  (:data (salvar-using-post10-with-http-info persist)))

(defn salvar-using-post11-with-http-info
  "Cadastra os templates dos documentos
  Esse recurso permite cadastrar templates dos documentos."
  [persist ]
  (call-api "/api/templates-documentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post11
  "Cadastra os templates dos documentos
  Esse recurso permite cadastrar templates dos documentos."
  [persist ]
  (:data (salvar-using-post11-with-http-info persist)))

(defn salvar-using-post26-with-http-info
  "Cadastra os tipos de templates
  Esse recurso permite cadastrar tipos de templates."
  [persist ]
  (call-api "/api/tipos-templates" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post26
  "Cadastra os tipos de templates
  Esse recurso permite cadastrar tipos de templates."
  [persist ]
  (:data (salvar-using-post26-with-http-info persist)))
