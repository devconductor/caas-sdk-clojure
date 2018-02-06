(ns pier-sdk-clojure.api.transferencia-bancaria
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-using-put1-with-http-info
  "Atualiza conta bancÃ¡ria portador
  Esse recurso permite atualizar uma conta bancÃ¡ria do portador."
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
  "Atualiza conta bancÃ¡ria portador
  Esse recurso permite atualizar uma conta bancÃ¡ria do portador."
  [id update ]
  (:data (atualizar-using-put1-with-http-info id update)))

(defn consultar-transferencia-bancaria-using-get-with-http-info
  "Realiza a consulta de uma transferÃªncia bancÃ¡ria de crÃ©dito entre contas bancÃ¡rias de um portador
  Recurso utilizado para recuperar uma transferÃªncia de crÃ©dito entre contas bancÃ¡ria de um portador, utiliza o ID da transferÃªncia bancÃ¡riae o idConta para realizar a consulta."
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
  "Realiza a consulta de uma transferÃªncia bancÃ¡ria de crÃ©dito entre contas bancÃ¡rias de um portador
  Recurso utilizado para recuperar uma transferÃªncia de crÃ©dito entre contas bancÃ¡ria de um portador, utiliza o ID da transferÃªncia bancÃ¡riae o idConta para realizar a consulta."
  [id-transferencia ]
  (:data (consultar-transferencia-bancaria-using-get-with-http-info id-transferencia)))

(defn consultar-using-get10-with-http-info
  "Consulta conta bancÃ¡ria portador
  Esse recurso permite consultar uma conta bancÃ¡ria do portador a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/contas-bancarias-portador/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get10
  "Consulta conta bancÃ¡ria portador
  Esse recurso permite consultar uma conta bancÃ¡ria do portador a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn consultar-using-get39-with-http-info
  "Consultar uma transferÃªncia bancÃ¡ria para um banco
  Este recurso permite consultar os detalhes de uma determinada transferÃªncia de crÃ©dito realizada para uma conta bancÃ¡ria. De modo geral, esta operaÃ§Ã£o poderÃ¡ ser utilizada para uma consulta simples destes detalhes ou para realizar a montagem de um comprovante de 2Âª via de transferÃªncia entre contas."
  ([id id-transferencia ] (consultar-using-get39-with-http-info id id-transferencia nil))
  ([id id-transferencia {:keys [id-conta-bancaria-destino ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias/{id_transferencia}" :get
             {:path-params   {"id" id "id_transferencia" id-transferencia }
              :header-params {}
              :query-params  {"id_conta_bancaria_destino" id-conta-bancaria-destino }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get39
  "Consultar uma transferÃªncia bancÃ¡ria para um banco
  Este recurso permite consultar os detalhes de uma determinada transferÃªncia de crÃ©dito realizada para uma conta bancÃ¡ria. De modo geral, esta operaÃ§Ã£o poderÃ¡ ser utilizada para uma consulta simples destes detalhes ou para realizar a montagem de um comprovante de 2Âª via de transferÃªncia entre contas."
  ([id id-transferencia ] (consultar-using-get39 id id-transferencia nil))
  ([id id-transferencia optional-params]
   (:data (consultar-using-get39-with-http-info id id-transferencia optional-params))))

(defn listar-transferencia-bancaria-using-get-with-http-info
  "Realiza a listagem das transferÃªncias bancÃ¡rias de crÃ©dito entre contas bancÃ¡rias
  Recurso utilizado para listar as transferÃªncia de crÃ©dito entre contas bancÃ¡ria de um portador solicitadas."
  ([] (listar-transferencia-bancaria-using-get-with-http-info nil))
  ([{:keys [sort page limit id-conta data-solicitacao-inicial data-solicitacao-final ]}]
   (call-api "/api/transferencias-creditos-contas-bancarias" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "dataSolicitacaoInicial" data-solicitacao-inicial "dataSolicitacaoFinal" data-solicitacao-final }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-transferencia-bancaria-using-get
  "Realiza a listagem das transferÃªncias bancÃ¡rias de crÃ©dito entre contas bancÃ¡rias
  Recurso utilizado para listar as transferÃªncia de crÃ©dito entre contas bancÃ¡ria de um portador solicitadas."
  ([] (listar-transferencia-bancaria-using-get nil))
  ([optional-params]
   (:data (listar-transferencia-bancaria-using-get-with-http-info optional-params))))

(defn listar-using-get12-with-http-info
  "Lista contas bancÃ¡rias portador
  Esse recurso permite listar contas bancÃ¡rias do portador."
  ([] (listar-using-get12-with-http-info nil))
  ([{:keys [id-conta nome-agencia numero-agencia numero-conta flag-conta-origem-doc id-pessoa-fisica favorecido numero-receira-federal sort page limit ]}]
   (call-api "/api/contas-bancarias-portador" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "nomeAgencia" nome-agencia "numeroAgencia" numero-agencia "numeroConta" numero-conta "flagContaOrigemDoc" flag-conta-origem-doc "idPessoaFisica" id-pessoa-fisica "favorecido" favorecido "numeroReceiraFederal" numero-receira-federal "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get12
  "Lista contas bancÃ¡rias portador
  Esse recurso permite listar contas bancÃ¡rias do portador."
  ([] (listar-using-get12 nil))
  ([optional-params]
   (:data (listar-using-get12-with-http-info optional-params))))

(defn listar-using-get45-with-http-info
  "Listar as transferÃªncias bancÃ¡rias realizadas
  Este recurso tem como objetivo permitir que o portador de um CartÃ£o possa consultar uma lista das TransferÃªncias BancÃ¡rias para os Favorecidos cadastrados."
  ([id ] (listar-using-get45-with-http-info id nil))
  ([id {:keys [id-conta-bancaria-destino sort page limit ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"id_conta_bancaria_destino" id-conta-bancaria-destino "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get45
  "Listar as transferÃªncias bancÃ¡rias realizadas
  Este recurso tem como objetivo permitir que o portador de um CartÃ£o possa consultar uma lista das TransferÃªncias BancÃ¡rias para os Favorecidos cadastrados."
  ([id ] (listar-using-get45 id nil))
  ([id optional-params]
   (:data (listar-using-get45-with-http-info id optional-params))))

(defn salvar-using-post7-with-http-info
  "Cadastra uma conta bancÃ¡ria do portador
  Esse recurso permite cadastrar contas bancÃ¡rias do portador."
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

(defn salvar-using-post7
  "Cadastra uma conta bancÃ¡ria do portador
  Esse recurso permite cadastrar contas bancÃ¡rias do portador."
  [persist ]
  (:data (salvar-using-post7-with-http-info persist)))

(defn simular-transferencia-bancaria-using-post-with-http-info
  "Realiza a simulaÃ§Ã£o dos planos de parcelamentos para uma transferÃªncia bancÃ¡ria de crÃ©dito entre contas bancÃ¡rias
  Realiza a simulaÃ§Ã£o dos planos de parcelamentos para uma transferÃªncia bancÃ¡ria de crÃ©dito entre contas bancÃ¡rias."
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
  "Realiza a simulaÃ§Ã£o dos planos de parcelamentos para uma transferÃªncia bancÃ¡ria de crÃ©dito entre contas bancÃ¡rias
  Realiza a simulaÃ§Ã£o dos planos de parcelamentos para uma transferÃªncia bancÃ¡ria de crÃ©dito entre contas bancÃ¡rias."
  [request ]
  (:data (simular-transferencia-bancaria-using-post-with-http-info request)))

(defn transferencia-credito-conta-bancaria-using-post-with-http-info
  "Realizar transferÃªncia bancÃ¡ria do cartÃ£o para contas bancÃ¡rias
  Este recurso tem como objetivo permitir que o portador de um cartÃ£o possa realizar a transferÃªncia de crÃ©dito para uma conta bancÃ¡ria. Assim, o valor do crÃ©dito somado a tarifa para transferÃªncia, quando praticada pelo emissor, serÃ¡ debitado da conta de origem, se houver saldo suficiente, e serÃ¡ creditado na conta bancÃ¡ria de destino."
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
  "Realizar transferÃªncia bancÃ¡ria do cartÃ£o para contas bancÃ¡rias
  Este recurso tem como objetivo permitir que o portador de um cartÃ£o possa realizar a transferÃªncia de crÃ©dito para uma conta bancÃ¡ria. Assim, o valor do crÃ©dito somado a tarifa para transferÃªncia, quando praticada pelo emissor, serÃ¡ debitado da conta de origem, se houver saldo suficiente, e serÃ¡ creditado na conta bancÃ¡ria de destino."
  [persist ]
  (:data (transferencia-credito-conta-bancaria-using-post-with-http-info persist)))

(defn transferir-using-post-with-http-info
  "Realizar transferÃªncia bancÃ¡ria do cartÃ£o para contas bancÃ¡rias
  Este recurso tem como objetivo permitir que o portador de um cartÃ£o possa realizar a transferÃªncia de crÃ©dito para uma conta bancÃ¡ria. Assim, o valor do crÃ©dito somado a tarifa para transferÃªncia, quando praticada pelo emissor, serÃ¡ debitado da conta de origem, se houver saldo suficiente, e serÃ¡ creditado na conta bancÃ¡ria de destino."
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
  "Realizar transferÃªncia bancÃ¡ria do cartÃ£o para contas bancÃ¡rias
  Este recurso tem como objetivo permitir que o portador de um cartÃ£o possa realizar a transferÃªncia de crÃ©dito para uma conta bancÃ¡ria. Assim, o valor do crÃ©dito somado a tarifa para transferÃªncia, quando praticada pelo emissor, serÃ¡ debitado da conta de origem, se houver saldo suficiente, e serÃ¡ creditado na conta bancÃ¡ria de destino."
  [id transferencia-bancaria-persist ]
  (:data (transferir-using-post-with-http-info id transferencia-bancaria-persist)))
