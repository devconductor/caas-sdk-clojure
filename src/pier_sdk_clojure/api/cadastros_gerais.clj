(ns pier-sdk-clojure.api.cadastros-gerais
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ativar-uso-exterior-using-post-with-http-info
  "Ativa o parÃ¢metro uso exterior para o produto
  Este mÃ©todo permite ativar o uso no exterior para o produto atravÃ©s do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/produtos/{id}/ativar-uso-exterior" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-uso-exterior-using-post
  "Ativa o parÃ¢metro uso exterior para o produto
  Este mÃ©todo permite ativar o uso no exterior para o produto atravÃ©s do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (ativar-uso-exterior-using-post-with-http-info id)))

(defn configurar-taxa-antecipacao-using-post-with-http-info
  "Configura a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite configurar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
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
  "Configura a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite configurar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id taxa-antecipacao-request ]
  (:data (configurar-taxa-antecipacao-using-post-with-http-info id taxa-antecipacao-request)))

(defn consultar-origem-comercial-using-get-with-http-info
  "OperaÃ§Ã£o utilizada para consultar uma determinada Origem Comercial
  Este mÃ©todo permite que sejam listados os registros de uma determinada Origem Comercial existente na base do emissor. Para isso, Ã© preciso informar o seu respectivo cÃ³digo de identificaÃ§Ã£o (id)."
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
  "OperaÃ§Ã£o utilizada para consultar uma determinada Origem Comercial
  Este mÃ©todo permite que sejam listados os registros de uma determinada Origem Comercial existente na base do emissor. Para isso, Ã© preciso informar o seu respectivo cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-origem-comercial-using-get-with-http-info id)))

(defn consultar-taxa-antecipacao-using-get-with-http-info
  "Consulta a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite consultar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
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
  "Consulta a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite consultar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id tipo-transacao ]
  (:data (consultar-taxa-antecipacao-using-get-with-http-info id tipo-transacao)))

(defn consultar-using-get1-with-http-info
  "Apresenta os dados de um determinado Atendimento
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Atendimento a partir do seu cÃ³digo de identificaÃ§Ã£o (idAtendimento)."
  [id ]
  (call-api "/api/atendimento-clientes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get1
  "Apresenta os dados de um determinado Atendimento
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Atendimento a partir do seu cÃ³digo de identificaÃ§Ã£o (idAtendimento)."
  [id ]
  (:data (consultar-using-get1-with-http-info id)))

(defn consultar-using-get12-with-http-info
  "Apresenta os dados de um determinado Produto
  Este mÃ©todo permite consultar um determinado Produto a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/produtos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get12
  "Apresenta os dados de um determinado Produto
  Este mÃ©todo permite consultar um determinado Produto a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get12-with-http-info id)))

(defn consultar-using-get18-with-http-info
  "Lista os tipos de ajustes do emissor
  Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor."
  ([] (consultar-using-get18-with-http-info nil))
  ([{:keys [page limit id descricao ]}]
   (call-api "/api/tipos-ajustes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get18
  "Lista os tipos de ajustes do emissor
  Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor."
  ([] (consultar-using-get18 nil))
  ([optional-params]
   (:data (consultar-using-get18-with-http-info optional-params))))

(defn consultar-using-get19-with-http-info
  "Lista os tipos de boletos do emissor
  Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor."
  ([] (consultar-using-get19-with-http-info nil))
  ([{:keys [page limit id descricao banco ]}]
   (call-api "/api/tipos-boletos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "descricao" descricao "banco" banco }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get19
  "Lista os tipos de boletos do emissor
  Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor."
  ([] (consultar-using-get19 nil))
  ([optional-params]
   (:data (consultar-using-get19-with-http-info optional-params))))

(defn consultar-using-get2-with-http-info
  "Apresenta os dados de um determinado Banco
  Este mÃ©todo permite consultar um determinado Banco a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/bancos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get2
  "Apresenta os dados de um determinado Banco
  Este mÃ©todo permite consultar um determinado Banco a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get2-with-http-info id)))

(defn consultar-using-get20-with-http-info
  "Apresenta os dados de um determinado Tipo de EndereÃ§o
  Este mÃ©todo permite consultar um determinado Tipo de EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/tipos-enderecos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get20
  "Apresenta os dados de um determinado Tipo de EndereÃ§o
  Este mÃ©todo permite consultar um determinado Tipo de EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get20-with-http-info id)))

(defn consultar-using-get22-with-http-info
  "Apresenta os dados de um determinado Tipo de Telefone
  Este mÃ©todo permite consultar um determinado Tipo de Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/tipos-telefones/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get22
  "Apresenta os dados de um determinado Tipo de Telefone
  Este mÃ©todo permite consultar um determinado Tipo de Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get22-with-http-info id)))

(defn desativar-uso-exterior-using-post-with-http-info
  "Desativa o parÃ¢metro uso exterior para o produto
  Este mÃ©todo permite desativar o uso no exterior para o produto atravÃ©s do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/produtos/{id}/desativar-uso-exterior" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-uso-exterior-using-post
  "Desativa o parÃ¢metro uso exterior para o produto
  Este mÃ©todo permite desativar o uso no exterior para o produto atravÃ©s do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (desativar-uso-exterior-using-post-with-http-info id)))

(defn listar-contas-por-pessoa-using-get-with-http-info
  "Lista as contas da pessoa
  Permite listar as contas de um pessoa a partir do seu numero na receita federal."
  ([numero-receita-federal ] (listar-contas-por-pessoa-using-get-with-http-info numero-receita-federal nil))
  ([numero-receita-federal {:keys [page limit ]}]
   (call-api "/api/pessoas/listar-contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"numeroReceitaFederal" numero-receita-federal "page" page "limit" limit }
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
  "Lista os Estados CÃ­vis
  Este mÃ©todo permite que sejam listados os Estados CÃ­vis na base de dados do Emissor."
  ([] (listar-estados-civis-using-get-with-http-info nil))
  ([{:keys [page limit ]}]
   (call-api "/api/estados-civis" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-estados-civis-using-get
  "Lista os Estados CÃ­vis
  Este mÃ©todo permite que sejam listados os Estados CÃ­vis na base de dados do Emissor."
  ([] (listar-estados-civis-using-get nil))
  ([optional-params]
   (:data (listar-estados-civis-using-get-with-http-info optional-params))))

(defn listar-historico-telefones-using-get-with-http-info
  "Listar alteraÃ§Ãµes de telefones realizadas nos Ãºltimos 60 dias
  Este mÃ©todo permite verificar quais os telefones de um determinado que cliente que sofreram alteraÃ§Ã£o nos Ãºltimos 60 dias."
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
  "Listar alteraÃ§Ãµes de telefones realizadas nos Ãºltimos 60 dias
  Este mÃ©todo permite verificar quais os telefones de um determinado que cliente que sofreram alteraÃ§Ã£o nos Ãºltimos 60 dias."
  [id ]
  (:data (listar-historico-telefones-using-get-with-http-info id)))

(defn listar-nacionalidades-using-get-with-http-info
  "Lista nacionalidades
  Este mÃ©todo permite que sejam listados as nacionalidades na base de dados do Emissor."
  ([] (listar-nacionalidades-using-get-with-http-info nil))
  ([{:keys [page limit ]}]
   (call-api "/api/nacionalidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-nacionalidades-using-get
  "Lista nacionalidades
  Este mÃ©todo permite que sejam listados as nacionalidades na base de dados do Emissor."
  ([] (listar-nacionalidades-using-get nil))
  ([optional-params]
   (:data (listar-nacionalidades-using-get-with-http-info optional-params))))

(defn listar-naturezas-ocupacoes-using-get-with-http-info
  "Lista as OcupaÃ§Ãµes
  Este mÃ©todo permite que sejam listados as naturezas de operaÃ§Ãµes na base de dados do Emissor."
  ([] (listar-naturezas-ocupacoes-using-get-with-http-info nil))
  ([{:keys [page limit ]}]
   (call-api "/api/ocupacoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-naturezas-ocupacoes-using-get
  "Lista as OcupaÃ§Ãµes
  Este mÃ©todo permite que sejam listados as naturezas de operaÃ§Ãµes na base de dados do Emissor."
  ([] (listar-naturezas-ocupacoes-using-get nil))
  ([optional-params]
   (:data (listar-naturezas-ocupacoes-using-get-with-http-info optional-params))))

(defn listar-origens-comerciais-using-get-with-http-info
  "OperaÃ§Ã£o utilizada para listar Origens Comerciais
  Este mÃ©todo permite que sejam listadas as Origens Comerciais existentes na base do emissor."
  ([] (listar-origens-comerciais-using-get-with-http-info nil))
  ([{:keys [page limit id nome status id-estabelecimento id-produto ]}]
   (call-api "/api/origens-comerciais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome "status" status "idEstabelecimento" id-estabelecimento "idProduto" id-produto }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-origens-comerciais-using-get
  "OperaÃ§Ã£o utilizada para listar Origens Comerciais
  Este mÃ©todo permite que sejam listadas as Origens Comerciais existentes na base do emissor."
  ([] (listar-origens-comerciais-using-get nil))
  ([optional-params]
   (:data (listar-origens-comerciais-using-get-with-http-info optional-params))))

(defn listar-parentescos-using-get-with-http-info
  "Lista os Parentescos
  Este mÃ©todo permite que sejam listados parentescos na base de dados do Emissor."
  ([] (listar-parentescos-using-get-with-http-info nil))
  ([{:keys [page limit ]}]
   (call-api "/api/parentescos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-parentescos-using-get
  "Lista os Parentescos
  Este mÃ©todo permite que sejam listados parentescos na base de dados do Emissor."
  ([] (listar-parentescos-using-get nil))
  ([optional-params]
   (:data (listar-parentescos-using-get-with-http-info optional-params))))

(defn listar-profissoes-using-get-with-http-info
  "Lista profissÃµes
  Este mÃ©todo permite que sejam listados as profissÃµes na base de dados do Emissor."
  ([] (listar-profissoes-using-get-with-http-info nil))
  ([{:keys [page limit ]}]
   (call-api "/api/profissoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-profissoes-using-get
  "Lista profissÃµes
  Este mÃ©todo permite que sejam listados as profissÃµes na base de dados do Emissor."
  ([] (listar-profissoes-using-get nil))
  ([optional-params]
   (:data (listar-profissoes-using-get-with-http-info optional-params))))

(defn listar-using-get1-with-http-info
  "Lista todos os atendimentos
  Este mÃ©todo permite que sejam listados todos os Registro de Atendimento, independente do Tipo."
  ([] (listar-using-get1-with-http-info nil))
  ([{:keys [page limit id-tipo-atendimento id-conta nome-atendente data-atendimento ]}]
   (call-api "/api/atendimento-clientes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idTipoAtendimento" id-tipo-atendimento "idConta" id-conta "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get1
  "Lista todos os atendimentos
  Este mÃ©todo permite que sejam listados todos os Registro de Atendimento, independente do Tipo."
  ([] (listar-using-get1 nil))
  ([optional-params]
   (:data (listar-using-get1-with-http-info optional-params))))

(defn listar-using-get17-with-http-info
  "Lista os Portadores existentes
  Este mÃ©todo permite que sejam listados os portadores cadastrados na base do emissor."
  ([] (listar-using-get17-with-http-info nil))
  ([{:keys [page limit id-conta id-produto id-pessoa id-parentesco tipo-portador nome-impresso id-tipo-cartao flag-ativo data-cadastro-portador data-cancelamento-portador ]}]
   (call-api "/api/portadores" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idConta" id-conta "idProduto" id-produto "idPessoa" id-pessoa "idParentesco" id-parentesco "tipoPortador" tipo-portador "nomeImpresso" nome-impresso "idTipoCartao" id-tipo-cartao "flagAtivo" flag-ativo "dataCadastroPortador" data-cadastro-portador "dataCancelamentoPortador" data-cancelamento-portador }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get17
  "Lista os Portadores existentes
  Este mÃ©todo permite que sejam listados os portadores cadastrados na base do emissor."
  ([] (listar-using-get17 nil))
  ([optional-params]
   (:data (listar-using-get17-with-http-info optional-params))))

(defn listar-using-get18-with-http-info
  "Lista os Produtos do Emissor
  Este mÃ©todo permite que sejam listados os Produtos existentes na base de dados do Emissor."
  ([] (listar-using-get18-with-http-info nil))
  ([{:keys [page limit nome status id-fantasia-basica ]}]
   (call-api "/api/produtos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "nome" nome "status" status "idFantasiaBasica" id-fantasia-basica }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get18
  "Lista os Produtos do Emissor
  Este mÃ©todo permite que sejam listados os Produtos existentes na base de dados do Emissor."
  ([] (listar-using-get18 nil))
  ([optional-params]
   (:data (listar-using-get18-with-http-info optional-params))))

(defn listar-using-get2-with-http-info
  "Lista os Bancos cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Bancos existentes na base de dados do Emissor."
  ([] (listar-using-get2-with-http-info nil))
  ([{:keys [page limit ]}]
   (call-api "/api/bancos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get2
  "Lista os Bancos cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Bancos existentes na base de dados do Emissor."
  ([] (listar-using-get2 nil))
  ([optional-params]
   (:data (listar-using-get2-with-http-info optional-params))))

(defn listar-using-get24-with-http-info
  "Lista as opÃµes de Tipos de EndereÃ§os do Emissor
  Este mÃ©todo permite que sejam listados os Tipos de EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get24-with-http-info nil))
  ([{:keys [page limit id nome ]}]
   (call-api "/api/tipos-enderecos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get24
  "Lista as opÃµes de Tipos de EndereÃ§os do Emissor
  Este mÃ©todo permite que sejam listados os Tipos de EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get24 nil))
  ([optional-params]
   (:data (listar-using-get24-with-http-info optional-params))))

(defn listar-using-get26-with-http-info
  "Lista os Tipos de Telefones
  Este mÃ©todo permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get26-with-http-info nil))
  ([{:keys [page limit id nome ]}]
   (call-api "/api/tipos-telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get26
  "Lista os Tipos de Telefones
  Este mÃ©todo permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get26 nil))
  ([optional-params]
   (:data (listar-using-get26-with-http-info optional-params))))

(defn salvar-using-post2-with-http-info
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
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
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
  ([] (salvar-using-post2 nil))
  ([optional-params]
   (:data (salvar-using-post2-with-http-info optional-params))))
