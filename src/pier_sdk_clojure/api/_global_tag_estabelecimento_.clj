(ns pier-sdk-clojure.api.-global-tag-estabelecimento-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-origem-comercial-using-put-with-http-info
  "{{{origem_comercial_resource_alterar_origem_comercial}}}
  {{{origem_comercial_resource_alterar_origem_comercial_notes}}}"
  [id origem-comercial-update ]
  (call-api "/api/origens-comerciais/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    origem-comercial-update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-origem-comercial-using-put
  "{{{origem_comercial_resource_alterar_origem_comercial}}}
  {{{origem_comercial_resource_alterar_origem_comercial_notes}}}"
  [id origem-comercial-update ]
  (:data (alterar-origem-comercial-using-put-with-http-info id origem-comercial-update)))

(defn alterar-using-put10-with-http-info
  "{{{maquineta_resource_alterar}}}
  {{{maquineta_resource_alterar_notes}}}"
  [id maquineta-update ]
  (call-api "/api/maquinetas/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    maquineta-update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put10
  "{{{maquineta_resource_alterar}}}
  {{{maquineta_resource_alterar_notes}}}"
  [id maquineta-update ]
  (:data (alterar-using-put10-with-http-info id maquineta-update)))

(defn alterar-using-put11-with-http-info
  "{{{operacao_credor_resource_alterar}}}
  {{{operacao_credor_resource_alterar_notes}}}"
  [id operacao-credor-update ]
  (call-api "/api/regras-operacoes-estabelecimentos/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    operacao-credor-update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put11
  "{{{operacao_credor_resource_alterar}}}
  {{{operacao_credor_resource_alterar_notes}}}"
  [id operacao-credor-update ]
  (:data (alterar-using-put11-with-http-info id operacao-credor-update)))

(defn alterar-using-put17-with-http-info
  "{{{telefone_estabelecimento_resource_alterar}}}
  {{{telefone_estabelecimento_resource_alterar_notes}}}"
  [id telefone-estabelecimento-update ]
  (call-api "/api/telefones-estabelecimentos/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    telefone-estabelecimento-update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put17
  "{{{telefone_estabelecimento_resource_alterar}}}
  {{{telefone_estabelecimento_resource_alterar_notes}}}"
  [id telefone-estabelecimento-update ]
  (:data (alterar-using-put17-with-http-info id telefone-estabelecimento-update)))

(defn alterar-using-put19-with-http-info
  "{{{terminal_resource_alterar}}}
  {{{terminal_resource_alterar_notes}}}"
  [id terminal-update ]
  (call-api "/api/terminais/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    terminal-update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put19
  "{{{terminal_resource_alterar}}}
  {{{terminal_resource_alterar_notes}}}"
  [id terminal-update ]
  (:data (alterar-using-put19-with-http-info id terminal-update)))

(defn alterar-using-put6-with-http-info
  "{{{estabelecimento_resource_alterar}}}
  {{{estabelecimento_resource_alterar_notes}}}"
  [id update ]
  (call-api "/api/estabelecimentos/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put6
  "{{{estabelecimento_resource_alterar}}}
  {{{estabelecimento_resource_alterar_notes}}}"
  [id update ]
  (:data (alterar-using-put6-with-http-info id update)))

(defn alterar-using-put8-with-http-info
  "{{{grupo_economico_resource_alterar}}}
  {{{grupo_economico_resource_alterar_notes}}}"
  [id grupo-economico-dto ]
  (call-api "/api/grupos-economicos/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    grupo-economico-dto
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put8
  "{{{grupo_economico_resource_alterar}}}
  {{{grupo_economico_resource_alterar_notes}}}"
  [id grupo-economico-dto ]
  (:data (alterar-using-put8-with-http-info id grupo-economico-dto)))

(defn cadastrar-origem-comercial-using-post-with-http-info
  "{{{origem_comercial_resource_cadastrar_origem_comercial}}}
  {{{origem_comercial_resource_cadastrar_origem_comercial_notes}}}"
  [origem-comercial-persist ]
  (call-api "/api/origens-comerciais" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    origem-comercial-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-origem-comercial-using-post
  "{{{origem_comercial_resource_cadastrar_origem_comercial}}}
  {{{origem_comercial_resource_cadastrar_origem_comercial_notes}}}"
  [origem-comercial-persist ]
  (:data (cadastrar-origem-comercial-using-post-with-http-info origem-comercial-persist)))

(defn cadastrar-using-post2-with-http-info
  "{{{estabelecimento_resource_cadastrar}}}
  {{{estabelecimento_resource_cadastrar_notes}}}"
  [persist ]
  (call-api "/api/estabelecimentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-using-post2
  "{{{estabelecimento_resource_cadastrar}}}
  {{{estabelecimento_resource_cadastrar_notes}}}"
  [persist ]
  (:data (cadastrar-using-post2-with-http-info persist)))

(defn cadastrar-using-post3-with-http-info
  "{{{grupo_economico_resource_cadastrar}}}
  {{{grupo_economico_resource_cadastrar_notes}}}"
  [grupo-economico-dto ]
  (call-api "/api/grupos-economicos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    grupo-economico-dto
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-using-post3
  "{{{grupo_economico_resource_cadastrar}}}
  {{{grupo_economico_resource_cadastrar_notes}}}"
  [grupo-economico-dto ]
  (:data (cadastrar-using-post3-with-http-info grupo-economico-dto)))

(defn consulta-operacao-using-get-with-http-info
  "{{{operacao_resource_consulta_operacao}}}
  {{{operacao_resource_consulta_operacao_notes}}}"
  [id ]
  (call-api "/api/tipos-operacoes-estabelecimentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consulta-operacao-using-get
  "{{{operacao_resource_consulta_operacao}}}
  {{{operacao_resource_consulta_operacao_notes}}}"
  [id ]
  (:data (consulta-operacao-using-get-with-http-info id)))

(defn consultar-origem-comercial-using-get-with-http-info
  "{{{origem_comercial_resource_consultar_origem_comercial}}}
  {{{origem_comercial_resource_consultar_origem_comercial_notes}}}"
  [id ]
  (call-api "/api/origens-comerciais/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-origem-comercial-using-get
  "{{{origem_comercial_resource_consultar_origem_comercial}}}
  {{{origem_comercial_resource_consultar_origem_comercial_notes}}}"
  [id ]
  (:data (consultar-origem-comercial-using-get-with-http-info id)))

(defn consultar-using-get19-with-http-info
  "{{{estabelecimento_resource_consultar}}}
  {{{estabelecimento_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/estabelecimentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get19
  "{{{estabelecimento_resource_consultar}}}
  {{{estabelecimento_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get19-with-http-info id)))

(defn consultar-using-get21-with-http-info
  "{{{grupo_economico_resource_consultar}}}
  {{{grupo_economico_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/grupos-economicos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get21
  "{{{grupo_economico_resource_consultar}}}
  {{{grupo_economico_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get21-with-http-info id)))

(defn consultar-using-get23-with-http-info
  "{{{maquineta_resource_consultar}}}
  {{{maquineta_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/maquinetas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get23
  "{{{maquineta_resource_consultar}}}
  {{{maquineta_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get23-with-http-info id)))

(defn consultar-using-get24-with-http-info
  "{{{operacao_credor_resource_consultar}}}
  {{{operacao_credor_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/regras-operacoes-estabelecimentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get24
  "{{{operacao_credor_resource_consultar}}}
  {{{operacao_credor_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get24-with-http-info id)))

(defn consultar-using-get37-with-http-info
  "{{{telefone_estabelecimento_resource_consultar}}}
  {{{telefone_estabelecimento_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/telefones-estabelecimentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get37
  "{{{telefone_estabelecimento_resource_consultar}}}
  {{{telefone_estabelecimento_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get37-with-http-info id)))

(defn consultar-using-get39-with-http-info
  "{{{terminal_resource_consultar}}}
  {{{terminal_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/terminais/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get39
  "{{{terminal_resource_consultar}}}
  {{{terminal_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get39-with-http-info id)))

(defn consultar-using-get51-with-http-info
  "{{{vinculo_estabelecimento_adquirente_resource_consultar}}}
  {{{vinculo_estabelecimento_adquirente_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/adquirentes-estabelecimento/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get51
  "{{{vinculo_estabelecimento_adquirente_resource_consultar}}}
  {{{vinculo_estabelecimento_adquirente_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get51-with-http-info id)))

(defn desabilitar-vinculo-using-post-with-http-info
  "{{{vinculo_estabelecimento_adquirente_resource_desabilitar_vinculo}}}
  {{{vinculo_estabelecimento_adquirente_resource_desabilitar_vinculo_notes}}}"
  [id ]
  (call-api "/api/adquirentes-estabelecimento/{id}/desabilitar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desabilitar-vinculo-using-post
  "{{{vinculo_estabelecimento_adquirente_resource_desabilitar_vinculo}}}
  {{{vinculo_estabelecimento_adquirente_resource_desabilitar_vinculo_notes}}}"
  [id ]
  (:data (desabilitar-vinculo-using-post-with-http-info id)))

(defn desabilitar-vinculo-using-post1-with-http-info
  "{{{vinculo_operacao_resource_desabilitar_vinculo}}}
  {{{vinculo_operacao_resource_desabilitar_vinculo_notes}}}"
  [id vinculo-operacao-persist ]
  (call-api "/api/estabelecimentos/{id}/desabilitar-operacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    vinculo-operacao-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desabilitar-vinculo-using-post1
  "{{{vinculo_operacao_resource_desabilitar_vinculo}}}
  {{{vinculo_operacao_resource_desabilitar_vinculo_notes}}}"
  [id vinculo-operacao-persist ]
  (:data (desabilitar-vinculo-using-post1-with-http-info id vinculo-operacao-persist)))

(defn habilitar-vinculo-using-post-with-http-info
  "{{{vinculo_estabelecimento_adquirente_resource_habilitar_vinculo}}}
  {{{vinculo_estabelecimento_adquirente_resource_habilitar_vinculo_notes}}}"
  [id ]
  (call-api "/api/adquirentes-estabelecimento/{id}/habilitar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn habilitar-vinculo-using-post
  "{{{vinculo_estabelecimento_adquirente_resource_habilitar_vinculo}}}
  {{{vinculo_estabelecimento_adquirente_resource_habilitar_vinculo_notes}}}"
  [id ]
  (:data (habilitar-vinculo-using-post-with-http-info id)))

(defn habilitar-vinculo-using-post1-with-http-info
  "{{{vinculo_operacao_resource_habilitar_vinculo}}}
  {{{vinculo_operacao_resource_habilitar_vinculo_notes}}}"
  [id vinculo-operacao-persist ]
  (call-api "/api/estabelecimentos/{id}/habilitar-operacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    vinculo-operacao-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn habilitar-vinculo-using-post1
  "{{{vinculo_operacao_resource_habilitar_vinculo}}}
  {{{vinculo_operacao_resource_habilitar_vinculo_notes}}}"
  [id vinculo-operacao-persist ]
  (:data (habilitar-vinculo-using-post1-with-http-info id vinculo-operacao-persist)))

(defn lista-operacao-using-get-with-http-info
  "{{{operacao_resource_lista_operacao}}}
  {{{operacao_resource_lista_operacao_notes}}}"
  ([] (lista-operacao-using-get-with-http-info nil))
  ([{:keys [sort page limit id-operacao codigo-processamento ]}]
   (call-api "/api/tipos-operacoes-estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idOperacao" id-operacao "codigoProcessamento" codigo-processamento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn lista-operacao-using-get
  "{{{operacao_resource_lista_operacao}}}
  {{{operacao_resource_lista_operacao_notes}}}"
  ([] (lista-operacao-using-get nil))
  ([optional-params]
   (:data (lista-operacao-using-get-with-http-info optional-params))))

(defn listar-mcc-using-get-with-http-info
  "{{{m_c_c_resource_listar_m_c_c}}}
  {{{m_c_c_resource_listar_m_c_c_notes}}}"
  ([] (listar-mcc-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/mcc-estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-mcc-using-get
  "{{{m_c_c_resource_listar_m_c_c}}}
  {{{m_c_c_resource_listar_m_c_c_notes}}}"
  ([] (listar-mcc-using-get nil))
  ([optional-params]
   (:data (listar-mcc-using-get-with-http-info optional-params))))

(defn listar-origens-comerciais-using-get-with-http-info
  "{{{origem_comercial_resource_listar_origens_comerciais}}}
  {{{origem_comercial_resource_listar_origens_comerciais_notes}}}"
  ([] (listar-origens-comerciais-using-get-with-http-info nil))
  ([{:keys [sort page limit id nome status id-estabelecimento id-produto descricao id-tipo-origem-comercial id-grupo-origem-comercial flag-pre-aprovado flag-aprovacao-imediata nome-fantasia-plastico flag-cartao-provisorio flag-cartao-definitivo usuario senha flag-origem-externa flag-modificado flag-envia-fatura-usuario flag-credito-faturamento flag-concede-limite-provisorio flag-digitalizar-doc flag-embossing-loja flag-consulta-previa tipo-pessoa ]}]
   (call-api "/api/origens-comerciais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "status" status "idEstabelecimento" id-estabelecimento "idProduto" id-produto "descricao" descricao "idTipoOrigemComercial" id-tipo-origem-comercial "idGrupoOrigemComercial" id-grupo-origem-comercial "flagPreAprovado" flag-pre-aprovado "flagAprovacaoImediata" flag-aprovacao-imediata "nomeFantasiaPlastico" nome-fantasia-plastico "flagCartaoProvisorio" flag-cartao-provisorio "flagCartaoDefinitivo" flag-cartao-definitivo "usuario" usuario "senha" senha "flagOrigemExterna" flag-origem-externa "flagModificado" flag-modificado "flagEnviaFaturaUsuario" flag-envia-fatura-usuario "flagCreditoFaturamento" flag-credito-faturamento "flagConcedeLimiteProvisorio" flag-concede-limite-provisorio "flagDigitalizarDoc" flag-digitalizar-doc "flagEmbossingLoja" flag-embossing-loja "flagConsultaPrevia" flag-consulta-previa "tipoPessoa" tipo-pessoa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-origens-comerciais-using-get
  "{{{origem_comercial_resource_listar_origens_comerciais}}}
  {{{origem_comercial_resource_listar_origens_comerciais_notes}}}"
  ([] (listar-origens-comerciais-using-get nil))
  ([optional-params]
   (:data (listar-origens-comerciais-using-get-with-http-info optional-params))))

(defn listar-tipos-adquirentes-using-get-with-http-info
  "{{{vinculo_estabelecimento_adquirente_resource_listar_tipos_adquirentes}}}
  {{{vinculo_estabelecimento_adquirente_resource_listar_tipos_adquirentes_notes}}}"
  ([] (listar-tipos-adquirentes-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/tipos-adquirentes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-adquirentes-using-get
  "{{{vinculo_estabelecimento_adquirente_resource_listar_tipos_adquirentes}}}
  {{{vinculo_estabelecimento_adquirente_resource_listar_tipos_adquirentes_notes}}}"
  ([] (listar-tipos-adquirentes-using-get nil))
  ([optional-params]
   (:data (listar-tipos-adquirentes-using-get-with-http-info optional-params))))

(defn listar-tipos-estabelecimentos-using-get-with-http-info
  "{{{tipo_estabelecimento_resource_listar_tipos_estabelecimentos}}}
  {{{tipo_estabelecimento_resource_listar_tipos_estabelecimentos_notes}}}"
  ([] (listar-tipos-estabelecimentos-using-get-with-http-info nil))
  ([{:keys [sort page limit descricao ]}]
   (call-api "/api/tipos-estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-estabelecimentos-using-get
  "{{{tipo_estabelecimento_resource_listar_tipos_estabelecimentos}}}
  {{{tipo_estabelecimento_resource_listar_tipos_estabelecimentos_notes}}}"
  ([] (listar-tipos-estabelecimentos-using-get nil))
  ([optional-params]
   (:data (listar-tipos-estabelecimentos-using-get-with-http-info optional-params))))

(defn listar-tipos-maquinetas-using-get-with-http-info
  "{{{maquineta_resource_listar_tipos_maquinetas}}}
  {{{maquineta_resource_listar_tipos_maquinetas_notes}}}"
  ([] (listar-tipos-maquinetas-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/tipos-maquinetas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-maquinetas-using-get
  "{{{maquineta_resource_listar_tipos_maquinetas}}}
  {{{maquineta_resource_listar_tipos_maquinetas_notes}}}"
  ([] (listar-tipos-maquinetas-using-get nil))
  ([optional-params]
   (:data (listar-tipos-maquinetas-using-get-with-http-info optional-params))))

(defn listar-tipos-origens-comerciais-using-get-with-http-info
  "{{{tipo_origem_comercial_resource_listar_tipos_origens_comerciais}}}
  {{{tipo_origem_comercial_resource_listar_tipos_origens_comerciais_notes}}}"
  ([] (listar-tipos-origens-comerciais-using-get-with-http-info nil))
  ([{:keys [sort page limit nome ]}]
   (call-api "/api/tipos-origens-comerciais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-origens-comerciais-using-get
  "{{{tipo_origem_comercial_resource_listar_tipos_origens_comerciais}}}
  {{{tipo_origem_comercial_resource_listar_tipos_origens_comerciais_notes}}}"
  ([] (listar-tipos-origens-comerciais-using-get nil))
  ([optional-params]
   (:data (listar-tipos-origens-comerciais-using-get-with-http-info optional-params))))

(defn listar-tipos-terminais-using-get1-with-http-info
  "{{{terminal_resource_listar_tipos_terminais}}}
  {{{terminal_resource_listar_tipos_terminais_notes}}}"
  ([] (listar-tipos-terminais-using-get1-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/tipos-terminais-estabelecimento" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-terminais-using-get1
  "{{{terminal_resource_listar_tipos_terminais}}}
  {{{terminal_resource_listar_tipos_terminais_notes}}}"
  ([] (listar-tipos-terminais-using-get1 nil))
  ([optional-params]
   (:data (listar-tipos-terminais-using-get1-with-http-info optional-params))))

(defn listar-using-get25-with-http-info
  "{{{estabelecimento_resource_listar}}}
  {{{estabelecimento_resource_listar_notes}}}"
  ([] (listar-using-get25-with-http-info nil))
  ([{:keys [sort page limit id id-grupo-economico numero-receita-federal nome descricao nome-fantasia cep nome-logradouro numero-endereco complemento bairro cidade uf pais data-cadastramento contato email flag-arquivo-secr-fazenda flag-cartao-digitado inativo id-pais mcc id-tipo-estabelecimento correspondencia id-moeda tipo-pagamento numero-estabelecimento cep2 nome-logradouro2 numero-endereco2 complemento2 bairro2 cidade2 uf2 flag-matriz ]}]
   (call-api "/api/estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idGrupoEconomico" id-grupo-economico "numeroReceitaFederal" numero-receita-federal "nome" nome "descricao" descricao "nomeFantasia" nome-fantasia "cep" cep "nomeLogradouro" nome-logradouro "numeroEndereco" numero-endereco "complemento" complemento "bairro" bairro "cidade" cidade "uf" uf "pais" pais "dataCadastramento" data-cadastramento "contato" contato "email" email "flagArquivoSecrFazenda" flag-arquivo-secr-fazenda "flagCartaoDigitado" flag-cartao-digitado "inativo" inativo "idPais" id-pais "mcc" mcc "idTipoEstabelecimento" id-tipo-estabelecimento "correspondencia" correspondencia "idMoeda" id-moeda "tipoPagamento" tipo-pagamento "numeroEstabelecimento" numero-estabelecimento "cep2" cep2 "nomeLogradouro2" nome-logradouro2 "numeroEndereco2" numero-endereco2 "complemento2" complemento2 "bairro2" bairro2 "cidade2" cidade2 "uf2" uf2 "flagMatriz" flag-matriz }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get25
  "{{{estabelecimento_resource_listar}}}
  {{{estabelecimento_resource_listar_notes}}}"
  ([] (listar-using-get25 nil))
  ([optional-params]
   (:data (listar-using-get25-with-http-info optional-params))))

(defn listar-using-get28-with-http-info
  "{{{grupo_economico_resource_listar}}}
  {{{grupo_economico_resource_listar_notes}}}"
  ([] (listar-using-get28-with-http-info nil))
  ([{:keys [sort page limit razao-social nome-credor numero-receita-federal inscricao-estadual contato banco agencia digito-agencia conta-corrente digito-conta-corrente periodicidade pagamento-semanal pagamento-mensal pagamento-decendial-primeiro pagamento-decendial-segundo pagamento-decendial-terceiro pagamento-quinzenal-primeiro pagamento-quinzenal-segundo percentual-rav recebe-rav percentual-multiplica taxa-adm taxa-banco limite-rav id-credor-rav ]}]
   (call-api "/api/grupos-economicos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "razaoSocial" razao-social "nomeCredor" nome-credor "numeroReceitaFederal" numero-receita-federal "inscricaoEstadual" inscricao-estadual "contato" contato "banco" banco "agencia" agencia "digitoAgencia" digito-agencia "contaCorrente" conta-corrente "digitoContaCorrente" digito-conta-corrente "periodicidade" periodicidade "pagamentoSemanal" pagamento-semanal "pagamentoMensal" pagamento-mensal "pagamentoDecendialPrimeiro" pagamento-decendial-primeiro "pagamentoDecendialSegundo" pagamento-decendial-segundo "pagamentoDecendialTerceiro" pagamento-decendial-terceiro "pagamentoQuinzenalPrimeiro" pagamento-quinzenal-primeiro "pagamentoQuinzenalSegundo" pagamento-quinzenal-segundo "percentualRAV" percentual-rav "recebeRAV" recebe-rav "percentualMultiplica" percentual-multiplica "taxaAdm" taxa-adm "taxaBanco" taxa-banco "limiteRAV" limite-rav "idCredorRAV" id-credor-rav }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get28
  "{{{grupo_economico_resource_listar}}}
  {{{grupo_economico_resource_listar_notes}}}"
  ([] (listar-using-get28 nil))
  ([optional-params]
   (:data (listar-using-get28-with-http-info optional-params))))

(defn listar-using-get29-with-http-info
  "{{{grupo_origem_comercial_resource_listar}}}
  {{{grupo_origem_comercial_resource_listar_notes}}}"
  ([] (listar-using-get29-with-http-info nil))
  ([{:keys [sort page limit nome ]}]
   (call-api "/api/grupos-origens-comerciais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get29
  "{{{grupo_origem_comercial_resource_listar}}}
  {{{grupo_origem_comercial_resource_listar_notes}}}"
  ([] (listar-using-get29 nil))
  ([optional-params]
   (:data (listar-using-get29-with-http-info optional-params))))

(defn listar-using-get32-with-http-info
  "{{{maquineta_resource_listar}}}
  {{{maquineta_resource_listar_notes}}}"
  ([] (listar-using-get32-with-http-info nil))
  ([{:keys [sort page limit id-estabelecimento ]}]
   (call-api "/api/maquinetas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idEstabelecimento" id-estabelecimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get32
  "{{{maquineta_resource_listar}}}
  {{{maquineta_resource_listar_notes}}}"
  ([] (listar-using-get32 nil))
  ([optional-params]
   (:data (listar-using-get32-with-http-info optional-params))))

(defn listar-using-get33-with-http-info
  "{{{moeda_resource_listar}}}
  {{{moeda_resource_listar_notes}}}"
  ([] (listar-using-get33-with-http-info nil))
  ([{:keys [sort page limit codigo-moeda simbolo descricao ]}]
   (call-api "/api/tipos-moedas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "codigoMoeda" codigo-moeda "simbolo" simbolo "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get33
  "{{{moeda_resource_listar}}}
  {{{moeda_resource_listar_notes}}}"
  ([] (listar-using-get33 nil))
  ([optional-params]
   (:data (listar-using-get33-with-http-info optional-params))))

(defn listar-using-get34-with-http-info
  "{{{operacao_credor_resource_listar}}}
  {{{operacao_credor_resource_listar_notes}}}"
  ([] (listar-using-get34-with-http-info nil))
  ([{:keys [sort page limit id-operacao id-credor id-produto ]}]
   (call-api "/api/regras-operacoes-estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idOperacao" id-operacao "idCredor" id-credor "idProduto" id-produto }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get34
  "{{{operacao_credor_resource_listar}}}
  {{{operacao_credor_resource_listar_notes}}}"
  ([] (listar-using-get34 nil))
  ([optional-params]
   (:data (listar-using-get34-with-http-info optional-params))))

(defn listar-using-get49-with-http-info
  "{{{telefone_estabelecimento_resource_listar}}}
  {{{telefone_estabelecimento_resource_listar_notes}}}"
  ([] (listar-using-get49-with-http-info nil))
  ([{:keys [sort page limit id-estabelecimento ]}]
   (call-api "/api/telefones-estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idEstabelecimento" id-estabelecimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get49
  "{{{telefone_estabelecimento_resource_listar}}}
  {{{telefone_estabelecimento_resource_listar_notes}}}"
  ([] (listar-using-get49 nil))
  ([optional-params]
   (:data (listar-using-get49-with-http-info optional-params))))

(defn listar-using-get51-with-http-info
  "{{{terminal_resource_listar}}}
  {{{terminal_resource_listar_notes}}}"
  ([] (listar-using-get51-with-http-info nil))
  ([{:keys [sort page limit id terminal numero-estabelecimento id-estabelecimento ]}]
   (call-api "/api/terminais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "terminal" terminal "numeroEstabelecimento" numero-estabelecimento "idEstabelecimento" id-estabelecimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get51
  "{{{terminal_resource_listar}}}
  {{{terminal_resource_listar_notes}}}"
  ([] (listar-using-get51 nil))
  ([optional-params]
   (:data (listar-using-get51-with-http-info optional-params))))

(defn listar-using-get64-with-http-info
  "{{{vinculo_estabelecimento_adquirente_resource_listar}}}
  {{{vinculo_estabelecimento_adquirente_resource_listar_notes}}}"
  ([] (listar-using-get64-with-http-info nil))
  ([{:keys [sort page limit id-adquirente id-estabelecimento codigo-estabelecimento-adquirente ]}]
   (call-api "/api/adquirentes-estabelecimento" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idAdquirente" id-adquirente "idEstabelecimento" id-estabelecimento "codigoEstabelecimentoAdquirente" codigo-estabelecimento-adquirente }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get64
  "{{{vinculo_estabelecimento_adquirente_resource_listar}}}
  {{{vinculo_estabelecimento_adquirente_resource_listar_notes}}}"
  ([] (listar-using-get64 nil))
  ([optional-params]
   (:data (listar-using-get64-with-http-info optional-params))))

(defn listar-using-get65-with-http-info
  "{{{vinculo_operacao_resource_listar}}}
  {{{vinculo_operacao_resource_listar_notes}}}"
  ([id ] (listar-using-get65-with-http-info id nil))
  ([id {:keys [sort page limit id-produto id-operacao codigo-mcc ]}]
   (call-api "/api/estabelecimentos/{id}/operacoes" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idProduto" id-produto "idOperacao" id-operacao "codigoMCC" codigo-mcc }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get65
  "{{{vinculo_operacao_resource_listar}}}
  {{{vinculo_operacao_resource_listar_notes}}}"
  ([id ] (listar-using-get65 id nil))
  ([id optional-params]
   (:data (listar-using-get65-with-http-info id optional-params))))

(defn salvar-using-post19-with-http-info
  "{{{maquineta_resource_salvar}}}
  {{{maquineta_resource_salvar_notes}}}"
  [maquineta-persist ]
  (call-api "/api/maquinetas" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    maquineta-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post19
  "{{{maquineta_resource_salvar}}}
  {{{maquineta_resource_salvar_notes}}}"
  [maquineta-persist ]
  (:data (salvar-using-post19-with-http-info maquineta-persist)))

(defn salvar-using-post20-with-http-info
  "{{{operacao_credor_resource_salvar}}}
  {{{operacao_credor_resource_salvar_notes}}}"
  [operacao-credor-persist ]
  (call-api "/api/regras-operacoes-estabelecimentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    operacao-credor-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post20
  "{{{operacao_credor_resource_salvar}}}
  {{{operacao_credor_resource_salvar_notes}}}"
  [operacao-credor-persist ]
  (:data (salvar-using-post20-with-http-info operacao-credor-persist)))

(defn salvar-using-post27-with-http-info
  "{{{telefone_estabelecimento_resource_salvar}}}
  {{{telefone_estabelecimento_resource_salvar_notes}}}"
  [telefone-estabelecimento-persist ]
  (call-api "/api/telefones-estabelecimentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    telefone-estabelecimento-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post27
  "{{{telefone_estabelecimento_resource_salvar}}}
  {{{telefone_estabelecimento_resource_salvar_notes}}}"
  [telefone-estabelecimento-persist ]
  (:data (salvar-using-post27-with-http-info telefone-estabelecimento-persist)))

(defn salvar-using-post29-with-http-info
  "{{{terminal_resource_salvar}}}
  {{{terminal_resource_salvar_notes}}}"
  [terminal-persist ]
  (call-api "/api/terminais" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    terminal-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post29
  "{{{terminal_resource_salvar}}}
  {{{terminal_resource_salvar_notes}}}"
  [terminal-persist ]
  (:data (salvar-using-post29-with-http-info terminal-persist)))

(defn salvar-using-post34-with-http-info
  "{{{vinculo_estabelecimento_adquirente_resource_salvar}}}
  {{{vinculo_estabelecimento_adquirente_resource_salvar_notes}}}"
  [vinculo-estabelecimento-adquirente-persist ]
  (call-api "/api/adquirentes-estabelecimento" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    vinculo-estabelecimento-adquirente-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post34
  "{{{vinculo_estabelecimento_adquirente_resource_salvar}}}
  {{{vinculo_estabelecimento_adquirente_resource_salvar_notes}}}"
  [vinculo-estabelecimento-adquirente-persist ]
  (:data (salvar-using-post34-with-http-info vinculo-estabelecimento-adquirente-persist)))
