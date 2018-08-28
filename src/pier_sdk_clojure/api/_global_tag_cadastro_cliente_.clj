(ns pier-sdk-clojure.api.-global-tag-cadastro-cliente-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put-with-http-info
  "{{{adicional_resource_alterar}}}
  {{{adicional_resource_alterar_notes}}}"
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
  "{{{adicional_resource_alterar}}}
  {{{adicional_resource_alterar_notes}}}"
  [id id-pessoa adicional-update ]
  (:data (alterar-using-put-with-http-info id id-pessoa adicional-update)))

(defn alterar-using-put15-with-http-info
  "{{{pessoa_detalhe_resource_alterar}}}
  {{{pessoa_detalhe_resource_alterar_notes}}}"
  ([id ] (alterar-using-put15-with-http-info id nil))
  ([id {:keys [nome-mae id-estado-civil id-profissao id-natureza-ocupacao id-nacionalidade numero-banco numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"nomeMae" nome-mae "idEstadoCivil" id-estado-civil "idProfissao" id-profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroBanco" numero-banco "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put15
  "{{{pessoa_detalhe_resource_alterar}}}
  {{{pessoa_detalhe_resource_alterar_notes}}}"
  ([id ] (alterar-using-put15 id nil))
  ([id optional-params]
   (:data (alterar-using-put15-with-http-info id optional-params))))

(defn alterar-using-put16-with-http-info
  "{{{pessoa_resource_alterar}}}
  {{{pessoa_resource_alterar_notes}}}"
  ([id nome tipo data-nascimento ] (alterar-using-put16-with-http-info id nome tipo data-nascimento nil))
  ([id nome tipo data-nascimento {:keys [cpf cnpj sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put16
  "{{{pessoa_resource_alterar}}}
  {{{pessoa_resource_alterar_notes}}}"
  ([id nome tipo data-nascimento ] (alterar-using-put16 id nome tipo data-nascimento nil))
  ([id nome tipo data-nascimento optional-params]
   (:data (alterar-using-put16-with-http-info id nome tipo data-nascimento optional-params))))

(defn alterar-using-put18-with-http-info
  "{{{telefone_resource_alterar}}}
  {{{telefone_resource_alterar_notes}}}"
  ([id ] (alterar-using-put18-with-http-info id nil))
  ([id {:keys [id-tipo-telefone ddd telefone ramal ]}]
   (call-api "/api/telefones" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idTipoTelefone" id-tipo-telefone "ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put18
  "{{{telefone_resource_alterar}}}
  {{{telefone_resource_alterar_notes}}}"
  ([id ] (alterar-using-put18 id nil))
  ([id optional-params]
   (:data (alterar-using-put18-with-http-info id optional-params))))

(defn alterar-using-put5-with-http-info
  "{{{endereco_resource_alterar}}}
  {{{endereco_resource_alterar_notes}}}"
  ([id ] (alterar-using-put5-with-http-info id nil))
  ([id {:keys [id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais ]}]
   (call-api "/api/enderecos" :put
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put5
  "{{{endereco_resource_alterar}}}
  {{{endereco_resource_alterar_notes}}}"
  ([id ] (alterar-using-put5 id nil))
  ([id optional-params]
   (:data (alterar-using-put5-with-http-info id optional-params))))

(defn atribuir-assinatura-cliente-using-post-with-http-info
  "{{{conta_pessoa_resource_atribuir_assinatura_cliente}}}
  {{{conta_pessoa_resource_atribuir_assinatura_cliente_notes}}}"
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
  "{{{conta_pessoa_resource_atribuir_assinatura_cliente}}}
  {{{conta_pessoa_resource_atribuir_assinatura_cliente_notes}}}"
  [id body ]
  (:data (atribuir-assinatura-cliente-using-post-with-http-info id body)))

(defn atualizar-endereco-de-correspondencia-using-put-with-http-info
  "{{{endereco_resource_atualizar_correspondencia}}}
  {{{endereco_resource_atualizar_correspondencia_notes}}}"
  [id id-conta ]
  (call-api "/api/enderecos/{id}/alterar-endereco-correspondencia" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"idConta" id-conta }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-endereco-de-correspondencia-using-put
  "{{{endereco_resource_atualizar_correspondencia}}}
  {{{endereco_resource_atualizar_correspondencia_notes}}}"
  [id id-conta ]
  (:data (atualizar-endereco-de-correspondencia-using-put-with-http-info id id-conta)))

(defn atualizar-using-post-with-http-info
  "{{{integracao_emissor_resource_atualizar}}}
  {{{integracao_emissor_resource_atualizar_notes}}}"
  ([id ] (atualizar-using-post-with-http-info id nil))
  ([id {:keys [body ]}]
   (call-api "/api/contas/{id}/atualizar-registro-integracao" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn atualizar-using-post
  "{{{integracao_emissor_resource_atualizar}}}
  {{{integracao_emissor_resource_atualizar_notes}}}"
  ([id ] (atualizar-using-post id nil))
  ([id optional-params]
   (:data (atualizar-using-post-with-http-info id optional-params))))

(defn cadastrar-adicional-using-post-with-http-info
  "{{{adicional_resource_cadastrar_adicional}}}
  {{{adicional_resource_cadastrar_adicional_notes}}}"
  [id adicional-conta-persist ]
  (call-api "/api/contas/{id}/adicionais" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    adicional-conta-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-adicional-using-post
  "{{{adicional_resource_cadastrar_adicional}}}
  {{{adicional_resource_cadastrar_adicional_notes}}}"
  [id adicional-conta-persist ]
  (:data (cadastrar-adicional-using-post-with-http-info id adicional-conta-persist)))

(defn cadastrar-using-post1-with-http-info
  "{{{adicional_resource_cadastrar}}}
  {{{adicional_resource_cadastrar_notes}}}"
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

(defn cadastrar-using-post1
  "{{{adicional_resource_cadastrar}}}
  {{{adicional_resource_cadastrar_notes}}}"
  [id persist ]
  (:data (cadastrar-using-post1-with-http-info id persist)))

(defn consultar-using-get2-with-http-info
  "{{{adicional_resource_consultar}}}
  {{{adicional_resource_consultar_notes}}}"
  [id id-pessoa ]
  (call-api "/api/contas/{id}/adicionais/{idPessoa}" :get
            {:path-params   {"id" id "idPessoa" id-pessoa }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get2
  "{{{adicional_resource_consultar}}}
  {{{adicional_resource_consultar_notes}}}"
  [id id-pessoa ]
  (:data (consultar-using-get2-with-http-info id id-pessoa)))

(defn consultar-using-get21-with-http-info
  "{{{endereco_resource_consultar}}}
  {{{endereco_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/enderecos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get21
  "{{{endereco_resource_consultar}}}
  {{{endereco_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get21-with-http-info id)))

(defn consultar-using-get32-with-http-info
  "{{{pessoa_detalhe_resource_consultar}}}
  {{{pessoa_detalhe_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/pessoas-detalhes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get32
  "{{{pessoa_detalhe_resource_consultar}}}
  {{{pessoa_detalhe_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get32-with-http-info id)))

(defn consultar-using-get33-with-http-info
  "{{{pessoa_resource_consultar}}}
  {{{pessoa_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/pessoas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get33
  "{{{pessoa_resource_consultar}}}
  {{{pessoa_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get33-with-http-info id)))

(defn consultar-using-get41-with-http-info
  "{{{telefone_resource_consultar}}}
  {{{telefone_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/telefones/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get41
  "{{{telefone_resource_consultar}}}
  {{{telefone_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get41-with-http-info id)))

(defn inativar-using-post-with-http-info
  "{{{adicional_resource_inativar}}}
  {{{adicional_resource_inativar_notes}}}"
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
  "{{{adicional_resource_inativar}}}
  {{{adicional_resource_inativar_notes}}}"
  [id id-pessoa ]
  (:data (inativar-using-post-with-http-info id id-pessoa)))

(defn listar-socios-using-get-with-http-info
  "{{{conta_pessoa_resource_listar_socios}}}
  {{{conta_pessoa_resource_listar_socios_notes}}}"
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
  "{{{conta_pessoa_resource_listar_socios}}}
  {{{conta_pessoa_resource_listar_socios_notes}}}"
  ([id ] (listar-socios-using-get id nil))
  ([id optional-params]
   (:data (listar-socios-using-get-with-http-info id optional-params))))

(defn listar-using-get1-with-http-info
  "{{{adicional_resource_listar}}}
  {{{adicional_resource_listar_notes}}}"
  ([id ] (listar-using-get1-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/adicionais" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get1
  "{{{adicional_resource_listar}}}
  {{{adicional_resource_listar_notes}}}"
  ([id ] (listar-using-get1 id nil))
  ([id optional-params]
   (:data (listar-using-get1-with-http-info id optional-params))))

(defn listar-using-get25-with-http-info
  "{{{endereco_resource_listar}}}
  {{{endereco_resource_listar_notes}}}"
  ([] (listar-using-get25-with-http-info nil))
  ([{:keys [sort page limit id id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais data-inclusao data-ultima-atualizacao ]}]
   (call-api "/api/enderecos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais "dataInclusao" data-inclusao "dataUltimaAtualizacao" data-ultima-atualizacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get25
  "{{{endereco_resource_listar}}}
  {{{endereco_resource_listar_notes}}}"
  ([] (listar-using-get25 nil))
  ([optional-params]
   (:data (listar-using-get25-with-http-info optional-params))))

(defn listar-using-get40-with-http-info
  "{{{pessoa_detalhe_resource_listar}}}
  {{{pessoa_detalhe_resource_listar_notes}}}"
  ([] (listar-using-get40-with-http-info nil))
  ([{:keys [sort page limit id-pessoa nome-mae id-estado-civil id-profissao id-natureza-ocupacao id-nacionalidade numero-banco numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idPessoa" id-pessoa "nomeMae" nome-mae "idEstadoCivil" id-estado-civil "idProfissao" id-profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroBanco" numero-banco "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get40
  "{{{pessoa_detalhe_resource_listar}}}
  {{{pessoa_detalhe_resource_listar_notes}}}"
  ([] (listar-using-get40 nil))
  ([optional-params]
   (:data (listar-using-get40-with-http-info optional-params))))

(defn listar-using-get41-with-http-info
  "{{{pessoa_resource_listar}}}
  {{{pessoa_resource_listar_notes}}}"
  ([] (listar-using-get41-with-http-info nil))
  ([{:keys [sort page limit id nome tipo cpf cnpj data-nascimento sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get41
  "{{{pessoa_resource_listar}}}
  {{{pessoa_resource_listar_notes}}}"
  ([] (listar-using-get41 nil))
  ([optional-params]
   (:data (listar-using-get41-with-http-info optional-params))))

(defn listar-using-get53-with-http-info
  "{{{telefone_resource_listar}}}
  {{{telefone_resource_listar_notes}}}"
  ([] (listar-using-get53-with-http-info nil))
  ([{:keys [sort page limit id id-tipo-telefone id-pessoa ddd telefone ramal status ]}]
   (call-api "/api/telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get53
  "{{{telefone_resource_listar}}}
  {{{telefone_resource_listar_notes}}}"
  ([] (listar-using-get53 nil))
  ([optional-params]
   (:data (listar-using-get53-with-http-info optional-params))))

(defn salvar-pessoa-fisica-aprovada-using-post-with-http-info
  "{{{conta_pessoa_resource_salvar_pessoa_fisica_aprovada}}}
  {{{conta_pessoa_resource_salvar_pessoa_fisica_aprovada_notes}}}"
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
  "{{{conta_pessoa_resource_salvar_pessoa_fisica_aprovada}}}
  {{{conta_pessoa_resource_salvar_pessoa_fisica_aprovada_notes}}}"
  [pessoa-persist ]
  (:data (salvar-pessoa-fisica-aprovada-using-post-with-http-info pessoa-persist)))

(defn salvar-pessoa-juridica-aprovada-using-post-with-http-info
  "{{{conta_pessoa_resource_salvar_pessoa_juridica_aprovada}}}
  {{{conta_pessoa_resource_salvar_pessoa_juridica_aprovada_notes}}}"
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
  "{{{conta_pessoa_resource_salvar_pessoa_juridica_aprovada}}}
  {{{conta_pessoa_resource_salvar_pessoa_juridica_aprovada_notes}}}"
  [pessoa-persist ]
  (:data (salvar-pessoa-juridica-aprovada-using-post-with-http-info pessoa-persist)))

(defn salvar-using-post14-with-http-info
  "{{{endereco_resource_salvar}}}
  {{{endereco_resource_salvar_notes}}}"
  ([] (salvar-using-post14-with-http-info nil))
  ([{:keys [id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais ]}]
   (call-api "/api/enderecos" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post14
  "{{{endereco_resource_salvar}}}
  {{{endereco_resource_salvar_notes}}}"
  ([] (salvar-using-post14 nil))
  ([optional-params]
   (:data (salvar-using-post14-with-http-info optional-params))))

(defn salvar-using-post17-with-http-info
  "{{{integracao_emissor_resource_salvar}}}
  {{{integracao_emissor_resource_salvar_notes}}}"
  ([id ] (salvar-using-post17-with-http-info id nil))
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

(defn salvar-using-post17
  "{{{integracao_emissor_resource_salvar}}}
  {{{integracao_emissor_resource_salvar_notes}}}"
  ([id ] (salvar-using-post17 id nil))
  ([id optional-params]
   (:data (salvar-using-post17-with-http-info id optional-params))))

(defn salvar-using-post25-with-http-info
  "{{{pessoa_detalhe_resource_salvar}}}
  {{{pessoa_detalhe_resource_salvar_notes}}}"
  ([id-pessoa ] (salvar-using-post25-with-http-info id-pessoa nil))
  ([id-pessoa {:keys [nome-mae id-estado-civil id-profissao id-natureza-ocupacao id-nacionalidade numero-banco numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idPessoa" id-pessoa "nomeMae" nome-mae "idEstadoCivil" id-estado-civil "idProfissao" id-profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroBanco" numero-banco "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post25
  "{{{pessoa_detalhe_resource_salvar}}}
  {{{pessoa_detalhe_resource_salvar_notes}}}"
  ([id-pessoa ] (salvar-using-post25 id-pessoa nil))
  ([id-pessoa optional-params]
   (:data (salvar-using-post25-with-http-info id-pessoa optional-params))))

(defn salvar-using-post26-with-http-info
  "{{{pessoa_resource_salvar}}}
  {{{pessoa_resource_salvar_notes}}}"
  ([nome tipo data-nascimento ] (salvar-using-post26-with-http-info nome tipo data-nascimento nil))
  ([nome tipo data-nascimento {:keys [cpf cnpj sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post26
  "{{{pessoa_resource_salvar}}}
  {{{pessoa_resource_salvar_notes}}}"
  ([nome tipo data-nascimento ] (salvar-using-post26 nome tipo data-nascimento nil))
  ([nome tipo data-nascimento optional-params]
   (:data (salvar-using-post26-with-http-info nome tipo data-nascimento optional-params))))

(defn salvar-using-post29-with-http-info
  "{{{telefone_resource_salvar}}}
  {{{telefone_resource_salvar_notes}}}"
  ([] (salvar-using-post29-with-http-info nil))
  ([{:keys [id-tipo-telefone id-pessoa ddd telefone ramal ]}]
   (call-api "/api/telefones" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post29
  "{{{telefone_resource_salvar}}}
  {{{telefone_resource_salvar_notes}}}"
  ([] (salvar-using-post29 nil))
  ([optional-params]
   (:data (salvar-using-post29-with-http-info optional-params))))
