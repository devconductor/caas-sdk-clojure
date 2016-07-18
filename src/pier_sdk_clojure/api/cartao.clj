(ns pier-sdk-clojure.api.cartao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn bloquear-cartao-using-post-with-http-info
  "Bloqueia um cartÃ£o
  Bloquear um determinado cartÃ£o"
  ([id-conta id-cartao motivo ] (bloquear-cartao-using-post-with-http-info id-conta id-cartao motivo nil))
  ([id-conta id-cartao motivo {:keys [observacao ]}]
   (call-api "/api/contas/{idConta}/cartoes/{idCartao}/bloquear" :post
             {:path-params   {"idConta" id-conta "idCartao" id-cartao }
              :header-params {}
              :query-params  {"motivo" motivo "observacao" observacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn bloquear-cartao-using-post
  "Bloqueia um cartÃ£o
  Bloquear um determinado cartÃ£o"
  ([id-conta id-cartao motivo ] (bloquear-cartao-using-post id-conta id-cartao motivo nil))
  ([id-conta id-cartao motivo optional-params]
   (:data (bloquear-cartao-using-post-with-http-info id-conta id-cartao motivo optional-params))))

(defn consultar-cartao-using-get-with-http-info
  "Retorna um cartÃ£o
  Consultar as informaÃ§Ãµes de um determinado cartÃ£o de uma conta"
  ([id-conta id-cartao ] (consultar-cartao-using-get-with-http-info id-conta id-cartao nil))
  ([id-conta id-cartao {:keys [numero-cartao ]}]
   (call-api "/api/contas/{idConta}/cartoes/{idCartao}" :get
             {:path-params   {"idConta" id-conta "idCartao" id-cartao }
              :header-params {"numeroCartao" numero-cartao }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn consultar-cartao-using-get
  "Retorna um cartÃ£o
  Consultar as informaÃ§Ãµes de um determinado cartÃ£o de uma conta"
  ([id-conta id-cartao ] (consultar-cartao-using-get id-conta id-cartao nil))
  ([id-conta id-cartao optional-params]
   (:data (consultar-cartao-using-get-with-http-info id-conta id-cartao optional-params))))

(defn consultar-cartoes-using-get-with-http-info
  "Retorna todos os cartÃµes
  Consultar todos os cartÃµes de uma determinada conta"
  [id-conta ]
  (call-api "/api/contas/{idConta}/cartoes" :get
            {:path-params   {"idConta" id-conta }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-cartoes-using-get
  "Retorna todos os cartÃµes
  Consultar todos os cartÃµes de uma determinada conta"
  [id-conta ]
  (:data (consultar-cartoes-using-get-with-http-info id-conta)))

(defn desbloquear-cartao-using-post-with-http-info
  "Desbloqueia um cartÃ£o
  Desbloquear cartÃ£o de uma determinada conta"
  ([id-conta id-cartao ] (desbloquear-cartao-using-post-with-http-info id-conta id-cartao nil))
  ([id-conta id-cartao {:keys [codigo-segurancao ]}]
   (call-api "/api/contas/{idConta}/cartoes/{idCartao}/desbloquear" :post
             {:path-params   {"idConta" id-conta "idCartao" id-cartao }
              :header-params {"codigoSegurancao" codigo-segurancao }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn desbloquear-cartao-using-post
  "Desbloqueia um cartÃ£o
  Desbloquear cartÃ£o de uma determinada conta"
  ([id-conta id-cartao ] (desbloquear-cartao-using-post id-conta id-cartao nil))
  ([id-conta id-cartao optional-params]
   (:data (desbloquear-cartao-using-post-with-http-info id-conta id-cartao optional-params))))

(defn embossado-cartao-using-put-with-http-info
  "Embossado
  NÃ³s informe caso tenha embossado algum cartÃ£o."
  [id-conta id-cartao ]
  (call-api "/api/contas/{idConta}/cartoes/{idCartao}/embossado" :put
            {:path-params   {"idConta" id-conta "idCartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn embossado-cartao-using-put
  "Embossado
  NÃ³s informe caso tenha embossado algum cartÃ£o."
  [id-conta id-cartao ]
  (:data (embossado-cartao-using-put-with-http-info id-conta id-cartao)))
