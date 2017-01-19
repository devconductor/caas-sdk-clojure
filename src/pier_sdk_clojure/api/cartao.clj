(ns pier-sdk-clojure.api.cartao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-status-impressao-using-put-with-http-info
  "Realiza a alteraÃ§Ã£o do Status de ImpressÃ£o do CartÃ£o
  Este mÃ©todo permite que uma AplicaÃ§Ã£o que realize a impressÃ£o de cartÃµes possa indicar que um determinado idCartao fora impresso ou estÃ¡ em processo de impressÃ£o. Para isso, basta informar o respectivo cÃ³digo de identificaÃ§Ã£o do cartÃ£o (id) que deseja ter seu um determinado id_status_impressao atribuÃ­do a ele. Por padrÃ£o, cartÃµes provisÃ³rios ou que jÃ¡ tenham sido incluÃ­dos em um arquivo para impressÃ£o via grÃ¡fica terÃ£o esta requisiÃ§Ã£o negada, se utilizada."
  [id id-status-impressao ]
  (call-api "/api/cartoes/{id}/alterar-status-impressao" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_status_impressao" id-status-impressao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn alterar-status-impressao-using-put
  "Realiza a alteraÃ§Ã£o do Status de ImpressÃ£o do CartÃ£o
  Este mÃ©todo permite que uma AplicaÃ§Ã£o que realize a impressÃ£o de cartÃµes possa indicar que um determinado idCartao fora impresso ou estÃ¡ em processo de impressÃ£o. Para isso, basta informar o respectivo cÃ³digo de identificaÃ§Ã£o do cartÃ£o (id) que deseja ter seu um determinado id_status_impressao atribuÃ­do a ele. Por padrÃ£o, cartÃµes provisÃ³rios ou que jÃ¡ tenham sido incluÃ­dos em um arquivo para impressÃ£o via grÃ¡fica terÃ£o esta requisiÃ§Ã£o negada, se utilizada."
  [id id-status-impressao ]
  (:data (alterar-status-impressao-using-put-with-http-info id id-status-impressao)))

(defn atribuir-pessoa-using-put-with-http-info
  "Realiza a atribuiÃ§Ã£o de um cartÃ£o prÃ©-pago a uma pessoa
  Esta mÃ©todo permite que um cartÃ£o prÃ©-pago impresso de forma avulsa e anÃ´nimo seja atribuÃ­do a uma pessoa para que esta passe a ser a portadora titular dele."
  [id id-pessoa ]
  (call-api "/api/cartoes/{id}/atribuir-pessoa" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_pessoa" id-pessoa }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn atribuir-pessoa-using-put
  "Realiza a atribuiÃ§Ã£o de um cartÃ£o prÃ©-pago a uma pessoa
  Esta mÃ©todo permite que um cartÃ£o prÃ©-pago impresso de forma avulsa e anÃ´nimo seja atribuÃ­do a uma pessoa para que esta passe a ser a portadora titular dele."
  [id id-pessoa ]
  (:data (atribuir-pessoa-using-put-with-http-info id id-pessoa)))

(defn bloquear-using-put-with-http-info
  "Realiza o bloqueio de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o do bloqueio (temporÃ¡rio) ou do cancelamento (definitivo) de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id). Para isso, Ã© preciso informar qual o motivo deste bloqueio que nada mais Ã© do que atribuir um novo StatusCartao para ele dentre as opÃ§Ãµes praticadas pelo emissor."
  [id id-status observacao ]
  (call-api "/api/cartoes/{id}/bloquear" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_status" id-status "observacao" observacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn bloquear-using-put
  "Realiza o bloqueio de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o do bloqueio (temporÃ¡rio) ou do cancelamento (definitivo) de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id). Para isso, Ã© preciso informar qual o motivo deste bloqueio que nada mais Ã© do que atribuir um novo StatusCartao para ele dentre as opÃ§Ãµes praticadas pelo emissor."
  [id id-status observacao ]
  (:data (bloquear-using-put-with-http-info id id-status observacao)))

(defn cadastrar-alterar-senha-using-put-with-http-info
  "Realiza o cadastro ou alteraÃ§Ã£o da senha de um CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que o portador de um determinado cartÃ£o possa definir uma senha a sua escolha."
  [id senha ]
  (call-api "/api/cartoes/{id}/alterar-senha" :put
            {:path-params   {"id" id }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn cadastrar-alterar-senha-using-put
  "Realiza o cadastro ou alteraÃ§Ã£o da senha de um CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que o portador de um determinado cartÃ£o possa definir uma senha a sua escolha."
  [id senha ]
  (:data (cadastrar-alterar-senha-using-put-with-http-info id senha)))

(defn consultar-limite-disponibilidade-using-get-with-http-info
  "Apresenta os limites do Portador do CartÃ£o
  Este mÃ©todo permite consultar os Limites configurados para o Portador de um determinado CartÃ£o, seja ele o titular da conta ou um adicional, a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id ]
  (call-api "/api/cartoes/{id}/limites-disponibilidades" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-limite-disponibilidade-using-get
  "Apresenta os limites do Portador do CartÃ£o
  Este mÃ©todo permite consultar os Limites configurados para o Portador de um determinado CartÃ£o, seja ele o titular da conta ou um adicional, a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id ]
  (:data (consultar-limite-disponibilidade-using-get-with-http-info id)))

(defn consultar-portador-using-get-with-http-info
  "Apresenta os dados do Portador do CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes do Portador de um determinado CartÃ£o a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id ]
  (call-api "/api/cartoes/{id}/portadores" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-portador-using-get
  "Apresenta os dados do Portador do CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes do Portador de um determinado CartÃ£o a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id ]
  (:data (consultar-portador-using-get-with-http-info id)))

(defn consultar-using-get-with-http-info
  "Apresenta os dados de um determinado CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes bÃ¡sicas de um determinado CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/cartoes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get
  "Apresenta os dados de um determinado CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes bÃ¡sicas de um determinado CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get-with-http-info id)))

(defn desbloquear-using-put-with-http-info
  "Realiza o desbloqueio de um determinado CartÃ£o
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/cartoes/{id}/desbloquear" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn desbloquear-using-put
  "Realiza o desbloqueio de um determinado CartÃ£o
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (desbloquear-using-put-with-http-info id)))

(defn gerar-lotes-cartoes-pre-pagos-using-post-with-http-info
  "Permite gerar um novo Lote de CartÃµes PrÃ©-Pago
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores gerem uma determinada quantidade de CartÃµes PrÃ©-Pagos, de forma nÃ£o nominal, os quais poderÃ£o ser comercializados e posteriormente vinculados a um cliente que o adquirir. Para isso, alÃ©m de definir quantos cartÃµes deverÃ£o ser gerados, serÃ¡ possÃ­vel definir qual a Origem Comercial, o Produto, o Tipo do CartÃ£o, a Imagem e o EndereÃ§o para entrega dos CartÃµes presentes no lote gerado. Por padrÃ£o, todos os cartÃµes serÃ£o associados a um idPessoa fictÃ­cio e receberÃ¡ um idConta Ãºnico para cada um deles. Feito isso, os CartÃµes gerados por esta operaÃ§Ã£o seguirÃ£o os mesmos processos de impressÃ£o via grÃ¡fica previamente definidos entre o Emissor e a Conductor."
  ([] (gerar-lotes-cartoes-pre-pagos-using-post-with-http-info nil))
  ([{:keys [id-origem-comercial id-produto id-tipo-cartao id-imagem id-endereco quantidade-cartoes ]}]
   (call-api "/api/cartoes/pre-pagos/lotes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idOrigemComercial" id-origem-comercial "idProduto" id-produto "idTipoCartao" id-tipo-cartao "idImagem" id-imagem "idEndereco" id-endereco "quantidadeCartoes" quantidade-cartoes }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn gerar-lotes-cartoes-pre-pagos-using-post
  "Permite gerar um novo Lote de CartÃµes PrÃ©-Pago
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores gerem uma determinada quantidade de CartÃµes PrÃ©-Pagos, de forma nÃ£o nominal, os quais poderÃ£o ser comercializados e posteriormente vinculados a um cliente que o adquirir. Para isso, alÃ©m de definir quantos cartÃµes deverÃ£o ser gerados, serÃ¡ possÃ­vel definir qual a Origem Comercial, o Produto, o Tipo do CartÃ£o, a Imagem e o EndereÃ§o para entrega dos CartÃµes presentes no lote gerado. Por padrÃ£o, todos os cartÃµes serÃ£o associados a um idPessoa fictÃ­cio e receberÃ¡ um idConta Ãºnico para cada um deles. Feito isso, os CartÃµes gerados por esta operaÃ§Ã£o seguirÃ£o os mesmos processos de impressÃ£o via grÃ¡fica previamente definidos entre o Emissor e a Conductor."
  ([] (gerar-lotes-cartoes-pre-pagos-using-post nil))
  ([optional-params]
   (:data (gerar-lotes-cartoes-pre-pagos-using-post-with-http-info optional-params))))

(defn gerar-nova-via-using-post-with-http-info
  "Gerar uma nova via de CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores ou seus clientes possam solicitar a geraÃ§Ã£o de uma nova via de CartÃ£o que serÃ¡ encaminhando para impressÃ£o e postagem de acordo com os fluxos padrÃµes jÃ¡ definidos pelo emissor. Para isso, Ã© preciso que o cliente jÃ¡ possua um cartÃ£o gerado e informar o CÃ³digo de IdentificaÃ§Ã£o deste (idCartao) para que ele possa utilizar esta operaÃ§Ã£o. Assim, esta funcionalidade se aplica apenas para a geraÃ§Ã£o de cartÃµes fÃ­sicos."
  [id-cartao ]
  (call-api "/api/cartoes/{id_cartao}/gerar-nova-via" :post
            {:path-params   {"id_cartao" id-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn gerar-nova-via-using-post
  "Gerar uma nova via de CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores ou seus clientes possam solicitar a geraÃ§Ã£o de uma nova via de CartÃ£o que serÃ¡ encaminhando para impressÃ£o e postagem de acordo com os fluxos padrÃµes jÃ¡ definidos pelo emissor. Para isso, Ã© preciso que o cliente jÃ¡ possua um cartÃ£o gerado e informar o CÃ³digo de IdentificaÃ§Ã£o deste (idCartao) para que ele possa utilizar esta operaÃ§Ã£o. Assim, esta funcionalidade se aplica apenas para a geraÃ§Ã£o de cartÃµes fÃ­sicos."
  [id-cartao ]
  (:data (gerar-nova-via-using-post-with-http-info id-cartao)))

(defn listar-lotes-cartoes-pre-pagos-using-get-with-http-info
  "Permite listar os Lotes de CartÃµes PrÃ©-Pago
  Este mÃ©todo permite que sejam listados os cartÃµes prÃ©-pagos existentes na base do emissor."
  ([] (listar-lotes-cartoes-pre-pagos-using-get-with-http-info nil))
  ([{:keys [page limit id id-origem-comercial id-produto id-tipo-cartao id-imagem id-endereco quantidade-cartoes data-cadastro usuario-cadastro status-processamento ]}]
   (call-api "/api/cartoes/pre-pagos/lotes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "idOrigemComercial" id-origem-comercial "idProduto" id-produto "idTipoCartao" id-tipo-cartao "idImagem" id-imagem "idEndereco" id-endereco "quantidadeCartoes" quantidade-cartoes "dataCadastro" data-cadastro "usuarioCadastro" usuario-cadastro "statusProcessamento" status-processamento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-lotes-cartoes-pre-pagos-using-get
  "Permite listar os Lotes de CartÃµes PrÃ©-Pago
  Este mÃ©todo permite que sejam listados os cartÃµes prÃ©-pagos existentes na base do emissor."
  ([] (listar-lotes-cartoes-pre-pagos-using-get nil))
  ([optional-params]
   (:data (listar-lotes-cartoes-pre-pagos-using-get-with-http-info optional-params))))

(defn listar-using-get-with-http-info
  "Lista os CartÃµes gerados pelo Emissor
  Este mÃ©todo permite que sejam listados os cartÃµes existentes na base do emissor."
  ([] (listar-using-get-with-http-info nil))
  ([{:keys [page limit id id-status-cartao id-estagio-cartao id-conta id-pessoa id-produto tipo-portador numero-cartao nome-impresso data-geracao data-status-cartao data-estagio-cartao data-validade data-impressao arquivo-impressao flag-impressao-origem-comercial flag-provisorio codigo-desbloqueio ]}]
   (call-api "/api/cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "id" id "idStatusCartao" id-status-cartao "idEstagioCartao" id-estagio-cartao "idConta" id-conta "idPessoa" id-pessoa "idProduto" id-produto "tipoPortador" tipo-portador "numeroCartao" numero-cartao "nomeImpresso" nome-impresso "dataGeracao" data-geracao "dataStatusCartao" data-status-cartao "dataEstagioCartao" data-estagio-cartao "dataValidade" data-validade "dataImpressao" data-impressao "arquivoImpressao" arquivo-impressao "flagImpressaoOrigemComercial" flag-impressao-origem-comercial "flagProvisorio" flag-provisorio "codigoDesbloqueio" codigo-desbloqueio }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get
  "Lista os CartÃµes gerados pelo Emissor
  Este mÃ©todo permite que sejam listados os cartÃµes existentes na base do emissor."
  ([] (listar-using-get nil))
  ([optional-params]
   (:data (listar-using-get-with-http-info optional-params))))

(defn validar-cartao-chip-bandeirado-using-get-with-http-info
  "Permite validar um CartÃ£o com bandeira Mastercard a partir do chip
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem o criptograma gerado a partir da leitura de um chip EMV de um CartÃ£o com bandeira Mastercard a fim de verificar a sua autenticidade. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o antes de permitir que o portador realize transaÃ§Ãµes diversas, como as de compra e saque na modalidade dÃ©bito em conta corrente, dentre outras."
  [numero-cartao criptograma ]
  (call-api "/api/cartoes/bandeirados/validar-chip" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"numero_cartao" numero-cartao "criptograma" criptograma }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn validar-cartao-chip-bandeirado-using-get
  "Permite validar um CartÃ£o com bandeira Mastercard a partir do chip
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem o criptograma gerado a partir da leitura de um chip EMV de um CartÃ£o com bandeira Mastercard a fim de verificar a sua autenticidade. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o antes de permitir que o portador realize transaÃ§Ãµes diversas, como as de compra e saque na modalidade dÃ©bito em conta corrente, dentre outras."
  [numero-cartao criptograma ]
  (:data (validar-cartao-chip-bandeirado-using-get-with-http-info numero-cartao criptograma)))

(defn validar-cartao-digitado-bandeirado-using-get-with-http-info
  "Permite validar um CartÃ£o bandeirado a partir dos dados Impressos
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir do envio dos dados sensÃ­veis impressos nele. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o para a realizaÃ§Ã£o de transaÃ§Ãµes e-commerce ou por meio de Centrais de Atendimento EletrÃ´nico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (call-api "/api/cartoes/bandeirados/validar-digitado" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"numero_cartao" numero-cartao "nome_portador" nome-portador "data_validade" data-validade "codigo_seguranca" codigo-seguranca }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn validar-cartao-digitado-bandeirado-using-get
  "Permite validar um CartÃ£o bandeirado a partir dos dados Impressos
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir do envio dos dados sensÃ­veis impressos nele. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o para a realizaÃ§Ã£o de transaÃ§Ãµes e-commerce ou por meio de Centrais de Atendimento EletrÃ´nico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (:data (validar-cartao-digitado-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca)))

(defn validar-cartao-digitado-nao-bandeirado-using-get-with-http-info
  "Permite validar um CartÃ£o a partir dos dados Impressos
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir do envio dos dados sensÃ­veis impressos nele. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o para a realizaÃ§Ã£o de transaÃ§Ãµes e-commerce ou por meio de Centrais de Atendimento EletrÃ´nico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (call-api "/api/cartoes/nao-bandeirados/validar-digitado" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"numero_cartao" numero-cartao "nome_portador" nome-portador "data_validade" data-validade "codigo_seguranca" codigo-seguranca }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn validar-cartao-digitado-nao-bandeirado-using-get
  "Permite validar um CartÃ£o a partir dos dados Impressos
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir do envio dos dados sensÃ­veis impressos nele. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o para a realizaÃ§Ã£o de transaÃ§Ãµes e-commerce ou por meio de Centrais de Atendimento EletrÃ´nico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (:data (validar-cartao-digitado-nao-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca)))

(defn validar-cartao-tarja-bandeirado-using-get-with-http-info
  "Permite validar um CartÃ£o Bandeirado a partir da Tarja
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir da leitura da tarja magnÃ©tica do mesmo. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o antes de permitir que o portador realize transaÃ§Ãµes diversas, como as de compra e saque na modalidade dÃ©bito em conta corrente, dentre outras."
  [numero-cartao trilha1 trilha2 ]
  (call-api "/api/cartoes/bandeirados/validar-tarja" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"numero_cartao" numero-cartao "trilha1" trilha1 "trilha2" trilha2 }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn validar-cartao-tarja-bandeirado-using-get
  "Permite validar um CartÃ£o Bandeirado a partir da Tarja
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir da leitura da tarja magnÃ©tica do mesmo. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o antes de permitir que o portador realize transaÃ§Ãµes diversas, como as de compra e saque na modalidade dÃ©bito em conta corrente, dentre outras."
  [numero-cartao trilha1 trilha2 ]
  (:data (validar-cartao-tarja-bandeirado-using-get-with-http-info numero-cartao trilha1 trilha2)))

(defn validar-senha-using-get-with-http-info
  "Permite validar a senha de um CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir validar que a senha informada pelo portador de um determinado cartÃ£o estÃ¡ correta."
  [id senha ]
  (call-api "/api/cartoes/{id}/validar-senha" :get
            {:path-params   {"id" id }
             :header-params {"senha" senha }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn validar-senha-using-get
  "Permite validar a senha de um CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir validar que a senha informada pelo portador de um determinado cartÃ£o estÃ¡ correta."
  [id senha ]
  (:data (validar-senha-using-get-with-http-info id senha)))
