(ns pier-sdk-clojure.api.mock
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-produto-using-post-with-http-info
  "Altera o produto associado Ã  conta.
  O recurso permite fazer modificaÃ§Ã£o do produto associado Ã  conta."
  [id request ]
  (call-api "/api/contas/{id}/alterar-produto" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-produto-using-post
  "Altera o produto associado Ã  conta.
  O recurso permite fazer modificaÃ§Ã£o do produto associado Ã  conta."
  [id request ]
  (:data (alterar-produto-using-post-with-http-info id request)))
