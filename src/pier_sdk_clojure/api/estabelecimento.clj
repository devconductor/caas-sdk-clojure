(ns pier-sdk-clojure.api.estabelecimento
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-origem-comercial-using-put-with-http-info
  "Alterar Origem Comercial
  Altera uma origem comercial."
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
  "Alterar Origem Comercial
  Altera uma origem comercial."
  [id origem-comercial-update ]
  (:data (alterar-origem-comercial-using-put-with-http-info id origem-comercial-update)))

(defn alterar-using-put10-with-http-info
  "Altera uma Maquineta
  Este método realiza a alteração das maquinetas dos estabelecimentos."
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
  "Altera uma Maquineta
  Este método realiza a alteração das maquinetas dos estabelecimentos."
  [id maquineta-update ]
  (:data (alterar-using-put10-with-http-info id maquineta-update)))

(defn alterar-using-put11-with-http-info
  "Altera uma Regra Operação
  Este método realiza a alteração de uma regra operação."
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
  "Altera uma Regra Operação
  Este método realiza a alteração de uma regra operação."
  [id operacao-credor-update ]
  (:data (alterar-using-put11-with-http-info id operacao-credor-update)))

(defn alterar-using-put15-with-http-info
  "Altera um Telefone do estabelecimento
  Este método realiza a alteração dos telefones dos estabelecimentos."
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

(defn alterar-using-put15
  "Altera um Telefone do estabelecimento
  Este método realiza a alteração dos telefones dos estabelecimentos."
  [id telefone-estabelecimento-update ]
  (:data (alterar-using-put15-with-http-info id telefone-estabelecimento-update)))

(defn alterar-using-put17-with-http-info
  "Altera um Terminal
  Este método realiza a alteração dos Terminais."
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

(defn alterar-using-put17
  "Altera um Terminal
  Este método realiza a alteração dos Terminais."
  [id terminal-update ]
  (:data (alterar-using-put17-with-http-info id terminal-update)))

(defn alterar-using-put6-with-http-info
  "Alterar um estabelecimento
  Altera um estabelecimento"
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
  "Alterar um estabelecimento
  Altera um estabelecimento"
  [id update ]
  (:data (alterar-using-put6-with-http-info id update)))

(defn alterar-using-put8-with-http-info
  "Alterar Grupo Econômico
  Altera um grupo econômico."
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
  "Alterar Grupo Econômico
  Altera um grupo econômico."
  [id grupo-economico-dto ]
  (:data (alterar-using-put8-with-http-info id grupo-economico-dto)))

(defn cadastrar-origem-comercial-using-post-with-http-info
  "Cadastrar Origem Comercial
  Cadastra uma origem comercial."
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
  "Cadastrar Origem Comercial
  Cadastra uma origem comercial."
  [origem-comercial-persist ]
  (:data (cadastrar-origem-comercial-using-post-with-http-info origem-comercial-persist)))

(defn cadastrar-using-post2-with-http-info
  "Cadastrar um estabelecimento
  Cadastra um novo estabelecimento"
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
  "Cadastrar um estabelecimento
  Cadastra um novo estabelecimento"
  [persist ]
  (:data (cadastrar-using-post2-with-http-info persist)))

(defn cadastrar-using-post3-with-http-info
  "Cadastrar Grupo Econômico
  Cadastra um grupo econômico."
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
  "Cadastrar Grupo Econômico
  Cadastra um grupo econômico."
  [grupo-economico-dto ]
  (:data (cadastrar-using-post3-with-http-info grupo-economico-dto)))

(defn consulta-operacao-using-get-with-http-info
  "Apresenta dados de um determinado tipo de operação
  Este recurso permite consultar dados de um determinado tipo operação a partir do idoperacao"
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
  "Apresenta dados de um determinado tipo de operação
  Este recurso permite consultar dados de um determinado tipo operação a partir do idoperacao"
  [id ]
  (:data (consulta-operacao-using-get-with-http-info id)))

(defn consultar-origem-comercial-using-get-with-http-info
  "Consultar Origem Comercial
  Consulta uma origem comercial através do seu identificador."
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
  "Consultar Origem Comercial
  Consulta uma origem comercial através do seu identificador."
  [id ]
  (:data (consultar-origem-comercial-using-get-with-http-info id)))

(defn consultar-using-get17-with-http-info
  "Consultar estabelecimento por id
  Consulta os detalhes de um determinado estabelecimento"
  [id ]
  (call-api "/api/estabelecimentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get17
  "Consultar estabelecimento por id
  Consulta os detalhes de um determinado estabelecimento"
  [id ]
  (:data (consultar-using-get17-with-http-info id)))

(defn consultar-using-get19-with-http-info
  "Consultar grupo econômico
  Consulta um grupo econômico através do seu identificador."
  [id ]
  (call-api "/api/grupos-economicos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get19
  "Consultar grupo econômico
  Consulta um grupo econômico através do seu identificador."
  [id ]
  (:data (consultar-using-get19-with-http-info id)))

(defn consultar-using-get21-with-http-info
  "Apresenta os dados de uma determinada maquineta
  Este método permite consultar uma determinada maquineta a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/maquinetas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get21
  "Apresenta os dados de uma determinada maquineta
  Este método permite consultar uma determinada maquineta a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get21-with-http-info id)))

(defn consultar-using-get22-with-http-info
  "Apresenta os dados de uma determinada Regra Operação
  Este método permite consultar uma determinada regra operação a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/regras-operacoes-estabelecimentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get22
  "Apresenta os dados de uma determinada Regra Operação
  Este método permite consultar uma determinada regra operação a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get22-with-http-info id)))

(defn consultar-using-get30-with-http-info
  "Apresenta os dados de um determinado telefone de um estabelecimento
  Este método permite consultar um determinado telefone de um estabelecimento a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/telefones-estabelecimentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get30
  "Apresenta os dados de um determinado telefone de um estabelecimento
  Este método permite consultar um determinado telefone de um estabelecimento a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get30-with-http-info id)))

(defn consultar-using-get32-with-http-info
  "Apresenta os dados de um determinado Terminal
  Este método permite consultar um determinado Terminal a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/terminais/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get32
  "Apresenta os dados de um determinado Terminal
  Este método permite consultar um determinado Terminal a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get32-with-http-info id)))

(defn consultar-using-get44-with-http-info
  "Apresenta os dados de um determinado Vínculo
  Este método permite consultar um determinado Vínculo a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/adquirentes-estabelecimento/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get44
  "Apresenta os dados de um determinado Vínculo
  Este método permite consultar um determinado Vínculo a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get44-with-http-info id)))

(defn desabilitar-vinculo-using-post-with-http-info
  "Desabilitar um Vínculo
  Este método realiza a desativação de um vínculo."
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
  "Desabilitar um Vínculo
  Este método realiza a desativação de um vínculo."
  [id ]
  (:data (desabilitar-vinculo-using-post-with-http-info id)))

(defn desabilitar-vinculo-using-post1-with-http-info
  "Desabilitar um vínculo operação
  Este método permite desabilitar um vínculo."
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
  "Desabilitar um vínculo operação
  Este método permite desabilitar um vínculo."
  [id vinculo-operacao-persist ]
  (:data (desabilitar-vinculo-using-post1-with-http-info id vinculo-operacao-persist)))

(defn habilitar-vinculo-using-post-with-http-info
  "Habilitar um Vínculo
  Este método realiza a ativação de um vínculo."
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
  "Habilitar um Vínculo
  Este método realiza a ativação de um vínculo."
  [id ]
  (:data (habilitar-vinculo-using-post-with-http-info id)))

(defn habilitar-vinculo-using-post1-with-http-info
  "Habilitar um vínculo operação
  Este método permite habilitar um vínculo."
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
  "Habilitar um vínculo operação
  Este método permite habilitar um vínculo."
  [id vinculo-operacao-persist ]
  (:data (habilitar-vinculo-using-post1-with-http-info id vinculo-operacao-persist)))

(defn lista-operacao-using-get-with-http-info
  "Apresenta dados de operações em uma lista
  Este recurso permite listar as operação"
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
  "Apresenta dados de operações em uma lista
  Este recurso permite listar as operação"
  ([] (lista-operacao-using-get nil))
  ([optional-params]
   (:data (lista-operacao-using-get-with-http-info optional-params))))

(defn listar-mcc-using-get-with-http-info
  "Lista os MCCs
  Este método permite que sejam listados os MCCs existentes na base de dados do Emissor."
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
  "Lista os MCCs
  Este método permite que sejam listados os MCCs existentes na base de dados do Emissor."
  ([] (listar-mcc-using-get nil))
  ([optional-params]
   (:data (listar-mcc-using-get-with-http-info optional-params))))

(defn listar-origens-comerciais-using-get-with-http-info
  "Listar Origens Comerciais
  Lista origens comerciais cadastradas."
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
  "Listar Origens Comerciais
  Lista origens comerciais cadastradas."
  ([] (listar-origens-comerciais-using-get nil))
  ([optional-params]
   (:data (listar-origens-comerciais-using-get-with-http-info optional-params))))

(defn listar-tipos-adquirentes-using-get-with-http-info
  "Lista os Tipos de adquirentes
  Este método permite que sejam listados os tipos de adquirentes."
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
  "Lista os Tipos de adquirentes
  Este método permite que sejam listados os tipos de adquirentes."
  ([] (listar-tipos-adquirentes-using-get nil))
  ([optional-params]
   (:data (listar-tipos-adquirentes-using-get-with-http-info optional-params))))

(defn listar-tipos-estabelecimentos-using-get-with-http-info
  "Lista os tipos de estabelecimentos
  Lista os tipos de estabelecimentos"
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
  "Lista os tipos de estabelecimentos
  Lista os tipos de estabelecimentos"
  ([] (listar-tipos-estabelecimentos-using-get nil))
  ([optional-params]
   (:data (listar-tipos-estabelecimentos-using-get-with-http-info optional-params))))

(defn listar-tipos-maquinetas-using-get-with-http-info
  "Lista os Tipos de  Maquinetas
  Este método permite que sejam listadas os Tipos de maquinetas existentes na base de dados do Emissor."
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
  "Lista os Tipos de  Maquinetas
  Este método permite que sejam listadas os Tipos de maquinetas existentes na base de dados do Emissor."
  ([] (listar-tipos-maquinetas-using-get nil))
  ([optional-params]
   (:data (listar-tipos-maquinetas-using-get-with-http-info optional-params))))

(defn listar-tipos-origens-comerciais-using-get-with-http-info
  "Listar tipos de origens comerciais
  Lista os tipos de origens comerciais"
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
  "Listar tipos de origens comerciais
  Lista os tipos de origens comerciais"
  ([] (listar-tipos-origens-comerciais-using-get nil))
  ([optional-params]
   (:data (listar-tipos-origens-comerciais-using-get-with-http-info optional-params))))

(defn listar-tipos-terminais-using-get1-with-http-info
  "Lista os Tipos Terminais
  Este método permite que sejam listados os tipos de terminais existentes na base de dados do Emissor."
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
  "Lista os Tipos Terminais
  Este método permite que sejam listados os tipos de terminais existentes na base de dados do Emissor."
  ([] (listar-tipos-terminais-using-get1 nil))
  ([optional-params]
   (:data (listar-tipos-terminais-using-get1-with-http-info optional-params))))

(defn listar-using-get22-with-http-info
  "Lista Estabelecimentos
  Lista todos os Estabelecimentos"
  ([] (listar-using-get22-with-http-info nil))
  ([{:keys [sort page limit id id-grupo-economico numero-receita-federal nome descricao nome-fantasia cep nome-logradouro numero-endereco complemento bairro cidade uf pais data-cadastramento contato email flag-arquivo-secr-fazenda flag-cartao-digitado inativo id-pais mcc id-tipo-estabelecimento correspondencia id-moeda tipo-pagamento numero-estabelecimento cep2 nome-logradouro2 numero-endereco2 complemento2 bairro2 cidade2 uf2 flag-matriz ]}]
   (call-api "/api/estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idGrupoEconomico" id-grupo-economico "numeroReceitaFederal" numero-receita-federal "nome" nome "descricao" descricao "nomeFantasia" nome-fantasia "cep" cep "nomeLogradouro" nome-logradouro "numeroEndereco" numero-endereco "complemento" complemento "bairro" bairro "cidade" cidade "uf" uf "pais" pais "dataCadastramento" data-cadastramento "contato" contato "email" email "flagArquivoSecrFazenda" flag-arquivo-secr-fazenda "flagCartaoDigitado" flag-cartao-digitado "inativo" inativo "idPais" id-pais "mcc" mcc "idTipoEstabelecimento" id-tipo-estabelecimento "correspondencia" correspondencia "idMoeda" id-moeda "tipoPagamento" tipo-pagamento "numeroEstabelecimento" numero-estabelecimento "cep2" cep2 "nomeLogradouro2" nome-logradouro2 "numeroEndereco2" numero-endereco2 "complemento2" complemento2 "bairro2" bairro2 "cidade2" cidade2 "uf2" uf2 "flagMatriz" flag-matriz }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get22
  "Lista Estabelecimentos
  Lista todos os Estabelecimentos"
  ([] (listar-using-get22 nil))
  ([optional-params]
   (:data (listar-using-get22-with-http-info optional-params))))

(defn listar-using-get24-with-http-info
  "Listar grupos econômicos
  Lista grupos econômicos cadastrados."
  ([] (listar-using-get24-with-http-info nil))
  ([{:keys [sort page limit razao-social nome-credor numero-receita-federal inscricao-estadual contato banco agencia digito-agencia conta-corrente digito-conta-corrente periodicidade pagamento-semanal pagamento-mensal pagamento-decendial-primeiro pagamento-decendial-segundo pagamento-decendial-terceiro pagamento-quinzenal-primeiro pagamento-quinzenal-segundo percentual-rav recebe-rav percentual-multiplica taxa-adm taxa-banco limite-rav id-credor-rav ]}]
   (call-api "/api/grupos-economicos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "razaoSocial" razao-social "nomeCredor" nome-credor "numeroReceitaFederal" numero-receita-federal "inscricaoEstadual" inscricao-estadual "contato" contato "banco" banco "agencia" agencia "digitoAgencia" digito-agencia "contaCorrente" conta-corrente "digitoContaCorrente" digito-conta-corrente "periodicidade" periodicidade "pagamentoSemanal" pagamento-semanal "pagamentoMensal" pagamento-mensal "pagamentoDecendialPrimeiro" pagamento-decendial-primeiro "pagamentoDecendialSegundo" pagamento-decendial-segundo "pagamentoDecendialTerceiro" pagamento-decendial-terceiro "pagamentoQuinzenalPrimeiro" pagamento-quinzenal-primeiro "pagamentoQuinzenalSegundo" pagamento-quinzenal-segundo "percentualRAV" percentual-rav "recebeRAV" recebe-rav "percentualMultiplica" percentual-multiplica "taxaAdm" taxa-adm "taxaBanco" taxa-banco "limiteRAV" limite-rav "idCredorRAV" id-credor-rav }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get24
  "Listar grupos econômicos
  Lista grupos econômicos cadastrados."
  ([] (listar-using-get24 nil))
  ([optional-params]
   (:data (listar-using-get24-with-http-info optional-params))))

(defn listar-using-get25-with-http-info
  "Listar grupos de origens comerciais
  Lista os grupos de origens comerciais"
  ([] (listar-using-get25-with-http-info nil))
  ([{:keys [sort page limit nome ]}]
   (call-api "/api/grupos-origens-comerciais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get25
  "Listar grupos de origens comerciais
  Lista os grupos de origens comerciais"
  ([] (listar-using-get25 nil))
  ([optional-params]
   (:data (listar-using-get25-with-http-info optional-params))))

(defn listar-using-get27-with-http-info
  "Lista as Maquinetas
  Este método permite que sejam listadas as maquinetas existentes na base de dados do Emissor."
  ([] (listar-using-get27-with-http-info nil))
  ([{:keys [sort page limit id-estabelecimento ]}]
   (call-api "/api/maquinetas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idEstabelecimento" id-estabelecimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get27
  "Lista as Maquinetas
  Este método permite que sejam listadas as maquinetas existentes na base de dados do Emissor."
  ([] (listar-using-get27 nil))
  ([optional-params]
   (:data (listar-using-get27-with-http-info optional-params))))

(defn listar-using-get28-with-http-info
  "Lista os tipos de moedas do emissor
  Este recurso permite que sejam listados os tipos de moedas existentes na base de dados do emissor."
  ([] (listar-using-get28-with-http-info nil))
  ([{:keys [sort page limit codigo-moeda simbolo descricao ]}]
   (call-api "/api/tipos-moedas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "codigoMoeda" codigo-moeda "simbolo" simbolo "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get28
  "Lista os tipos de moedas do emissor
  Este recurso permite que sejam listados os tipos de moedas existentes na base de dados do emissor."
  ([] (listar-using-get28 nil))
  ([optional-params]
   (:data (listar-using-get28-with-http-info optional-params))))

(defn listar-using-get29-with-http-info
  "Lista as Regras Operações
  Este método permite que sejam listados as Regras operações existentes na base de dados do Emissor."
  ([] (listar-using-get29-with-http-info nil))
  ([{:keys [sort page limit id-operacao id-credor id-produto ]}]
   (call-api "/api/regras-operacoes-estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idOperacao" id-operacao "idCredor" id-credor "idProduto" id-produto }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get29
  "Lista as Regras Operações
  Este método permite que sejam listados as Regras operações existentes na base de dados do Emissor."
  ([] (listar-using-get29 nil))
  ([optional-params]
   (:data (listar-using-get29-with-http-info optional-params))))

(defn listar-using-get40-with-http-info
  "Lista os Telefones Estabelecimentos
  Este método permite que sejam listados os telefones dos estabelecimentos existentes na base de dados do Emissor."
  ([] (listar-using-get40-with-http-info nil))
  ([{:keys [sort page limit id-estabelecimento ]}]
   (call-api "/api/telefones-estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idEstabelecimento" id-estabelecimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get40
  "Lista os Telefones Estabelecimentos
  Este método permite que sejam listados os telefones dos estabelecimentos existentes na base de dados do Emissor."
  ([] (listar-using-get40 nil))
  ([optional-params]
   (:data (listar-using-get40-with-http-info optional-params))))

(defn listar-using-get42-with-http-info
  "Lista os Terminais cadastrados no Emissor
  Este método permite que sejam listados os terminais existentes na base de dados do Emissor."
  ([] (listar-using-get42-with-http-info nil))
  ([{:keys [sort page limit id terminal numero-estabelecimento id-estabelecimento ]}]
   (call-api "/api/terminais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "terminal" terminal "numeroEstabelecimento" numero-estabelecimento "idEstabelecimento" id-estabelecimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get42
  "Lista os Terminais cadastrados no Emissor
  Este método permite que sejam listados os terminais existentes na base de dados do Emissor."
  ([] (listar-using-get42 nil))
  ([optional-params]
   (:data (listar-using-get42-with-http-info optional-params))))

(defn listar-using-get53-with-http-info
  "Lista os Vínculos dos estabelecimento com os adquirentes
  Este método permite que sejam listados os Vínculos dos estabelecimento com os adquirentes."
  ([] (listar-using-get53-with-http-info nil))
  ([{:keys [sort page limit id-adquirente id-estabelecimento codigo-estabelecimento-adquirente ]}]
   (call-api "/api/adquirentes-estabelecimento" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idAdquirente" id-adquirente "idEstabelecimento" id-estabelecimento "codigoEstabelecimentoAdquirente" codigo-estabelecimento-adquirente }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get53
  "Lista os Vínculos dos estabelecimento com os adquirentes
  Este método permite que sejam listados os Vínculos dos estabelecimento com os adquirentes."
  ([] (listar-using-get53 nil))
  ([optional-params]
   (:data (listar-using-get53-with-http-info optional-params))))

(defn listar-using-get54-with-http-info
  "Listar vínculos de operações do estabelecimento
  Lista os vínculos de operações do estabelecimento."
  ([id ] (listar-using-get54-with-http-info id nil))
  ([id {:keys [sort page limit id-produto id-operacao codigo-mcc ]}]
   (call-api "/api/estabelecimentos/{id}/operacoes" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idProduto" id-produto "idOperacao" id-operacao "codigoMCC" codigo-mcc }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get54
  "Listar vínculos de operações do estabelecimento
  Lista os vínculos de operações do estabelecimento."
  ([id ] (listar-using-get54 id nil))
  ([id optional-params]
   (:data (listar-using-get54-with-http-info id optional-params))))

(defn salvar-using-post16-with-http-info
  "Realiza o cadastro de uma nova maquineta para um estabelecimento
  Este método permite que seja cadastrada uma nova maquineta para um estabelecimento."
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

(defn salvar-using-post16
  "Realiza o cadastro de uma nova maquineta para um estabelecimento
  Este método permite que seja cadastrada uma nova maquineta para um estabelecimento."
  [maquineta-persist ]
  (:data (salvar-using-post16-with-http-info maquineta-persist)))

(defn salvar-using-post17-with-http-info
  "Realiza o cadastro de uma nova Regra Operação
  Este método permite que seja cadastrada uma nova Regra Operação."
  [oprecao-credor-persist ]
  (call-api "/api/regras-operacoes-estabelecimentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    oprecao-credor-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post17
  "Realiza o cadastro de uma nova Regra Operação
  Este método permite que seja cadastrada uma nova Regra Operação."
  [oprecao-credor-persist ]
  (:data (salvar-using-post17-with-http-info oprecao-credor-persist)))

(defn salvar-using-post22-with-http-info
  "Realiza o cadastro de um novo telefone para um estabelecimento
  Este método permite que seja cadastrado um novo telefone para um estabelecimento."
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

(defn salvar-using-post22
  "Realiza o cadastro de um novo telefone para um estabelecimento
  Este método permite que seja cadastrado um novo telefone para um estabelecimento."
  [telefone-estabelecimento-persist ]
  (:data (salvar-using-post22-with-http-info telefone-estabelecimento-persist)))

(defn salvar-using-post24-with-http-info
  "Realiza o cadastro de um novo Terminal
  Este método permite que seja cadastrado um novo Terminal."
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

(defn salvar-using-post24
  "Realiza o cadastro de um novo Terminal
  Este método permite que seja cadastrado um novo Terminal."
  [terminal-persist ]
  (:data (salvar-using-post24-with-http-info terminal-persist)))

(defn salvar-using-post29-with-http-info
  "Realiza o cadastro de um novo VinculoEstabelecimentoAdquirente
  Este método permite que seja cadastrado um novo VinculoEstabelecimentoAdquirente."
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

(defn salvar-using-post29
  "Realiza o cadastro de um novo VinculoEstabelecimentoAdquirente
  Este método permite que seja cadastrado um novo VinculoEstabelecimentoAdquirente."
  [vinculo-estabelecimento-adquirente-persist ]
  (:data (salvar-using-post29-with-http-info vinculo-estabelecimento-adquirente-persist)))
