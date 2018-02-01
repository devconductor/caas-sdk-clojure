(ns pier-sdk-clojure.api.faturamento
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-tipo-faturamento-using-put-with-http-info
  "Alterar Faturamento
  Alterar as configuraÃ§Ãµes de um determinado tipo de faturamento"
  [id tipo-faturamento-persist ]
  (call-api "/api/tipos-faturamento/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    tipo-faturamento-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-tipo-faturamento-using-put
  "Alterar Faturamento
  Alterar as configuraÃ§Ãµes de um determinado tipo de faturamento"
  [id tipo-faturamento-persist ]
  (:data (alterar-tipo-faturamento-using-put-with-http-info id tipo-faturamento-persist)))

(defn cadastrar-faturamento-por-conta-using-post-with-http-info
  "Adiciona uma nova configuraÃ§Ã£o de faturamento para uma conta
  Este mÃ©todo permite adicionar uma nova configuraÃ§Ã£o de tipo de faturamento para um conta especÃ­fica."
  [tipo-faturamento-por-conta-persist ]
  (call-api "/api/tipos-faturamento-conta" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    tipo-faturamento-por-conta-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-faturamento-por-conta-using-post
  "Adiciona uma nova configuraÃ§Ã£o de faturamento para uma conta
  Este mÃ©todo permite adicionar uma nova configuraÃ§Ã£o de tipo de faturamento para um conta especÃ­fica."
  [tipo-faturamento-por-conta-persist ]
  (:data (cadastrar-faturamento-por-conta-using-post-with-http-info tipo-faturamento-por-conta-persist)))

(defn cadastrar-tipo-faturamento-using-post-with-http-info
  "Adiciona um novo faturamento
  Adiciona uma nova configuraÃ§Ã£o de tipo de faturamento"
  [tipo-faturamento-persist ]
  (call-api "/api/tipos-faturamento" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    tipo-faturamento-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-tipo-faturamento-using-post
  "Adiciona um novo faturamento
  Adiciona uma nova configuraÃ§Ã£o de tipo de faturamento"
  [tipo-faturamento-persist ]
  (:data (cadastrar-tipo-faturamento-using-post-with-http-info tipo-faturamento-persist)))

(defn consultar-tipo-faturamento-using-get-with-http-info
  "Consultar Faturamento por id
  Consulta os detalhes de uma determinada Faturamento"
  [id ]
  (call-api "/api/tipos-faturamento/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-tipo-faturamento-using-get
  "Consultar Faturamento por id
  Consulta os detalhes de uma determinada Faturamento"
  [id ]
  (:data (consultar-tipo-faturamento-using-get-with-http-info id)))

(defn desativar-faturamento-por-conta-using-post-with-http-info
  "Desativar uma configuraÃ§Ã£o de tipo de faturamento por conta atravÃ©s do id
  Desativa uma configuraÃ§Ã£o de tipo de faturamento de uma determinada conta."
  [id modificado-por ]
  (call-api "/api/tipos-faturamento-conta/{id}/desativar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    modificado-por
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-faturamento-por-conta-using-post
  "Desativar uma configuraÃ§Ã£o de tipo de faturamento por conta atravÃ©s do id
  Desativa uma configuraÃ§Ã£o de tipo de faturamento de uma determinada conta."
  [id modificado-por ]
  (:data (desativar-faturamento-por-conta-using-post-with-http-info id modificado-por)))

(defn desativar-tipo-faturamento-using-post-with-http-info
  "Desativar uma configuraÃ§Ã£o de tipo de faturamento atravÃ©s do id
  Desativa uma configuraÃ§Ã£o de tipo de faturamento."
  [id ]
  (call-api "/api/tipos-faturamento/{id}/desativar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-tipo-faturamento-using-post
  "Desativar uma configuraÃ§Ã£o de tipo de faturamento atravÃ©s do id
  Desativa uma configuraÃ§Ã£o de tipo de faturamento."
  [id ]
  (:data (desativar-tipo-faturamento-using-post-with-http-info id)))

(defn listar-faturamento-por-conta-using-get-with-http-info
  "Lista as configuraÃ§Ãµes de tipos de faturamento por conta
  Este mÃ©todo permite listar as configuraÃ§Ãµes de tipos de faturamento registrados a uma conta."
  ([] (listar-faturamento-por-conta-using-get-with-http-info nil))
  ([{:keys [sort page limit id-tipo-faturamento-por-conta status id-conta id-tipo-faturamento data-hora-inclusao data-hora-cancelamento modificado-por ]}]
   (call-api "/api/tipos-faturamento-conta" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoFaturamentoPorConta" id-tipo-faturamento-por-conta "status" status "idConta" id-conta "idTipoFaturamento" id-tipo-faturamento "dataHoraInclusao" data-hora-inclusao "dataHoraCancelamento" data-hora-cancelamento "modificadoPor" modificado-por }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-faturamento-por-conta-using-get
  "Lista as configuraÃ§Ãµes de tipos de faturamento por conta
  Este mÃ©todo permite listar as configuraÃ§Ãµes de tipos de faturamento registrados a uma conta."
  ([] (listar-faturamento-por-conta-using-get nil))
  ([optional-params]
   (:data (listar-faturamento-por-conta-using-get-with-http-info optional-params))))

(defn listar-tipo-faturamento-using-get-with-http-info
  "Lista Tipos de Faturamento
  Lista todas as configuraÃ§Ãµes dos tipos de faturamento"
  ([] (listar-tipo-faturamento-using-get-with-http-info nil))
  ([{:keys [sort page limit id-tipo-faturamento descricao flag-apenas-demonstrativo id-convenio ]}]
   (call-api "/api/tipos-faturamento" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoFaturamento" id-tipo-faturamento "descricao" descricao "flagApenasDemonstrativo" flag-apenas-demonstrativo "idConvenio" id-convenio }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipo-faturamento-using-get
  "Lista Tipos de Faturamento
  Lista todas as configuraÃ§Ãµes dos tipos de faturamento"
  ([] (listar-tipo-faturamento-using-get nil))
  ([optional-params]
   (:data (listar-tipo-faturamento-using-get-with-http-info optional-params))))
