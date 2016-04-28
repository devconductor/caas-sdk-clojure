(ns pier-sdk-clojure.api.token
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn callback-using-post-with-http-info
  "/tokens/callback"
  [body-access-token ]
  (call-api "/api/v1/tokens/callback" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body-access-token
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn callback-using-post
  "/tokens/callback"
  [body-access-token ]
  (:data (callback-using-post-with-http-info body-access-token)))
