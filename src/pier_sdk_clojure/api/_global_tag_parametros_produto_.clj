(ns pier-sdk-clojure.api.-global-tag-parametros-produto-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-using-get37-with-http-info
  "{{{parametro_produto_listar}}}
  {{{parametro_produto_listar_notes}}}"
  ([] (listar-using-get37-with-http-info nil))
  ([{:keys [sort page limit id codigo tipo id-produto ]}]
   (call-api "/api/parametros-produto" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "codigo" codigo "tipo" tipo "idProduto" id-produto }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get37
  "{{{parametro_produto_listar}}}
  {{{parametro_produto_listar_notes}}}"
  ([] (listar-using-get37 nil))
  ([optional-params]
   (:data (listar-using-get37-with-http-info optional-params))))
