(ns pier-sdk-clojure.api.conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-limite-using-put-with-http-info
  "Alterar limite
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  [id limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo ]
  (call-api "/api/contas/{id}/alterar-limites" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"limiteGlobal" limite-global "limiteCompra" limite-compra "limiteParcelado" limite-parcelado "limiteParcelas" limite-parcelas "limiteSaqueGlobal" limite-saque-global "limiteSaquePeriodo" limite-saque-periodo "limiteConsignado" limite-consignado "limiteInternacionalCompra" limite-internacional-compra "limiteInternacionalParcelado" limite-internacional-parcelado "limiteInternacionalParcelas" limite-internacional-parcelas "limiteInternacionalSaqueGlobal" limite-internacional-saque-global "limiteInternacionalSaquePeriodo" limite-internacional-saque-periodo }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-limite-using-put
  "Alterar limite
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  [id limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo ]
  (:data (alterar-limite-using-put-with-http-info id limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo)))

(defn alterar-vencimento-using-put-with-http-info
  "Alterar vencimento
  Esse recurso permite alterar o vencimento de uma conta especifica."
  [id novo-dia-vencimento ]
  (call-api "/api/contas/{id}/alterar-vencimento" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"novo_dia_vencimento" novo-dia-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-vencimento-using-put
  "Alterar vencimento
  Esse recurso permite alterar o vencimento de uma conta especifica."
  [id novo-dia-vencimento ]
  (:data (alterar-vencimento-using-put-with-http-info id novo-dia-vencimento)))

(defn consultar-divida-atualizada-cliente-using-get-with-http-info
  "Consultar a dÃ­vida atualizada do cliente
  Este recurso consulta a dÃ­vida atualizada do cliente"
  ([] (consultar-divida-atualizada-cliente-using-get-with-http-info nil))
  ([{:keys [page limit id-conta data-vencimento id-escritorio-cobranca ]}]
   (call-api "/api/contas/{id}/divida" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idConta" id-conta "dataVencimento" data-vencimento "idEscritorioCobranca" id-escritorio-cobranca }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn consultar-divida-atualizada-cliente-using-get
  "Consultar a dÃ­vida atualizada do cliente
  Este recurso consulta a dÃ­vida atualizada do cliente"
  ([] (consultar-divida-atualizada-cliente-using-get nil))
  ([optional-params]
   (:data (consultar-divida-atualizada-cliente-using-get-with-http-info optional-params))))

(defn consultar-fatura-consignada-using-get-with-http-info
  "Apresenta dados de uma determinada fatura consignada
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar uma fatura, atravÃ©s do id da conta e o id da fatura."
  [id id-historico ]
  (call-api "/api/contas/{id}/faturas-consignadas/{idHistorico}" :get
            {:path-params   {"id" id "idHistorico" id-historico }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-fatura-consignada-using-get
  "Apresenta dados de uma determinada fatura consignada
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar uma fatura, atravÃ©s do id da conta e o id da fatura."
  [id id-historico ]
  (:data (consultar-fatura-consignada-using-get-with-http-info id id-historico)))

(defn consultar-limite-disponibilidade-using-get1-with-http-info
  "Apresenta os limites da conta
  Este mÃ©todo permite consultar os Limites configurados para uma determinada Conta, a partir do cÃ³digo de identificaÃ§Ã£o da conta (id)."
  [id ]
  (call-api "/api/contas/{id}/limites-disponibilidades" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-limite-disponibilidade-using-get1
  "Apresenta os limites da conta
  Este mÃ©todo permite consultar os Limites configurados para uma determinada Conta, a partir do cÃ³digo de identificaÃ§Ã£o da conta (id)."
  [id ]
  (:data (consultar-limite-disponibilidade-using-get1-with-http-info id)))

(defn consultar-using-get15-with-http-info
  "Consulta os detalhes de uma determinada transferÃªncia
  Este mÃ©todo permite consultar os detalhes de uma determinada transferÃªncia de crÃ©dito realizada entre contas."
  [id id-transferencia ]
  (call-api "/api/contas/{id}/transferencias/{id_transferencia}" :get
            {:path-params   {"id" id "id_transferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get15
  "Consulta os detalhes de uma determinada transferÃªncia
  Este mÃ©todo permite consultar os detalhes de uma determinada transferÃªncia de crÃ©dito realizada entre contas."
  [id id-transferencia ]
  (:data (consultar-using-get15-with-http-info id id-transferencia)))

(defn consultar-using-get3-with-http-info
  "Apresenta dados de uma determinada conta
  Este mÃ©todo permite consultar dados de uma determinada conta a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/contas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get3
  "Apresenta dados de uma determinada conta
  Este mÃ©todo permite consultar dados de uma determinada conta a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get3-with-http-info id)))

(defn gerar-cartao-using-post-with-http-info
  "Realiza a geraÃ§Ã£o de um novo cartÃ£o para impressÃ£o avulsa
  Este recurso permite que seja gerado um novo CartÃ£o para um determinado Portador que esteja vinculado a uma Conta. Para isso, serÃ¡ preciso informar o cÃ³digo de identificaÃ§Ã£o da Conta (id), o idPessoa do Portador e o idTipoPlastico do CartÃ£o que deverÃ¡ ser gerado para impressÃ£o. Esta funcionalidade poderÃ¡ ser utilizada para realizar a impressÃ£o de cartÃµes em Lojas, Quiosques, EscritÃ³rios, Terminais de Auto Atendimento, ou outro local que o Emissor escolher, desde que se possua uma impressora de CartÃµes habilidade para o fazer, no local."
  ([id id-pessoa ] (gerar-cartao-using-post-with-http-info id id-pessoa nil))
  ([id id-pessoa {:keys [id-tipo-plastico ]}]
   (call-api "/api/contas/{id}/pessoas/{id_pessoa}/gerar-cartao" :post
             {:path-params   {"id" id "id_pessoa" id-pessoa }
              :header-params {}
              :query-params  {"id_tipo_plastico" id-tipo-plastico }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn gerar-cartao-using-post
  "Realiza a geraÃ§Ã£o de um novo cartÃ£o para impressÃ£o avulsa
  Este recurso permite que seja gerado um novo CartÃ£o para um determinado Portador que esteja vinculado a uma Conta. Para isso, serÃ¡ preciso informar o cÃ³digo de identificaÃ§Ã£o da Conta (id), o idPessoa do Portador e o idTipoPlastico do CartÃ£o que deverÃ¡ ser gerado para impressÃ£o. Esta funcionalidade poderÃ¡ ser utilizada para realizar a impressÃ£o de cartÃµes em Lojas, Quiosques, EscritÃ³rios, Terminais de Auto Atendimento, ou outro local que o Emissor escolher, desde que se possua uma impressora de CartÃµes habilidade para o fazer, no local."
  ([id id-pessoa ] (gerar-cartao-using-post id id-pessoa nil))
  ([id id-pessoa optional-params]
   (:data (gerar-cartao-using-post-with-http-info id id-pessoa optional-params))))

(defn listar-faturas-consignadas-using-get-with-http-info
  "Listar Faturas consignadas da Conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar todo o HistÃ³rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas."
  ([id ] (listar-faturas-consignadas-using-get-with-http-info id nil))
  ([id {:keys [page limit data-vencimeno ]}]
   (call-api "/api/contas/{id}/faturas-consignadas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit "dataVencimeno" data-vencimeno }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-faturas-consignadas-using-get
  "Listar Faturas consignadas da Conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar todo o HistÃ³rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas."
  ([id ] (listar-faturas-consignadas-using-get id nil))
  ([id optional-params]
   (:data (listar-faturas-consignadas-using-get-with-http-info id optional-params))))

(defn listar-faturas-using-get-with-http-info
  "Listar Faturas da Conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar todo o HistÃ³rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas."
  ([id ] (listar-faturas-using-get-with-http-info id nil))
  ([id {:keys [page limit data-vencimento ]}]
   (call-api "/api/contas/{id}/faturas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit "dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-faturas-using-get
  "Listar Faturas da Conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar todo o HistÃ³rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas."
  ([id ] (listar-faturas-using-get id nil))
  ([id optional-params]
   (:data (listar-faturas-using-get-with-http-info id optional-params))))

(defn listar-using-get15-with-http-info
  "Lista as transferÃªncias de crÃ©dito realizadas pela conta
  Este mÃ©todo permite que sejam listadas as transferÃªncias de crÃ©dito realizadas pela conta existentes na base do emissor."
  ([id ] (listar-using-get15-with-http-info id nil))
  ([id {:keys [page limit id-transferencia id-conta-origem id-conta-destino valor-transferencia data-transferencia ]}]
   (call-api "/api/contas/{id}/transferencias" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit "idTransferencia" id-transferencia "idContaOrigem" id-conta-origem "idContaDestino" id-conta-destino "valorTransferencia" valor-transferencia "dataTransferencia" data-transferencia }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get15
  "Lista as transferÃªncias de crÃ©dito realizadas pela conta
  Este mÃ©todo permite que sejam listadas as transferÃªncias de crÃ©dito realizadas pela conta existentes na base do emissor."
  ([id ] (listar-using-get15 id nil))
  ([id optional-params]
   (:data (listar-using-get15-with-http-info id optional-params))))

(defn listar-using-get3-with-http-info
  "Lista contas existentes na base de dados do Emissor
  Este recurso permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get3-with-http-info nil))
  ([{:keys [page limit id id-produto id-origem-comercial id-pessoa id-status-conta dia-vencimento melhor-dia-compra data-status-conta data-cadastro data-ultima-alteracao-vencimento ]}]
   (call-api "/api/contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "idProduto" id-produto "idOrigemComercial" id-origem-comercial "idPessoa" id-pessoa "idStatusConta" id-status-conta "diaVencimento" dia-vencimento "melhorDiaCompra" melhor-dia-compra "dataStatusConta" data-status-conta "dataCadastro" data-cadastro "dataUltimaAlteracaoVencimento" data-ultima-alteracao-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get3
  "Lista contas existentes na base de dados do Emissor
  Este recurso permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get3 nil))
  ([optional-params]
   (:data (listar-using-get3-with-http-info optional-params))))

(defn transacoes-using-get-with-http-info
  "Permite listar uma linha do tempo com os eventos da conta
  Esta operaÃ§Ã£o tem como objetivo permitir a listagem, em formato de timeline, dos eventos vinculados a uma detemrinada conta. TransaÃ§Ãµes, fechamento da fatura, pagamentos, geraÃ§Ã£o de cartÃµes e alteraÃ§Ã£o de limite sÃ£o exemplos de eventos contemplados por esta funcionalidade. Neste mÃ©todo, as operaÃ§Ãµes sÃ£o ordenadas de forma decrescente."
  ([id ] (transacoes-using-get-with-http-info id nil))
  ([id {:keys [page limit ]}]
   (call-api "/api/contas/{id}/timeline" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn transacoes-using-get
  "Permite listar uma linha do tempo com os eventos da conta
  Esta operaÃ§Ã£o tem como objetivo permitir a listagem, em formato de timeline, dos eventos vinculados a uma detemrinada conta. TransaÃ§Ãµes, fechamento da fatura, pagamentos, geraÃ§Ã£o de cartÃµes e alteraÃ§Ã£o de limite sÃ£o exemplos de eventos contemplados por esta funcionalidade. Neste mÃ©todo, as operaÃ§Ãµes sÃ£o ordenadas de forma decrescente."
  ([id ] (transacoes-using-get id nil))
  ([id optional-params]
   (:data (transacoes-using-get-with-http-info id optional-params))))

(defn transferir-using-post-with-http-info
  "Realiza uma transferÃªncia de CrÃ©dito para outro cliente do mesmo Emissor
  Este mÃ©todo permite que um portador de um cartÃ£o possa realizar auma transferÃªncia de crÃ©dito para outro cliente do mesmo emissor."
  [id id-conta-destino valor-transferencia ]
  (call-api "/api/contas/{id}/transferencias" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_conta_destino" id-conta-destino "valor_transferencia" valor-transferencia }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn transferir-using-post
  "Realiza uma transferÃªncia de CrÃ©dito para outro cliente do mesmo Emissor
  Este mÃ©todo permite que um portador de um cartÃ£o possa realizar auma transferÃªncia de crÃ©dito para outro cliente do mesmo emissor."
  [id id-conta-destino valor-transferencia ]
  (:data (transferir-using-post-with-http-info id id-conta-destino valor-transferencia)))
