(ns pier-sdk-clojure.api.notificacao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-configuracao-using-put-with-http-info
  "Altera configurações de E-mail
  Esse recurso permite salvar alterações de configurações de E-mail."
  [id persist ]
  (call-api "/api/configuracoes-email/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-configuracao-using-put
  "Altera configurações de E-mail
  Esse recurso permite salvar alterações de configurações de E-mail."
  [id persist ]
  (:data (alterar-configuracao-using-put-with-http-info id persist)))

(defn alterar-template-notificacao-using-put-with-http-info
  "Alterar template de notificação
  Esse recurso permite salvar alterações de templates notificações."
  ([id conteudo ] (alterar-template-notificacao-using-put-with-http-info id conteudo nil))
  ([id conteudo {:keys [id-configuracao-email tipo-layout tipo-notificacao remetente assunto template-padrao ]}]
   (call-api "/api/templates-notificacoes/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"idConfiguracaoEmail" id-configuracao-email "tipoLayout" tipo-layout "tipoNotificacao" tipo-notificacao "remetente" remetente "assunto" assunto "templatePadrao" template-padrao }
              :form-params   {}
              :body-param    conteudo
              :content-types ["text/plain"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-template-notificacao-using-put
  "Alterar template de notificação
  Esse recurso permite salvar alterações de templates notificações."
  ([id conteudo ] (alterar-template-notificacao-using-put id conteudo nil))
  ([id conteudo optional-params]
   (:data (alterar-template-notificacao-using-put-with-http-info id conteudo optional-params))))

(defn atualizar-sms-using-post-with-http-info
  "Atualizar SMS
  Esse recurso permite atualizar o status do SMS do emissor"
  ([] (atualizar-sms-using-post-with-http-info nil))
  ([{:keys [nsu status data texto-status operadora ]}]
   (call-api "/api/notificacoes/sms/atualizar-status" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"nsu" nsu "status" status "data" data "texto_status" texto-status "operadora" operadora }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn atualizar-sms-using-post
  "Atualizar SMS
  Esse recurso permite atualizar o status do SMS do emissor"
  ([] (atualizar-sms-using-post nil))
  ([optional-params]
   (:data (atualizar-sms-using-post-with-http-info optional-params))))

(defn consultar-configuracao-using-get-with-http-info
  "Consulta configuração de E-mail
  Esse recurso permite consultar uma configuração específica por id."
  [id ]
  (call-api "/api/configuracoes-email/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-configuracao-using-get
  "Consulta configuração de E-mail
  Esse recurso permite consultar uma configuração específica por id."
  [id ]
  (:data (consultar-configuracao-using-get-with-http-info id)))

(defn consultar-por-email-using-get-with-http-info
  "Consulta código de segurança E-mail
  Esse recurso permite consultar um código de segurança E-mail específico por id."
  [id ]
  (call-api "/api/codigos-seguranca-email/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-por-email-using-get
  "Consulta código de segurança E-mail
  Esse recurso permite consultar um código de segurança E-mail específico por id."
  [id ]
  (:data (consultar-por-email-using-get-with-http-info id)))

(defn consultar-por-sms-using-get-with-http-info
  "Consulta código de segurança SMS
  Esse recurso permite consultar um código de segurança SMS específico por id."
  [id ]
  (call-api "/api/codigos-seguranca-sms/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-por-sms-using-get
  "Consulta código de segurança SMS
  Esse recurso permite consultar um código de segurança SMS específico por id."
  [id ]
  (:data (consultar-por-sms-using-get-with-http-info id)))

(defn consultar-template-notificacao-using-get-with-http-info
  "Consulta template de notificação
  Esse recurso permite consultar uma configuração específica por id."
  [id ]
  (call-api "/api/templates-notificacoes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-template-notificacao-using-get
  "Consulta template de notificação
  Esse recurso permite consultar uma configuração específica por id."
  [id ]
  (:data (consultar-template-notificacao-using-get-with-http-info id)))

(defn gerar-token-email-using-post-with-http-info
  "Gerar código de segurança e enviar por e-mail
  Esse recurso permite gerar e enviar códigos de segurança por e-mail, para validação de dispositivos."
  [email ]
  (call-api "/api/notificacoes-email/gerar-codigo-seguranca" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    email
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-token-email-using-post
  "Gerar código de segurança e enviar por e-mail
  Esse recurso permite gerar e enviar códigos de segurança por e-mail, para validação de dispositivos."
  [email ]
  (:data (gerar-token-email-using-post-with-http-info email)))

(defn gerar-token-sms-using-post-with-http-info
  "Gerar código de segurança e enviar por sms
  Esse recurso permite gerar e enviar códigos de segurança por sms, para validação de dispositivos."
  [persist ]
  (call-api "/api/notificacoes-sms/gerar-codigo-seguranca" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-token-sms-using-post
  "Gerar código de segurança e enviar por sms
  Esse recurso permite gerar e enviar códigos de segurança por sms, para validação de dispositivos."
  [persist ]
  (:data (gerar-token-sms-using-post-with-http-info persist)))

(defn listar-configuracao-using-get-with-http-info
  "Lista configurações de E-mails
  Esse recurso permite listar as configurações de E-mails."
  ([] (listar-configuracao-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/configuracoes-email" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-configuracao-using-get
  "Lista configurações de E-mails
  Esse recurso permite listar as configurações de E-mails."
  ([] (listar-configuracao-using-get nil))
  ([optional-params]
   (:data (listar-configuracao-using-get-with-http-info optional-params))))

(defn listar-por-email-using-get-with-http-info
  "Lista os códigos de segurança E-Mail
  Esse recurso permite listar os codigos de segurança por E-Mail."
  ([] (listar-por-email-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/codigos-seguranca-email" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-por-email-using-get
  "Lista os códigos de segurança E-Mail
  Esse recurso permite listar os codigos de segurança por E-Mail."
  ([] (listar-por-email-using-get nil))
  ([optional-params]
   (:data (listar-por-email-using-get-with-http-info optional-params))))

(defn listar-por-sms-using-get-with-http-info
  "Lista os códigos de segurança SMS
  Esse recurso permite listar os codigos de segurança por SMS."
  ([] (listar-por-sms-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/codigos-seguranca-sms" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-por-sms-using-get
  "Lista os códigos de segurança SMS
  Esse recurso permite listar os codigos de segurança por SMS."
  ([] (listar-por-sms-using-get nil))
  ([optional-params]
   (:data (listar-por-sms-using-get-with-http-info optional-params))))

(defn listar-push-using-get-with-http-info
  "Listar Push
  Esse recurso permite listar os Pushes do emissor"
  ([] (listar-push-using-get-with-http-info nil))
  ([{:keys [sort page limit data-envio tipo-evento status plataforma protocolo ]}]
   (call-api "/api/notificacoes/push" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataEnvio" data-envio "tipoEvento" tipo-evento "status" status "plataforma" plataforma "protocolo" protocolo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

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
  ([{:keys [sort page limit data-inclusao tipo-evento status operadora protocolo nsu ]}]
   (call-api "/api/notificacoes/sms" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataInclusao" data-inclusao "tipoEvento" tipo-evento "status" status "operadora" operadora "protocolo" protocolo "nsu" nsu }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-sms-using-get
  "Listar SMS
  Esse recurso permite listar os SMS do emissor"
  ([] (listar-sms-using-get nil))
  ([optional-params]
   (:data (listar-sms-using-get-with-http-info optional-params))))

(defn listar-template-notificacao-using-get-with-http-info
  "Lista templates de notificações
  Esse recurso permite listar templates notificações."
  ([] (listar-template-notificacao-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/templates-notificacoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-template-notificacao-using-get
  "Lista templates de notificações
  Esse recurso permite listar templates notificações."
  ([] (listar-template-notificacao-using-get nil))
  ([optional-params]
   (:data (listar-template-notificacao-using-get-with-http-info optional-params))))

(defn listar-tipos-layouts-using-get-with-http-info
  "Lista os tipos templates de notificação
  Esse recurso permite listar os tipos de templates disponíveis os parâmetros devem ser usados entre chaves. Ex: {{nomeParametro}} ."
  []
  (call-api "/api/tipos-layouts" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-tipos-layouts-using-get
  "Lista os tipos templates de notificação
  Esse recurso permite listar os tipos de templates disponíveis os parâmetros devem ser usados entre chaves. Ex: {{nomeParametro}} ."
  []
  (:data (listar-tipos-layouts-using-get-with-http-info)))

(defn notificacao-email-using-post-with-http-info
  "Enviar notificação por email
  Esse recurso permite enviar uma mensagem de notificação por email"
  [request ]
  (call-api "/api/notificacoes-email" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn notificacao-email-using-post
  "Enviar notificação por email
  Esse recurso permite enviar uma mensagem de notificação por email"
  [request ]
  (:data (notificacao-email-using-post-with-http-info request)))

(defn reenviar-token-sms-using-post-with-http-info
  "Reenviar código de segurança por sms
  Esse recurso permite que seja reenviado para um determinado número de telefone, através de SMS, o código de segurança gerado previamente para ele. Caso o código de segurança já não esteja mais válido, o recurso retornará uma mensagem orientando que seja solicitada uma nova geração para o telefone em questão."
  [persist ]
  (call-api "/api/notificacoes-sms/reenviar-codigo-seguranca" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn reenviar-token-sms-using-post
  "Reenviar código de segurança por sms
  Esse recurso permite que seja reenviado para um determinado número de telefone, através de SMS, o código de segurança gerado previamente para ele. Caso o código de segurança já não esteja mais válido, o recurso retornará uma mensagem orientando que seja solicitada uma nova geração para o telefone em questão."
  [persist ]
  (:data (reenviar-token-sms-using-post-with-http-info persist)))

(defn responder-sms-get-using-get-with-http-info
  "Responder SMS
  Esse recurso permite atualizar a resposta do SMS, fornecida pedo usuário"
  ([] (responder-sms-get-using-get-with-http-info nil))
  ([{:keys [nsu data resposta ]}]
   (call-api "/api/notificacoes/sms/responder" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"nsu" nsu "data" data "resposta" resposta }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn responder-sms-get-using-get
  "Responder SMS
  Esse recurso permite atualizar a resposta do SMS, fornecida pedo usuário"
  ([] (responder-sms-get-using-get nil))
  ([optional-params]
   (:data (responder-sms-get-using-get-with-http-info optional-params))))

(defn salvar-configuracao-using-post-with-http-info
  "Salva configurações de E-mail
  Esse recurso salvar configurações de E-mail."
  [persist ]
  (call-api "/api/configuracoes-email" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-configuracao-using-post
  "Salva configurações de E-mail
  Esse recurso salvar configurações de E-mail."
  [persist ]
  (:data (salvar-configuracao-using-post-with-http-info persist)))

(defn salvar-push-fcm-using-post-with-http-info
  "Enviar Push FCM
  Esse recurso permite enviar Push para um determinado dipositivo movel através da plataforma FCM (Firebase Cloud Messaging)."
  [push-persists ]
  (call-api "/api/notificacoes/push/fcm" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    push-persists
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-push-fcm-using-post
  "Enviar Push FCM
  Esse recurso permite enviar Push para um determinado dipositivo movel através da plataforma FCM (Firebase Cloud Messaging)."
  [push-persists ]
  (:data (salvar-push-fcm-using-post-with-http-info push-persists)))

(defn salvar-push-gcm-using-post-with-http-info
  "Enviar Push GCM
  Esse recurso permite enviar Push para um determinado dipositivo movel através da plataforma GCM (Google Cloud Messaging)."
  [push-persists ]
  (call-api "/api/notificacoes/push/gcm" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    push-persists
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-push-gcm-using-post
  "Enviar Push GCM
  Esse recurso permite enviar Push para um determinado dipositivo movel através da plataforma GCM (Google Cloud Messaging)."
  [push-persists ]
  (:data (salvar-push-gcm-using-post-with-http-info push-persists)))

(defn salvar-push-using-post-with-http-info
  "Enviar Push APNS
  Esse recurso permite enviar Push para um determinado dipositivo movel através da plataforma APNS (Apple Push Notification Service)."
  [push-persists ]
  (call-api "/api/notificacoes/push/apns" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    push-persists
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-push-using-post
  "Enviar Push APNS
  Esse recurso permite enviar Push para um determinado dipositivo movel através da plataforma APNS (Apple Push Notification Service)."
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
             :auth-names    []}))

(defn salvar-sms-using-post
  "Enviar SMS
  Esse recurso permite enviar uma lista de SMS."
  [lista-sms ]
  (:data (salvar-sms-using-post-with-http-info lista-sms)))

(defn salvar-template-notificacao-using-post-with-http-info
  "Salva template de notificação
  Esse recurso salvar template notificaçõe."
  ([conteudo ] (salvar-template-notificacao-using-post-with-http-info conteudo nil))
  ([conteudo {:keys [id-configuracao-email tipo-layout tipo-notificacao remetente assunto template-padrao ]}]
   (call-api "/api/templates-notificacoes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idConfiguracaoEmail" id-configuracao-email "tipoLayout" tipo-layout "tipoNotificacao" tipo-notificacao "remetente" remetente "assunto" assunto "templatePadrao" template-padrao }
              :form-params   {}
              :body-param    conteudo
              :content-types ["text/plain"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-template-notificacao-using-post
  "Salva template de notificação
  Esse recurso salvar template notificaçõe."
  ([conteudo ] (salvar-template-notificacao-using-post conteudo nil))
  ([conteudo optional-params]
   (:data (salvar-template-notificacao-using-post-with-http-info conteudo optional-params))))

(defn validar-token-email-using-post-with-http-info
  "Validar código de segurança enviado por e-mail
  Esse recurso permite validar os códigos de segurança enviador por e-mail, para validação de dispositivos."
  [request ]
  (call-api "/api/notificacoes-email/validar-codigo-seguranca" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-token-email-using-post
  "Validar código de segurança enviado por e-mail
  Esse recurso permite validar os códigos de segurança enviador por e-mail, para validação de dispositivos."
  [request ]
  (:data (validar-token-email-using-post-with-http-info request)))

(defn validar-token-sms-using-post-with-http-info
  "Validar código de segurança enviado por sms
  Esse recurso permite validar os códigos de segurança enviador por sms, para validação de dispositivos."
  [request ]
  (call-api "/api/notificacoes-sms/validar-codigo-seguranca" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-token-sms-using-post
  "Validar código de segurança enviado por sms
  Esse recurso permite validar os códigos de segurança enviador por sms, para validação de dispositivos."
  [request ]
  (:data (validar-token-sms-using-post-with-http-info request)))
