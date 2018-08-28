(ns pier-sdk-clojure.api.-global-tag-log-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn salvar-using-post19-with-http-info
  "{{{log_acesso_usuario_recurso_salvar}}}
  {{{log_acesso_usuario_recurso_salvar_notas}}}"
  [log-acesso-usuario-persist ]
  (call-api "/api/logs/log-acessos-usuario" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    log-acesso-usuario-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post19
  "{{{log_acesso_usuario_recurso_salvar}}}
  {{{log_acesso_usuario_recurso_salvar_notas}}}"
  [log-acesso-usuario-persist ]
  (:data (salvar-using-post19-with-http-info log-acesso-usuario-persist)))
