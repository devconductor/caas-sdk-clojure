(ns pier-sdk-clojure.api.cartao
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-alterar-senha-using-put-with-http-info
  "Realiza a alteraÃ§Ã£o da senha de um CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que o portador de um determinado cartÃ£o possa definir uma senha a sua escolha."
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
  "Realiza a alteraÃ§Ã£o da senha de um CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que o portador de um determinado cartÃ£o possa definir uma senha a sua escolha."
  [id senha ]
  (:data (alterar-alterar-senha-using-put-with-http-info id senha)))

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
             :auth-names    []}))

(defn alterar-status-impressao-using-put
  "Realiza a alteraÃ§Ã£o do Status de ImpressÃ£o do CartÃ£o
  Este mÃ©todo permite que uma AplicaÃ§Ã£o que realize a impressÃ£o de cartÃµes possa indicar que um determinado idCartao fora impresso ou estÃ¡ em processo de impressÃ£o. Para isso, basta informar o respectivo cÃ³digo de identificaÃ§Ã£o do cartÃ£o (id) que deseja ter seu um determinado id_status_impressao atribuÃ­do a ele. Por padrÃ£o, cartÃµes provisÃ³rios ou que jÃ¡ tenham sido incluÃ­dos em um arquivo para impressÃ£o via grÃ¡fica terÃ£o esta requisiÃ§Ã£o negada, se utilizada."
  [id id-status-impressao ]
  (:data (alterar-status-impressao-using-put-with-http-info id id-status-impressao)))

(defn atribuir-pessoa-using-put-with-http-info
  "Realiza a atribuiÃ§Ã£o de um cartÃ£o prÃ©-pago a uma pessoa
  Esta mÃ©todo permite que um cartÃ£o prÃ©-pago impresso de forma avulsa e anÃ´nimo seja atribuÃ­do a uma pessoa para que esta passe a ser a portadora titular dele."
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
  "Realiza a atribuiÃ§Ã£o de um cartÃ£o prÃ©-pago a uma pessoa
  Esta mÃ©todo permite que um cartÃ£o prÃ©-pago impresso de forma avulsa e anÃ´nimo seja atribuÃ­do a uma pessoa para que esta passe a ser a portadora titular dele."
  [id id-pessoa ]
  (:data (atribuir-pessoa-using-put-with-http-info id id-pessoa)))

(defn bloquear-using-post-with-http-info
  "Realiza o bloqueio de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o do bloqueio (temporÃ¡rio) ou do cancelamento (definitivo) de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id). Para isso, Ã© preciso informar qual o motivo deste bloqueio que nada mais Ã© do que atribuir um novo StatusCartao para ele dentre as opÃ§Ãµes praticadas pelo emissor."
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
  "Realiza o bloqueio de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o do bloqueio (temporÃ¡rio) ou do cancelamento (definitivo) de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id). Para isso, Ã© preciso informar qual o motivo deste bloqueio que nada mais Ã© do que atribuir um novo StatusCartao para ele dentre as opÃ§Ãµes praticadas pelo emissor."
  [id id-status observacao ]
  (:data (bloquear-using-post-with-http-info id id-status observacao)))

(defn cadastrar-alterar-senha-using-post-with-http-info
  "Realiza o cadastro da senha de um CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que o portador de um determinado cartÃ£o possa definir uma senha a sua escolha."
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
  "Realiza o cadastro da senha de um CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que o portador de um determinado cartÃ£o possa definir uma senha a sua escolha."
  [id senha ]
  (:data (cadastrar-alterar-senha-using-post-with-http-info id senha)))

(defn cancelar-using-post-with-http-info
  "Realiza o cancelamento de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o cancelamento de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id). Para isso, Ã© preciso informar qual o motivo deste bloqueio que nada mais Ã© do que atribuir um novo StatusCartao para ele dentre as opÃ§Ãµes praticadas pelo emissor."
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
  "Realiza o cancelamento de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o cancelamento de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id). Para isso, Ã© preciso informar qual o motivo deste bloqueio que nada mais Ã© do que atribuir um novo StatusCartao para ele dentre as opÃ§Ãµes praticadas pelo emissor."
  [id id-status observacao ]
  (:data (cancelar-using-post-with-http-info id id-status observacao)))

(defn consultar-dados-reais-cartao-using-get-with-http-info
  "Consultar Detalhes do CartÃ£o
  Este mÃ©todo permite que seja consultado os dados necessarios de um cartÃ£o para executar serviÃ§os de autorizaÃ§Ã£o."
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
  "Consultar Detalhes do CartÃ£o
  Este mÃ©todo permite que seja consultado os dados necessarios de um cartÃ£o para executar serviÃ§os de autorizaÃ§Ã£o."
  [id ]
  (:data (consultar-dados-reais-cartao-using-get-with-http-info id)))

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
             :auth-names    []}))

(defn consultar-limite-disponibilidade-using-get
  "Apresenta os limites do Portador do CartÃ£o
  Este mÃ©todo permite consultar os Limites configurados para o Portador de um determinado CartÃ£o, seja ele o titular da conta ou um adicional, a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id ]
  (:data (consultar-limite-disponibilidade-using-get-with-http-info id)))

(defn consultar-lotes-cartoes-pre-pagos-using-get-with-http-info
  "Permite consultar um determinado Lote de CartÃµes PrÃ©-Pago
  Este mÃ©todo permite consultar os cartÃµes prÃ©-pagos existentes na base do emissor atravÃ©s do id do lote."
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
  "Permite consultar um determinado Lote de CartÃµes PrÃ©-Pago
  Este mÃ©todo permite consultar os cartÃµes prÃ©-pagos existentes na base do emissor atravÃ©s do id do lote."
  [id ]
  (:data (consultar-lotes-cartoes-pre-pagos-using-get-with-http-info id)))

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
             :auth-names    []}))

(defn consultar-portador-using-get
  "Apresenta os dados do Portador do CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes do Portador de um determinado CartÃ£o a partir do cÃ³digo de identificaÃ§Ã£o do CartÃ£o (id)."
  [id ]
  (:data (consultar-portador-using-get-with-http-info id)))

(defn consultar-using-get6-with-http-info
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
             :auth-names    []}))

(defn consultar-using-get6
  "Apresenta os dados de um determinado CartÃ£o
  Este mÃ©todo permite consultar as informaÃ§Ãµes bÃ¡sicas de um determinado CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get6-with-http-info id)))

(defn desbloquear-senha-incorreta-using-post-with-http-info
  "Realiza o desbloqueio de um cartÃ£o bloqueado por tentativas de senha incorretas
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o que foi bloqueado por tentativas de senha incorretas, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
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
  "Realiza o desbloqueio de um cartÃ£o bloqueado por tentativas de senha incorretas
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o que foi bloqueado por tentativas de senha incorretas, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (desbloquear-senha-incorreta-using-post-with-http-info id)))

(defn desbloquear-using-post-with-http-info
  "Realiza o desbloqueio de um determinado CartÃ£o
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
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
  "Realiza o desbloqueio de um determinado CartÃ£o
  Este mÃ©todo permite que seja desbloqueado um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (desbloquear-using-post-with-http-info id)))

(defn gerar-lotes-cartoes-pre-pagos-using-post-with-http-info
  "Permite gerar um novo Lote de CartÃµes PrÃ©-Pago
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores gerem uma determinada quantidade de CartÃµes PrÃ©-Pagos, de forma nÃ£o nominal, os quais poderÃ£o ser comercializados e posteriormente vinculados a um cliente que o adquirir. Para isso, alÃ©m de definir quantos cartÃµes deverÃ£o ser gerados, serÃ¡ possÃ­vel definir qual a Origem Comercial, o Produto, o Tipo do CartÃ£o, a Imagem e o EndereÃ§o para entrega dos CartÃµes presentes no lote gerado. Por padrÃ£o, todos os cartÃµes serÃ£o associados a um idPessoa fictÃ­cio e receberÃ¡ um idConta Ãºnico para cada um deles. Feito isso, os CartÃµes gerados por esta operaÃ§Ã£o seguirÃ£o os mesmos processos de impressÃ£o via grÃ¡fica previamente definidos entre o Emissor e a Conductor."
  ([] (gerar-lotes-cartoes-pre-pagos-using-post-with-http-info nil))
  ([{:keys [id-origem-comercial id-produto id-tipo-cartao id-imagem id-endereco quantidade-cartoes ]}]
   (call-api "/api/cartoes/lotes-cartoes-pre-pagos" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idOrigemComercial" id-origem-comercial "idProduto" id-produto "idTipoCartao" id-tipo-cartao "idImagem" id-imagem "idEndereco" id-endereco "quantidadeCartoes" quantidade-cartoes }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn gerar-lotes-cartoes-pre-pagos-using-post
  "Permite gerar um novo Lote de CartÃµes PrÃ©-Pago
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores gerem uma determinada quantidade de CartÃµes PrÃ©-Pagos, de forma nÃ£o nominal, os quais poderÃ£o ser comercializados e posteriormente vinculados a um cliente que o adquirir. Para isso, alÃ©m de definir quantos cartÃµes deverÃ£o ser gerados, serÃ¡ possÃ­vel definir qual a Origem Comercial, o Produto, o Tipo do CartÃ£o, a Imagem e o EndereÃ§o para entrega dos CartÃµes presentes no lote gerado. Por padrÃ£o, todos os cartÃµes serÃ£o associados a um idPessoa fictÃ­cio e receberÃ¡ um idConta Ãºnico para cada um deles. Feito isso, os CartÃµes gerados por esta operaÃ§Ã£o seguirÃ£o os mesmos processos de impressÃ£o via grÃ¡fica previamente definidos entre o Emissor e a Conductor."
  ([] (gerar-lotes-cartoes-pre-pagos-using-post nil))
  ([optional-params]
   (:data (gerar-lotes-cartoes-pre-pagos-using-post-with-http-info optional-params))))

(defn gerar-nova-via-using-post-with-http-info
  "Gerar uma nova via de CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores ou seus clientes possam solicitar a geraÃ§Ã£o de uma nova via de CartÃ£o que serÃ¡ encaminhando para impressÃ£o e postagem de acordo com os fluxos padrÃµes jÃ¡ definidos pelo emissor. Para isso, Ã© preciso que o cliente jÃ¡ possua um cartÃ£o gerado e informar o CÃ³digo de IdentificaÃ§Ã£o deste (idCartao) para que ele possa utilizar esta operaÃ§Ã£o. Assim, esta funcionalidade se aplica apenas para a geraÃ§Ã£o de cartÃµes fÃ­sicos."
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
  "Gerar uma nova via de CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores ou seus clientes possam solicitar a geraÃ§Ã£o de uma nova via de CartÃ£o que serÃ¡ encaminhando para impressÃ£o e postagem de acordo com os fluxos padrÃµes jÃ¡ definidos pelo emissor. Para isso, Ã© preciso que o cliente jÃ¡ possua um cartÃ£o gerado e informar o CÃ³digo de IdentificaÃ§Ã£o deste (idCartao) para que ele possa utilizar esta operaÃ§Ã£o. Assim, esta funcionalidade se aplica apenas para a geraÃ§Ã£o de cartÃµes fÃ­sicos."
  [id ]
  (:data (gerar-nova-via-using-post-with-http-info id)))

(defn lancar-tarifa-segunda-via-using-post-with-http-info
  "Adiciona tarifa de ajuste da segunda via do cartÃ£o
  Esse recurso permite adicionar tarÃ­fa de ajuste pela emissÃ£o da segunda via do cartÃ£o."
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
  "Adiciona tarifa de ajuste da segunda via do cartÃ£o
  Esse recurso permite adicionar tarÃ­fa de ajuste pela emissÃ£o da segunda via do cartÃ£o."
  [id ]
  (:data (lancar-tarifa-segunda-via-using-post-with-http-info id)))

(defn listar-lotes-cartoes-pre-pagos-using-get-with-http-info
  "Permite listar os Lotes de CartÃµes PrÃ©-Pago
  Este mÃ©todo permite que sejam listados os cartÃµes prÃ©-pagos existentes na base do emissor."
  ([] (listar-lotes-cartoes-pre-pagos-using-get-with-http-info nil))
  ([{:keys [sort page limit id-origem-comercial id-produto id-tipo-cartao id-imagem id-endereco quantidade-cartoes data-cadastro usuario-cadastro status-processamento ]}]
   (call-api "/api/cartoes/lotes-cartoes-pre-pagos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idOrigemComercial" id-origem-comercial "idProduto" id-produto "idTipoCartao" id-tipo-cartao "idImagem" id-imagem "idEndereco" id-endereco "quantidadeCartoes" quantidade-cartoes "dataCadastro" data-cadastro "usuarioCadastro" usuario-cadastro "statusProcessamento" status-processamento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-lotes-cartoes-pre-pagos-using-get
  "Permite listar os Lotes de CartÃµes PrÃ©-Pago
  Este mÃ©todo permite que sejam listados os cartÃµes prÃ©-pagos existentes na base do emissor."
  ([] (listar-lotes-cartoes-pre-pagos-using-get nil))
  ([optional-params]
   (:data (listar-lotes-cartoes-pre-pagos-using-get-with-http-info optional-params))))

(defn listar-using-get7-with-http-info
  "Lista os CartÃµes gerados pelo Emissor
  Este mÃ©todo permite que sejam listados os cartÃµes existentes na base do emissor."
  ([] (listar-using-get7-with-http-info nil))
  ([{:keys [sort page limit id-status-cartao id-estagio-cartao id-conta id-pessoa id-produto tipo-portador numero-cartao nome-impresso data-geracao data-status-cartao data-estagio-cartao data-validade data-impressao arquivo-impressao flag-impressao-origem-comercial flag-provisorio codigo-desbloqueio sequencial-cartao ]}]
   (call-api "/api/cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idStatusCartao" id-status-cartao "idEstagioCartao" id-estagio-cartao "idConta" id-conta "idPessoa" id-pessoa "idProduto" id-produto "tipoPortador" tipo-portador "numeroCartao" numero-cartao "nomeImpresso" nome-impresso "dataGeracao" data-geracao "dataStatusCartao" data-status-cartao "dataEstagioCartao" data-estagio-cartao "dataValidade" data-validade "dataImpressao" data-impressao "arquivoImpressao" arquivo-impressao "flagImpressaoOrigemComercial" flag-impressao-origem-comercial "flagProvisorio" flag-provisorio "codigoDesbloqueio" codigo-desbloqueio "sequencialCartao" sequencial-cartao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get7
  "Lista os CartÃµes gerados pelo Emissor
  Este mÃ©todo permite que sejam listados os cartÃµes existentes na base do emissor."
  ([] (listar-using-get7 nil))
  ([optional-params]
   (:data (listar-using-get7-with-http-info optional-params))))

(defn reativar-using-post-with-http-info
  "Realiza a reativaÃ§Ã£o de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o da reativaÃ§Ã£o de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
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
  "Realiza a reativaÃ§Ã£o de um determinado CartÃ£o
  Este mÃ©todo permite a realizaÃ§Ã£o da reativaÃ§Ã£o de um determinado cartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (reativar-using-post-with-http-info id)))

(defn validar-dados-impressos-bandeirado-using-get-with-http-info
  "Permite validar os dados impressos em um cartÃ£o bandeirado
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir do envio dos dados sensÃ­veis impressos nele. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o para a realizaÃ§Ã£o de transaÃ§Ãµes e-commerce ou por meio de Centrais de Atendimento EletrÃ´nico (URA), dentre outras."
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
  "Permite validar os dados impressos em um cartÃ£o bandeirado
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir do envio dos dados sensÃ­veis impressos nele. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o para a realizaÃ§Ã£o de transaÃ§Ãµes e-commerce ou por meio de Centrais de Atendimento EletrÃ´nico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (:data (validar-dados-impressos-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca)))

(defn validar-dados-impressos-nao-bandeirado-using-get-with-http-info
  "Permite validar os dados impressos de um cartao nÃ£o bandeirado
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir do envio dos dados sensÃ­veis impressos nele. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o para a realizaÃ§Ã£o de transaÃ§Ãµes e-commerce ou por meio de Centrais de Atendimento EletrÃ´nico (URA), dentre outras."
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
  "Permite validar os dados impressos de um cartao nÃ£o bandeirado
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir do envio dos dados sensÃ­veis impressos nele. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o para a realizaÃ§Ã£o de transaÃ§Ãµes e-commerce ou por meio de Centrais de Atendimento EletrÃ´nico (URA), dentre outras."
  [numero-cartao nome-portador data-validade codigo-seguranca ]
  (:data (validar-dados-impressos-nao-bandeirado-using-get-with-http-info numero-cartao nome-portador data-validade codigo-seguranca)))

(defn validar-de55-cartao-mastercard-using-get-with-http-info
  "Permite validar um CartÃ£o com bandeira Mastercard a partir do de55
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem o DE55 gerado a partir da leitura de um chip EMV de um CartÃ£o com bandeira Mastercard a fim de verificar a sua autenticidade. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o antes de permitir que o portador realize transaÃ§Ãµes diversas, como as de compra e saque na modalidade dÃ©bito em conta corrente, dentre outras."
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
  "Permite validar um CartÃ£o com bandeira Mastercard a partir do de55
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem o DE55 gerado a partir da leitura de um chip EMV de um CartÃ£o com bandeira Mastercard a fim de verificar a sua autenticidade. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o antes de permitir que o portador realize transaÃ§Ãµes diversas, como as de compra e saque na modalidade dÃ©bito em conta corrente, dentre outras."
  [numero-cartao criptograma ]
  (:data (validar-de55-cartao-mastercard-using-get-with-http-info numero-cartao criptograma)))

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
             :auth-names    []}))

(defn validar-senha-using-get
  "Permite validar a senha de um CartÃ£o
  Esta operaÃ§Ã£o tem como objetivo permitir validar que a senha informada pelo portador de um determinado cartÃ£o estÃ¡ correta."
  [id senha ]
  (:data (validar-senha-using-get-with-http-info id senha)))

(defn validar-tarja-using-get-with-http-info
  "Permite validar um CartÃ£o Bandeirado a partir da Tarja
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir da leitura da tarja magnÃ©tica do mesmo. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o antes de permitir que o portador realize transaÃ§Ãµes diversas, como as de compra e saque na modalidade dÃ©bito em conta corrente, dentre outras."
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
  "Permite validar um CartÃ£o Bandeirado a partir da Tarja
  Esta operaÃ§Ã£o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado CartÃ£o a partir da leitura da tarja magnÃ©tica do mesmo. A utilizaÃ§Ã£o desde mÃ©todo tem diversas aplicaÃ§Ãµes, sendo a principal delas a de IdentificaÃ§Ã£o Positiva do CartÃ£o antes de permitir que o portador realize transaÃ§Ãµes diversas, como as de compra e saque na modalidade dÃ©bito em conta corrente, dentre outras."
  [numero-cartao trilha1 trilha2 ]
  (:data (validar-tarja-using-get-with-http-info numero-cartao trilha1 trilha2)))
