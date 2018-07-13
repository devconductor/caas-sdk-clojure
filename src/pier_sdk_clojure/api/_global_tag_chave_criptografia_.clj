(ns pier-sdk-clojure.api.-global-tag-chave-criptografia-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn descriptografar-using-post-with-http-info
  "{{{chave_criptografia_recurso_descriptografar}}}
  {{{chave_criptografia_recurso_descriptografar_notas}}}"
  [chave-criptografia-request ]
  (call-api "/api/chaves-criptografia/descriptografar" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    chave-criptografia-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn descriptografar-using-post
  "{{{chave_criptografia_recurso_descriptografar}}}
  {{{chave_criptografia_recurso_descriptografar_notas}}}"
  [chave-criptografia-request ]
  (:data (descriptografar-using-post-with-http-info chave-criptografia-request)))
