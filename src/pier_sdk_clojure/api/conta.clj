(ns pier-sdk-clojure.api.conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ajustar-conta-using-post-with-http-info
  "LanÃ§a um ajuste para a conta do id informado
  Este recurso insere um ajuste para a conta do id informado"
  [id id-tipo-ajuste data-ajuste valor-ajuste ]
  (call-api "/api/contas/{id}/ajustes-financeiros" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"idTipoAjuste" id-tipo-ajuste "dataAjuste" data-ajuste "valorAjuste" valor-ajuste }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ajustar-conta-using-post
  "LanÃ§a um ajuste para a conta do id informado
  Este recurso insere um ajuste para a conta do id informado"
  [id id-tipo-ajuste data-ajuste valor-ajuste ]
  (:data (ajustar-conta-using-post-with-http-info id id-tipo-ajuste data-ajuste valor-ajuste)))

(defn alterar-limite-using-put-with-http-info
  "Realiza a alteraÃ§Ã£o dos limites da conta
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  [id limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo ]
  (call-api "/api/contas/{id}/alterar-limites" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"limiteGlobal" limite-global "limiteCompra" limite-compra "limiteParcelado" limite-parcelado "limiteParcelas" limite-parcelas "limiteSaqueGlobal" limite-saque-global "limiteSaquePeriodo" limite-saque-periodo "limiteConsignado" limite-consignado "limiteInternacionalCompra" limite-internacional-compra "limiteInternacionalParcelado" limite-internacional-parcelado "limiteInternacionalParcelas" limite-internacional-parcelas "limiteInternacionalSaqueGlobal" limite-internacional-saque-global "limiteInternacionalSaquePeriodo" limite-internacional-saque-periodo }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-limite-using-put
  "Realiza a alteraÃ§Ã£o dos limites da conta
  Esse recurso permite realizar a alteraÃ§Ã£o dos Limites de uma determinada Conta."
  [id limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo ]
  (:data (alterar-limite-using-put-with-http-info id limite-global limite-compra limite-parcelado limite-parcelas limite-saque-global limite-saque-periodo limite-consignado limite-internacional-compra limite-internacional-parcelado limite-internacional-parcelas limite-internacional-saque-global limite-internacional-saque-periodo)))

(defn alterar-titular-using-post-with-http-info
  "Realiza a alteraÃ§Ã£o de uma Pessoa tilular da conta
  Esta mÃ©todo permite altera a pessoa de uma conta."
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
  "Realiza a alteraÃ§Ã£o de uma Pessoa tilular da conta
  Esta mÃ©todo permite altera a pessoa de uma conta."
  [id id-pessoa ]
  (:data (alterar-titular-using-post-with-http-info id id-pessoa)))

(defn alterar-vencimento-using-put-with-http-info
  "Realiza a alteraÃ§Ã£o do dia de vencimento das faturas da conta
  Esse recurso permite alterar o vencimento de uma conta especifica."
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
  "Realiza a alteraÃ§Ã£o do dia de vencimento das faturas da conta
  Esse recurso permite alterar o vencimento de uma conta especifica."
  [id novo-dia-vencimento ]
  (:data (alterar-vencimento-using-put-with-http-info id novo-dia-vencimento)))

(defn ativar-envio-fatura-email-using-post-with-http-info
  "Ativa o serviÃ§o de envio de fatura por email
  Este recurso ativa o serviÃ§o de envio de fatura por email"
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
  "Ativa o serviÃ§o de envio de fatura por email
  Este recurso ativa o serviÃ§o de envio de fatura por email"
  [id ]
  (:data (ativar-envio-fatura-email-using-post-with-http-info id)))

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
  "Consulta a dÃ­vida atualizada do cliente
  Este recurso consulta a dÃ­vida atualizada do cliente"
  ([id ] (consultar-divida-atualizada-cliente-using-get-with-http-info id nil))
  ([id {:keys [page limit data-vencimento id-escritorio-cobranca ]}]
   (call-api "/api/contas/{id}/recuperar-divida-atualizada" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit "dataVencimento" data-vencimento "idEscritorioCobranca" id-escritorio-cobranca }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-divida-atualizada-cliente-using-get
  "Consulta a dÃ­vida atualizada do cliente
  Este recurso consulta a dÃ­vida atualizada do cliente"
  ([id ] (consultar-divida-atualizada-cliente-using-get id nil))
  ([id optional-params]
   (:data (consultar-divida-atualizada-cliente-using-get-with-http-info id optional-params))))

(defn consultar-fatura-consignada-aberta-using-get-with-http-info
  "Consultar a fatura consignadas abertas da conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar a fatura consignada em aberto"
  ([id ] (consultar-fatura-consignada-aberta-using-get-with-http-info id nil))
  ([id {:keys [data-vencimento ]}]
   (call-api "/api/contas/{id}/faturas-consignadas/consultar-aberta" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-fatura-consignada-aberta-using-get
  "Consultar a fatura consignadas abertas da conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar a fatura consignada em aberto"
  ([id ] (consultar-fatura-consignada-aberta-using-get id nil))
  ([id optional-params]
   (:data (consultar-fatura-consignada-aberta-using-get-with-http-info id optional-params))))

(defn consultar-fatura-consignada-using-get-with-http-info
  "Apresenta dados de uma determinada fatura consignada
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar uma fatura, atravÃ©s do id da conta e o id da fatura."
  [id id-fatura ]
  (call-api "/api/contas/{id}/faturas-consignadas/{id_fatura}" :get
            {:path-params   {"id" id "id_fatura" id-fatura }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-fatura-consignada-using-get
  "Apresenta dados de uma determinada fatura consignada
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar uma fatura, atravÃ©s do id da conta e o id da fatura."
  [id id-fatura ]
  (:data (consultar-fatura-consignada-using-get-with-http-info id id-fatura)))

(defn consultar-fatura-using-get-with-http-info
  "Consultar Fatura da Conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar os detalhes de uma fatura vinculados a uma determinada conta."
  [id data-vencimento ]
  (call-api "/api/contas/{id}/faturas/consultar-fechada" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"dataVencimento" data-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-fatura-using-get
  "Consultar Fatura da Conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar os detalhes de uma fatura vinculados a uma determinada conta."
  [id data-vencimento ]
  (:data (consultar-fatura-using-get-with-http-info id data-vencimento)))

(defn consultar-lancamentos-futuros-fatura-using-get-with-http-info
  "Consultar LanÃ§amentos Futuros da Fatura de uma Conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar os detalhes dos lanÃ§amentos futuros de uma fatura vinculados a uma determinada conta."
  ([id ] (consultar-lancamentos-futuros-fatura-using-get-with-http-info id nil))
  ([id {:keys [data-vencimento ]}]
   (call-api "/api/contas/{id}/faturas/consultar-aberta" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-lancamentos-futuros-fatura-using-get
  "Consultar LanÃ§amentos Futuros da Fatura de uma Conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar os detalhes dos lanÃ§amentos futuros de uma fatura vinculados a uma determinada conta."
  ([id ] (consultar-lancamentos-futuros-fatura-using-get id nil))
  ([id optional-params]
   (:data (consultar-lancamentos-futuros-fatura-using-get-with-http-info id optional-params))))

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
             :auth-names    []}))

(defn consultar-limite-disponibilidade-using-get1
  "Apresenta os limites da conta
  Este mÃ©todo permite consultar os Limites configurados para uma determinada Conta, a partir do cÃ³digo de identificaÃ§Ã£o da conta (id)."
  [id ]
  (:data (consultar-limite-disponibilidade-using-get1-with-http-info id)))

(defn consultar-using-get20-with-http-info
  "Consultar uma transferÃªncia bancÃ¡ria para um banco
  Este recurso permite consultar os detalhes de uma determinada transferÃªncia de crÃ©dito realizada para uma conta bancÃ¡ria. De modo geral, esta operaÃ§Ã£o poderÃ¡ ser utilizada para uma consulta simples destes detalhes ou para realizar a montagem de um comprovante de 2Âª via de transferÃªncia entre contas."
  ([id id-transferencia ] (consultar-using-get20-with-http-info id id-transferencia nil))
  ([id id-transferencia {:keys [id-conta-bancaria-destino ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias/{id_transferencia}" :get
             {:path-params   {"id" id "id_transferencia" id-transferencia }
              :header-params {}
              :query-params  {"id_conta_bancaria_destino" id-conta-bancaria-destino }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get20
  "Consultar uma transferÃªncia bancÃ¡ria para um banco
  Este recurso permite consultar os detalhes de uma determinada transferÃªncia de crÃ©dito realizada para uma conta bancÃ¡ria. De modo geral, esta operaÃ§Ã£o poderÃ¡ ser utilizada para uma consulta simples destes detalhes ou para realizar a montagem de um comprovante de 2Âª via de transferÃªncia entre contas."
  ([id id-transferencia ] (consultar-using-get20 id id-transferencia nil))
  ([id id-transferencia optional-params]
   (:data (consultar-using-get20-with-http-info id id-transferencia optional-params))))

(defn consultar-using-get21-with-http-info
  "Consulta os detalhes de uma determinada transferÃªncia
  Este mÃ©todo permite consultar os detalhes de uma determinada transferÃªncia de crÃ©dito realizada entre contas."
  [id id-transferencia ]
  (call-api "/api/contas/{id}/transferencias-creditos-cartoes/{id_transferencia}" :get
            {:path-params   {"id" id "id_transferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get21
  "Consulta os detalhes de uma determinada transferÃªncia
  Este mÃ©todo permite consultar os detalhes de uma determinada transferÃªncia de crÃ©dito realizada entre contas."
  [id id-transferencia ]
  (:data (consultar-using-get21-with-http-info id id-transferencia)))

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
             :auth-names    []}))

(defn consultar-using-get3
  "Apresenta dados de uma determinada conta
  Este mÃ©todo permite consultar dados de uma determinada conta a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get3-with-http-info id)))

(defn desativar-envio-fatura-email-using-post-with-http-info
  "Desativa o serviÃ§o de envio de fatura por email
  Este recurso desativa o serviÃ§o de envio de fatura por email"
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
  "Desativa o serviÃ§o de envio de fatura por email
  Este recurso desativa o serviÃ§o de envio de fatura por email"
  [id ]
  (:data (desativar-envio-fatura-email-using-post-with-http-info id)))

(defn gerar-boleto-recarga-using-post-with-http-info
  "Gera um boleto de recarga
  Este recurso gera um boleto de recarga"
  ([id valor data-vencimento ] (gerar-boleto-recarga-using-post-with-http-info id valor data-vencimento nil))
  ([id valor data-vencimento {:keys [page limit ]}]
   (call-api "/api/contas/{id}/gerar-boleto-recarga" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit "valor" valor "dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn gerar-boleto-recarga-using-post
  "Gera um boleto de recarga
  Este recurso gera um boleto de recarga"
  ([id valor data-vencimento ] (gerar-boleto-recarga-using-post id valor data-vencimento nil))
  ([id valor data-vencimento optional-params]
   (:data (gerar-boleto-recarga-using-post-with-http-info id valor data-vencimento optional-params))))

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
              :auth-names    []})))

(defn gerar-cartao-using-post
  "Realiza a geraÃ§Ã£o de um novo cartÃ£o para impressÃ£o avulsa
  Este recurso permite que seja gerado um novo CartÃ£o para um determinado Portador que esteja vinculado a uma Conta. Para isso, serÃ¡ preciso informar o cÃ³digo de identificaÃ§Ã£o da Conta (id), o idPessoa do Portador e o idTipoPlastico do CartÃ£o que deverÃ¡ ser gerado para impressÃ£o. Esta funcionalidade poderÃ¡ ser utilizada para realizar a impressÃ£o de cartÃµes em Lojas, Quiosques, EscritÃ³rios, Terminais de Auto Atendimento, ou outro local que o Emissor escolher, desde que se possua uma impressora de CartÃµes habilidade para o fazer, no local."
  ([id id-pessoa ] (gerar-cartao-using-post id id-pessoa nil))
  ([id id-pessoa optional-params]
   (:data (gerar-cartao-using-post-with-http-info id id-pessoa optional-params))))

(defn listar-faturas-consignadas-using-get-with-http-info
  "Lista as faturas consignadas da conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar todo o HistÃ³rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas."
  ([id ] (listar-faturas-consignadas-using-get-with-http-info id nil))
  ([id {:keys [page limit data-vencimento ]}]
   (call-api "/api/contas/{id}/faturas-consignadas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit "dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-faturas-consignadas-using-get
  "Lista as faturas consignadas da conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar todo o HistÃ³rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas."
  ([id ] (listar-faturas-consignadas-using-get id nil))
  ([id optional-params]
   (:data (listar-faturas-consignadas-using-get-with-http-info id optional-params))))

(defn listar-faturas-using-get-with-http-info
  "Lista as faturas da conta
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
              :auth-names    []})))

(defn listar-faturas-using-get
  "Lista as faturas da conta
  AtravÃ©s desta operaÃ§Ã£o os Emissores ou Portadores poderÃ£o consultar todo o HistÃ³rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas."
  ([id ] (listar-faturas-using-get id nil))
  ([id optional-params]
   (:data (listar-faturas-using-get-with-http-info id optional-params))))

(defn listar-historico-alteracoes-limites-using-get-with-http-info
  "Lista o histÃ³rico de alteraÃ§Ãµes de limites da conta
  Este recurso consulta o histÃ³rico com as alteraÃ§Ãµes de limites da conta informada"
  ([id ] (listar-historico-alteracoes-limites-using-get-with-http-info id nil))
  ([id {:keys [page limit ]}]
   (call-api "/api/contas/{id}/historicos-alteracoes-limites" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-historico-alteracoes-limites-using-get
  "Lista o histÃ³rico de alteraÃ§Ãµes de limites da conta
  Este recurso consulta o histÃ³rico com as alteraÃ§Ãµes de limites da conta informada"
  ([id ] (listar-historico-alteracoes-limites-using-get id nil))
  ([id optional-params]
   (:data (listar-historico-alteracoes-limites-using-get-with-http-info id optional-params))))

(defn listar-historico-assessoria-using-get-with-http-info
  "Lista o histÃ³rico de entradas/saÃ­das de assessorias de cobranÃ§a
  Permite listar todos os registros de entrada e saÃ­da da Conta em arquivos de integraÃ§Ã£o com empresas de assessorias de cobranÃ§a a partir do cÃ³digo de identificaÃ§Ã£o da conta (idConta)."
  ([id ] (listar-historico-assessoria-using-get-with-http-info id nil))
  ([id {:keys [page limit ]}]
   (call-api "/api/contas/{id}/historicos-assessorias-cobranca" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-historico-assessoria-using-get
  "Lista o histÃ³rico de entradas/saÃ­das de assessorias de cobranÃ§a
  Permite listar todos os registros de entrada e saÃ­da da Conta em arquivos de integraÃ§Ã£o com empresas de assessorias de cobranÃ§a a partir do cÃ³digo de identificaÃ§Ã£o da conta (idConta)."
  ([id ] (listar-historico-assessoria-using-get id nil))
  ([id optional-params]
   (:data (listar-historico-assessoria-using-get-with-http-info id optional-params))))

(defn listar-historico-atrasos-faturas-using-get-with-http-info
  "Lista o historico de atrasos das faturas
  Este recurso lista o histÃ³rico do pagamento de faturas em atraso"
  [id ]
  (call-api "/api/contas/{id}/historicos-faturas-atrasos" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-historico-atrasos-faturas-using-get
  "Lista o historico de atrasos das faturas
  Este recurso lista o histÃ³rico do pagamento de faturas em atraso"
  [id ]
  (:data (listar-historico-atrasos-faturas-using-get-with-http-info id)))

(defn listar-nao-processadas-using-get-with-http-info
  "Lista as transaÃ§Ãµes nÃ£o processadas da conta
  Este mÃ©todo permite que sejam listadas todas as transaÃ§Ãµes nÃ£o processadas da Conta."
  ([id ] (listar-nao-processadas-using-get-with-http-info id nil))
  ([id {:keys [page limit ]}]
   (call-api "/api/contas/{id}/transacoes/listar-nao-processadas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-nao-processadas-using-get
  "Lista as transaÃ§Ãµes nÃ£o processadas da conta
  Este mÃ©todo permite que sejam listadas todas as transaÃ§Ãµes nÃ£o processadas da Conta."
  ([id ] (listar-nao-processadas-using-get id nil))
  ([id optional-params]
   (:data (listar-nao-processadas-using-get-with-http-info id optional-params))))

(defn listar-processadas-using-get-with-http-info
  "Lista as transaÃ§Ãµes processadas da conta
  Este mÃ©todo permite que sejam listadas todas as transaÃ§Ãµes processadas da Conta."
  ([id ] (listar-processadas-using-get-with-http-info id nil))
  ([id {:keys [page limit data-vencimento ]}]
   (call-api "/api/contas/{id}/transacoes/listar-processadas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit "dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-processadas-using-get
  "Lista as transaÃ§Ãµes processadas da conta
  Este mÃ©todo permite que sejam listadas todas as transaÃ§Ãµes processadas da Conta."
  ([id ] (listar-processadas-using-get id nil))
  ([id optional-params]
   (:data (listar-processadas-using-get-with-http-info id optional-params))))

(defn listar-using-get22-with-http-info
  "Listar as transferÃªncias bancÃ¡rias realizadas
  Este recurso tem como objetivo permitir que o portador de um CartÃ£o possa consultar uma lista das TransferÃªncias BancÃ¡rias para os Favorecidos cadastrados."
  ([id ] (listar-using-get22-with-http-info id nil))
  ([id {:keys [id-conta-bancaria-destino page limit ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"id_conta_bancaria_destino" id-conta-bancaria-destino "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get22
  "Listar as transferÃªncias bancÃ¡rias realizadas
  Este recurso tem como objetivo permitir que o portador de um CartÃ£o possa consultar uma lista das TransferÃªncias BancÃ¡rias para os Favorecidos cadastrados."
  ([id ] (listar-using-get22 id nil))
  ([id optional-params]
   (:data (listar-using-get22-with-http-info id optional-params))))

(defn listar-using-get23-with-http-info
  "Lista as transferÃªncias realizadas pela conta
  Este mÃ©todo permite que sejam listadas as transferÃªncias realizadas pela conta existentes na base do emissor."
  ([id ] (listar-using-get23-with-http-info id nil))
  ([id {:keys [page limit id-transferencia id-conta-origem id-conta-destino valor-transferencia data-transferencia ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-cartoes" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"page" page "limit" limit "idTransferencia" id-transferencia "idContaOrigem" id-conta-origem "idContaDestino" id-conta-destino "valorTransferencia" valor-transferencia "dataTransferencia" data-transferencia }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get23
  "Lista as transferÃªncias realizadas pela conta
  Este mÃ©todo permite que sejam listadas as transferÃªncias realizadas pela conta existentes na base do emissor."
  ([id ] (listar-using-get23 id nil))
  ([id optional-params]
   (:data (listar-using-get23-with-http-info id optional-params))))

(defn listar-using-get4-with-http-info
  "Lista contas existentes na base de dados do Emissor
  Este recurso permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get4-with-http-info nil))
  ([{:keys [page limit id-produto id-origem-comercial id-pessoa id-status-conta dia-vencimento melhor-dia-compra data-status-conta data-cadastro data-ultima-alteracao-vencimento ]}]
   (call-api "/api/contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idProduto" id-produto "idOrigemComercial" id-origem-comercial "idPessoa" id-pessoa "idStatusConta" id-status-conta "diaVencimento" dia-vencimento "melhorDiaCompra" melhor-dia-compra "dataStatusConta" data-status-conta "dataCadastro" data-cadastro "dataUltimaAlteracaoVencimento" data-ultima-alteracao-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get4
  "Lista contas existentes na base de dados do Emissor
  Este recurso permite listar contas existentes na base de dados do Emissor."
  ([] (listar-using-get4 nil))
  ([optional-params]
   (:data (listar-using-get4-with-http-info optional-params))))

(defn reativar-using-post-with-http-info
  "Realiza a reativaÃ§Ã£o de contas que foram desativadas por inadimplÃªncia
  Este recurso permite reativar contas que foram desativadas por inadimplÃªncia. Para isso, serÃ¡ preciso informar o cÃ³digo de identificaÃ§Ã£o da Conta (id)."
  [id ]
  (call-api "/api/contas/{id}/reativar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn reativar-using-post
  "Realiza a reativaÃ§Ã£o de contas que foram desativadas por inadimplÃªncia
  Este recurso permite reativar contas que foram desativadas por inadimplÃªncia. Para isso, serÃ¡ preciso informar o cÃ³digo de identificaÃ§Ã£o da Conta (id)."
  [id ]
  (:data (reativar-using-post-with-http-info id)))

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
              :auth-names    []})))

(defn transacoes-using-get
  "Permite listar uma linha do tempo com os eventos da conta
  Esta operaÃ§Ã£o tem como objetivo permitir a listagem, em formato de timeline, dos eventos vinculados a uma detemrinada conta. TransaÃ§Ãµes, fechamento da fatura, pagamentos, geraÃ§Ã£o de cartÃµes e alteraÃ§Ã£o de limite sÃ£o exemplos de eventos contemplados por esta funcionalidade. Neste mÃ©todo, as operaÃ§Ãµes sÃ£o ordenadas de forma decrescente."
  ([id ] (transacoes-using-get id nil))
  ([id optional-params]
   (:data (transacoes-using-get-with-http-info id optional-params))))

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

(defn transferir-using-post1-with-http-info
  "Realiza uma transferÃªncia de CrÃ©dito para outro cliente do mesmo Emissor
  Este mÃ©todo permite que um portador de um cartÃ£o possa realizar auma transferÃªncia de crÃ©dito para outro cliente do mesmo emissor."
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
  "Realiza uma transferÃªncia de CrÃ©dito para outro cliente do mesmo Emissor
  Este mÃ©todo permite que um portador de um cartÃ£o possa realizar auma transferÃªncia de crÃ©dito para outro cliente do mesmo emissor."
  [id id-conta-destino valor-transferencia ]
  (:data (transferir-using-post1-with-http-info id id-conta-destino valor-transferencia)))
