(ns pier-sdk-clojure.api.-global-tag-parametro-emissor-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get29-with-http-info
  "{{{parametro_emissor_recurso}}}
  {{{parametro_emissor_recurso_notas}}}"
  [codigo ]
  (call-api "/api/parametros-emissor/{codigo}" :get
            {:path-params   {"codigo" codigo }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get29
  "{{{parametro_emissor_recurso}}}
  {{{parametro_emissor_recurso_notas}}}"
  [codigo ]
  (:data (consultar-using-get29-with-http-info codigo)))
