(ns pier-sdk-clojure.api.-global-tag-tipo-chave-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-tipo-chave-using-get-with-http-info
  "{{{tipo_chave_resource_listar_tipos_chaves}}}
  {{{tipo_chave_resource_listar_tipos_chaves_notes}}}"
  ([] (listar-tipo-chave-using-get-with-http-info nil))
  ([{:keys [sort page limit id descricao ]}]
   (call-api "/api/tipos-chaves" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipo-chave-using-get
  "{{{tipo_chave_resource_listar_tipos_chaves}}}
  {{{tipo_chave_resource_listar_tipos_chaves_notes}}}"
  ([] (listar-tipo-chave-using-get nil))
  ([optional-params]
   (:data (listar-tipo-chave-using-get-with-http-info optional-params))))
