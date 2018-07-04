(ns pier-sdk-clojure.api.-global-tag-notificacao-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-configuracao-using-put-with-http-info
  "{{{email_resource_alterar_configuracao}}}
  {{{email_resource_alterar_configuracao_notes}}}"
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
  "{{{email_resource_alterar_configuracao}}}
  {{{email_resource_alterar_configuracao_notes}}}"
  [id persist ]
  (:data (alterar-configuracao-using-put-with-http-info id persist)))

(defn alterar-template-notificacao-using-put-with-http-info
  "{{{notificacao_resource_alterar_template_notificacao}}}
  {{{notificacao_resource_alterar_template_notificacao_notes}}}"
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
  "{{{notificacao_resource_alterar_template_notificacao}}}
  {{{notificacao_resource_alterar_template_notificacao_notes}}}"
  ([id conteudo ] (alterar-template-notificacao-using-put id conteudo nil))
  ([id conteudo optional-params]
   (:data (alterar-template-notificacao-using-put-with-http-info id conteudo optional-params))))

(defn atualizar-sms-using-post-with-http-info
  "{{{notificacao_resource_atualizar_s_m_s}}}
  {{{notificacao_resource_atualizar_s_m_s_notes}}}"
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
  "{{{notificacao_resource_atualizar_s_m_s}}}
  {{{notificacao_resource_atualizar_s_m_s_notes}}}"
  ([] (atualizar-sms-using-post nil))
  ([optional-params]
   (:data (atualizar-sms-using-post-with-http-info optional-params))))

(defn consultar-configuracao-using-get-with-http-info
  "{{{email_resource_consultar_configuracao}}}
  {{{email_resource_consultar_configuracao_notes}}}"
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
  "{{{email_resource_consultar_configuracao}}}
  {{{email_resource_consultar_configuracao_notes}}}"
  [id ]
  (:data (consultar-configuracao-using-get-with-http-info id)))

(defn consultar-por-email-using-get-with-http-info
  "{{{codigo_seguranca_resource_consultar_por_email}}}
  {{{codigo_seguranca_resource_consultar_por_email_notes}}}"
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
  "{{{codigo_seguranca_resource_consultar_por_email}}}
  {{{codigo_seguranca_resource_consultar_por_email_notes}}}"
  [id ]
  (:data (consultar-por-email-using-get-with-http-info id)))

(defn consultar-por-sms-using-get-with-http-info
  "{{{codigo_seguranca_resource_consultar_por_s_m_s}}}
  {{{codigo_seguranca_resource_consultar_por_s_m_s_notes}}}"
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
  "{{{codigo_seguranca_resource_consultar_por_s_m_s}}}
  {{{codigo_seguranca_resource_consultar_por_s_m_s_notes}}}"
  [id ]
  (:data (consultar-por-sms-using-get-with-http-info id)))

(defn consultar-template-notificacao-using-get-with-http-info
  "{{{notificacao_resource_consultar_template_notificacao}}}
  {{{notificacao_resource_consultar_template_notificacao_notes}}}"
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
  "{{{notificacao_resource_consultar_template_notificacao}}}
  {{{notificacao_resource_consultar_template_notificacao_notes}}}"
  [id ]
  (:data (consultar-template-notificacao-using-get-with-http-info id)))

(defn gerar-token-email-using-post-with-http-info
  "{{{codigo_seguranca_resource_gerar_token_e_m_a_i_l}}}
  {{{codigo_seguranca_resource_gerar_token_e_m_a_i_l_notes}}}"
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
  "{{{codigo_seguranca_resource_gerar_token_e_m_a_i_l}}}
  {{{codigo_seguranca_resource_gerar_token_e_m_a_i_l_notes}}}"
  [email ]
  (:data (gerar-token-email-using-post-with-http-info email)))

(defn gerar-token-sms-using-post-with-http-info
  "{{{codigo_seguranca_resource_gerar_token_s_m_s}}}
  {{{codigo_seguranca_resource_gerar_token_s_m_s_notes}}}"
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
  "{{{codigo_seguranca_resource_gerar_token_s_m_s}}}
  {{{codigo_seguranca_resource_gerar_token_s_m_s_notes}}}"
  [persist ]
  (:data (gerar-token-sms-using-post-with-http-info persist)))

(defn listar-configuracao-using-get-with-http-info
  "{{{email_resource_listar_configuracao}}}
  {{{email_resource_listar_configuracao_notes}}}"
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
  "{{{email_resource_listar_configuracao}}}
  {{{email_resource_listar_configuracao_notes}}}"
  ([] (listar-configuracao-using-get nil))
  ([optional-params]
   (:data (listar-configuracao-using-get-with-http-info optional-params))))

(defn listar-por-email-using-get-with-http-info
  "{{{codigo_seguranca_resource_listar_por_email}}}
  {{{codigo_seguranca_resource_listar_por_email_notes}}}"
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
  "{{{codigo_seguranca_resource_listar_por_email}}}
  {{{codigo_seguranca_resource_listar_por_email_notes}}}"
  ([] (listar-por-email-using-get nil))
  ([optional-params]
   (:data (listar-por-email-using-get-with-http-info optional-params))))

(defn listar-por-sms-using-get-with-http-info
  "{{{codigo_seguranca_resource_listar_por_s_m_s}}}
  {{{codigo_seguranca_resource_listar_por_s_m_s_notes}}}"
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
  "{{{codigo_seguranca_resource_listar_por_s_m_s}}}
  {{{codigo_seguranca_resource_listar_por_s_m_s_notes}}}"
  ([] (listar-por-sms-using-get nil))
  ([optional-params]
   (:data (listar-por-sms-using-get-with-http-info optional-params))))

(defn listar-push-using-get-with-http-info
  "{{{notificacao_resource_listar_push}}}
  {{{notificacao_resource_listar_push_notes}}}"
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
  "{{{notificacao_resource_listar_push}}}
  {{{notificacao_resource_listar_push_notes}}}"
  ([] (listar-push-using-get nil))
  ([optional-params]
   (:data (listar-push-using-get-with-http-info optional-params))))

(defn listar-sms-using-get-with-http-info
  "{{{notificacao_resource_listar_s_m_s}}}
  {{{notificacao_resource_listar_s_m_s_notes}}}"
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
  "{{{notificacao_resource_listar_s_m_s}}}
  {{{notificacao_resource_listar_s_m_s_notes}}}"
  ([] (listar-sms-using-get nil))
  ([optional-params]
   (:data (listar-sms-using-get-with-http-info optional-params))))

(defn listar-template-notificacao-using-get-with-http-info
  "{{{notificacao_resource_listar_template_notificacao}}}
  {{{notificacao_resource_listar_template_notificacao_notes}}}"
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
  "{{{notificacao_resource_listar_template_notificacao}}}
  {{{notificacao_resource_listar_template_notificacao_notes}}}"
  ([] (listar-template-notificacao-using-get nil))
  ([optional-params]
   (:data (listar-template-notificacao-using-get-with-http-info optional-params))))

(defn listar-tipos-layouts-using-get-with-http-info
  "{{{enum_resource_listar_tipos_layouts}}}
  {{{enum_resource_listar_tipos_layouts_notes}}}"
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
  "{{{enum_resource_listar_tipos_layouts}}}
  {{{enum_resource_listar_tipos_layouts_notes}}}"
  []
  (:data (listar-tipos-layouts-using-get-with-http-info)))

(defn notificacao-email-using-post-with-http-info
  "{{{notificacao_resource_notificacao_email}}}
  {{{notificacao_resource_notificacao_email_notes}}}"
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
  "{{{notificacao_resource_notificacao_email}}}
  {{{notificacao_resource_notificacao_email_notes}}}"
  [request ]
  (:data (notificacao-email-using-post-with-http-info request)))

(defn reenviar-token-sms-using-post-with-http-info
  "{{{codigo_seguranca_resource_reenviar_token_s_m_s}}}
  {{{codigo_seguranca_resource_reenviar_token_s_m_s_notes}}}"
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
  "{{{codigo_seguranca_resource_reenviar_token_s_m_s}}}
  {{{codigo_seguranca_resource_reenviar_token_s_m_s_notes}}}"
  [persist ]
  (:data (reenviar-token-sms-using-post-with-http-info persist)))

(defn responder-sms-get-using-get-with-http-info
  "{{{notificacao_resource_responder_s_m_s_get}}}
  {{{notificacao_resource_responder_s_m_s_get_notes}}}"
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
  "{{{notificacao_resource_responder_s_m_s_get}}}
  {{{notificacao_resource_responder_s_m_s_get_notes}}}"
  ([] (responder-sms-get-using-get nil))
  ([optional-params]
   (:data (responder-sms-get-using-get-with-http-info optional-params))))

(defn salvar-configuracao-using-post-with-http-info
  "{{{email_resource_salvar_configuracao}}}
  {{{email_resource_salvar_configuracao_notes}}}"
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
  "{{{email_resource_salvar_configuracao}}}
  {{{email_resource_salvar_configuracao_notes}}}"
  [persist ]
  (:data (salvar-configuracao-using-post-with-http-info persist)))

(defn salvar-push-fcm-using-post-with-http-info
  "{{{notificacao_resource_salvar_push_f_c_m}}}
  {{{notificacao_resource_salvar_push_f_c_m_notes}}}"
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
  "{{{notificacao_resource_salvar_push_f_c_m}}}
  {{{notificacao_resource_salvar_push_f_c_m_notes}}}"
  [push-persists ]
  (:data (salvar-push-fcm-using-post-with-http-info push-persists)))

(defn salvar-push-gcm-using-post-with-http-info
  "{{{notificacao_resource_salvar_push_g_c_m}}}
  {{{notificacao_resource_salvar_push_g_c_m_notes}}}"
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
  "{{{notificacao_resource_salvar_push_g_c_m}}}
  {{{notificacao_resource_salvar_push_g_c_m_notes}}}"
  [push-persists ]
  (:data (salvar-push-gcm-using-post-with-http-info push-persists)))

(defn salvar-push-using-post-with-http-info
  "{{{notificacao_resource_salvar_push}}}
  {{{notificacao_resource_salvar_push_notes}}}"
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
  "{{{notificacao_resource_salvar_push}}}
  {{{notificacao_resource_salvar_push_notes}}}"
  [push-persists ]
  (:data (salvar-push-using-post-with-http-info push-persists)))

(defn salvar-sms-using-post-with-http-info
  "{{{notificacao_resource_salvar_s_m_s}}}
  {{{notificacao_resource_salvar_s_m_s_notes}}}"
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
  "{{{notificacao_resource_salvar_s_m_s}}}
  {{{notificacao_resource_salvar_s_m_s_notes}}}"
  [lista-sms ]
  (:data (salvar-sms-using-post-with-http-info lista-sms)))

(defn salvar-template-notificacao-using-post-with-http-info
  "{{{notificacao_resource_salvar_template_notificacao}}}
  {{{notificacao_resource_salvar_template_notificacao_notes}}}"
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
  "{{{notificacao_resource_salvar_template_notificacao}}}
  {{{notificacao_resource_salvar_template_notificacao_notes}}}"
  ([conteudo ] (salvar-template-notificacao-using-post conteudo nil))
  ([conteudo optional-params]
   (:data (salvar-template-notificacao-using-post-with-http-info conteudo optional-params))))

(defn validar-token-email-using-post-with-http-info
  "{{{codigo_seguranca_resource_validar_token_e_m_a_i_l}}}
  {{{codigo_seguranca_resource_validar_token_e_m_a_i_l_notes}}}"
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
  "{{{codigo_seguranca_resource_validar_token_e_m_a_i_l}}}
  {{{codigo_seguranca_resource_validar_token_e_m_a_i_l_notes}}}"
  [request ]
  (:data (validar-token-email-using-post-with-http-info request)))

(defn validar-token-sms-using-post-with-http-info
  "{{{codigo_seguranca_resource_validar_token_s_m_s}}}
  {{{codigo_seguranca_resource_validar_token_s_m_s_notes}}}"
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
  "{{{codigo_seguranca_resource_validar_token_s_m_s}}}
  {{{codigo_seguranca_resource_validar_token_s_m_s_notes}}}"
  [request ]
  (:data (validar-token-sms-using-post-with-http-info request)))
