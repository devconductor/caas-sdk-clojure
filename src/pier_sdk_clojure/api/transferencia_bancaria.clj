(ns pier-sdk-clojure.api.transferencia-bancaria
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-using-put1-with-http-info
  "Atualiza conta bancária portador
  Esse recurso permite atualizar uma conta bancária do portador."
  [id update ]
  (call-api "/api/contas-bancarias-portador/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put1
  "Atualiza conta bancária portador
  Esse recurso permite atualizar uma conta bancária do portador."
  [id update ]
  (:data (atualizar-using-put1-with-http-info id update)))

(defn cancelar-transferencia-credito-conta-bancaria-using-post-with-http-info
  "Realizar o cancelamento de uma transferência bancária do cartão para contas bancárias que esteja pendente de confirmação.
  Este recurso tem como objetivo permitir o canelamento de uma transferência de crédito entre contas."
  [id-transferencia ]
  (call-api "/api/transferencias-creditos-contas-bancarias/{idTransferencia}/cancelar" :post
            {:path-params   {"idTransferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cancelar-transferencia-credito-conta-bancaria-using-post
  "Realizar o cancelamento de uma transferência bancária do cartão para contas bancárias que esteja pendente de confirmação.
  Este recurso tem como objetivo permitir o canelamento de uma transferência de crédito entre contas."
  [id-transferencia ]
  (:data (cancelar-transferencia-credito-conta-bancaria-using-post-with-http-info id-transferencia)))

(defn confirmar-transferencia-credito-conta-bancaria-using-post-with-http-info
  "Realizar a confirmação de uma transferência bancária do cartão para contas bancárias que esteja pendente de confirmação.
  Este recurso tem como objetivo permitir a confirmação da transferência de crédito entre contas."
  [id-transferencia ]
  (call-api "/api/transferencias-creditos-contas-bancarias/{idTransferencia}/confirmar" :post
            {:path-params   {"idTransferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn confirmar-transferencia-credito-conta-bancaria-using-post
  "Realizar a confirmação de uma transferência bancária do cartão para contas bancárias que esteja pendente de confirmação.
  Este recurso tem como objetivo permitir a confirmação da transferência de crédito entre contas."
  [id-transferencia ]
  (:data (confirmar-transferencia-credito-conta-bancaria-using-post-with-http-info id-transferencia)))

(defn consultar-transferencia-bancaria-using-get-with-http-info
  "Realiza a consulta de uma transferência bancária de crédito entre contas bancárias de um portador
  Recurso utilizado para recuperar uma transferência de crédito entre contas bancária de um portador, utiliza o ID da transferência bancáriae o idConta para realizar a consulta."
  [id-transferencia ]
  (call-api "/api/transferencias-creditos-contas-bancarias/{idTransferencia}" :get
            {:path-params   {"idTransferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-transferencia-bancaria-using-get
  "Realiza a consulta de uma transferência bancária de crédito entre contas bancárias de um portador
  Recurso utilizado para recuperar uma transferência de crédito entre contas bancária de um portador, utiliza o ID da transferência bancáriae o idConta para realizar a consulta."
  [id-transferencia ]
  (:data (consultar-transferencia-bancaria-using-get-with-http-info id-transferencia)))

(defn consultar-using-get12-with-http-info
  "Consulta conta bancária portador
  Esse recurso permite consultar uma conta bancária do portador a partir do seu código de identificação (id)."
  [id ]
  (call-api "/api/contas-bancarias-portador/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get12
  "Consulta conta bancária portador
  Esse recurso permite consultar uma conta bancária do portador a partir do seu código de identificação (id)."
  [id ]
  (:data (consultar-using-get12-with-http-info id)))

(defn consultar-using-get41-with-http-info
  "Consultar uma transferência bancária para um banco
  Este recurso permite consultar os detalhes de uma determinada transferência de crédito realizada para uma conta bancária. De modo geral, esta operação poderá ser utilizada para uma consulta simples destes detalhes ou para realizar a montagem de um comprovante de 2ª via de transferência entre contas."
  ([id id-transferencia ] (consultar-using-get41-with-http-info id id-transferencia nil))
  ([id id-transferencia {:keys [id-conta-bancaria-destino ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias/{id_transferencia}" :get
             {:path-params   {"id" id "id_transferencia" id-transferencia }
              :header-params {}
              :query-params  {"id_conta_bancaria_destino" id-conta-bancaria-destino }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get41
  "Consultar uma transferência bancária para um banco
  Este recurso permite consultar os detalhes de uma determinada transferência de crédito realizada para uma conta bancária. De modo geral, esta operação poderá ser utilizada para uma consulta simples destes detalhes ou para realizar a montagem de um comprovante de 2ª via de transferência entre contas."
  ([id id-transferencia ] (consultar-using-get41 id id-transferencia nil))
  ([id id-transferencia optional-params]
   (:data (consultar-using-get41-with-http-info id id-transferencia optional-params))))

(defn listar-transferencia-bancaria-using-get-with-http-info
  "Realiza a listagem das transferências bancárias de crédito entre contas bancárias
  Recurso utilizado para listar as transferência de crédito entre contas bancária de um portador solicitadas."
  ([] (listar-transferencia-bancaria-using-get-with-http-info nil))
  ([{:keys [sort page limit id-conta data-solicitacao-inicial data-solicitacao-final status ]}]
   (call-api "/api/transferencias-creditos-contas-bancarias" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "dataSolicitacaoInicial" data-solicitacao-inicial "dataSolicitacaoFinal" data-solicitacao-final "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-transferencia-bancaria-using-get
  "Realiza a listagem das transferências bancárias de crédito entre contas bancárias
  Recurso utilizado para listar as transferência de crédito entre contas bancária de um portador solicitadas."
  ([] (listar-transferencia-bancaria-using-get nil))
  ([optional-params]
   (:data (listar-transferencia-bancaria-using-get-with-http-info optional-params))))

(defn listar-using-get15-with-http-info
  "Lista contas bancárias portador
  Esse recurso permite listar contas bancárias do portador."
  ([] (listar-using-get15-with-http-info nil))
  ([{:keys [id-conta nome-agencia numero-agencia numero-conta flag-conta-origem-doc id-pessoa-fisica favorecido numero-receira-federal sort page limit ]}]
   (call-api "/api/contas-bancarias-portador" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "nomeAgencia" nome-agencia "numeroAgencia" numero-agencia "numeroConta" numero-conta "flagContaOrigemDoc" flag-conta-origem-doc "idPessoaFisica" id-pessoa-fisica "favorecido" favorecido "numeroReceiraFederal" numero-receira-federal "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get15
  "Lista contas bancárias portador
  Esse recurso permite listar contas bancárias do portador."
  ([] (listar-using-get15 nil))
  ([optional-params]
   (:data (listar-using-get15-with-http-info optional-params))))

(defn listar-using-get49-with-http-info
  "Listar as transferências bancárias realizadas
  Este recurso tem como objetivo permitir que o portador de um Cartão possa consultar uma lista das Transferências Bancárias para os Favorecidos cadastrados."
  ([id ] (listar-using-get49-with-http-info id nil))
  ([id {:keys [id-conta-bancaria-destino sort page limit ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"id_conta_bancaria_destino" id-conta-bancaria-destino "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get49
  "Listar as transferências bancárias realizadas
  Este recurso tem como objetivo permitir que o portador de um Cartão possa consultar uma lista das Transferências Bancárias para os Favorecidos cadastrados."
  ([id ] (listar-using-get49 id nil))
  ([id optional-params]
   (:data (listar-using-get49-with-http-info id optional-params))))

(defn salvar-using-post8-with-http-info
  "Cadastra uma conta bancária do portador
  Esse recurso permite cadastrar contas bancárias do portador."
  [persist ]
  (call-api "/api/contas-bancarias-portador" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post8
  "Cadastra uma conta bancária do portador
  Esse recurso permite cadastrar contas bancárias do portador."
  [persist ]
  (:data (salvar-using-post8-with-http-info persist)))

(defn simular-transferencia-bancaria-using-post-with-http-info
  "Realiza a simulação dos planos de parcelamentos para uma transferência bancária de crédito entre contas bancárias
  Realiza a simulação dos planos de parcelamentos para uma transferência bancária de crédito entre contas bancárias."
  [request ]
  (call-api "/api/simular-transferencias-creditos-contas-bancarias" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn simular-transferencia-bancaria-using-post
  "Realiza a simulação dos planos de parcelamentos para uma transferência bancária de crédito entre contas bancárias
  Realiza a simulação dos planos de parcelamentos para uma transferência bancária de crédito entre contas bancárias."
  [request ]
  (:data (simular-transferencia-bancaria-using-post-with-http-info request)))

(defn transferencia-credito-conta-bancaria-using-post-with-http-info
  "Realizar transferência bancária do cartão para contas bancárias
  Este recurso tem como objetivo permitir que o portador de um cartão possa realizar a transferência de crédito para uma conta bancária. Assim, o valor do crédito somado a tarifa para transferência, quando praticada pelo emissor, será debitado da conta de origem, se houver saldo suficiente, e será creditado na conta bancária de destino."
  [persist ]
  (call-api "/api/transferencias-creditos-contas-bancarias" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transferencia-credito-conta-bancaria-using-post
  "Realizar transferência bancária do cartão para contas bancárias
  Este recurso tem como objetivo permitir que o portador de um cartão possa realizar a transferência de crédito para uma conta bancária. Assim, o valor do crédito somado a tarifa para transferência, quando praticada pelo emissor, será debitado da conta de origem, se houver saldo suficiente, e será creditado na conta bancária de destino."
  [persist ]
  (:data (transferencia-credito-conta-bancaria-using-post-with-http-info persist)))

(defn transferir-using-post-with-http-info
  "Realizar transferência bancária do cartão para contas bancárias
  Este recurso tem como objetivo permitir que o portador de um cartão possa realizar a transferência de crédito para uma conta bancária. Assim, o valor do crédito somado a tarifa para transferência, quando praticada pelo emissor, será debitado da conta de origem, se houver saldo suficiente, e será creditado na conta bancária de destino."
  [id transferencia-bancaria-persist ]
  (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    transferencia-bancaria-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transferir-using-post
  "Realizar transferência bancária do cartão para contas bancárias
  Este recurso tem como objetivo permitir que o portador de um cartão possa realizar a transferência de crédito para uma conta bancária. Assim, o valor do crédito somado a tarifa para transferência, quando praticada pelo emissor, será debitado da conta de origem, se houver saldo suficiente, e será creditado na conta bancária de destino."
  [id transferencia-bancaria-persist ]
  (:data (transferir-using-post-with-http-info id transferencia-bancaria-persist)))
