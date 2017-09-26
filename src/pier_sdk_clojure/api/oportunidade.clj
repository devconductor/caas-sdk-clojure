(ns pier-sdk-clojure.api.oportunidade
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-status-using-put-with-http-info
  "Altera o status do tipo oportunidade
  Este mÃ©todo realiza a alteraÃ§Ã£o do status do tipo oportunidade."
  [id id-status persist ]
  (call-api "/api/tipos-oportunidades/{id}/status/{idStatus}" :put
            {:path-params   {"id" id "idStatus" id-status }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-status-using-put
  "Altera o status do tipo oportunidade
  Este mÃ©todo realiza a alteraÃ§Ã£o do status do tipo oportunidade."
  [id id-status persist ]
  (:data (alterar-status-using-put-with-http-info id id-status persist)))

(defn alterar-using-put4-with-http-info
  "Altera as oportunidades
  Este mÃ©todo realiza a alteraÃ§Ã£o das oportunidades."
  [id update ]
  (call-api "/api/oportunidades/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put4
  "Altera as oportunidades
  Este mÃ©todo realiza a alteraÃ§Ã£o das oportunidades."
  [id update ]
  (:data (alterar-using-put4-with-http-info id update)))

(defn alterar-using-put8-with-http-info
  "Altera os tipos oportunidades
  Este mÃ©todo realiza a alteraÃ§Ã£o dos tipos oportunidades."
  [id persist ]
  (call-api "/api/tipos-oportunidades/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put8
  "Altera os tipos oportunidades
  Este mÃ©todo realiza a alteraÃ§Ã£o dos tipos oportunidades."
  [id persist ]
  (:data (alterar-using-put8-with-http-info id persist)))

(defn consultar-status-using-get-with-http-info
  "Apresenta dados de um determinado status do tipo oportunidade
  Este recurso permite consultar dados de um determinado status do tipo oportunidade a partir de seu codigo de identificaÃ§Ã£o (idStatus)."
  [id id-status ]
  (call-api "/api/tipos-oportunidades/{id}/status/{idStatus}" :get
            {:path-params   {"id" id "idStatus" id-status }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-status-using-get
  "Apresenta dados de um determinado status do tipo oportunidade
  Este recurso permite consultar dados de um determinado status do tipo oportunidade a partir de seu codigo de identificaÃ§Ã£o (idStatus)."
  [id id-status ]
  (:data (consultar-status-using-get-with-http-info id id-status)))

(defn consultar-using-get10-with-http-info
  "Apresenta dados de uma determinada oportunidade
  Este recurso permite consultar dados de uma determinada oportunidade a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/oportunidades/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get10
  "Apresenta dados de uma determinada oportunidade
  Este recurso permite consultar dados de uma determinada oportunidade a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn consultar-using-get22-with-http-info
  "Apresenta dados de um determinado tipo oportunidade
  Este recurso permite consultar dados de um determinado tipo oportunidade a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/tipos-oportunidades/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get22
  "Apresenta dados de um determinado tipo oportunidade
  Este recurso permite consultar dados de um determinado tipo oportunidade a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get22-with-http-info id)))

(defn listar-auditorias-status-using-get-with-http-info
  "Lista as auditorias dos status oportunidades
  Este recurso permite listar os status oportunidades."
  ([] (listar-auditorias-status-using-get-with-http-info nil))
  ([{:keys [sort page limit rev-type rev-date id id-tipo-oportunidade nome descricao flag-ativo rev-user ]}]
   (call-api "/api/auditorias-status-oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "revType" rev-type "revDate" rev-date "id" id "idTipoOportunidade" id-tipo-oportunidade "nome" nome "descricao" descricao "flagAtivo" flag-ativo "revUser" rev-user }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-auditorias-status-using-get
  "Lista as auditorias dos status oportunidades
  Este recurso permite listar os status oportunidades."
  ([] (listar-auditorias-status-using-get nil))
  ([optional-params]
   (:data (listar-auditorias-status-using-get-with-http-info optional-params))))

(defn listar-auditorias-using-get-with-http-info
  "Lista as auditorias das oportunidades
  Este recurso permite listar as auditorias das oportunidades."
  ([] (listar-auditorias-using-get-with-http-info nil))
  ([{:keys [sort page limit id-status-oportunidade data-cadastro data-atualizacao numero-receita-federal data-inicio-vigencia datat-fim-vigencia flag-ativo rev-date rev-type rev-user ]}]
   (call-api "/api/auditorias-oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idStatusOportunidade" id-status-oportunidade "dataCadastro" data-cadastro "dataAtualizacao" data-atualizacao "numeroReceitaFederal" numero-receita-federal "dataInicioVigencia" data-inicio-vigencia "datatFimVigencia" datat-fim-vigencia "flagAtivo" flag-ativo "revDate" rev-date "revType" rev-type "revUser" rev-user }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-auditorias-using-get
  "Lista as auditorias das oportunidades
  Este recurso permite listar as auditorias das oportunidades."
  ([] (listar-auditorias-using-get nil))
  ([optional-params]
   (:data (listar-auditorias-using-get-with-http-info optional-params))))

(defn listar-auditorias-using-get1-with-http-info
  "Lista as auditorias dos tipos oportunidades
  Este recurso permite listar os tipos oportunidades."
  ([] (listar-auditorias-using-get1-with-http-info nil))
  ([{:keys [sort page limit rev-type rev-date id descricao flag-ativo rev-user ]}]
   (call-api "/api/auditorias-tipos-oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "revType" rev-type "revDate" rev-date "id" id "descricao" descricao "flagAtivo" flag-ativo "revUser" rev-user }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-auditorias-using-get1
  "Lista as auditorias dos tipos oportunidades
  Este recurso permite listar os tipos oportunidades."
  ([] (listar-auditorias-using-get1 nil))
  ([optional-params]
   (:data (listar-auditorias-using-get1-with-http-info optional-params))))

(defn listar-status-using-get-with-http-info
  "Lista os status do tipo oportunidades
  Este recurso permite listar os status do tipo oportunidades."
  ([id ] (listar-status-using-get-with-http-info id nil))
  ([id {:keys [sort page limit nome descricao flag-ativo ]}]
   (call-api "/api/tipos-oportunidades/{id}/status" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "descricao" descricao "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-status-using-get
  "Lista os status do tipo oportunidades
  Este recurso permite listar os status do tipo oportunidades."
  ([id ] (listar-status-using-get id nil))
  ([id optional-params]
   (:data (listar-status-using-get-with-http-info id optional-params))))

(defn listar-using-get14-with-http-info
  "Lista as oportunidades
  Este recurso permite listar as oportunidades."
  ([] (listar-using-get14-with-http-info nil))
  ([{:keys [sort page limit id-status-oportunidade data-cadastro data-atualizacao numero-receita-federal data-inicio-vigencia data-fim-vigencia flag-ativo ]}]
   (call-api "/api/oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idStatusOportunidade" id-status-oportunidade "dataCadastro" data-cadastro "dataAtualizacao" data-atualizacao "numeroReceitaFederal" numero-receita-federal "dataInicioVigencia" data-inicio-vigencia "dataFimVigencia" data-fim-vigencia "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get14
  "Lista as oportunidades
  Este recurso permite listar as oportunidades."
  ([] (listar-using-get14 nil))
  ([optional-params]
   (:data (listar-using-get14-with-http-info optional-params))))

(defn listar-using-get27-with-http-info
  "Lista os tipos oportunidades
  Este recurso permite listar os tipos oportunidades."
  ([] (listar-using-get27-with-http-info nil))
  ([{:keys [sort page limit descricao flag-ativo ]}]
   (call-api "/api/tipos-oportunidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "descricao" descricao "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get27
  "Lista os tipos oportunidades
  Este recurso permite listar os tipos oportunidades."
  ([] (listar-using-get27 nil))
  ([optional-params]
   (:data (listar-using-get27-with-http-info optional-params))))

(defn salvar-status-using-post-with-http-info
  "Cadastra status para o tipo oportunidade
  Esse recurso permite cadastrar status para o tipo oportunidade."
  [id persist ]
  (call-api "/api/tipos-oportunidades/{id}/status" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-status-using-post
  "Cadastra status para o tipo oportunidade
  Esse recurso permite cadastrar status para o tipo oportunidade."
  [id persist ]
  (:data (salvar-status-using-post-with-http-info id persist)))

(defn salvar-using-post12-with-http-info
  "Cadastra as oportunidades
  Esse recurso permite cadastrar oportunidades."
  [persist ]
  (call-api "/api/oportunidades" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post12
  "Cadastra as oportunidades
  Esse recurso permite cadastrar oportunidades."
  [persist ]
  (:data (salvar-using-post12-with-http-info persist)))

(defn salvar-using-post17-with-http-info
  "Cadastra tipos oportunidades
  Esse recurso permite cadastrar tipos oportunidades."
  [persist ]
  (call-api "/api/tipos-oportunidades" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post17
  "Cadastra tipos oportunidades
  Esse recurso permite cadastrar tipos oportunidades."
  [persist ]
  (:data (salvar-using-post17-with-http-info persist)))
