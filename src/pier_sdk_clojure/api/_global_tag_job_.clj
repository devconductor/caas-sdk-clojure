(ns pier-sdk-clojure.api.-global-tag-job-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ativar-job-using-post-with-http-info
  "{{{job_resource_ativar_job}}}
  {{{job_resource_ativar_job_notes}}}"
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
  "{{{job_resource_ativar_job}}}
  {{{job_resource_ativar_job_notes}}}"
  [id ]
  (:data (ativar-job-using-post-with-http-info id)))

(defn atualizar-using-put4-with-http-info
  "{{{job_resource_atualizar}}}
  {{{job_resource_atualizar_notes}}}"
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

(defn atualizar-using-put4
  "{{{job_resource_atualizar}}}
  {{{job_resource_atualizar_notes}}}"
  [id descricao cron groovy ]
  (:data (atualizar-using-put4-with-http-info id descricao cron groovy)))

(defn desativar-job-using-post-with-http-info
  "{{{job_resource_desativar_job}}}
  {{{job_resource_desativar_job_notes}}}"
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
  "{{{job_resource_desativar_job}}}
  {{{job_resource_desativar_job_notes}}}"
  [id ]
  (:data (desativar-job-using-post-with-http-info id)))

(defn listar-using-get31-with-http-info
  "{{{job_resource_listar}}}
  {{{job_resource_listar_notes}}}"
  ([] (listar-using-get31-with-http-info nil))
  ([{:keys [groovy descricao cron status page limit ]}]
   (call-api "/api/jobs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"groovy" groovy "descricao" descricao "cron" cron "status" status "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get31
  "{{{job_resource_listar}}}
  {{{job_resource_listar_notes}}}"
  ([] (listar-using-get31 nil))
  ([optional-params]
   (:data (listar-using-get31-with-http-info optional-params))))

(defn salvar-using-post17-with-http-info
  "{{{job_resource_salvar}}}
  {{{job_resource_salvar_notes}}}"
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

(defn salvar-using-post17
  "{{{job_resource_salvar}}}
  {{{job_resource_salvar_notes}}}"
  [descricao cron groovy ]
  (:data (salvar-using-post17-with-http-info descricao cron groovy)))
