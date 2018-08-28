(ns pier-sdk-clojure.api.-global-tag-usuario-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-senha-login-using-post-with-http-info
  "{{{usuario_resource_alterar_senha_login}}}
  {{{usuario_resource_alterar_senha_login_notes}}}"
  [login senha-nova ]
  (call-api "/api/usuarios/{login}/alterar-senha" :post
            {:path-params   {"login" login }
             :header-params {"senhaNova" senha-nova }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-senha-login-using-post
  "{{{usuario_resource_alterar_senha_login}}}
  {{{usuario_resource_alterar_senha_login_notes}}}"
  [login senha-nova ]
  (:data (alterar-senha-login-using-post-with-http-info login senha-nova)))

(defn alterar-senha-using-put-with-http-info
  "{{{usuario_resource_alterar_senha}}}
  {{{usuario_resource_alterar_senha_notes}}}"
  [id senha-atual senha-nova ]
  (call-api "/api/usuarios/{id}/alterar-senha" :put
            {:path-params   {"id" id }
             :header-params {"senha_atual" senha-atual "senha_nova" senha-nova }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-senha-using-put
  "{{{usuario_resource_alterar_senha}}}
  {{{usuario_resource_alterar_senha_notes}}}"
  [id senha-atual senha-nova ]
  (:data (alterar-senha-using-put-with-http-info id senha-atual senha-nova)))

(defn alterar-using-put23-with-http-info
  "{{{usuario_resource_alterar}}}
  {{{usuario_resource_alterar_notes}}}"
  [id update ]
  (call-api "/api/usuarios/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put23
  "{{{usuario_resource_alterar}}}
  {{{usuario_resource_alterar_notes}}}"
  [id update ]
  (:data (alterar-using-put23-with-http-info id update)))

(defn ativar-usuario-using-post1-with-http-info
  "{{{usuario_resource_ativar_usuario}}}
  {{{usuario_resource_ativar_usuario_notes}}}"
  [id ]
  (call-api "/api/usuarios/{id}/ativar-usuario" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-usuario-using-post1
  "{{{usuario_resource_ativar_usuario}}}
  {{{usuario_resource_ativar_usuario_notes}}}"
  [id ]
  (:data (ativar-usuario-using-post1-with-http-info id)))

(defn atualizar-using-put3-with-http-info
  "{{{controle_seguranca_dispositivo_atualizar}}}
  {{{controle_seguranca_dispositivo_atualizar_notas}}}"
  [update ]
  (call-api "/api/controles-seguranca-dispositivos" :put
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put3
  "{{{controle_seguranca_dispositivo_atualizar}}}
  {{{controle_seguranca_dispositivo_atualizar_notas}}}"
  [update ]
  (:data (atualizar-using-put3-with-http-info update)))

(defn consultar-contas-vinculadas-using-get-with-http-info
  "{{{usuario_recurso_listar_por_id_usuario}}}
  {{{usuario_recurso_listar_por_id_usuario_notas}}}"
  ([id ] (consultar-contas-vinculadas-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/usuarios/{id}/vincular-contas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-contas-vinculadas-using-get
  "{{{usuario_recurso_listar_por_id_usuario}}}
  {{{usuario_recurso_listar_por_id_usuario_notas}}}"
  ([id ] (consultar-contas-vinculadas-using-get id nil))
  ([id optional-params]
   (:data (consultar-contas-vinculadas-using-get-with-http-info id optional-params))))

(defn consultar-using-get17-with-http-info
  "{{{controle_seguranca_dispositivo_consultar}}}
  {{{controle_seguranca_dispositivo_consultar_notas}}}"
  ([id-usuario ] (consultar-using-get17-with-http-info id-usuario nil))
  ([id-usuario {:keys [sort page limit ]}]
   (call-api "/api/controles-seguranca-dispositivos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idUsuario" id-usuario "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get17
  "{{{controle_seguranca_dispositivo_consultar}}}
  {{{controle_seguranca_dispositivo_consultar_notas}}}"
  ([id-usuario ] (consultar-using-get17 id-usuario nil))
  ([id-usuario optional-params]
   (:data (consultar-using-get17-with-http-info id-usuario optional-params))))

(defn consultar-using-get53-with-http-info
  "{{{usuario_resource_consultar}}}
  {{{usuario_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/usuarios/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get53
  "{{{usuario_resource_consultar}}}
  {{{usuario_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get53-with-http-info id)))

(defn desativar-usuario-using-post1-with-http-info
  "{{{usuario_resource_desativar_usuario}}}
  {{{usuario_resource_desativar_usuario_notes}}}"
  [id ]
  (call-api "/api/usuarios/{id}/desativar-usuario" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-usuario-using-post1
  "{{{usuario_resource_desativar_usuario}}}
  {{{usuario_resource_desativar_usuario_notes}}}"
  [id ]
  (:data (desativar-usuario-using-post1-with-http-info id)))

(defn listar-using-get65-with-http-info
  "{{{usuario_resource_listar}}}
  {{{usuario_resource_listar_notes}}}"
  ([] (listar-using-get65-with-http-info nil))
  ([{:keys [sort page limit nome cpf email status ]}]
   (call-api "/api/usuarios" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "cpf" cpf "email" email "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get65
  "{{{usuario_resource_listar}}}
  {{{usuario_resource_listar_notes}}}"
  ([] (listar-using-get65 nil))
  ([optional-params]
   (:data (listar-using-get65-with-http-info optional-params))))

(defn recuperar-senha-using-post-with-http-info
  "{{{usuario_resource_recuperar_senha}}}
  {{{usuario_resource_recuperar_senha_notes}}}"
  [id ]
  (call-api "/api/usuarios/{id}/recuperar-senha" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn recuperar-senha-using-post
  "{{{usuario_resource_recuperar_senha}}}
  {{{usuario_resource_recuperar_senha_notes}}}"
  [id ]
  (:data (recuperar-senha-using-post-with-http-info id)))

(defn salvar-using-post10-with-http-info
  "{{{controle_seguranca_dispositivo_salvar}}}
  {{{controle_seguranca_dispositivo_salvar_notas}}}"
  [persist ]
  (call-api "/api/controles-seguranca-dispositivos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post10
  "{{{controle_seguranca_dispositivo_salvar}}}
  {{{controle_seguranca_dispositivo_salvar_notas}}}"
  [persist ]
  (:data (salvar-using-post10-with-http-info persist)))

(defn salvar-using-post34-with-http-info
  "{{{usuario_resource_salvar}}}
  {{{usuario_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/usuarios" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post34
  "{{{usuario_resource_salvar}}}
  {{{usuario_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post34-with-http-info persist)))

(defn validar-senha-forte-using-post-with-http-info
  "{{{usuario_resource_validar_senha_forte}}}
  {{{usuario_resource_validar_senha_forte_notes}}}"
  [senha usuario-senha-forte-persist ]
  (call-api "/api/usuarios/validar-senha-forte" :post
            {:path-params   {}
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :body-param    usuario-senha-forte-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-senha-forte-using-post
  "{{{usuario_resource_validar_senha_forte}}}
  {{{usuario_resource_validar_senha_forte_notes}}}"
  [senha usuario-senha-forte-persist ]
  (:data (validar-senha-forte-using-post-with-http-info senha usuario-senha-forte-persist)))

(defn validar-senha-login-using-post-with-http-info
  "{{{usuario_resource_validar_senha_login}}}
  {{{usuario_resource_validar_senha_login_notes}}}"
  [login senha ]
  (call-api "/api/usuarios/{login}/validar-senha" :post
            {:path-params   {"login" login }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-senha-login-using-post
  "{{{usuario_resource_validar_senha_login}}}
  {{{usuario_resource_validar_senha_login_notes}}}"
  [login senha ]
  (:data (validar-senha-login-using-post-with-http-info login senha)))

(defn validar-senha-using-get1-with-http-info
  "{{{usuario_resource_validar_senha}}}
  {{{usuario_resource_validar_senha_notes}}}"
  [senha id ]
  (call-api "/api/usuarios/{id}/validar-senha" :get
            {:path-params   {"id" id }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-senha-using-get1
  "{{{usuario_resource_validar_senha}}}
  {{{usuario_resource_validar_senha_notes}}}"
  [senha id ]
  (:data (validar-senha-using-get1-with-http-info senha id)))

(defn vincular-contas-using-post-with-http-info
  "{{{usuario_recurso_vincular_usuarios}}}
  {{{usuario_recurso_vincular_usuarios_notas}}}"
  [id ]
  (call-api "/api/usuarios/{id}/vincular-usuarios" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn vincular-contas-using-post
  "{{{usuario_recurso_vincular_usuarios}}}
  {{{usuario_recurso_vincular_usuarios_notas}}}"
  [id ]
  (:data (vincular-contas-using-post-with-http-info id)))
