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

(defn cadastrar-using-post-with-http-info
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

(defn cadastrar-using-post
  "{{{adicional_resource_cadastrar}}}
  {{{adicional_resource_cadastrar_notes}}}"
  [id persist ]
  (:data (cadastrar-using-post-with-http-info id persist)))

(defn consultar-using-get1-with-http-info
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

(defn consultar-using-get1
  "{{{adicional_resource_consultar}}}
  {{{adicional_resource_consultar_notes}}}"
  [id id-pessoa ]
  (:data (consultar-using-get1-with-http-info id id-pessoa)))

(defn consultar-using-get18-with-http-info
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

(defn consultar-using-get18
  "{{{endereco_resource_consultar}}}
  {{{endereco_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get18-with-http-info id)))

(defn consultar-using-get29-with-http-info
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

(defn consultar-using-get29
  "{{{pessoa_detalhe_resource_consultar}}}
  {{{pessoa_detalhe_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get29-with-http-info id)))

(defn consultar-using-get30-with-http-info
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

(defn consultar-using-get30
  "{{{pessoa_resource_consultar}}}
  {{{pessoa_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get30-with-http-info id)))

(defn consultar-using-get38-with-http-info
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

(defn consultar-using-get38
  "{{{telefone_resource_consultar}}}
  {{{telefone_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get38-with-http-info id)))

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

(defn listar-using-get24-with-http-info
  "{{{endereco_resource_listar}}}
  {{{endereco_resource_listar_notes}}}"
  ([] (listar-using-get24-with-http-info nil))
  ([{:keys [sort page limit id id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais data-inclusao data-ultima-atualizacao ]}]
   (call-api "/api/enderecos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais "dataInclusao" data-inclusao "dataUltimaAtualizacao" data-ultima-atualizacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get24
  "{{{endereco_resource_listar}}}
  {{{endereco_resource_listar_notes}}}"
  ([] (listar-using-get24 nil))
  ([optional-params]
   (:data (listar-using-get24-with-http-info optional-params))))

(defn listar-using-get38-with-http-info
  "{{{pessoa_detalhe_resource_listar}}}
  {{{pessoa_detalhe_resource_listar_notes}}}"
  ([] (listar-using-get38-with-http-info nil))
  ([{:keys [sort page limit id-pessoa nome-mae id-estado-civil id-profissao id-natureza-ocupacao id-nacionalidade numero-banco numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idPessoa" id-pessoa "nomeMae" nome-mae "idEstadoCivil" id-estado-civil "idProfissao" id-profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroBanco" numero-banco "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get38
  "{{{pessoa_detalhe_resource_listar}}}
  {{{pessoa_detalhe_resource_listar_notes}}}"
  ([] (listar-using-get38 nil))
  ([optional-params]
   (:data (listar-using-get38-with-http-info optional-params))))

(defn listar-using-get39-with-http-info
  "{{{pessoa_resource_listar}}}
  {{{pessoa_resource_listar_notes}}}"
  ([] (listar-using-get39-with-http-info nil))
  ([{:keys [sort page limit id nome tipo cpf cnpj data-nascimento sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get39
  "{{{pessoa_resource_listar}}}
  {{{pessoa_resource_listar_notes}}}"
  ([] (listar-using-get39 nil))
  ([optional-params]
   (:data (listar-using-get39-with-http-info optional-params))))

(defn listar-using-get50-with-http-info
  "{{{telefone_resource_listar}}}
  {{{telefone_resource_listar_notes}}}"
  ([] (listar-using-get50-with-http-info nil))
  ([{:keys [sort page limit id id-tipo-telefone id-pessoa ddd telefone ramal status ]}]
   (call-api "/api/telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get50
  "{{{telefone_resource_listar}}}
  {{{telefone_resource_listar_notes}}}"
  ([] (listar-using-get50 nil))
  ([optional-params]
   (:data (listar-using-get50-with-http-info optional-params))))

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

(defn salvar-using-post13-with-http-info
  "{{{endereco_resource_salvar}}}
  {{{endereco_resource_salvar_notes}}}"
  ([] (salvar-using-post13-with-http-info nil))
  ([{:keys [id-pessoa id-tipo-endereco cep logradouro numero complemento ponto-referencia bairro cidade uf pais ]}]
   (call-api "/api/enderecos" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idPessoa" id-pessoa "idTipoEndereco" id-tipo-endereco "cep" cep "logradouro" logradouro "numero" numero "complemento" complemento "pontoReferencia" ponto-referencia "bairro" bairro "cidade" cidade "uf" uf "pais" pais }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post13
  "{{{endereco_resource_salvar}}}
  {{{endereco_resource_salvar_notes}}}"
  ([] (salvar-using-post13 nil))
  ([optional-params]
   (:data (salvar-using-post13-with-http-info optional-params))))

(defn salvar-using-post16-with-http-info
  "{{{integracao_emissor_resource_salvar}}}
  {{{integracao_emissor_resource_salvar_notes}}}"
  ([id ] (salvar-using-post16-with-http-info id nil))
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

(defn salvar-using-post16
  "{{{integracao_emissor_resource_salvar}}}
  {{{integracao_emissor_resource_salvar_notes}}}"
  ([id ] (salvar-using-post16 id nil))
  ([id optional-params]
   (:data (salvar-using-post16-with-http-info id optional-params))))

(defn salvar-using-post24-with-http-info
  "{{{pessoa_detalhe_resource_salvar}}}
  {{{pessoa_detalhe_resource_salvar_notes}}}"
  ([id-pessoa ] (salvar-using-post24-with-http-info id-pessoa nil))
  ([id-pessoa {:keys [nome-mae id-estado-civil id-profissao id-natureza-ocupacao id-nacionalidade numero-banco numero-agencia numero-conta-corrente email nome-empresa ]}]
   (call-api "/api/pessoas-detalhes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idPessoa" id-pessoa "nomeMae" nome-mae "idEstadoCivil" id-estado-civil "idProfissao" id-profissao "idNaturezaOcupacao" id-natureza-ocupacao "idNacionalidade" id-nacionalidade "numeroBanco" numero-banco "numeroAgencia" numero-agencia "numeroContaCorrente" numero-conta-corrente "email" email "nomeEmpresa" nome-empresa }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post24
  "{{{pessoa_detalhe_resource_salvar}}}
  {{{pessoa_detalhe_resource_salvar_notes}}}"
  ([id-pessoa ] (salvar-using-post24 id-pessoa nil))
  ([id-pessoa optional-params]
   (:data (salvar-using-post24-with-http-info id-pessoa optional-params))))

(defn salvar-using-post25-with-http-info
  "{{{pessoa_resource_salvar}}}
  {{{pessoa_resource_salvar_notes}}}"
  ([nome tipo data-nascimento ] (salvar-using-post25-with-http-info nome tipo data-nascimento nil))
  ([nome tipo data-nascimento {:keys [cpf cnpj sexo numero-identidade orgao-expedidor-identidade unidade-federativa-identidade data-emissao-identidade ]}]
   (call-api "/api/pessoas" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"nome" nome "tipo" tipo "cpf" cpf "cnpj" cnpj "dataNascimento" data-nascimento "sexo" sexo "numeroIdentidade" numero-identidade "orgaoExpedidorIdentidade" orgao-expedidor-identidade "unidadeFederativaIdentidade" unidade-federativa-identidade "dataEmissaoIdentidade" data-emissao-identidade }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post25
  "{{{pessoa_resource_salvar}}}
  {{{pessoa_resource_salvar_notes}}}"
  ([nome tipo data-nascimento ] (salvar-using-post25 nome tipo data-nascimento nil))
  ([nome tipo data-nascimento optional-params]
   (:data (salvar-using-post25-with-http-info nome tipo data-nascimento optional-params))))

(defn salvar-using-post28-with-http-info
  "{{{telefone_resource_salvar}}}
  {{{telefone_resource_salvar_notes}}}"
  ([] (salvar-using-post28-with-http-info nil))
  ([{:keys [id-tipo-telefone id-pessoa ddd telefone ramal ]}]
   (call-api "/api/telefones" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idTipoTelefone" id-tipo-telefone "idPessoa" id-pessoa "ddd" ddd "telefone" telefone "ramal" ramal }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post28
  "{{{telefone_resource_salvar}}}
  {{{telefone_resource_salvar_notes}}}"
  ([] (salvar-using-post28 nil))
  ([optional-params]
   (:data (salvar-using-post28-with-http-info optional-params))))
