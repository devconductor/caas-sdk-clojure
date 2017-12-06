(ns pier-sdk-clojure.api.estabelecimento
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put11-with-http-info
  "Alterar Pessoa JurÃ­dica
  Altera uma pessoa jurÃ­dica."
  ([id razao-social ] (alterar-using-put11-with-http-info id razao-social nil))
  ([id razao-social {:keys [inscricao-estadual contato banco agencia digito-verificador-agencia conta-corrente digito-verificador-conta-corrente ]}]
   (call-api "/api/pessoas-juridicas/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"razaoSocial" razao-social "inscricaoEstadual" inscricao-estadual "contato" contato "banco" banco "agencia" agencia "digitoVerificadorAgencia" digito-verificador-agencia "contaCorrente" conta-corrente "digitoVerificadorContaCorrente" digito-verificador-conta-corrente }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put11
  "Alterar Pessoa JurÃ­dica
  Altera uma pessoa jurÃ­dica."
  ([id razao-social ] (alterar-using-put11 id razao-social nil))
  ([id razao-social optional-params]
   (:data (alterar-using-put11-with-http-info id razao-social optional-params))))

(defn alterar-using-put13-with-http-info
  "Altera um Telefone do estabelecimento
  Este mÃ©todo realiza a alteraÃ§Ã£o dos telefones dos estabelecimentos."
  ([id ddd telefone ] (alterar-using-put13-with-http-info id ddd telefone nil))
  ([id ddd telefone {:keys [ramal ]}]
   (call-api "/api/telefones-estabelecimentos/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put13
  "Altera um Telefone do estabelecimento
  Este mÃ©todo realiza a alteraÃ§Ã£o dos telefones dos estabelecimentos."
  ([id ddd telefone ] (alterar-using-put13 id ddd telefone nil))
  ([id ddd telefone optional-params]
   (:data (alterar-using-put13-with-http-info id ddd telefone optional-params))))

(defn alterar-using-put15-with-http-info
  "Altera um Terminal
  Este mÃ©todo realiza a alteraÃ§Ã£o dos Terminais."
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

(defn alterar-using-put15
  "Altera um Terminal
  Este mÃ©todo realiza a alteraÃ§Ã£o dos Terminais."
  [id terminal-update ]
  (:data (alterar-using-put15-with-http-info id terminal-update)))

(defn alterar-using-put5-with-http-info
  "Alterar Credor
  Altera um credor."
  [id credor-update ]
  (call-api "/api/credores/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    credor-update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put5
  "Alterar Credor
  Altera um credor."
  [id credor-update ]
  (:data (alterar-using-put5-with-http-info id credor-update)))

(defn cadastrar-using-post2-with-http-info
  "Cadastrar Credor
  Cadastra um credor."
  [credor-persist ]
  (call-api "/api/credores" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    credor-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-using-post2
  "Cadastrar Credor
  Cadastra um credor."
  [credor-persist ]
  (:data (cadastrar-using-post2-with-http-info credor-persist)))

(defn cadastrar-using-post3-with-http-info
  "Cadastrar Pessoa JurÃ­dica
  Cadastra uma pessoa jurÃ­dica."
  ([razao-social cnpj ] (cadastrar-using-post3-with-http-info razao-social cnpj nil))
  ([razao-social cnpj {:keys [inscricao-estadual contato banco agencia digito-verificador-agencia conta-corrente digito-verificador-conta-corrente ]}]
   (call-api "/api/pessoas-juridicas" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"razaoSocial" razao-social "cnpj" cnpj "inscricaoEstadual" inscricao-estadual "contato" contato "banco" banco "agencia" agencia "digitoVerificadorAgencia" digito-verificador-agencia "contaCorrente" conta-corrente "digitoVerificadorContaCorrente" digito-verificador-conta-corrente }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn cadastrar-using-post3
  "Cadastrar Pessoa JurÃ­dica
  Cadastra uma pessoa jurÃ­dica."
  ([razao-social cnpj ] (cadastrar-using-post3 razao-social cnpj nil))
  ([razao-social cnpj optional-params]
   (:data (cadastrar-using-post3-with-http-info razao-social cnpj optional-params))))

(defn consultar-using-get11-with-http-info
  "Consultar credor
  Consulta um credor atravÃ©s do seu identificador."
  [id ]
  (call-api "/api/credores/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get11
  "Consultar credor
  Consulta um credor atravÃ©s do seu identificador."
  [id ]
  (:data (consultar-using-get11-with-http-info id)))

(defn consultar-using-get15-with-http-info
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

(defn consultar-using-get15
  "Consultar estabelecimento por id
  Consulta os detalhes de um determinado estabelecimento"
  [id ]
  (:data (consultar-using-get15-with-http-info id)))

(defn consultar-using-get20-with-http-info
  "Consultar pessoa jurÃ­dica
  Consulta uma pessoa jurÃ­dica atravÃ©s do seu identificador."
  [id ]
  (call-api "/api/pessoas-juridicas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get20
  "Consultar pessoa jurÃ­dica
  Consulta uma pessoa jurÃ­dica atravÃ©s do seu identificador."
  [id ]
  (:data (consultar-using-get20-with-http-info id)))

(defn consultar-using-get26-with-http-info
  "Apresenta os dados de um determinado telefone de um estabelecimento
  Este mÃ©todo permite consultar um determinado telefone de um estabelecimento a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/telefones-estabelecimentos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get26
  "Apresenta os dados de um determinado telefone de um estabelecimento
  Este mÃ©todo permite consultar um determinado telefone de um estabelecimento a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get26-with-http-info id)))

(defn consultar-using-get28-with-http-info
  "Apresenta os dados de um determinado Terminal
  Este mÃ©todo permite consultar um determinado Terminal a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/terminais/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get28
  "Apresenta os dados de um determinado Terminal
  Este mÃ©todo permite consultar um determinado Terminal a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get28-with-http-info id)))

(defn listar-using-get14-with-http-info
  "Listar credores
  Lista credores cadastrados."
  ([] (listar-using-get14-with-http-info nil))
  ([{:keys [sort page limit id-pessoa-juridica nome periodicidade pagamento-semanal pagamento-mensal pagamento-decendial-primeiro pagamento-decendial-segundo pagamento-decendial-terceiro pagamento-quinzenal-primeiro pagamento-quinzenal-segundo credor-banco percentual-rav recebe-rav percentual-multiplica taxa-adm taxa-banco limite-rav id-credor-rav banco agencia digito-verificador-agencia conta-corrente digito-verificador-conta-corrente ]}]
   (call-api "/api/credores" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idPessoaJuridica" id-pessoa-juridica "nome" nome "periodicidade" periodicidade "pagamentoSemanal" pagamento-semanal "pagamentoMensal" pagamento-mensal "pagamentoDecendialPrimeiro" pagamento-decendial-primeiro "pagamentoDecendialSegundo" pagamento-decendial-segundo "pagamentoDecendialTerceiro" pagamento-decendial-terceiro "pagamentoQuinzenalPrimeiro" pagamento-quinzenal-primeiro "pagamentoQuinzenalSegundo" pagamento-quinzenal-segundo "credorBanco" credor-banco "percentualRAV" percentual-rav "recebeRAV" recebe-rav "percentualMultiplica" percentual-multiplica "taxaAdm" taxa-adm "taxaBanco" taxa-banco "limiteRAV" limite-rav "idCredorRAV" id-credor-rav "banco" banco "agencia" agencia "digitoVerificadorAgencia" digito-verificador-agencia "contaCorrente" conta-corrente "digitoVerificadorContaCorrente" digito-verificador-conta-corrente }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get14
  "Listar credores
  Lista credores cadastrados."
  ([] (listar-using-get14 nil))
  ([optional-params]
   (:data (listar-using-get14-with-http-info optional-params))))

(defn listar-using-get19-with-http-info
  "Lista Estabelecimentos
  Lista todas os Estabelecimentos"
  ([] (listar-using-get19-with-http-info nil))
  ([{:keys [sort page limit id numero-receita-federal nome descricao nome-fantasia cep nome-logradouro numero-endereco complemento bairro cidade uf pais data-cadastramento contato email flag-arquivo-secr-fazenda flag-cartao-digitado inativo ]}]
   (call-api "/api/estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "numeroReceitaFederal" numero-receita-federal "nome" nome "descricao" descricao "nomeFantasia" nome-fantasia "cep" cep "nomeLogradouro" nome-logradouro "numeroEndereco" numero-endereco "complemento" complemento "bairro" bairro "cidade" cidade "uf" uf "pais" pais "dataCadastramento" data-cadastramento "contato" contato "email" email "flagArquivoSecrFazenda" flag-arquivo-secr-fazenda "flagCartaoDigitado" flag-cartao-digitado "inativo" inativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get19
  "Lista Estabelecimentos
  Lista todas os Estabelecimentos"
  ([] (listar-using-get19 nil))
  ([optional-params]
   (:data (listar-using-get19-with-http-info optional-params))))

(defn listar-using-get24-with-http-info
  "Listar pessoas jurÃ­dicas
  Lista pessoas jurÃ­dicas cadastradas."
  ([] (listar-using-get24-with-http-info nil))
  ([{:keys [sort page limit razao-social cnpj inscricao-estadual contato banco agencia digito-verificador-agencia conta-corrente digito-verificador-conta-corrente ]}]
   (call-api "/api/pessoas-juridicas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "razaoSocial" razao-social "cnpj" cnpj "inscricaoEstadual" inscricao-estadual "contato" contato "banco" banco "agencia" agencia "digitoVerificadorAgencia" digito-verificador-agencia "contaCorrente" conta-corrente "digitoVerificadorContaCorrente" digito-verificador-conta-corrente }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get24
  "Listar pessoas jurÃ­dicas
  Lista pessoas jurÃ­dicas cadastradas."
  ([] (listar-using-get24 nil))
  ([optional-params]
   (:data (listar-using-get24-with-http-info optional-params))))

(defn listar-using-get33-with-http-info
  "Lista os Telefones Estabelecimentos
  Este mÃ©todo permite que sejam listados os telefones dos estabelecimentos existentes na base de dados do Emissor."
  ([] (listar-using-get33-with-http-info nil))
  ([{:keys [sort page limit id-estabelecimento ]}]
   (call-api "/api/telefones-estabelecimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idEstabelecimento" id-estabelecimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get33
  "Lista os Telefones Estabelecimentos
  Este mÃ©todo permite que sejam listados os telefones dos estabelecimentos existentes na base de dados do Emissor."
  ([] (listar-using-get33 nil))
  ([optional-params]
   (:data (listar-using-get33-with-http-info optional-params))))

(defn listar-using-get35-with-http-info
  "Lista os Terminais cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os terminais existentes na base de dados do Emissor."
  ([] (listar-using-get35-with-http-info nil))
  ([{:keys [sort page limit id terminal numero-estabelecimento id-estabelecimento ]}]
   (call-api "/api/terminais" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "terminal" terminal "numeroEstabelecimento" numero-estabelecimento "idEstabelecimento" id-estabelecimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get35
  "Lista os Terminais cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os terminais existentes na base de dados do Emissor."
  ([] (listar-using-get35 nil))
  ([optional-params]
   (:data (listar-using-get35-with-http-info optional-params))))

(defn salvar-using-post19-with-http-info
  "Realiza o cadastro de um novo telefone para um estabelecimento
  Este mÃ©todo permite que seja cadastrado um novo telefone para um estabelecimento."
  ([id-estabelecimento ddd telefone ] (salvar-using-post19-with-http-info id-estabelecimento ddd telefone nil))
  ([id-estabelecimento ddd telefone {:keys [ramal ]}]
   (call-api "/api/telefones-estabelecimentos" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idEstabelecimento" id-estabelecimento "ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post19
  "Realiza o cadastro de um novo telefone para um estabelecimento
  Este mÃ©todo permite que seja cadastrado um novo telefone para um estabelecimento."
  ([id-estabelecimento ddd telefone ] (salvar-using-post19 id-estabelecimento ddd telefone nil))
  ([id-estabelecimento ddd telefone optional-params]
   (:data (salvar-using-post19-with-http-info id-estabelecimento ddd telefone optional-params))))

(defn salvar-using-post21-with-http-info
  "Realiza o cadastro de um novo Terminal
  Este mÃ©todo permite que seja cadastrado um novo Terminal."
  [id-estabelecimento flag-consulta-extrato flag-terminal-virtual ]
  (call-api "/api/terminais" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"idEstabelecimento" id-estabelecimento "flagConsultaExtrato" flag-consulta-extrato "flagTerminalVirtual" flag-terminal-virtual }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post21
  "Realiza o cadastro de um novo Terminal
  Este mÃ©todo permite que seja cadastrado um novo Terminal."
  [id-estabelecimento flag-consulta-extrato flag-terminal-virtual ]
  (:data (salvar-using-post21-with-http-info id-estabelecimento flag-consulta-extrato flag-terminal-virtual)))
