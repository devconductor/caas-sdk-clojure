(ns pier-sdk-clojure.api.cartao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-alterar-senha-using-put-with-http-info
  "Realiza a alteração da senha de um Cartão
  Esta operação tem como objetivo permitir que o portador de um determinado cartão possa definir uma senha a sua escolha."
  [id senha ]
  (call-api "/api/cartoes/{id}/alterar-senha" :put
            {:path-params   {"id" id }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-alterar-senha-using-put
  "Realiza a alteração da senha de um Cartão
  Esta operação tem como objetivo permitir que o portador de um determinado cartão possa definir uma senha a sua escolha."
  [id senha ]
  (:data (alterar-alterar-senha-using-put-with-http-info id senha)))

(defn alterar-status-impressao-using-put-with-http-info
  "Realiza a alteração do Status de Impressão do Cartão
  Este método permite que uma Aplicação que realize a impressão de cartões possa indicar que um determinado idCartao fora impresso ou está em processo de impressão. Para isso, basta informar o respectivo código de identificação do cartão (id) que deseja ter seu um determinado id_status_impressao atribuído a ele. Por padrão, cartões provisórios ou que já tenham sido incluídos em um arquivo para impressão via gráfica terão esta requisição negada, se utilizada."
  [id id-status-impressao ]
  (call-api "/api/cartoes/{id}/alterar-status-impressao" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_status_impressao" id-status-impressao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-status-impressao-using-put
  "Realiza a alteração do Status de Impressão do Cartão
  Este método permite que uma Aplicação que realize a impressão de cartões possa indicar que um determinado idCartao fora impresso ou está em processo de impressão. Para isso, basta informar o respectivo código de identificação do cartão (id) que deseja ter seu um determinado id_status_impressao atribuído a ele. Por padrão, cartões provisórios ou que já tenham sido incluídos em um arquivo para impressão via gráfica terão esta requisição negada, se utilizada."
  [id id-status-impressao ]
  (:data (alterar-status-impressao-using-put-with-http-info id id-status-impressao)))

(defn atribuir-pessoa-using-put-with-http-info
  "Realiza a atribuição de um cartão pré-pago a uma pessoa
  Esta método permite que um cartão pré-pago impresso de forma avulsa e anônimo seja atribuído a uma pessoa para que esta passe a ser a portadora titular dele."
  [id id-pessoa ]
  (call-api "/api/cartoes/{id}/atribuir-titular" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_pessoa" id-pessoa }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atribuir-pessoa-using-put
  "Realiza a atribuição de um cartão pré-pago a uma pessoa
  Esta método permite que um cartão pré-pago impresso de forma avulsa e anônimo seja atribuído a uma pessoa para que esta passe a ser a portadora titular dele."
  [id id-pessoa ]
  (:data (atribuir-pessoa-using-put-with-http-info id id-pessoa)))

(defn bloquear-using-post-with-http-info
  "Realiza o bloqueio de um determinado Cartão
  Este método permite a realização do bloqueio (temporário) ou do cancelamento (definitivo) de um determinado cartão a partir do seu código de identificação (id). Para isso, é preciso informar qual o motivo deste bloqueio que nada mais é do que atribuir um novo StatusCartao para ele dentre as opções praticadas pelo emissor."
  [id id-status observacao ]
  (call-api "/api/cartoes/{id}/bloquear" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_status" id-status "observacao" observacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn bloquear-using-post
  "Realiza o bloqueio de um determinado Cartão
  Este método permite a realização do bloqueio (temporário) ou do cancelamento (definitivo) de um determinado cartão a partir do seu código de identificação (id). Para isso, é preciso informar qual o motivo deste bloqueio que nada mais é do que atribuir um novo StatusCartao para ele dentre as opções praticadas pelo emissor."
  [id id-status observacao ]
  (:data (bloquear-using-post-with-http-info id id-status observacao)))

(defn cadastrar-alterar-senha-using-post-with-http-info
  "Realiza o cadastro da senha de um Cartão
  Esta operação tem como objetivo permitir que o portador de um determinado cartão possa definir uma senha a sua escolha."
  [id senha ]
  (call-api "/api/cartoes/{id}/cadastrar-senha" :post
            {:path-params   {"id" id }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-alterar-senha-using-post
  "Realiza o cadastro da senha de um Cartão
  Esta operação tem como objetivo permitir que o portador de um determinado cartão possa definir uma senha a sua escolha."
  [id senha ]
  (:data (cadastrar-alterar-senha-using-post-with-http-info id senha)))

(defn cancelar-using-post-with-http-info
  "Realiza o cancelamento de um determinado Cartão
  Este método permite a realização cancelamento de um determinado cartão a partir do seu código de identificação (id). Para isso, é preciso informar qual o motivo deste bloqueio que nada mais é do que atribuir um novo StatusCartao para ele dentre as opções praticadas pelo emissor."
  [id id-status observacao ]
  (call-api "/api/cartoes/{id}/cancelar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_status" id-status "observacao" observacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cancelar-using-post
  "Realiza o cancelamento de um determinado Cartão
  Este método permite a realização cancelamento de um determinado cartão a partir do seu código de identificação (id). Para isso, é preciso informar qual o motivo deste bloqueio que nada mais é do que atribuir um novo StatusCartao para ele dentre as opções praticadas pelo emissor."
  [id id-status observacao ]
  (:data (cancelar-using-post-with-http-info id id-status observacao)))

(defn consultar-cartao-impressao-using-get-with-http-info
  "Consultar os dados de impressão de um Cartão
  Esse recurso permite consultar os dados de impressão de um cartão"
  [id ]
  (call-api "/api/cartoes/{id}/consultar-dados-impressao" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-cartao-impressao-using-get
  "Consultar os dados de impressão de um Cartão
  Esse recurso permite consultar os dados de impressão de um cartão"
  [id ]
  (:data (consultar-cartao-impressao-using-get-with-http-info id)))

(defn consultar-dados-reais-cartao-using-get-with-http-info
  "Consultar Detalhes do Cartão
  Este método permite que seja consultado os dados necessarios de um cartão para executar serviços de autorização."
  [id ]
  (call-api "/api/cartoes/{id}/consultar-dados-reais" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-dados-reais-cartao-using-get
  "Consultar Detalhes do Cartão
  Este método permite que seja consultado os dados necessarios de um cartão para executar serviços de autorização."
  [id ]
  (:data (consultar-dados-reais-cartao-using-get-with-http-info id)))

(defn consultar-limite-disponibilidade-using-get-with-http-info
  "Apresenta os limites do Portador do Cartão
  Este método permite consultar os Limites configurados para o Portador de um determinado Cartão, seja ele o titular da conta ou um adicional, a partir do código de identificação do Cartão (id)."
  [id ]
  (call-api "/api/cartoes/{id}/limites-disponibilidades" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-limite-disponibilidade-using-get
  "Apresenta os limites do Portador do Cartão
  Este método permite consultar os Limites configurados para o Portador de um determinado Cartão, seja ele o titular da conta ou um adicional, a partir do código de identificação do Cartão (id)."
  [id ]
  (:data (consultar-limite-disponibilidade-using-get-with-http-info id)))

(defn consultar-lotes-cartoes-pre-pagos-using-get-with-http-info
  "Permite consultar um determinado Lote de Cartões Pré-Pago
  Este método permite consultar os cartões pré-pagos existentes na base do emissor através do id do lote."
  [id ]
  (call-api "/api/cartoes/lotes-cartoes-pre-pagos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-lotes-cartoes-pre-pagos-using-get
  "Permite consultar um determinado Lote de Cartões Pré-Pago
  Este método permite consultar os cartões pré-pagos existentes na base do emissor através do id do lote."
  [id ]
  (:data (consultar-lotes-cartoes-pre-pagos-using-get-with-http-info id)))

(defn consultar-portador-using-get-with-http-info
  "Apresenta os dados do Portador do Cartão
  Este método permite consultar as informações do Portador de um determinado Cartão a partir do código de identificação do Cartão (id)."
  [id ]
  (call-api "/api/cartoes/{id}/portadores" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-portador-using-get
  "Apresenta os dados do Portador do Cartão
  Este método permite consultar as informações do Portador de um determinado Cartão a partir do código de identificação do Cartão (id)."
  [id ]
  (:data (consultar-portador-using-get-with-http-info id)))

(defn consultar-using-get9-with-http-info
  "Apresenta os dados de um determinado Cartão
  Este método permite consultar as informações básicas de um determinado Cartão a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/cartoes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get9
  "Apresenta os dados de um determinado Cartão
  Este método permite consultar as informações básicas de um determinado Cartão a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get9-with-http-info id)))

(defn desbloquear-senha-incorreta-using-post-with-http-info
  "Realiza o desbloqueio de um cartão bloqueado por tentativas de senha incorretas
  Este método permite que seja desbloqueado um determinado cartão que foi bloqueado por tentativas de senha incorretas, a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/cartoes/{id}/desbloquear-senha-incorreta" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desbloquear-senha-incorreta-using-post
  "Realiza o desbloqueio de um cartão bloqueado por tentativas de senha incorretas
  Este método permite que seja desbloqueado um determinado cartão que foi bloqueado por tentativas de senha incorretas, a partir do seu código de identificação (id)."
  [id ]
  (:data (desbloquear-senha-incorreta-using-post-with-http-info id)))

(defn desbloquear-using-post-with-http-info
  "Realiza o desbloqueio de um determinado Cartão
  Este método permite que seja desbloqueado um determinado cartão a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/cartoes/{id}/desbloquear" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desbloquear-using-post
  "Realiza o desbloqueio de um determinado Cartão
  Este método permite que seja desbloqueado um determinado cartão a partir do seu código de identificação (id)."
  [id ]
  (:data (desbloquear-using-post-with-http-info id)))

(defn gerar-lotes-cartoes-pre-pagos-using-post-with-http-info
  "Permite gerar um novo Lote de Cartões Pré-Pago
  Esta operação tem como objetivo permitir que os Emissores gerem uma determinada quantidade de Cartões Pré-Pagos, de forma não nominal, os quais poderão ser comercializados e posteriormente vinculados a um cliente que o adquirir. Para isso, além de definir quantos cartões deverão ser gerados, será possível definir qual a Origem Comercial, o Produto, o Tipo do Cartão, a Imagem e o Endereço para entrega dos Cartões presentes no lote gerado. Por padrão, todos os cartões serão associados a um idPessoa fictício e receberá um idConta único para cada um deles. Feito isso, os Cartões gerados por esta operação seguirão os mesmos processos de impressão via gráfica previamente definidos entre o Emissor e a Conductor."
  ([] (gerar-lotes-cartoes-pre-pagos-using-post-with-http-info nil))
  ([{:keys [id-origem-comercial id-produto id-tipo-cartao id-imagem id-endereco quantidade-cartoes identificador-externo ]}]
   (call-api "/api/cartoes/lotes-cartoes-pre-pagos" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idOrigemComercial" id-origem-comercial "idProduto" id-produto "idTipoCartao" id-tipo-cartao "idImagem" id-imagem "idEndereco" id-endereco "quantidadeCartoes" quantidade-cartoes "identificadorExterno" identificador-externo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn gerar-lotes-cartoes-pre-pagos-using-post
  "Permite gerar um novo Lote de Cartões Pré-Pago
  Esta operação tem como objetivo permitir que os Emissores gerem uma determinada quantidade de Cartões Pré-Pagos, de forma não nominal, os quais poderão ser comercializados e posteriormente vinculados a um cliente que o adquirir. Para isso, além de definir quantos cartões deverão ser gerados, será possível definir qual a Origem Comercial, o Produto, o Tipo do Cartão, a Imagem e o Endereço para entrega dos Cartões presentes no lote gerado. Por padrão, todos os cartões serão associados a um idPessoa fictício e receberá um idConta único para cada um deles. Feito isso, os Cartões gerados por esta operação seguirão os mesmos processos de impressão via gráfica previamente definidos entre o Emissor e a Conductor."
  ([] (gerar-lotes-cartoes-pre-pagos-using-post nil))
  ([optional-params]
   (:data (gerar-lotes-cartoes-pre-pagos-using-post-with-http-info optional-params))))

(defn gerar-nova-via-using-post-with-http-info
  "Gerar uma nova via de Cartão
  Esta operação tem como objetivo permitir que os Emissores ou seus clientes possam solicitar a geração de uma nova via de Cartão que será encaminhando para impressão e postagem de acordo com os fluxos padrões já definidos pelo emissor. Para isso, é preciso que o cliente já possua um cartão gerado e informar o Código de Identificação deste (idCartao) para que ele possa utilizar esta operação. Assim, esta funcionalidade se aplica apenas para a geração de cartões físicos."
  [id ]
  (call-api "/api/cartoes/{id}/gerar-nova-via" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-nova-via-using-post
  "Gerar uma nova via de Cartão
  Esta operação tem como objetivo permitir que os Emissores ou seus clientes possam solicitar a geração de uma nova via de Cartão que será encaminhando para impressão e postagem de acordo com os fluxos padrões já definidos pelo emissor. Para isso, é preciso que o cliente já possua um cartão gerado e informar o Código de Identificação deste (idCartao) para que ele possa utilizar esta operação. Assim, esta funcionalidade se aplica apenas para a geração de cartões físicos."
  [id ]
  (:data (gerar-nova-via-using-post-with-http-info id)))

(defn lancar-tarifa-segunda-via-using-post-with-http-info
  "Adiciona tarifa de ajuste da segunda via do cartão
  Esse recurso permite adicionar tarífa de ajuste pela emissão da segunda via do cartão."
  [id ]
  (call-api "/api/cartoes/{id}/lancar-tarifa-reemissao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn lancar-tarifa-segunda-via-using-post
  "Adiciona tarifa de ajuste da segunda via do cartão
  Esse recurso permite adicionar tarífa de ajuste pela emissão da segunda via do cartão."
  [id ]
  (:data (lancar-tarifa-segunda-via-using-post-with-http-info id)))

(defn listar-lotes-cartoes-pre-pagos-using-get-with-http-info
  "Permite listar os Lotes de Cartões Pré-Pago
  Este método permite que sejam listados os cartões pré-pagos existentes na base do emissor."
  ([] (listar-lotes-cartoes-pre-pagos-using-get-with-http-info nil))
  ([{:keys [sort page limit id-origem-comercial id-produto id-tipo-cartao id-imagem id-endereco quantidade-cartoes data-cadastro usuario-cadastro status-processamento identificador-externo ]}]
   (call-api "/api/cartoes/lotes-cartoes-pre-pagos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idOrigemComercial" id-origem-comercial "idProduto" id-produto "idTipoCartao" id-tipo-cartao "idImagem" id-imagem "idEndereco" id-endereco "quantidadeCartoes" quantidade-cartoes "dataCadastro" data-cadastro "usuarioCadastro" usuario-cadastro "statusProcessamento" status-processamento "identificadorExterno" identificador-externo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-lotes-cartoes-pre-pagos-using-get
  "Permite listar os Lotes de Cartões Pré-Pago
  Este método permite que sejam listados os cartões pré-pagos existentes na base do emissor."
  ([] (listar-lotes-cartoes-pre-pagos-using-get nil))
  ([optional-params]
   (:data (listar-lotes-cartoes-pre-pagos-using-get-with-http-info optional-params))))

(defn listar-using-get11-with-http-info
  "Lista os Cartões gerados pelo Emissor
  Este método permite que sejam listados os cartões existentes na base do emissor."
  ([] (listar-using-get11-with-http-info nil))
  ([{:keys [sort page limit id-status-cartao id-estagio-cartao id-conta id-pessoa id-produto tipo-portador numero-cartao nome-impresso data-geracao data-status-cartao data-estagio-cartao data-validade data-impressao arquivo-impressao flag-impressao-origem-comercial flag-provisorio codigo-desbloqueio sequencial-cartao ]}]
   (call-api "/api/cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idStatusCartao" id-status-cartao "idEstagioCartao" id-estagio-cartao "idConta" id-conta "idPessoa" id-pessoa "idProduto" id-produto "tipoPortador" tipo-portador "numeroCartao" numero-cartao "nomeImpresso" nome-impresso "dataGeracao" data-geracao "dataStatusCartao" data-status-cartao "dataEstagioCartao" data-estagio-cartao "dataValidade" data-validade "dataImpressao" data-impressao "arquivoImpressao" arquivo-impressao "flagImpressaoOrigemComercial" flag-impressao-origem-comercial "flagProvisorio" flag-provisorio "codigoDesbloqueio" codigo-desbloqueio "sequencialCartao" sequencial-cartao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get11
  "Lista os Cartões gerados pelo Emissor
  Este método permite que sejam listados os cartões existentes na base do emissor."
  ([] (listar-using-get11 nil))
  ([optional-params]
   (:data (listar-using-get11-with-http-info optional-params))))

(defn reativar-using-post-with-http-info
  "Realiza a reativação de um determinado Cartão
  Este método permite a realização da reativação de um determinado cartão a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/cartoes/{id}/reativar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn reativar-using-post
  "Realiza a reativação de um determinado Cartão
  Este método permite a realização da reativação de um determinado cartão a partir do seu código de identificação (id)."
  [id ]
  (:data (reativar-using-post-with-http-info id)))

(defn validar-cvv-using-post-with-http-info
  "Validar CVV do cartão
  Esse recurso permite a validação do cvv de um cartão"
  [id valida-cvv ]
  (call-api "/api/cartoes/{id}/validar-cvv" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    valida-cvv
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-cvv-using-post
  "Validar CVV do cartão
  Esse recurso permite a validação do cvv de um cartão"
  [id valida-cvv ]
  (:data (validar-cvv-using-post-with-http-info id valida-cvv)))

(defn validar-dados-impressos-bandeirado-using-get-with-http-info
  "Permite validar os dados impressos em um cartão bandeirado
  Esta operação tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cartão a partir do envio dos dados sensíveis impressos nele. A utilização desde método tem diversas aplicações, sendo a principal delas a de Identificação Positiva do Cartão para a realização de transações e-commerce ou por meio de Centrais de Atendimento Eletrônico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (call-api "/api/cartoes/validar-dados-impressos-bandeirados" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"numero_cartao" numero-cartao "nome_portador" nome-portador "data_validade" data-validade "codigo_seguranca" codigo-seguranca }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-dados-impressos-bandeirado-using-get
  "Permite validar os dados impressos em um cartão bandeirado
  Esta operação tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cartão a partir do envio dos dados sensíveis impressos nele. A utilização desde método tem diversas aplicações, sendo a principal delas a de Identificação Positiva do Cartão para a realização de transações e-commerce ou por meio de Centrais de Atendimento Eletrônico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (:data (validar-dados-impressos-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca)))

(defn validar-dados-impressos-nao-bandeirado-using-get-with-http-info
  "Permite validar os dados impressos de um cartao não bandeirado
  Esta operação tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cartão a partir do envio dos dados sensíveis impressos nele. A utilização desde método tem diversas aplicações, sendo a principal delas a de Identificação Positiva do Cartão para a realização de transações e-commerce ou por meio de Centrais de Atendimento Eletrônico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (call-api "/api/cartoes/validar-dados-impressos-nao-bandeirados" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"numero_cartao" numero-cartao "nome_portador" nome-portador "data_validade" data-validade "codigo_seguranca" codigo-seguranca }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-dados-impressos-nao-bandeirado-using-get
  "Permite validar os dados impressos de um cartao não bandeirado
  Esta operação tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cartão a partir do envio dos dados sensíveis impressos nele. A utilização desde método tem diversas aplicações, sendo a principal delas a de Identificação Positiva do Cartão para a realização de transações e-commerce ou por meio de Centrais de Atendimento Eletrônico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (:data (validar-dados-impressos-nao-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca)))

(defn validar-de55-cartao-mastercard-using-get-with-http-info
  "Permite validar um Cartão com bandeira Mastercard a partir do de55
  Esta operação tem como objetivo permitir que os Emissores validem o DE55 gerado a partir da leitura de um chip EMV de um Cartão com bandeira Mastercard a fim de verificar a sua autenticidade. A utilização desde método tem diversas aplicações, sendo a principal delas a de Identificação Positiva do Cartão antes de permitir que o portador realize transações diversas, como as de compra e saque na modalidade débito em conta corrente, dentre outras."
  [numero-cartao criptograma ]
  (call-api "/api/cartoes/validar-de55-mastercard" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"numero_cartao" numero-cartao "criptograma" criptograma }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-de55-cartao-mastercard-using-get
  "Permite validar um Cartão com bandeira Mastercard a partir do de55
  Esta operação tem como objetivo permitir que os Emissores validem o DE55 gerado a partir da leitura de um chip EMV de um Cartão com bandeira Mastercard a fim de verificar a sua autenticidade. A utilização desde método tem diversas aplicações, sendo a principal delas a de Identificação Positiva do Cartão antes de permitir que o portador realize transações diversas, como as de compra e saque na modalidade débito em conta corrente, dentre outras."
  [numero-cartao criptograma ]
  (:data (validar-de55-cartao-mastercard-using-get-with-http-info numero-cartao criptograma)))

(defn validar-senha-using-get-with-http-info
  "Permite validar a senha de um Cartão
  Esta operação tem como objetivo permitir validar que a senha informada pelo portador de um determinado cartão está correta."
  [id senha ]
  (call-api "/api/cartoes/{id}/validar-senha" :get
            {:path-params   {"id" id }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-senha-using-get
  "Permite validar a senha de um Cartão
  Esta operação tem como objetivo permitir validar que a senha informada pelo portador de um determinado cartão está correta."
  [id senha ]
  (:data (validar-senha-using-get-with-http-info id senha)))

(defn validar-tarja-using-get-with-http-info
  "Permite validar um Cartão Bandeirado a partir da Tarja
  Esta operação tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cartão a partir da leitura da tarja magnética do mesmo. A utilização desde método tem diversas aplicações, sendo a principal delas a de Identificação Positiva do Cartão antes de permitir que o portador realize transações diversas, como as de compra e saque na modalidade débito em conta corrente, dentre outras."
  [numero-cartao trilha1 trilha2 ]
  (call-api "/api/cartoes/validar-tarja" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"numero_cartao" numero-cartao "trilha1" trilha1 "trilha2" trilha2 }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validar-tarja-using-get
  "Permite validar um Cartão Bandeirado a partir da Tarja
  Esta operação tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cartão a partir da leitura da tarja magnética do mesmo. A utilização desde método tem diversas aplicações, sendo a principal delas a de Identificação Positiva do Cartão antes de permitir que o portador realize transações diversas, como as de compra e saque na modalidade débito em conta corrente, dentre outras."
  [numero-cartao trilha1 trilha2 ]
  (:data (validar-tarja-using-get-with-http-info numero-cartao trilha1 trilha2)))
