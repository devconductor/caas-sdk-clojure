(ns pier-sdk-clojure.api.cadastros-gerais
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put1-with-http-info
  "Atualiza os dados de um determinado EndereÃ§o
  Este mÃ©todo permite que seja alterado na base do emissor um ou mais registros ligados a um determinado EndereÃ§o."
  ([id ] (alterar-using-put1-with-http-info id nil))
  ([id {:keys [id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais ]}]
   (call-api "/api/enderecos" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put1
  "Atualiza os dados de um determinado EndereÃ§o
  Este mÃ©todo permite que seja alterado na base do emissor um ou mais registros ligados a um determinado EndereÃ§o."
  ([id ] (alterar-using-put1 id nil))
  ([id optional-params]
   (:data (alterar-using-put1-with-http-info id optional-params))))

(defn alterar-using-put4-with-http-info
  "Atualiza os detalhes de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor os detalhes de uma determinada Pessoa."
  ([id ] (alterar-using-put4-with-http-info id nil))
  ([id {:keys [nome-mae id-estado-civil profissao id-natureza-ocupacao id-nacionalidade numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"nomeMae" nome-mae "idEstadoCivil" id-estado-civil "profissao" profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put4
  "Atualiza os detalhes de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor os detalhes de uma determinada Pessoa."
  ([id ] (alterar-using-put4 id nil))
  ([id optional-params]
   (:data (alterar-using-put4-with-http-info id optional-params))))

(defn alterar-using-put5-with-http-info
  "Atualiza os dados de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor um registro de determinada Pessoa."
  ([id nome tipo ] (alterar-using-put5-with-http-info id nome tipo nil))
  ([id nome tipo {:keys [cpf cnpj data-nascimento sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put5
  "Atualiza os dados de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor um registro de determinada Pessoa."
  ([id nome tipo ] (alterar-using-put5 id nome tipo nil))
  ([id nome tipo optional-params]
   (:data (alterar-using-put5-with-http-info id nome tipo optional-params))))

(defn alterar-using-put6-with-http-info
  "Realiza a alteraÃ§Ã£o de um determinado Telefone
  Este mÃ©todo permite que seja alterado um determinado Telefone na base de dados do Emissor."
  ([id ] (alterar-using-put6-with-http-info id nil))
  ([id {:keys [id-tipo-telefone ddd telefone ramal ]}]
   (call-api "/api/telefones" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idTipoTelefone" id-tipo-telefone "ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put6
  "Realiza a alteraÃ§Ã£o de um determinado Telefone
  Este mÃ©todo permite que seja alterado um determinado Telefone na base de dados do Emissor."
  ([id ] (alterar-using-put6 id nil))
  ([id optional-params]
   (:data (alterar-using-put6-with-http-info id optional-params))))

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

(defn consultar-using-get-with-http-info
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

(defn consultar-using-get
  "Apresenta os dados de um determinado Atendimento
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Atendimento a partir do seu cÃ³digo de identificaÃ§Ã£o (idAtendimento)."
  [id ]
  (:data (consultar-using-get-with-http-info id)))

(defn consultar-using-get1-with-http-info
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

(defn consultar-using-get1
  "Apresenta os dados de um determinado Banco
  Este mÃ©todo permite consultar um determinado Banco a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get1-with-http-info id)))

(defn consultar-using-get10-with-http-info
  "Apresenta os dados de uma determinada Pessoa
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  [id ]
  (call-api "/api/pessoas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get10
  "Apresenta os dados de uma determinada Pessoa
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn consultar-using-get11-with-http-info
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

(defn consultar-using-get11
  "Apresenta os dados de um determinado Produto
  Este mÃ©todo permite consultar um determinado Produto a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get11-with-http-info id)))

(defn consultar-using-get15-with-http-info
  "Apresenta os dados de um determinado Telefone
  Este mÃ©todo permite consultar um determinado Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/telefones/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get15
  "Apresenta os dados de um determinado Telefone
  Este mÃ©todo permite consultar um determinado Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get15-with-http-info id)))

(defn consultar-using-get17-with-http-info
  "Lista os tipos de ajustes do emissor
  Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor."
  ([] (consultar-using-get17-with-http-info nil))
  ([{:keys [page limit id descricao ]}]
   (call-api "/api/tipos-ajustes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get17
  "Lista os tipos de ajustes do emissor
  Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor."
  ([] (consultar-using-get17 nil))
  ([optional-params]
   (:data (consultar-using-get17-with-http-info optional-params))))

(defn consultar-using-get18-with-http-info
  "Lista os tipos de boletos do emissor
  Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor."
  ([] (consultar-using-get18-with-http-info nil))
  ([{:keys [page limit id descricao banco ]}]
   (call-api "/api/tipos-boletos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "descricao" descricao "banco" banco }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get18
  "Lista os tipos de boletos do emissor
  Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor."
  ([] (consultar-using-get18 nil))
  ([optional-params]
   (:data (consultar-using-get18-with-http-info optional-params))))

(defn consultar-using-get19-with-http-info
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

(defn consultar-using-get19
  "Apresenta os dados de um determinado Tipo de EndereÃ§o
  Este mÃ©todo permite consultar um determinado Tipo de EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get19-with-http-info id)))

(defn consultar-using-get21-with-http-info
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

(defn consultar-using-get21
  "Apresenta os dados de um determinado Tipo de Telefone
  Este mÃ©todo permite consultar um determinado Tipo de Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get21-with-http-info id)))

(defn consultar-using-get5-with-http-info
  "Apresenta os dados de um determinado EndereÃ§o
  Este mÃ©todo permite consultar um determinado EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/enderecos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get5
  "Apresenta os dados de um determinado EndereÃ§o
  Este mÃ©todo permite consultar um determinado EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get5-with-http-info id)))

(defn consultar-using-get9-with-http-info
  "Apresenta os detalhes de uma determinada Pessoa
  Este mÃ©todo permite a consulta dos detalhes de uma Pessoa existentes na base de dados do Emissor."
  [id ]
  (call-api "/api/pessoas-detalhes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get9
  "Apresenta os detalhes de uma determinada Pessoa
  Este mÃ©todo permite a consulta dos detalhes de uma Pessoa existentes na base de dados do Emissor."
  [id ]
  (:data (consultar-using-get9-with-http-info id)))

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
  ([{:keys [page limit id nome status ]}]
   (call-api "/api/origens-comerciais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome "status" status }
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

(defn listar-using-get14-with-http-info
  "Lista os Detalhes das Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas od detalhes das Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get14-with-http-info nil))
  ([{:keys [page limit id-pessoa nome-mae id-estado-civil profissao id-natureza-ocupacao id-nacionalidade numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idPessoa" id-pessoa "nomeMae" nome-mae "idEstadoCivil" id-estado-civil "profissao" profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get14
  "Lista os Detalhes das Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas od detalhes das Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get14 nil))
  ([optional-params]
   (:data (listar-using-get14-with-http-info optional-params))))

(defn listar-using-get15-with-http-info
  "Lista as Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get15-with-http-info nil))
  ([{:keys [page limit id nome tipo cpf cnpj data-nascimento sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get15
  "Lista as Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get15 nil))
  ([optional-params]
   (:data (listar-using-get15-with-http-info optional-params))))

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

(defn listar-using-get22-with-http-info
  "Lista os Telefones cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get22-with-http-info nil))
  ([{:keys [page limit id id-tipo-telefone id-pessoa ddd telefone ramal status ]}]
   (call-api "/api/telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get22
  "Lista os Telefones cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get22 nil))
  ([optional-params]
   (:data (listar-using-get22-with-http-info optional-params))))

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

(defn listar-using-get9-with-http-info
  "Lista os EndereÃ§os cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get9-with-http-info nil))
  ([{:keys [page limit id id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais data-inclusao data-ultima-atualizacao ]}]
   (call-api "/api/enderecos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais "dataInclusao" data-inclusao "dataUltimaAtualizacao" data-ultima-atualizacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get9
  "Lista os EndereÃ§os cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get9 nil))
  ([optional-params]
   (:data (listar-using-get9-with-http-info optional-params))))

(defn salvar-pessoa-fisica-aprovada-using-post-with-http-info
  "Cadastro de Conta e Pessoa Fisica
  Permite realizar o cadastro de uma Conta para um cliente do tipo Pessoa FÃ­sica, recebendo nesta operaÃ§Ã£o todos os dados cadastrais que se fazem necessÃ¡rios para isso. Uma vez criado, poderÃ¡ ser acionado o mÃ©todo de 'GeraÃ§Ã£o de CartÃ£o' para o cliente e seus adicionais."
  [pessoa-persist ]
  (call-api "/api/clientes-pessoas-fisicas" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    pessoa-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-pessoa-fisica-aprovada-using-post
  "Cadastro de Conta e Pessoa Fisica
  Permite realizar o cadastro de uma Conta para um cliente do tipo Pessoa FÃ­sica, recebendo nesta operaÃ§Ã£o todos os dados cadastrais que se fazem necessÃ¡rios para isso. Uma vez criado, poderÃ¡ ser acionado o mÃ©todo de 'GeraÃ§Ã£o de CartÃ£o' para o cliente e seus adicionais."
  [pessoa-persist ]
  (:data (salvar-pessoa-fisica-aprovada-using-post-with-http-info pessoa-persist)))

(defn salvar-pessoa-juridica-aprovada-using-post-with-http-info
  "Cadastro de Conta e Pessoa JurÃ­dica
  Cadastro de Conta e Pessoa JurÃ­dica Permite realizar o cadastro de uma Conta para um cliente do tipo Pessoa JurÃ­dica, recebendo nesta operaÃ§Ã£o todos os dados cadastrais que se fazem necessÃ¡rios para isso, incluÃ­ndo o registro de cada um dos sÃ³cios. Uma vez criado, poderÃ¡ ser acionado o mÃ©todo de 'GeraÃ§Ã£o de CartÃ£o' para o cliente e cada um dos sÃ³cios vinculados."
  [pessoa-persist ]
  (call-api "/api/clientes-pessoas-juridicas" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    pessoa-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-pessoa-juridica-aprovada-using-post
  "Cadastro de Conta e Pessoa JurÃ­dica
  Cadastro de Conta e Pessoa JurÃ­dica Permite realizar o cadastro de uma Conta para um cliente do tipo Pessoa JurÃ­dica, recebendo nesta operaÃ§Ã£o todos os dados cadastrais que se fazem necessÃ¡rios para isso, incluÃ­ndo o registro de cada um dos sÃ³cios. Uma vez criado, poderÃ¡ ser acionado o mÃ©todo de 'GeraÃ§Ã£o de CartÃ£o' para o cliente e cada um dos sÃ³cios vinculados."
  [pessoa-persist ]
  (:data (salvar-pessoa-juridica-aprovada-using-post-with-http-info pessoa-persist)))

(defn salvar-using-post1-with-http-info
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
  ([] (salvar-using-post1-with-http-info nil))
  ([{:keys [id-conta conteudo-atendimento detalhes-atendimento nome-atendente data-atendimento data-agendamento data-hora-inicio-atendimento data-hora-fim-atendimento flag-fila-fraude ]}]
   (call-api "/api/atendimento-clientes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "conteudoAtendimento" conteudo-atendimento "detalhesAtendimento" detalhes-atendimento "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento "dataAgendamento" data-agendamento "dataHoraInicioAtendimento" data-hora-inicio-atendimento "dataHoraFimAtendimento" data-hora-fim-atendimento "flagFilaFraude" flag-fila-fraude }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post1
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
  ([] (salvar-using-post1 nil))
  ([optional-params]
   (:data (salvar-using-post1-with-http-info optional-params))))

(defn salvar-using-post10-with-http-info
  "Realiza o cadastro de um novo Telefone
  Este mÃ©todo permite que seja cadastrado um novo Telefone na base de dados do Emissor."
  ([] (salvar-using-post10-with-http-info nil))
  ([{:keys [id-tipo-telefone id-pessoa ddd telefone ramal ]}]
   (call-api "/api/telefones" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post10
  "Realiza o cadastro de um novo Telefone
  Este mÃ©todo permite que seja cadastrado um novo Telefone na base de dados do Emissor."
  ([] (salvar-using-post10 nil))
  ([optional-params]
   (:data (salvar-using-post10-with-http-info optional-params))))

(defn salvar-using-post4-with-http-info
  "Realiza o cadastro de um novo EndereÃ§o
  Este mÃ©todo permite que seja cadastrado um novo EndereÃ§o na base de dados do Emissor."
  ([] (salvar-using-post4-with-http-info nil))
  ([{:keys [id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais ]}]
   (call-api "/api/enderecos" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post4
  "Realiza o cadastro de um novo EndereÃ§o
  Este mÃ©todo permite que seja cadastrado um novo EndereÃ§o na base de dados do Emissor."
  ([] (salvar-using-post4 nil))
  ([optional-params]
   (:data (salvar-using-post4-with-http-info optional-params))))

(defn salvar-using-post7-with-http-info
  "Salvar os detalhes de uma determinada Pessoa
  Este mÃ©todo permite que seja incluido na base do emissor os detalhes de uma determinada Pessoa."
  ([] (salvar-using-post7-with-http-info nil))
  ([{:keys [id-pessoa nome-mae id-estado-civil profissao id-natureza-ocupacao id-nacionalidade numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idPessoa" id-pessoa "nomeMae" nome-mae "idEstadoCivil" id-estado-civil "profissao" profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post7
  "Salvar os detalhes de uma determinada Pessoa
  Este mÃ©todo permite que seja incluido na base do emissor os detalhes de uma determinada Pessoa."
  ([] (salvar-using-post7 nil))
  ([optional-params]
   (:data (salvar-using-post7-with-http-info optional-params))))

(defn salvar-using-post8-with-http-info
  "Realiza o cadastro de um nova Pessoa
  Este mÃ©todo permite que seja cadastrado uma nova Pessoa na base de dados do Emissor."
  ([nome tipo ] (salvar-using-post8-with-http-info nome tipo nil))
  ([nome tipo {:keys [cpf cnpj data-nascimento sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post8
  "Realiza o cadastro de um nova Pessoa
  Este mÃ©todo permite que seja cadastrado uma nova Pessoa na base de dados do Emissor."
  ([nome tipo ] (salvar-using-post8 nome tipo nil))
  ([nome tipo optional-params]
   (:data (salvar-using-post8-with-http-info nome tipo optional-params))))
