(ns pier-sdk-clojure.api.cadastro-geral
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-using-put2-with-http-info
  "Alterar campanha
  Este mÃ©todo permite que sejam alterados os dados de uma campanha."
  [id update ]
  (call-api "/api/campanhas/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put2
  "Alterar campanha
  Este mÃ©todo permite que sejam alterados os dados de uma campanha."
  [id update ]
  (:data (alterar-using-put2-with-http-info id update)))

(defn alterar-using-put3-with-http-info
  "Atualizar configuraÃ§Ã£o para registro de cobranÃ§a
  Este mÃ©todo permite atualizar uma configuraÃ§Ã£o, para registro de cobranÃ§a."
  [id configuracao-persist ]
  (call-api "/api/configuracoes-registro-cobranca/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    configuracao-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put3
  "Atualizar configuraÃ§Ã£o para registro de cobranÃ§a
  Este mÃ©todo permite atualizar uma configuraÃ§Ã£o, para registro de cobranÃ§a."
  [id configuracao-persist ]
  (:data (alterar-using-put3-with-http-info id configuracao-persist)))

(defn alterar-using-put4-with-http-info
  "Alterar os dados de configuraÃ§Ã£o do rotativo de um produto
  Este mÃ©todo permite que seja alterada uma configuraÃ§Ã£o do rotativo para um determinado produto."
  [id configuracao-rotativo-persist ]
  (call-api "/api/configuracoes-rotativos/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    configuracao-rotativo-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-using-put4
  "Alterar os dados de configuraÃ§Ã£o do rotativo de um produto
  Este mÃ©todo permite que seja alterada uma configuraÃ§Ã£o do rotativo para um determinado produto."
  [id configuracao-rotativo-persist ]
  (:data (alterar-using-put4-with-http-info id configuracao-rotativo-persist)))

(defn cadastrar-using-post1-with-http-info
  "Inserir configuraÃ§Ã£o para registro de cobranÃ§a
  Este mÃ©todo permite que seja cadastrado uma nova configuraÃ§Ã£o, para registro de cobranÃ§a."
  [configuracao-persist ]
  (call-api "/api/configuracoes-registro-cobranca" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    configuracao-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-using-post1
  "Inserir configuraÃ§Ã£o para registro de cobranÃ§a
  Este mÃ©todo permite que seja cadastrado uma nova configuraÃ§Ã£o, para registro de cobranÃ§a."
  [configuracao-persist ]
  (:data (cadastrar-using-post1-with-http-info configuracao-persist)))

(defn configurar-taxa-antecipacao-using-post-with-http-info
  "Configura a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite configurar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id taxa-antecipacao-request ]
  (call-api "/api/produtos/{id}/configurar-taxa-antecipacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxa-antecipacao-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn configurar-taxa-antecipacao-using-post
  "Configura a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite configurar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id taxa-antecipacao-request ]
  (:data (configurar-taxa-antecipacao-using-post-with-http-info id taxa-antecipacao-request)))

(defn consultar-campanha-using-get-with-http-info
  "Consultar campanha
  Este mÃ©todo permite que sejam listados os dados de uma determinada campanha existente na base do emissor. Para isso, Ã© preciso informar o seu respectivo cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/campanhas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-campanha-using-get
  "Consultar campanha
  Este mÃ©todo permite que sejam listados os dados de uma determinada campanha existente na base do emissor. Para isso, Ã© preciso informar o seu respectivo cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-campanha-using-get-with-http-info id)))

(defn consultar-taxa-antecipacao-using-get-with-http-info
  "Consulta a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite consultar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id tipo-transacao ]
  (call-api "/api/produtos/{id}/consultar-taxa-antecipacao" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"tipoTransacao" tipo-transacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-taxa-antecipacao-using-get
  "Consulta a Taxa de AntecipaÃ§Ã£o de um Produto
  Este recurso permite consultar a Taxa de AntecipaÃ§Ã£o de um Produto, a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id tipo-transacao ]
  (:data (consultar-taxa-antecipacao-using-get-with-http-info id tipo-transacao)))

(defn consultar-using-get10-with-http-info
  "Apresenta dados de configuraÃ§Ã£o do rotativo especÃ­fico.
  Este recurso permite consultar dados de configuraÃ§Ã£o do parcelamento rotativo a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/configuracoes-rotativos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get10
  "Apresenta dados de configuraÃ§Ã£o do rotativo especÃ­fico.
  Este recurso permite consultar dados de configuraÃ§Ã£o do parcelamento rotativo a partir de seu codigo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn consultar-using-get25-with-http-info
  "Apresenta os dados de um determinado Produto
  Este mÃ©todo permite consultar um determinado Produto a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/produtos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get25
  "Apresenta os dados de um determinado Produto
  Este mÃ©todo permite consultar um determinado Produto a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get25-with-http-info id)))

(defn consultar-using-get3-with-http-info
  "Apresenta os dados de um determinado Atendimento
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Atendimento a partir do seu cÃ³digo de identificaÃ§Ã£o (idAtendimento)."
  [id ]
  (call-api "/api/atendimento-clientes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get3
  "Apresenta os dados de um determinado Atendimento
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Atendimento a partir do seu cÃ³digo de identificaÃ§Ã£o (idAtendimento)."
  [id ]
  (:data (consultar-using-get3-with-http-info id)))

(defn consultar-using-get32-with-http-info
  "Lista os tipos de ajustes do emissor
  Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor."
  ([] (consultar-using-get32-with-http-info nil))
  ([{:keys [sort page limit id descricao ]}]
   (call-api "/api/tipos-ajustes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get32
  "Lista os tipos de ajustes do emissor
  Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor."
  ([] (consultar-using-get32 nil))
  ([optional-params]
   (:data (consultar-using-get32-with-http-info optional-params))))

(defn consultar-using-get33-with-http-info
  "Lista os tipos de boletos do emissor
  Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor."
  ([] (consultar-using-get33-with-http-info nil))
  ([{:keys [sort page limit id descricao banco ]}]
   (call-api "/api/tipos-boletos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao "banco" banco }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get33
  "Lista os tipos de boletos do emissor
  Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor."
  ([] (consultar-using-get33 nil))
  ([optional-params]
   (:data (consultar-using-get33-with-http-info optional-params))))

(defn consultar-using-get34-with-http-info
  "Apresenta os dados de um determinado Tipo de EndereÃ§o
  Este mÃ©todo permite consultar um determinado Tipo de EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/tipos-enderecos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get34
  "Apresenta os dados de um determinado Tipo de EndereÃ§o
  Este mÃ©todo permite consultar um determinado Tipo de EndereÃ§o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get34-with-http-info id)))

(defn consultar-using-get35-with-http-info
  "Apresenta dados de um determinado tipo de operaÃ§Ã£o
  Este recurso permite consultar dados de um determinado tipo operaÃ§Ã£o a partir do idCartao, idEstabelecimento e codigoProcessamento."
  [id-cartao id-estabelecimento codigo-processamento ]
  (call-api "/api/tipos-operacoes" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"idCartao" id-cartao "idEstabelecimento" id-estabelecimento "codigoProcessamento" codigo-processamento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get35
  "Apresenta dados de um determinado tipo de operaÃ§Ã£o
  Este recurso permite consultar dados de um determinado tipo operaÃ§Ã£o a partir do idCartao, idEstabelecimento e codigoProcessamento."
  [id-cartao id-estabelecimento codigo-processamento ]
  (:data (consultar-using-get35-with-http-info id-cartao id-estabelecimento codigo-processamento)))

(defn consultar-using-get37-with-http-info
  "Apresenta os dados de um determinado Tipo de Telefone
  Este mÃ©todo permite consultar um determinado Tipo de Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/tipos-telefones/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get37
  "Apresenta os dados de um determinado Tipo de Telefone
  Este mÃ©todo permite consultar um determinado Tipo de Telefone a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get37-with-http-info id)))

(defn consultar-using-get5-with-http-info
  "Apresenta os dados de um determinado Banco
  Este mÃ©todo permite consultar um determinado Banco a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (call-api "/api/bancos/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get5
  "Apresenta os dados de um determinado Banco
  Este mÃ©todo permite consultar um determinado Banco a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id ]
  (:data (consultar-using-get5-with-http-info id)))

(defn consultar-using-get9-with-http-info
  "Consultar configuraÃ§Ã£o para registro de cobranÃ§a
  Este mÃ©todo permite buscar uma configuraÃ§Ã£o, para registro de cobranÃ§a."
  [id ]
  (call-api "/api/configuracoes-registro-cobranca/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get9
  "Consultar configuraÃ§Ã£o para registro de cobranÃ§a
  Este mÃ©todo permite buscar uma configuraÃ§Ã£o, para registro de cobranÃ§a."
  [id ]
  (:data (consultar-using-get9-with-http-info id)))

(defn listar-campanhas-using-get-with-http-info
  "Listar Campanhas
  Lista as campanhas."
  ([] (listar-campanhas-using-get-with-http-info nil))
  ([{:keys [sort page limit id-tipo-campanha ]}]
   (call-api "/api/campanhas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoCampanha" id-tipo-campanha }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-campanhas-using-get
  "Listar Campanhas
  Lista as campanhas."
  ([] (listar-campanhas-using-get nil))
  ([optional-params]
   (:data (listar-campanhas-using-get-with-http-info optional-params))))

(defn listar-contas-por-pessoa-using-get-with-http-info
  "Lista as contas da pessoa
  Permite listar as contas de um pessoa a partir do seu numero na receita federal."
  ([numero-receita-federal ] (listar-contas-por-pessoa-using-get-with-http-info numero-receita-federal nil))
  ([numero-receita-federal {:keys [sort page limit ]}]
   (call-api "/api/pessoas/listar-contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"numeroReceitaFederal" numero-receita-federal "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-contas-por-pessoa-using-get
  "Lista as contas da pessoa
  Permite listar as contas de um pessoa a partir do seu numero na receita federal."
  ([numero-receita-federal ] (listar-contas-por-pessoa-using-get numero-receita-federal nil))
  ([numero-receita-federal optional-params]
   (:data (listar-contas-por-pessoa-using-get-with-http-info numero-receita-federal optional-params))))

(defn listar-estados-civis-using-get-with-http-info
  "Lista os Estados CÃ­vis
  Este mÃ©todo permite que sejam listados os Estados CÃ­vis na base de dados do Emissor."
  ([] (listar-estados-civis-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/estados-civis" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-estados-civis-using-get
  "Lista os Estados CÃ­vis
  Este mÃ©todo permite que sejam listados os Estados CÃ­vis na base de dados do Emissor."
  ([] (listar-estados-civis-using-get nil))
  ([optional-params]
   (:data (listar-estados-civis-using-get-with-http-info optional-params))))

(defn listar-fantasias-basicas-using-get-with-http-info
  "Listar Fantasias BÃ¡sicas
  Lista as fantasia bÃ¡sicas."
  ([] (listar-fantasias-basicas-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/fantasias-basicas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-fantasias-basicas-using-get
  "Listar Fantasias BÃ¡sicas
  Lista as fantasia bÃ¡sicas."
  ([] (listar-fantasias-basicas-using-get nil))
  ([optional-params]
   (:data (listar-fantasias-basicas-using-get-with-http-info optional-params))))

(defn listar-historico-telefones-using-get-with-http-info
  "Listar alteraÃ§Ãµes de telefones realizadas nos Ãºltimos 60 dias
  Este mÃ©todo permite verificar quais os telefones de um determinado que cliente que sofreram alteraÃ§Ã£o nos Ãºltimos 60 dias."
  [id ]
  (call-api "/api/pessoas/{id}/historico-telefones" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn listar-historico-telefones-using-get
  "Listar alteraÃ§Ãµes de telefones realizadas nos Ãºltimos 60 dias
  Este mÃ©todo permite verificar quais os telefones de um determinado que cliente que sofreram alteraÃ§Ã£o nos Ãºltimos 60 dias."
  [id ]
  (:data (listar-historico-telefones-using-get-with-http-info id)))

(defn listar-nacionalidades-using-get-with-http-info
  "Lista nacionalidades
  Este mÃ©todo permite que sejam listados as nacionalidades na base de dados do Emissor."
  ([] (listar-nacionalidades-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/nacionalidades" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-nacionalidades-using-get
  "Lista nacionalidades
  Este mÃ©todo permite que sejam listados as nacionalidades na base de dados do Emissor."
  ([] (listar-nacionalidades-using-get nil))
  ([optional-params]
   (:data (listar-nacionalidades-using-get-with-http-info optional-params))))

(defn listar-naturezas-ocupacoes-using-get-with-http-info
  "Lista as OcupaÃ§Ãµes
  Este mÃ©todo permite que sejam listados as naturezas de operaÃ§Ãµes na base de dados do Emissor."
  ([] (listar-naturezas-ocupacoes-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/ocupacoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-naturezas-ocupacoes-using-get
  "Lista as OcupaÃ§Ãµes
  Este mÃ©todo permite que sejam listados as naturezas de operaÃ§Ãµes na base de dados do Emissor."
  ([] (listar-naturezas-ocupacoes-using-get nil))
  ([optional-params]
   (:data (listar-naturezas-ocupacoes-using-get-with-http-info optional-params))))

(defn listar-parentescos-using-get-with-http-info
  "Lista os Parentescos
  Este mÃ©todo permite que sejam listados parentescos na base de dados do Emissor."
  ([] (listar-parentescos-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/parentescos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-parentescos-using-get
  "Lista os Parentescos
  Este mÃ©todo permite que sejam listados parentescos na base de dados do Emissor."
  ([] (listar-parentescos-using-get nil))
  ([optional-params]
   (:data (listar-parentescos-using-get-with-http-info optional-params))))

(defn listar-profissoes-using-get-with-http-info
  "Lista profissÃµes
  Este mÃ©todo permite que sejam listados as profissÃµes na base de dados do Emissor."
  ([] (listar-profissoes-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/profissoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-profissoes-using-get
  "Lista profissÃµes
  Este mÃ©todo permite que sejam listados as profissÃµes na base de dados do Emissor."
  ([] (listar-profissoes-using-get nil))
  ([optional-params]
   (:data (listar-profissoes-using-get-with-http-info optional-params))))

(defn listar-tipos-campanhas-using-get-with-http-info
  "Listar Tipos de Campanhas
  Lista os tipos de campanhas."
  ([] (listar-tipos-campanhas-using-get-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/tipos-campanhas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-tipos-campanhas-using-get
  "Listar Tipos de Campanhas
  Lista os tipos de campanhas."
  ([] (listar-tipos-campanhas-using-get nil))
  ([optional-params]
   (:data (listar-tipos-campanhas-using-get-with-http-info optional-params))))

(defn listar-using-get12-with-http-info
  "Listar configuraÃ§Ãµes para registro de cobranÃ§a
  Este mÃ©todo permite listar as configuraÃ§Ãµes de registro de cobranÃ§a."
  ([] (listar-using-get12-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/configuracoes-registro-cobranca" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get12
  "Listar configuraÃ§Ãµes para registro de cobranÃ§a
  Este mÃ©todo permite listar as configuraÃ§Ãµes de registro de cobranÃ§a."
  ([] (listar-using-get12 nil))
  ([optional-params]
   (:data (listar-using-get12-with-http-info optional-params))))

(defn listar-using-get13-with-http-info
  "Listar as configuraÃ§Ãµes rotativo.
  Este recurso permite listar as configuraÃ§Ãµes rotativo."
  ([] (listar-using-get13-with-http-info nil))
  ([{:keys [sort page limit id-produto ]}]
   (call-api "/api/configuracoes-rotativos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idProduto" id-produto }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get13
  "Listar as configuraÃ§Ãµes rotativo.
  Este recurso permite listar as configuraÃ§Ãµes rotativo."
  ([] (listar-using-get13 nil))
  ([optional-params]
   (:data (listar-using-get13-with-http-info optional-params))))

(defn listar-using-get32-with-http-info
  "Lista os Portadores existentes
  Este mÃ©todo permite que sejam listados os portadores cadastrados na base do emissor."
  ([] (listar-using-get32-with-http-info nil))
  ([{:keys [sort page limit id-conta id-produto id-pessoa id-parentesco tipo-portador nome-impresso id-tipo-cartao flag-ativo data-cadastro-portador data-cancelamento-portador ]}]
   (call-api "/api/portadores" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "idProduto" id-produto "idPessoa" id-pessoa "idParentesco" id-parentesco "tipoPortador" tipo-portador "nomeImpresso" nome-impresso "idTipoCartao" id-tipo-cartao "flagAtivo" flag-ativo "dataCadastroPortador" data-cadastro-portador "dataCancelamentoPortador" data-cancelamento-portador }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get32
  "Lista os Portadores existentes
  Este mÃ©todo permite que sejam listados os portadores cadastrados na base do emissor."
  ([] (listar-using-get32 nil))
  ([optional-params]
   (:data (listar-using-get32-with-http-info optional-params))))

(defn listar-using-get33-with-http-info
  "Lista os Produtos do Emissor
  Este mÃ©todo permite que sejam listados os Produtos existentes na base de dados do Emissor."
  ([] (listar-using-get33-with-http-info nil))
  ([{:keys [sort page limit nome status id-fantasia-basica ]}]
   (call-api "/api/produtos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "nome" nome "status" status "idFantasiaBasica" id-fantasia-basica }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get33
  "Lista os Produtos do Emissor
  Este mÃ©todo permite que sejam listados os Produtos existentes na base de dados do Emissor."
  ([] (listar-using-get33 nil))
  ([optional-params]
   (:data (listar-using-get33-with-http-info optional-params))))

(defn listar-using-get34-with-http-info
  "Lista promotores cadastrados na base do emissor
  Este mÃ©todo permite que sejam listados os cadastros de Promoteres existentes na base de dados do Emissor."
  ([] (listar-using-get34-with-http-info nil))
  ([{:keys [sort page limit id nome data-cadastro id-estabelecimento id-usuario ]}]
   (call-api "/api/promotores" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome "dataCadastro" data-cadastro "idEstabelecimento" id-estabelecimento "idUsuario" id-usuario }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get34
  "Lista promotores cadastrados na base do emissor
  Este mÃ©todo permite que sejam listados os cadastros de Promoteres existentes na base de dados do Emissor."
  ([] (listar-using-get34 nil))
  ([optional-params]
   (:data (listar-using-get34-with-http-info optional-params))))

(defn listar-using-get42-with-http-info
  "Lista as opÃµes de Tipos de EndereÃ§os do Emissor
  Este mÃ©todo permite que sejam listados os Tipos de EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get42-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/tipos-enderecos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get42
  "Lista as opÃµes de Tipos de EndereÃ§os do Emissor
  Este mÃ©todo permite que sejam listados os Tipos de EndereÃ§os existentes na base de dados do Emissor."
  ([] (listar-using-get42 nil))
  ([optional-params]
   (:data (listar-using-get42-with-http-info optional-params))))

(defn listar-using-get44-with-http-info
  "Lista os Tipos de Telefones
  Este mÃ©todo permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get44-with-http-info nil))
  ([{:keys [sort page limit id nome ]}]
   (call-api "/api/tipos-telefones" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "nome" nome }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get44
  "Lista os Tipos de Telefones
  Este mÃ©todo permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor."
  ([] (listar-using-get44 nil))
  ([optional-params]
   (:data (listar-using-get44-with-http-info optional-params))))

(defn listar-using-get5-with-http-info
  "Lista todos os atendimentos
  Este mÃ©todo permite que sejam listados todos os Registro de Atendimento, independente do Tipo."
  ([] (listar-using-get5-with-http-info nil))
  ([{:keys [sort page limit id-tipo-atendimento id-conta nome-atendente data-atendimento ]}]
   (call-api "/api/atendimento-clientes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTipoAtendimento" id-tipo-atendimento "idConta" id-conta "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get5
  "Lista todos os atendimentos
  Este mÃ©todo permite que sejam listados todos os Registro de Atendimento, independente do Tipo."
  ([] (listar-using-get5 nil))
  ([optional-params]
   (:data (listar-using-get5-with-http-info optional-params))))

(defn listar-using-get50-with-http-info
  "Listar Vencimentos
  Este recurso permite que sejam listados os Vencimentos do emissor."
  ([] (listar-using-get50-with-http-info nil))
  ([{:keys [sort page limit data-vencimento ]}]
   (call-api "/api/vencimentos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimento" data-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get50
  "Listar Vencimentos
  Este recurso permite que sejam listados os Vencimentos do emissor."
  ([] (listar-using-get50 nil))
  ([optional-params]
   (:data (listar-using-get50-with-http-info optional-params))))

(defn listar-using-get7-with-http-info
  "Lista os Bancos cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Bancos existentes na base de dados do Emissor."
  ([] (listar-using-get7-with-http-info nil))
  ([{:keys [sort page limit ]}]
   (call-api "/api/bancos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get7
  "Lista os Bancos cadastrados para o Emissor
  Este mÃ©todo permite que sejam listados os Bancos existentes na base de dados do Emissor."
  ([] (listar-using-get7 nil))
  ([optional-params]
   (:data (listar-using-get7-with-http-info optional-params))))

(defn salvar-using-post2-with-http-info
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
  ([] (salvar-using-post2-with-http-info nil))
  ([{:keys [id-conta conteudo-atendimento detalhes-atendimento nome-atendente data-atendimento data-agendamento data-hora-inicio-atendimento data-hora-fim-atendimento flag-fila-fraude ]}]
   (call-api "/api/atendimento-clientes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "conteudoAtendimento" conteudo-atendimento "detalhesAtendimento" detalhes-atendimento "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento "dataAgendamento" data-agendamento "dataHoraInicioAtendimento" data-hora-inicio-atendimento "dataHoraFimAtendimento" data-hora-fim-atendimento "flagFilaFraude" flag-fila-fraude }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn salvar-using-post2
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
  ([] (salvar-using-post2 nil))
  ([optional-params]
   (:data (salvar-using-post2-with-http-info optional-params))))

(defn salvar-using-post5-with-http-info
  "Inserir campanha
  Este mÃ©todo permite que seja cadastrado uma nova campanha."
  [campanha-persist ]
  (call-api "/api/campanhas" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    campanha-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post5
  "Inserir campanha
  Este mÃ©todo permite que seja cadastrado uma nova campanha."
  [campanha-persist ]
  (:data (salvar-using-post5-with-http-info campanha-persist)))

(defn salvar-using-post7-with-http-info
  "Inserir os dados de configuraÃ§Ã£o do rotativo de um produto
  Este mÃ©todo permite que seja cadastrado uma nova configuraÃ§Ã£o do rotativo para um determinado produto."
  [configuracao-rotativo-persist ]
  (call-api "/api/configuracoes-rotativos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    configuracao-rotativo-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post7
  "Inserir os dados de configuraÃ§Ã£o do rotativo de um produto
  Este mÃ©todo permite que seja cadastrado uma nova configuraÃ§Ã£o do rotativo para um determinado produto."
  [configuracao-rotativo-persist ]
  (:data (salvar-using-post7-with-http-info configuracao-rotativo-persist)))
