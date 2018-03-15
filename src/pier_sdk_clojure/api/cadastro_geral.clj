(ns pier-sdk-clojure.api.cadastro-geral
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put2-with-http-info
  "Alterar campanha
  Este método permite que sejam alterados os dados de uma campanha."
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

(defn alterar-using-put2
  "Alterar campanha
  Este método permite que sejam alterados os dados de uma campanha."
  [id update ]
  (:data (alterar-using-put2-with-http-info id update)))

(defn alterar-using-put3-with-http-info
  "Atualizar configuração para registro de cobrança
  Este método permite atualizar uma configuração, para registro de cobrança."
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

(defn alterar-using-put3
  "Atualizar configuração para registro de cobrança
  Este método permite atualizar uma configuração, para registro de cobrança."
  [id configuracao-persist ]
  (:data (alterar-using-put3-with-http-info id configuracao-persist)))

(defn alterar-using-put4-with-http-info
  "Alterar os dados de configuração do rotativo de um produto
  Este método permite que seja alterada uma configuração do rotativo para um determinado produto."
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

(defn alterar-using-put4
  "Alterar os dados de configuração do rotativo de um produto
  Este método permite que seja alterada uma configuração do rotativo para um determinado produto."
  [id configuracao-rotativo-persist ]
  (:data (alterar-using-put4-with-http-info id configuracao-rotativo-persist)))

(defn cadastrar-using-post1-with-http-info
  "Inserir configuração para registro de cobrança
  Este método permite que seja cadastrado uma nova configuração, para registro de cobrança."
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
  "Inserir configuração para registro de cobrança
  Este método permite que seja cadastrado uma nova configuração, para registro de cobrança."
  [configuracao-persist ]
  (:data (cadastrar-using-post1-with-http-info configuracao-persist)))

(defn configurar-taxa-antecipacao-using-post-with-http-info
  "Configura a Taxa de Antecipação de um Produto
  Este recurso permite configurar a Taxa de Antecipação de um Produto, a partir do seu código de identificação (id)."
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
  "Configura a Taxa de Antecipação de um Produto
  Este recurso permite configurar a Taxa de Antecipação de um Produto, a partir do seu código de identificação (id)."
  [id taxa-antecipacao-request ]
  (:data (configurar-taxa-antecipacao-using-post-with-http-info id taxa-antecipacao-request)))

(defn consultar-campanha-using-get-with-http-info
  "Consultar campanha
  Este método permite que sejam listados os dados de uma determinada campanha existente na base do emissor. Para isso, é preciso informar o seu respectivo código de identificação (id)."
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
  "Consultar campanha
  Este método permite que sejam listados os dados de uma determinada campanha existente na base do emissor. Para isso, é preciso informar o seu respectivo código de identificação (id)."
  [id ]
  (:data (consultar-campanha-using-get-with-http-info id)))

(defn consultar-taxa-antecipacao-using-get-with-http-info
  "Consulta a Taxa de Antecipação de um Produto
  Este recurso permite consultar a Taxa de Antecipação de um Produto, a partir do seu código de identificação (id)."
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
  "Consulta a Taxa de Antecipação de um Produto
  Este recurso permite consultar a Taxa de Antecipação de um Produto, a partir do seu código de identificação (id)."
  [id tipo-transacao ]
  (:data (consultar-taxa-antecipacao-using-get-with-http-info id tipo-transacao)))

(defn consultar-using-get10-with-http-info
  "Consultar configuração para registro de cobrança
  Este método permite buscar uma configuração, para registro de cobrança."
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
  "Consultar configuração para registro de cobrança
  Este método permite buscar uma configuração, para registro de cobrança."
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn consultar-using-get11-with-http-info
  "Apresenta dados de configuração do rotativo específico.
  Este recurso permite consultar dados de configuração do parcelamento rotativo a partir de seu codigo de identificação (id)."
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
  "Apresenta dados de configuração do rotativo específico.
  Este recurso permite consultar dados de configuração do parcelamento rotativo a partir de seu codigo de identificação (id)."
  [id ]
  (:data (consultar-using-get11-with-http-info id)))

(defn consultar-using-get26-with-http-info
  "Apresenta os dados de um determinado Produto
  Este método permite consultar um determinado Produto a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/produtos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get26
  "Apresenta os dados de um determinado Produto
  Este método permite consultar um determinado Produto a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get26-with-http-info id)))

(defn consultar-using-get33-with-http-info
  "Lista os tipos de ajustes do emissor
  Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor."
  ([] (consultar-using-get33-with-http-info nil))
  ([{:keys [sort page limit id descricao ]}]
   (call-api "/api/tipos-ajustes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get33
  "Lista os tipos de ajustes do emissor
  Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor."
  ([] (consultar-using-get33 nil))
  ([optional-params]
   (:data (consultar-using-get33-with-http-info optional-params))))

(defn consultar-using-get34-with-http-info
  "Lista os tipos de boletos do emissor
  Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor."
  ([] (consultar-using-get34-with-http-info nil))
  ([{:keys [sort page limit id descricao banco ]}]
   (call-api "/api/tipos-boletos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao "banco" banco }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get34
  "Lista os tipos de boletos do emissor
  Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor."
  ([] (consultar-using-get34 nil))
  ([optional-params]
   (:data (consultar-using-get34-with-http-info optional-params))))

(defn consultar-using-get35-with-http-info
  "Apresenta os dados de um determinado Tipo de Endereço
  Este método permite consultar um determinado Tipo de Endereço a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/tipos-enderecos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get35
  "Apresenta os dados de um determinado Tipo de Endereço
  Este método permite consultar um determinado Tipo de Endereço a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get35-with-http-info id)))

(defn consultar-using-get36-with-http-info
  "Apresenta dados de um determinado tipo de operação
  Este recurso permite consultar dados de um determinado tipo operação a partir do idCartao, idEstabelecimento e codigoProcessamento."
  [id-cartao id-estabelecimento codigo-processamento ]
  (call-api "/api/tipos-operacoes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"idCartao" id-cartao "idEstabelecimento" id-estabelecimento "codigoProcessamento" codigo-processamento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get36
  "Apresenta dados de um determinado tipo de operação
  Este recurso permite consultar dados de um determinado tipo operação a partir do idCartao, idEstabelecimento e codigoProcessamento."
  [id-cartao id-estabelecimento codigo-processamento ]
  (:data (consultar-using-get36-with-http-info id-cartao id-estabelecimento codigo-processamento)))

(defn consultar-using-get38-with-http-info
  "Apresenta os dados de um determinado Tipo de Telefone
  Este método permite consultar um determinado Tipo de Telefone a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/tipos-telefones/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get38
  "Apresenta os dados de um determinado Tipo de Telefone
  Este método permite consultar um determinado Tipo de Telefone a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get38-with-http-info id)))

(defn consultar-using-get4-with-http-info
  "Apresenta os dados de um determinado Atendimento
  Este método permite consultar os parâmetros de um determinado Atendimento a partir do seu código de identificação (idAtendimento)."
  [id ]
  (call-api "/api/atendimento-clientes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get4
  "Apresenta os dados de um determinado Atendimento
  Este método permite consultar os parâmetros de um determinado Atendimento a partir do seu código de identificação (idAtendimento)."
  [id ]
  (:data (consultar-using-get4-with-http-info id)))

(defn consultar-using-get6-with-http-info
  "Apresenta os dados de um determinado Banco
  Este método permite consultar um determinado Banco a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/bancos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get6
  "Apresenta os dados de um determinado Banco
  Este método permite consultar um determinado Banco a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get6-with-http-info id)))

(defn listar-campanhas-using-get-with-http-info
  "Listar Campanhas
  Lista as campanhas."
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
  "Listar Campanhas
  Lista as campanhas."
  ([] (listar-campanhas-using-get nil))
  ([optional-params]
   (:data (listar-campanhas-using-get-with-http-info optional-params))))

(defn listar-contas-por-pessoa-using-get-with-http-info
  "Lista as contas da pessoa
  Permite listar as contas de um pessoa a partir do seu numero na receita federal."
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
  "Lista as contas da pessoa
  Permite listar as contas de um pessoa a partir do seu numero na receita federal."
  ([numero-receita-federal ] (listar-contas-por-pessoa-using-get numero-receita-federal nil))
  ([numero-receita-federal optional-params]
   (:data (listar-contas-por-pessoa-using-get-with-http-info numero-receita-federal optional-params))))

(defn listar-estados-civis-using-get-with-http-info
  "Lista os Estados Cívis
  Este método permite que sejam listados os Estados Cívis na base de dados do Emissor."
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
  "Lista os Estados Cívis
  Este método permite que sejam listados os Estados Cívis na base de dados do Emissor."
  ([] (listar-estados-civis-using-get nil))
  ([optional-params]
   (:data (listar-estados-civis-using-get-with-http-info optional-params))))

(defn listar-fantasias-basicas-using-get-with-http-info
  "Listar Fantasias Básicas
  Lista as fantasia básicas."
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
  "Listar Fantasias Básicas
  Lista as fantasia básicas."
  ([] (listar-fantasias-basicas-using-get nil))
  ([optional-params]
   (:data (listar-fantasias-basicas-using-get-with-http-info optional-params))))

(defn listar-historico-telefones-using-get-with-http-info
  "Listar alterações de telefones realizadas nos últimos 60 dias
  Este método permite verificar quais os telefones de um determinado que cliente que sofreram alteração nos últimos 60 dias."
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
  "Listar alterações de telefones realizadas nos últimos 60 dias
  Este método permite verificar quais os telefones de um determinado que cliente que sofreram alteração nos últimos 60 dias."
  [id ]
  (:data (listar-historico-telefones-using-get-with-http-info id)))

(defn listar-nacionalidades-using-get-with-http-info
  "Lista nacionalidades
  Este método permite que sejam listados as nacionalidades na base de dados do Emissor."
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
  "Lista nacionalidades
  Este método permite que sejam listados as nacionalidades na base de dados do Emissor."
  ([] (listar-nacionalidades-using-get nil))
  ([optional-params]
   (:data (listar-nacionalidades-using-get-with-http-info optional-params))))

(defn listar-naturezas-ocupacoes-using-get-with-http-info
  "Lista as Ocupações
  Este método permite que sejam listados as naturezas de operações na base de dados do Emissor."
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
  "Lista as Ocupações
  Este método permite que sejam listados as naturezas de operações na base de dados do Emissor."
  ([] (listar-naturezas-ocupacoes-using-get nil))
  ([optional-params]
   (:data (listar-naturezas-ocupacoes-using-get-with-http-info optional-params))))

(defn listar-parentescos-using-get-with-http-info
  "Lista os Parentescos
  Este método permite que sejam listados parentescos na base de dados do Emissor."
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
  "Lista os Parentescos
  Este método permite que sejam listados parentescos na base de dados do Emissor."
  ([] (listar-parentescos-using-get nil))
  ([optional-params]
   (:data (listar-parentescos-using-get-with-http-info optional-params))))

(defn listar-profissoes-using-get-with-http-info
  "Lista profissões
  Este método permite que sejam listados as profissões na base de dados do Emissor."
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
  "Lista profissões
  Este método permite que sejam listados as profissões na base de dados do Emissor."
  ([] (listar-profissoes-using-get nil))
  ([optional-params]
   (:data (listar-profissoes-using-get-with-http-info optional-params))))

(defn listar-tipos-campanhas-using-get-with-http-info
  "Listar Tipos de Campanhas
  Lista os tipos de campanhas."
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
  "Listar Tipos de Campanhas
  Lista os tipos de campanhas."
  ([] (listar-tipos-campanhas-using-get nil))
  ([optional-params]
   (:data (listar-tipos-campanhas-using-get-with-http-info optional-params))))

(defn listar-using-get13-with-http-info
  "Listar configurações para registro de cobrança
  Este método permite listar as configurações de registro de cobrança."
  ([] (listar-using-get13-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/configuracoes-registro-cobranca" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get13
  "Listar configurações para registro de cobrança
  Este método permite listar as configurações de registro de cobrança."
  ([] (listar-using-get13 nil))
  ([optional-params]
   (:data (listar-using-get13-with-http-info optional-params))))

(defn listar-using-get14-with-http-info
  "Listar as configurações rotativo.
  Este recurso permite listar as configurações rotativo."
  ([] (listar-using-get14-with-http-info nil))
  ([{:keys [sort page limit id-produto ]}]
   (call-api "/api/configuracoes-rotativos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idProduto" id-produto }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get14
  "Listar as configurações rotativo.
  Este recurso permite listar as configurações rotativo."
  ([] (listar-using-get14 nil))
  ([optional-params]
   (:data (listar-using-get14-with-http-info optional-params))))

(defn listar-using-get34-with-http-info
  "Lista os Portadores existentes
  Este método permite que sejam listados os portadores cadastrados na base do emissor."
  ([] (listar-using-get34-with-http-info nil))
  ([{:keys [sort page limit id-conta id-produto id-pessoa id-parentesco tipo-portador nome-impresso id-tipo-cartao flag-ativo data-cadastro-portador data-cancelamento-portador ]}]
   (call-api "/api/portadores" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "idProduto" id-produto "idPessoa" id-pessoa "idParentesco" id-parentesco "tipoPortador" tipo-portador "nomeImpresso" nome-impresso "idTipoCartao" id-tipo-cartao "flagAtivo" flag-ativo "dataCadastroPortador" data-cadastro-portador "dataCancelamentoPortador" data-cancelamento-portador }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get34
  "Lista os Portadores existentes
  Este método permite que sejam listados os portadores cadastrados na base do emissor."
  ([] (listar-using-get34 nil))
  ([optional-params]
   (:data (listar-using-get34-with-http-info optional-params))))

(defn listar-using-get35-with-http-info
  "Lista os Produtos do Emissor
  Este método permite que sejam listados os Produtos existentes na base de dados do Emissor."
  ([] (listar-using-get35-with-http-info nil))
  ([{:keys [sort page limit nome status id-fantasia-basica ]}]
   (call-api "/api/produtos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "status" status "idFantasiaBasica" id-fantasia-basica }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get35
  "Lista os Produtos do Emissor
  Este método permite que sejam listados os Produtos existentes na base de dados do Emissor."
  ([] (listar-using-get35 nil))
  ([optional-params]
   (:data (listar-using-get35-with-http-info optional-params))))

(defn listar-using-get36-with-http-info
  "Lista promotores cadastrados na base do emissor
  Este método permite que sejam listados os cadastros de Promoteres existentes na base de dados do Emissor."
  ([] (listar-using-get36-with-http-info nil))
  ([{:keys [sort page limit id nome data-cadastro id-estabelecimento id-usuario ]}]
   (call-api "/api/promotores" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "dataCadastro" data-cadastro "idEstabelecimento" id-estabelecimento "idUsuario" id-usuario }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get36
  "Lista promotores cadastrados na base do emissor
  Este método permite que sejam listados os cadastros de Promoteres existentes na base de dados do Emissor."
  ([] (listar-using-get36 nil))
  ([optional-params]
   (:data (listar-using-get36-with-http-info optional-params))))

(defn listar-using-get44-with-http-info
  "Lista as opões de Tipos de Endereços do Emissor
  Este método permite que sejam listados os Tipos de Endereços existentes na base de dados do Emissor."
  ([] (listar-using-get44-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/tipos-enderecos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get44
  "Lista as opões de Tipos de Endereços do Emissor
  Este método permite que sejam listados os Tipos de Endereços existentes na base de dados do Emissor."
  ([] (listar-using-get44 nil))
  ([optional-params]
   (:data (listar-using-get44-with-http-info optional-params))))

(defn listar-using-get46-with-http-info
  "Lista os Tipos de Telefones
  Este método permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get46-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/tipos-telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get46
  "Lista os Tipos de Telefones
  Este método permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get46 nil))
  ([optional-params]
   (:data (listar-using-get46-with-http-info optional-params))))

(defn listar-using-get52-with-http-info
  "Listar Vencimentos
  Este recurso permite que sejam listados os Vencimentos do emissor."
  ([] (listar-using-get52-with-http-info nil))
  ([{:keys [sort page limit data-vencimento ]}]
   (call-api "/api/vencimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get52
  "Listar Vencimentos
  Este recurso permite que sejam listados os Vencimentos do emissor."
  ([] (listar-using-get52 nil))
  ([optional-params]
   (:data (listar-using-get52-with-http-info optional-params))))

(defn listar-using-get6-with-http-info
  "Lista todos os atendimentos
  Este método permite que sejam listados todos os Registro de Atendimento, independente do Tipo."
  ([] (listar-using-get6-with-http-info nil))
  ([{:keys [sort page limit id-tipo-atendimento id-conta nome-atendente data-atendimento ]}]
   (call-api "/api/atendimento-clientes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoAtendimento" id-tipo-atendimento "idConta" id-conta "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get6
  "Lista todos os atendimentos
  Este método permite que sejam listados todos os Registro de Atendimento, independente do Tipo."
  ([] (listar-using-get6 nil))
  ([optional-params]
   (:data (listar-using-get6-with-http-info optional-params))))

(defn listar-using-get8-with-http-info
  "Lista os Bancos cadastrados para o Emissor
  Este método permite que sejam listados os Bancos existentes na base de dados do Emissor."
  ([] (listar-using-get8-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/bancos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get8
  "Lista os Bancos cadastrados para o Emissor
  Este método permite que sejam listados os Bancos existentes na base de dados do Emissor."
  ([] (listar-using-get8 nil))
  ([optional-params]
   (:data (listar-using-get8-with-http-info optional-params))))

(defn salvar-using-post2-with-http-info
  "Cadastro um novo Atendimento do tipo Genérico para uma Conta"
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
  "Cadastro um novo Atendimento do tipo Genérico para uma Conta"
  ([] (salvar-using-post2 nil))
  ([optional-params]
   (:data (salvar-using-post2-with-http-info optional-params))))

(defn salvar-using-post5-with-http-info
  "Inserir campanha
  Este método permite que seja cadastrado uma nova campanha."
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

(defn salvar-using-post5
  "Inserir campanha
  Este método permite que seja cadastrado uma nova campanha."
  [campanha-persist ]
  (:data (salvar-using-post5-with-http-info campanha-persist)))

(defn salvar-using-post7-with-http-info
  "Inserir os dados de configuração do rotativo de um produto
  Este método permite que seja cadastrado uma nova configuração do rotativo para um determinado produto."
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

(defn salvar-using-post7
  "Inserir os dados de configuração do rotativo de um produto
  Este método permite que seja cadastrado uma nova configuração do rotativo para um determinado produto."
  [configuracao-rotativo-persist ]
  (:data (salvar-using-post7-with-http-info configuracao-rotativo-persist)))
