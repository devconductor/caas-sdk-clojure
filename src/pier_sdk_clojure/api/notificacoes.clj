(ns pier-sdk-clojure.api.notificacoes
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-sms-using-post-with-http-info
  "Atualizar SMS
  Esse recurso permite atualizar o status do SMS do emissor"
  [nsu status data texto-status operadora ]
  (call-api "/api/notificacoes/sms/atualizar-status" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"nsu" nsu "status" status "data" data "texto_status" texto-status "operadora" operadora }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn atualizar-sms-using-post
  "Atualizar SMS
  Esse recurso permite atualizar o status do SMS do emissor"
  [nsu status data texto-status operadora ]
  (:data (atualizar-sms-using-post-with-http-info nsu status data texto-status operadora)))

(defn limpar-acesso-tww-using-get-with-http-info
  "Limpar Acessos
  Esse recurso permite limpar a lista de emissores que possuem acesso a envio de SMS pela TWW."
  []
  (call-api "/api/notificacoes/sms/limpar" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn limpar-acesso-tww-using-get
  "Limpar Acessos
  Esse recurso permite limpar a lista de emissores que possuem acesso a envio de SMS pela TWW."
  []
  (:data (limpar-acesso-tww-using-get-with-http-info)))

(defn listar-push-using-get-with-http-info
  "Listar Push
  Esse recurso permite listar os Pushes do emissor"
  ([] (listar-push-using-get-with-http-info nil))
  ([{:keys [page limit data-envio evento status plataforma protocolo ]}]
   (call-api "/api/notificacoes/push" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "dataEnvio" data-envio "evento" evento "status" status "plataforma" plataforma "protocolo" protocolo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-push-using-get
  "Listar Push
  Esse recurso permite listar os Pushes do emissor"
  ([] (listar-push-using-get nil))
  ([optional-params]
   (:data (listar-push-using-get-with-http-info optional-params))))

(defn listar-sms-using-get-with-http-info
  "Listar SMS
  Esse recurso permite listar os SMS do emissor"
  ([] (listar-sms-using-get-with-http-info nil))
  ([{:keys [page limit data-inclusao evento status operadora protocolo ]}]
   (call-api "/api/notificacoes/sms" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "dataInclusao" data-inclusao "evento" evento "status" status "operadora" operadora "protocolo" protocolo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-sms-using-get
  "Listar SMS
  Esse recurso permite listar os SMS do emissor"
  ([] (listar-sms-using-get nil))
  ([optional-params]
   (:data (listar-sms-using-get-with-http-info optional-params))))

(defn responder-sms-using-post-with-http-info
  "Responder SMS
  Esse recurso permite atualizar a resposta do SMS, fornecida pedo usuÃ¡rio"
  [nsu data resposta ]
  (call-api "/api/notificacoes/sms/responder" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"nsu" nsu "data" data "resposta" resposta }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn responder-sms-using-post
  "Responder SMS
  Esse recurso permite atualizar a resposta do SMS, fornecida pedo usuÃ¡rio"
  [nsu data resposta ]
  (:data (responder-sms-using-post-with-http-info nsu data resposta)))

(defn salvar-push-fcm-using-post-with-http-info
  "Enviar Push FCM
  Esse recurso permite enviar Push para um determinado dipositivo movel atravÃ©s da plataforma FCM (Firebase Cloud Messaging)."
  [push-persists ]
  (call-api "/api/notificacoes/push/fcm" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    push-persists
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn salvar-push-fcm-using-post
  "Enviar Push FCM
  Esse recurso permite enviar Push para um determinado dipositivo movel atravÃ©s da plataforma FCM (Firebase Cloud Messaging)."
  [push-persists ]
  (:data (salvar-push-fcm-using-post-with-http-info push-persists)))

(defn salvar-push-gcm-using-post-with-http-info
  "Enviar Push GCM
  Esse recurso permite enviar Push para um determinado dipositivo movel atravÃ©s da plataforma GCM (Google Cloud Messaging)."
  [push-persists ]
  (call-api "/api/notificacoes/push/gcm" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    push-persists
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn salvar-push-gcm-using-post
  "Enviar Push GCM
  Esse recurso permite enviar Push para um determinado dipositivo movel atravÃ©s da plataforma GCM (Google Cloud Messaging)."
  [push-persists ]
  (:data (salvar-push-gcm-using-post-with-http-info push-persists)))

(defn salvar-push-using-post-with-http-info
  "Enviar Push APNS
  Esse recurso permite enviar Push para um determinado dipositivo movel atravÃ©s da plataforma APNS (Apple Push Notification Service)."
  [push-persists ]
  (call-api "/api/notificacoes/push/apns" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    push-persists
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn salvar-push-using-post
  "Enviar Push APNS
  Esse recurso permite enviar Push para um determinado dipositivo movel atravÃ©s da plataforma APNS (Apple Push Notification Service)."
  [push-persists ]
  (:data (salvar-push-using-post-with-http-info push-persists)))

(defn salvar-sms-using-post-with-http-info
  "Enviar SMS
  Esse recurso permite enviar uma lista de SMS."
  [lista-sms ]
  (call-api "/api/notificacoes/sms" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    lista-sms
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn salvar-sms-using-post
  "Enviar SMS
  Esse recurso permite enviar uma lista de SMS."
  [lista-sms ]
  (:data (salvar-sms-using-post-with-http-info lista-sms)))
