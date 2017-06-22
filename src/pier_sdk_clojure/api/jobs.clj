(ns pier-sdk-clojure.api.jobs
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ativar-job-using-post-with-http-info
  "Ativar Job
  Este recurso adiciona o job ao agendador de tarefas."
  [id ]
  (call-api "/api/jobs/{id}/ativar-job" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-job-using-post
  "Ativar Job
  Este recurso adiciona o job ao agendador de tarefas."
  [id ]
  (:data (ativar-job-using-post-with-http-info id)))

(defn atualizar-using-put-with-http-info
  "Atualizar Job
  Este recurso permite atualizar os dados de um job cadastrado."
  [id descricao cron groovy ]
  (call-api "/api/jobs/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"descricao" descricao "cron" cron }
             :form-params   {}
             :body-param    groovy
             :content-types ["text/plain"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put
  "Atualizar Job
  Este recurso permite atualizar os dados de um job cadastrado."
  [id descricao cron groovy ]
  (:data (atualizar-using-put-with-http-info id descricao cron groovy)))

(defn desativar-job-using-post-with-http-info
  "Desativar Job
  Este recurso retira o job do agendador de tarefas."
  [id ]
  (call-api "/api/jobs/{id}/desativar-job" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-job-using-post
  "Desativar Job
  Este recurso retira o job do agendador de tarefas."
  [id ]
  (:data (desativar-job-using-post-with-http-info id)))

(defn listar-using-get12-with-http-info
  "Listar Jobs
  Este recurso permite que sejam listados os jobs existentes na base do PIER."
  ([] (listar-using-get12-with-http-info nil))
  ([{:keys [groovy descricao cron status page limit ]}]
   (call-api "/api/jobs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"groovy" groovy "descricao" descricao "cron" cron "status" status "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get12
  "Listar Jobs
  Este recurso permite que sejam listados os jobs existentes na base do PIER."
  ([] (listar-using-get12 nil))
  ([optional-params]
   (:data (listar-using-get12-with-http-info optional-params))))

(defn salvar-using-post5-with-http-info
  "Cadastrar Job
  Esse recurso permite cadastrar jobs."
  [descricao cron groovy ]
  (call-api "/api/jobs" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"descricao" descricao "cron" cron }
             :form-params   {}
             :body-param    groovy
             :content-types ["text/plain"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post5
  "Cadastrar Job
  Esse recurso permite cadastrar jobs."
  [descricao cron groovy ]
  (:data (salvar-using-post5-with-http-info descricao cron groovy)))
