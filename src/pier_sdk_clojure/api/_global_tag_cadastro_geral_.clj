(ns pier-sdk-clojure.api.-global-tag-cadastro-geral-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-convenio-using-put-with-http-info
  "Altera os dados bancários de um determinado convênio
  Altera os dados bancários de um determinado convênio"
  [id convenio-persist ]
  (call-api "/api/convenios/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    convenio-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-convenio-using-put
  "Altera os dados bancários de um determinado convênio
  Altera os dados bancários de um determinado convênio"
  [id convenio-persist ]
  (:data (alterar-convenio-using-put-with-http-info id convenio-persist)))

(defn alterar-using-put1-with-http-info
  "{{{campanha_resource_alterar}}}
  {{{campanha_resource_alterar_notes}}}"
  [id update ]
  (call-api "/api/campanhas/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put1
  "{{{campanha_resource_alterar}}}
  {{{campanha_resource_alterar_notes}}}"
  [id update ]
  (:data (alterar-using-put1-with-http-info id update)))

(defn alterar-using-put2-with-http-info
  "{{{configuracao_registro_cobranca_resource_alterar}}}
  {{{configuracao_registro_cobranca_resource_alterar_notes}}}"
  [id configuracao-persist ]
  (call-api "/api/configuracoes-registro-cobranca/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    configuracao-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put2
  "{{{configuracao_registro_cobranca_resource_alterar}}}
  {{{configuracao_registro_cobranca_resource_alterar_notes}}}"
  [id configuracao-persist ]
  (:data (alterar-using-put2-with-http-info id configuracao-persist)))

(defn alterar-using-put3-with-http-info
  "{{{configuracao_rotativo_resource_alterar}}}
  {{{configuracao_rotativo_resource_alterar_notes}}}"
  [id configuracao-rotativo-persist ]
  (call-api "/api/configuracoes-rotativos/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    configuracao-rotativo-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put3
  "{{{configuracao_rotativo_resource_alterar}}}
  {{{configuracao_rotativo_resource_alterar_notes}}}"
  [id configuracao-rotativo-persist ]
  (:data (alterar-using-put3-with-http-info id configuracao-rotativo-persist)))

(defn cadastrar-convenio-using-post-with-http-info
  "Adiciona novo convênio para o emissor
  Adiciona novo convênio para o emissor"
  [convenio-persist ]
  (call-api "/api/convenios" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    convenio-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-convenio-using-post
  "Adiciona novo convênio para o emissor
  Adiciona novo convênio para o emissor"
  [convenio-persist ]
  (:data (cadastrar-convenio-using-post-with-http-info convenio-persist)))

(defn cadastrar-using-post1-with-http-info
  "{{{configuracao_registro_cobranca_resource_cadastrar}}}
  {{{configuracao_registro_cobranca_resource_cadastrar_notes}}}"
  [configuracao-persist ]
  (call-api "/api/configuracoes-registro-cobranca" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    configuracao-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-using-post1
  "{{{configuracao_registro_cobranca_resource_cadastrar}}}
  {{{configuracao_registro_cobranca_resource_cadastrar_notes}}}"
  [configuracao-persist ]
  (:data (cadastrar-using-post1-with-http-info configuracao-persist)))

(defn configurar-taxa-antecipacao-using-post-with-http-info
  "{{{produto_resource_configurar_taxa_antecipacao}}}
  {{{produto_resource_configurar_taxa_antecipacao_notes}}}"
  [id taxa-antecipacao-request ]
  (call-api "/api/produtos/{id}/configurar-taxa-antecipacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxa-antecipacao-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn configurar-taxa-antecipacao-using-post
  "{{{produto_resource_configurar_taxa_antecipacao}}}
  {{{produto_resource_configurar_taxa_antecipacao_notes}}}"
  [id taxa-antecipacao-request ]
  (:data (configurar-taxa-antecipacao-using-post-with-http-info id taxa-antecipacao-request)))

(defn consultar-campanha-using-get-with-http-info
  "{{{campanha_resource_consultar_campanha}}}
  {{{campanha_resource_consultar_campanha_notes}}}"
  [id ]
  (call-api "/api/campanhas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-campanha-using-get
  "{{{campanha_resource_consultar_campanha}}}
  {{{campanha_resource_consultar_campanha_notes}}}"
  [id ]
  (:data (consultar-campanha-using-get-with-http-info id)))

(defn consultar-convenio-using-get-with-http-info
  "Consultar dados bancários pelo id do convênio
  Consultar dados bancários de um determinado convênio"
  [id ]
  (call-api "/api/convenios/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-convenio-using-get
  "Consultar dados bancários pelo id do convênio
  Consultar dados bancários de um determinado convênio"
  [id ]
  (:data (consultar-convenio-using-get-with-http-info id)))

(defn consultar-taxa-antecipacao-using-get-with-http-info
  "{{{produto_resource_consultar_taxa_antecipacao}}}
  {{{produto_resource_consultar_taxa_antecipacao_notes}}}"
  [id tipo-transacao ]
  (call-api "/api/produtos/{id}/consultar-taxa-antecipacao" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"tipoTransacao" tipo-transacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-taxa-antecipacao-using-get
  "{{{produto_resource_consultar_taxa_antecipacao}}}
  {{{produto_resource_consultar_taxa_antecipacao_notes}}}"
  [id tipo-transacao ]
  (:data (consultar-taxa-antecipacao-using-get-with-http-info id tipo-transacao)))

(defn consultar-using-get10-with-http-info
  "{{{configuracao_registro_cobranca_resource_consultar}}}
  {{{configuracao_registro_cobranca_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/configuracoes-registro-cobranca/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get10
  "{{{configuracao_registro_cobranca_resource_consultar}}}
  {{{configuracao_registro_cobranca_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn consultar-using-get11-with-http-info
  "{{{configuracao_rotativo_resource_consultar}}}
  {{{configuracao_rotativo_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/configuracoes-rotativos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get11
  "{{{configuracao_rotativo_resource_consultar}}}
  {{{configuracao_rotativo_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get11-with-http-info id)))

(defn consultar-using-get31-with-http-info
  "{{{produto_resource_consultar}}}
  {{{produto_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/produtos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get31
  "{{{produto_resource_consultar}}}
  {{{produto_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get31-with-http-info id)))

(defn consultar-using-get40-with-http-info
  "{{{tipo_transacoes_ajuste_resource_consultar}}}
  {{{tipo_transacoes_ajuste_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/tipos-ajustes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get40
  "{{{tipo_transacoes_ajuste_resource_consultar}}}
  {{{tipo_transacoes_ajuste_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get40-with-http-info id)))

(defn consultar-using-get41-with-http-info
  "{{{tipo_boleto_resource_consultar}}}
  {{{tipo_boleto_resource_consultar_notes}}}"
  ([] (consultar-using-get41-with-http-info nil))
  ([{:keys [sort page limit id descricao banco ]}]
   (call-api "/api/tipos-boletos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao "banco" banco }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get41
  "{{{tipo_boleto_resource_consultar}}}
  {{{tipo_boleto_resource_consultar_notes}}}"
  ([] (consultar-using-get41 nil))
  ([optional-params]
   (:data (consultar-using-get41-with-http-info optional-params))))

(defn consultar-using-get42-with-http-info
  "{{{tipo_endereco_resource_consultar}}}
  {{{tipo_endereco_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/tipos-enderecos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get42
  "{{{tipo_endereco_resource_consultar}}}
  {{{tipo_endereco_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get42-with-http-info id)))

(defn consultar-using-get43-with-http-info
  "{{{tipo_operacao_resource_consultar}}}
  {{{tipo_operacao_resource_consultar_notes}}}"
  [id-cartao id-estabelecimento codigo-processamento ]
  (call-api "/api/tipos-operacoes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"idCartao" id-cartao "idEstabelecimento" id-estabelecimento "codigoProcessamento" codigo-processamento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get43
  "{{{tipo_operacao_resource_consultar}}}
  {{{tipo_operacao_resource_consultar_notes}}}"
  [id-cartao id-estabelecimento codigo-processamento ]
  (:data (consultar-using-get43-with-http-info id-cartao id-estabelecimento codigo-processamento)))

(defn consultar-using-get45-with-http-info
  "{{{tipo_telefone_resource_consultar}}}
  {{{tipo_telefone_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/tipos-telefones/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get45
  "{{{tipo_telefone_resource_consultar}}}
  {{{tipo_telefone_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get45-with-http-info id)))

(defn consultar-using-get5-with-http-info
  "{{{atendimento_cliente_resource_consultar}}}
  {{{atendimento_cliente_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/atendimento-clientes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get5
  "{{{atendimento_cliente_resource_consultar}}}
  {{{atendimento_cliente_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get5-with-http-info id)))

(defn consultar-using-get7-with-http-info
  "{{{banco_resource_consultar}}}
  {{{banco_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/bancos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get7
  "{{{banco_resource_consultar}}}
  {{{banco_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get7-with-http-info id)))

(defn listar-campanhas-using-get-with-http-info
  "{{{campanha_resource_listar_campanhas}}}
  {{{campanha_resource_listar_campanhas_notes}}}"
  ([] (listar-campanhas-using-get-with-http-info nil))
  ([{:keys [sort page limit id-tipo-campanha ]}]
   (call-api "/api/campanhas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoCampanha" id-tipo-campanha }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-campanhas-using-get
  "{{{campanha_resource_listar_campanhas}}}
  {{{campanha_resource_listar_campanhas_notes}}}"
  ([] (listar-campanhas-using-get nil))
  ([optional-params]
   (:data (listar-campanhas-using-get-with-http-info optional-params))))

(defn listar-contas-por-pessoa-using-get-with-http-info
  "{{{pessoa_resource_listar_contas_por_pessoa}}}
  {{{pessoa_resource_listar_contas_por_pessoa_notes}}}"
  ([numero-receita-federal ] (listar-contas-por-pessoa-using-get-with-http-info numero-receita-federal nil))
  ([numero-receita-federal {:keys [sort page limit ]}]
   (call-api "/api/pessoas/listar-contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"numeroReceitaFederal" numero-receita-federal "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-contas-por-pessoa-using-get
  "{{{pessoa_resource_listar_contas_por_pessoa}}}
  {{{pessoa_resource_listar_contas_por_pessoa_notes}}}"
  ([numero-receita-federal ] (listar-contas-por-pessoa-using-get numero-receita-federal nil))
  ([numero-receita-federal optional-params]
   (:data (listar-contas-por-pessoa-using-get-with-http-info numero-receita-federal optional-params))))

(defn listar-convenios-using-get-with-http-info
  "Lista os dados bancários dos convênios existentes
  Lista os dados bancários dos convênios existentes"
  ([] (listar-convenios-using-get-with-http-info nil))
  ([{:keys [sort page limit banco agencia conta-corrente numero-convenio ]}]
   (call-api "/api/convenios" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "banco" banco "agencia" agencia "contaCorrente" conta-corrente "numeroConvenio" numero-convenio }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-convenios-using-get
  "Lista os dados bancários dos convênios existentes
  Lista os dados bancários dos convênios existentes"
  ([] (listar-convenios-using-get nil))
  ([optional-params]
   (:data (listar-convenios-using-get-with-http-info optional-params))))

(defn listar-estados-civis-using-get-with-http-info
  "{{{campo_codificado_resource_listar_estados_civis}}}
  {{{campo_codificado_resource_listar_estados_civis_notes}}}"
  ([] (listar-estados-civis-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/estados-civis" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-estados-civis-using-get
  "{{{campo_codificado_resource_listar_estados_civis}}}
  {{{campo_codificado_resource_listar_estados_civis_notes}}}"
  ([] (listar-estados-civis-using-get nil))
  ([optional-params]
   (:data (listar-estados-civis-using-get-with-http-info optional-params))))

(defn listar-fantasias-basicas-using-get-with-http-info
  "{{{fantasia_basica_resource_listar_fantasias_basicas}}}
  {{{fantasia_basica_resource_listar_fantasias_basicas_notes}}}"
  ([] (listar-fantasias-basicas-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/fantasias-basicas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-fantasias-basicas-using-get
  "{{{fantasia_basica_resource_listar_fantasias_basicas}}}
  {{{fantasia_basica_resource_listar_fantasias_basicas_notes}}}"
  ([] (listar-fantasias-basicas-using-get nil))
  ([optional-params]
   (:data (listar-fantasias-basicas-using-get-with-http-info optional-params))))

(defn listar-historico-telefones-using-get-with-http-info
  "{{{pessoa_resource_listar_historico_telefones}}}
  {{{pessoa_resource_listar_historico_telefones_notes}}}"
  [id ]
  (call-api "/api/pessoas/{id}/historico-telefones" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-historico-telefones-using-get
  "{{{pessoa_resource_listar_historico_telefones}}}
  {{{pessoa_resource_listar_historico_telefones_notes}}}"
  [id ]
  (:data (listar-historico-telefones-using-get-with-http-info id)))

(defn listar-nacionalidades-using-get-with-http-info
  "{{{campo_codificado_resource_listar_nacionalidades}}}
  {{{campo_codificado_resource_listar_nacionalidades_notes}}}"
  ([] (listar-nacionalidades-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/nacionalidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-nacionalidades-using-get
  "{{{campo_codificado_resource_listar_nacionalidades}}}
  {{{campo_codificado_resource_listar_nacionalidades_notes}}}"
  ([] (listar-nacionalidades-using-get nil))
  ([optional-params]
   (:data (listar-nacionalidades-using-get-with-http-info optional-params))))

(defn listar-naturezas-ocupacoes-using-get-with-http-info
  "{{{campo_codificado_resource_listar_naturezas_ocupacoes}}}
  {{{campo_codificado_resource_listar_naturezas_ocupacoes_notes}}}"
  ([] (listar-naturezas-ocupacoes-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/ocupacoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-naturezas-ocupacoes-using-get
  "{{{campo_codificado_resource_listar_naturezas_ocupacoes}}}
  {{{campo_codificado_resource_listar_naturezas_ocupacoes_notes}}}"
  ([] (listar-naturezas-ocupacoes-using-get nil))
  ([optional-params]
   (:data (listar-naturezas-ocupacoes-using-get-with-http-info optional-params))))

(defn listar-parentescos-using-get-with-http-info
  "{{{campo_codificado_resource_listar_parentescos}}}
  {{{campo_codificado_resource_listar_parentescos_notes}}}"
  ([] (listar-parentescos-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/parentescos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-parentescos-using-get
  "{{{campo_codificado_resource_listar_parentescos}}}
  {{{campo_codificado_resource_listar_parentescos_notes}}}"
  ([] (listar-parentescos-using-get nil))
  ([optional-params]
   (:data (listar-parentescos-using-get-with-http-info optional-params))))

(defn listar-profissoes-using-get-with-http-info
  "{{{campo_codificado_resource_listar_profissoes}}}
  {{{campo_codificado_resource_listar_profissoes_notes}}}"
  ([] (listar-profissoes-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/profissoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-profissoes-using-get
  "{{{campo_codificado_resource_listar_profissoes}}}
  {{{campo_codificado_resource_listar_profissoes_notes}}}"
  ([] (listar-profissoes-using-get nil))
  ([optional-params]
   (:data (listar-profissoes-using-get-with-http-info optional-params))))

(defn listar-tipos-campanhas-using-get-with-http-info
  "{{{tipo_campanha_resource_listar_tipos_campanhas}}}
  {{{tipo_campanha_resource_listar_tipos_campanhas_notes}}}"
  ([] (listar-tipos-campanhas-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/tipos-campanhas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-campanhas-using-get
  "{{{tipo_campanha_resource_listar_tipos_campanhas}}}
  {{{tipo_campanha_resource_listar_tipos_campanhas_notes}}}"
  ([] (listar-tipos-campanhas-using-get nil))
  ([optional-params]
   (:data (listar-tipos-campanhas-using-get-with-http-info optional-params))))

(defn listar-using-get14-with-http-info
  "{{{configuracao_registro_cobranca_resource_listar}}}
  {{{configuracao_registro_cobranca_resource_listar_notes}}}"
  ([] (listar-using-get14-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/configuracoes-registro-cobranca" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get14
  "{{{configuracao_registro_cobranca_resource_listar}}}
  {{{configuracao_registro_cobranca_resource_listar_notes}}}"
  ([] (listar-using-get14 nil))
  ([optional-params]
   (:data (listar-using-get14-with-http-info optional-params))))

(defn listar-using-get15-with-http-info
  "{{{configuracao_rotativo_resource_listar}}}
  {{{configuracao_rotativo_resource_listar_notes}}}"
  ([] (listar-using-get15-with-http-info nil))
  ([{:keys [sort page limit id-produto ]}]
   (call-api "/api/configuracoes-rotativos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idProduto" id-produto }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get15
  "{{{configuracao_rotativo_resource_listar}}}
  {{{configuracao_rotativo_resource_listar_notes}}}"
  ([] (listar-using-get15 nil))
  ([optional-params]
   (:data (listar-using-get15-with-http-info optional-params))))

(defn listar-using-get41-with-http-info
  "{{{portador_resource_listar}}}
  {{{portador_resource_listar_notes}}}"
  ([] (listar-using-get41-with-http-info nil))
  ([{:keys [sort page limit id-conta id-produto id-pessoa id-parentesco tipo-portador nome-impresso id-tipo-cartao flag-ativo data-cadastro-portador data-cancelamento-portador ]}]
   (call-api "/api/portadores" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "idProduto" id-produto "idPessoa" id-pessoa "idParentesco" id-parentesco "tipoPortador" tipo-portador "nomeImpresso" nome-impresso "idTipoCartao" id-tipo-cartao "flagAtivo" flag-ativo "dataCadastroPortador" data-cadastro-portador "dataCancelamentoPortador" data-cancelamento-portador }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get41
  "{{{portador_resource_listar}}}
  {{{portador_resource_listar_notes}}}"
  ([] (listar-using-get41 nil))
  ([optional-params]
   (:data (listar-using-get41-with-http-info optional-params))))

(defn listar-using-get42-with-http-info
  "{{{produto_resource_listar}}}
  {{{produto_resource_listar_notes}}}"
  ([] (listar-using-get42-with-http-info nil))
  ([{:keys [sort page limit nome status id-fantasia-basica ]}]
   (call-api "/api/produtos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "status" status "idFantasiaBasica" id-fantasia-basica }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get42
  "{{{produto_resource_listar}}}
  {{{produto_resource_listar_notes}}}"
  ([] (listar-using-get42 nil))
  ([optional-params]
   (:data (listar-using-get42-with-http-info optional-params))))

(defn listar-using-get43-with-http-info
  "{{{promotor_resource_listar}}}
  {{{promotor_resource_listar_notes}}}"
  ([] (listar-using-get43-with-http-info nil))
  ([{:keys [sort page limit id nome data-cadastro id-estabelecimento id-usuario ]}]
   (call-api "/api/promotores" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "dataCadastro" data-cadastro "idEstabelecimento" id-estabelecimento "idUsuario" id-usuario }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get43
  "{{{promotor_resource_listar}}}
  {{{promotor_resource_listar_notes}}}"
  ([] (listar-using-get43 nil))
  ([optional-params]
   (:data (listar-using-get43-with-http-info optional-params))))

(defn listar-using-get52-with-http-info
  "{{{tipo_ajuste_resource_consultar}}}
  {{{tipo_ajuste_resource_consultar_notes}}}"
  ([] (listar-using-get52-with-http-info nil))
  ([{:keys [sort page limit id descricao ]}]
   (call-api "/api/tipos-ajustes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get52
  "{{{tipo_ajuste_resource_consultar}}}
  {{{tipo_ajuste_resource_consultar_notes}}}"
  ([] (listar-using-get52 nil))
  ([optional-params]
   (:data (listar-using-get52-with-http-info optional-params))))

(defn listar-using-get54-with-http-info
  "{{{tipo_endereco_resource_listar}}}
  {{{tipo_endereco_resource_listar_notes}}}"
  ([] (listar-using-get54-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/tipos-enderecos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get54
  "{{{tipo_endereco_resource_listar}}}
  {{{tipo_endereco_resource_listar_notes}}}"
  ([] (listar-using-get54 nil))
  ([optional-params]
   (:data (listar-using-get54-with-http-info optional-params))))

(defn listar-using-get56-with-http-info
  "{{{tipo_telefone_resource_listar}}}
  {{{tipo_telefone_resource_listar_notes}}}"
  ([] (listar-using-get56-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/tipos-telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get56
  "{{{tipo_telefone_resource_listar}}}
  {{{tipo_telefone_resource_listar_notes}}}"
  ([] (listar-using-get56 nil))
  ([optional-params]
   (:data (listar-using-get56-with-http-info optional-params))))

(defn listar-using-get63-with-http-info
  "{{{vencimento_resource_listar}}}
  {{{vencimento_resource_listar_notes}}}"
  ([] (listar-using-get63-with-http-info nil))
  ([{:keys [sort page limit data-vencimento ]}]
   (call-api "/api/vencimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get63
  "{{{vencimento_resource_listar}}}
  {{{vencimento_resource_listar_notes}}}"
  ([] (listar-using-get63 nil))
  ([optional-params]
   (:data (listar-using-get63-with-http-info optional-params))))

(defn listar-using-get7-with-http-info
  "{{{atendimento_cliente_resource_listar}}}
  {{{atendimento_cliente_resource_listar_notes}}}"
  ([] (listar-using-get7-with-http-info nil))
  ([{:keys [sort page limit id-tipo-atendimento id-conta nome-atendente data-atendimento ]}]
   (call-api "/api/atendimento-clientes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoAtendimento" id-tipo-atendimento "idConta" id-conta "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get7
  "{{{atendimento_cliente_resource_listar}}}
  {{{atendimento_cliente_resource_listar_notes}}}"
  ([] (listar-using-get7 nil))
  ([optional-params]
   (:data (listar-using-get7-with-http-info optional-params))))

(defn listar-using-get9-with-http-info
  "{{{banco_resource_listar}}}
  {{{banco_resource_listar_notes}}}"
  ([] (listar-using-get9-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/bancos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get9
  "{{{banco_resource_listar}}}
  {{{banco_resource_listar_notes}}}"
  ([] (listar-using-get9 nil))
  ([optional-params]
   (:data (listar-using-get9-with-http-info optional-params))))

(defn salvar-using-post2-with-http-info
  "{{{atendimento_cliente_resource_salvar}}}
  {{{atendimento_cliente_resource_salvar_notes}}}"
  ([] (salvar-using-post2-with-http-info nil))
  ([{:keys [id-conta conteudo-atendimento detalhes-atendimento nome-atendente data-atendimento data-agendamento data-hora-inicio-atendimento data-hora-fim-atendimento flag-fila-fraude ]}]
   (call-api "/api/atendimento-clientes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "conteudoAtendimento" conteudo-atendimento "detalhesAtendimento" detalhes-atendimento "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento "dataAgendamento" data-agendamento "dataHoraInicioAtendimento" data-hora-inicio-atendimento "dataHoraFimAtendimento" data-hora-fim-atendimento "flagFilaFraude" flag-fila-fraude }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post2
  "{{{atendimento_cliente_resource_salvar}}}
  {{{atendimento_cliente_resource_salvar_notes}}}"
  ([] (salvar-using-post2 nil))
  ([optional-params]
   (:data (salvar-using-post2-with-http-info optional-params))))

(defn salvar-using-post4-with-http-info
  "{{{campanha_resource_salvar}}}
  {{{campanha_resource_salvar_notes}}}"
  [campanha-persist ]
  (call-api "/api/campanhas" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    campanha-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post4
  "{{{campanha_resource_salvar}}}
  {{{campanha_resource_salvar_notes}}}"
  [campanha-persist ]
  (:data (salvar-using-post4-with-http-info campanha-persist)))

(defn salvar-using-post6-with-http-info
  "{{{configuracao_rotativo_resource_salvar}}}
  {{{configuracao_rotativo_resource_salvar_notes}}}"
  [configuracao-rotativo-persist ]
  (call-api "/api/configuracoes-rotativos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    configuracao-rotativo-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post6
  "{{{configuracao_rotativo_resource_salvar}}}
  {{{configuracao_rotativo_resource_salvar_notes}}}"
  [configuracao-rotativo-persist ]
  (:data (salvar-using-post6-with-http-info configuracao-rotativo-persist)))
