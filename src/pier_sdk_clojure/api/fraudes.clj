(ns pier-sdk-clojure.api.fraudes
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

(defn listar-using-get-with-http-info
  "Lista todos os atendimentos
  Este mÃ©todo permite que sejam listados todos os Registro de Atendimento, independente do Tipo."
  ([] (listar-using-get-with-http-info nil))
  ([{:keys [page limit id-atendimento id-tipo-atendimento id-conta nome-atendente data-atendimento ]}]
   (call-api "/api/atendimento-clientes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idAtendimento" id-atendimento "idTipoAtendimento" id-tipo-atendimento "idConta" id-conta "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento }
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

(defn salvar-using-post-with-http-info
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
  ([] (salvar-using-post-with-http-info nil))
  ([{:keys [id-conta conteudo-atendimento detalhes-atendimento nome-atendente data-atendimento data-agendamento data-hora-inicio-atendimento data-hora-fim-atendimento ]}]
   (call-api "/api/atendimento-clientes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "conteudoAtendimento" conteudo-atendimento "detalhesAtendimento" detalhes-atendimento "nomeAtendente" nome-atendente "dataAtendimento" data-atendimento "dataAgendamento" data-agendamento "dataHoraInicioAtendimento" data-hora-inicio-atendimento "dataHoraFimAtendimento" data-hora-fim-atendimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn salvar-using-post
  "Cadastro um novo Atendimento do tipo GenÃ©rico para uma Conta"
  ([] (salvar-using-post nil))
  ([optional-params]
   (:data (salvar-using-post-with-http-info optional-params))))
