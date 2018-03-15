(ns pier-sdk-clojure.api.conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ajustar-conta-using-post1-with-http-info
  "Lança um ajuste para a conta do id informado
  Este recurso insere um ajuste para a conta do id informado"
  ([id id-tipo-ajuste data-ajuste valor-ajuste ] (ajustar-conta-using-post1-with-http-info id id-tipo-ajuste data-ajuste valor-ajuste nil))
  ([id id-tipo-ajuste data-ajuste valor-ajuste {:keys [identificador-externo ]}]
   (call-api "/api/contas/{id}/ajustes-financeiros" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"idTipoAjuste" id-tipo-ajuste "dataAjuste" data-ajuste "valorAjuste" valor-ajuste "identificadorExterno" identificador-externo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn ajustar-conta-using-post1
  "Lança um ajuste para a conta do id informado
  Este recurso insere um ajuste para a conta do id informado"
  ([id id-tipo-ajuste data-ajuste valor-ajuste ] (ajustar-conta-using-post1 id id-tipo-ajuste data-ajuste valor-ajuste nil))
  ([id id-tipo-ajuste data-ajuste valor-ajuste optional-params]
   (:data (ajustar-conta-using-post1-with-http-info id id-tipo-ajuste data-ajuste valor-ajuste optional-params))))

(defn alterar-produto-using-post-with-http-info
  "Altera o produto associado à conta.
  O recurso permite fazer modificação do produto associado à conta."
  [id request ]
  (call-api "/api/contas/{id}/alterar-produto" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-produto-using-post
  "Altera o produto associado à conta.
  O recurso permite fazer modificação do produto associado à conta."
  [id request ]
  (:data (alterar-produto-using-post-with-http-info id request)))

(defn alterar-titular-using-post-with-http-info
  "Realiza a alteração de uma Pessoa tilular da conta
  Esta método permite altera a pessoa de uma conta."
  [id id-pessoa ]
  (call-api "/api/contas/{id}/alterar-titular" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_pessoa" id-pessoa }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-titular-using-post
  "Realiza a alteração de uma Pessoa tilular da conta
  Esta método permite altera a pessoa de uma conta."
  [id id-pessoa ]
  (:data (alterar-titular-using-post-with-http-info id id-pessoa)))

(defn alterar-vencimento-using-put-with-http-info
  "Realiza a alteração do dia de vencimento das faturas da conta
  Esse recurso permite alterar o vencimento para no máximo até 30 dias após data atual de uma conta especifica no PIER, respeitando o parâmetro de intervalor entre as modificações do vencimento informado pelo emissor."
  [id novo-dia-vencimento ]
  (call-api "/api/contas/{id}/alterar-vencimento" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"novo_dia_vencimento" novo-dia-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-vencimento-using-put
  "Realiza a alteração do dia de vencimento das faturas da conta
  Esse recurso permite alterar o vencimento para no máximo até 30 dias após data atual de uma conta especifica no PIER, respeitando o parâmetro de intervalor entre as modificações do vencimento informado pelo emissor."
  [id novo-dia-vencimento ]
  (:data (alterar-vencimento-using-put-with-http-info id novo-dia-vencimento)))

(defn ativar-anuidade-using-post-with-http-info
  "Atribuir Anuidade
  Esse recurso permite configurar qual a regra de Anuidade que será atribuída a uma determinada Conta."
  ([id id-anuidade ] (ativar-anuidade-using-post-with-http-info id id-anuidade nil))
  ([id id-anuidade {:keys [sort page limit ddd celular id-operadora id-origem-comercial ]}]
   (call-api "/api/contas/{id}/atribuir-anuidade" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idAnuidade" id-anuidade "DDD" ddd "celular" celular "idOperadora" id-operadora "idOrigemComercial" id-origem-comercial }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn ativar-anuidade-using-post
  "Atribuir Anuidade
  Esse recurso permite configurar qual a regra de Anuidade que será atribuída a uma determinada Conta."
  ([id id-anuidade ] (ativar-anuidade-using-post id id-anuidade nil))
  ([id id-anuidade optional-params]
   (:data (ativar-anuidade-using-post-with-http-info id id-anuidade optional-params))))

(defn ativar-envio-fatura-email-using-post-with-http-info
  "Ativa o serviço de envio de fatura por email
  Este recurso ativa o serviço de envio de fatura por email"
  [id ]
  (call-api "/api/contas/{id}/ativar-fatura-email" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-envio-fatura-email-using-post
  "Ativa o serviço de envio de fatura por email
  Este recurso ativa o serviço de envio de fatura por email"
  [id ]
  (:data (ativar-envio-fatura-email-using-post-with-http-info id)))

(defn bloquear-using-post1-with-http-info
  "Realiza o bloqueio de uma determinada Conta
  Este método permite a realização do bloqueio de uma determinada conta a partir do seu código de identificação (id)."
  [id id-status ]
  (call-api "/api/contas/{id}/bloquear" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_status" id-status }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn bloquear-using-post1
  "Realiza o bloqueio de uma determinada Conta
  Este método permite a realização do bloqueio de uma determinada conta a partir do seu código de identificação (id)."
  [id id-status ]
  (:data (bloquear-using-post1-with-http-info id id-status)))

(defn cancelar-using-post1-with-http-info
  "Realiza o cancelamento de uma determinada Conta
  Este método permite a realização do cancelamento de uma determinada conta a partir do seu código de identificação (id)."
  [id id-status ]
  (call-api "/api/contas/{id}/cancelar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_status" id-status }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cancelar-using-post1
  "Realiza o cancelamento de uma determinada Conta
  Este método permite a realização do cancelamento de uma determinada conta a partir do seu código de identificação (id)."
  [id id-status ]
  (:data (cancelar-using-post1-with-http-info id id-status)))

(defn consultar-beneficio-pagamento-atraso-using-get-with-http-info
  "Apresenta a data máxima para pagamento da fatura em atraso para receber o benefício.
  Este método permite consultar se o cliente tem direito ao benefício de pagamento em atraso, em loja, até o sábado subsequente ao vencimento, ficando isento do pagamento de multa, encargos, mora e IOF."
  [id ]
  (call-api "/api/contas/{id}/consultar-beneficio-pagamento-atraso" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-beneficio-pagamento-atraso-using-get
  "Apresenta a data máxima para pagamento da fatura em atraso para receber o benefício.
  Este método permite consultar se o cliente tem direito ao benefício de pagamento em atraso, em loja, até o sábado subsequente ao vencimento, ficando isento do pagamento de multa, encargos, mora e IOF."
  [id ]
  (:data (consultar-beneficio-pagamento-atraso-using-get-with-http-info id)))

(defn consultar-boleto-emitido-using-get-with-http-info
  "Consulta os dados de um determinado boleto da fatura
  Este recurso consulta um boleto da fatura"
  [id ]
  (call-api "/api/contas/{id}/consultar-dados-pagamento-fatura" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-boleto-emitido-using-get
  "Consulta os dados de um determinado boleto da fatura
  Este recurso consulta um boleto da fatura"
  [id ]
  (:data (consultar-boleto-emitido-using-get-with-http-info id)))

(defn consultar-divida-atualizada-cliente-using-get-with-http-info
  "Consulta a dívida atualizada do cliente
  Este recurso consulta a dívida atualizada do cliente"
  ([id ] (consultar-divida-atualizada-cliente-using-get-with-http-info id nil))
  ([id {:keys [sort page limit data-vencimento id-escritorio-cobranca ]}]
   (call-api "/api/contas/{id}/recuperar-divida-atualizada" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimento" data-vencimento "idEscritorioCobranca" id-escritorio-cobranca }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-divida-atualizada-cliente-using-get
  "Consulta a dívida atualizada do cliente
  Este recurso consulta a dívida atualizada do cliente"
  ([id ] (consultar-divida-atualizada-cliente-using-get id nil))
  ([id optional-params]
   (:data (consultar-divida-atualizada-cliente-using-get-with-http-info id optional-params))))

(defn consultar-taxas-tarifas-using-get-with-http-info
  "Permite consultar a partir do ID da conta as taxas e tarifas
  Esta operação tem como objetivo permitir que os Emissores consultem as taxas e tarifas da conta"
  ([id ] (consultar-taxas-tarifas-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/consultar-taxas-tarifas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-taxas-tarifas-using-get
  "Permite consultar a partir do ID da conta as taxas e tarifas
  Esta operação tem como objetivo permitir que os Emissores consultem as taxas e tarifas da conta"
  ([id ] (consultar-taxas-tarifas-using-get id nil))
  ([id optional-params]
   (:data (consultar-taxas-tarifas-using-get-with-http-info id optional-params))))

(defn consultar-using-get13-with-http-info
  "Apresenta dados de uma determinada conta
  Este método permite consultar dados de uma determinada conta a partir de seu codigo de identificação (id)."
  [id ]
  (call-api "/api/contas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get13
  "Apresenta dados de uma determinada conta
  Este método permite consultar dados de uma determinada conta a partir de seu codigo de identificação (id)."
  [id ]
  (:data (consultar-using-get13-with-http-info id)))

(defn consultar-using-get42-with-http-info
  "Consulta os detalhes de uma determinada transferência
  Este método permite consultar os detalhes de uma determinada transferência de crédito realizada entre contas."
  [id id-transferencia ]
  (call-api "/api/contas/{id}/transferencias-creditos-cartoes/{id_transferencia}" :get
            {:path-params   {"id" id "id_transferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get42
  "Consulta os detalhes de uma determinada transferência
  Este método permite consultar os detalhes de uma determinada transferência de crédito realizada entre contas."
  [id id-transferencia ]
  (:data (consultar-using-get42-with-http-info id id-transferencia)))

(defn desativar-envio-fatura-email-using-post-with-http-info
  "Desativa o serviço de envio de fatura por email
  Este recurso desativa o serviço de envio de fatura por email"
  [id ]
  (call-api "/api/contas/{id}/desativar-fatura-email" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-envio-fatura-email-using-post
  "Desativa o serviço de envio de fatura por email
  Este recurso desativa o serviço de envio de fatura por email"
  [id ]
  (:data (desativar-envio-fatura-email-using-post-with-http-info id)))

(defn gerar-boleto-recarga-using-post-with-http-info
  "Gera um boleto de recarga
  Este recurso gera um boleto de recarga"
  [id valor data-vencimento ]
  (call-api "/api/contas/{id}/gerar-boleto-recarga" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"valor" valor "dataVencimento" data-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-boleto-recarga-using-post
  "Gera um boleto de recarga
  Este recurso gera um boleto de recarga"
  [id valor data-vencimento ]
  (:data (gerar-boleto-recarga-using-post-with-http-info id valor data-vencimento)))

(defn gerar-cartao-embossing-using-post-with-http-info
  "Realiza o envio para geração de um novo cartão na gráfica
  Este recurso permite que seja gerado um novo Cartão para um determinado Portador que esteja vinculado a uma Conta. Para isso, será preciso informar o código de identificação da Conta (id), o idPessoa do Portador e o idTipoPlastico do Cartão que deverá ser gerado para impressão. Esta funcionalidade poderá ser utilizada para impressão de cartões em gráfica."
  [id cartao-embossing-request ]
  (call-api "/api/contas/{id}/gerar-cartao-grafica" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    cartao-embossing-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-cartao-embossing-using-post
  "Realiza o envio para geração de um novo cartão na gráfica
  Este recurso permite que seja gerado um novo Cartão para um determinado Portador que esteja vinculado a uma Conta. Para isso, será preciso informar o código de identificação da Conta (id), o idPessoa do Portador e o idTipoPlastico do Cartão que deverá ser gerado para impressão. Esta funcionalidade poderá ser utilizada para impressão de cartões em gráfica."
  [id cartao-embossing-request ]
  (:data (gerar-cartao-embossing-using-post-with-http-info id cartao-embossing-request)))

(defn gerar-cartao-provisorio-using-post-with-http-info
  "Realiza a geração de um cartão provisorio
  Este recurso permite que seja gerado um cartão provisório para um determinado Portador que esteja vinculado a uma Conta. Para isso, será preciso informar o código de identificação da Conta (id)."
  [id ]
  (call-api "/api/contas/{id}/gerar-cartao-provisorio" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-cartao-provisorio-using-post
  "Realiza a geração de um cartão provisorio
  Este recurso permite que seja gerado um cartão provisório para um determinado Portador que esteja vinculado a uma Conta. Para isso, será preciso informar o código de identificação da Conta (id)."
  [id ]
  (:data (gerar-cartao-provisorio-using-post-with-http-info id)))

(defn gerar-cartao-using-post-with-http-info
  "Realiza a geração de um novo cartão para impressão avulsa
  Este recurso permite que seja gerado um novo Cartão para um determinado Portador que esteja vinculado a uma Conta. Para isso, será preciso informar o código de identificação da Conta (id), o idPessoa do Portador e o idTipoPlastico do Cartão que deverá ser gerado para impressão. Esta funcionalidade poderá ser utilizada para realizar a impressão de cartões em Lojas, Quiosques, Escritórios, Terminais de Auto Atendimento, ou outro local que o Emissor escolher, desde que se possua uma impressora de Cartões habilidade para o fazer, no local."
  ([id id-pessoa ] (gerar-cartao-using-post-with-http-info id id-pessoa nil))
  ([id id-pessoa {:keys [id-tipo-plastico ]}]
   (call-api "/api/contas/{id}/pessoas/{id_pessoa}/gerar-cartao" :post
             {:path-params   {"id" id "id_pessoa" id-pessoa }
              :header-params {}
              :query-params  {"id_tipo_plastico" id-tipo-plastico }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn gerar-cartao-using-post
  "Realiza a geração de um novo cartão para impressão avulsa
  Este recurso permite que seja gerado um novo Cartão para um determinado Portador que esteja vinculado a uma Conta. Para isso, será preciso informar o código de identificação da Conta (id), o idPessoa do Portador e o idTipoPlastico do Cartão que deverá ser gerado para impressão. Esta funcionalidade poderá ser utilizada para realizar a impressão de cartões em Lojas, Quiosques, Escritórios, Terminais de Auto Atendimento, ou outro local que o Emissor escolher, desde que se possua uma impressora de Cartões habilidade para o fazer, no local."
  ([id id-pessoa ] (gerar-cartao-using-post id id-pessoa nil))
  ([id id-pessoa optional-params]
   (:data (gerar-cartao-using-post-with-http-info id id-pessoa optional-params))))

(defn gerar-cartao-virtual-using-post-with-http-info
  "Realiza a geração de um cartão virtual
  Este recurso permite que seja gerado um Cartão virtual para um determinado Portador que esteja vinculado a uma Conta. Para isso, será preciso informar o código de identificação da Conta (id). Esta funcionalidade poderá ser utilizada para realizar a criação de cartões virtuaes atraves de um app."
  [id data-validade ]
  (call-api "/api/contas/{id}/gerar-cartao-virtual" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"dataValidade" data-validade }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-cartao-virtual-using-post
  "Realiza a geração de um cartão virtual
  Este recurso permite que seja gerado um Cartão virtual para um determinado Portador que esteja vinculado a uma Conta. Para isso, será preciso informar o código de identificação da Conta (id). Esta funcionalidade poderá ser utilizada para realizar a criação de cartões virtuaes atraves de um app."
  [id data-validade ]
  (:data (gerar-cartao-virtual-using-post-with-http-info id data-validade)))

(defn listar-historico-alteracoes-limites-using-get-with-http-info
  "Lista o histórico de alterações de limites da conta
  Este recurso consulta o histórico com as alterações de limites da conta informada"
  ([id ] (listar-historico-alteracoes-limites-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/historicos-alteracoes-limites" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-historico-alteracoes-limites-using-get
  "Lista o histórico de alterações de limites da conta
  Este recurso consulta o histórico com as alterações de limites da conta informada"
  ([id ] (listar-historico-alteracoes-limites-using-get id nil))
  ([id optional-params]
   (:data (listar-historico-alteracoes-limites-using-get-with-http-info id optional-params))))

(defn listar-historico-assessoria-using-get-with-http-info
  "Lista o histórico de entradas/saídas de assessorias de cobrança
  Permite listar todos os registros de entrada e saída da Conta em arquivos de integração com empresas de assessorias de cobrança a partir do código de identificação da conta (idConta)."
  ([id ] (listar-historico-assessoria-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/historicos-assessorias-cobranca" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-historico-assessoria-using-get
  "Lista o histórico de entradas/saídas de assessorias de cobrança
  Permite listar todos os registros de entrada e saída da Conta em arquivos de integração com empresas de assessorias de cobrança a partir do código de identificação da conta (idConta)."
  ([id ] (listar-historico-assessoria-using-get id nil))
  ([id optional-params]
   (:data (listar-historico-assessoria-using-get-with-http-info id optional-params))))

(defn listar-historico-atrasos-faturas-using-get-with-http-info
  "Lista o historico de atrasos das faturas
  Este recurso lista o histórico do pagamento de faturas em atraso"
  ([id ] (listar-historico-atrasos-faturas-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/historicos-faturas-atrasos" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-historico-atrasos-faturas-using-get
  "Lista o historico de atrasos das faturas
  Este recurso lista o histórico do pagamento de faturas em atraso"
  ([id ] (listar-historico-atrasos-faturas-using-get id nil))
  ([id optional-params]
   (:data (listar-historico-atrasos-faturas-using-get-with-http-info id optional-params))))

(defn listar-nao-processadas-using-get-with-http-info
  "Lista as transações não processadas da conta
  Este método permite que sejam listadas todas as transações não processadas da Conta."
  ([id ] (listar-nao-processadas-using-get-with-http-info id nil))
  ([id {:keys [sort page limit data-inicio data-fim ]}]
   (call-api "/api/contas/{id}/transacoes/listar-nao-processadas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataInicio" data-inicio "dataFim" data-fim }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-nao-processadas-using-get
  "Lista as transações não processadas da conta
  Este método permite que sejam listadas todas as transações não processadas da Conta."
  ([id ] (listar-nao-processadas-using-get id nil))
  ([id optional-params]
   (:data (listar-nao-processadas-using-get-with-http-info id optional-params))))

(defn listar-processadas-using-get-with-http-info
  "Lista as transações processadas da conta
  Este método permite que sejam listadas todas as transações processadas da Conta."
  ([id ] (listar-processadas-using-get-with-http-info id nil))
  ([id {:keys [sort page limit data-vencimento data-inicio data-fim ]}]
   (call-api "/api/contas/{id}/transacoes/listar-processadas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimento" data-vencimento "dataInicio" data-inicio "dataFim" data-fim }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-processadas-using-get
  "Lista as transações processadas da conta
  Este método permite que sejam listadas todas as transações processadas da Conta."
  ([id ] (listar-processadas-using-get id nil))
  ([id optional-params]
   (:data (listar-processadas-using-get-with-http-info id optional-params))))

(defn listar-using-get17-with-http-info
  "Lista contas existentes na base de dados do Emissor
  Este recurso permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get17-with-http-info nil))
  ([{:keys [sort page limit id-produto id-origem-comercial id-pessoa id-status-conta dia-vencimento melhor-dia-compra data-status-conta data-cadastro data-ultima-alteracao-vencimento ]}]
   (call-api "/api/contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idProduto" id-produto "idOrigemComercial" id-origem-comercial "idPessoa" id-pessoa "idStatusConta" id-status-conta "diaVencimento" dia-vencimento "melhorDiaCompra" melhor-dia-compra "dataStatusConta" data-status-conta "dataCadastro" data-cadastro "dataUltimaAlteracaoVencimento" data-ultima-alteracao-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get17
  "Lista contas existentes na base de dados do Emissor
  Este recurso permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get17 nil))
  ([optional-params]
   (:data (listar-using-get17-with-http-info optional-params))))

(defn listar-using-get50-with-http-info
  "Lista as transferências realizadas pela conta
  Este método permite que sejam listadas as transferências realizadas pela conta existentes na base do emissor."
  ([id ] (listar-using-get50-with-http-info id nil))
  ([id {:keys [sort page limit id-transferencia id-conta-origem id-conta-destino valor-transferencia data-transferencia ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-cartoes" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTransferencia" id-transferencia "idContaOrigem" id-conta-origem "idContaDestino" id-conta-destino "valorTransferencia" valor-transferencia "dataTransferencia" data-transferencia }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get50
  "Lista as transferências realizadas pela conta
  Este método permite que sejam listadas as transferências realizadas pela conta existentes na base do emissor."
  ([id ] (listar-using-get50 id nil))
  ([id optional-params]
   (:data (listar-using-get50-with-http-info id optional-params))))

(defn reativar-using-post1-with-http-info
  "Realiza a reativação de contas.
  Este recurso permite reativar contas. Para isso, será preciso informar o código de identificação da Conta (id)."
  [id ]
  (call-api "/api/contas/{id}/reativar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn reativar-using-post1
  "Realiza a reativação de contas.
  Este recurso permite reativar contas. Para isso, será preciso informar o código de identificação da Conta (id)."
  [id ]
  (:data (reativar-using-post1-with-http-info id)))

(defn simular-emprestimo-financiamento-using-post-with-http-info
  "Simula valores de prestações de empréstimos/financiamentos
  Esta operação pode ser utilizada para simular operações financeiras a partir de informações fornecidas pelo usuário. Os cálculos gerados devem ser considerados apenas como referência para as situações reais e não como valores oficiais."
  [id request ]
  (call-api "/api/contas/{id}/simular-emprestimos-financiamentos" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn simular-emprestimo-financiamento-using-post
  "Simula valores de prestações de empréstimos/financiamentos
  Esta operação pode ser utilizada para simular operações financeiras a partir de informações fornecidas pelo usuário. Os cálculos gerados devem ser considerados apenas como referência para as situações reais e não como valores oficiais."
  [id request ]
  (:data (simular-emprestimo-financiamento-using-post-with-http-info id request)))

(defn transacoes-using-get-with-http-info
  "Permite listar uma linha do tempo com os eventos da conta
  Esta operação tem como objetivo permitir a listagem, em formato de timeline, dos eventos vinculados a uma detemrinada conta. Transações, fechamento da fatura, pagamentos, geração de cartões e alteração de limite são exemplos de eventos contemplados por esta funcionalidade. Neste método, as operações são ordenadas de forma decrescente."
  ([id ] (transacoes-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/timeline" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn transacoes-using-get
  "Permite listar uma linha do tempo com os eventos da conta
  Esta operação tem como objetivo permitir a listagem, em formato de timeline, dos eventos vinculados a uma detemrinada conta. Transações, fechamento da fatura, pagamentos, geração de cartões e alteração de limite são exemplos de eventos contemplados por esta funcionalidade. Neste método, as operações são ordenadas de forma decrescente."
  ([id ] (transacoes-using-get id nil))
  ([id optional-params]
   (:data (transacoes-using-get-with-http-info id optional-params))))

(defn transferir-using-post1-with-http-info
  "Realiza uma transferência de Crédito para outro cliente do mesmo Emissor
  Este método permite que um portador de um cartão possa realizar auma transferência de crédito para outro cliente do mesmo emissor."
  [id id-conta-destino valor-transferencia ]
  (call-api "/api/contas/{id}/transferencias-creditos-cartoes" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_conta_destino" id-conta-destino "valor_transferencia" valor-transferencia }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transferir-using-post1
  "Realiza uma transferência de Crédito para outro cliente do mesmo Emissor
  Este método permite que um portador de um cartão possa realizar auma transferência de crédito para outro cliente do mesmo emissor."
  [id id-conta-destino valor-transferencia ]
  (:data (transferir-using-post1-with-http-info id id-conta-destino valor-transferencia)))
