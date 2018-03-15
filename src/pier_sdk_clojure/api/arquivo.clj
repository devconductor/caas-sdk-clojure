(ns pier-sdk-clojure.api.arquivo
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get3-with-http-info
  "Consulta de arquivo no PIER Cloud
  Este recurso permite consultar um determinado arquivo armazenado no PIER Cloud."
  [id ]
  (call-api "/api/arquivos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get3
  "Consulta de arquivo no PIER Cloud
  Este recurso permite consultar um determinado arquivo armazenado no PIER Cloud."
  [id ]
  (:data (consultar-using-get3-with-http-info id)))

(defn integrar-using-post-with-http-info
  "Integrar Arquivos
  Este recurso foi desenvolvido para realizar a integração de arquivos do PIER Cloud junto a repositórios externos pré-configurado."
  [integrar-arquivo-request ]
  (call-api "/api/arquivos/integrar" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    integrar-arquivo-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn integrar-using-post
  "Integrar Arquivos
  Este recurso foi desenvolvido para realizar a integração de arquivos do PIER Cloud junto a repositórios externos pré-configurado."
  [integrar-arquivo-request ]
  (:data (integrar-using-post-with-http-info integrar-arquivo-request)))

(defn listar-por-numero-receita-federal-using-get-with-http-info
  "Lista as auditorias de arquivos vinculadas a um Número da Receita Federal
  Este recurso permite listar as auditorias de arquivos vinculadas a um Número da Receita Federal que será passado como parâmetro."
  ([numero-receita-federal ] (listar-por-numero-receita-federal-using-get-with-http-info numero-receita-federal nil))
  ([numero-receita-federal {:keys [page limit ]}]
   (call-api "/api/arquivos-auditorias" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"numeroReceitaFederal" numero-receita-federal "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-por-numero-receita-federal-using-get
  "Lista as auditorias de arquivos vinculadas a um Número da Receita Federal
  Este recurso permite listar as auditorias de arquivos vinculadas a um Número da Receita Federal que será passado como parâmetro."
  ([numero-receita-federal ] (listar-por-numero-receita-federal-using-get numero-receita-federal nil))
  ([numero-receita-federal optional-params]
   (:data (listar-por-numero-receita-federal-using-get-with-http-info numero-receita-federal optional-params))))

(defn listar-status-arquivos-using-get-with-http-info
  "Listar Status de Arquivo
  Este recurso permite a listagem de todos os Status de Arquivo."
  ([] (listar-status-arquivos-using-get-with-http-info nil))
  ([{:keys [sort page limit nome descricao ]}]
   (call-api "/api/status-arquivos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-status-arquivos-using-get
  "Listar Status de Arquivo
  Este recurso permite a listagem de todos os Status de Arquivo."
  ([] (listar-status-arquivos-using-get nil))
  ([optional-params]
   (:data (listar-status-arquivos-using-get-with-http-info optional-params))))

(defn listar-tipos-arquivos-using-get-with-http-info
  "Listar Tipos de Arquivo
  Este recurso permite a listagem de todos os Tipos de Arquivo."
  ([] (listar-tipos-arquivos-using-get-with-http-info nil))
  ([{:keys [sort page limit nome descricao ]}]
   (call-api "/api/tipos-arquivos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-arquivos-using-get
  "Listar Tipos de Arquivo
  Este recurso permite a listagem de todos os Tipos de Arquivo."
  ([] (listar-tipos-arquivos-using-get nil))
  ([optional-params]
   (:data (listar-tipos-arquivos-using-get-with-http-info optional-params))))

(defn listar-using-get4-with-http-info
  "Lista as auditorias do arquivo
  Este recurso permite listar as auditorias de um determinado arquivo a partir do seu código de identificação (id)."
  ([id ] (listar-using-get4-with-http-info id nil))
  ([id {:keys [page limit ]}]
   (call-api "/api/arquivos/{id}/auditorias" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get4
  "Lista as auditorias do arquivo
  Este recurso permite listar as auditorias de um determinado arquivo a partir do seu código de identificação (id)."
  ([id ] (listar-using-get4 id nil))
  ([id optional-params]
   (:data (listar-using-get4-with-http-info id optional-params))))

(defn listar-using-get5-with-http-info
  "Listar arquivos do Pier Cloud
  Este recurso permite a listagem de todos os arquivos disponíveis no Pier Cloud."
  ([] (listar-using-get5-with-http-info nil))
  ([{:keys [sort page limit nome id-tipo-arquivo id-status-arquivo extensao ]}]
   (call-api "/api/arquivos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "idTipoArquivo" id-tipo-arquivo "idStatusArquivo" id-status-arquivo "extensao" extensao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get5
  "Listar arquivos do Pier Cloud
  Este recurso permite a listagem de todos os arquivos disponíveis no Pier Cloud."
  ([] (listar-using-get5 nil))
  ([optional-params]
   (:data (listar-using-get5-with-http-info optional-params))))

(defn salvar-using-post1-with-http-info
  "Permite armazenar arquivos no PIER Cloud
  Este recurso permite o armazenamento de arquivos no PIER Cloud."
  [arquivo-persist ]
  (call-api "/api/arquivos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    arquivo-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post1
  "Permite armazenar arquivos no PIER Cloud
  Este recurso permite o armazenamento de arquivos no PIER Cloud."
  [arquivo-persist ]
  (:data (salvar-using-post1-with-http-info arquivo-persist)))
