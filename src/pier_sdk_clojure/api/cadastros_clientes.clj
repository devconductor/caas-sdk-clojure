(ns pier-sdk-clojure.api.cadastros-clientes
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put-with-http-info
  "Altera Adicional de uma Conta
  Este mÃ©todo permite que seja alterado um portador Adicional de uma determinada Conta."
  [id id-pessoa adicional-update ]
  (call-api "/api/contas/{id}/adicionais/{idPessoa}" :put
            {:path-params   {"id" id "idPessoa" id-pessoa }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    adicional-update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put
  "Altera Adicional de uma Conta
  Este mÃ©todo permite que seja alterado um portador Adicional de uma determinada Conta."
  [id id-pessoa adicional-update ]
  (:data (alterar-using-put-with-http-info id id-pessoa adicional-update)))

(defn alterar-using-put2-with-http-info
  "Atualiza os dados de um determinado EndereÃ§o
  Este mÃ©todo permite que seja alterado na base do emissor um ou mais registros ligados a um determinado EndereÃ§o."
  ([id ] (alterar-using-put2-with-http-info id nil))
  ([id {:keys [id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais ]}]
   (call-api "/api/enderecos" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put2
  "Atualiza os dados de um determinado EndereÃ§o
  Este mÃ©todo permite que seja alterado na base do emissor um ou mais registros ligados a um determinado EndereÃ§o."
  ([id ] (alterar-using-put2 id nil))
  ([id optional-params]
   (:data (alterar-using-put2-with-http-info id optional-params))))

(defn alterar-using-put5-with-http-info
  "Atualiza os detalhes de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor os detalhes de uma determinada Pessoa."
  ([id ] (alterar-using-put5-with-http-info id nil))
  ([id {:keys [nome-mae id-estado-civil id-profissao id-natureza-ocupacao id-nacionalidade numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"nomeMae" nome-mae "idEstadoCivil" id-estado-civil "idProfissao" id-profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put5
  "Atualiza os detalhes de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor os detalhes de uma determinada Pessoa."
  ([id ] (alterar-using-put5 id nil))
  ([id optional-params]
   (:data (alterar-using-put5-with-http-info id optional-params))))

(defn alterar-using-put6-with-http-info
  "Atualiza os dados de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor um registro de determinada Pessoa."
  ([id nome tipo ] (alterar-using-put6-with-http-info id nome tipo nil))
  ([id nome tipo {:keys [cpf cnpj data-nascimento sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put6
  "Atualiza os dados de uma determinada Pessoa
  Este mÃ©todo permite que seja alterado na base do emissor um registro de determinada Pessoa."
  ([id nome tipo ] (alterar-using-put6 id nome tipo nil))
  ([id nome tipo optional-params]
   (:data (alterar-using-put6-with-http-info id nome tipo optional-params))))

(defn alterar-using-put7-with-http-info
  "Realiza a alteraÃ§Ã£o de um determinado Telefone
  Este mÃ©todo permite que seja alterado um determinado Telefone na base de dados do Emissor."
  ([id ] (alterar-using-put7-with-http-info id nil))
  ([id {:keys [id-tipo-telefone ddd telefone ramal ]}]
   (call-api "/api/telefones" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idTipoTelefone" id-tipo-telefone "ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put7
  "Realiza a alteraÃ§Ã£o de um determinado Telefone
  Este mÃ©todo permite que seja alterado um determinado Telefone na base de dados do Emissor."
  ([id ] (alterar-using-put7 id nil))
  ([id optional-params]
   (:data (alterar-using-put7-with-http-info id optional-params))))

(defn atribuir-assinatura-cliente-using-post-with-http-info
  "Permite atribuir um documento para uma Conta
  Este mÃ©todo permite que seja atribuÃ­do a uma determinada Conta um documento que esteja armazenado no PIER Cloud, informando qual o tipo do documento e o seu respectivo id."
  [id body ]
  (call-api "/api/contas/{id}/atribuir-assinatura-cliente" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atribuir-assinatura-cliente-using-post
  "Permite atribuir um documento para uma Conta
  Este mÃ©todo permite que seja atribuÃ­do a uma determinada Conta um documento que esteja armazenado no PIER Cloud, informando qual o tipo do documento e o seu respectivo id."
  [id body ]
  (:data (atribuir-assinatura-cliente-using-post-with-http-info id body)))

(defn cadastrar-using-post-with-http-info
  "Realiza o cadastro de Adicionais para uma Conta
  Este mÃ©todo permite que sejam cadastrados um portador Adicional para uma determinada Conta."
  [id persist ]
  (call-api "/api/contas/{id}/cadastrar-adicional" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-using-post
  "Realiza o cadastro de Adicionais para uma Conta
  Este mÃ©todo permite que sejam cadastrados um portador Adicional para uma determinada Conta."
  [id persist ]
  (:data (cadastrar-using-post-with-http-info id persist)))

(defn consultar-using-get10-with-http-info
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

(defn consultar-using-get10
  "Apresenta os detalhes de uma determinada Pessoa
  Este mÃ©todo permite a consulta dos detalhes de uma Pessoa existentes na base de dados do Emissor."
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn consultar-using-get11-with-http-info
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

(defn consultar-using-get11
  "Apresenta os dados de uma determinada Pessoa
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  [id ]
  (:data (consultar-using-get11-with-http-info id)))

(defn consultar-using-get16-with-http-info
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

(defn consultar-using-get16
  "Apresenta os dados de um determinado Telefone
  Este mÃ©todo permite consultar um determinado Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get16-with-http-info id)))

(defn consultar-using-get6-with-http-info
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

(defn consultar-using-get6
  "Apresenta os dados de um determinado EndereÃ§o
  Este mÃ©todo permite consultar um determinado EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get6-with-http-info id)))

(defn inativar-using-post-with-http-info
  "Inativa Adicional de uma Conta
  Este mÃ©todo permite que seja inativado um portador Adicional de uma determinada Conta."
  [id id-pessoa ]
  (call-api "/api/contas/{id}/adicionais/{idPessoa}/inativar" :post
            {:path-params   {"id" id "idPessoa" id-pessoa }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn inativar-using-post
  "Inativa Adicional de uma Conta
  Este mÃ©todo permite que seja inativado um portador Adicional de uma determinada Conta."
  [id id-pessoa ]
  (:data (inativar-using-post-with-http-info id id-pessoa)))

(defn listar-socios-using-get-with-http-info
  "Listar sÃ³cios de uma pessoa jurÃ­dica
  Lista os sÃ³cios vinculados Ã  uma Pessoa JurÃ­dica cadastrada."
  ([id ] (listar-socios-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/clientes-pessoas-juridicas/{id}/socios" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-socios-using-get
  "Listar sÃ³cios de uma pessoa jurÃ­dica
  Lista os sÃ³cios vinculados Ã  uma Pessoa JurÃ­dica cadastrada."
  ([id ] (listar-socios-using-get id nil))
  ([id optional-params]
   (:data (listar-socios-using-get-with-http-info id optional-params))))

(defn listar-using-get-with-http-info
  "Lista os Adicionais de uma Conta
  Este mÃ©todo permite que sejam listados portadores Adicionais de uma determinada Conta."
  ([id ] (listar-using-get-with-http-info id nil))
  ([id {:keys [page limit ]}]
   (call-api "/api/contas/{id}/adicionais" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get
  "Lista os Adicionais de uma Conta
  Este mÃ©todo permite que sejam listados portadores Adicionais de uma determinada Conta."
  ([id ] (listar-using-get id nil))
  ([id optional-params]
   (:data (listar-using-get-with-http-info id optional-params))))

(defn listar-using-get10-with-http-info
  "Lista os EndereÃ§os cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get10-with-http-info nil))
  ([{:keys [sort page limit id id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais data-inclusao data-ultima-atualizacao ]}]
   (call-api "/api/enderecos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais "dataInclusao" data-inclusao "dataUltimaAtualizacao" data-ultima-atualizacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get10
  "Lista os EndereÃ§os cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get10 nil))
  ([optional-params]
   (:data (listar-using-get10-with-http-info optional-params))))

(defn listar-using-get15-with-http-info
  "Lista os Detalhes das Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas od detalhes das Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get15-with-http-info nil))
  ([{:keys [sort page limit id-pessoa nome-mae id-estado-civil id-profissao id-natureza-ocupacao id-nacionalidade numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idPessoa" id-pessoa "nomeMae" nome-mae "idEstadoCivil" id-estado-civil "idProfissao" id-profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get15
  "Lista os Detalhes das Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas od detalhes das Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get15 nil))
  ([optional-params]
   (:data (listar-using-get15-with-http-info optional-params))))

(defn listar-using-get16-with-http-info
  "Lista as Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get16-with-http-info nil))
  ([{:keys [sort page limit id nome tipo cpf cnpj data-nascimento sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get16
  "Lista as Pessoas cadastradas no Emissor
  Este mÃ©todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor."
  ([] (listar-using-get16 nil))
  ([optional-params]
   (:data (listar-using-get16-with-http-info optional-params))))

(defn listar-using-get24-with-http-info
  "Lista os Telefones cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get24-with-http-info nil))
  ([{:keys [sort page limit id id-tipo-telefone id-pessoa ddd telefone ramal status ]}]
   (call-api "/api/telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get24
  "Lista os Telefones cadastrados no Emissor
  Este mÃ©todo permite que sejam listados os Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get24 nil))
  ([optional-params]
   (:data (listar-using-get24-with-http-info optional-params))))

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

(defn salvar-using-post10-with-http-info
  "Salvar os detalhes de uma determinada Pessoa
  Este mÃ©todo permite que seja incluido na base do emissor os detalhes de uma determinada Pessoa."
  ([id-pessoa ] (salvar-using-post10-with-http-info id-pessoa nil))
  ([id-pessoa {:keys [nome-mae id-estado-civil id-profissao id-natureza-ocupacao id-nacionalidade numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idPessoa" id-pessoa "nomeMae" nome-mae "idEstadoCivil" id-estado-civil "idProfissao" id-profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post10
  "Salvar os detalhes de uma determinada Pessoa
  Este mÃ©todo permite que seja incluido na base do emissor os detalhes de uma determinada Pessoa."
  ([id-pessoa ] (salvar-using-post10 id-pessoa nil))
  ([id-pessoa optional-params]
   (:data (salvar-using-post10-with-http-info id-pessoa optional-params))))

(defn salvar-using-post11-with-http-info
  "Realiza o cadastro de um nova Pessoa
  Este mÃ©todo permite que seja cadastrado uma nova Pessoa na base de dados do Emissor."
  ([nome tipo ] (salvar-using-post11-with-http-info nome tipo nil))
  ([nome tipo {:keys [cpf cnpj data-nascimento sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post11
  "Realiza o cadastro de um nova Pessoa
  Este mÃ©todo permite que seja cadastrado uma nova Pessoa na base de dados do Emissor."
  ([nome tipo ] (salvar-using-post11 nome tipo nil))
  ([nome tipo optional-params]
   (:data (salvar-using-post11-with-http-info nome tipo optional-params))))

(defn salvar-using-post13-with-http-info
  "Realiza o cadastro de um novo Telefone
  Este mÃ©todo permite que seja cadastrado um novo Telefone na base de dados do Emissor."
  ([] (salvar-using-post13-with-http-info nil))
  ([{:keys [id-tipo-telefone id-pessoa ddd telefone ramal ]}]
   (call-api "/api/telefones" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post13
  "Realiza o cadastro de um novo Telefone
  Este mÃ©todo permite que seja cadastrado um novo Telefone na base de dados do Emissor."
  ([] (salvar-using-post13 nil))
  ([optional-params]
   (:data (salvar-using-post13-with-http-info optional-params))))

(defn salvar-using-post5-with-http-info
  "Realiza o cadastro de um novo EndereÃ§o
  Este mÃ©todo permite que seja cadastrado um novo EndereÃ§o na base de dados do Emissor."
  ([] (salvar-using-post5-with-http-info nil))
  ([{:keys [id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais ]}]
   (call-api "/api/enderecos" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post5
  "Realiza o cadastro de um novo EndereÃ§o
  Este mÃ©todo permite que seja cadastrado um novo EndereÃ§o na base de dados do Emissor."
  ([] (salvar-using-post5 nil))
  ([optional-params]
   (:data (salvar-using-post5-with-http-info optional-params))))

(defn salvar-using-post7-with-http-info
  "Inclui a conta como registro para integraÃ§Ã£o
  Este recurso permite incluir uma conta como registro para integraÃ§Ã£o."
  ([id ] (salvar-using-post7-with-http-info id nil))
  ([id {:keys [body ]}]
   (call-api "/api/contas/{id}/incluir-registro-integracao" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post7
  "Inclui a conta como registro para integraÃ§Ã£o
  Este recurso permite incluir uma conta como registro para integraÃ§Ã£o."
  ([id ] (salvar-using-post7 id nil))
  ([id optional-params]
   (:data (salvar-using-post7-with-http-info id optional-params))))
