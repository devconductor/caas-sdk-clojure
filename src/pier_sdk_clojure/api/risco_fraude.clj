(ns pier-sdk-clojure.api.risco-fraude
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-using-get-with-http-info
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
             :auth-names    ["access_token"]}))

(defn consultar-using-get
  "Apresenta os dados de um determinado Atendimento
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Atendimento a partir do seu cÃ³digo de identificaÃ§Ã£o (idAtendimento)."
  [id ]
  (:data (consultar-using-get-with-http-info id)))

(defn consultar-using-get10-with-http-info
  "Consultar uma transaÃ§Ã£o classificada com risco de fraude
  Consulta os detalhes de uma transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (call-api "/api/riscos-fraudes/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-using-get10
  "Consultar uma transaÃ§Ã£o classificada com risco de fraude
  Consulta os detalhes de uma transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn informar-risco-fraude-using-post-with-http-info
  "Receber Risco Fraude
  Receber risco fraude"
  [detalhado-responses ]
  (call-api "/api/riscos-fraudes" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    detalhado-responses
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn informar-risco-fraude-using-post
  "Receber Risco Fraude
  Receber risco fraude"
  [detalhado-responses ]
  (:data (informar-risco-fraude-using-post-with-http-info detalhado-responses)))

(defn listar-using-get-with-http-info
  "Lista todos os atendimentos
  Este mÃ©todo permite que sejam listados todos os Registro de Atendimento, independente do Tipo."
  ([] (listar-using-get-with-http-info nil))
  ([{:keys [page limit id-tipo-atendimento id-conta nome-atendente data-atendimento ]}]
   (call-api "/api/atendimento-clientes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idTipoAtendimento" id-tipo-atendimento "idConta" id-conta "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get
  "Lista todos os atendimentos
  Este mÃ©todo permite que sejam listados todos os Registro de Atendimento, independente do Tipo."
  ([] (listar-using-get nil))
  ([optional-params]
   (:data (listar-using-get-with-http-info optional-params))))

(defn listar-using-get11-with-http-info
  "Listar as transaÃ§Ãµes com resoluÃ§Ã£o de risco fraude pendente
  Este recurso permite que sejam listados os riscos de fraudes existentes"
  ([id-conta confirmacao-fraude ] (listar-using-get11-with-http-info id-conta confirmacao-fraude nil))
  ([id-conta confirmacao-fraude {:keys [page limit ]}]
   (call-api "/api/riscos-fraudes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id_conta" id-conta "confirmacao_fraude" confirmacao-fraude "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-using-get11
  "Listar as transaÃ§Ãµes com resoluÃ§Ã£o de risco fraude pendente
  Este recurso permite que sejam listados os riscos de fraudes existentes"
  ([id-conta confirmacao-fraude ] (listar-using-get11 id-conta confirmacao-fraude nil))
  ([id-conta confirmacao-fraude optional-params]
   (:data (listar-using-get11-with-http-info id-conta confirmacao-fraude optional-params))))

(defn negar-using-get-with-http-info
  "Negar autenticidade da transaÃ§Ã£o com risco de fraude
  Nega a realizaÃ§Ã£o da transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (call-api "/api/riscos-fraudes/{id}/negar" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn negar-using-get
  "Negar autenticidade da transaÃ§Ã£o com risco de fraude
  Nega a realizaÃ§Ã£o da transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (:data (negar-using-get-with-http-info id)))

(defn reconhecer-using-get-with-http-info
  "Reconhecer a transaÃ§Ã£o com risco de fraude
  Confirma a autenticidade da transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (call-api "/api/riscos-fraudes/{id}/reconhecer" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn reconhecer-using-get
  "Reconhecer a transaÃ§Ã£o com risco de fraude
  Confirma a autenticidade da transaÃ§Ã£o classificada com risco de fraude."
  [id ]
  (:data (reconhecer-using-get-with-http-info id)))

(defn salvar-using-post-with-http-info
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
  ([] (salvar-using-post-with-http-info nil))
  ([{:keys [id-conta conteudo-atendimento detalhes-atendimento nome-atendente data-atendimento data-agendamento data-hora-inicio-atendimento data-hora-fim-atendimento flag-fila-fraude ]}]
   (call-api "/api/atendimento-clientes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "conteudoAtendimento" conteudo-atendimento "detalhesAtendimento" detalhes-atendimento "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento "dataAgendamento" data-agendamento "dataHoraInicioAtendimento" data-hora-inicio-atendimento "dataHoraFimAtendimento" data-hora-fim-atendimento "flagFilaFraude" flag-fila-fraude }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn salvar-using-post
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
  ([] (salvar-using-post nil))
  ([optional-params]
   (:data (salvar-using-post-with-http-info optional-params))))
