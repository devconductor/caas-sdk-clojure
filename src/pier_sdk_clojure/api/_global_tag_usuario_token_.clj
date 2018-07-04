(ns pier-sdk-clojure.api.-global-tag-usuario-token-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn incrementar-tentativa-using-put-with-http-info
  "{{{usuario_token_recurso_controle_tentativa_cadastro_incrementar}}}
  {{{usuario_token_recurso_controle_tentativa_cadastro_incrementar_notas}}}"
  [cpf ]
  (call-api "/api/usuarios-tokens/incrementar-tentativas" :put
            {:path-params   {}
             :header-params {}
             :query-params  {"cpf" cpf }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn incrementar-tentativa-using-put
  "{{{usuario_token_recurso_controle_tentativa_cadastro_incrementar}}}
  {{{usuario_token_recurso_controle_tentativa_cadastro_incrementar_notas}}}"
  [cpf ]
  (:data (incrementar-tentativa-using-put-with-http-info cpf)))

(defn verificar-tentativa-using-get-with-http-info
  "{{{usuario_token_recurso_controle_tentativa_cadastro_verificar}}}
  {{{usuario_token_recurso_controle_tentativa_cadastro_verificar_notas}}}"
  [cpf ]
  (call-api "/api/usuarios-tokens/verificar-tentativas" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"cpf" cpf }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn verificar-tentativa-using-get
  "{{{usuario_token_recurso_controle_tentativa_cadastro_verificar}}}
  {{{usuario_token_recurso_controle_tentativa_cadastro_verificar_notas}}}"
  [cpf ]
  (:data (verificar-tentativa-using-get-with-http-info cpf)))
